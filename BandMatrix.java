/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        
        for (int i = 0; i < n; i++) { // height
            for (int j = 0; j < n; j++) { // width
                if (j < i - width || j > i + width) {
                    System.out.print(0 + "  ");
                }
                else {
                    System.out.print("*" + "  ");
                }
            }
            // after printing n elements, move to new line
            System.out.println();
        }
    }
}
