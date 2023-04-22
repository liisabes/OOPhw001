import Units.Snipers;
import Units.Spearman;
import Units.Spearmen;
import Units.Crossbowman;
import Units.Crossbowmen;
import Units.Magician;
import Units.Magicians;
import Units.Monk;
import Units.Monks;
import Units.Outlaw;
import Units.Outlaws;
import Units.Peasant;
import Units.Peasants;
import Units.Sniper;

public class Main {
    public static void main(String[] args) {
        
        // Peasants peasants = new Peasants("Oleg", 0, 0, 0, 0, 0, 0, 0, 0);
        Peasant peasant = new Peasant("Oleg");
        System.out.println("Peasant " + peasant);

        // Outlaws outlaws = new Outlaws("Borya", 0, 0, 0, 0, 0, 0, 0);
        Outlaw outlaw = new Outlaw("Borya");
        System.out.println("Outlaw " + outlaw);
        
        // Snipers snipers = new Snipers("Ivan", 0, 0, 0, 0, 0, 0, 0);
        Sniper sniper = new Sniper("Ivan");
        System.out.println("Sniper " + sniper);

        // Magicians magicians = new Magicians("Maxim", 0, 0, 0, 0, 0, 0, 0, 0);
        Magician magician = new Magician("Maxim");
        System.out.println("Magician " + magician);
        
        // Spearmen spearmen = new Spearmen("Alex", 0, 0, 0, 0, 0, 0);
        Spearman spearman = new Spearman("Alex");
        System.out.println("Spearman " + spearman);

        // Crossbowmen crossbowmen = new Crossbowmen("Vova", 0, 0, 0, 0, 0, 0, 0, 0);
        Crossbowman crossbowman = new Crossbowman("Vova");
        System.out.println("Crossbowman " + crossbowman);

        // Monks monks = new Monks("Matvey", 0, 0, 0, 0, 0, 0);
        Monk monk = new Monk("Matvey");
        System.out.println("Monk " + monk);
    }
}
