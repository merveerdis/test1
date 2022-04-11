import java.util.Random;
import java.util.Scanner;

public class YediNisanSoru {

    public static void main(String[] args) {

        Random random = new Random();

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen urun sayisini yaziniz : ");

        int urun = scan.nextInt();

        System.out.println("Lutfen hasarli kabul edilebilir urun sayisini yaziniz : ");

        int limit = scan.nextInt();

        int[] products = new int[urun];

        for(int i = 0; i<products.length; i++){

            products[i] = random.nextInt(2);
        }
        System.out.print("[");

        for(int j = 0; j<products.length; j++){

            if(j<products.length-1){

                System.out.print(products[j] + ",");
            }
            else{
                System.out.print(products[j]);
            }
        }
        System.out.println("]");

        System.out.println("Sonuc = " + badP(products,limit));

    }
    public static boolean badP(int[] array, int x){

        int counter = 0;
        for(int i = 0; i<array.length; i++) {

            if (array[i] == 0) {

                counter++;
            }
        }

        if (counter < x) {

            return true;
        }
        else {
            return false;
        }

    }


    }

