package AbstracAnimal;

public class Dog extends Animal {

    public Dog (){
    }

    public Dog(String Name, String Color, int age){
        super(Name,Color,age);
    }

    @Override
    public String talk(){
        return "Guau";
    }

   public String toString(){
        return super.Name + "Es un perro " +
                " de color " + super.Color +
                " tiene " + super.age +
                " y dice " + this.talk();
    }
}
