package PBOPertemuan9;

public class Manusia {
    public void MakanBuah(Buah x)
    {
        if(x instanceof Apel)          // jika x = Apel
        {
            System.out.println("Apel langsung dimakan");
            ((Apel)x).TampilkanBiji();
        }
        else if(x instanceof Pisang)   // jika x = Pisang
        {
            System.out.println("Pisang dikupas terlebih dahulu");
            ((Pisang)x).TampilkanKulit();
        }
        
        else if(x instanceof Durian) {
            ((Durian)x).BelahDurian();
        }      // jika x = Durian

        System.out.println("Rasanya " + x.Rasa);
        System.out.println("Kandungan air: " + x.kandunganAir);
    }
}
