package AbstracAnimal;

public abstract class Animal {
    protected String Name;
    protected String Color;
    protected int age;

    public Animal (){

    }
    public Animal(String name, String color, int age) {
        this.Name = name;
        this.Color = color;
        this.age = age;
    }

    public abstract String talk();
    }
