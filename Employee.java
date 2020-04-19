// Coded by Sabbir Ahmed %035170112
public class Employee{
    private String fName;
    private String lName;
    private double monthlySalary;

    // constructor
    public Employee(String fName, String lName, double monthlySalary){
        setFirstName(fName);
        setLastName(lName);
        setMonthlySalary(monthlySalary);
    }
    // setters
    public void setFirstName(String fName){
        this.fName = fName;
    }
    public void setLastName(String lName){
        this.lName = lName;
    }
    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary > 0)
            this.monthlySalary = monthlySalary;
    }
    public void setRaise(double percentage){
        setMonthlySalary(monthlySalary += (monthlySalary / 100) * percentage);
    }
    // getters
    public String getFirstName(){
        return fName;
    }
    public String getLastName(){
        return lName;
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
    public double getYearlySalary(){
        return getMonthlySalary() * 12;
    }

}
