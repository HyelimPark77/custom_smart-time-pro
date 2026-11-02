package com.jieli.jl_rcsp.model.device.settings.v0;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class NetworkOTAState extends NetworkBase {
    public static final Parcelable.Creator<NetworkOTAState> CREATOR = null;
    public static final int RESULT_UPGRADE_FAILED = 1;
    public static final int RESULT_UPGRADE_SUCCESS = 0;
    public static final int RESULT_UPGRADE_TIMEOUT = 2;
    public static final int STATE_TRANSFERRING = 2;
    public static final int STATE_UPGRADE_END = 0;
    public static final int STATE_UPGRADE_START = 1;
    private int code;
    private int state;

    static {
        CREATOR = new AnonymousClass1();
    }

    public NetworkOTAState(byte[] r1) {
        super(r1);
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.NetworkBase, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.code;
    }

    public int getState() {
        return this.state;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.NetworkBase, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] r4) {
        this.type = -1;
        this.state = -1;
        this.code = -1;
        if (r4 != null) goto L5;
    L12:
        return 0;
    L5:
        if (r4.length < 2) goto L12;
        this.type = CHexConver.byteToInt(r4[0]);
        this.state = CHexConver.byteToInt(r4[1]);
        if (r4.length <= 2) goto L11;
        this.code = CHexConver.byteToInt(r4[2]);
        return 3;
    L11:
        return 2;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.NetworkBase, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public byte[] toData() {
        int r3 = this.state;
        if (r3 != 0) goto L7;
        return new byte[]{(byte) this.type, (byte) r3, (byte) this.code};
    L7:
        return new byte[]{(byte) this.type, (byte) r3};
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.NetworkBase
    public String toString() {
        return "NetworkOTAState{state=" + this.state + ", code=" + this.code + i0XO1.IO;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.NetworkBase, android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.state);
        r1.writeInt(this.code);
    }

    public NetworkOTAState(int r2, int r3) {
        super(1);
        this.state = r2;
        this.code = r3;
    }

    public NetworkOTAState(Parcel r2) {
        super(r2);
        this.state = r2.readInt();
        this.code = r2.readInt();
    }
}
