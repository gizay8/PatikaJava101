public class Course {
    Teacher teacher;
    
    String name;
    String code;
    String prefix;
    double note;
    double notee;
    
    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note = 0;
        int notee = 0;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
           this.teacher = teacher; 
           printTeacher();
        }else{
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor!");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }
}
