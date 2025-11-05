package Akun;

// Subclass dari AkunBank
public class RekeningTabungan extends AkunBank{

    protected String noRekening;
    protected Double saldo;
    private String pin;

    // Protected bisa diakses di dalam pakage yang sama saja
    protected void getPin(){
        System.out.println("Pin : " +pin);
    }

    protected void setPin(String pinBaru){
        this.pin = pinBaru;
    }
    
    public static void main(String[] args){
        AkunBank akun = new RekeningTabungan();

        /* 
            notelp bisa langsung diakses di sini karena protected
            menjadikan noTelp bisa diakses di pakage yang sama
            RekeningTabungan berada di pakage yang sama dengan AkunBank
            yaitu di pakage Akun
        */        
        akun.noTelp = "0852324112";
        
    }
    
}
