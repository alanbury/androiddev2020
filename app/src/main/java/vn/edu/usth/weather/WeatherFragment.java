package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;


public class WeatherFragment extends Fragment {

    LinearLayout layout;
    public WeatherFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_weather, container, false);
        v.setBackgroundColor(Color.parseColor("#ffffff"));

        layout = v.findViewById(R.id.weatherFragment);




        return v;
    }


}
