package org.libregraphicsmeeting.companion;

import android.app.Application;
import android.preference.PreferenceManager;
import org.libregraphicsmeeting.companion.alarms.FosdemAlarmManager;
import org.libregraphicsmeeting.companion.db.DatabaseManager;

public class LGMApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		DatabaseManager.init(this);
		// Initialize settings
		PreferenceManager.setDefaultValues(this, org.libregraphicsmeeting.companion.R.xml.settings, false);
		// Alarms (requires settings)
		FosdemAlarmManager.init(this);
	}
}
