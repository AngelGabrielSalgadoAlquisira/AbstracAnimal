package AbstracAnimal;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String Name, String Color, int age){
        super(Name,Color,age);
    }

    @Override
    public String talk(){
        return "Miau";
    }

    public String toString(){
        return super.Name + "Es un gato " +
                " de color " + super.Color +
                " tiene " + super.age + " años " +
                " Y dice " + this.talk();
    }
}
