import java.util.Scanner;

public class Main {
        public static void main (String[] args ) {
            System.out.println("Dik Üçgende Hipotenüs Bulan Programına Hoşgeldiniz!");
            Scanner input1= new Scanner(System.in);

            System.out.println("A kenar uzunluğunu giriniz: ");
            Double a = input1.nextDouble();
            System.out.println("B kenar uzunluğunu giriniz: ");
            Double b = input1.nextDouble();

            double c = Math.sqrt((a*a)+(b*b));
            double Cevre =  a + b + c ;
            System.out.println("Üçüncü kenar uzunluğu: "+ c);
            System.out.println("Çevre uzunluğu: " + Cevre);



        }
}
