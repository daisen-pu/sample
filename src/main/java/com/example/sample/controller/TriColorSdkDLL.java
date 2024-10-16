package com.example.sample.controller;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

public interface TriColorSdkDLL extends StdCallLibrary {
    TriColorSdkDLL INSTANCE = (TriColorSdkDLL) Native.loadLibrary("TriColorSDK", TriColorSdkDLL.class);
    int GetVersion();
}
