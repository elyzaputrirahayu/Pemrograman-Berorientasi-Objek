package PPBOPertemuan4.id.ac.polinema.relasiclass.percobaan3;

public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        KeretaApi KeretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);

        System.out.println(KeretaApi.info());
    }
}
