package gh.kxyn.utils;

/**
 * Created by kaixuan on 16-12-29.
 */

public class TimeUtils {
    public static String unitFormat(int i) {
        String retStr = null;
        if (i >= 0 && i < 10)
            retStr = "0" + Integer.toString(i);
        else
            retStr = "" + i;
        return retStr;
    }

    public static int getHours(long timeSeconds) {
        return (int) (timeSeconds / 3600);
    }

    public static int getMinutes(long timeSeconds) {
        return (int) ((timeSeconds % 3600) / 60);
    }

    public static int getSeconds(long timeSeconds) {
        return (int) (timeSeconds % 60);
    }
}
