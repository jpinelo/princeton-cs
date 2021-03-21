/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double t = 0;
        for (int i = 1; i < n + 1; i++) {
            t = t + (1 / Math.pow(i, r));
        }
        System.out.println(t);
    }
}
