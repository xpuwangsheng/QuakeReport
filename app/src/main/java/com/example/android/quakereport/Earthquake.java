package com.example.android.quakereport;

/**
 * Created by root on 1/31/17.
 */

public class Earthquake {
    /** 地震震级 */
    private double mMagnitude;
    private String mLocation;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;
    /** 地震的网站 URL */
    private String mUrl;


    /**
     * 构造一个新的 {@link Earthquake} 对象。
     *
     * @param magnitude 表示地震的震级（大小）
     * @param location 表示地震发生的位置
     * @param timeInMilliseconds 表示地震发生时以毫秒（根据 Epoch）计的时间
     * @param url 表示用于查找关于地震的更多详细信息的网站 URL
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * 返回地震的震级。
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    /**
     * 返回地震的时间。
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    /**
     * 返回用于查找关于地震的更多信息的网站 URL。
     */
    public String getUrl() {
        return mUrl;
    }
}
