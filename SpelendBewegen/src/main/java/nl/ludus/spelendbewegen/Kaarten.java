package nl.ludus.spelendbewegen;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;

public final class Kaarten extends SBActivity implements View.OnClickListener {
	
	private ViewPager gallery;
	private KaartAdapter adapter;
    private boolean mShowingBack = true;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kaarten);

		
		gallery = (ViewPager) findViewById(R.id.viewpager1);
		adapter = new KaartAdapter(this.getSupportFragmentManager());

		gallery.setAdapter(adapter);
	}

    @Override
    public void onClick(View view) {




        if (!mShowingBack) {
            getSupportFragmentManager().popBackStack();
            mShowingBack = true;
            return;
        }


       mShowingBack = false;


       getSupportFragmentManager()
                .beginTransaction()

              .setCustomAnimations(
                        R.anim.rotate_right_in,
                        R.anim.rotate_right_out,
                        R.anim.rotate_left_in,
                        R.anim.rotate_left_out)

               .replace(R.id.kaarten, new Kaart())

                .addToBackStack(null)

                .commit();
               // TextView messageTextView = (TextView)view.findViewById(R.id.textView);
               // messageTextView.setText("HALLLLOOOOO!!!!!");
    }
}
