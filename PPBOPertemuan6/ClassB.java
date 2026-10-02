package PPBOPertemuan6;

public class ClassB extends ClassA {
    public int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ() {
        System.out.println("nilai Z:"+ z);
    }

    // PERBAIKAN: Menggunakan properti x dan y melalui pewarisan langsung
    // (Jika variabel x dan y di ClassA bersifat private, ganti x dan y menjadi getX() dan getY())
    public void getJumlah() {
        System.out.println("jumlah: "+ (x + y + z)); 
    }
}

