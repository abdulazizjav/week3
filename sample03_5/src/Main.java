import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final double PI = 3.141592;
        double area;
        double base;
        double radius;
        double squareArea;
        double circleArea;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("정사각형의 한변의 길이 입력(예 5): ");
        base = keyboard.nextInt();

        squareArea = base * base;
        radius = base / 2.0;
        circleArea = PI * radius * radius;

        area = squareArea - circleArea;

        System.out.println("정사각형의 면적 - 원의 면적 = " + area);

        keyboard.close();
    }
}