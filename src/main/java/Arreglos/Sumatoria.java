package Arreglos;

public class Sumatoria {

    public void suma(){
        int[]numeros ={78,78,90};
        int sumatoria= 0;
        System.out.println("Estos son los numeros: ");

        for(int i=0;i< numeros.length;i++){
            System.out.println( numeros[i]);
        }

        for(int i=0;i< numeros.length; i++){
            sumatoria = sumatoria + numeros[i];
        }
        System.out.println("la suma es: "+sumatoria);
    }
}
