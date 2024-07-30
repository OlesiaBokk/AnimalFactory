package cy.olesiabokk.animalfactoryapp.entity;

import java.util.concurrent.atomic.AtomicLong;

public class Cat {
    private static final AtomicLong counter = new AtomicLong(0);
    private long id;
    private String name;
    private int age;
    private int weight;
    private String color;

    public Cat(String name, int age, int weight, String color) {
        this.id = counter.addAndGet(1);
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat id = " + id +
                ", name = '" + name + '\'' +
                ", age = " + age +
                ", weight = " + weight +
                ", color = '" + color + '\'' + '\n';
    }
}