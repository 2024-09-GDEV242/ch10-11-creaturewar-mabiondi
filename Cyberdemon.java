
/**
 * Cyberdemon, a subclass of demon (with demon attack).
 *
 * @author Michael Biondi
 * @version 2024-11 v1.0
 */
public class Cyberdemon extends Demon
{
    private static final int MAX_CYB_HP = 100;
    private static final int MIN_CYB_HP = 25;
    private static final int MAX_CYB_STR = 40;
    private static final int MIN_CYB_STR = 20;

    /**
     * Constructor for objects of class Cyberdemon
     */
    public Cyberdemon()
    {
        super(    
            Randomizer.nextInt(MAX_CYB_STR-MIN_CYB_STR)+MIN_CYB_STR,
            Randomizer.nextInt(MAX_CYB_HP-MIN_CYB_HP)+MIN_CYB_HP
        );
    }
}
