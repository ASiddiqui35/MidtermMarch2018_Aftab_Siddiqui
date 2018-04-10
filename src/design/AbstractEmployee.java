package design;

public abstract class AbstractEmployee implements Employee{

    public static int dayOff(int sickDays, int callOuts) {
    int dayOffs = (sickDays + callOuts);
    return dayOffs;
    }
    public static int dayOff(int vacays){
        int totalVacays = 20;
        return totalVacays;
    }


    public double calculateSalary(int salary, double bonus) {
        double total = salary + bonus;
        return total;
    }
}
