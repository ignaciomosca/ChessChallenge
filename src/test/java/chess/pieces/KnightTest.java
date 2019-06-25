package chess.pieces;

import com.test.chess.pieces.Knight;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ignacio on 19/08/16.
 */
public class KnightTest {

    @Test
    public void testAttack1() {
        Knight knightA = new Knight(5, 5);
        Knight knightB = new Knight(7, 6);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testAttack2() {
        Knight knightA = new Knight(5, 5);
        Knight knightB = new Knight(6,7);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testAttack3() {
        Knight knightA = new Knight(5, 5);
        Knight knightB = new Knight(4, 7);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testAttack4() {
        Knight knightA = new Knight(5, 5);
        Knight knightB = new Knight(3, 6);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testAttack5() {
        Knight knightA = new Knight(5, 5);
        Knight knightB = new Knight(3, 4);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testAttack6() {
        Knight knightA = new Knight(5, 5);
        Knight knightB = new Knight(4, 3);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testAttack7() {
        Knight knightA = new Knight(5, 5);
        Knight knightB = new Knight(7, 4);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testAttack8() {
        Knight knightA = new Knight(5, 5);
        Knight knightB = new Knight(6, 3);
        Assert.assertTrue(knightA.attacks(knightB));
    }

    @Test
    public void testDoesNotAttack() {
        Knight knightA = new Knight(1,1);
        Knight knightB = new Knight(8,8);
        Assert.assertFalse(knightA.attacks(knightB));
    }
}
