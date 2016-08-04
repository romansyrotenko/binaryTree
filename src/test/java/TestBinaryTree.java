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
    public void LessItemShouldAddToLeft() {

        BinaryTree tree = new BinaryTree();

        tree.add(8);
        tree.add(3);
        assertEquals(tree.getNode().left.key, 3);
    }

    @Test
    public void GraterItemShouldAddToRight() {

        BinaryTree tree = new BinaryTree();

        tree.add(8);
        tree.add(11);
        assertEquals(tree.getNode().right.key, 11);
    }

}
