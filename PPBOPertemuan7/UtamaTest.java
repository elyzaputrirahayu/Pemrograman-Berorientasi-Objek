package PPBOPertemuan7;

public class UtamaTest {
    public static void main(String[] args) {
        // Deklarasi variabel dengan tipe superclass (Manusia)
        Manusia orang;

        // Instansiasi menjadi Dosen (Dynamic Method Dispatch)
        orang = new Dosen();
        orang.makan(); // Mengeksekusi makan() milik Dosen

        // Instansiasi menjadi Mahasiswa (Dynamic Method Dispatch)
        orang = new Mahasiswa();
        orang.makan(); // Mengeksekusi makan() milik Mahasiswa
    }
}
