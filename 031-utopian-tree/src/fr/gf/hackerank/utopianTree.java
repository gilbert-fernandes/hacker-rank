package fr.gf.hackerank;

public class utopianTree {

    static int utopianTree(int n) {
        int height = 1;
        for (int i = 1; i < n + 1; i++) {
            // +1 height per cycle
            if (i % 2 == 0) {
                height += 1;
            } else {
                // double size on odd cycles
                height *= 2;
            }
        }
        return height;
    }

    public static void main(String[] args) {
        // sample input
        // 0, 1, 4
        // output
        // 1, 2, 7
        System.out.println(utopianTree(0));
        System.out.println(utopianTree(1));
        System.out.println(utopianTree(4));
    }
}
