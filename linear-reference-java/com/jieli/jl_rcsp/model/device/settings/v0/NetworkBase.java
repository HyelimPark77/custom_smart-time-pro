package com.jieli.jl_rcsp.model.device.settings.v0;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.interfaces.cmd.IDataOp;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class NetworkBase implements IDataOp, Parcelable {
    public static final Parcelable.Creator<NetworkBase> CREATOR = null;
    public static final int TYPE_NETWORK_INFO = 0;
    public static final int TYPE_OTA_STATE = 1;
    protected int type;

    static {
        CREATOR = new AnonymousClass1();
    }

    public NetworkBase(byte[] r1) {
        parse(r1);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getType() {
        return this.type;
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] r3) {
        this.type = -1;
        if (r3 != null) goto L5;
    L9:
        return 0;
    L5:
        if (r3.length == 0) goto L9;
        this.type = CHexConver.byteToInt(r3[0]);
        return 1;
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public byte[] toData() {
        return new byte[]{(byte) this.type};
    }

    public String toString() {
        return "NetworkBase{type=" + this.type + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.type);
    }

    public NetworkBase(int r1) {
        this.type = r1;
    }

    public NetworkBase(Parcel r1) {
        this.type = r1.readInt();
    }
}
