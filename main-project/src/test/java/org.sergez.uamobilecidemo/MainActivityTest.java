package org.sergez.uamobilecidemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.sergez.uamobilecidemo.MainActivity;

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

}