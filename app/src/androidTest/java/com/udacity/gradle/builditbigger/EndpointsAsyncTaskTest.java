package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by Elshad Seyidmammadov on 11.03.2018.
 */

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    private static final String LOG_TAG = EndpointsAsyncTaskTest.class.getSimpleName();

    @Rule
    public final ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testDoInBackground() {
        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(activityTestRule.getActivity());
        try {
            result = endpointsAsyncTask.get();
            Log.d(LOG_TAG, "A non-empty string was retrieved successfully: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}
