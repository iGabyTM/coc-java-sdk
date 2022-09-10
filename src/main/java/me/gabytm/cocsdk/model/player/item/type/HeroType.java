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

public enum HeroType implements Localized, VillageSpecific {

    BARBARIAN_KING("Barbarian King", Village.HOME_VILLAGE),
    ARCHER_QUEEN("Archer Queen", Village.HOME_VILLAGE),
    GRAND_WARDEN("Grand Warden", Village.HOME_VILLAGE),
    ROYAL_CHAMPION("Royal Champion", Village.HOME_VILLAGE),

    BATTLE_MACHINE("Battle Machine", Village.HOME_VILLAGE);

    public static final EnumSet<HeroType> VALUES = EnumSet.allOf(HeroType.class);

    private final String localizedName;
    private final Village village;

    HeroType(String localizedName, Village village) {
        this.localizedName = localizedName;
        this.village = village;
    }

    @Override
    public String getLocalizedName() {
        return localizedName;
    }

    @Override
    public Village getVillage() {
        return village;
    }

    public static class Deserializer implements JsonDeserializer<HeroType> {

        @Override
        public HeroType deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            final var string = json.getAsString();
            return VALUES.stream()
                    .filter(it -> it.name().equals(string) || it.getLocalizedName().equals(string))
                    .findFirst()
                    .orElse(null);
        }

    }

}
