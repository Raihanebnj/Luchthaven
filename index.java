import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Passagier {
    private String naam;
    private int leeftijd;
    private String adres;
    private int gewicht;

    public Passagier(String naam, int leeftijd, String adres, int gewicht) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.adres = adres;
        this.gewicht = gewicht;
    }
}

class Vlucht {
    private String vluchtCode;
    private String bestemming;
    private int aantalEconomyPlaatsen;
    private int aantalBusinessPlaatsen;

    public Vlucht(String vluchtCode, String bestemming, int aantalEconomyPlaatsen, int aantalBusinessPlaatsen) {
        this.vluchtCode = vluchtCode;
        this.bestemming = bestemming;
        this.aantalEconomyPlaatsen = aantalEconomyPlaatsen;
        this.aantalBusinessPlaatsen = aantalBusinessPlaatsen;
    }
}

public class index {
    private static final Scanner ob = new Scanner(System.in);
    private static final List<Passagier> passagiers = new ArrayList<Passagier>();
    private static final List<Vlucht> vlucht = new ArrayList<Vlucht>();

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
        ob.nextLine();

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
    int gewicht = 1;
    System.out.println("Naam: ");
    String naam = ob.nextLine();
    System.out.println("Leeftijd: ");
    int leeftijd = ob.nextInt();
    ob.nextLine();
    System.out.println("Adres: ");
    String adres = ob.nextLine();
    do {
        System.out.println("Gewicht: ");
         gewicht = ob.nextInt();
        ob.nextLine();
        if (gewicht > 30){
            System.out.println("Bagage is te zwaar.");
        }
    }while(gewicht > 30);


    passagiers.add(new Passagier(naam, leeftijd, adres, gewicht));
    System.out.println("Passagier is toegevoegd.");
}
private static void NieuweTicket() {

}
private static void NieuweVlucht() {
    System.out.println("Vlucht code: ");
    String vluchtCode = ob.nextLine();
    System.out.println("Bestemming: ");
    String bestemming = ob.nextLine();
    System.out.println("Aantal economy plaatsen: ");
    int aantalEconomyPlaatsen = ob.nextInt();
    System.out.println("Aantal business plaatsen: ");
    int aantalBusinessPlaatsen = ob.nextInt();
    ob.nextLine();

    vlucht.add(new Vlucht(vluchtCode, bestemming, aantalEconomyPlaatsen, aantalBusinessPlaatsen));
    System.out.println("Vlucht is toegevoegd.");
}
private static void Boarding(){

}
private static void PersoneelToewijzen() {

}
private static void VluchtPrinten() {

}
}

