package com.jieli.jl_bt_ota.model.parameter.tws;

import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.util.BluetoothUtil;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyAdvInfoParam extends BaseParameter {
    private int action;
    private int chargingBinQuantity;
    private int deviceType;
    private String edrAddr;
    private boolean isDeviceCharging;
    private boolean isLeftCharging;
    private boolean isRightCharging;
    private int leftDeviceQuantity;
    private int pid;
    private int rightDeviceQuantity;
    private int seq;
    private boolean showDialog;
    private int uid;
    private int version;
    private int vid;

    public NotifyAdvInfoParam() {
    }

    public int getAction() {
        return this.action;
    }

    public int getChargingBinQuantity() {
        return this.chargingBinQuantity;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public String getEdrAddr() {
        return this.edrAddr;
    }

    public int getLeftDeviceQuantity() {
        return this.leftDeviceQuantity;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter, com.jieli.jl_bt_ota.interfaces.command.IParamBase
    public byte[] getParamData() {
        byte[] r0 = new byte[18];
        byte[] r1 = CHexConver.int2byte2(this.vid);
        byte r3 = 0;
        System.arraycopy(r1, 0, r0, 0, r1.length);
        int r2 = r1.length;
        byte[] r4 = CHexConver.int2byte2(this.uid);
        System.arraycopy(r4, 0, r0, r2, r4.length);
        int r5 = r2 + r4.length;
        byte[] r6 = CHexConver.int2byte2(this.pid);
        System.arraycopy(r6, 0, r0, r5, r6.length);
        int r7 = r5 + r6.length;
        r0[r7] = (byte) ((this.deviceType << 4) | (this.version & 15));
        int r8 = r7 + 1;
        byte[] r9 = BluetoothUtil.addressCovertToByteArray(this.edrAddr);
        if (r9 != null) goto L5;
    L7:
        r0[r8] = CHexConver.intToByte(this.action);
        int r10 = r8 + 1;
        if (this.isLeftCharging == false) goto L10;
        byte r11 = -128;
    L11:
        r0[r10] = r11;
        int r12 = r8 + 2;
        if (this.isRightCharging == false) goto L14;
        byte r13 = -128;
    L15:
        r0[r12] = r13;
        int r14 = r8 + 3;
        if (this.isDeviceCharging == false) goto L18;
        r3 = -128;
    L18:
        r0[r14] = r3;
        r0[r8 + 4] = CHexConver.intToByte(this.seq);
        return r0;
    L14:
        r13 = 0;
        goto L15
    L10:
        r11 = 0;
        goto L11
    L5:
        if (r9.length != 6) goto L7;
        System.arraycopy(r9, 0, r0, r8, r9.length);
        r8 = r7 + 7;
        goto L7
    }

    public int getPid() {
        return this.pid;
    }

    public int getRightDeviceQuantity() {
        return this.rightDeviceQuantity;
    }

    public int getSeq() {
        return this.seq;
    }

    public int getUid() {
        return this.uid;
    }

    public int getVersion() {
        return this.version;
    }

    public int getVid() {
        return this.vid;
    }

    public boolean isDeviceCharging() {
        return this.isDeviceCharging;
    }

    public boolean isLeftCharging() {
        return this.isLeftCharging;
    }

    public boolean isRightCharging() {
        return this.isRightCharging;
    }

    public boolean isShowDialog() {
        return this.showDialog;
    }

    public NotifyAdvInfoParam setAction(int r1) {
        this.action = r1;
        return this;
    }

    public NotifyAdvInfoParam setChargingBinQuantity(int r1) {
        this.chargingBinQuantity = r1;
        return this;
    }

    public NotifyAdvInfoParam setDeviceCharging(boolean r1) {
        this.isDeviceCharging = r1;
        return this;
    }

    public NotifyAdvInfoParam setDeviceType(int r1) {
        this.deviceType = r1;
        return this;
    }

    public NotifyAdvInfoParam setEdrAddr(String r1) {
        this.edrAddr = r1;
        return this;
    }

    public NotifyAdvInfoParam setLeftCharging(boolean r1) {
        this.isLeftCharging = r1;
        return this;
    }

    public NotifyAdvInfoParam setLeftDeviceQuantity(int r1) {
        this.leftDeviceQuantity = r1;
        return this;
    }

    public NotifyAdvInfoParam setPid(int r1) {
        this.pid = r1;
        return this;
    }

    public NotifyAdvInfoParam setRightCharging(boolean r1) {
        this.isRightCharging = r1;
        return this;
    }

    public NotifyAdvInfoParam setRightDeviceQuantity(int r1) {
        this.rightDeviceQuantity = r1;
        return this;
    }

    public NotifyAdvInfoParam setSeq(int r1) {
        this.seq = r1;
        return this;
    }

    public NotifyAdvInfoParam setShowDialog(boolean r1) {
        this.showDialog = r1;
        return this;
    }

    public NotifyAdvInfoParam setUid(int r1) {
        this.uid = r1;
        return this;
    }

    public NotifyAdvInfoParam setVersion(int r1) {
        this.version = r1;
        return this;
    }

    public NotifyAdvInfoParam setVid(int r1) {
        this.vid = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter
    public String toString() {
        return "NotifyAdvInfoParam{pid=" + this.pid + ", vid=" + this.vid + ", uid=" + this.uid + ", chipType=" + this.deviceType + ", version=" + this.version + ", showDialog=" + this.showDialog + ", edrAddr='" + this.edrAddr + "', seq=" + this.seq + ", action=" + this.action + ", leftDeviceQuantity=" + this.leftDeviceQuantity + ", isLeftCharging=" + this.isLeftCharging + ", rightDeviceQuantity=" + this.rightDeviceQuantity + ", isRightCharging=" + this.isRightCharging + ", chargingBinQuantity=" + this.chargingBinQuantity + ", isDeviceCharging=" + this.isDeviceCharging + "} ";
    }
}
