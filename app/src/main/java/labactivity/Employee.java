package labactivity;

public abstract class Employee implements IPayable, IIdentifiable{
    private String name;
    private String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    public String getName() { 
        return name;
     }

    @Override
    public String getUniqueIdentifier() {
        return "EMP-" + employeeId;
    }
}