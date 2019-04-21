package com.vivo.security.jni;

import android.util.Log;

public class SecurityCryptor {
    public static native byte[] nativeBase64Decrypt(byte[] bArr);

    public static native byte[] nativeBase64Encrypt(byte[] bArr);

    public static native boolean nativeCheckSignatures();


    static {
        try {
            System.loadLibrary("vivosgmain");
        } catch (Throwable th) {
            Log.d("Tcloud","load vivosgmain failed");
        }
    }


}
