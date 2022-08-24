import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int row,col;
        System.out.println("Mayin Tarllasina Hosgeeldiniz !\n" +
                "Eger -2 goruyorsaniz cevresinde mayin yoktur\n" +
                "Gordugunuz sayi kadar civarinda mayin vardir\n" +
                "Iyi Eglenceler !!! ");
        System.out.println("Lutfen Oynamak Istediginiz Boyutlari Giriniz : ");
        System.out.println("Satir Sayisi : ");
        row=inp.nextInt();
        System.out.println("Sutun Sayisi : ");
        col= inp.nextInt();;

        GameMaterials mine=new GameMaterials(row,col);
        mine.run();


    }
}