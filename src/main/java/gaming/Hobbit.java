package gaming;

public class Hobbit extends Character
{

    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Character victim)
    {
        System.out.println("*Hobbit*: Baka! Don`t touch my money!");
    }
}
