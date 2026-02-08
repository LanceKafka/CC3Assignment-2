// coded by butards

public class Player {

    private  String username = "LancerTzy_01";

    private Hero activeHero; // this class uses hero, but hero can exist independently :D

    public Player(Hero hero) {

        this.activeHero = hero;

    }

    public String getIdentity() {

        return "Im the player class. I hold the account data and handle the hero selection logic.";

    }

    public String getFullStatus() {

        return "Player: " + username + " is currently playing " + activeHero.getCombatProfile();
    }

}
