package interview.test;

import java.util.*;

public class CityEmployeeMap {

    public static void main(String[] args) {
        // Create a map to store city as key and list of employees as value
        Map<String, List<String>> cityEmployeeMap = new HashMap<>();

        // Add employees to different cities
        addEmployeeToCity(cityEmployeeMap, "New York", "Alice Smith");
        addEmployeeToCity(cityEmployeeMap, "New York", "Bob Johnson");
        addEmployeeToCity(cityEmployeeMap, "Los Angeles", "Charlie Brown");
        addEmployeeToCity(cityEmployeeMap, "Los Angeles", "David Lee");
        addEmployeeToCity(cityEmployeeMap, "Chicago", "Eve Davis");
        addEmployeeToCity(cityEmployeeMap, "Chicago", "Frank Wilson");
        addEmployeeToCity(cityEmployeeMap, "Chicago", "Grace Garcia");


        // Print the map
        System.out.println("City Employee Map: " + cityEmployeeMap);

        // Example: Get the list of employees for a specific city
//        String cityToSearch = "New York";
//        List<String> employeesInCity = cityEmployeeMap.get(cityToSearch);

//        if (employeesInCity != null) {
//            System.out.println("\nEmployees in " + cityToSearch + ": " + employeesInCity);
//        } else {
//            System.out.println("No employees found in " + cityToSearch);
//        }

        // Example: Iterate through the map and print each city and its employees
        System.out.println("\nAll Cities and Employees:");
        for (Map.Entry<String, List<String>> entry : cityEmployeeMap.entrySet()) {
            String city = entry.getKey();
            List<String> employees = entry.getValue();
            System.out.println("City: " + city + ", Employees: " + employees);
        }
    }

    // Helper method to add an employee to a city's list
    public static void addEmployeeToCity(Map<String, List<String>> cityEmployeeMap, String city, String employeeName) {
        // Check if the city already exists in the map
        if (!cityEmployeeMap.containsKey(city)) {
            // If the city doesn't exist, create a new list of employees for that city
            cityEmployeeMap.put(city, new ArrayList<>());
        }

        // Get the list of employees for the city
        List<String> employeeList = cityEmployeeMap.get(city);

        // Add the employee to the list
        employeeList.add(employeeName);
    }
}