abstract class Gracz {
    private String nazwa;
    private int poziom;
    private double zdrowie;

    public Gracz(String nazwa, int poziom, double zdrowie) {
        this.nazwa = nazwa;
        this.poziom = poziom;
        this.zdrowie = zdrowie;
    }

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getPoziom() {
        return poziom;
    }
    public void setPoziom(int poziom) {
        this.poziom = poziom;
    }

    public double getZdrowie() {
        return zdrowie;
    }
    public void setZdrowie(double zdrowie) {
        this.zdrowie = zdrowie;
    }

    public abstract double atak();
}
