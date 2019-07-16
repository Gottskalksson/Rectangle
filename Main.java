import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz wymiary prostokątu, oddzielając je klawiszem Enter: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        Rectangle rectangle1 = new Rectangle(a,b);
        rectangle1.howLong();
        rectangle1.howBig();
        rectangle1.across();
        rectangle1.results();
    }
}
