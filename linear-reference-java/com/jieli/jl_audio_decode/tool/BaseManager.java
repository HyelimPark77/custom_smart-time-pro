package com.jieli.jl_audio_decode.tool;

import com.jieli.jl_audio_decode.callback.OnDecodeStreamCallback;
import com.jieli.jl_audio_decode.callback.OnStateCallback;
import com.jieli.jl_audio_decode.opus.model.OpusOption;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseManager {
    public BaseManager() {
    }

    public abstract void decodeFile(String r1, String r2, OnStateCallback r3);

    public abstract void encodeFile(String r1, String r2, OnStateCallback r3);

    public abstract boolean isDecodeStream();

    public abstract boolean nativeAddAudioStream(int r1, byte[] r2);

    public abstract int nativeDecodeFile(String r1, String r2);

    public abstract int nativeDecodeFile(String r1, String r2, OpusOption r3);

    public abstract void nativeDecodeStream(int r1);

    public abstract void nativeDecodeStream(int r1, OpusOption r2);

    public abstract int nativeEncodeFile(String r1, String r2);

    public abstract int nativeEncodeFile(String r1, String r2, OpusOption r3);

    public abstract void startDecodeStream(OnDecodeStreamCallback r1);

    public abstract void stopDecodeStream();

    public abstract void writeAudioStream(byte[] r1);
}
