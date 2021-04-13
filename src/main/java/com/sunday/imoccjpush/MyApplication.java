package com.sunday.imoccjpush;

import android.app.Application;

import java.util.HashSet;
import java.util.Set;

import cn.jpush.android.api.JPushInterface;

public class MyApplication extends Application {

    public static int s = 1;

    @Override
    public void onCreate() {
        super.onCreate();

//        激活JPush
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);

        JPushInterface.setPushNotificationBuilder(1, new MyNotification(this));

        JPushInterface.setTags(this, MyApplication.s ++ , getTags());
    }

    private Set<String> getTags () {
        Set<String> tags = new HashSet<>();
        tags.add("Android");
        return tags;
    }

}
