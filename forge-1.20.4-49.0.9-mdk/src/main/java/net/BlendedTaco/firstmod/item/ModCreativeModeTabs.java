package net.BlendedTaco.firstmod.item;

import net.BlendedTaco.firstmod.FirstMod;
import net.BlendedTaco.firstmod.block.Modblocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_MODE_TABS.register("mod_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.SILICON.get()))
            .title(Component.translatable("creativetab.mod_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(Moditems.SILICON.get());
                pOutput.accept(Moditems.SILICON_INGOT.get());
                pOutput.accept(Modblocks.SILICON_BLOCk.get());
            })
            .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
