package me.gabytm.cocsdk.model.player;

import me.gabytm.cocsdk.model.clan.Role;
import me.gabytm.cocsdk.model.common.Tagged;
import me.gabytm.cocsdk.model.league.League;
import me.gabytm.cocsdk.model.player.item.Hero;
import me.gabytm.cocsdk.model.player.item.Spell;
import me.gabytm.cocsdk.model.player.item.Troop;

import java.util.List;

public class Player implements Tagged {

    private String tag;
    private String name;
    private int townHallLevel;
    private Integer townHallWeaponLevel;
    private int expLevel;
    private int trophies;
    private int bestTrophies;
    private int warStars;
    private int attackWins;
    private int defenseWins;
    private int builderHallLevel;
    private int versusTrophies;
    private int versusBattleWins;
    private Role role;
    private String warPreference;
    private int donations;
    private int donationsReceived;
    private int clanCapitalContributions;
    private PlayerClan clan;
    private League league;
    // TODO: 9/10/2022 add achievements
    // TODO: 9/10/2022 add labels 
    private List<Troop> troops;
    private List<Spell> spells;
    private List<Hero> heroes;

    @Override
    public String getTag() {
        return tag;
    }

    public String getName() {
        return name;
    }

    public int getTownHallLevel() {
        return townHallLevel;
    }

    public Integer getTownHallWeaponLevel() {
        return townHallWeaponLevel;
    }

    public int getExpLevel() {
        return expLevel;
    }

    public int getTrophies() {
        return trophies;
    }

    public int getBestTrophies() {
        return bestTrophies;
    }

    public int getWarStars() {
        return warStars;
    }

    public int getAttackWins() {
        return attackWins;
    }

    public int getDefenseWins() {
        return defenseWins;
    }

    public int getBuilderHallLevel() {
        return builderHallLevel;
    }

    public int getVersusTrophies() {
        return versusTrophies;
    }

    public int getVersusBattleWins() {
        return versusBattleWins;
    }

    public Role getRole() {
        return role;
    }

    public String getWarPreference() {
        return warPreference;
    }

    public int getDonations() {
        return donations;
    }

    public int getDonationsReceived() {
        return donationsReceived;
    }

    public int getClanCapitalContributions() {
        return clanCapitalContributions;
    }

    public PlayerClan getClan() {
        return clan;
    }

    public League getLeague() {
        return league;
    }

    public List<Troop> getTroops() {
        return troops;
    }

    public List<Spell> getSpells() {
        return spells;
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

    @Override
    public String toString() {
        return "Player{" +
                "\nclan=" + clan +
                ", \nleague=" + league +
                ", \ntroops=" + troops +
                ", \nspells=" + spells +
                ", \nheroes=" + heroes +
                '}';
    }

}
