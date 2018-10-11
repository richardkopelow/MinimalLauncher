package com.brasshatstudios.minimallauncher

import android.content.ComponentName
import android.content.Intent
import android.content.pm.ActivityInfo



/**
 * Created by richa on 10/10/2018.
 */
class AppInfo (label: CharSequence, activityInfo: ActivityInfo) {
    var label: CharSequence = label
    var activityInfo: ActivityInfo = activityInfo
    val intent: Intent
        get() {
            var component = ComponentName(activityInfo.applicationInfo.packageName,
                    activityInfo.name)
            var intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_LAUNCHER)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED
            intent.setComponent(component)

            return intent
        }
}