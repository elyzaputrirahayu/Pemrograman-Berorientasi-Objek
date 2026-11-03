package PPBOPertemuan11;

    public class Plant {
    // Method polimorfisme yang bisa menerima semua objek implementasi Destroyable
    public void doDestroy(Destroyable d) {
        d.destroyed();
    }
}

