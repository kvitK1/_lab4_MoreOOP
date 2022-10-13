package gaming;

public class GameManager {
    public void fight(Character player1, Character player2)
    {
        System.out.println("Ladies and gentlemen, today we have fight of the history");
        System.out.println(player1.toString() + " <-- VS --> " + player2.toString());
        while (player1.isAlive() && player2.isAlive())
        {
            if (player1 instanceof Hobbit && player2 instanceof Hobbit)
            {
                System.out.println("*Sounds from the crowd*: BOOO, we won`t watch these crybabies' contest! Let`s end up with this..");
                break;
            }
            player1.kick(player2);
            System.out.println(player1 + " just smashed " + player2 + "`s face in!");
            System.out.println("Temporary situation");
            System.out.println(player1 + " Hp level: " + player1.getHp());
            System.out.println(player2 + " Hp level: " + player2.getHp());
            player2.kick(player1);
            if (player2 instanceof Hobbit && !(player1 instanceof Knight)) {
                break;
            }
            System.out.println(player1 + " got a strong BOOM from " + player2 + "!");
            System.out.println("Temporary situation");
            System.out.println(player1 + " Hp level: " + player1.getHp());
            System.out.println(player2 + " Hp level: " + player2.getHp());
        }
        if (!(player1 instanceof Hobbit && player2 instanceof Hobbit)) {
            if (player1.isAlive()) {
                System.out.println(player1 + " wins 100 golds. Congratulations");
            } else if (player2.isAlive()) {
                System.out.println(player2 + " has worked hard today. Give him a bottle of wine, gentlemen!");
            } else {
                System.out.println("Seems that today is a loseday.. Sorry(");
            }
            System.out.println("Thank you for participation!");
        }
        else {
            System.out.println("You messed my show, two nerds. Get out of here!");
        }
    }
    public static void main(String[] args)
    {
        GameManager game = new GameManager();
        game.fight(gaming.CharacterFactory.createCharacter(), gaming.CharacterFactory.createCharacter());
    }
}

