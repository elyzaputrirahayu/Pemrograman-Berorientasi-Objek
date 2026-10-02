package PBOPertemuan4;

public class TestLaptop {
    public static void main(String[] args) {
        Processor proc = new Processor();
        proc.setMerek("Intel Core 17");
        proc.setFrekuensi(2400);

        Laptop lap = new  Laptop();
        lap.setMerek("Asus");
        lap.setCPU(proc);

        System.out.println("Laptop Merek " + lap.getmerek());
        System.out.println("dengan processor " + lap.getCPU().getMerek());
    }
}
