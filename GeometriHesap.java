import javax.xml.parsers.SAXParser;
import java.util.Scanner;


public class Main {
    final static double pi = 3.14;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //kare
        System.out.print("Karenin kenar uzunlugu giriniz: ");
        double uzunluk = scan.nextDouble();
        System.out.println("Karenin alanı : " + calculateSquareArea(uzunluk));
        System.out.println("Karenin cevresi:" + calculateSquarePerimeter(uzunluk));

        //dikdörtgen
        System.out.print("\nDikdörtgenin kisa kenar uzunlugu giriniz: ");
        double kisa_kenar = scan.nextDouble();
        System.out.print("Dikdörtgenin uzun kenarini giriniz: ");
        double uzun_kenar = scan.nextDouble();

        System.out.println("Dikdörtgenvalani:" + calculateRectangleArea(kisa_kenar,uzun_kenar));
        System.out.println("Dikdörtgen cevre: " + calculateRectanglePerimeter(uzun_kenar, kisa_kenar));

        //daire
        System.out.print("\nDairenin yaricapini giriniz: ");
        double radius = 3.4;

        System.out.println("Daire alanı: " + calculateCircleArea(radius));
        System.out.println("Daire cevresi: " + calculateCircleCircumference(radius));

        //ucgen
        System.out.println("\nÜçgen bilgilerini giriniz: ");
        System.out.print("Taban uzunlugu giriniz: ");
        double base = scan.nextDouble();
        System.out.print("Yukseklik: ");
        double height = scan.nextDouble();
        System.out.print("1. kenar (a):");
        double a = scan.nextDouble();
        System.out.print("2. kenar (b):");
        double b = scan.nextDouble();
        System.out.print("3. kenar (c):");
        double c = scan.nextDouble();

        System.out.println("Üçgen alani: "+ calculateTriangleArea(base,height));
        System.out.println("Üçgen cevresi: " + calculateTrianglePerimeter(a,b,c));

        scan.close();
    }

    //kare alan
    public static double calculateSquareArea(double kenar_kenaruzunlugu) {
        double alan = Math.pow(kenar_kenaruzunlugu, 2);
        return alan;
    }
    //kare cevre
    public static double calculateSquarePerimeter(double x) {
        return 4 * x;
    }

    //dikdörtgen alan
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    //dikdörtgen cevre
    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    //daire alan
    public static double calculateCircleArea(double radius) {
        return pi * Math.pow(radius, 2);
    }

    //daire cevre
    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    //ucgen alan
    public static double calculateTriangleArea(double base, double height) {
        return base * height / 2.0;
    }

    //ucgen cevre
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }
}
