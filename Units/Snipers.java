package Units;
public class Snipers extends BaseUnit {

    protected int arrows, accuracy;

    public Snipers(String name, int hp, int maxhp, int attack, int defense, int speed, int arrows, int accuracy) {
        super(name, hp, maxhp, attack, defense, speed);
        this.arrows = arrows;
        this.accuracy = accuracy;
    }

    public void Shoot() {
        System.out.println(name + " is shooting");
    }

    public void Aim() {
        System.out.println(name + " is aiming");
    }

    public void Hide() {
        System.out.println(name + " is hiding");
    }
    
}
