public class StudentRecord {
    //driver
    public static void main(String[] args) {

        Student s1 = new Student("Harsh", "S101", 49);
        Student s2 = new Student("Rahul", "S102", 50);
        Student s3 = new Student("Aman", "S103", 79);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s1.setMark(80);
        System.out.println(s1);

        s1.setMark(120);
        System.out.println(s1);
    }
}
