package PBOPertemuan9;

public class TestElektronik {
    public static void main(String[] args) {
        Manusiaa indro = new Manusiaa();
        TelevisiJadul tvjadul = new TelevisiJadul();
        TelevisiModern tvmodern = new TelevisiModern();
        
        indro.nyalakanPerangkat(tvjadul);
        indro.nyalakanPerangkat(tvmodern);
    }
}
