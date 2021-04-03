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

        //        int m = Integer.parseInt(args[0]);
        //        int n = args.length;
        //        int[] cumSum = new int[n];

        // cumsums along array
        int[] s = new int[n.length];
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            sum += n[i];
            s[i] = sum;
        }

        // read arguments from args_1 to args_n-1 and update cumulativeSum
        //        for (int i = 1; i < n; i++) {
        //            // update cumulativeSum
        //            cumSum[i] = cumSum[i - 1] + Integer.parseInt(args[i]);
        //        }

        for (int i = 0; i < m; i++) {
            // pick a random integer r uniformly between 0 and S_n
            int r = (int) (Math.random() * s[n.length - 1]);
            // initialize index k to be the middle index between 0 to n.
            int max = n.length - 1;
            int min = 0;
            int k = (n.length - 1) / 2;

            while (k != 0 && (r < s[k - 1] || r >= s[k])) {
                if (s[k - 1] > r) {
                    max = k;
                    k = (max + min) / 2;
                }
                else {
                    min = k;
                    k = (max + min) / 2;
                    if (min == k) {
                        k++;
                    }
                }
            }
            // output
            System.out.print(k + " ");
        }
    }

}
