import java.util.ArrayList;
import java.util.Scanner;

public class Shopp {
    public static void main(String[] args) {
        ArrayList < Integer> prices = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pricesUser = 0; 

        /*prices.add(1);
        prices.add(1);
        prices.add(1);
        prices.add(1);
        prices.add(2);*/

        System.out.println("Dime los precios: ");

        for (int i = 0; i <=4; i++) {
            pricesUser = sc.nextInt();
            prices.add(pricesUser);
        }
        System.out.println("Los precios son: " + prices);
        calculateTotal(prices);
        
        
    }

    public static Integer calculateTotal (ArrayList <Integer> prices){
        int res = 0;

        for (int num : prices) {
            res += num; 
        }
 
        System.out.println("El resultado de toda la compra es de: "+ res);

        return res; 
    }
}
