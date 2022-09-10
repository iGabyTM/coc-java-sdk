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

public enum TroopType implements Localized, VillageSpecific {

    BARBARIAN("Barbarian", Village.HOME_VILLAGE),
    ARCHER("Archer", Village.HOME_VILLAGE),
    GOBLIN("Goblin", Village.HOME_VILLAGE),
    GIANT("Giant", Village.HOME_VILLAGE),
    WALL_BREAKER("Giant", Village.HOME_VILLAGE),
    BALLOON("Balloon", Village.HOME_VILLAGE);

    public static final EnumSet<TroopType> VALUES = EnumSet.allOf(TroopType.class);

    private final String localizedName;
    private final Village village;

    TroopType(String localizedName, Village village) {
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

    public static class Deserializer implements JsonDeserializer<TroopType> {

        @Override
        public TroopType deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            final var string = json.getAsString();
            return VALUES.stream()
                    .filter(it -> it.name().equals(string) || it.getLocalizedName().equals(string))
                    .findFirst()
                    .orElse(null);
        }

    }

}
