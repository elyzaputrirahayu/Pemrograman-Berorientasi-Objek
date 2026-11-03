package PBOPertemuan11;

import java.util.ArrayList;

public class NotificationService2 {
    // 1. Deklarasi field baru menggunakan ArrayList
    private ArrayList<String> sent = new ArrayList<>();

    // 2. Method log(...) yang baru tanpa takut kepenuhan (bisa bertambah otomatis)
    void log(String to, String text) {
        sent.add(to + ": " + text);
    }
}
