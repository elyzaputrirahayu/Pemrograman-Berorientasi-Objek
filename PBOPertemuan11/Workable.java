package PBOPertemuan11;

public interface Workable {
    void work();
}

// Interface khusus untuk entitas hidup yang butuh makan
interface Eatable {
    void eat();
}

// Interface khusus untuk entitas hidup yang butuh tidur
interface Sleepable {
    void sleep();
}
