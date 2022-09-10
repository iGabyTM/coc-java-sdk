package me.gabytm.cocsdk.model.player.item;

import com.google.gson.annotations.SerializedName;
import me.gabytm.cocsdk.model.common.Localized;
import me.gabytm.cocsdk.model.common.VillageSpecific;
import me.gabytm.cocsdk.model.common.model.Village;

public abstract class Item<T extends Enum<T> & Localized & VillageSpecific> {

    @SerializedName("name")
    protected T type;
    protected int level;
    protected int maxLevel;

    public T getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public Village getVillage() {
        return getType().getVillage();
    }

    @Override
    public String toString() {
        return "Item{" +
                "type=" + ((type == null) ? null : type.getLocalizedName()) +
                ", level=" + level +
                ", maxLevel=" + maxLevel +
                '}';
    }

}
