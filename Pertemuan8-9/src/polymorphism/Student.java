package polymorphism;

public class Student extends Person{
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(){
    }

    public Student(String nama, String alamat, String noTelepon, String email, String status){
        super(nama, alamat, noTelepon, email);
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    @Override
    public String toString(){
        return "Kelas: Student\nNama: " + nama + "\nAlamat: " + alamat + "\nNoTelpon: " + noTelepon + "\nEmail: " + email + "\nStatus: " + status;
    }
}