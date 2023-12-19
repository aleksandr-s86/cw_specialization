import java.time.LocalDate;
import java.util.Set;

public class PackAnimals extends Animals {
    protected PackAnimals(String name, LocalDate birthday, TypeAnimal type) {
        super(name, birthday, type);
    }

    protected PackAnimals(String name, LocalDate birthday, Set<String> commands, TypeAnimal type) {
        super(name, birthday, commands, type);
    }
}
