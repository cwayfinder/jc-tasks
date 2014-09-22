package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class BinaryTreeTest {

    @Test
    public void test() throws Exception{
        BinaryTree tree = new BinaryTree();

        /*
             a
            / \
           b   c
          / \   \
         d   e   f
         */
        Node d = new Node("d");
        Node e = new Node("e");
        Node b = new Node("b", d, e);
        Node f = new Node("f");
        Node c = new Node("c", f, null);
        Node a = new Node("a", b, c);
        tree.setRoot(a);

        assertTrue(tree.sameLevel(b, c));
        assertTrue(tree.sameLevel(d, e));
        assertTrue(tree.sameLevel(d, f));
        assertFalse(tree.sameLevel(a, b));
        assertFalse(tree.sameLevel(a, f));
        assertFalse(tree.sameLevel(d, c));
    }
}
