package felixsoeren.wio.workitout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

/**
 * Created by Felix on 18.03.2017.
 */

public class SecondActivity extends Activity implements View.OnClickListener {

    ProgressBar pgb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        pgb=(ProgressBar)findViewById(R.id.progressBar);



        Thread myThread = new Thread() {

            @Override
            public void run() {
                try {
                    for (int i = 0; i <= 100; i = i+2) {
                        pgb.setProgress(i);
                        sleep(60);
                    }
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.right_in_animation, R.anim.left_out_animation);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        myThread.start();
    }

    @Override
    public void onClick(View v) {
        finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
