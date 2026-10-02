package PBOPertemuan4;

public class Processor {
    private String Merek;
    private  double Frekuensi;

    public String getMerek(){
        return Merek;
    }

    public void setMerek(String mrk) {
        Merek = mrk;
    }

    public double getFrekuensi(){
        return Frekuensi;
    }

    public void setFrekuensi(double frek) {
        Frekuensi = frek;
    }

    public void tampilkanInfo() {
        System.out.println("Merek Processor: " + Merek);
        System.out.println("Frekuensi Processor: " + Frekuensi + " GHz");
    }
}
