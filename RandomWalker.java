/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int md = 0;
        int counter = 0;
        double prl = 0.25;
        double prm = 0.5;
        double prh = 0.75;

        while (md != r + 1) {
            System.out.println("(" + x + "," + y + ")");
            double move = Math.random();
            if (move <= prl) {
                x = x + 1;
            }
            else if (move > prl && move <= prm) {
                x = x - 1;
            }
            else if (move > prm && move <= prh) {
                y = y + 1;
            }
            else {
                y = y - 1;
            }
            md = Math.abs(x) + Math.abs(y);
            counter++;
        }
        System.out.println("Steps = " + (counter - 1));
    }
}
