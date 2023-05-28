class Mag extends Gracz {
    public Mag(String nazwa, int poziom, double zdrowie) {
        super(nazwa, poziom, zdrowie);
    }
    @Override
    public double atak() {
        return getPoziom() * 7;
    }
}