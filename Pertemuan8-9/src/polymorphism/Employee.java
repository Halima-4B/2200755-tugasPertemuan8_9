package polymorphism;

public class Employee extends Person{
    String kantor;
    double gaji;
    MyDate tanggalDipekerjakan;

    public Employee(){
    }

    public Employee(String nama, String alamat, String noTelepon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan){
        super(nama, alamat, noTelepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }

    public String getOffice(){
        return kantor;
    }

    public double getSalary(){
        return gaji;
    }

    public MyDate getDateHired(){
        return tanggalDipekerjakan;
    }

    @Override
    public String toString(){
        return "Kelas: Employee\nNama: " + nama + "\nAlamat: " + alamat + "\nNo Telepon: " + noTelepon + 
                "\nEmail: " + email + "\nKantor: " + kantor + "\nGaji: " + gaji + 
                "\nTanggal mulai kerja: " + tanggalDipekerjakan;
    }
}