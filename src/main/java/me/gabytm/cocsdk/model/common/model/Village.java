package me.gabytm.cocsdk.model.common.model;

import me.gabytm.cocsdk.model.common.Localized;

public enum Village implements Localized {

    BUILDER_BASE("builderBase"),
    HOME_VILLAGE("home");

    private final String localizedName;

    Village(String localizedName) {
        this.localizedName = localizedName;
    }

    @Override
    public String getLocalizedName() {
        return localizedName;
    }

}
