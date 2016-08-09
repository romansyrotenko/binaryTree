package Menu;

import ReadInput.ReadInput;
import static Validator.Validator.isValidMenuItem;

public class Menu {

    private ReadInput readInput;
    public static int MENUEXITITEM = 0;
    public static int MENUMAXITEM = 2;

    public Menu(ReadInput readInput) {
        this.readInput = readInput;
    }

    public int mainMenu() {

        System.out.println("\n-----\nWelcome to BinaryTree Storage app! What do you want to do?");
        System.out.println("-----" +
                "\n1  - Add New Item" +
                "\n2  - Add Test Numbers" +
                "\n99 - Print Storage" +
                "\n0  - Exit");

        return readMenuItem();
    }

    public int readMenuItem() {

        int menuItem = readInput.readNumber("menu item");
        while (!isValidMenuItem(menuItem)) {
            menuItem = readInput.readNumber("menu item");
        }
        return menuItem;
    }

}
