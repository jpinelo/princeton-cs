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

        // cumsums along array
        int[] s = new int[n.length];
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            sum += n[i];
            s[i] = sum;
        }

        for (int i = 0; i < m; i++) {
            // pick a random integer r uniformly between min and max
            int max = n.length - 1;
            int min = 0;
            int r = (int) (Math.random() * s[max] + min);

            // initialize j in the middle between 0 and n.
            int j = (n.length - 1) / 2;
            while (j != 0 && (r < s[j - 1] || r >= s[j])) {
                if (s[j - 1] > r) {
                    max = j;
                    j = (max + min) / 2;
                }
                else {
                    min = j;
                    j = (max + min) / 2;
                    if (min == j) {
                        j++;
                    }
                }
            }
            System.out.print(j + " ");
        }
    }

}
