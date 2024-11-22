
/**
 * Balrog, a subclass of demon with a unique double attack.
 *
 * @author Michael Biondi
 * @version 2024-11 v1.0
 */
public class Balrog extends Demon
{
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog(int str, int hp)
    {
        super(    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR,
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP
        );
    }
    
    /**
     * Overrides the Demon attack() with a Double demon attack
     *
     * @return value to be used to cause damage to another creature
     */
    @Override
    public int attack()
    {
        int damage = super.attack() + super.attack();
        return damage;
    }
}
