package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;


public class WeatherAndForecastFragment extends Fragment {


    LinearLayout layout1;
    LinearLayout layout2;
    public WeatherAndForecastFragment(){

    }


   // @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);
        v.setBackgroundColor(Color.parseColor("#17adb0"));
        WeatherFragment  secondFragment = new WeatherFragment();
        getChildFragmentManager().beginTransaction().add(R.id.weatherAndForecastFragment, secondFragment).commit();
        layout2 = v.findViewById(R.id.weatherAndForecastFragment);

        ForecastFragment firstFragment = new ForecastFragment();
        getChildFragmentManager().beginTransaction().add(R.id.weatherAndForecastFragment, firstFragment).commit();
        layout1 = v.findViewById(R.id.weatherAndForecastFragment);



        return v;
    }



}
