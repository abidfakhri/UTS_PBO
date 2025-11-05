package Akun;

public class AkunBank {
    
    public String nama;
    protected String noTelp;
    private String email;

    public void setEmail(String email){
        this.email = email;
    }

    public void getEmail(){
        System.out.println(email);
    }

    public static void main(String[] args){
        RekeningTabungan tabungan = new RekeningTabungan();

        // Pin hanya bisa diakses di sini tidak bisa diluar
        tabungan.setPin("12345");
        tabungan.getPin();
        
    }
}
