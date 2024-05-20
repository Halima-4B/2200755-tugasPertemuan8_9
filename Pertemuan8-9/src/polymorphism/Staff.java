package polymorphism;

public class Staff extends Employee{
    private String gelar;

    public Staff(){
    }

    public Staff(String nama, String alamat, String noTelepon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan, String gelar){
        super(nama, alamat, noTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.gelar = gelar;
    }

    public String getTitle(){
        return gelar;
    }

    @Override
    public String toString(){
        return "Kelas: Staff\nNama: " + nama + "\nAlamat: " + alamat + "\nNo Telepon: " + noTelepon + "\nEmail: " + email + "\nKantor: " + kantor + "\nGaji: " + gaji + "\nGelar: " + gelar;
    }
}