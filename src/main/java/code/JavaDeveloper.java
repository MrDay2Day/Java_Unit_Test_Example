package code;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloper {
    List<String> skills = new ArrayList<>();

    public JavaDeveloper(){
        skills.add("Java");
        skills.add("Spring");
        skills.add("Hibernate");
        skills.add("JUnit");
        skills.add("Maven");
    }

    public List<String> getTestingSkills(){
        return skills;
    }
}
