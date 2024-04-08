package net.mavity.mcd_to_mc.commandregister;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.text.Text;

import static net.minecraft.server.command.CommandManager.*;

public class CommandInit {
    public static void wiiuCommand() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("wiiu")
                .executes(context -> {
                    context.getSource().sendFeedback(() -> Text.literal("WiiU"), false);
                    return 1;
                })));
    }
    public static void sourcesCommand() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("mcdtomcsources")
                .executes(context -> {
                    context.getSource().sendFeedback(() -> Text.literal("https://github.com/AngerVon2468/MCD-to-MC"), false);
                    return 1;
                })));
    }
}
