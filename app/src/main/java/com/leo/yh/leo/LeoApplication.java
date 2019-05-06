package com.leo.yh.leo;

import android.app.Application;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

/**
 * desc
 *
 * @author YH
 * @date 2019/4/18
 * @desc
 */
public class LeoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initLogger();
    }

    private void initLogger() {
        Logger.init().logLevel(LogLevel.FULL).methodCount(3).isShowThreadInfo();
    }
}
