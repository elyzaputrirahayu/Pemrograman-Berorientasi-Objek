package PBOPertemuan11;

// RobotWorker hanya mengimplementasikan Workable (tidak dipaksa eat() dan sleep())
public class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Robot sedang bekerja tanpa henti...");
        // Logika kerja robot
    }
}

// HumanWorker mengimplementasikan ketiga interface secara bersamaan
class HumanWorker implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        System.out.println("Manusia sedang bekerja...");
    }

    @Override
    public void eat() {
        System.out.println("Manusia sedang makan istirahat siang...");
    }

    @Override
    public void sleep() {
        System.out.println("Manusia sedang tidur istirahat malam...");
    }
}
