
    public class Employee {
        private String name;
        private double salary;
        private int workHours;
        private int hireYear;

        public Employee(String name, double salary, int workHours, int hireYear) {
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
        }

        public double tax() {
            if (salary < 1000) {
                return 0;
            } else {
                return salary * 0.03;
            }
        }

        public double bonus() {
            if (workHours > 40) {
                int extraHours = workHours - 40;
                return extraHours * 30;
            } else {
                return 0;
            }
        }

        public double raiseSalary() {
            int currentYear = 2021;
            int yearsOfWork = currentYear - hireYear;

            if (yearsOfWork < 10) {
                return salary * 0.05;
            } else if (yearsOfWork >= 10 && yearsOfWork < 20) {
                return salary * 0.1;
            } else {
                return salary * 0.15;
            }
        }

        public void calculateTotalSalary() {
            double tax = tax();
            double bonus = bonus();
            double raise = raiseSalary();

            double totalSalary = salary - tax + bonus + raise;

            System.out.println("Adı: " + name);
            System.out.println("Maaşı: " + salary);
            System.out.println("Çalışma Saati: " + workHours);
            System.out.println("Başlangıç Yılı: " + hireYear);
            System.out.println("Vergi: " + tax);
            System.out.println("Bonus: " + bonus);
            System.out.println("Maaş Artışı: " + raise);
            System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (salary - tax + bonus));
            System.out.println("Toplam Maaş: " + totalSalary);
        }

        public static void main(String[] args) {
            Employee employee = new Employee("kemal", 2000.0, 45, 1985);
            employee.calculateTotalSalary();
        }
    }

