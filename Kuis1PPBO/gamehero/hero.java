// Nama : Elyza Putri Rahayu
// NIM : 254107020035
// No Absen : 10
// Kelas : TI 2E


package Kuis1PPBO.gamehero;

import java.util.Random;

public class hero {
    private String nama;
    private int nyawa;
    private int energi;
    private skill[] daftarSkill; 

    private static final Random random = new Random();

    public hero(String nama, skill[] daftarSkill) {
    if (daftarSkill == null || daftarSkill.length == 0) {
        throw new IllegalArgumentException("Hero harus memiliki minimal 1 skill");
    }
    this.nama = nama;
    this.nyawa = 10;
    this.energi = 10;
    this.daftarSkill = daftarSkill;
}

    public String getNama() {
        return nama;
    }

    public int getNyawa() {
        return nyawa;
    }

    public int getEnergi() {
        return energi;
    }

    public boolean masihHidup() {
        return nyawa > 0;
    }

    public boolean gunakanSkillAcak(hero lawan) {
        if (!masihHidup() || !lawan.masihHidup()) {
            return false;
        }
        if (energi <= 0) {
            System.out.println(nama + " kehabisan energi dan tidak bisa menyerang!");
            return false;
        }

        skill skillTerpilih = daftarSkill[random.nextInt(daftarSkill.length)];

        int energiTerpakai = Math.min(skillTerpilih.getPengurangEnergi(), energi);
        this.energi -= energiTerpakai;

        int damage = Math.min(skillTerpilih.getPengurangNyawa(), lawan.nyawa);
        lawan.terimaSerangan(damage);

        System.out.println(nama + " menggunakan " + skillTerpilih.getNama() + " ke arah " + lawan.getNama()
                + " (energi " + nama + " -" + energiTerpakai + ", nyawa " + lawan.getNama() + " -" + damage + ")");
        System.out.println("   -> " + nama + " [energi: " + energi + "] | "
                + lawan.getNama() + " [nyawa: " + lawan.getNyawa() + "]");
        return true;
    }

    private void terimaSerangan(int damage) {
        this.nyawa = Math.max(0, this.nyawa - damage);
    }
}

