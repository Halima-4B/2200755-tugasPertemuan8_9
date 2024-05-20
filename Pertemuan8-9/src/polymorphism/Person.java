package polymorphism;

public class Person{
    protected String nama;
    protected String alamat;
    protected String noTelepon;
    protected String email;

    public Person(){
    }

    public Person(String nama, String alamat, String noTelepon, String email){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.email = email;
    }

    public String getName(){
        return nama;
    }

    public String getAddress(){
        return alamat;
    }

    public String getPhoneNumber(){
        return noTelepon;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString(){
        return "Kelas: Person\nNama: " + nama + "\nAlamat: " + alamat + "\nNo Telepon: " + noTelepon + "\nEmail: " + email;
    }
}