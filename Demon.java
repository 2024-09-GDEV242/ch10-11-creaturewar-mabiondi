
/**
 * A super class for demon creatures, implementing the special Demon Magic attack.
 *
 * @author Michael Biondi
 * @version 2024-11 v1.0
 */
public abstract class Demon extends Creature
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
        int damage = super.attack();
        int random = Randomizer.nextInt(100);
        if (random <= 5) {
            damage += 50;
        }
        return damage;
    }
}
