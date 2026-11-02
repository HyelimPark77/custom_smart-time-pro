package com.jieli.jl_rcsp.model.device.settings.v0;

import android.os.Parcel;
import android.os.Parcelable;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class NetworkOTA extends NetworkBase {
    public static final Parcelable.Creator<NetworkOTA> CREATOR = null;
    private int dataSize;

    static {
        CREATOR = new AnonymousClass1();
    }

    public NetworkOTA(byte[] r1) {
        super(r1);
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.NetworkBase, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDataSize() {
        return this.dataSize;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.NetworkBase, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] r4) {
        this.dataSize = 0;
        if (r4 != null) goto L5;
    L9:
        return 0;
    L5:
        if (r4.length < 4) goto L9;
        this.dataSize = CHexConver.bytesToInt(r4, 0, 4);
        return 4;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.NetworkBase, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public byte[] toData() {
        return CHexConver.intToBigBytes(this.dataSize);
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.NetworkBase, android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.dataSize);
    }

    public NetworkOTA(int r2) {
        super(-1);
        this.dataSize = r2;
    }

    public NetworkOTA(Parcel r1) {
        super(r1);
        this.dataSize = r1.readInt();
    }
}
