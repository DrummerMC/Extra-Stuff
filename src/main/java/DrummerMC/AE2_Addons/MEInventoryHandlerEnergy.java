package DrummerMC.AE2_Addons;

import net.minecraft.item.ItemStack;
import DrummerMC.AE2_Addons.Api.IEnergyHandler;
import appeng.api.config.AccessRestriction;
import appeng.api.config.Actionable;
import appeng.api.networking.security.BaseActionSource;
import appeng.api.storage.IMEInventoryHandler;
import appeng.api.storage.StorageChannel;
import appeng.api.storage.data.IAEStack;
import appeng.api.storage.data.IItemList;

public class MEInventoryHandlerEnergy implements IMEInventoryHandler, IEnergyHandler{
	
	public final ItemStack stack;
	
	public MEInventoryHandlerEnergy(ItemStack stack) {
		this.stack = stack;
	}

	@Override
	public IAEStack injectItems(IAEStack input, Actionable type,
			BaseActionSource src) {

		return input;
	}

	@Override
	public IAEStack extractItems(IAEStack request, Actionable mode,
			BaseActionSource src) {
		return null;
	}

	@Override
	public IItemList getAvailableItems(IItemList out) {
		return out;
	}

	@Override
	public StorageChannel getChannel() {
		return StorageChannel.ITEMS;
	}

	@Override
	public AccessRestriction getAccess() {
		return AccessRestriction.READ_WRITE;
	}

	@Override
	public boolean isPrioritized(IAEStack input) {
		return false;
	}

	@Override
	public boolean canAccept(IAEStack input) {
		return false;
	}

	@Override
	public int getPriority() {
		return 0;
	}

	@Override
	public int getSlot() {
		return 0;
	}

	@Override
	public ItemStack getCell() {
		return this.stack;
	}

}
