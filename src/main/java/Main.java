/**
 * Created by hewei on 17-1-29.
 */
public class Main {
    public static void main(String[] args) {
        //new ShuDu().test();
        int[] data = new int[] {
                0, 5, 2, 4, 0, 0, 1, 0, 0,
                1, 0, 0, 0, 0, 2, 0, 3, 0,
                0, 0, 0, 8, 1, 3, 0, 2, 5,
                4, 0, 0, 0, 0, 7, 0, 1, 0,
                6, 8, 3, 0, 0, 0, 5, 9, 7,
                0, 7, 0, 5, 0, 0, 0, 0, 2,
                8, 9, 0, 3, 6, 5, 0, 0, 0,
                0, 1, 0, 7, 0, 0, 0, 0, 6,
                0, 0, 6, 0, 0, 4, 9, 7, 0
        };

        int[] data2 = new int[] {
                0, 6, 0, 0, 9, 0, 3, 8, 0,
                0, 0, 9, 0, 8, 0, 4, 0, 5,
                0, 5, 0, 3, 0, 0, 1, 0, 6,
                0, 0, 1, 0, 0, 8, 2, 0, 0,
                0, 2, 0, 9, 0, 4, 0, 1, 0,
                0, 0, 4, 2, 0, 0, 9, 0, 0,
                9, 0, 7, 0, 0, 6, 0, 3, 0,
                3, 0, 5, 0, 7, 0, 6, 0, 0,
                0, 4, 6, 0, 5, 0, 0, 7, 0
        };

        new ShuDu().start(data2);
    }
}