package com.trycatch.chess.immutableutils;

import com.trycatch.chess.board.Board;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ignacio on 27/08/16.
 */
public class ImmutableUtils {

    public static List<Character> removeFirstPiece(List<Character> pieces) {
        List<Character> removedPiece = new ArrayList<>(pieces);
        removedPiece.remove(0);
        return removedPiece;
    }

    public static Set<Board> addBoardToSet(Set<Board> set, Board board) {
        Set<Board> newSet = new HashSet<>(set);
        set.add(board);
        return newSet;
    }

}
