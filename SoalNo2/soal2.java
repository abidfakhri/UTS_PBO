// Muhamad 'Abid Fakhri Nabiil - 32602400022
public class soal2{
    public static void main(String[] args){

        // Untuk class Pegawai
        System.out.println("Class Pegawai");
        Pegawai pegawai = new Pegawai();
        // Method
        pegawai.info();
        
        
        // Untuk class Direktur
        System.out.println("\nClass Direktur");
        Direktur direktur = new Direktur();
        // Method
        direktur.info();
        direktur.infoDirektur();
        
        
        // Untuk class Manager
        System.out.println("\nClass Manager");
        Manager manager = new Manager();
        // Method
        manager.info();
        manager.infoManager();
        manager.infoDirektur();

    }

    /* 
        Kesimpulan
        Bisa memanggil method dari induk sebelumnya
        tapi tidak setelahnya.
    */
}
