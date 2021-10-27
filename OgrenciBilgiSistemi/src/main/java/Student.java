public class Student {
    Course c1;
    Course c2;
    Course c3;
    
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;
    
    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(double note1, double note2, double note3, double notee1, double notee2, double notee3){
        if(note1 >= 0 && note1 <= 100){
            this.c1.note = note1;  
        }
        if(note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if(note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
        if(notee1 >= 0 && notee1 <= 100){
            this.c1.notee = notee1;  
        }
        if(notee2 >= 0 && notee2 <= 100){
            this.c2.notee = notee2;
        }
        if(notee3 >= 0 && notee3 <= 100){
            this.c3.notee = notee3;
        }
    }
    void isPass(){
        System.out.println("==============");
        this.average = ((this.c1.note * 0.8) + (this.c2.note * 0.8) + this.c3.note * 0.8 + this.c1.notee * 0.2 + this.c2.notee * 0.2 + this.c3.notee * 0.2) / 3.0;
        if(this.average > 55) {
            System.out.println("Hababam sınıfı uyanıyor ! ");
            this.isPass = true;
        }
        else {
            System.out.println("Hababam sınıfı, sınıfta kaldı ! ");
            this.isPass = false;
        }
        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name + " Notu:" + (this.c1.note * 0.8 + this.c1.notee * 0.2));
        System.out.println(this.c2.name + " Notu:" + (this.c2.note * 0.8 + this.c2.notee * 0.2));
        System.out.println(this.c3.name + " Notu:" + (this.c3.note * 0.8 + this.c3.notee * 0.2));
        System.out.println("Ortalamanız : " + this.average);
    }
}
