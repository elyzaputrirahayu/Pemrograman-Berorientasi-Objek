package PBOpertemuan3;

public class TestNasabah1 {

    public static void main(String[] args) {

    Nasabah1 anton = new Nasabah1();

    anton.setNomorRekening("1123123");
    anton.setNama ("Anton Kemang ");
    anton.setor (10000);

    System.out.println("Saldo " + anton.getNama() + "saat ini: Rp " + anton.getSaldo());

    anton.tarik(5000);

    System.out.println("Saldo "  + anton.getNama () + "saat ini: Rp " + anton.getSaldo());
    }
}

