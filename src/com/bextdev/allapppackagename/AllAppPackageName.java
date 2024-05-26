package com.bextdev.allapppackagename;

import java.util.ArrayList;
import java.util.List;
import com.google.appinventor.components.runtime.util.YailList;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

public class AllAppPackageName {
    private Context context;

    public AllAppPackageName(Context context) {
        this.context = context;
    }

    public YailList getPackageName() {
        PackageManager packageManager = context.getPackageManager();
        List<ApplicationInfo> appsInfo = packageManager.getInstalledApplications(PackageManager.GET_META_DATA);
        List<String> packageNameList = new ArrayList<>();

        for (ApplicationInfo appInfo : appsInfo) {
            packageNameList.add(appInfo.packageName);
        }

        return YailList.makeList(packageNameList);
    }
}
