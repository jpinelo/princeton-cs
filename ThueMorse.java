/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] tm = { 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0 };

        for (int i = 0; i < n; i++) { // height
            for (int j = 0; j < n; j++) { // width
                if (tm[i] == tm[j]) {
                    System.out.print("+" + "  ");
                }
                else {
                    System.out.print("-" + "  ");
                }
            }
            // after printing n elements, move to new line
            System.out.println();
        }
    }
}
