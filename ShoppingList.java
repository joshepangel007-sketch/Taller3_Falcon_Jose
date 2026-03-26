
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        Scanner sc = new Scanner(System.in); 

        String productUser = "";  
        String productRemove = ""; 
        boolean search = false;
        String searchProduct = "";

        for (int i = 0; i <=4; i++) {
            System.out.println("Dime el nombre del elemento que deseas agregar: ");
            productUser = sc.nextLine(); 
            shoppingList.add(productUser);
        }

        System.out.println("Tus productos son: " + shoppingList);

        System.out.println("Dime el nommbre de el producto que deseas eliminar: ");
        productRemove = sc.nextLine(); 
        shoppingList.remove(productRemove);

        System.out.println("Tu lista actual es de: " + shoppingList);

        System.out.println("Dime el nombre de el prooducto a buscar");
        searchProduct = sc.nextLine();

        for (String item : shoppingList) {
            if (item.equals(searchProduct)) {
                System.out.println("Producto existente en la lista");
                search = true;
                break;
            }
        }

        if (!search) {
            System.out.println("el producto  no existe");
        }
    }    
}
