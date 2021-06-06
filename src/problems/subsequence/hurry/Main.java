package problems.subsequence.hurry;

public class Main {

    public static void main(String[] args) {

        Hurry hurry = new Hurry();
        int[][] task = {{2, 8}, {4, 5}, {5, 1}};
        int n = 3;
        int t = 16;
        System.out.println(hurry.solve(n, t, task));

    }

}
