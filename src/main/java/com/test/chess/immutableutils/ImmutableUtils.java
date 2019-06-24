package com.test.chess.immutableutils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ignacio on 27/08/16.
 */
public class ImmutableUtils {

    public static List<Character> removeFirstPiece(List<Character> pieces) {
        List<Character> removedPiece = new ArrayList<>(pieces);
        removedPiece.remove(0);
        return removedPiece;
    }

}
