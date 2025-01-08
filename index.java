import java.util.Scanner;

public class index {
public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
    index object = new index();

    int beginKeuze;

    do {
        System.out.println("Kies wat u verder wilt doen");
        System.out.println("1. Aanmaken nieuwe passagier   2. Aanmaken nieuwe ticket   3. Aanmaken nieuwe vlucht   4. Boarding   5. Personeel toewijzen   6. Vlucht printen");
        beginKeuze = ob.nextInt();
    }while (beginKeuze != 1 && beginKeuze != 2 && beginKeuze != 3 && beginKeuze != 4 && beginKeuze != 5 && beginKeuze != 6);
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
        default:
            break;
    }
}
public static void NieuwePassagier() {
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

