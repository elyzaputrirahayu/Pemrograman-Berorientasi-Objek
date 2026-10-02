package PBOpertemuan3;

public class TestNasabah3 {
    public static void main(String[] args) {

    Nasabah3 nas =  new Nasabah3 ("11556677", "Nikiloe Tesla", 900000);

    System.out.println("Nomor rekening:" + nas.getNomorRekening());
    System.out.println("Nama: " + nas.getnama());
    System.out.println("Saldo: " +  nas.getSaldo());
    }
}

