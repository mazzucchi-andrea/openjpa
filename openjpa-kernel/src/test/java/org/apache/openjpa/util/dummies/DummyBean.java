package org.apache.openjpa.util.dummies;


import java.io.Serializable;
import java.util.Objects;

public class DummyBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private boolean active;

    public DummyBean() {
    }

    public DummyBean(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
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

    public boolean isActive() {  // ✅ Boolean field uses `is` instead of `get`
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // ✅ Implementing equals()
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DummyBean)) {
            return false;
        }
        DummyBean that = (DummyBean) obj;
        return age == that.age && active == that.active && Objects.equals(name, that.name);
    }
}
