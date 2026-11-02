package com.jieli.jl_audio_decode.tool;

import android.os.Handler;
import android.os.Looper;
import com.jieli.jl_audio_decode.callback.OnStateCallback;
import com.jieli.jl_audio_decode.callback.OnThreadFinishListener;
import com.jieli.jl_audio_decode.constant.ErrorCode;

/* JADX INFO: loaded from: classes17.dex */
abstract class OperationThread extends Thread {
    public static final int OP_ADD_STREAM_DATA = 3;
    public static final int OP_DECODE_FILE = 1;
    public static final int OP_ENCODE_FILE = 2;
    protected final OnStateCallback callback;
    protected final OnThreadFinishListener listener;
    protected final BaseManager manager;
    protected final Handler uiHandler;

    public OperationThread(BaseManager r2, OnStateCallback r3, OnThreadFinishListener r4) {
        this(null, r2, r3, r4);
    }

    public static /* synthetic */ void OXO1(OnStateCallback r0, int r1, String r2) {
        r0.onError(r1, r2);
    }

    public static /* synthetic */ void XIi00iiXO(OperationThread r2, OnThreadFinishListener r3) {
        r3.onThreadFinish(r2.getId());
    }

    public void callbackError(int r2) {
        callbackError(r2, ErrorCode.getErrorMsg(r2));
    }

    public void onThreadFinish() {
        final OnThreadFinishListener r0 = this.listener;
        if (r0 != null) goto L5;
        return;
    L5:
        this.uiHandler.post(new OXO1(this, r0));
    }

    public abstract int operation();

    public OperationThread(String r2, BaseManager r3, OnStateCallback r4, OnThreadFinishListener r5) {
        super(r2);
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.manager = r3;
        this.callback = r4;
        this.listener = r5;
    }

    public void callbackError(final int r4, final String r5) {
        final OnStateCallback r0 = this.callback;
        if (r0 == null) goto L6;
        this.uiHandler.post(new XIi00iiXO(r0, r4, r5));
        return;
    }
}
