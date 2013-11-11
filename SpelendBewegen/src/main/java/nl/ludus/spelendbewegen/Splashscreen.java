package nl.ludus.spelendbewegen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Splashscreen extends SBActivity {

	private Button startButton;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

		// Obtain handles to UI objects
		startButton = (Button) findViewById(R.id.startButton);

		startButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				launchHomescreen();
			}
		});
	}
}