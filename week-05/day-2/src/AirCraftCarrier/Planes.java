package AirCraftCarrier;

public class Planes {
    private String type;
    private int ammoStore;
    private int maxAmmo;
    private int baseDamage;
    private int damage;
    private boolean priority;

    public Planes(String type, int maxAmmo, int baseDamage, boolean prio) {
        this.type = type;
        this.ammoStore = 0;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.priority = prio;
    }

    public int maxDMG() {
        damage = ammoStore*baseDamage;
        return damage;
    }

    public void setAmmoStore(int ammoStore) {
        this.ammoStore = ammoStore;
    }

    public int ammoNeeded(){    // a counter methodoz kell a Carrierbe, hogy megkapjam mennyi ammo kell összesen az összes repülőt véve.
        int ammoNeed =0;
        return ammoNeed = maxAmmo - ammoStore;
    }

    public int fight() {
        damage = ammoStore*baseDamage;
        setAmmoStore(0);
        return damage;
    }

    public int refill (int amountAmmo) {
        int remaining =0;
        int ammoNeed = maxAmmo - ammoStore;
            ammoStore += ammoNeed;
            remaining = amountAmmo - ammoNeed;
        return remaining;
    }

    public String getType() {
        return type;
    }

    public String getStatus () {
        return "Type: " + type + " Ammo: " + ammoStore + " Base dmg: " + baseDamage + " All dmg: " + maxDMG();
    }

    public boolean isPriority() {
        return priority;
    }
}
