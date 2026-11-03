package PPBOPertemuan11;

public class WalkingZombie extends Zombie{

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (this.level) {
            case 1:
                this.health += (int) (this.health * 0.10);
                break;
            case 2:
                this.health += (int) (this.health * 0.30);
                break;
            case 3:
                this.health += (int) (this.health * 0.40);
                break;
        }
    }

    @Override
    public void destroyed() {
        // Berkurang 2% dari health saat ini (atau berkurang 2 point per hantaman)
        this.health -= (int) (this.health * 0.02); 
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\n" +
               "Health = " + this.health + "\n" +
               "Level = " + this.level + "\n";
    }
}

