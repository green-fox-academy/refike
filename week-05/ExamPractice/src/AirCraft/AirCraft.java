package AirCraft;

public class AirCraft {
    String type;
    int ammoStore;
    int maxAmmmo;
    int baseDMG;
    int damage;
    boolean isPriority;

    public AirCraft(String type, int maxAmmmo, int baseDMG, boolean isPrio) {
        this.type = type;
        this.ammoStore = 0;
        this.maxAmmmo = maxAmmmo;
        this.baseDMG = baseDMG;
        this.isPriority = isPrio;
    }

    public int ammoNeeded () {
        int ammoNeed = 0;
        return ammoNeed = maxAmmmo - ammoStore;
    }

    public void setAmmoStore(int num) {
        this.ammoStore = num;
    }

    public int maxDMG() {
        int maxDMG = 0;
        return maxDMG = ammoStore * baseDMG;
    }

    public int fight (){
        int maxDMG = 0;
        maxDMG = ammoStore * baseDMG;
        setAmmoStore(0);
        return maxDMG;

    }

    public int refill (int amount){
       int ammoNeed = maxAmmmo - ammoStore;
       ammoStore += ammoNeed;
       return amount - ammoNeed;
    }

    public String getType() {
        return type;
    }

    public String getStatus (){
        return "Type: " + type + " Ammo: " + ammoStore + " Base dmg: " + baseDMG + " All dmg: " + maxDMG();

    }

    public boolean isPriority() {
        return isPriority;
    }
}
