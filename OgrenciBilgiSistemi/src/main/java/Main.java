//
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "5555");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "1111");
        
        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        
        Course biyo = new Course("Biyoloji", "101", "BIO");
        biyo.addTeacher(t3);
        
        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100.00, 78.00, 50.00, 50.00, 40.00, 90.00);
        s1.isPass();
        
        Student s2 = new Student("Güdük Necmi", "444", "4", tarih, fizik, biyo);
        s2.addBulkExamNote(50.00, 30.00, 70.00, 60.00, 80.00, 20.00);
        s2.isPass();
    }
    
}
