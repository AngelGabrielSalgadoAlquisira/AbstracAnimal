package AbstracAnimal;

import java.util.concurrent.Callable;

public class PetStore {

    public static void main(String[] args) {
        Cat garfield = new Cat("Garfield","Naranja",5);
        Dog Firulais = new Dog("Firulais", "Cafe", 10);
        Rooster Cornelio = new Rooster("Cornelio", "Blanco", 2);

        System.out.println("Ejemplo de polimorfismo usando clase abstracta");

        System.out.println("Invocando al metodo toString:");
        System.out.println(garfield.toString());
        System.out.println(Firulais.toString());
        System.out.println(Cornelio.toString());

    }

}
