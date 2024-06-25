package Ozlem_Mext;

public class employeeOne {
    public class Main {
        public static void main (String [] args){
            engineer employee1= new engineer("Ozlem", 50000, 24);
            Salesperson employee2 = new Salesperson("Müge" , 50000, 24,5);

                    employee1.getAnnualBonus();
                    employee2.raiseSalary();
                    employee2.getCommissionPercentage();

                    System.out.println(employee1.salary);
                    System.out.println(employee1.getAnnualBonus());
                    System.out.println(employee2.salary);
                    System.out.println(employee2.getCommissionPercentage());
            }


        }
    }
