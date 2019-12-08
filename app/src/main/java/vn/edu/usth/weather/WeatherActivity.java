package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;



public class WeatherActivity extends AppCompatActivity{
private static final String TAG = "WeatherActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        WeatherAndForecastFragment firstFragment = new WeatherAndForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();


    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: This is a log message.");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: This is a log message.");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause(): This is a log message.");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop(): This is a log message.");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy(): This is a log message.");
    }

}
