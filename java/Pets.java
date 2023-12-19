import java.time.LocalDate;
import java.util.Set;

public class Pets extends Animals {
     protected Pets(String name, LocalDate birthday, TypeAnimal type) {
        super(name, birthday, type);
    }

    protected Pets(String name, LocalDate birthday, Set<String> commands, TypeAnimal type) {
        super(name, birthday, commands, type);
    }
}
