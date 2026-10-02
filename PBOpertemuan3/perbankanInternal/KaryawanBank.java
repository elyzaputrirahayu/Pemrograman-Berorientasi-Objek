package PBOpertemuan3.perbankanInternal;

public class KaryawanBank {
    //Menggunakan default modifier (tanpa keyword)
    String idKaryawan;
    String departemen;

    KaryawanBank(String id, String dept) {
        this.idKaryawan = id;
        this.departemen = dept;
    }

    void  prosesTransaksi() {
        System.out.println("Karyawan " + idKaryawan + "" + " sedang memproses transaksi.");
    }
}
