package lk.codehive.ravishka.activity.log;

import android.content.Context;
import android.util.Log;

public class LogWriter {
    public static void writeInfoLog(Context context, String message){
        Log.i(context.getClass().getSimpleName(), message);
    }
}
