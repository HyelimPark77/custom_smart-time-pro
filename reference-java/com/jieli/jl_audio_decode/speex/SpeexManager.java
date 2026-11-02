package com.jieli.jl_audio_decode.speex;

import com.jieli.jl_audio_decode.callback.OnDecodeStreamCallback;
import com.jieli.jl_audio_decode.callback.OnStateCallback;
import com.jieli.jl_audio_decode.callback.OnThreadFinishListener;
import com.jieli.jl_audio_decode.constant.DecodeConstant;
import com.jieli.jl_audio_decode.exceptions.SpeexException;
import com.jieli.jl_audio_decode.opus.model.OpusOption;
import com.jieli.jl_audio_decode.speex.SpeexManager;
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
    private volatile long managerAddr = initNativeID();

    static {
        try {
            System.loadLibrary(DecodeConstant.JL_SPEEX_LIB);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public SpeexManager() throws SpeexException {
        if (this.managerAddr == 0) {
            throw new SpeexException("Can not load jl_speex lib");
        }
    }

    public static /* synthetic */ void OXO1(SpeexManager speexManager, long j) {
        EncodeFileThread encodeFileThread = speexManager.mEncodeFileThread;
        if (encodeFileThread == null || encodeFileThread.getId() != j) {
            return;
        }
        speexManager.mEncodeFileThread = null;
        speexManager.setEncodeFileCallback(null);
    }

    public static /* synthetic */ void XIi00iiXO(SpeexManager speexManager, long j) {
        DecodeFileThread decodeFileThread = speexManager.mDecodeFileThread;
        if (decodeFileThread == null || decodeFileThread.getId() != j) {
            return;
        }
        speexManager.mDecodeFileCallback = null;
        speexManager.setDecodeFileCallback(null);
    }

    private void addStreamData(byte[] bArr) {
        if (bArr != null) {
            if (this.mAddStreamDataThread == null) {
                AddStreamDataThread addStreamDataThread = new AddStreamDataThread(this, 1, this.mDecodeStreamCallback, new OnThreadFinishListener() { // from class: com.android.mltcode.paycertificationapi.kr4
                    @Override // com.jieli.jl_audio_decode.callback.OnThreadFinishListener
                    public final void onThreadFinish(long j) {
                        SpeexManager.m26865iO(this.OXO1, j);
                    }
                });
                this.mAddStreamDataThread = addStreamDataThread;
                addStreamDataThread.start();
            }
            this.mAddStreamDataThread.addStreamData(bArr);
        }
    }

    private native int decodeAudioFile(String str, String str2, long j);

    private native void decodeAudioStream(int i, long j);

    private native int encodeAudioFile(String str, String str2, long j);

    private native int getAudioStreamState(long j);

    /* JADX INFO: renamed from: iO */
    public static /* synthetic */ void m26865iO(SpeexManager speexManager, long j) {
        AddStreamDataThread addStreamDataThread = speexManager.mAddStreamDataThread;
        if (addStreamDataThread == null || addStreamDataThread.getId() != j) {
            return;
        }
        speexManager.mAddStreamDataThread = null;
        speexManager.setDecodeStreamCallback(null);
    }

    private native long initNativeID();

    private native int nativeDestroy(long j);

    private native boolean saveAudioStream(byte[] bArr, long j);

    private void startDecodeFileThread(String str, String str2) {
        if (this.mDecodeFileThread == null) {
            DecodeFileThread decodeFileThread = new DecodeFileThread(this, str, str2, new OpusOption(), this.mDecodeFileCallback, new OnThreadFinishListener() { // from class: com.android.mltcode.paycertificationapi.lr4
                @Override // com.jieli.jl_audio_decode.callback.OnThreadFinishListener
                public final void onThreadFinish(long j) {
                    SpeexManager.XIi00iiXO(this.OXO1, j);
                }
            });
            this.mDecodeFileThread = decodeFileThread;
            decodeFileThread.start();
        }
    }

    private void startEncodeFileThread(String str, String str2) {
        if (this.mEncodeFileThread == null) {
            EncodeFileThread encodeFileThread = new EncodeFileThread(this, str, str2, new OpusOption(), this.mEncodeFileCallback, new OnThreadFinishListener() { // from class: com.android.mltcode.paycertificationapi.jr4
                @Override // com.jieli.jl_audio_decode.callback.OnThreadFinishListener
                public final void onThreadFinish(long j) {
                    SpeexManager.OXO1(this.OXO1, j);
                }
            });
            this.mEncodeFileThread = encodeFileThread;
            encodeFileThread.start();
        }
    }

    private void stopAddDataThread() {
        AddStreamDataThread addStreamDataThread = this.mAddStreamDataThread;
        if (addStreamDataThread != null) {
            addStreamDataThread.stopThread();
            this.mAddStreamDataThread = null;
        }
    }

    private void stopDecodeFileThread() {
        DecodeFileThread decodeFileThread = this.mDecodeFileThread;
        if (decodeFileThread != null) {
            decodeFileThread.interrupt();
            this.mDecodeFileThread = null;
        }
    }

    private void stopEncodeFileThread() {
        EncodeFileThread encodeFileThread = this.mEncodeFileThread;
        if (encodeFileThread != null) {
            encodeFileThread.interrupt();
            this.mEncodeFileThread = null;
        }
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void decodeFile(String str, String str2, OnStateCallback onStateCallback) {
        if (this.mDecodeFileThread == null) {
            setDecodeFileCallback(onStateCallback);
            startDecodeFileThread(str, str2);
        } else if (onStateCallback != null) {
            onStateCallback.onError(-1003, "In process, please wait.");
        }
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void encodeFile(String str, String str2, OnStateCallback onStateCallback) {
        if (this.mEncodeFileThread == null) {
            setEncodeFileCallback(onStateCallback);
            startEncodeFileThread(str, str2);
        } else if (onStateCallback != null) {
            onStateCallback.onError(-1003, "In process, please wait.");
        }
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public boolean isDecodeStream() {
        return getAudioStreamState(this.managerAddr) == 1;
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public boolean nativeAddAudioStream(int i, byte[] bArr) {
        if (this.managerAddr == 0) {
            return false;
        }
        return saveAudioStream(bArr, this.managerAddr);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public int nativeDecodeFile(String str, String str2) {
        return nativeDecodeFile(str, str2, new OpusOption());
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void nativeDecodeStream(int i) {
        nativeDecodeStream(i, new OpusOption());
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public int nativeEncodeFile(String str, String str2) {
        return nativeEncodeFile(str, str2, new OpusOption());
    }

    public void onDecodeStreamReceive(int i, byte[] bArr) {
        if (this.mDecodeStreamCallback != null) {
            this.mDecodeStreamCallback.onDecodeStream(bArr);
        }
    }

    public void onStateCallback(int i, int i2, int i3, String str) {
        if (i == 1) {
            if (this.mDecodeFileCallback != null) {
                if (i2 == 0) {
                    this.mDecodeFileCallback.onComplete(str);
                    return;
                } else if (i2 == 1) {
                    this.mDecodeFileCallback.onStart();
                    return;
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    this.mDecodeFileCallback.onError(i3, str);
                    return;
                }
            }
            return;
        }
        if (i == 2) {
            if (this.mEncodeFileCallback != null) {
                if (i2 == 0) {
                    this.mEncodeFileCallback.onComplete(str);
                    return;
                } else if (i2 == 1) {
                    this.mEncodeFileCallback.onStart();
                    return;
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    this.mEncodeFileCallback.onError(i3, str);
                    return;
                }
            }
            return;
        }
        if (i == 3 && this.mDecodeStreamCallback != null) {
            if (i2 == 0) {
                this.mDecodeStreamCallback.onComplete(str);
            } else if (i2 == 1) {
                this.mDecodeStreamCallback.onStart();
            } else {
                if (i2 != 2) {
                    return;
                }
                this.mDecodeStreamCallback.onError(i3, str);
            }
        }
    }

    public void release() {
        if (isDecodeStream()) {
            stopDecodeStream();
        }
        stopEncodeFileThread();
        stopDecodeFileThread();
        stopAddDataThread();
        setDecodeFileCallback(null);
        setEncodeFileCallback(null);
        setDecodeStreamCallback(null);
        if (nativeDestroy(this.managerAddr) == 0) {
            this.managerAddr = 0L;
        }
    }

    public void setDecodeFileCallback(OnStateCallback onStateCallback) {
        this.mDecodeFileCallback = onStateCallback;
    }

    public void setDecodeStreamCallback(OnDecodeStreamCallback onDecodeStreamCallback) {
        this.mDecodeStreamCallback = onDecodeStreamCallback;
    }

    public void setEncodeFileCallback(OnStateCallback onStateCallback) {
        this.mEncodeFileCallback = onStateCallback;
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void startDecodeStream(OnDecodeStreamCallback onDecodeStreamCallback) {
        if (!isDecodeStream()) {
            setDecodeStreamCallback(onDecodeStreamCallback);
            nativeDecodeStream(1);
        } else if (onDecodeStreamCallback != null) {
            onDecodeStreamCallback.onError(-1003, "Decoding Stream is working, please don't open again.");
        }
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void stopDecodeStream() {
        if (isDecodeStream()) {
            nativeDecodeStream(0);
        }
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void writeAudioStream(byte[] bArr) {
        if (isDecodeStream()) {
            addStreamData(bArr);
        }
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public int nativeDecodeFile(String str, String str2, OpusOption opusOption) {
        if (this.managerAddr == 0) {
            return -1000;
        }
        return decodeAudioFile(str, str2, this.managerAddr);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public void nativeDecodeStream(int i, OpusOption opusOption) {
        decodeAudioStream(i, this.managerAddr);
    }

    @Override // com.jieli.jl_audio_decode.tool.BaseManager
    public int nativeEncodeFile(String str, String str2, OpusOption opusOption) {
        if (this.managerAddr == 0) {
            return -1000;
        }
        return encodeAudioFile(str, str2, this.managerAddr);
    }
}
