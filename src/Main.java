import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner number = new Scanner(System.in);
        System.out.println("PLEASE VVEDITE PRAVILNYI TRIANCLE : INACHE RESULTAT BUDET NEVERNYM!!!");
        System.out.println("Vvedite a: ");
        triangle.a=number.nextInt();
        System.out.println("Vvedite b: ");
        triangle.b=number.nextInt();
        System.out.println("Vvedite c: ");
        triangle.c=number.nextInt();

        triangle.area(triangle.a, triangle.b, triangle.c);
    }
}