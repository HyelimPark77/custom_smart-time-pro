package com.jieli.jl_audio_decode.opus;

import android.util.Log;
import com.android.mltcode.paycertificationapi.ni1;
import com.android.mltcode.paycertificationapi.qi1;
import com.android.mltcode.paycertificationapi.ri1;
import com.android.mltcode.paycertificationapi.si1;
import com.android.mltcode.paycertificationapi.ti1;
import com.jieli.jl_audio_decode.callback.OnDecodeStreamCallback;
import com.jieli.jl_audio_decode.callback.OnEncodeStreamCallback;
import com.jieli.jl_audio_decode.callback.OnStateCallback;
import com.jieli.jl_audio_decode.constant.DecodeConstant;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import com.jieli.jl_audio_decode.exceptions.OpusException;
import com.jieli.jl_audio_decode.opus.model.OggConfigure;
import com.jieli.jl_audio_decode.opus.model.OpusOption;
import com.jieli.jl_audio_decode.tool.AddStreamDataThread;
import com.jieli.jl_audio_decode.tool.BaseManager;
import com.jieli.jl_audio_decode.tool.DecodeFileThread;
import com.jieli.jl_audio_decode.tool.EncodeFileThread;
import java.util.Locale;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class OpusManager extends BaseManager {
    private static final String TAG = "OpusManager";
    public static boolean isLog;
    private AddStreamDataThread mAddStreamDataThread;
    private DecodeFileThread mDecodeFileThread;
    private volatile OnStateCallback mDecodeStateCb;
    private volatile OnDecodeStreamCallback mDecodeStreamCb;
    private EncodeFileThread mEncodeFileThread;
    private volatile OnStateCallback mEncodeStateCb;
    private volatile OnEncodeStreamCallback mEncodeStreamCb;
    private AddStreamDataThread mEncodeStreamDataThread;
    private volatile long managerAddr;

    static {
        System.loadLibrary(DecodeConstant.JL_OPUS_LIB);     // Catch: Exception -> L4
    L6:
        isLog = false;
        return;
    L4:
        e = move-exception;
        e.printStackTrace();
        goto L6
    }

    public OpusManager() throws OpusException {
        this.managerAddr = initNativeID();
        if (this.managerAddr == 0) goto L6;
        return;
    L6:
        throw new OpusException("Can not load jl_opus lib");
    }

    public static /* synthetic */ void O00(OpusManager r2, long r3) {
        EncodeFileThread r0 = r2.mEncodeFileThread;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getId() != r3) goto L9;
        r2.mEncodeFileThread = null;
        r2.setEncodeStateCb(null);
        return;
    }

    public static /* synthetic */ void OXO1(OpusManager r2, long r3) {
        AddStreamDataThread r0 = r2.mAddStreamDataThread;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getId() != r3) goto L9;
        r2.mAddStreamDataThread = null;
        r2.setDecodeStreamCb(null);
        return;
    }

    public static /* synthetic */ void XIi00iiXO(OpusManager r2, long r3) {
        AddStreamDataThread r0 = r2.mEncodeStreamDataThread;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getId() != r3) goto L9;
        r2.mEncodeStreamDataThread = null;
        r2.setEncodeStreamCb(null);
        return;
    }

    public static /* synthetic */ void XO0O10(OpusManager r2, long r3) {
        DecodeFileThread r0 = r2.mDecodeFileThread;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getId() != r3) goto L9;
        r2.mDecodeFileThread = null;
        r2.setDecodeStateCb(null);
        return;
    }

    private void addEncodeStreamData(byte[] r5) {
        if (r5 != null) goto L4;
        return;
    L4:
        if (r5.length > 0) goto L6;
        return;
    L6:
        if (this.mEncodeStreamDataThread != null) goto L8;
        AddStreamDataThread r0 = new AddStreamDataThread(this, 0, this.mEncodeStreamCb, new si1(this));
        this.mEncodeStreamDataThread = r0;
        r0.start();
    L8:
        this.mEncodeStreamDataThread.addStreamData(r5);
    }

    private void addStreamData(byte[] r5) {
        if (r5 != null) goto L4;
        return;
    L4:
        if (r5.length > 0) goto L6;
        return;
    L6:
        if (this.mAddStreamDataThread != null) goto L8;
        AddStreamDataThread r0 = new AddStreamDataThread(this, 2, this.mDecodeStreamCb, new qi1(this));
        this.mAddStreamDataThread = r0;
        r0.start();
    L8:
        this.mAddStreamDataThread.addStreamData(r5);
    }

    private native int decodeAudioFile(String r1, String r2, long r3, OpusOption r5);

    private native void decodeAudioStream(int r1, long r2, OpusOption r4);

    private native int encodeOpusFile(String r1, String r2, long r3, OpusOption r5);

    private native void encodeOpusStream(int r1, long r2, OpusOption r4);

    private native int getAudioStreamState(long r1);

    private native int getEncodeStreamState(long r1);

    private native int getTranscodingStreamState(long r1);

    public static /* synthetic */ void iO(OpusManager r6, String r7, String r8, OggConfigure r9, OnStateCallback r10) {
        int r11 = r6.transcodingOggFile(r6.managerAddr, r7, r8, r9);
        if (r11 == 0) goto L7;
        if (r10 == null) goto L8;
        r10.onError(r11, ErrorCode.getErrorMsg(r11));
        return;
    L8:
        return;
    }

    private native long initNativeID();

    private void logContent(String r3, String r4) {
        if (isLog == false) goto L8;
        if (r4 == null) goto L9;
        Log.d(TAG, String.format(Locale.ENGLISH, "[%s]\t%s", new Object[]{r3, r4}));
        return;
    L9:
        return;
    }

    private native int nativeDestroy(long r1);

    private native boolean saveAudioStream(byte[] r1, long r2);

    private native boolean savePcmStream(byte[] r1, long r2);

    private void setDecodeStateCb(OnStateCallback r1) {
        this.mDecodeStateCb = r1;
    }

    private void setDecodeStreamCb(OnDecodeStreamCallback r1) {
        this.mDecodeStreamCb = r1;
    }

    private void setEncodeStateCb(OnStateCallback r1) {
        this.mEncodeStateCb = r1;
    }

    private void setEncodeStreamCb(OnEncodeStreamCallback r1) {
        this.mEncodeStreamCb = r1;
    }

    private void startDecodeFileThread(String r9, String r10, OpusOption r11) {
        if (this.mDecodeFileThread != null) goto L7;
        DecodeFileThread r1 = new DecodeFileThread(this, r9, r10, r11, this.mDecodeStateCb, new ri1(this));
        this.mDecodeFileThread = r1;
        r1.start();
        return;
    }

    private void startEncodeFileThread(String r9, String r10, OpusOption r11) {
        if (this.mEncodeFileThread != null) goto L7;
        EncodeFileThread r1 = new EncodeFileThread(this, r9, r10, r11, this.mEncodeStateCb, new ti1(this));
        this.mEncodeFileThread = r1;
        r1.start();
        return;
    }

    private void stopAddDataThread() {
        AddStreamDataThread r0 = this.mAddStreamDataThread;
        if (r0 == null) goto L6;
        r0.stopThread();
        return;
    }

    private void stopAddEncodeDataThread() {
        AddStreamDataThread r0 = this.mEncodeStreamDataThread;
        if (r0 == null) goto L6;
        r0.stopThread();
        return;
    }

    private void stopDecodeFileThread() {
        DecodeFileThread r0 = this.mDecodeFileThread;
        if (r0 == null) goto L6;
        r0.interrupt();
        return;
    }

    private void stopEncodeFileThread() {
        EncodeFileThread r0 = this.mEncodeFileThread;
        if (r0 == null) goto L6;
        r0.interrupt();
        return;
    }

    private native int transcodingOggFile(long r1, String r3, String r4, OggConfigure r5);

    private native void transcodingOggStream(long r1, int r3, OggConfigure r4);

    private native boolean writeOpusStream(long r1, byte[] r3);

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void decodeFile(String r2, String r3, OnStateCallback r4) {
        decodeFile(r2, r3, new OpusOption(), r4);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void encodeFile(String r2, String r3, OnStateCallback r4) {
        encodeFile(r2, r3, new OpusOption(), r4);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public boolean isDecodeStream() {
        if (getAudioStreamState(this.managerAddr) != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean isEncodeStream() {
        if (getEncodeStreamState(this.managerAddr) != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean isTranscoding() {
        if (getTranscodingStreamState(this.managerAddr) != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public boolean nativeAddAudioStream(int r4, byte[] r5) {
        Locale r0 = Locale.ENGLISH;
        Integer r1 = Integer.valueOf(r4);
        if (r5 != null) goto L5;
        int r2 = 0;
    L6:
        logContent("nativeAddAudioStream", String.format(r0, "dataType : %d, data size : %d", new Object[]{r1, Integer.valueOf(r2)}));
        if (r4 != 0) goto L11;
        return savePcmStream(r5, this.managerAddr);
    L11:
        return saveAudioStream(r5, this.managerAddr);
    L5:
        r2 = r5.length;
        goto L6
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    @Deprecated
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
        if (this.mDecodeStreamCb != null) goto L5;
        return;
    L5:
        this.mDecodeStreamCb.onDecodeStream(r2);
    }

    public void onEncodeStreamReceive(int r1, byte[] r2) {
        if (this.mEncodeStreamCb != null) goto L5;
        return;
    L5:
        this.mEncodeStreamCb.onEncodeStream(r2);
    }

    public void onStateCallback(int r3, int r4, int r5, String r6) {
        switch(r3) {
            case 1: goto L45;
            case 2: goto L32;
            case 3: goto L19;
            case 4: goto L6;
            case 5: goto L45;
            case 6: goto L19;
            default: goto L57;
        };
    L57:
        return;
    L6:
        if (this.mEncodeStreamCb == null) goto L58;
        if (r4 == 0) goto L16;
        if (r4 == 1) goto L14;
        if (r4 != 2) goto L59;
        this.mEncodeStreamCb.onError(r5, r6);
        return;
    L59:
        return;
    L14:
        this.mEncodeStreamCb.onStart();
        return;
    L16:
        this.mEncodeStreamCb.onComplete(r6);
        return;
    L58:
        return;
    L19:
        if (this.mDecodeStreamCb == null) goto L60;
        if (r4 == 0) goto L29;
        if (r4 == 1) goto L27;
        if (r4 != 2) goto L61;
        this.mDecodeStreamCb.onError(r5, r6);
        return;
    L61:
        return;
    L27:
        this.mDecodeStreamCb.onStart();
        return;
    L29:
        this.mDecodeStreamCb.onComplete(r6);
        return;
    L60:
        return;
    L32:
        if (this.mEncodeStateCb == null) goto L62;
        if (r4 == 0) goto L42;
        if (r4 == 1) goto L40;
        if (r4 != 2) goto L63;
        this.mEncodeStateCb.onError(r5, r6);
        return;
    L63:
        return;
    L40:
        this.mEncodeStateCb.onStart();
        return;
    L42:
        this.mEncodeStateCb.onComplete(r6);
        return;
    L62:
        return;
    L45:
        if (this.mDecodeStateCb == null) goto L64;
        if (r4 == 0) goto L55;
        if (r4 == 1) goto L53;
        if (r4 == 2) goto L51;
        return;
    L51:
        this.mDecodeStateCb.onError(r5, r6);
        return;
    L53:
        this.mDecodeStateCb.onStart();
        return;
    L55:
        this.mDecodeStateCb.onComplete(r6);
        return;
    }

    public void release() {
        if (isDecodeStream() == false) goto L6;
        stopDecodeStream();
    L6:
        if (isEncodeStream() == false) goto L8;
        stopEncodeStream();
    L8:
        stopDecodeFileThread();
        stopEncodeFileThread();
        stopAddDataThread();
        stopAddEncodeDataThread();
        setDecodeStateCb(null);
        setDecodeStateCb(null);
        setDecodeStateCb(null);
        setEncodeStreamCb(null);
        if (nativeDestroy(this.managerAddr) != 0) goto L12;
        this.managerAddr = 0;
        return;
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void startDecodeStream(OnDecodeStreamCallback r2) {
        startDecodeStream(new OpusOption(), r2);
    }

    public void startEncodeStream(OnEncodeStreamCallback r2) {
        startEncodeStream(new OpusOption(), r2);
    }

    public void startTranscodingStream(OnDecodeStreamCallback r2) {
        startTranscodingStream(new OggConfigure(), r2);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void stopDecodeStream() {
        if (isDecodeStream() == false) goto L6;
        nativeDecodeStream(0, new OpusOption());
        return;
    }

    public void stopEncodeStream() {
        if (isEncodeStream() == false) goto L6;
        encodeOpusStream(0, this.managerAddr, new OpusOption());
        return;
    }

    public void stopTranscodingStream() {
        if (isTranscoding() == false) goto L6;
        transcodingOggStream(this.managerAddr, 0, null);
        return;
    }

    public void transcodingOggFile(String r2, String r3, OnStateCallback r4) {
        transcodingOggFile(r2, r3, new OggConfigure(), r4);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void writeAudioStream(byte[] r2) {
        if (isDecodeStream() == false) goto L6;
        addStreamData(r2);
        return;
    }

    public void writeEncodeStream(byte[] r2) {
        if (isEncodeStream() == false) goto L6;
        addEncodeStreamData(r2);
        return;
    }

    public void writeTransCodingStream(byte[] r3) {
        if (isTranscoding() == false) goto L6;
        writeOpusStream(this.managerAddr, r3);
        return;
    }

    public void decodeFile(String r2, String r3, OpusOption r4, OnStateCallback r5) {
        if (this.mDecodeFileThread != null) goto L6;
        setDecodeStateCb(r5);
        startDecodeFileThread(r2, r3, r4);
        return;
    L6:
        if (r5 == null) goto L9;
        r5.onError(-1003, "In process, please wait.");
        return;
    }

    public void encodeFile(String r2, String r3, OpusOption r4, OnStateCallback r5) {
        if (this.mEncodeFileThread != null) goto L6;
        setEncodeStateCb(r5);
        startEncodeFileThread(r2, r3, r4);
        return;
    L6:
        if (r5 == null) goto L9;
        r5.onError(-1003, "In process, please wait.");
        return;
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public int nativeDecodeFile(String r7, String r8, OpusOption r9) {
        if (r9 != null) goto L4;
        r9 = new OpusOption();
    L4:
        long r3 = this.managerAddr;
        return decodeAudioFile(r7, r8, r3, r9);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void nativeDecodeStream(int r3, OpusOption r4) {
        decodeAudioStream(r3, this.managerAddr, r4);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public int nativeEncodeFile(String r7, String r8, OpusOption r9) {
        return encodeOpusFile(r7, r8, this.managerAddr, r9);
    }

    public void startDecodeStream(OpusOption r2, OnDecodeStreamCallback r3) {
        if (isDecodeStream() == true) goto L6;
        setDecodeStreamCb(r3);
        nativeDecodeStream(1, r2);
        return;
    L6:
        if (r3 == null) goto L9;
        r3.onError(-1003, "Decoding Stream is working, please don't open again.");
        return;
    }

    public void startEncodeStream(OpusOption r3, OnEncodeStreamCallback r4) {
        if (isEncodeStream() == true) goto L6;
        setEncodeStreamCb(r4);
        encodeOpusStream(1, this.managerAddr, r3);
        return;
    L6:
        if (r4 == null) goto L9;
        r4.onError(-1003, "Encoding Stream is working, please don't open again.");
        return;
    }

    public void startTranscodingStream(OggConfigure r3, OnDecodeStreamCallback r4) {
        if (isTranscoding() == false) goto L7;
        if (r4 == null) goto L9;
        r4.onError(-1003, ErrorCode.getErrorMsg(-1003));
        return;
    L9:
        return;
    L7:
        setDecodeStreamCb(r4);
        transcodingOggStream(this.managerAddr, 1, r3);
    }

    public void transcodingOggFile(final String r8, final String r9, final OggConfigure r10, final OnStateCallback r11) {
        if (isTranscoding() == false) goto L7;
        if (r11 == null) goto L9;
        r11.onError(-1003, ErrorCode.getErrorMsg(-1003));
        return;
    L9:
        return;
    L7:
        setDecodeStateCb(r11);
        Executors.newSingleThreadExecutor().submit(new ni1(this, r8, r9, r10, r11));
    }
}
