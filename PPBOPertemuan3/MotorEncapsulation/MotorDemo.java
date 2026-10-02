package PPBOPertemuan3.MotorEncapsulation;

public interface MotorDemo {
    public static void main(String[] args) {
    motor motor = new motor();
    motor.printStatus();
    motor.tambahKecepatan();

    motor.nyalakanMesin();
    motor.printStatus();

    motor.tambahKecepatan();
    motor.printStatus();

    motor.tambahKecepatan();
    motor.printStatus();

    motor.tambahKecepatan();
    motor.printStatus();

    motor.matikanMesin();
    motor.printStatus();
    }
}
