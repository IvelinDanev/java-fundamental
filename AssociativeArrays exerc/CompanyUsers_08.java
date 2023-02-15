package AssociativeArrays.Exercises;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> employList = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while(!input.equals("End")){
            String[] inputData = input.split(" -> ");
            if(employList.containsKey(inputData[0])){
                List<String> employeesID = employList.get(inputData[0]);
                if(!employeesID.contains(inputData[1])){
                    employeesID.add(inputData[1]);
                }
            }else{
                List<String> employeesID = new ArrayList<>();
                employeesID.add(inputData[1]);
                employList.put(inputData[0],employeesID);
            }
            input = scanner.nextLine();
        }
        employList.entrySet()
                .forEach(company->{
                    System.out.println(company.getKey());
                    company.getValue().forEach(employee-> System.out.println("-- "+employee));
                });

    }
}
