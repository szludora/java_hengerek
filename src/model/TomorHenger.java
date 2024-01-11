package model;

public class TomorHenger extends Henger {

    private double fajsuly;

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag, 1);
    }

    public double getFajsuly() {
        return this.fajsuly;
    }
    
    public double suly(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "TomorHenger{" + "fajsuly=" + fajsuly + super.getSugar() + super.getMagassag() + '}';
    }
}
