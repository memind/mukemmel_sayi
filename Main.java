import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int sayi, carpan = 0, a, toplam = 0;
        Scanner inp = new Scanner(System.in);
        boolean sonuc;
        
        System.out.print("Bir Sayı Giriniz: ");
        sayi = inp.nextInt();

        for(a = 1; a<=sayi-1; a++){
            if(sayi%a==0){
            carpan = a;
            toplam += a;
            }
        }

        sonuc = toplam == sayi;
        if(sonuc){System.out.println(sayi + " bir mükemmel sayıdır.");}
        else{System.out.println(sayi + " bir mükemmel sayı değildir.");}
    }
}