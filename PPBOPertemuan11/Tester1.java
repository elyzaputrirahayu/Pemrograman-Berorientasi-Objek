package PPBOPertemuan11;

public class Tester1 {
    public static void main(String[] args) {
    PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
    InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
    ElectricityBill eBill = new ElectricityBill(5, "R-1"); // Sudah diubah ke R-1
    Employee e;
    Payable p;
    
    e = pEmp;
    e = iEmp;
    p = pEmp;
    p = eBill;

    System.out.println("--- Informasi Karyawan Permanen (via e) ---");
    e = pEmp;
    System.out.println(e.getEmployeeInfo());

    System.out.println("--- Informasi Magang (via e) ---");
    e = iEmp;
    System.out.println(e.getEmployeeInfo());

    System.out.println("--- Jumlah Pembayaran Gaji (via p) ---");
    p = pEmp;
    System.out.println("Pembayaran: " + p.getPaymentAmount());

    System.out.println("\n--- Jumlah Pembayaran Listrik (via p) ---");
    p = eBill;
    System.out.println("Pembayaran Listrik: " + p.getPaymentAmount());
    }

}

