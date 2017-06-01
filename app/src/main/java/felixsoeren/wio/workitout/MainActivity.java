package felixsoeren.wio.workitout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {

    private Button changeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overridePendingTransition(R.anim.left_in_animation, R.anim.right_out_animation);
        changeButton = (Button) findViewById(R.id.activityChange);
        changeButton.setOnClickListener(this);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        int clickedElement = v.getId();
        if (clickedElement == R.id.activityChange) {
            Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.right_in_animation, R.anim.left_out_animation);
        }
    }
}
