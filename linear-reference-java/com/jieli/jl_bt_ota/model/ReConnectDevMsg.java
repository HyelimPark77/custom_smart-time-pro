package com.jieli.jl_bt_ota.model;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public class ReConnectDevMsg {
    public static final int STATE_CONNECTING = 2;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SCANNING = 1;
    private String address;
    private boolean isUseADV;
    private int state;
    private int way;

    public ReConnectDevMsg(int r2, String r3) {
        this(r2, r3, false);
    }

    public boolean checkIsValid() {
        return CHexConver.checkBluetoothAddress(this.address);
    }

    public ReConnectDevMsg cloneObject() {
        return new ReConnectDevMsg(this.way, this.address, this.isUseADV).setState(this.state);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (getClass() != r5.getClass()) goto L15;
        ReConnectDevMsg r6 = (ReConnectDevMsg) r5;
        if (this.way != r6.way) goto L15;
        if (Objects.equals(this.address, r6.address) == false) goto L15;
        return true;
    }

    public String getAddress() {
        return this.address;
    }

    public int getState() {
        return this.state;
    }

    public int getWay() {
        return this.way;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.way), this.address});
    }

    public boolean isUseADV() {
        return this.isUseADV;
    }

    public ReConnectDevMsg setAddress(String r1) {
        this.address = r1;
        return this;
    }

    public ReConnectDevMsg setState(int r1) {
        this.state = r1;
        return this;
    }

    public ReConnectDevMsg setUseADV(boolean r1) {
        this.isUseADV = r1;
        return this;
    }

    public ReConnectDevMsg setWay(int r1) {
        this.way = r1;
        return this;
    }

    public String toString() {
        return "ReConnectDevMsg{way=" + this.way + ", address='" + this.address + "', isUseADV=" + this.isUseADV + ", state=" + this.state + i0XO1.IO;
    }

    public ReConnectDevMsg(int r1, String r2, boolean r3) {
        setWay(r1).setAddress(r2).setUseADV(r3);
    }
}
