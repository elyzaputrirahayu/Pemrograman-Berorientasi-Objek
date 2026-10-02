package PBOPertemuan4;

public class SepedaMotor {
    private String merek;
    private String warna;
    private Mesin mesin;   // relasi Has-A / komposisi: 1 SepedaMotor memiliki tepat 1 Mesin
    private int maxSpeed;
    private int kecepatanSaatIni;
 
    public SepedaMotor(String merek, String warna, Mesin mesin, int maxSpeed) {
        setMerek(merek);
        setWarna(warna);
        setMesin(mesin);
        setMaxSpeed(maxSpeed);
        this.kecepatanSaatIni = 0;
    }
 
    // ---------- Getter & Setter (dengan validasi = defensive programming) ----------
 
    public String getMerek() {
        return merek;
    }
 
    public void setMerek(String merek) {
        if (merek == null || merek.trim().isEmpty()) {
            throw new IllegalArgumentException("Merek tidak boleh kosong atau null");
        }
        this.merek = merek;
    }
 
    public String getWarna() {
        return warna;
    }
 
    public void setWarna(String warna) {
        if (warna == null || warna.trim().isEmpty()) {
            throw new IllegalArgumentException("Warna tidak boleh kosong atau null");
        }
        this.warna = warna;
    }
 
    public Mesin getMesin() {
        return mesin;
    }
 
    // Guard clause: SepedaMotor tidak boleh memiliki mesin null (komposisi wajib ada isinya)
    public void setMesin(Mesin mesin) {
        if (mesin == null) {
            throw new IllegalArgumentException("Sepeda motor wajib memiliki mesin (mesin tidak boleh null)");
        }
        this.mesin = mesin;
    }
 
    public int getMaxSpeed() {
        return maxSpeed;
    }
 
    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            throw new IllegalArgumentException("MaxSpeed harus lebih besar dari 0, diberikan: " + maxSpeed);
        }
        this.maxSpeed = maxSpeed;
    }
 
    public int getKecepatanSaatIni() {
        return kecepatanSaatIni;
    }
 
    // ---------- Behavior ----------
 
    // Defensive programming: validasi input + clamping agar kecepatan tidak melebihi maxSpeed
    public void tambahKecepatan(int delta) {
        if (delta <= 0) {
            System.out.println("[Peringatan] Nilai penambahan kecepatan harus positif, diabaikan: " + delta);
            return;
        }
        int kecepatanBaru = kecepatanSaatIni + delta;
        kecepatanSaatIni = Math.min(kecepatanBaru, maxSpeed); // tidak boleh melebihi maxSpeed
        System.out.println(merek + " kecepatan bertambah menjadi " + kecepatanSaatIni + " km/jam");
    }
 
    // Defensive programming: validasi input + clamping agar kecepatan tidak negatif
    public void kurangiKecepatan(int delta) {
        if (delta <= 0) {
            System.out.println("[Peringatan] Nilai pengurangan kecepatan harus positif, diabaikan: " + delta);
            return;
        }
        int kecepatanBaru = kecepatanSaatIni - delta;
        kecepatanSaatIni = Math.max(kecepatanBaru, 0); // tidak boleh negatif
        System.out.println(merek + " kecepatan berkurang menjadi " + kecepatanSaatIni + " km/jam");
    }
 
    // ---------- Relasi Uses-A ----------
    // Method ini MENERIMA object SepedaMotor lain sebagai parameter untuk dibandingkan,
    // tapi TIDAK menyimpannya sebagai atribut/field. Ini murni Uses-A, bukan Has-A.
    public String bandingkanKecepatan(SepedaMotor lain) {
        if (lain == null) {
            throw new IllegalArgumentException("Motor pembanding tidak boleh null");
        }
        if (this.kecepatanSaatIni > lain.getKecepatanSaatIni()) {
            return this.merek + " lebih cepat dari " + lain.getMerek();
        } else if (this.kecepatanSaatIni < lain.getKecepatanSaatIni()) {
            return lain.getMerek() + " lebih cepat dari " + this.merek;
        } else {
            return this.merek + " dan " + lain.getMerek() + " memiliki kecepatan yang sama";
        }
    }
 
    @Override
    public String toString() {
        return "SepedaMotor{merek='" + merek + "', warna='" + warna + "', maxSpeed=" + maxSpeed
                + ", kecepatanSaatIni=" + kecepatanSaatIni + ", mesin=" + mesin + "}";
    }
}
