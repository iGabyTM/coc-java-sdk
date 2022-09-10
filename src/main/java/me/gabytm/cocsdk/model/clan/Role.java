package me.gabytm.cocsdk.model.clan;

public enum Role {

    LEADER("leader"),
    CO_LEADER("coleader"),
    ELDER("admin"),
    MEMBER("member"),

    NOT_MEMBER("not_member");

    private final String internalName;

    Role(String internalName) {
        this.internalName = internalName;
    }
}
