// class Person{
//     String name;
//     int age;
//     public Person(String name,int age){
//         this.name=name;
//         this.age=age;
//     }
//     public void displaydetails(){
//         System.out.println("name "+name);
//         System.out.println("age "+age);
//     }
// }
// class teacher extends Person{
//     String subject;
//     public teacher(String name,int age,String subject){
//         super(name, age);
//         this.subject=subject;
//     }
//     public void displaydetails(){
//         super.displaydetails();
//         System.out.println("subject "+subject);
//     }
// }
// class student extends Person{
//     int mark;
//     public student(String name,int age,int mark){
//         super(name, age);
//         this.mark=mark;
//     }
//     public void displaydetails(){
//         super.displaydetails();
//         System.out.println("mark "+mark);
//     }
// }
// public class School{
//     public static void main(String[] args) {
//         Person obj=new teacher("karun", 021, "math");
//         Person obj2=new student("bhuvi", 13, 100);
//         obj.displaydetails();
//         System.out.println();
//         obj2.displaydetails();
//     }
// }


import java.util.Random;


public class EmployeeBonusCalculator {
   public static void main(String[] args) {
       int[][] employeeData = generateEmployeeData(10);
       int[][] updatedSalaries = calculateBonus(employeeData);
       displaySummary(employeeData, updatedSalaries);
   }


   public static int[][] generateEmployeeData(int numEmployees) {
       Random random = new Random();
       int[][] employeeData = new int[numEmployees][2];
      
       for (int i = 0; i < numEmployees; i++) {
           employeeData[i][0] = 10000 + random.nextInt(90000); // Generate a random 5-digit salary
           employeeData[i][1] = random.nextInt(11); // Generate years of service between 0 and 10
       }
       return employeeData;
   }


   public static int[][] calculateBonus(int[][] employeeData) {
       int[][] updatedSalaries = new int[employeeData.length][2];
      
       for (int i = 0; i < employeeData.length; i++) {
           int salary = employeeData[i][0];
           int yearsOfService = employeeData[i][1];
           double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
           int bonus = (int) (salary * bonusPercentage);
           updatedSalaries[i][0] = salary + bonus;
           updatedSalaries[i][1] = bonus;
       }
       return updatedSalaries;
   }


   public static void displaySummary(int[][] employeeData, int[][] updatedSalaries) {
       int totalOldSalary = 0;
       int totalNewSalary = 0;
       int totalBonus = 0;


       System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Employee", "Old Salary", "Years", "Bonus", "New Salary");
       
       for (int i = 0; i < employeeData.length; i++) {
           int oldSalary = employeeData[i][0];
           int years = employeeData[i][1];
           int bonus = updatedSalaries[i][1];
           int newSalary = updatedSalaries[i][0];
          
           totalOldSalary += oldSalary;
           totalNewSalary += newSalary;
           totalBonus += bonus;
          
           System.out.printf("%-10d %-10d %-10d %-10d %-10d\n", i + 1, oldSalary, years, bonus, newSalary);
       }
       
       System.out.printf("%-10s %-10d %-10s %-10d %-10d\n", "Total", totalOldSalary, "", totalBonus, totalNewSalary);
   }
}