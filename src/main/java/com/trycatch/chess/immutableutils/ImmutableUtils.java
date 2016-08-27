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

    public static List<String> removeFirstPiece(List<String> pieces) {
        List<String> removedPiece = new ArrayList<>(pieces);
        removedPiece.remove(0);
        return removedPiece;
    }

    public static Set<Board> addBoardToSet(Set<Board> set, Board board) {
        Set<Board> newSet = new HashSet<>(set);
        set.add(board);
        return newSet;
    }


    public static boolean solutionAlreadyFound(Set<Board> solutions, Board board){
        return solutions.stream().filter(b->b.equals(board)).count()!=0;
    }

}
