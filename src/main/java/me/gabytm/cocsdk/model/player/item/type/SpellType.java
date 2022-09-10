package me.gabytm.cocsdk.model.player.item.type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import me.gabytm.cocsdk.model.common.Localized;
import me.gabytm.cocsdk.model.common.VillageSpecific;
import me.gabytm.cocsdk.model.common.model.Village;

import java.lang.reflect.Type;
import java.util.EnumSet;

public enum SpellType implements Localized, VillageSpecific {

    // Elixir
    LIGHTNING("Lightning"),
    HEALING("Healing"),
    RAGE("Rage"),
    JUMP("Jump"),
    FREEZE("Freeze"),
    CLONE("Clone"),
    INVISIBILITY("Invisibility"),

    // Dark Elixir
    POISON("Poison"),
    EARTHQUAKE("Earthquake"),
    HASTE("Haste"),
    SKELETON("Skeleton"),
    BAT("Bat");

    public static final EnumSet<SpellType> VALUES = EnumSet.allOf(SpellType.class);

    private final String localizedName;

    SpellType(String localizedName) {
        this.localizedName = localizedName + " Spell";
    }

    @Override
    public String getLocalizedName() {
        return localizedName;
    }

    @Override
    public Village getVillage() {
        return Village.HOME_VILLAGE;
    }

    public static class Deserializer implements JsonDeserializer<SpellType> {

        @Override
        public SpellType deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            final var string = json.getAsString();
            return VALUES.stream()
                    .filter(it -> it.name().equals(string) || it.getLocalizedName().equals(string))
                    .findFirst()
                    .orElse(null);
        }

    }

}
