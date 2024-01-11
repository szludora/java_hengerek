package model;

public class Cso extends TomorHenger{

    public double sugar;
    public double magassag;
    public double fajsuly;
    private double falvastagsag;

    public Cso(double sugar, double magassag, double falvastagsag) {
        this(sugar, magassag, 1, falvastagsag);
    }

    public Cso(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    public double terfogat() {
        return 0;
    }

    @Override
    public String toString() {
        return "Cso{" + "sugar=" + sugar + ", magassag=" + magassag + ", fajsuly=" + fajsuly + ", falvastagsag=" + falvastagsag + '}';
    }

}
