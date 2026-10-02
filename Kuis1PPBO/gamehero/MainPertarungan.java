// Nama : Elyza Putri Rahayu
// NIM : 254107020035
// No Absen : 10
// Kelas : TI 2E

package Kuis1PPBO.gamehero;

public class MainPertarungan {
    public static void main(String[] args) {
        skill[] daftarSkill = {
                new skill("Pukul", 2, 4),
                new skill("Cubit", 3, 1),
                new skill("Tampar", 1, 3)
        };

        hero playerUtama = new hero("PlayerUtama", daftarSkill);
        hero musuh = new hero("Musuh", daftarSkill);

        System.out.println("=== PERTARUNGAN DIMULAI ===");
        System.out.println(playerUtama.getNama() + " (nyawa " + playerUtama.getNyawa() + ", energi "
                + playerUtama.getEnergi() + ") VS " + musuh.getNama() + " (nyawa " + musuh.getNyawa()
                + ", energi " + musuh.getEnergi() + ")");
        System.out.println();

        int ronde = 1;
        final int MAKS_RONDE = 100; 

        while (playerUtama.masihHidup() && musuh.masihHidup() && ronde <= MAKS_RONDE) {
            System.out.println("--- Ronde " + ronde + " ---");

            boolean seranganPlayer = playerUtama.gunakanSkillAcak(musuh);
            if (!musuh.masihHidup()) {
                break;
            }

            boolean seranganMusuh = musuh.gunakanSkillAcak(playerUtama);
            if (!playerUtama.masihHidup()) {
                break;
            }

            if (!seranganPlayer && !seranganMusuh) {
                System.out.println("Kedua Hero kehabisan energi. Pertarungan berakhir seri.");
                break;
            }

            ronde++;
            System.out.println();
        }

        System.out.println();
        System.out.println("=== PERTARUNGAN SELESAI ===");
        if (!playerUtama.masihHidup() && !musuh.masihHidup()) {
            System.out.println("Hasil: SERI! Keduanya kehabisan nyawa di saat bersamaan.");
        } else if (!musuh.masihHidup()) {
            System.out.println("PEMENANG: " + playerUtama.getNama() + "! (nyawa tersisa: "
                    + playerUtama.getNyawa() + ")");
        } else if (!playerUtama.masihHidup()) {
            System.out.println("PEMENANG: " + musuh.getNama() + "! (nyawa tersisa: " + musuh.getNyawa() + ")");
        } else {
            System.out.println("Hasil: SERI (kedua Hero kehabisan energi, tidak ada yang kalah nyawa).");
        }
    }
}