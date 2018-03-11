package com.wuriyanto.tutorial14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSubmit = (Button) findViewById(R.id.btn_submit);

        buttonSubmit.setOnClickListener(new ButtonSubmitEvent());
    }

    private class ButtonSubmitEvent implements AdapterView.OnClickListener {

        private RatingBar ratingBarMe;
        private TextView textViewResult;

        @Override
        public void onClick(View view) {

            ratingBarMe = (RatingBar) findViewById(R.id.rb_me);
            textViewResult = (TextView) findViewById(R.id.tv_result);

            ratingBarMe.setNumStars(5);
            ratingBarMe.setStepSize(0.5f);

            float rating = ratingBarMe.getRating();

            textViewResult.setText("Rating : "+rating);

        }
    }
}
