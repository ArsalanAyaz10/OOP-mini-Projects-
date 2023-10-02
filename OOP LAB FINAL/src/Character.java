public class Character {
    protected String name;
    public int health;
    public int attack;
    public int defense;
    protected int SpecialMove;
    protected int heal;

    public Character(String name, int health, int attack, int defense, int ultimateAttack,int heal) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.SpecialMove = SpecialMove;
        this.heal = heal;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public  void attack(Character player1)
    {
        int DamageDone = attack-defense;
        if (this.health>0)
        this.health-=DamageDone;
    }

    public void raiseDefense() {
        if (defense == 100)
        {
            System.out.println("The defense is already full! Turn Wasted.");
            return;
        }
        System.out.println(name + " defense raised");
        int defenseBoost = 5;
        defense += defenseBoost;
        if (defense > 100) {
            defense = 100;
        }
        System.out.println(name + "'s defense increased by " + defenseBoost + ".");
    }

    public void heal() {
        if (health == 100) {
            System.out.println("Health Full Already! Turn Wasted.");
            return;
        }
        int healing = 20;
        health += healing;
        if (health > 100)
        {
            health = 100;
        }
        System.out.println(name + " is healed for " + healing + " HP.");
    }

    public void ultimateAttack(Character P2) {
        int damage = SpecialMove;
        P2.takeDamage(damage);
        System.out.println(P2.getName() + " takes " + damage + " damage.");
    }
    public void takeDamage(int damage) {
        int DoneDamage = damage - defense;
        if (DoneDamage > 0) {
            health -= DoneDamage;
        }
    }

    public void defense() {
    }

    public void SpecialMove(Character player2) {
    }
}
