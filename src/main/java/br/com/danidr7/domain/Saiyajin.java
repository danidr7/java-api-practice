package br.com.danidr7.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.Set;

@Document
public class Saiyajin {

    @Id
    private String id;
    @Indexed(unique = true)
    @NotNull
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
