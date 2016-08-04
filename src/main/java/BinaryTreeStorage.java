import BinaryTreeRepository.BinaryTree;
import Menu.Menu;
import ReadInput.ReadInput;

public class BinaryTreeStorage {

    public static void main(String args[]) {

        BinaryTree tree = new BinaryTree();
        ReadInput readInput = new ReadInput();
        Menu menu = new Menu(readInput);
        int menuItem = -1;

        while (menuItem != Menu.MENUEXITITEM) {
            menuItem = menu.mainMenu();
            if (menuItem == 1) {
                tree.add(readInput.readNumber("Item"));

            } else if (menuItem == 99) {
                System.out.println(tree.toString());
            }
        }
        System.out.println("Exiting ...");
    }

}
