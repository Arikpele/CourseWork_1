import java.util.Arrays;

public class Main {

        public static final Employee[] employee =

                {

                        new Employee("Иванов Иван иванович ", 1, 10000),
                        new Employee("Петров Петр Петрович", 2, 20000),
                        new Employee("Сидоров Сидр Сидорович", 3, 30000),
                        new Employee("Констатинов Константин Константинович", 4, 40000),
                        new Employee("Алексеев Алексей Алексеевич", 4, 50000),
                        new Employee("Александров Александр Александрович", 5, 60000),
                        new Employee("Владиславов Владислав Владиславович", 1, 70000),
                        new Employee("Сергеев Сергей Сергеевич", 2, 80000),
                        new Employee("Анатольев Анатолий Анатольевич", 3, 90000),
                        new Employee("Семенов Семен Семенович", 4, 100000)
                };




        public static void printEmployee() {
            Arrays.stream(employee).forEach(System.out::println);
        }

        public static double totalSalary(int department) {
            double totalSalary = 0;
            for (Employee current : employee) {
                if (department== current.getDepartment())
                totalSalary += current.getSalary();
            }


            return totalSalary;

        }

        public static void scape() {
            System.out.println("-------------------------------------");
        }

        public static String minSalary(int department) {
            String name = null;
            int minSalary = Integer.MAX_VALUE;
            for (Employee current : employee) {
                if (department == current.getDepartment())
                if (current.getSalary() <= minSalary) {
                    minSalary = current.getSalary();
                    name = current.getName();
                }
            }
            return name;
        }

        public static String maxSalary(int department) {
            String name = null;
            int maxSalary =Integer.MIN_VALUE;
            for (Employee current : employee) {
                if (department == current.getDepartment())
                if (current.getSalary() >= maxSalary) {
                    maxSalary = current.getSalary();
                    name = current.getName();
                }
            }
            return name;
        }

        public static double averageSalary(int department) {
            for (Employee current : employee) {
                if (department == current.getDepartment()) {

                }
            }
            return totalSalary(1) / employee.length;
        }
        public static void name() {
            for (Employee current : employee) {
                System.out.println(current.getName());
            }
        }

    public static void procent(int department,int procent) {
        int procent1 = 0;
        for (Employee current : employee) {
            if (department == current.getDepartment()) {
                procent1 = current.getSalary() * procent / 100 + current.getSalary();
                current.setSalary(procent1);

            }
        }
    }

    public static void printName(int departament) {
        for (Employee current : employee) {
            if (departament== current.getDepartment()){
                System.out.println(current.getName()+" "+current.getSalary());
            }
        }
    }

    public static void  minSalary1(int printSalary) {
            for (Employee current:employee)
                if (printSalary > current.getSalary()) {
                    System.out.println("Минимальная зарплата " + current);
                }
    }

    public static void  maxSalary1(int printSalary) {
        for (Employee current:employee)
            if (printSalary <= current.getSalary()) {
                System.out.println("Минимальная зарплата " + current);
            }
    }
        public static void main(String[] args) {
          //printName(2);
            //minSalary1(10000);
            //maxSalary1(80000);

        }
    }


