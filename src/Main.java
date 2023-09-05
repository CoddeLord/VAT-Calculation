import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("KDV Hesaplama Sistemine Hoş Geldiniz");

        // Ürün fiyatının alınması
        System.out.print("Ürünün Fiyatını Giriniz: ");
        double price = scanner.nextDouble();

        // KDV oranının alınması (% olarak)
        System.out.print("KDV Oranını Giriniz (% olarak): ");
        double kdvOrani = scanner.nextDouble() / 100;

        // KDV tutarının hesaplanması
        double kdvTutari = price * kdvOrani;

        // KDV dahil fiyatın hesaplanması
        double kdvDahilFiyat = price + kdvTutari;

        // Sonuçların görüntülenmesi
        System.out.println("Ürün Fiyatı: " + price + " TL");
        System.out.println("KDV Tutarı: " + kdvTutari + " TL");
        System.out.println("KDV Dahil Fiyat: " + kdvDahilFiyat + " TL");

        scanner.close();
    }
}
