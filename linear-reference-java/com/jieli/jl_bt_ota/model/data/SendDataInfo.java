package com.jieli.jl_bt_ota.model.data;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.CommandCallback;
import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.tool.ParseHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public class SendDataInfo<C extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> extends DataInfo {
    private final CommandCallback<C> callback;
    private final int cmdType;
    private C command;
    private final BluetoothDevice device;
    private int deviceReceiveMtu;
    private boolean isSend;
    private int reSendCount;
    private int reSendMax;
    private long sendTime;
    private int timeoutMs;

    public SendDataInfo(BluetoothDevice r2, int r3, C r4, int r5, CommandCallback<C> r6) {
        super(0);
        this.deviceReceiveMtu = 530;
        this.reSendMax = 3;
        this.device = r2;
        this.cmdType = r3;
        this.command = r4;
        this.timeoutMs = r5;
        this.callback = r6;
    }

    public boolean equals(Object r4) {
        if (r4 != null) goto L5;
    L15:
        return false;
    L5:
        if (getClass() != r4.getClass()) goto L15;
        SendDataInfo r5 = (SendDataInfo) r4;
        if (this.cmdType != r5.cmdType) goto L15;
        if (Objects.equals(this.device, r5.device) == false) goto L15;
        if (Objects.equals(this.command, r5.command) == false) goto L15;
        return true;
    }

    public BasePacket getBasePacket() {
        C r0 = this.command;
        if (r0 != null) goto L7;
        return null;
    L7:
        return ParseHelper.convert2BasePacket(r0, this.cmdType);
    }

    public CommandCallback<C> getCallback() {
        return this.callback;
    }

    public int getCmdType() {
        return this.cmdType;
    }

    public C getCommand() {
        return this.command;
    }

    public BluetoothDevice getDevice() {
        return this.device;
    }

    public int getDeviceReceiveMtu() {
        return this.deviceReceiveMtu;
    }

    public int getOpCode() {
        C r0 = this.command;
        if (r0 != null) goto L7;
        return Integer.MAX_VALUE;
    L7:
        return r0.getId();
    }

    public int getReSendCount() {
        return this.reSendCount;
    }

    public int getReSendMax() {
        return this.reSendMax;
    }

    public byte[] getSendData() {
        BasePacket r0 = getBasePacket();
        if (r0 == null) goto L5;
        byte[] r1 = ParseHelper.packSendBasePacket(r0);
        if (r1 == null) goto L9;
        return r1;
    L9:
        return new byte[0];
    L5:
        return new byte[0];
    }

    public long getSendTime() {
        return this.sendTime;
    }

    public int getSn() {
        C r0 = this.command;
        if (r0 != null) goto L7;
        return -1;
    L7:
        return r0.getOpCodeSn();
    }

    public int getTimeoutMs() {
        return this.timeoutMs;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.device, Integer.valueOf(this.cmdType), this.command});
    }

    public boolean isSend() {
        return this.isSend;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCommand(CommandBase<?, ?> r1) {
        if (r1 != 0) goto L4;
        return;
    L4:
        this.command = r1;
    }

    public SendDataInfo setDeviceReceiveMtu(int r1) {
        this.deviceReceiveMtu = r1;
        return this;
    }

    public SendDataInfo setReSendCount(int r1) {
        this.reSendCount = r1;
        return this;
    }

    public SendDataInfo setReSendMax(int r1) {
        this.reSendMax = r1;
        return this;
    }

    public SendDataInfo setSend(boolean r1) {
        this.isSend = r1;
        return this;
    }

    public SendDataInfo setSendTime(long r1) {
        this.sendTime = r1;
        return this;
    }

    public SendDataInfo setTimeoutMs(int r1) {
        this.timeoutMs = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.model.data.DataInfo
    public String toString() {
        return "SendDataInfo{device=" + this.device + ",\n cmdType=" + this.cmdType + ", command=" + this.command + ",\n timeoutMs=" + this.timeoutMs + ", callback=" + this.callback + ", deviceReceiveMtu=" + this.deviceReceiveMtu + ", reSendMax=" + this.reSendMax + ", reSendCount=" + this.reSendCount + ", isSend=" + this.isSend + ", sendTime=" + this.sendTime + i0XO1.IO;
    }
}
