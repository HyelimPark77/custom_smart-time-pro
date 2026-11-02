package com.jieli.jl_rcsp.model.device.settings.v0;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class DialExpandInfo extends SettingFunction {
    public static final Parcelable.Creator<DialExpandInfo> CREATOR = null;
    public static final int SHAPE_CIRCULAR = 1;
    public static final int SHAPE_RECTANGLE = 2;
    public static final int SHAPE_ROUNDED_RECTANGLE = 3;
    private int color;
    private int radius;
    private int shape;

    static {
        CREATOR = new AnonymousClass1();
    }

    public DialExpandInfo(byte[] r1) {
        super(r1);
    }

    public static int argb(byte r0, byte r1, byte r2, byte r3) {
        return Color.argb(r0 & 255, r1 & 255, r2 & 255, r3 & 255);
    }

    public static byte[] int2Argb(int r0) {
        return CHexConver.intToBigBytes(r0);
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getColor() {
        return this.color;
    }

    public int getRadius() {
        return this.radius;
    }

    public int getShape() {
        return this.shape;
    }

    public boolean isCircular() {
        if (this.shape > 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] r8) {
        int r9 = super.parse(r8);
        if (r9 <= 0) goto L7;
        byte[] r0 = getPayload();
        if (r0.length < 7) goto L7;
        this.shape = CHexConver.byteToInt(r0[0]);
        this.radius = CHexConver.bytesToInt(r0, 1, 2);
        byte[] r5 = new byte[4];
        System.arraycopy(r0, 3, r5, 0, 4);
        this.color = argb(r5[0], r5[1], r5[2], r5[3]);
        return r9;
    L7:
        return r9;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData
    public String toString() {
        return "DialExpandInfo{shape=" + this.shape + ", radius=" + this.radius + ", color=" + this.color + i0XO1.IO;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData, android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.shape);
        r1.writeInt(this.radius);
        r1.writeInt(this.color);
    }

    public DialExpandInfo() {
        super(7, 0, 0, new byte[0]);
    }

    public DialExpandInfo(Parcel r2) {
        super(r2);
        this.shape = r2.readInt();
        this.radius = r2.readInt();
        this.color = r2.readInt();
    }
}
