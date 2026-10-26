public class EmmaLindbomIn {
    public static void main() {
        int baseSalary = 20_000;
        int provision = 500;
        int sales = 15;
        double healthBonus = 1.02;
        double taxes = 0.6655; 
        double netSalary = (baseSalary + (provision * sales)) * healthBonus * taxes;

        System.out.println("Their net salary will be: " + netSalary);
        
    }
}
