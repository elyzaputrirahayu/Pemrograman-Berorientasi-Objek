package PBOpertemuan6;

public class Televisi {
    public String merek;
    public int jumlahChannel;
    private int channelAktif; // private: subclass tidak bisa akses langsung

    public Televisi() {
        this.channelAktif = 1; // channel awal saat TV dibuat
    }

    // Di class diagram bernama switchChannel(newChannel), di TestTelevisi dipanggil pindahChannel()
    public void pindahChannel(int channelBaru) {
        // Guard clause: channel harus ada di antara 1 dan jumlahChannel
        if (channelBaru < 1 || channelBaru > jumlahChannel) {
            System.out.println("Channel " + channelBaru + " tidak tersedia (channel 1-" + jumlahChannel + ")");
            return;
        }
        this.channelAktif = channelBaru;
    }

    // Di class diagram bernama getActiveChannel(), di TestTelevisi dipanggil getChannelAktif()
    public int getChannelAktif() {
        return channelAktif;
    }
}
