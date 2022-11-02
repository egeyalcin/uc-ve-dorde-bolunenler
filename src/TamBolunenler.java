import java.util.Scanner;
public class TamBolunenler {
    public static void main(String[] args) {
        int sayi,count = 0,sum = 0,average;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        sayi = inp.nextInt();
        for (int i = 0;i <sayi;i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                if (i == 0) {
                    continue;
                }
                sum += i;
                System.out.println(i +" bu sayi 3'e ve 4'e bolunur");
                count++;
            }
        }
        average = sum / count;
        System.out.println("Ortalamalari : "+ average);
    }
}