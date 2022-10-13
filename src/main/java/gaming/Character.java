package gaming;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import static java.lang.Math.max;

@AllArgsConstructor
public abstract class Character {
    @Getter@Setter
    private int power;
    @Setter
    private int hp;

    public abstract void kick(Character victim);
    public boolean isAlive()
    {
        return getHp()>0;
    }

    public int getHp()
    {
        return max(0, hp);
    }

    @Override
    public String toString()
    {
        return this.getClass().getSimpleName() + "{" + "hp=" + this.hp +
                ", power=" + this.power + "}";
    }
}
