package gaming;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.Random;
import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;


public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter()
    {
        Reflections reflections = new Reflections("gaming");
        Set<Class<?>> subTypes = reflections.get(SubTypes.of(Character.class).asClass());
        subTypes.remove(NobleCharacter.class);
        return (Character) subTypes.toArray(new Class[0])[new Random().nextInt(subTypes.size())].getDeclaredConstructor().newInstance();
    }

    public static void main(String[] args)
    {
        gaming.Character player = CharacterFactory.createCharacter();
        System.out.println(player);
    }
}
