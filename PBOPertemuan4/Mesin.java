package PBOPertemuan4;

public class Mesin {
    private int kapasitas;          // dalam cc
    private String tipeBahanBakar;  // misal: "Bensin", "Pertamax", "Solar"
 
    public Mesin(int kapasitas, String tipeBahanBakar) {
        setKapasitas(kapasitas);
        setTipeBahanBakar(tipeBahanBakar);
    }
 
    public int getKapasitas() {
        return kapasitas;
    }
 
    // Defensive programming: guard clause / validasi parameter (fail-fast)
    public void setKapasitas(int kapasitas) {
        if (kapasitas <= 0) {
            throw new IllegalArgumentException("Kapasitas mesin harus lebih besar dari 0 cc, diberikan: " + kapasitas);
        }
        this.kapasitas = kapasitas;
    }
 
    public String getTipeBahanBakar() {
        return tipeBahanBakar;
    }
 
    // Defensive programming: validasi null & string kosong
    public void setTipeBahanBakar(String tipeBahanBakar) {
        if (tipeBahanBakar == null || tipeBahanBakar.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipe bahan bakar tidak boleh kosong atau null");
        }
        this.tipeBahanBakar = tipeBahanBakar;
    }
 
    @Override
    public String toString() {
        return "Mesin{kapasitas=" + kapasitas + "cc, tipeBahanBakar='" + tipeBahanBakar + "'}";
    }
}
