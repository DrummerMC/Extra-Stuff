package DrummerMC.Extra_Stuff.Parts;

import net.minecraft.item.ItemStack;
import DrummerMC.Extra_Stuff.Extra_Stuff;
import appeng.api.parts.PartItemStack;

public class PartBCStorage extends PartBase {
	
	@Override
	public ItemStack getItemStack(PartItemStack type) {
		return new ItemStack(Extra_Stuff.partItem, 1, 1);
	}

}