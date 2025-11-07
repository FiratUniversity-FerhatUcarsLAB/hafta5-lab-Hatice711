import java.util.Scanner;

public class ETicaretCalculator {

    // Sabitler
    final static double VAT_RATE = 0.18;
    final static double SHIPPING_FEE = 29.99;

    // 1) Ürün satış toplamı = fiyat x adet
    public static double productTotal(double price, int quantity) {
        return price * quantity;
    }

    // 2) Ara toplam (3 ürünün toplamı)
    public static double subTotal(double t1, double t2, double t3) {
        return t1 + t2 + t3;
    }

    // 3) İndirim Tutarı = Ara toplam x (indirim % / 100)
    public static double discountAmount(double subTotal, double discountRate) {
        return subTotal * (discountRate / 100);
    }

    // 4) İndirimli Toplam = Ara Toplam - İndirim Tutarı
    public static double discountedTotal(double subTotal, double discountAmount) {
        return subTotal - discountAmount;
    }

    // KDV Tutarı = İndirimli Toplam x VAT_RATE
    public static double vatAmount(double discountedTotal) {
        return discountedTotal * VAT_RATE;
    }

    // 6) Genel Toplam = İndirimli Toplam + KDV + Kargo
    public static double finalTotal(double discountedTotal, double vatAmount) {
        return discountedTotal + vatAmount + SHIPPING_FEE;
    }

    // Kullanıcıdan veri alan MAIN metodu
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("=== E-Ticaret Sepet Hesaplayıcı ===");

        // ÜRÜN 1
        System.out.print("Ürün 1 fiyat: ");
        double price1 = input.nextDouble();
        System.out.print("Ürün 1 adet:" );
        int qty1 = input.nextInt();

        // ÜRÜN 2
        System.out.print("Ürün 2 fiyat: ");
        double price2 = input.nextDouble();
        System.out.print("Ürün 2 adet:" );
        int qty2 = input.nextInt();

        // ÜRÜN 3
        System.out.print("Ürün 3 fiyat: ");
        double price3 = input.nextDouble();
        System.out.print("Ürün 3 adet: ");
        int qty3 = input.nextInt();

        // İndirim oranı
        System.out.print("İndirim yüzdesi (%): ");
        double discountRate = input.nextDouble();

        // Hesaplamalar
        double urun1 = productTotal(price1, qty1);
        double urun2 = productTotal(price2, qty2);
        double urun3 = productTotal(price3, qty3);

        double araToplam = subTotal(urun1, urun2, urun3);
        double indirim = discountAmount(araToplam, discountRate);
        double indirimliToplam = discountedTotal(araToplam, indirim);
        double kdv = vatAmount(indirimliToplam);
        double genelToplam = finalTotal(indirimliToplam, kdv);

        // SONUÇLAR
        System.out.println("\n=== Hesaplama Sonuçları ===");
        System.out.println("Ürün 1 Toplam: " + urun1 + "TL");
        System.out.println("Ürün 2 Toplam: " + urun2 + "TL");
        System.out.println("Ürün 3 Toplam: " + urun3 + "TL");

        System.out.println("Ara Toplam: " + araToplam + "TL");
        System.out.println("Indirim: - " + indirim + "TL");
        System.out.println("Indirimli Toplam:  " + indirimliToplam + "TL");
        System.out.println("Kdv: + " + kdv + "TL");
        System.out.println("Kargo: + " + SHIPPING_FEE + "TL");

        System.out.println("Genel Toplam: " + genelToplam + "TL");
    }
}
