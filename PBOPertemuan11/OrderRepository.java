package PBOPertemuan11;

public class OrderRepository {
    public void saveToFile(Order order) {
        System.out.println("Menyimpan data pesanan " + order.getId() + " ke dalam file txt...");
        // Logika penulisan file (FileWriter/BufferedWriter) menggunakan Java I/O
    }
}

