package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {

    private final String name;
    private final List<String> hobbies;

    public ImmutableClass(String name, List<String> hobbies) {
        this.name = name;
        List<String> clonedHobby = new ArrayList<>();
        for (int i = 0; i < hobbies.size(); i++) {
            clonedHobby.add(hobbies.get(i));
        }
        this.hobbies = clonedHobby;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        List<String> clonedHobby = new ArrayList<>();
        for (int i = 0; i < hobbies.size(); i++) {
            clonedHobby.add(hobbies.get(i));
        }
        return clonedHobby;
    }
}

class ImmutableMain {

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass("Manish", List.of("Playing", "reading"));
        List<String> hobbies = immutableClass.getHobbies();
        System.out.println(hobbies);
    }
}
