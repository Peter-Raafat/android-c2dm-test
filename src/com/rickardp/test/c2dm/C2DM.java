package com.rickardp.test.c2dm;

import com.google.android.c2dm.C2DMessaging;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class C2DM extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		String accountName = "yourgoogleaccounthere";
		
		String regId = C2DMessaging.getRegistrationId(this);
        if (regId != null && !"".equals(regId)) {
            Log.i("C2DMTest", "No registration is needed - regId: \"" + regId + "\"");
        } else {
            C2DMessaging.register(this, accountName);
        }
	}
}