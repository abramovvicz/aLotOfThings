package zadanie11; // Zadanie 1.1
import java.io.*;
public class Zadanie11
{
    public static void main(String[] args)
            throws IOException
    {
        double a, b, pole;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program oblicza pole prostokąta.");
        System.out.println("Podaj bok a.");
        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj bok b.");
        b = Double.parseDouble(br.readLine());
        pole = a*b;
        System.out.print("Pole prostokąta o boku a = " + a + " i boku b = " + b);
        System.out.println(" wynosi " + pole + ".");
    }
}