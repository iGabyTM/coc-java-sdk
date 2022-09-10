import com.google.gson.GsonBuilder;
import me.gabytm.cocsdk.model.player.Player;
import me.gabytm.cocsdk.model.player.item.Hero;
import me.gabytm.cocsdk.model.player.item.type.HeroType;
import me.gabytm.cocsdk.model.player.item.type.SpellType;
import me.gabytm.cocsdk.model.player.item.type.TroopType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeserializeTest {

    public static void main(String[] args) throws IOException {
        var gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(HeroType.class, new HeroType.Deserializer())
                .registerTypeAdapter(SpellType.class, new SpellType.Deserializer())
                .registerTypeAdapter(TroopType.class, new TroopType.Deserializer())
                .create();

        var player = gson.fromJson(Files.newBufferedReader(Path.of("faze.json")), Player.class);
        System.out.println("player = " + player);
        var king = gson.fromJson(Files.newBufferedReader(Path.of("barbarian.json")), Hero.class);
        System.out.println(king);
    }

}
