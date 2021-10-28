public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    
    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){
        if(this.salary <= 1000) return 0.00;
        else return this.salary * 0.03;
    }
    int bonus(){
        if(this.workHours <= 40) return 0;
        else return (this.workHours - 40) * 30;
    }
    double raiseSalary(){
        if((2021 - this.hireYear) < 10) return this.salary * 0.05;
        else if((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20) return this.salary * 0.10;
        else return this.salary * 0.15;
    }
    void toMyString(Employee e){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + e.tax());
        System.out.println("Bonus : " + e.bonus());
        System.out.println("Maaş Artışı : " + e.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte Maaş : " + (this.salary - e.tax() + e.bonus()));
        System.out.println("Toplam Maaş : " + (this.salary - e.tax() + e.bonus() + e.raiseSalary()));
    }
}
