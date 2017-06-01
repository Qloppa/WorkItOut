package felixsoeren.wio.workitout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
/**
 * Created by Felix on 31.05.2017.
 */

public class ThirdActivity extends Activity implements View.OnClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

    }

    @Override
    public void onClick(View v) {
        finish();
        overridePendingTransition(R.anim.left_in_animation, R.anim.right_out_animation);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
