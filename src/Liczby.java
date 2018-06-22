public class Liczby {
    public static void main(String[] args){

        int suma = 0;

        for(int i = 0; i<=100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("Liczba parzysta: " + i);
            suma += i;
        }
       // suma += i;
        System.out.println("Suma liczb: " + suma );

    }
}
