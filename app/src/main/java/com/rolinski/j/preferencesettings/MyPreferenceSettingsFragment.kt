package com.rolinski.j.preferencesettings


import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat

class MyPreferenceSettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(p0: Bundle?, p1: String?) {
        addPreferencesFromResource(R.xml.my_settings)
    }


}
