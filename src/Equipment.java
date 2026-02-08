//coded by geslani
public class Equipment{
    private String itemName = "Blade of Despair";
    
    public String getIdentity() {
        return "I am the Equipment Class. I provide massive stat boosts and unique equipment effects to Heroes.";
    } 

    public String getItemEffect() {
        return "Item: " + itemName + " (Effect: +160 Physical Attack)";
    }
}