package com.example.lukyn.convert;

import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Алексей on 09.10.2017.
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class RobolectricTest {

    private MainActivity mActivity;
    private MainActivity aController;

    @Before
    public void setup(){
        mActivity = Robolectric.setupActivity(MainActivity.class);
        assertNotNull(mActivity);
    }

    @Test
    public void testCalculaor() {
        aController = Robolectric.buildActivity(MainActivity.class).create().start().resume().visible().get();
        EditText mFirstEditText = (EditText) mActivity.findViewById(R.id.edit_text);
        assertNotNull("", mFirstEditText);

        boolean isPlusButtonEnabled = mActivity.findViewById(R.id.convert).isEnabled();
        assertEquals(isPlusButtonEnabled, true);
        assertTrue(isPlusButtonEnabled);

        TextView mResultTextView = (TextView) mActivity.findViewById(R.id.result);
        assertNotNull("", mResultTextView);
    }
}
