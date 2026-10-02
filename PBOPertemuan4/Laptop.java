package PBOPertemuan4;

public class Laptop {
    private String Merek;
    private Processor CPU;

    public String getmerek() {
        return Merek;
    }

    public void setMerek(String mrk) {
        Merek = mrk;
    }

    public Processor getCPU() {
        return CPU;
    }
    
    public void setCPU (Processor proc) {
        CPU = proc;
    }

    public void tampilkanInfo() {
        System.out.println("merk Laptop: " + Merek);
        if (CPU != null) {
            CPU.tampilkanInfo();
        } else {
            System.out.println("processor: belum terpasang");
        }
    }
}
