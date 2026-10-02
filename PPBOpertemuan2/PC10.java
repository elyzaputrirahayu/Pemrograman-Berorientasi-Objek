package PPBOpertemuan2;

public class PC10 {
    protected String merk;
    protected String processor;

    public PC10(String merk, String processor) {
        this.merk = merk;
        this.processor = processor;
    }

    public void nyalakan() {
        System.out.println("PC " + merk + " dengan processor " + processor + " sedang menyala.");
    }

    public void matikan() {
        System.out.println("PC " + merk + " berhasil dimatikan.");
    }

    public void cetakInformasi() {
        System.out.println("--- INFORMASI PC ---");
        System.out.println("Merk      : " + merk);
        System.out.println("Processor : " + processor);
    }
} 
