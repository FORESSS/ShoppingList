import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        System.out.println("Вас приветствует список покупок!\n");
        while (true) {
            switch (printMenu()) {
                case "1" -> shoppingList.addProduct();
                case "2" -> shoppingList.printShoppingList();
                case "3" -> shoppingList.clearShoppingList();
                case "4" -> shoppingList.closeShoppingList();
                default -> System.out.println("Неизвестная команда!\n");
            }
        }
    }

    public static String printMenu() {
        System.out.println("Выберите одну из команд:");
        System.out.println("1. Добавить товар в список");
        System.out.println("2. Показать список");
        System.out.println("3. Очистить список");
        System.out.println("4. Завершить работу");
        return scanner.next();
    }
}