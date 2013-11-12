package nl.ludus.spelendbewegen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by rolf on 07/11/13.
 */
public class Kaart extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.kaart, container, false);

        TextView messageTextView = (TextView)v.findViewById(R.id.textView);
        messageTextView.setText("Dit is de voorkant van de kaart, hier komt de beschrijving van de activiteit, en een plaatje");

        ImageView imageView = (ImageView)v.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.splash);
        imageView.setScaleType(ImageView.ScaleType.CENTER);

        v.setOnClickListener((Kaarten)this.getActivity());

        return v;
    }
}