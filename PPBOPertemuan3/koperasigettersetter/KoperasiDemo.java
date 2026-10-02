package PPBOPertemuan3.koperasigettersetter;

public class KoperasiDemo {
public static void main(String[] args) {
    Anggota anggotal = new Anggota("Iwan", "Jalan Mawar");
    System.out.println("Simpanan " + anggotal.getNama()+ " : Rp " + anggotal.getSimpanan());
    
    anggotal.setNama ("Iwan Setiawan");
    anggotal.setAlamat("Jalan Sukarno Hatta no 10");
    anggotal.setor(100000);
    
    System.out.println("Simpanan " + anggotal.getNama() +" : Rp " + anggotal.getSimpanan());
    anggotal.pinjam(5000);
    System.out.println("Simpanan " + anggotal.getNama()+ " : Rp " + anggotal.getSimpanan());
    }
}
