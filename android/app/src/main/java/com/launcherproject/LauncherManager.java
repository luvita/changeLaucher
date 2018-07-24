package com.launcherproject;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by Binh on 3/3/18.
 */

public class LauncherManager extends ReactContextBaseJavaModule {
    private ReactApplicationContext context;

    public LauncherManager(ReactApplicationContext reactContext) {
        super(reactContext);
        this.context = reactContext;
    }

    @Override
    public String getName() {
        return "LauncherManagerAndroid";
    }

    @ReactMethod
    public void changeIconLauncher(String name){
        PackageManager packageManager = context.getPackageManager();
        Activity activity = getCurrentActivity();
        String packageName = activity.getComponentName().getPackageName();

        if(name.equals("") || name == null){
            Toast.makeText(context,"Can't find user !",Toast.LENGTH_LONG).show();
        }else{
            packageManager.setComponentEnabledSetting(
                    new ComponentName(packageName, packageName+"."+name),
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
        }


    }
}
