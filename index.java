import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Passagier {
    private String naam;
    private int leeftijd;
    private String adres;

    public Passagier(String naam, int leeftijd, String adres) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.adres = adres;
    }
}
public class index {
    private static final Scanner ob = new Scanner(System.in);
    private static final List<Passagier> passagiers = new ArrayList<Passagier>();
public static void main(String[] args) {
    int beginKeuze;

    do {
        System.out.println("Kies wat u verder wilt doen");
        System.out.println("1. Nieuwe passagier");
        System.out.println("2. Nieuwe ticket");
        System.out.println("3. Nieuwe vlucht");
        System.out.println("4. Boarding");
        System.out.println("5. Personeel toewijzen");
        System.out.println("6. Print vlucht");
        System.out.println("0. Stop");

        beginKeuze = ob.nextInt();

        switch (beginKeuze) {
            case 1:
                NieuwePassagier();
                break;
            case 2:
                NieuweTicket();
                break;
            case 3:
                NieuweVlucht();
                break;
            case 4:
                Boarding();
                break;
            case 5:
                PersoneelToewijzen();
                break;
            case 6:
                VluchtPrinten();
                break;
            case 0:
                System.out.println("Goodbye!");
                return;
            default:
                System.out.println("Foute input. Probeer opnieuw");
                break;
        }
    }while (beginKeuze != 1 && beginKeuze != 2 && beginKeuze != 3 && beginKeuze != 4 && beginKeuze != 5 && beginKeuze != 6);

}
private static void NieuwePassagier() {
    System.out.println("Naam: ");
    String naam = ob.nextLine();
    System.out.println("Leeftijd: ");
    int leeftijd = ob.nextInt();
    System.out.println("Adres: ");
    String adres = ob.nextLine();

    passagiers.add(new Passagier(naam, leeftijd, adres));
    System.out.println("Passagier is toegevoegd");
}
public static void NieuweTicket() {

}
public static void NieuweVlucht() {

}
public static void Boarding(){

}
public static void PersoneelToewijzen() {

}
public static void VluchtPrinten() {

}
}

