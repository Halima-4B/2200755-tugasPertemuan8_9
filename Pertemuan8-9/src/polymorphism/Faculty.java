package polymorphism;

public class Faculty extends Employee{
    private int jamKerja;
    private String pangkat;

    public Faculty(){
    }

    public Faculty(String nama, String alamat, String noTelepon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan, int jamKerja, String pangkat){
        super(nama, alamat, noTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    public int getOfficeHours(){
        return jamKerja;
    }

    public String getRank(){
        return pangkat;
    }

    @Override
    public String toString(){
        return "Kelas: Faculty\nNama: " + nama + "\nAlanat: " + alamat + "\nNo Telepon: " +noTelepon + "\nEmail: " + email + "\nKantor: " + kantor + "\nGaji: " + gaji + "\nTanggal mulai kerja: " + tanggalDipekerjakan + "\nLama jam kerja: " + jamKerja + "\nPangkat: " + pangkat;
    }
}