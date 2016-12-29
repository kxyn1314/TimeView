package gh.kxyn.timeview;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import gh.kxyn.TimeView;

public class MainActivity extends AppCompatActivity {
    private CountDownTimer mCountDownTimer;
    private long mStartTime;
    private TimeView mTimeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTimeView = (TimeView) findViewById(R.id.timeview);
        mStartTime = System.currentTimeMillis();
        mCountDownTimer = new CountDownTimer(Integer.MAX_VALUE, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeView.setTime((System.currentTimeMillis() - mStartTime) / 1000);
            }

            @Override
            public void onFinish() {
            }
        };
        mCountDownTimer.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mCountDownTimer.cancel();
    }
}
