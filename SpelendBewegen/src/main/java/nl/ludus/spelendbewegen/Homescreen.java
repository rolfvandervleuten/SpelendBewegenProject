package nl.ludus.spelendbewegen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public final class Homescreen extends SBActivity {

	private ImageButton thuisButton;
	private Button homeButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.themaselectie);

		thuisButton = (ImageButton) findViewById(R.id.thuisButton);
		homeButton = (Button) findViewById(R.id.homeButton);

		thuisButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				launchKaarten();
			}
		});
		
		homeButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				launchSplashscreen();
			}
		});
	}
}
