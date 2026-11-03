package PPBOPertemuan9.interfacelatihan;

// Tambahkan "implements ICumlaude, IBerprestasi"
public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi { 
    public Sarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }

    // TAMBAHKAN KEDUA METHOD DI BAWAH INI UNTUK TINGKAT NASIONAL
    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }
}
