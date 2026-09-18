//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name ="Abdulaziz";
        float height =170.1f;
        double weight = 72.4;
        int age = 22;
        char gender = '남';


        System.out.printf("%s의 키는 %.1fCm 입니다.%n", name, height);
        System.out.printf("%s의 몸무게는 %.1fKg 입니다.%n", name, weight);
        System.out.printf("%s의 나이는 %d살 입니다.%n", name, age);
        System.out.printf("%s은 %c자입니다.%n", name, gender);

    }
}