package PBOpertemuan3;

public class Nasabah2 {

    private String nomorRekening;
    private String nama;
    private int saldo = 0;

    public Nasabah2() {
        nomorRekening = "000000";
        nama = "NO NAME";
        saldo = 50000;
    }

    public void setNomorRekening (String norek) {
        nomorRekening = norek;
    } 

    public String getNomorRekening() {
        return nomorRekening;
    }

    public void setNama (String nm) {
        nama = nm;
    }

    public String getNama (String nm) {
        return nama;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setor (int nominal) {
        saldo += nominal;
    }

    public void tarik(int nominal) {
    saldo -= nominal;
    }
}

