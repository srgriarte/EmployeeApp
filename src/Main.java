import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Employee emp = new Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee No:");
        String snInput = scanner.nextLine();
        BufferedReader reader = null;
        //BufferedReader reader2 = null;
        try {
            reader = new BufferedReader(new FileReader("Employee.csv"));
          //  reader2 = new BufferedReader(new FileReader("Attendance.csv"));
            String row = "";
            String headerLine = reader.readLine();
            while (((row = reader.readLine())) !=null) {
                String[] Employee = row.split(",");
                if (snInput.equals(Employee[0])) {

                    emp.EmployeeNumber = Float.parseFloat(Employee[0]);
                    emp.EmployeeName = Employee[1];
                    emp.EmployeeBday = Float.parseFloat(Employee[3]);
                    //emp.Hours = Float.parseFloat(Employee[]);
                    emp.GrossSalary = Float.parseFloat(Employee[13]);
                    emp.SSS = Float.parseFloat(Employee[6]);
                    emp.PhilHealth = Float.parseFloat(Employee[7]);
                    emp.Pagibig = Float.parseFloat(Employee[8]);
                   // emp.Deductions = Float.parseFloat(Employee[7]);
                    //emp.NetSalaryBefore = Float.parseFloat(Employee[7]);
                    //emp.Withholding = Float.parseFloat(Employee[7]);
                   // emp.NetSalaryAfter = Float.parseFloat(Employee[7]);

                    System.out.println("===EMPLOYEE RECORD===");
                    System.out.println("Employee Number:" + emp.EmployeeNumber);
                    System.out.println("Employee Name:" + emp.EmployeeName);
                    System.out.println("Birthday:" + emp.EmployeeBday);
                    System.out.println("Gross Salary:" + emp.GrossSalary);
                    System.out.println("SSS:" + emp.SSS);
                    System.out.println("PhilHealth:" + emp.PhilHealth);
                    System.out.println("Pag-IBIG:" + emp.Pagibig);
                    System.out.println("Deductions:" + emp.Deductions);
                    System.out.println("Net Salary before Tax:" + emp.NetSalaryBefore);
                    System.out.println("Withholding Tax:" + emp.Withholding);
                    System.out.println("Net Salary:" + emp.NetSalaryAfter);
                    System.out.println("Hours worked:" + emp.Hours);
                }
                else {
                    continue;
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}