package PPBOPertemuan11;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (this.level) {
            case 1:
                this.health += (int) (this.health * 0.30);
                break;
            case 2:
                this.health += (int) (this.health * 0.40);
                break;
            case 3:
                this.health += (int) (this.health * 0.50);
                break;
        }
    }

    @Override
    public void destroyed() {
        // Berkurang 1% dari health saat ini (atau berkurang 1 point per hantaman)
        this.health -= (int) (this.health * 0.01);
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data =\n" +
               "Health = " + this.health + "\n" +
               "Level = " + this.level + "\n";
    }
}
