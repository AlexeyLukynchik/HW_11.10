package com.example.lukyn.convert;

import android.content.Intent;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.TextView;

import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Created by Алексей on 09.10.2017.
 */
public class ConvEsspressoTestTest {
    private ActivityTestRule<MainActivity> mActivity = new ActivityTestRule<>(MainActivity.class);
    private void pCheckResult(final String val){
        onView(withId(R.id.edit_text)).check(new ViewAssertion() {
            @Override
            public void check(View view, NoMatchingViewException noViewFoundException) {
                if (!((TextView) view).getText().toString().equals(val)) {
                    throw new IllegalStateException("result incorect.");
                }
            }
        });
    }

    @Test
    public void testConvertRun() {
        mActivity.launchActivity(new Intent());
        onView(withId(R.id.edit_text)).perform(typeText("1"));

        ViewInteraction mPlusButton = onView(withId(R.id.convert));
        mPlusButton.check(matches(isEnabled()));
        mPlusButton.perform(click());
        pCheckResult("3.281");







    }
}