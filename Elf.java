
/**
 * An Elf, a subclass of Creature with
 * a special overridden attack() using elf magic.
 *
 * @author Michael Biondi
 * @version 2024-11 v1.0
 */
public class Elf extends Creature
{
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP
        );
    }

    /**
     * Overrides the Creature attack() with a special elf attack
     * that has a 10% chance of doing 2x damage.
     *
     * @return value to be used to cause damage to another creature
     */
    @Override
    public int attack()
    {
        int damage = super.attack();
        int random = Randomizer.nextInt(100);
        if (random <= 10) {
            damage *= 2;
        }
        return damage;
    }
}
