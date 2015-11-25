package com.example.navid.beatbox;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class BeatBoxActivity extends SingleFragmentActivity{


    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
