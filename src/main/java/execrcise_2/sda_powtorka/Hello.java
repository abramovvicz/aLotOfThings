package execrcise_2.sda_powtorka;

public class Hello {

    static {
        System.out.println("to pierwsze się wywoła, pole statyczne");
    }

    {
        System.out.println("to drugie się wywoła " + "pole dynamiczne");
    }

    public Hello() {

        System.out.println("konstruktor");

    }

    public static void main(String[] args) {

        System.out.println("Hello, world");

        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("muszą być podane 2 argumenty");
        } catch (NumberFormatException e) {
            System.out.println("musisz podać liczby nie stringi");

        }
        Hello hello = new Hello();
        hello.dodaj(a, b);
        System.out.println(hello.dodaj(a, b));
    }

    public String dodaj(int a, int b) {
        return a + b + "";
    }
}

