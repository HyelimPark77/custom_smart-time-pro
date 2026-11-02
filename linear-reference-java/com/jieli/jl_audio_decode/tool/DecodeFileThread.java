package com.jieli.jl_audio_decode.tool;

import android.text.TextUtils;
import com.jieli.jl_audio_decode.callback.OnStateCallback;
import com.jieli.jl_audio_decode.callback.OnThreadFinishListener;
import com.jieli.jl_audio_decode.opus.model.OpusOption;
import java.io.File;

/* JADX INFO: loaded from: classes17.dex */
public class DecodeFileThread extends OperationThread {
    private final String inFile;
    private final OpusOption opusOption;
    private final String outFile;

    public DecodeFileThread(BaseManager r2, String r3, String r4, OpusOption r5, OnStateCallback r6, OnThreadFinishListener r7) {
        super("DecodeFileThread", r2, r6, r7);
        this.inFile = r3;
        this.outFile = r4;
        this.opusOption = r5;
    }

    @Override // com.jieli.jl_audio_decode.tool.OperationThread
    public int operation() {
        return 1;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        if (this.manager == null) goto L16;
        File r0 = new File(this.inFile);
        if (TextUtils.isEmpty(this.inFile) == false) goto L7;
    L15:
        callbackError(-1002);
    L17:
        onThreadFinish();
        return;
    L7:
        if (TextUtils.isEmpty(this.outFile) == true) goto L15;
        if (r0.exists() == false) goto L15;
        if (r0.isFile() == false) goto L15;
        int r1 = this.manager.nativeDecodeFile(this.inFile, this.outFile, this.opusOption);
        if (r1 == 0) goto L17;
        callbackError(r1);
        goto L17
    L16:
        callbackError(-1);
        goto L17
    }
}
