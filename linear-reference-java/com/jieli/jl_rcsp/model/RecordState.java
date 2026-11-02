package com.jieli.jl_rcsp.model;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class RecordState {
    public static final int REASON_NORMAL = 0;
    public static final int REASON_STOP = 1;
    public static final int RECORD_STATE_IDLE = 0;
    public static final int RECORD_STATE_START = 1;
    public static final int RECORD_STATE_WORKING = 2;
    private boolean isPlayTTS;
    private boolean isSyncIatText;
    private boolean isSyncNlpText;
    private String message;
    private int reason;
    private RecordParam recordParam;
    private int state;
    private byte[] voiceData;
    private byte[] voiceDataBlock;

    public RecordState() {
        this.state = 0;
        this.reason = 0;
        this.isSyncIatText = false;
        this.isSyncNlpText = false;
        this.isPlayTTS = false;
    }

    public String getMessage() {
        return this.message;
    }

    public int getReason() {
        return this.reason;
    }

    public RecordParam getRecordParam() {
        return this.recordParam;
    }

    public int getState() {
        return this.state;
    }

    public byte[] getVoiceData() {
        return this.voiceData;
    }

    public byte[] getVoiceDataBlock() {
        return this.voiceDataBlock;
    }

    public boolean isPlayTTS() {
        return this.isPlayTTS;
    }

    public boolean isSyncIatText() {
        return this.isSyncIatText;
    }

    public boolean isSyncNlpText() {
        return this.isSyncNlpText;
    }

    public RecordState setMessage(String r1) {
        this.message = r1;
        return this;
    }

    public RecordState setPlayTTS(boolean r1) {
        this.isPlayTTS = r1;
        return this;
    }

    public RecordState setReason(int r1) {
        this.reason = r1;
        return this;
    }

    public RecordState setRecordParam(RecordParam r1) {
        this.recordParam = r1;
        return this;
    }

    public RecordState setState(int r1) {
        this.state = r1;
        return this;
    }

    public RecordState setSyncIatText(boolean r1) {
        this.isSyncIatText = r1;
        return this;
    }

    public RecordState setSyncNlpText(boolean r1) {
        this.isSyncNlpText = r1;
        return this;
    }

    public RecordState setVoiceData(byte[] r1) {
        this.voiceData = r1;
        return this;
    }

    public RecordState setVoiceDataBlock(byte[] r1) {
        this.voiceDataBlock = r1;
        return this;
    }

    public String toString() {
        return "RecordState{state=" + this.state + ", recordParam=" + this.recordParam + ", voiceDataBlock=" + CHexConver.byte2HexStr(this.voiceDataBlock) + ", reason=" + this.reason + ", voiceData=" + CHexConver.byte2HexStr(this.voiceData) + ", message='" + this.message + '\'' + i0XO1.IO;
    }
}
