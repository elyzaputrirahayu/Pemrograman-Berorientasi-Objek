package PPBOPertemuan7;

public class Segitiga {
    private int sudut;

    // Overloading 1: Menghitung total sudut dengan 1 parameter input
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    // Overloading 2: Menghitung total sudut dengan 2 parameter input
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    // Overloading 3: Menghitung keliling segitiga sembarang (3 sisi)
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Overloading 4: Menghitung keliling (sisi miring c) segitiga siku-siku
    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }
}
