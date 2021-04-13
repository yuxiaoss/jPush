package com.sunday.imoccjpush;

import android.content.Context;

import cn.jpush.android.api.CustomPushNotificationBuilder;

public class MyNotification extends CustomPushNotificationBuilder {
    public MyNotification(Context context) {
        super(context, R.layout.my_notification, R.id.iv_icon, R.id.tv_title, R.id.tv_content);
    }
}
