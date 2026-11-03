package PBOPertemuan9;

public class Manusiaa {
    public void nyalakanPerangkat(Televisi x){
        if (x instanceof TelevisiJadul) {
            System.out.println("Nyalakan televisi jadul dengan input: " + ((TelevisiJadul)x).modeInput);

            // Lanjutkan dengan perangkat lainnya jika diperlukan
        } else if (x instanceof TelevisiModern) {
            System.out.println("Nyalakan televisi modern dengan input: " + ((TelevisiModern)x).modeInput);
        }

        System.out.println("Voltase televisi: " + x.voltase);
    }
}
