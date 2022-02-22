import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class paintColours {
    public static int getMaxColors(List<Integer> prices, int money) {
        int n = prices.size();
        int max = 0;
        ArrayList<Integer> maxs = new ArrayList<Integer>(prices.size());
        for (int e = 0; e < prices.size(); e++){
            maxs.set(e, 1);
        }
        for (int x = 0; x < n; x++) {
            for (int y = x + 1; y < n; y++) {
                max += prices.get(y);
                if (max < money) {
                    maxs.set(x, (maxs.get(x) + 1));
                }
            }
        }
        int highest = 0;
        for (Integer integer : maxs) {
            if (integer > highest) {
                highest = integer;
            }
        }
        return highest;
    }
}