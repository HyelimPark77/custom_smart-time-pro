package com.jieli.jl_audio_decode.speex;

import com.android.mltcode.paycertificationapi.jr4;
import com.android.mltcode.paycertificationapi.kr4;
import com.android.mltcode.paycertificationapi.lr4;
import com.jieli.jl_audio_decode.callback.OnDecodeStreamCallback;
import com.jieli.jl_audio_decode.callback.OnStateCallback;
import com.jieli.jl_audio_decode.constant.DecodeConstant;
import com.jieli.jl_audio_decode.exceptions.SpeexException;
import com.jieli.jl_audio_decode.opus.model.OpusOption;
import com.jieli.jl_audio_decode.tool.AddStreamDataThread;
import com.jieli.jl_audio_decode.tool.BaseManager;
import com.jieli.jl_audio_decode.tool.DecodeFileThread;
import com.jieli.jl_audio_decode.tool.EncodeFileThread;

/* JADX INFO: loaded from: classes17.dex */
public class SpeexManager extends BaseManager {
    private static final String TAG = "SpeexManager";
    private AddStreamDataThread mAddStreamDataThread;
    private volatile OnStateCallback mDecodeFileCallback;
    private DecodeFileThread mDecodeFileThread;
    private volatile OnDecodeStreamCallback mDecodeStreamCallback;
    private volatile OnStateCallback mEncodeFileCallback;
    private EncodeFileThread mEncodeFileThread;
    private volatile long managerAddr;

    static {
        System.loadLibrary(DecodeConstant.JL_SPEEX_LIB);     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        e.printStackTrace();
    }

    public SpeexManager() throws SpeexException {
        this.managerAddr = initNativeID();
        if (this.managerAddr == 0) goto L6;
        return;
    L6:
        throw new SpeexException("Can not load jl_speex lib");
    }

