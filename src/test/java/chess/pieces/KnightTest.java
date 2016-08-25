package chess.pieces;

import com.trycatch.chess.pieces.Knight;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ignacio on 19/08/16.
 */
public class KnightTest {

    @Test
    public void testAttack1() throws Exception {
        Knight knightA = new Knight(5, 5);
        Knight knightB = new Knight(7, 6);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testAttack2() throws Exception {
        Knight knightA = new Knight(5, 5);
        Knight knightB = new Knight(6,7);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testAttack3() throws Exception {
        Knight knightA = new Knight(5, 5);
        Knight knightB = new Knight(4, 7);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testAttack4() throws Exception {
        Knight knightA = new Knight(5, 5);
        Knight knightB = new Knight(3, 6);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testAttack5() throws Exception {
        Knight knightA = new Knight(5, 5);
        Knight knightB = new Knight(3, 4);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testAttack6() throws Exception {
        Knight knightA = new Knight(5, 5);
        Knight knightB = new Knight(4, 3);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testAttack7() throws Exception {
        Knight knightA = new Knight(5, 5);
        Knight knightB = new Knight(7, 4);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testAttack8() throws Exception {
        Knight knightA = new Knight(5, 5);
        Knight knightB = new Knight(6, 3);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testDoesNotAttack() throws Exception {
        Knight knightA = new Knight(1,1);
        Knight knightB = new Knight(8,8);
        Assert.assertFalse(knightA.attacks(knightB));
    }
}
