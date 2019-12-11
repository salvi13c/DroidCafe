package com.example.droidcafe;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class OrderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

    }

    private static final String TAG_ACTIVITY =
            OrderActivity.class.getSimpleName();

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(),
            message,
            Toast.LENGTH_SHORT).show();
    }


    public void onRadioButtonClicked(View view) {
// Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
// Check which radio button was clicked
        switch (view.getId()) {
            case R.id.sameday:
                if
                (checked)
                    displayToast(getString(R.string.choosen) +": "+ getString(R.string.same_day_messenger_service));
                break;
            case R.id.nextday:
                if
                (checked)
                    displayToast(getString(R.string.choosen) +": "+ getString(R.string.next_day_ground_delivery));
                break;
            case R.id.pickup:
                if
                (checked)
                    displayToast(getString(R.string.choosen) +": "+ getString(R.string.pick_up));
                break;
            default:
                Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked));
                break;
        }
    }

}

