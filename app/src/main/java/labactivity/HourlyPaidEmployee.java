package labactivity;

public class HourlyPaidEmployee extends Employee {
    private double wage;
    private double hours; 

    public HourlyPaidEmployee(String name, String id, double wage, double hours) {
        super(name, id);
        this.wage = wage;
        this.hours = hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return (40 * wage) + ((hours - 40) * wage * 1.5);
        }
    }
}