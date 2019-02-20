package com.ojaexpress.ojaexpress.utils;

/**
 * Created by TerryCheerio on 11/1/17.
 */
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.ojaexpress.ojaexpress.R;


public final class OjaUtils {

    private OjaUtils() {
        // This class is not publicly instantiable
    }

    public static void openPlayStoreForApp(Context context) {
        final String appPackageName = context.getPackageName();
        try {
            context.startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse(context
                            .getResources()
                            .getString(R.string.app_market_link) + appPackageName)));
        } catch (android.content.ActivityNotFoundException e) {
            context.startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse(context
                            .getResources()
                            .getString(R.string.app_google_play_store_link) + appPackageName)));
        }
    }

}