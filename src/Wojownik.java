class Wojownik extends Gracz {
    public Wojownik(String nazwa, int poziom, double zdrowie) {
        super(nazwa, poziom, zdrowie);
    }
    @Override
    public double atak() {
        return getPoziom() * 5;
    }
}