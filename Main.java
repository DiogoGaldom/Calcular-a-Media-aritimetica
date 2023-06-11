import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int numero1, numero2, numero3, numero4, numero5, numero6;


            System.out.println(" digite  um numero");
            numero1 = input.nextInt();

            System.out.println(" digite  um numero");
            numero2 = input.nextInt();

            System.out.println(" digite  um numero");
            numero3 = input.nextInt();

            System.out.println(" digite  um numero");
            numero4 = input.nextInt();

            System.out.println(" digite  um numero");
            numero5 = input.nextInt();

            System.out.println(" digite  um numero");
            numero6 = input.nextInt();

            int mediaAritimetica = (numero1 + numero2 + numero3 + numero4 + numero5 + numero6) /6;
            System.out.println(mediaAritimetica);
        }


    }

