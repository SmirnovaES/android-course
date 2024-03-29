package com.example.android.weatherapp.presentation.view.splash;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.example.android.weatherapp.presentation.common.PermissionsActivity;
import com.example.android.weatherapp.presentation.view.main.MainActivity;

public class SplashActivity extends PermissionsActivity {

    private static int SPLASH_TIMER = 1500;
    private static final String TAG = SplashActivity.class.getSimpleName();
    private static final int RC_ACCESS_FINE = 123;
    private static final int RC_ACCESS_COARSE = 234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
    }

    @Override
    protected void addPermissions() {
        addPermission(Manifest.permission.ACCESS_FINE_LOCATION);
        addPermission(Manifest.permission.ACCESS_COARSE_LOCATION);
    }

    @Override
    protected void startNextActivity() {
        Log.i(TAG, "startNextActivity");
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
