package com.test.chess.immutableutils;

import com.test.chess.pieces.ChessPiece;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by ignacio on 27/08/16.
 */
public class ImmutableUtils {

    public static List<Character> removeFirstPiece(List<Character> pieces) {
        List<Character> removedPiece = new ArrayList<>(pieces);
        removedPiece.remove(0);
        return removedPiece;
    }

    public static Stack<ChessPiece> addAllPieces(List<ChessPiece> chessPieces){
        Stack<ChessPiece> stack = new Stack<>();
        stack.addAll(chessPieces);
        return stack;
    }

}
