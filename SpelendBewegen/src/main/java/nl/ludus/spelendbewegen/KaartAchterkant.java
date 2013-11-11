package nl.ludus.spelendbewegen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by rolf on 07/11/13.
 */
public class KaartAchterkant extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.kaart_achterkant, container, false);

        ImageView imageView = (ImageView)v.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.buiten);
        imageView.setScaleType(ImageView.ScaleType.CENTER);

        v.setBackgroundResource(R.drawable.achtergrond);

        v.setOnClickListener((Kaarten)this.getActivity());

        return v;
    }
}