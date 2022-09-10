package me.gabytm.cocsdk.model.player;

import com.google.gson.annotations.SerializedName;
import me.gabytm.cocsdk.model.common.Tagged;
import me.gabytm.cocsdk.model.common.model.IconUrls;

public class PlayerClan implements Tagged {

    private String tag;
    private String name;
    @SerializedName("clanLevel")
    private int level;
    private IconUrls badgeUrls;

    @Override
    public String getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return "PlayerClan{" +
                "tag='" + tag + '\'' +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", badgeUrls=" + badgeUrls +
                '}';
    }

}
