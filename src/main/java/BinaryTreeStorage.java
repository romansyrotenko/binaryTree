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

            } else if (menuItem == 2) {
                tree.addGroupTestItems();

            } else if (menuItem == 99) {
                System.out.println("\nPreOrderPrint");
                System.out.println(tree.toString());
                System.out.println("\nInOrderPrint");
                System.out.println(tree.toStringInOrder());
                System.out.println("\nPostOrderPrint");
                System.out.println(tree.toStringPostOrder());
                System.out.println("\nAcross");
                System.out.println(tree.toStringAcross());
            }
        }
        System.out.println("Exiting ...");
    }

}
