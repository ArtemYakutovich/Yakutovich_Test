import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        int number = sc.nextInt();
        if (number > 7) {
            System.out.println("Привет ");
        }
        else   {
            System.out.println("Введите число больше 7");


        }

        System.out.println("===============================================");

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите имя: ");

        String st = sc1.next();
        if (st.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав ");
        }
        else  {
            System.out.println("Нет такого имени");
        }

        System.out.println("========================================");


        Array myArray = new Array();
        myArray.arrayOfNumbers();
    }
}


