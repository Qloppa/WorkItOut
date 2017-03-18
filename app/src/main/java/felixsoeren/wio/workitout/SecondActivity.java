package felixsoeren.wio.workitout;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Felix on 18.03.2017.
 */

public class SecondActivity extends Activity implements View.OnClickListener {
    private Button changeButton;
    public EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        changeButton = (Button) findViewById(R.id.activityChange2);
        changeButton.setOnClickListener(this);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);

        SharedPreferences mySharedProferences = getSharedPreferences("MySPFILE", 0);

        editText1.setText(mySharedProferences.getString("name", "Name"));
        editText2.setText(mySharedProferences.getString("vorname", "Vorname"));

    }

    @Override
    public void onClick(View v) {
        finish();
    }

    @Override
    protected void onStop() {
        super.onStop();

        SharedPreferences mySharedProferences = getSharedPreferences("MySPFILE", 0);

        SharedPreferences.Editor editor = mySharedProferences.edit();

        editor.putString("name", editText1.getText().toString());
        editor.putString("vorname", editText2.getText().toString());

        editor.commit();
    }
}
