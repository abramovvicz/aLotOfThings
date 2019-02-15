package execrcise_2;

public class Rower {
    public static void main(String[] args) throws Exception {
        Pojazd pojazd = new Pojazd(2,"czarny", 120 );
        System.out.println("Pojazd ma "+ pojazd.liczbaKol + " koła, " + " jest "+pojazd.kolor + " i może jechać z prędkością " + pojazd.predkosc);
    }
}
