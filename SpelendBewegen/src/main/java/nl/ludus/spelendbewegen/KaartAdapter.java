package nl.ludus.spelendbewegen;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class KaartAdapter extends FragmentStatePagerAdapter {
    private List<KaartAchterkant> kaarten;

	public KaartAdapter(FragmentManager fm) {
		super(fm);

        kaarten = new ArrayList<KaartAchterkant>();
        for(int i = 0; i<40; i++){
            kaarten.add(new KaartAchterkant());
        }
	}

	public int getCount() {
		return 40;
	}

	public android.support.v4.app.Fragment getItem(int index) {
		return kaarten.get(index);
	}

}
