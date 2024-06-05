import java.util.Scanner;

public class SalaryPaymentSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = input.nextInt();
        
        //Names of the employees
        String[] employees = new String[numberOfEmployees];

        //Salary of the employees
        int[] salary = new int[numberOfEmployees];
        
        //A for loop for add the names of employees in the array of string
        for(int i = 0; i < numberOfEmployees; i++){
            System.out.print("Please enter employee name: ");
            employees[i] = input.next();

            System.out.print("Please enter " + employees[i] + " salasy: ");
            salary[i] = input.nextInt();

            System.err.println();
        }
         int counter = 0;
         System.err.println("\t--- Our employees --- ");
         for(String employee : employees){
            System.out.print((counter + 1) + " _ " + employee + ", " + salary[counter] + "\n");
            counter++;
         }

         System.out.print("\nPlease choose an employee (Enter the number): ");
         int employee_no = input.nextInt();

         System.out.print("\nPlease enter the absent days: ");
         int absent_days = input.nextInt();

         System.out.print("\nPlease enter the over time hours: ");
         int overTime_houre = input.nextInt();

         System.out.println("Mr-" + employees [employee_no - 1] + " you will take: " + calcSalary(salary[employee_no - 1], absent_days, overTime_houre) + "$");
    }

    public static int calcSalary(int gross_Salary, int absent_days, int overTime_houre){
        float salaryOneDay = (float) gross_Salary /(float)30;
        float salaryOneHoure = salaryOneDay / (float)8;

        int absent_amount = (int)(absent_days * salaryOneDay);
        int overTime_amount = (int)(overTime_houre * salaryOneHoure);

        int net_salary = gross_Salary + overTime_amount - absent_amount;
        return net_salary;
    }
    
}