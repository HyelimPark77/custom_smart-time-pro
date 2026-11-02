package com.jieli.jl_rcsp.model.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class VoiceData implements Parcelable {
    public static final int CHANNEL_MONO = 1;
    public static final int CHANNEL_STEREO = 2;
    public static final Parcelable.Creator<VoiceData> CREATOR = null;
    public static final int ENCODING_PCM_16BIT = 2;
    public static final int ENCODING_PCM_8BIT = 1;
    public static final int VOICE_TYPE_OPUS = 2;
    public static final int VOICE_TYPE_PCM = 0;
    public static final int VOICE_TYPE_SPEEX = 1;
    private int channel;
    private byte[] data;
    private int dataType;
    private int format;
    private int sampleRate;

    static {
        CREATOR = new AnonymousClass1();
    }

    public VoiceData() {
        this.sampleRate = 16000;
        this.format = 2;
        this.channel = 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof VoiceData) == false) goto L14;
        VoiceData r5 = (VoiceData) r4;
        if (this.dataType != r5.dataType) goto L14;
        if (this.sampleRate != r5.sampleRate) goto L14;
        if (this.format != r5.format) goto L14;
        if (this.channel != r5.channel) goto L14;
        return true;
    L14:
        return false;
    }

    public int getChannel() {
        return this.channel;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getDataType() {
        return this.dataType;
    }

    public int getFormat() {
        return this.format;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public int hashCode() {
        return ((this.dataType + this.sampleRate) + this.format) + this.channel;
    }

    public VoiceData setChannel(int r1) {
        this.channel = r1;
        return this;
    }

    public VoiceData setData(byte[] r1) {
        this.data = r1;
        return this;
    }

    public VoiceData setDataType(int r1) {
        this.dataType = r1;
        return this;
    }

    public VoiceData setFormat(int r1) {
        this.format = r1;
        return this;
    }

    public VoiceData setSampleRate(int r1) {
        this.sampleRate = r1;
        return this;
    }

    public String toString() {
        return "VoiceData{dataType=" + this.dataType + ", data=" + CHexConver.byte2HexStr(this.data) + ", sampleRate=" + this.sampleRate + ", format=" + this.format + ", channel=" + this.channel + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.dataType);
        r1.writeByteArray(this.data);
        r1.writeInt(this.sampleRate);
        r1.writeInt(this.format);
        r1.writeInt(this.channel);
    }

    public VoiceData(Parcel r2) {
        this.sampleRate = 16000;
        this.format = 2;
        this.channel = 1;
        this.dataType = r2.readInt();
        this.data = r2.createByteArray();
        this.sampleRate = r2.readInt();
        this.format = r2.readInt();
        this.channel = r2.readInt();
    }
}
