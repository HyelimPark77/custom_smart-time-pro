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

    public SendDataInfo(BluetoothDevice bluetoothDevice, int i, C c, int i2, CommandCallback<C> commandCallback) {
        super(0);
        this.deviceReceiveMtu = 530;
        this.reSendMax = 3;
        this.device = bluetoothDevice;
        this.cmdType = i;
        this.command = c;
        this.timeoutMs = i2;
        this.callback = commandCallback;
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            SendDataInfo sendDataInfo = (SendDataInfo) obj;
            if (this.cmdType == sendDataInfo.cmdType && Objects.equals(this.device, sendDataInfo.device) && Objects.equals(this.command, sendDataInfo.command)) {
                return true;
            }
        }
        return false;
    }

    public BasePacket getBasePacket() {
        C c = this.command;
        if (c == null) {
            return null;
        }
        return ParseHelper.convert2BasePacket(c, this.cmdType);
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
        C c = this.command;
        if (c == null) {
            return Integer.MAX_VALUE;
        }
        return c.getId();
    }

    public int getReSendCount() {
        return this.reSendCount;
    }

    public int getReSendMax() {
        return this.reSendMax;
    }

    public byte[] getSendData() {
        BasePacket basePacket = getBasePacket();
        if (basePacket == null) {
            return new byte[0];
        }
        byte[] bArrPackSendBasePacket = ParseHelper.packSendBasePacket(basePacket);
        return bArrPackSendBasePacket == null ? new byte[0] : bArrPackSendBasePacket;
    }

    public long getSendTime() {
        return this.sendTime;
    }

    public int getSn() {
        C c = this.command;
        if (c == null) {
            return -1;
        }
        return c.getOpCodeSn();
    }

    public int getTimeoutMs() {
        return this.timeoutMs;
    }

    public int hashCode() {
        return Objects.hash(this.device, Integer.valueOf(this.cmdType), this.command);
    }

    public boolean isSend() {
        return this.isSend;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCommand(CommandBase<?, ?> commandBase) {
        if (commandBase == 0) {
            return;
        }
        this.command = commandBase;
    }

    public SendDataInfo setDeviceReceiveMtu(int i) {
        this.deviceReceiveMtu = i;
        return this;
    }

    public SendDataInfo setReSendCount(int i) {
        this.reSendCount = i;
        return this;
    }

    public SendDataInfo setReSendMax(int i) {
        this.reSendMax = i;
        return this;
    }

    public SendDataInfo setSend(boolean z) {
        this.isSend = z;
        return this;
    }

    public SendDataInfo setSendTime(long j) {
        this.sendTime = j;
        return this;
    }

    public SendDataInfo setTimeoutMs(int i) {
        this.timeoutMs = i;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.model.data.DataInfo
    public String toString() {
        return "SendDataInfo{device=" + this.device + ",\n cmdType=" + this.cmdType + ", command=" + this.command + ",\n timeoutMs=" + this.timeoutMs + ", callback=" + this.callback + ", deviceReceiveMtu=" + this.deviceReceiveMtu + ", reSendMax=" + this.reSendMax + ", reSendCount=" + this.reSendCount + ", isSend=" + this.isSend + ", sendTime=" + this.sendTime + i0XO1.f7442IO;
    }
}
