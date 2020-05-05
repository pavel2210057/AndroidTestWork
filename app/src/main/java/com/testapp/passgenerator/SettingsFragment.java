package com.testapp.passgenerator;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceFragmentCompat;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends PreferenceFragmentCompat {

    public SettingsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
     setPreferencesFromResource(R.xml.preferences, s);


    }

}
