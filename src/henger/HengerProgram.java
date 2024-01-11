package henger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Henger;
import model.LyukasHenger;
import model.TomorHenger;

public class HengerProgram {

    private List<Henger> hengerek;

    public static void main(String[] args) {
        HengerProgram hengerprogram = new HengerProgram();
    }

    public HengerProgram() {
        List hengerek = new ArrayList();
        hengerek.add(new Henger(1, 2));
        hengerek.add(new TomorHenger(2, 2, 2.5));
        hengerek.add(new LyukasHenger(3, 2, 4));
        hengerek.add(new Henger(4, 2));
        this.run();
    }

    public void run() {
        System.out.println("Hengerlista: " + this.lista());

    }

    private List lista() {
        return Collections.unmodifiableList(hengerek);
    }

    public double atlagTerfogat() {
        return 0.0;
    }

    public double csovekSulya() {
        return 0.0;
    }
}
