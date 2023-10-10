package TemelKavramlar;

import java.util.Scanner;

public class VücutKitleEndeksi {
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        double boy ,endeks;
        int kilo;

        // Kullanıcıdan boy ve kilo bilgisini alalım
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextInt();

        //Formüller

        endeks = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + endeks);

    }
}
