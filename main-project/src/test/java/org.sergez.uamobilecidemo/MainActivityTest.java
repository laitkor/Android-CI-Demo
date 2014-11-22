package org.sergez.uamobilecidemo;

import android.widget.TextView;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.sergez.uamobilecidemo.MainActivity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Config(emulateSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

	private MainActivity activity;

	@Before
	public void setup() {
		activity = Robolectric.buildActivity(MainActivity.class).create().get();
	}

	@Test
	public void checkActivityNotNull() throws Exception {
		Assert.assertNotNull(activity);
	}

	@Test
	public void testTextContent() {
		TextView textBig = (TextView) activity.findViewById(R.id.text_hello);
		assertEquals("Hello world!", textBig.getText());
	}

}