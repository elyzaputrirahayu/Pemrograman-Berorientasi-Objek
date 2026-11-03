package PBOPertemuan11;

public class NotificationService {
    // Bergantung pada interface, bukan kelas konkret
    private MessageSender sender;

    // Menerima MessageSender lewat constructor (Dependency Injection)
    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    void notifyCustomer(String to, String text) {
        sender.send(to, text);
    }
}

