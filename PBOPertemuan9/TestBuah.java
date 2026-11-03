package PBOPertemuan9;

public class TestBuah {
    public static void main(String[] args) {
        Manusia ilham = new Manusia();

        Apel myapel = new Apel();
        Pisang mypisang = new Pisang();
        Durian mydurian = new Durian();

        System.out.println("=== MAKAN PISANG ===");
        ilham.MakanBuah(mypisang);        

        System.out.println("\n=== MAKAN APEL ===");
        ilham.MakanBuah(myapel);        

        System.out.println("\n=== MAKAN DURIAN ===");
        ilham.MakanBuah(mydurian);            
    }
}