    public static /* synthetic */ void OXO1(SpeexManager r2, long r3) {
        EncodeFileThread r0 = r2.mEncodeFileThread;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getId() != r3) goto L9;
        r2.mEncodeFileThread = null;
        r2.setEncodeFileCallback(null);
        return;
    }

    public static /* synthetic */ void XIi00iiXO(SpeexManager r2, long r3) {
        DecodeFileThread r0 = r2.mDecodeFileThread;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getId() != r3) goto L9;
        r2.mDecodeFileCallback = null;
        r2.setDecodeFileCallback(null);
        return;
    }

    private void addStreamData(byte[] r5) {
        if (r5 != null) goto L4;
        return;
    L4:
        if (this.mAddStreamDataThread != null) goto L6;
        AddStreamDataThread r0 = new AddStreamDataThread(this, 1, this.mDecodeStreamCallback, new kr4(this));
        this.mAddStreamDataThread = r0;
        r0.start();
    L6:
        this.mAddStreamDataThread.addStreamData(r5);
    }

    private native int decodeAudioFile(String r1, String r2, long r3);

    private native void decodeAudioStream(int r1, long r2);

    private native int encodeAudioFile(String r1, String r2, long r3);

    private native int getAudioStreamState(long r1);

    public static /* synthetic */ void iO(SpeexManager r2, long r3) {
        AddStreamDataThread r0 = r2.mAddStreamDataThread;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getId() != r3) goto L9;
        r2.mAddStreamDataThread = null;
        r2.setDecodeStreamCallback(null);
        return;
    }

    private native long initNativeID();

    private native int nativeDestroy(long r1);

    private native boolean saveAudioStream(byte[] r1, long r2);

    private void startDecodeFileThread(String r9, String r10) {
        if (this.mDecodeFileThread != null) goto L7;
        DecodeFileThread r1 = new DecodeFileThread(this, r9, r10, new OpusOption(), this.mDecodeFileCallback, new lr4(this));
        this.mDecodeFileThread = r1;
        r1.start();
        return;
    }

    private void startEncodeFileThread(String r9, String r10) {
        if (this.mEncodeFileThread != null) goto L7;
        EncodeFileThread r1 = new EncodeFileThread(this, r9, r10, new OpusOption(), this.mEncodeFileCallback, new jr4(this));
        this.mEncodeFileThread = r1;
        r1.start();
        return;
    }

    private void stopAddDataThread() {
        AddStreamDataThread r0 = this.mAddStreamDataThread;
        if (r0 == null) goto L6;
        r0.stopThread();
        this.mAddStreamDataThread = null;
        return;
    }

    private void stopDecodeFileThread() {
        DecodeFileThread r0 = this.mDecodeFileThread;
        if (r0 == null) goto L6;
        r0.interrupt();
        this.mDecodeFileThread = null;
        return;
    }

    private void stopEncodeFileThread() {
        EncodeFileThread r0 = this.mEncodeFileThread;
        if (r0 == null) goto L6;
        r0.interrupt();
        this.mEncodeFileThread = null;
        return;
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void decodeFile(String r2, String r3, OnStateCallback r4) {
        if (this.mDecodeFileThread != null) goto L6;
        setDecodeFileCallback(r4);
        startDecodeFileThread(r2, r3);
        return;
    L6:
        if (r4 == null) goto L9;
        r4.onError(-1003, "In process, please wait.");
        return;
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void encodeFile(String r2, String r3, OnStateCallback r4) {
        if (this.mEncodeFileThread != null) goto L6;
        setEncodeFileCallback(r4);
        startEncodeFileThread(r2, r3);
        return;
    L6:
        if (r4 == null) goto L9;
        r4.onError(-1003, "In process, please wait.");
        return;
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public boolean isDecodeStream() {
        if (getAudioStreamState(this.managerAddr) != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public boolean nativeAddAudioStream(int r5, byte[] r6) {
        if (this.managerAddr != 0) goto L7;
        return false;
    L7:
        return saveAudioStream(r6, this.managerAddr);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public int nativeDecodeFile(String r2, String r3) {
        return nativeDecodeFile(r2, r3, new OpusOption());
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void nativeDecodeStream(int r2) {
        nativeDecodeStream(r2, new OpusOption());
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public int nativeEncodeFile(String r2, String r3) {
        return nativeEncodeFile(r2, r3, new OpusOption());
    }

    public void onDecodeStreamReceive(int r1, byte[] r2) {
        if (this.mDecodeStreamCallback == null) goto L6;
        this.mDecodeStreamCallback.onDecodeStream(r2);
        return;
    }

    public void onStateCallback(int r4, int r5, int r6, String r7) {
        if (r4 == 1) goto L33;
        if (r4 == 2) goto L21;
        if (r4 == 3) goto L9;
        return;
    L9:
        if (this.mDecodeStreamCallback == null) goto L44;
        if (r5 == 0) goto L18;
        if (r5 == 1) goto L16;
        if (r5 != 2) goto L48;
        this.mDecodeStreamCallback.onError(r6, r7);
        return;
    L48:
        return;
    L16:
        this.mDecodeStreamCallback.onStart();
        return;
    L18:
        this.mDecodeStreamCallback.onComplete(r7);
        return;
    L44:
        return;
    L21:
        if (this.mEncodeFileCallback == null) goto L45;
        if (r5 == 0) goto L30;
        if (r5 == 1) goto L28;
        if (r5 != 2) goto L49;
        this.mEncodeFileCallback.onError(r6, r7);
        return;
    L49:
        return;
    L28:
        this.mEncodeFileCallback.onStart();
        return;
    L30:
        this.mEncodeFileCallback.onComplete(r7);
        return;
    L45:
        return;
    L33:
        if (this.mDecodeFileCallback == null) goto L46;
        if (r5 == 0) goto L42;
        if (r5 == 1) goto L40;
        if (r5 != 2) goto L50;
        this.mDecodeFileCallback.onError(r6, r7);
        return;
    L50:
        return;
    L40:
        this.mDecodeFileCallback.onStart();
        return;
    L42:
        this.mDecodeFileCallback.onComplete(r7);
        return;
    }

    public void release() {
        if (isDecodeStream() == false) goto L5;
        stopDecodeStream();
    L5:
        stopEncodeFileThread();
        stopDecodeFileThread();
        stopAddDataThread();
        setDecodeFileCallback(null);
        setEncodeFileCallback(null);
        setDecodeStreamCallback(null);
        if (nativeDestroy(this.managerAddr) != 0) goto L9;
        this.managerAddr = 0;
        return;
    }

    public void setDecodeFileCallback(OnStateCallback r1) {
        this.mDecodeFileCallback = r1;
    }

    public void setDecodeStreamCallback(OnDecodeStreamCallback r1) {
        this.mDecodeStreamCallback = r1;
    }

    public void setEncodeFileCallback(OnStateCallback r1) {
        this.mEncodeFileCallback = r1;
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void startDecodeStream(OnDecodeStreamCallback r3) {
        if (isDecodeStream() == true) goto L6;
        setDecodeStreamCallback(r3);
        nativeDecodeStream(1);
        return;
    L6:
        if (r3 == null) goto L9;
        r3.onError(-1003, "Decoding Stream is working, please don't open again.");
        return;
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void stopDecodeStream() {
        if (isDecodeStream() == false) goto L6;
        nativeDecodeStream(0);
        return;
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void writeAudioStream(byte[] r2) {
        if (isDecodeStream() == false) goto L6;
        addStreamData(r2);
        return;
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public int nativeDecodeFile(String r5, String r6, OpusOption r7) {
        if (this.managerAddr != 0) goto L7;
        return -1000;
    L7:
        return decodeAudioFile(r5, r6, this.managerAddr);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void nativeDecodeStream(int r3, OpusOption r4) {
        decodeAudioStream(r3, this.managerAddr);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public int nativeEncodeFile(String r5, String r6, OpusOption r7) {
        if (this.managerAddr != 0) goto L7;
        return -1000;
    L7:
        return encodeAudioFile(r5, r6, this.managerAddr);
    }
}
