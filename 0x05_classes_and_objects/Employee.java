public class Employee
{
    private String name;
    private double salary;
    private int yearsOfService;

    /**
     * Creates an employee.
     *
     * @param name the employee's name
     * @param salary the monthly salary
     * @param yearsOfService the employee's years of service
     *
     */

    public Employee(String name, double salary, int yearsOfService)
    {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService >= 0 ? yearsOfService : 0;
    }

    /**
     * Increase the employee's salary by a percentage.
     *
     * @param percent the percentage increase
     */
    public void giveRaise(double percent)
    {
        if (percent > 0)
        {
            double raise = salary / percent;
            salary += raise;
        }
    }

    /**
     * Checks whether the employee qualifies for a bonus
     *
     * @return true if the employee has at least 3 years of service
     */
    public boolean isEligibleForBonus()
    {
        return yearsOfService >= 3;
    }

    /**
     * Calculates the employee's annual salary.
     *
     * @return monthly salary multiplied by 12
     */
    public double getAnnualSalary()
    {
        return salary * 12;
    }
}
