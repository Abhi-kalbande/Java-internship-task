import java.util.*;
import java.util.stream.*;

public class EmployeeDataProcessor {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Aditi", "IT", 90000, "Pune", 2017),
            new Employee(2, "Raj", "HR", 50000, "Delhi", 2019),
            new Employee(3, "Meera", "Finance", 75000, "Delhi", 2018),
            new Employee(4, "Sam", "IT", 120000, "Bangalore", 2015),
            new Employee(5, "Neha", "HR", 60000, "Pune", 2021)
        );

        // 1. Filter by department and salary
        List<Employee> highPaidIT = employees.stream()
            .filter(e -> e.getDepartment().equals("IT") && e.getSalary() > 80000)
            .collect(Collectors.toList());

        // 2. Get names of employees working in Delhi
        List<String> delhiEmployees = employees.stream()
            .filter(e -> e.getCity().equals("Delhi"))
            .map(Employee::getName)
            .toList();

        // 3. Average salary by department
        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment,
                     Collectors.averagingDouble(Employee::getSalary)));

        // 4. Employee joined after 2018
        List<Employee> recentJoiners = employees.stream()
            .filter(e -> e.getJoiningYear() > 2018)
            .sorted(Comparator.comparing(Employee::getJoiningYear))
            .toList();

        // 5. Highest salary
        Employee topEarner = employees.stream()
            .max(Comparator.comparing(Employee::getSalary))
            .orElseThrow();

        System.out.println("\nHigh Paid IT Employees: " + highPaidIT);
        System.out.println("\nEmployees in Delhi: " + delhiEmployees);
        System.out.println("\nAverage Salary by Department: " + avgSalaryByDept);
        System.out.println("\nRecent Joiners: " + recentJoiners);
        System.out.println("\nTop Earner: " + topEarner);
    }
}
