// PERCOBAAN 2

package PPBOPertemuan1;

public class RoadBike10 extends Bike10 {
    private int tireWidth;

    public void setTireWidth (int width) {
        tireWidth = width;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tire Width : " + tireWidth + " mm");
        System.out.println("Bike Type : Road Bike");
    }
}

// jawaban PERTANYAAN
// 1. Object = 
// 2. mengkarakteristikan ciri ciri bike nya
// 3. mudah dimodifikasi, tidak perlu menulis ulang
// 4. bisa
// 5. karna class bike sudah mewarisi class road bike


// Rangkuman 
// inheritence = pewarisan sifat (exends)
// behavior nya sama tapi parameter inputnya beda = overloading
// Librari = misal punya project a sama b nah itu di buat class hitung gaji yang project a 
// trs di impor di project b
// Polimorfisme = 

