

public class Inlamning1 {
    public static void main() {
        int baseSalary = 20000;
        int provision = 500;
        int sales = 15;
        int salary = baseSalary + (provision * sales);
        double healthBonus = 0.02;
        double healthBonusSum = salary * healthBonus;
        double salarySubTotal = salary + healthBonusSum;
        double taxes = 0.3345;
        double taxSum = salarySubTotal * taxes;
        double netSalary = salarySubTotal - taxSum;

        System.out.printf("Their net salary will be %.2f.%n", netSalary);
    }
}
