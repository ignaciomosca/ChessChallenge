package chess.pieces;

import com.test.chess.pieces.King;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ignacio on 19/08/16.
 */
public class KingTest {

    @Test
    public void testAttack1() {
        King kingA = new King(5, 5);
        King kingB = new King(5, 6);
        Assert.assertTrue(kingA.attacks(kingB));
    }

    @Test
    public void testAttack2() {
        King kingA = new King(5, 5);
        King kingB = new King(6, 4);
        Assert.assertTrue(kingA.attacks(kingB));
    }

    @Test
    public void testAttack3() {
        King kingA = new King(5, 5);
        King kingB = new King(5, 4);
        Assert.assertTrue(kingA.attacks(kingB));
    }

    @Test
    public void testAttack4() {
        King kingA = new King(5, 5);
        King kingB = new King(4, 4);
        Assert.assertTrue(kingA.attacks(kingB));
    }

    @Test
    public void testAttack5() {
        King kingA = new King(5, 5);
        King kingB = new King(4, 5);
        Assert.assertTrue(kingA.attacks(kingB));
    }

    @Test
    public void testAttack6() {
        King kingA = new King(5, 5);
        King kingB = new King(4, 6);
        Assert.assertTrue(kingA.attacks(kingB));
    }

    @Test
    public void testAttack7() {
        King kingA = new King(5, 5);
        King kingB = new King(5, 6);
        Assert.assertTrue(kingA.attacks(kingB));
    }

    @Test
    public void testAttack8() {
        King kingA = new King(5, 5);
        King kingB = new King(6, 6);
        Assert.assertTrue(kingA.attacks(kingB));
    }

    @Test
    public void testDoesNotAttack() {
        King kingA = new King(1, 1);
        King kingB = new King(8, 8);
        Assert.assertFalse(kingA.attacks(kingB));
    }

}
