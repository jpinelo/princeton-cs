/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // create tm seq of length n
        // create string seq
        String thue = "0";
        String morse = "1";
        for (int i = 0; i <= n; i++) {
            String t = thue;
            String m = morse;
            thue += m;
            morse += t;
        }
        // create matrix pattern
        for (int i = 0; i < n; i++) { // height
            for (int j = 0; j < n; j++) { // width
                if (thue.charAt(i) == thue.charAt(j)) {
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
