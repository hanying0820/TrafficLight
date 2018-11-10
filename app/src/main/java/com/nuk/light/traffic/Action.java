package com.nuk.light.traffic;


public class Action {                 // handler 執行的動作種類
    public static final int TEST = -1;
    public static final int SET_TRAFFIC_LIGHT = 0;
    public static final int SET_STREET = 1;
    public static final int SET_SPEED = 2;
    public static final int SET_NO_NODE = 5;
    public static final int SET_NO_GPS = 4;
    public static final int SET_NO_TRAFFIC_LIGHT = 6;
    public static final int WAITING_GPS = 7;
    public static final int SET_MAX_PROGRESS = 8;

    public static final int GET_DATA_FAIL_DIALOG = 15;
    public static final int GET_EVENT_FAIL_DIALOG = 16;

    public static final int UPDATE_NEAREST_EVENT = 17;

    public static final int HAVE_EMERGENCY = 20;
    public static final int FINISH_EMERGENCY = 21;
}