package vn.edu.usth.weather;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;


public class ForecastFragment extends Fragment {
    LinearLayout layout;
    public ForecastFragment() {

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_forecast, container, false);

        layout = v.findViewById(R.id.forecastFragment);
        layout.setOrientation(LinearLayout.VERTICAL);



        return v;
    }




}
