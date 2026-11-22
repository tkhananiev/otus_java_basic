package ru.otus.java.basic.homeworks.hw09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- 1. Range -----");
        System.out.println(arrValuesRange(4, 7));

        System.out.println("----- 2. Sum > 5 -----");
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 3, 7, 8, 2, 9));
        System.out.println(list1 + " -> " + arrValuesSum(list1));

        System.out.println("----- 3. Replace all -----");
        replaceAllElements(9, list1);
        System.out.println(list1);

        System.out.println("----- 4. Increase all -----");
        List<Integer> list2 = new ArrayList<>(Arrays.asList(10, 6, 5, 9, 78, 91, 15));
        arrValuesIncrease(2, list2);
        System.out.println(list2);

        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Anna", 25),
                new Employee("Boris", 40),
                new Employee("Vera", 19),
                new Employee("Dima", 33)
        ));

        System.out.println("----- 6. Names -----");
        System.out.println(employeesNames(employees));

        System.out.println("----- 7. Age >= 30 -----");
        for (Employee employee : employeesAge(30, employees)) {
            System.out.println(employee.getName() + ", " + employee.getAge());
        }

        System.out.println("----- 8. Average age > 20 / > 50 -----");
        System.out.println(checkEmployeesAverageAge(employees, 20));
        System.out.println(checkEmployeesAverageAge(employees, 50));

        System.out.println("----- 9. Youngest -----");
        Employee youngest = youngestEmployee(employees);
        System.out.println(youngest.getName() + ", " + youngest.getAge());
    }

    public static List<Integer> arrValuesRange(Integer min, Integer max) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = min; i <= max; i++) {
            result.add(i);
        }
        return result;
    }

    public static Integer arrValuesSum(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            if (i > 5) {
                sum += i;
            }
        }
        return sum;
    }

    public static void replaceAllElements(Integer n, List<Integer> list) {
        list.replaceAll(e -> n);
    }

    public static void arrValuesIncrease(Integer n, List<Integer> list) {
        list.replaceAll(x -> x + n);
    }

    public static List<String> employeesNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }

    public static List<Employee> employeesAge(Integer age, List<Employee> employees) {
        List<Employee> employeesAges = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= age) {
                employeesAges.add(employee);
            }
        }
        return employeesAges;
    }

    public static boolean checkEmployeesAverageAge(List<Employee> employees, Integer age) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getAge();
        }
        int averageAge = sum / employees.size();
        return averageAge > age;
    }

    public static Employee youngestEmployee(List<Employee> employees) {
        Employee youngest = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getAge() < youngest.getAge()) {
                youngest = employee;
            }
        }
        return youngest;
    }
}
