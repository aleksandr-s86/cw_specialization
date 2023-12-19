import java.time.LocalDate;
import java.util.Set;

public class Dogs extends Pets {
     public Dogs(String name, LocalDate birthday) {
        super(name, birthday, TypeAnimal.Dog);
    }

    public Dogs(String name, LocalDate birthday, Set<String> commands) {
        super(name, birthday, commands, TypeAnimal.Dog);
    }
}
