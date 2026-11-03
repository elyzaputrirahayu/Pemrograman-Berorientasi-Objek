package PBOPertemuan11;

// 1. Interface MessageSender sebagai abstraksi
interface MessageSender {
    void send(String to, String text);
}

// 2. Kelas EmailSender yang mengimplementasikan MessageSender
class EmailSender implements MessageSender {
    @Override
    public void send(String to, String text) {
        System.out.println("Mengirim Email ke " + to + " dengan isi: " + text);
    }
}

// 3. Kelas WhatsAppSender yang mengimplementasikan MessageSender
class WhatsAppSender implements MessageSender {
    @Override
    public void send(String to, String text) {
        System.out.println("Mengirim WhatsApp ke " + to + " dengan isi: " + text);
    }
}
