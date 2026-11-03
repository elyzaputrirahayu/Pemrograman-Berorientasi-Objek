package PPBOPertemuan11;

    public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return this.strength;
    }

    @Override
    public void destroyed() {
        // Mengurangi kekuatan barrier sebanyak 9 poin per serangan untuk mencapai nilai 64 setelah 4 kali loop
        this.strength -= 9; 
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + this.strength + "\n";
    }
}
