package PBOpertemuan6;

public class TestDeposito {
    public static void main(String[] args){
        Deposito dpt = new Deposito (1200000, 4);
        System.out.println("Saldoawal: " + dpt.getSaldo());
        System.out.println("Nilai bunga deposito: "+ dpt.getNilaiBunga ());
        System.out.println("Total deposito: "+ (dpt.getSaldo () + dpt.getNilaiBunga()));
    }
}
