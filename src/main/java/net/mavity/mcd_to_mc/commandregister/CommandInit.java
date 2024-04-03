package net.mavity.mcd_to_mc.commandregister;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.text.Text;

import static net.minecraft.server.command.CommandManager.*;

public class CommandInit {
    public static void wiiuCommand() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("wiiu")
                .executes(context -> {
                    // For versions below 1.19, replace "Text.literal" with "new LiteralText".
                    // For versions below 1.20, remode "() ->" directly.
                    context.getSource().sendFeedback(() -> Text.literal("WiiU"), false);
                    return 1;
                })));
    }
}
