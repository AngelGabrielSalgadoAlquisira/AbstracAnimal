package AbstracAnimal;

public class Rooster extends Animal{

    public Rooster(){
    }

    public Rooster (String Name, String Color, int age){
        super(Name,Color,age);
    }

    @Override
    public String talk(){
        return "quiquiriqui";
    }

    public String toString(){
        return super.Name + "Es un gallo " +
                " de color " + super.Color +
                " tiene " + super.age +
                " y dice " + this.talk();
    }
}
