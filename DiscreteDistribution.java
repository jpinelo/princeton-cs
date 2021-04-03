/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] n = new int[args.length - 1];
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(args[i + 1]);
        }

        int[] p = new int[n.length];
        int sum = 0;
        for (int i = 0; i < p.length; i++) {
            sum = sum + n[i];
            p[i] = sum;

        }

        for (int i = 0; i < n.length; i++) {
            System.out.print(p[i] + " ");
            //  System.out.print(n.length);
        }

        //        int max = n.length - 1;
        //        int min = 1;

        //            for (int i = 0; i < m; i++) {
        //                System.out.print(Math.round(Math.random() * (max - min + 1) + min) + " ");
        //            }
    }
}
