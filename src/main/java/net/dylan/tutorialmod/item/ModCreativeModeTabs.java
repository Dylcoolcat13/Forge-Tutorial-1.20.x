package net.dylan.tutorialmod.item;

import net.dylan.tutorialmod.TutorialMod;
import net.dylan.tutorialmod.block.modBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(modItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput)->{
                      pOutput.accept(modItems.SAPPHIRE.get());
                      pOutput.accept(modItems.RAW_SAPPHIRE.get());

                      pOutput.accept(modBlocks.SAPPHIRE_BLOCK.get());

                      pOutput.accept(modBlocks.RAW_SAPPHIRE_BLOCK.get());
                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
