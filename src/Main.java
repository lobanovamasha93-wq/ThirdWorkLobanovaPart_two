//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double weight = 59.0;
        double height = 1.55;

        int bmi = service.calculate(weight, height);

        System.out.println("Вес: " + weight + " кг");
        System.out.println("Рост: " + height + " м");
        System.out.println("Индекс массы тела (BMI): " + bmi);
    }
}