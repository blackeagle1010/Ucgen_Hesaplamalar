import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        int a, b, UzunKenar, KisaKenar, AlanFormul;
        double Hipotenus, c, CevreFormul;
        Scanner input = new Scanner (System.in);
        System.out.println("Kisa Kenari Giriniz:");
        KisaKenar = input.nextInt();
        System.out.println("Uzun Kenari Giriniz:");
        UzunKenar = input.nextInt();
        a = KisaKenar;
        b = UzunKenar;
        Hipotenus = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus:" + Hipotenus);
        c = Hipotenus;
        CevreFormul = a + b + c;
        System.out.println("Üçgenin Çevresi:" + CevreFormul);
        AlanFormul = a * b / 2 ;
        System.out.println("Üçgenin Alanı:" + AlanFormul);

        System.out.println("Teşekkürler");
    }
}




/*Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/