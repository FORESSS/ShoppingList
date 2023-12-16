import java.util.Arrays;
import java.util.Scanner;

public class ShoppingList {
    Scanner scanner = new Scanner(System.in);
    public int index = 5;
    public int productCount = 0;
    public String[] shoppingList = new String[index];

    public void addProduct() {
        System.out.println("Введите продукт: ");
        String product = scanner.next();
        if (Arrays.asList(shoppingList).contains(product)) {
            System.out.println("Этот продукт уже есть в списке!\n");
        } else {
            if (shoppingList[productCount] == null) {
                System.out.println("Продукт успешно добавлен!\n");
                shoppingList[productCount] = product;
                productCount++;
                increaseShoppingList();
            }
        }
    }

    public void printShoppingList() {
        if (shoppingList[0] == null) {
            System.out.println("Список пуст!\n");
            return;
        }
        System.out.println("Ваш список продуктов:");
        for (int i = 0; i < shoppingList.length; i++) {
            if (shoppingList[i] != null) {
                System.out.println((i + 1) + ". " + shoppingList[i]);
            }
        }
        System.out.println();
    }

    public void clearShoppingList() {
        System.out.println("Список очищен!\n");
        index = 5;
        this.shoppingList = new String[index];
        productCount = 0;
    }

    public void closeShoppingList() {
        System.out.println("Программа завершена");
        System.exit(0);
    }

    public void increaseShoppingList() {
        if (productCount == shoppingList.length) {
            String[] tmpArr = new String[index];
            for (int i = 0; i < tmpArr.length; i++) {
                tmpArr[i] = shoppingList[i];
            }
            index += 5;
            this.shoppingList = new String[index];
            for (int i = 0; i < tmpArr.length; i++) {
                shoppingList[i] = tmpArr[i];
            }
        }
    }
}