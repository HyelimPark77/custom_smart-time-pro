package com.jieli.jl_rcsp.model.device.settings.v0;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class NetworkInfo extends NetworkBase {
    public static final Parcelable.Creator<NetworkInfo> CREATOR = null;
    private boolean isMandatoryOTA;
    private int startOtaTimeout;
    private int stopOtaTimeout;
    private String version;
    private int vid;

    static {
        CREATOR = new AnonymousClass1();
    }

    public NetworkInfo(byte[] r1) {
        super(r1);
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.NetworkBase, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getStartOtaTimeout() {
        return this.startOtaTimeout;
    }

    public int getStopOtaTimeout() {
        return this.stopOtaTimeout;
    }

    public String getVersion() {
        return this.version;
    }

    public int getVid() {
        return this.vid;
    }

    public boolean isMandatoryOTA() {
        return this.isMandatoryOTA;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.NetworkBase, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] r6) {
        this.type = -1;
        this.vid = -1;
        this.version = "";
        this.startOtaTimeout = 60;
        this.stopOtaTimeout = 240;
        boolean r0 = false;
        if (r6 == null) goto L23;
        int r2 = 4;
        if (r6.length < 4) goto L23;
        this.type = CHexConver.byteToInt(r6[0]);
        this.vid = CHexConver.byteToInt(r6[1]);
        if (CHexConver.byteToInt(r6[2]) != 1) goto L10;
        r0 = true;
    L10:
        this.isMandatoryOTA = r0;
        int r1 = CHexConver.byteToInt(r6[3]);
        int r3 = r1 + 4;
        if (r3 <= r6.length) goto L24;
    L16:
        int r4 = r2 + 2;
        if (r4 > r6.length) goto L19;
        this.startOtaTimeout = CHexConver.bytesToInt(r6, r2, 2);
        r2 = r4;
    L19:
        int r5 = r2 + 2;
        if (r5 > r6.length) goto L26;
        this.stopOtaTimeout = CHexConver.bytesToInt(r6, r2, 2);
        return r5;
    L26:
        return r2;
    L24:
        this.version = new String(r6, 4, r1);     // Catch: Exception -> L14
        r2 = r3;
    L14:
        e = move-exception;
        e.printStackTrace();
    L23:
        return 0;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.NetworkBase, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(this.type);     // Catch: IOException -> L10
        r0.write(this.vid);     // Catch: IOException -> L10
        r0.write(this.isMandatoryOTA ? 1 : 0);     // Catch: IOException -> L10
        String r1 = this.version;     // Catch: IOException -> L10
        if (r1 != null) goto L6;
        int r2 = 0;
    L7:
        r0.write(r2);     // Catch: IOException -> L10
        if (r2 <= 0) goto L12;
        r0.write(this.version.getBytes());     // Catch: IOException -> L10
    L12:
        r0.write(CHexConver.int2byte2(this.startOtaTimeout));     // Catch: IOException -> L10
        r0.write(CHexConver.int2byte2(this.stopOtaTimeout));     // Catch: IOException -> L10
    L16:
        return r0.toByteArray();
    L6:
        r2 = r1.getBytes().length;     // Catch: IOException -> L10
    L10:
        e = move-exception;
        e.printStackTrace();
        goto L16
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.NetworkBase
    public String toString() {
        return "NetworkInfo{vid=" + this.vid + ", isMandatoryOTA=" + this.isMandatoryOTA + ", version='" + this.version + "', startOtaTimeout=" + this.startOtaTimeout + ", stopOtaTimeout=" + this.stopOtaTimeout + i0XO1.IO;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.NetworkBase, android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.vid);
        r1.writeInt(this.isMandatoryOTA ? 1 : 0);
        r1.writeString(this.version);
        r1.writeInt(this.startOtaTimeout);
        r1.writeInt(this.stopOtaTimeout);
    }

    public NetworkInfo(int r2, boolean r3, String r4, int r5, int r6) {
        super(0);
        this.vid = r2;
        this.isMandatoryOTA = r3;
        if (r4 != null) goto L5;
        r4 = "";
    L5:
        this.version = r4;
        this.startOtaTimeout = r5;
        this.stopOtaTimeout = r6;
    }

    public NetworkInfo(Parcel r3) {
        super(r3);
        this.vid = r3.readInt();
        boolean r1 = true;
        if (r3.readInt() == 1) goto L6;
        r1 = false;
    L6:
        this.isMandatoryOTA = r1;
        this.version = r3.readString();
        this.startOtaTimeout = r3.readInt();
        this.stopOtaTimeout = r3.readInt();
    }
}
