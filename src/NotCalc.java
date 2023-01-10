import java.util.Scanner;
public class NotCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Matematik 1. sınav notunu giriniz");
        float m1 = input.nextFloat();
        System.out.println("Matematik 2. sınav notunu giriniz");
        float m2 = input.nextFloat();
        float ortM = (m1+m2)/2;

        System.out.println("Fizik 1. sınav notunu giriniz");
        float f1 = input.nextFloat();
        System.out.println("Fizik 2. sınav notunu giriniz");
        float f2 = input.nextFloat();
        float ortF = (f1+f2)/2;

        System.out.println("Kimya 1. sınav notunu giriniz");
        float k1 = input.nextFloat();
        System.out.println("Kimya 2. sınav notunu giriniz");
        float k2 = input.nextFloat();
        float ortK = (k1+k2)/2;

        System.out.println("Türkçe 1. sınav notunu giriniz");
        float t1 = input.nextFloat();
        System.out.println("Türkçe 2. sınav notunu giriniz");
        float t2 = input.nextFloat();
        float ortT = (t1+t2)/2;

        System.out.println("Tarih 1. sınav notunu giriniz");
        float tt1 = input.nextFloat();
        System.out.println("Tarih 2. sınav notunu giriniz");
        float tt2 = input.nextFloat();
        float ortTT = (tt1 + tt2)/2;

        System.out.println("Müzik 1. sınav notunu giriniz");
        float mm1 = input.nextFloat();
        System.out.println("Müzik 2. sınav notunu giriniz");
        float mm2 = input.nextFloat();
        float ortMM = (mm1 + mm2)/2;

        float ortG = (ortM+ortMM+ortF+ortK+ortTT+ortT)/6;
        boolean sonuc = ortG >= 50;
        System.out.println("notlar listeleniyor");
        System.out.println("Matematik: "+ortM);
        System.out.println("Fizik: "+ortF);
        System.out.println("Kimya: "+ortK);
        System.out.println("Türkçe: "+ortT);
        System.out.println("Tarih: "+ ortTT);
        System.out.println("Müzik: "+ortMM);
        System.out.println("Genel ortalama: "+ortG);

        String str = sonuc ? "Geçti" : "Kaldı";
        System.out.println("Geçme durumunuz : "+str);
    }
}
