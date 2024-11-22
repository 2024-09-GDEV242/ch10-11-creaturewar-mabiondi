
import java.util.ArrayList;

/**
 * The Simulator for the battle between the two armies
 *
 * @author Michael Biondi
 * @version 2024-11 v1.0
 */
public class Simulation
{
    private ArrayList<Creature> goodArmy;
    private ArrayList<Creature> evilArmy;

    /**
     * Constructor for the Simulation
     */
    public Simulation()
    {
        goodArmy = new ArrayList<Creature>();
        evilArmy = new ArrayList<Creature>();
        for (int i = 0; i < 100; i++) {
            int rand = Randomizer.nextInt(10);
            if (rand <= 6) {
                goodArmy.add(new Human());
            } else {
                goodArmy.add(new Elf());
            }
        }
        for (int i = 0; i < 35; i++) {
            int rand = Randomizer.nextInt(10);
            if (rand <= 2) {
                evilArmy.add(new Cyberdemon());
            } else if (rand == 9) {
                evilArmy.add(new Balrog());
            } else {
                evilArmy.add(new Human());
            }
        }
    }
}
