package pl.coderstrust.christmas;

import java.util.ArrayList;
import java.util.List;

public class Christmas {

    public static void main(String[] args) {
        int height = 5;
        List<String> christmasTree = createChristmasTree(height);
        printChristmasTree(height, christmasTree);
    }

    private static void throwExceptionIfHeightIsSmallerThanOne(int height) {
        if (height < 1) {
            throw new IllegalArgumentException("The value must be greater than 0! Provided value was: " + height);
        }
    }

    public static List<String> createChristmasTree(int height) {
        List<String> christmasTree = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            StringBuilder treeElement = new StringBuilder();
            for (int j = 0; j < (height - i); j++) {
                treeElement.append(" ");
            }
            for (int j = 1; j <= (2 * i + 1); j++) {
                treeElement.append("*");
            }
            christmasTree.add(treeElement.toString());
        }
        StringBuilder treeElement = new StringBuilder();
        for (int i = 1; i < height; i++) {
            treeElement.append(" ");
        }
        treeElement.append("**");
        christmasTree.add(treeElement.toString());
        System.out.println(christmasTree);
        return christmasTree;
    }

    public static void printChristmasTree(int height, List<String> christmasTree) {
        throwExceptionIfHeightIsSmallerThanOne(height);
        for (int i = 0; i < christmasTree.size(); i++) {
            System.out.println(christmasTree.get(i));
        }
    }
}
