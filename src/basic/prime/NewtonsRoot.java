package basic.prime;

public class NewtonsRoot {

    /**
     * If N is any number, then its square root can be given by the formula:
     * 0.5 * (X + (N/X))
     */
    public double findRoot(double n) {

        double l = 0.00000000001;
        double root;
        double x = n;

        while(true) {

            root = 0.5 * (x + (n/x));

            if(Math.abs(root - x) < l) {
                break;
            }

            x = root;

        }

        return root;

    }

}
