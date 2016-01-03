package net.devwiki.devlib.util;

import android.os.Build;

/**
 * Android系统工具
 * Created by Administrator on 2016/1/3 0003.
 */
public class AndroidUtil {

    /**
     * 获取系统版本名称,如:5.1.1
     * @return 版本名称
     */
    public static String getSystemVersionName(){
        return Build.VERSION.RELEASE;
    }

    /**
     * 获取系统版本号,如:22
     * @return 版本号
     */
    public static int getSystemVersionCode(){
        return Build.VERSION.SDK_INT;
    }
}
