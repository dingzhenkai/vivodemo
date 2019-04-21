package io.appetizer.ndk_helloworld;

import android.util.Log;

public class MainActivity {

    static {
        try {
            System.loadLibrary("logloadso");
        }catch (Throwable th){
            Log.d("Tcloud","load logloadso failed");
        }
    }


    public static native void logloadso();
}
