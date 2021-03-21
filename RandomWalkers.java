/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double counter = 0;
        double steps = 0;
        double prl = 0.25;
        double prm = 0.5;
        double prh = 0.75;

        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;
            int md = 0;
            while (md != r + 1) {
                double move = Math.random();
                if (move <= prl) {
                    x = x + 1;
                }
                else if (move > prl && move <= prm) {
                    x = x - 1;
                }
                else if (move > prl && move <= prh learn){
                    y = y + 1;
                }
                else{
                    y = y - 1;
                }
                md = Math.abs(x) + Math.abs(y);
                counter++;
            }
            steps = steps + counter;
        }
        double avg = (steps / trials);
        System.out.println("Average number of steps = " + avg);
    }
}
