package gaming;
import java.util.Random;

import static java.lang.Math.max;

public abstract class NobleCharacter extends Character
{
    private static Random randomAttack = new Random();

    public NobleCharacter(int min, int max)
    {
        super(randomAttack.nextInt(max-min-1)+min, randomAttack.nextInt(max-min+1)+min);
    }

    @Override
    public void kick(Character victim)
    {
        victim.setHp(max(0, victim.getHp()- randomAttack.nextInt(getPower())));
    }
}
