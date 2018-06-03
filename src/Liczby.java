public class Liczby {
    public static void main(String[] args){
        int i = 0;
        int suma = 0;

        for(i = 0; i<=100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("Liczba parzysta: " + i);
        }
        suma = suma + i;
        System.out.println("Suma liczb: " + suma + i);

    }
}
