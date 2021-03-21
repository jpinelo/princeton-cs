/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);
        // convert to RGB
        double w = 1 - k;
        double ra = 255 * w * (1 - c);
        double ga = 255 * w * (1 - m);
        double ba = 255 * w * (1 - y);
        int r = (char) Math.round(ra);
        int g = (char) Math.round(ga);
        int b = (char) Math.round(ba);

        // print result
        System.out.println(String.format("%-6s= %s", "Red", r));
        System.out.println(String.format("%-6s= %s", "Green", g));
        System.out.println(String.format("%-6s= %s", "Blue", b));
    }
}



