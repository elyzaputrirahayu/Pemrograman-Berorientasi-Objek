package PPBOPertemuan9.interfacelatihan;

public class Program {
//     public static void main(String[] args) {
//         Rektor pakRektor = new Rektor();
        
//         Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
//         Sarjana sarjanaCumlaude = new Sarjana("Dini");
//         PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
//         // Baris ini dihapus/dikomentari karena Mahasiswa tidak mengimplementasikan ICumlaude
//         // pakRektor.beriSertifikatCumlaude(mhsBiasa); 
        
//         // Baris di bawah ini akan berjalan dengan normal
//         pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
//         pakRektor.beriSertifikatCumlaude(masterCumlaude);
//     }
// }


    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        // Sekarang baris ini bisa dijalankan tanpa error
        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}



//     public static void main(String[] args) {
//         Rektor pakRektor = new Rektor();
//         Sarjana sarjanaCumlaude = new Sarjana("Dini");
//         PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
//         // pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
//         // pakRektor.beriSertifikatCumlaude(masterCumlaude);
        
//         // Baris ini DIKOMENTARI/DIHAPUS karena Sarjana belum implement IBerprestasi
//         // pakRektor.beriSertifikatMawapres(sarjanaCumlaude); 
        
//         pakRektor.beriSertifikatMawapres(masterCumlaude);
//     }
// }
