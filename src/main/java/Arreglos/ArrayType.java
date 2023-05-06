package Arreglos;

public class ArrayType {
    public static void main(String[] args) {
        String [] bugs = { "criket" , "beetle" , "ladybug"};
        String [] alias = bugs;
        System.out.println(bugs.equals(alias));   //true

        for(int i = 0;i<bugs.length; i++){
            System.out.println(bugs[i]);
        }

    }
}
