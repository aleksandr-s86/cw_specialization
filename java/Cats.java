import java.time.LocalDate;
import java.util.Set;

public class Cats extends Pets {
     public Cats(String name, LocalDate birthday) {
        super(name, birthday, TypeAnimal.Cat);
    }

    public Cats(String name, LocalDate birthday, Set<String> commands) {
        super(name, birthday, commands, TypeAnimal.Cat);
    }
}
