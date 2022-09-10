package me.gabytm.cocsdk.model.league;

import me.gabytm.cocsdk.model.common.model.IconUrls;

public class League {

    private int id;
    private String name;
    private IconUrls iconUrls;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public IconUrls getIconUrls() {
        return iconUrls;
    }

    @Override
    public String toString() {
        return "League{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", iconUrls=" + iconUrls +
                '}';
    }

}
