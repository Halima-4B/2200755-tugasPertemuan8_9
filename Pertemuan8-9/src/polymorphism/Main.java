package polymorphism;

public class Main{
    public static void main(String[] args){
        Person person = new Person("Putra Bachtera", "Jl. Merdeka No. 11", "0812-3456-7890", "putrabach7@gmail.com");
        Student student = new Student("Nayyarafeeza", "Jl. Sudirman No. 22", "0813-4567-8901", "nayy4ra@gmail.com", Student.SENIOR);
        Employee employee = new Employee("Hafiz Munajat", "Jl. Thamrin No. 33", "0814-5678-9012", "hafiz.m@gmail.com", "Kantor 101", 5000000, new MyDate());
        Faculty faculty = new Faculty("Halimatussa'diah", "Jl. Diponegoro No. 44", "0815-6789-0123", "halimaatd@gmail.com", "Kantor 202", 8000000, new MyDate(), 10, "Wakadek");
        Staff staff = new Staff("Kimchiwa", "Jl. Gatot Subroto No. 55", "0816-7890-1234", "kimchi1@gmail.com", "Kantor 303", 4000000, new MyDate(), "Staff Keamanan");

        System.out.println(person.toString());
        System.out.println("===============================");
        System.out.println();
        System.out.println(student.toString());
        System.out.println("===============================");
        System.out.println();
        System.out.println(employee.toString());
        System.out.println("===============================");
        System.out.println();
        System.out.println(faculty.toString());
        System.out.println("===============================");
        System.out.println();
        System.out.println(staff.toString());
        System.out.println("===============================");
        System.out.println();
    }
}