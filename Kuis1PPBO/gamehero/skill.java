// Nama : Elyza Putri Rahayu
// NIM : 254107020035
// No Absen : 10
// Kelas : TI 2E

package Kuis1PPBO.gamehero;

public class skill {
    private String nama;
    private int pengurangEnergi;
    private int pengurangNyawa;

    public skill(String nama, int pengurangEnergi, int pengurangNyawa) {
        if (pengurangEnergi == pengurangNyawa) {
            throw new IllegalArgumentException(
                    "Skill " + nama + ": pengurangan energi dan nyawa tidak boleh sama");
        }
        if (Math.abs(pengurangEnergi - pengurangNyawa) > 2) {
            throw new IllegalArgumentException(
                    "Skill " + nama + ": selisih pengurangan energi dan nyawa maksimal 2 poin");
        }
        this.nama = nama;
        this.pengurangEnergi = pengurangEnergi;
        this.pengurangNyawa = pengurangNyawa;
    }

    public String getNama() {
        return nama;
    }

    public int getPengurangEnergi() {
        return pengurangEnergi;
    }

    public int getPengurangNyawa() {
        return pengurangNyawa;
    }
}
