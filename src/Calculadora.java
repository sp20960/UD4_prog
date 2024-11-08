import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = 0, num2 = 0;
        int operacio = 0;

        System.out.println("-----MENU----");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicació");
        System.out.println("4.- Divisió");
        System.out.println("Introdueix dos numeros");

        if (sc.hasNextDouble() == true) {
            num1 = sc.nextDouble();
        }
        else{
            System.out.println("Numero incorrecte");
        }

        if (sc.hasNextDouble() == true) {
            num2 = sc.nextDouble();
        }
        else{
            System.out.println("Numero incorrecte");
        }

        System.out.println("Introdueix la operació 1-4");

        if (sc.hasNextInt() == true) {
            operacio = sc.nextInt();
        }
        else {
            System.out.println("Numero incorrecte");
        }

        switch (operacio) {
            case 1:
                System.out.println("La suma es: " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta es: " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("La multiplicacio es: " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println("La divisió es: " + num1 + " / " + num2 + " = " + (num1 / num2));
                break;
           default:
                System.out.println("Opcio invalida");

        }

    }
}
