package saiyajin;

import org.bson.Document;
import org.springframework.data.annotation.Id;

import java.util.Set;

public class Saiyajin extends Document {

    @Id
    private String id;
    private String name;
    private int age;
    private int maxLeval;
    private Set<String> skills;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMaxLeval() {
        return maxLeval;
    }

    public void setMaxLeval(int maxLeval) {
        this.maxLeval = maxLeval;
    }

    public Set<String> getSkills() {
        return skills;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }

}
