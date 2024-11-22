
/**
 * A super class for demon creatures.
 * This class should never be instantiated directly.
 *
 * @author Michael Biondi
 * @version 2024-11 v1.0
 */
public class Demon extends Creature
{
    /**
     * Constructor for objects of class Demon
     */
    public Demon(int str, int hp)
    {
        super(str, hp);
    }

    /**
     * Overrides the Creature attack() with a special "magic attack"
     * that has a 5% chance of doing +50 damage.
     *
     * @return value between 1 and str to be used to cause damage to another creature
     */
    @Override
    public int attack()
    {
        return 0;
    }
}
