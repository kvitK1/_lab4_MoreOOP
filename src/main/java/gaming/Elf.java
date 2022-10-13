package gaming;

import static java.lang.Math.max;

public class Elf extends Character
{
    public Elf()
    {
        super(10, 10);
    }

    @Override
    public void kick(Character victim)
    {
        if (victim.getPower()>this.getPower())
        {
            victim.setPower(max(0, victim.getPower()-1));
        }
        else
        {
            victim.setHp(0);
        }
    }
}
