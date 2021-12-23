package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayListExample {
    public static void main(String[] args) {
        Scanner scannerNot =new Scanner(System.in);
        Scanner scannerString =new Scanner(System.in);
        ArrayList<Integer> notlarListesi= new ArrayList<>();

        String cevap;

        do {
            System.out.println("not girin");
            int not= scannerNot.nextInt();
            notGirisi(not,notlarListesi);
            System.out.println("baska not girmek ister misiniz");
            cevap=scannerString.next();

        } while (cevap.equalsIgnoreCase("evet"));

        ortalamayiGecenlerListesi(notlarListesi);


    } public static void notGirisi(int not, ArrayList<Integer> notlarListesi) {
        notlarListesi.add(not);

    }
    public static void ortalamayiGecenlerListesi (ArrayList<Integer> notlarListesi) {
        int toplam=0;
        int ortalma=0;
        int ortalmayiGecenSayisi=0;

        for (int i = 0; i <notlarListesi.size() ; i++) {
            toplam+=notlarListesi.get(i);

        } ortalma=toplam/notlarListesi.size();

        for (int i = 0; i <notlarListesi.size() ; i++) {
            if (notlarListesi.get(i)>ortalma) {
                ortalmayiGecenSayisi++;
            }
        } System.out.println("ortalama =" +ortalma);
        System.out.println("Ortalmayi Gecen kisi Sayisi =" +ortalmayiGecenSayisi);

    }
    }

