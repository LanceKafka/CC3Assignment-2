//Geslani's part
public class MobileLegendsSystem {
    public static void main(String[] args){
        // Instantiate 
        Hero selectedHero = new Hero();
        Player user = new Player(selectedHero);
    
        //Print Statement
    System.out.println(
        "--- IDENTITY LOGS ---\n" +
            user.getIdentity() + "\n" +
            selectedHero.getIdentity() + "\n" +
            new Equipment().getIdentity() + "\n" +
            "--- MATCH STATUS ---\n" +
            user.getFullstatus()
        );
    }
}