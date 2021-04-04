/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        //   int[] room =
        
        // create random in range
        int max = n - 1;
        int min = 1;
        int range = max - min + 1;
        int r = (int) (Math.random() * range + min);

        System.out.println(r);
    }
}
