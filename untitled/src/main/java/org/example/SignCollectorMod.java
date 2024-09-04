import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class SignCollectorMod implements ModInitializer {
    @Override
    public void onInitialize() {
        // Register server starting event
        MinecraftServer.getServer().execute(() -> {
            // Collect signs and save to JSON when the server starts
            try {
                collectAndSaveSigns();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private void collectAndSaveSigns() throws IOException {
        MinecraftServer server = MinecraftServer.getServer();
        if (server == null) {
            throw new IllegalStateException("Server is not initialized");
        }

        Map<String, int[]> signData = new HashMap<>();
        server.getWorlds().forEach(world -> {
            for (SignBlockEntity sign : world.getBlockEntitiesByType(SignBlockEntity.TYPE)) {
                BlockPos pos = sign.getPos();
                String text = String.join("\n", sign.getTextOnRow(0).asString(), sign.getTextOnRow(1).asString(), sign.getTextOnRow(2).asString(), sign.getTextOnRow(3).asString());
                signData.put(text, new int[]{pos.getX(), pos.getY(), pos.getZ()});
            }
        });

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(Paths.get("signs.json").toFile())) {
            gson.toJson(signData, writer);
        }
    }
}
