package com.zqf.permissionutil;

import android.Manifest;
import android.app.Activity;
import android.os.Bundle;

import com.zqf.permissionutil.util.PermissionUtil;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PermissionUtil.addPermission(Manifest.permission.INTERNET);
        PermissionUtil.addPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE);
        PermissionUtil.checkPermission(this,100);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        PermissionUtil.handlePermissionResult(this,requestCode,permissions,grantResults);
    }
}
