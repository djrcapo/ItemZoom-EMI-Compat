package mezz.itemzoom.client.compat;

import net.neoforged.fml.ModList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

public class ModChecker {

    private static Player player;
    private static boolean emiLoaded = false;

    public static void Check() {
        player = Minecraft.getInstance().player;
        emiLoaded = ModList.get().isLoaded("emi");

        //DebugToPlayer("Result Emi Load = " + emiLoaded);
    }

    public static boolean IsEmiLoaded() {
        return emiLoaded;
    }

    public static void DebugToPlayer(String message) {
        player.sendSystemMessage(Component.literal(message));
    }
}
