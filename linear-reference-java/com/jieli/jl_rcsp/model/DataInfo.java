package com.jieli.jl_rcsp.model;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class DataInfo {
    public static final int DATA_TYPE_RECEIVE = 1;
    public static final int DATA_TYPE_SEND = 0;
    private BasePacket basePacket;
    private BluetoothDevice device;
    private boolean isSend;
    private RcspCommandCallback mRcspCmdCallback;
    private int reSendCount;
    private byte[] recvData;
    private long sendTime;
    private int timeoutMs;
    private int type;

    public DataInfo() {
        this.timeoutMs = 2000;
    }

    public BasePacket getBasePacket() {
        return this.basePacket;
    }

    public BluetoothDevice getDevice() {
        return this.device;
    }

    public RcspCommandCallback getRcspCmdCallback() {
        return this.mRcspCmdCallback;
    }

    public int getReSendCount() {
        return this.reSendCount;
    }

    public byte[] getRecvData() {
        return this.recvData;
    }

    public long getSendTime() {
        return this.sendTime;
    }

    public int getTimeoutMs() {
        return this.timeoutMs;
    }

    public int getType() {
        return this.type;
    }

    public boolean isSend() {
        return this.isSend;
    }

    public DataInfo setBasePacket(BasePacket r1) {
        this.basePacket = r1;
        return this;
    }

    public DataInfo setDevice(BluetoothDevice r1) {
        this.device = r1;
        return this;
    }

    public DataInfo setRcspCmdCallback(RcspCommandCallback r1) {
        this.mRcspCmdCallback = r1;
        return this;
    }

    public DataInfo setReSendCount(int r1) {
        this.reSendCount = r1;
        return this;
    }

    public DataInfo setRecvData(byte[] r1) {
        this.recvData = r1;
        return this;
    }

    public DataInfo setSend(boolean r1) {
        this.isSend = r1;
        return this;
    }

    public DataInfo setSendTime(long r1) {
        this.sendTime = r1;
        return this;
    }

    public DataInfo setTimeoutMs(int r2) {
        this.timeoutMs = Math.max(100, r2);
        return this;
    }

    public DataInfo setType(int r1) {
        this.type = r1;
        return this;
    }

    public String toString() {
        return "DataInfo{device=" + this.device + ", type=" + this.type + ", recvData=" + CHexConver.byte2HexStr(this.recvData) + ", basePacket=" + this.basePacket + ", timeoutMs=" + this.timeoutMs + ", mRcspCmdCallback=" + this.mRcspCmdCallback + ", reSendCount=" + this.reSendCount + ", isSend=" + this.isSend + ", sendTime=" + this.sendTime + i0XO1.IO;
    }
}
