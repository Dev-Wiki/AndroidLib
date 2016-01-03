package net.devwiki.devlib.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * 屏幕工具
 * Created by Administrator on 2016/1/3 0003.
 */
public class DisplayUtil {

    private DisplayUtil(){}

    /**
     * 获取屏幕宽度
     * @param activity 显示的界面
     * @return 屏幕宽度,单位:px
     */
    public static int getScreenWidth(Activity activity){
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }

    /**
     * 获取屏幕宽度
     * @param activity 显示的界面
     * @return 屏幕宽度,单位:dp
     */
    public static int getScreenWidthInDp(Activity activity){
        return px2dp(getScreenWidth(activity));
    }

    /**
     * 获取屏幕高度
     * @param activity 显示的界面
     * @return 屏幕的高度,单位:px
     */
    public static int getScreenHeight(Activity activity){
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.heightPixels;
    }

    /**
     * 获取屏幕高度
     * @param activity 显示的界面
     * @return 屏幕宽度,单位:dp
     */
    public static int getScreenHeightInDp(Activity activity){
        return px2dp(getScreenHeight(activity));
    }

    /**
     * dp转px
     * @param context 上下文
     * @param dpValue dp值
     * @return px值
     */
    public static int dp2px(Context context,float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dpValue *scale + 0.5f);
    }

    /**
     * dp转px
     * @param dpValue dp值
     * @return px值
     */
    public static int dp2px(float dpValue) {
        float scale = Resources.getSystem().getDisplayMetrics().density;
        return (int)(dpValue *scale + 0.5f);
    }

    /**
     * px转dp
     * @param context 上下文
     * @param pxValue px值
     * @return dp值
     */
    public static int px2dp(Context context,float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * px转dp
     * @param pxValue px值
     * @return dp值
     */
    public static int px2dp(float pxValue) {
        final float scale = Resources.getSystem().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
