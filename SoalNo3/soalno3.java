import Akun.AkunBank;
import Akun.RekeningTabungan;

public class soalno3 {
    
    public static void main(String[] args){

        AkunBank akun = new AkunBank();
        /* Karena atribut nama memiliki access modifier public 
        maka bisa langsung diakses*/
        akun.nama = "Abid";
        System.out.println("Nama : " + akun.nama);

        /*
            Untuk noTelp hanya bisa diakses pada class di dalam
            package yang sama karena access modifiernya protected, 
            class soalno3 berada di pakage berbeda dari class AkunBank
            jadi noTelp tidak bisa diakses lewat sini, kecuali dengan 
            getter and setter. Tetapi noTelp bisa diakses di class RekeningTabungan.
        */

        /*
            Email private dan haya bisa diakses dalam 
            lingkungan class dimana email dideklarasikan 
            (Bisa diakses lewat getter and setter)
        */

        akun.setEmail("abid@mai.com");
        akun.getEmail();



        RekeningTabungan tabungan = new RekeningTabungan();

        // Hanya bisa akses nama dan method get email yang diturunkan oleh class AkunBank
        tabungan.nama = "Abid";
        tabungan.getEmail();


    }
}
