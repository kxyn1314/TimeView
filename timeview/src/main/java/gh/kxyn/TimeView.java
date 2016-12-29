package gh.kxyn;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import gh.kxyn.utils.TimeUtils;

/**
 * Created by kaixuan on 16-12-29.
 */

public class TimeView extends TextView {

    public TimeView(Context context) {
        super(context);
    }

    public TimeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setTime(long timeSeconds) {
        String hours = TimeUtils.unitFormat(TimeUtils.getHours(timeSeconds));
        String minutes = TimeUtils.unitFormat(TimeUtils.getMinutes(timeSeconds));
        String seconds = TimeUtils.unitFormat(TimeUtils.getSeconds(timeSeconds));
        String time = getResources().getString(R.string.time_txt, hours, minutes, seconds);
        this.setText(time);
    }
}

