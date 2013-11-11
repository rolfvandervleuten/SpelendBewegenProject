package nl.ludus.spelendbewegen;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;

public class SBActivity extends FragmentActivity {

	
	protected void launchHomescreen() {
		Intent homescreenIntent = new Intent(this, Homescreen.class);
		startActivity(homescreenIntent);
	}
	
	protected void launchKaarten() {
		Intent kaartenIntent = new Intent(this, Kaarten.class);
		startActivity(kaartenIntent);
	}
	
	protected void launchSplashscreen() {
		Intent splashscreenIntent = new Intent(this, Splashscreen.class);
		startActivity(splashscreenIntent);
	}
}
