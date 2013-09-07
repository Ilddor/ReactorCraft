/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ReactorCraft.TileEntities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidStack;
import Reika.DragonAPI.Libraries.MathSci.ReikaMathLibrary;
import Reika.DragonAPI.Libraries.MathSci.ReikaNuclearHelper;
import Reika.DragonAPI.Libraries.MathSci.ReikaThermoHelper;
import Reika.ReactorCraft.ReactorCraft;
import Reika.ReactorCraft.Auxiliary.ReactorCoreTE;
import Reika.ReactorCraft.Base.TileEntityReactorBase;
import Reika.ReactorCraft.Entities.EntityNeutron;
import Reika.ReactorCraft.Registry.ReactorTiles;

public class TileEntityWaterCell extends TileEntityReactorBase implements ReactorCoreTE {

	private LiquidStack internalLiquid;

	@Override
	public void updateEntity(World world, int x, int y, int z, int meta) {
		thermalTicker.update();
		int id = world.getBlockId(x, y-1, z);
		int metadata = world.getBlockMetadata(x, y-1, z);
		if (id == this.getTileEntityBlockID() && metadata == this.getIndex()) {
			TileEntityWaterCell te = (TileEntityWaterCell)world.getBlockTileEntity(x, y-1, z);
			if (te.getLiquidState() == 0 && this.getLiquidState() != 0) {
				te.setLiquidState(this.getLiquidState());
				this.setLiquidState(0);
			}
		}
		//ReikaJavaLibrary.pConsoleIf(temperature, x == 377 && z == 309);
		if (thermalTicker.checkCap()) {
			this.accrueHeat(world, x, y, z);
			this.disposeHeat(world, x, y, z);
		}
	}

	private void disposeHeat(World world, int x, int y, int z) {
		int id = world.getBlockId(x, y+1, z);
		int meta = world.getBlockMetadata(x, y+1, z);
		TileEntity te = world.getBlockTileEntity(x, y+1, z);
		if (id == this.getTileEntityBlockID() && meta == this.getIndex()) {
			TileEntityWaterCell wc = (TileEntityWaterCell)te;
			double T = wc.getTemperature();
			if (T > this.getTemperature()) {
				double dT = T - this.getTemperature();
				wc.setTemperature(T+dT/2);
				this.setTemperature(this.getTemperature()-dT/2);
			}
		}
	}

	@Override
	public void animateWithTick(World world, int x, int y, int z) {

	}

	@Override
	public int getIndex() {
		return ReactorTiles.COOLANT.ordinal();
	}

	@Override
	public boolean onNeutron(EntityNeutron e, World world, int x, int y, int z) {
		if (ReikaMathLibrary.doWithChance(this.getChanceToStop())) {
			temperature += ReikaThermoHelper.getTemperatureIncrease(ReikaThermoHelper.WATER_HEAT, 1000, ReikaNuclearHelper.getUraniumFissionNeutronE());
			return true;
		}
		return false;
	}

	@Override
	public double getTemperature() {
		return temperature;
	}

	@Override
	public void setTemperature(double T) {
		temperature = T;
	}

	public int getChanceToStop() {
		if (internalLiquid == null)
			return 0;
		if (internalLiquid.isLiquidEqual(ReactorCraft.D2O)) {
			return 75;
		}
		if (internalLiquid.isLiquidEqual(LiquidDictionary.getCanonicalLiquid("Water"))) {
			return 50;
		}
		return 0;
	}

	enum LiquidStates {
		EMPTY(null),
		WATER(LiquidDictionary.getCanonicalLiquid("Water")),
		HEAVY(ReactorCraft.D2O);

		private LiquidStack liquid;

		public static final LiquidStates[] list = values();

		private LiquidStates(LiquidStack liq) {
			liquid = liq;
		}

		public static LiquidStates getState(LiquidStack l) {
			if (l == null)
				return EMPTY;
			for (int i = 0; i < list.length; i++) {
				LiquidStack liq = list[i].liquid;
				if (liq != null && l.isLiquidEqual(liq)) {
					return list[i];
				}
			}

			return null;
		}

		public LiquidStack getLiquid() {
			return liquid;
		}
	}

	@Override
	public int getTextureState() {
		return this.getLiquidState();
	}

	public int getLiquidState() {
		return LiquidStates.getState(internalLiquid).ordinal();
	}

	public void setLiquidState(int liq) {
		internalLiquid = LiquidStates.list[liq].getLiquid();
	}

	@Override
	public void writeToNBT(NBTTagCompound NBT)
	{
		super.writeToNBT(NBT);

		NBT.setInteger("liq", this.getLiquidState());

	}

	/**
	 * Reads a tile entity from NBT.
	 */
	@Override
	public void readFromNBT(NBTTagCompound NBT)
	{
		super.readFromNBT(NBT);

		this.setLiquidState(NBT.getInteger("liq"));
	}

	public void accrueHeat(World world, int x, int y, int z) {
		for (int i = 2; i < 6; i++) {
			ForgeDirection dir = ForgeDirection.values()[i];
			int id = world.getBlockId(x+dir.offsetX, y, z+dir.offsetZ);
			int meta = world.getBlockMetadata(x+dir.offsetX, y, z+dir.offsetZ);
			if (id == this.getTileEntityBlockID() && meta != this.getIndex()) {
				TileEntity te = world.getBlockTileEntity(x+dir.offsetX, y, z+dir.offsetZ);
				if (te instanceof ReactorCoreTE) {
					ReactorCoreTE rc = (ReactorCoreTE)te;
					double T = rc.getTemperature();
					if (T > temperature) {
						double dT = T-temperature;
						temperature += dT/4D;
						rc.setTemperature(T-dT/4D);
					}
				}
			}
		}
	}

	@Override
	public int getMaxTemperature() {
		return 0;
	}

	private void onMeltdown(World world, int x, int y, int z) {

	}
}