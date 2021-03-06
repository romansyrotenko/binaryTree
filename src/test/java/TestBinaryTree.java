import BinaryTreeRepository.BinaryTree;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBinaryTree {

    @Test
    public void testAddItemToBinanyTree() {

        BinaryTree tree = new BinaryTree();

        tree.add(8);
        assertEquals(tree.getNode().key, 8);
    }

    @Test
    public void lessItemShouldAddToLeft() {

        BinaryTree tree = new BinaryTree();

        tree.add(8);
        tree.add(3);
        assertEquals(tree.getNode().left.key, 3);
    }

    @Test
    public void graterItemShouldAddToRight() {

        BinaryTree tree = new BinaryTree();

        tree.add(8);
        tree.add(11);
        assertEquals(tree.getNode().right.key, 11);
    }

    @Test
    public void equalItemShouldNotBeAdded() {

        BinaryTree tree = new BinaryTree();

        tree.add(8);
        tree.add(8);
        assertEquals(tree.getNode().right, null);
        assertEquals(tree.getNode().left, null);
        assertEquals(tree.getNode().key, 8);
    }

}
