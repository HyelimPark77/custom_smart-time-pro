package com.jieli.jl_rcsp.model.device.settings.v0;

import android.os.Parcel;
import android.os.Parcelable;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionResource extends SettingFunction {
    public static final Parcelable.Creator<FunctionResource> CREATOR = null;
    public static final int FUNC_BOOT_ANIM = 2;
    public static final int FUNC_SCREEN_SAVERS = 1;
    private ResourceInfo resourceInfo;
    private int subFunction;

    static {
        CREATOR = new AnonymousClass1();
    }

    public FunctionResource(byte[] r1) {
        super(r1);
    }

    public static byte[] convertPayload(int r1, ResourceInfo r2) {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(r1);     // Catch: Exception -> L7
        if (r2 == null) goto L10;
        r0.write(r2.toData());     // Catch: Exception -> L7
    L10:
        return r0.toByteArray();
    L7:
        e = move-exception;
        e.printStackTrace();
        goto L10
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ResourceInfo getResourceInfo() {
        return this.resourceInfo;
    }

    public int getSubFunction() {
        return this.subFunction;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] r6) {
        int r7 = super.parse(r6);
        if (r7 == 0) goto L11;
        byte[] r0 = getPayload();
        if (r0.length == 0) goto L11;
        this.subFunction = CHexConver.byteToInt(r0[0]);
        if (r0.length <= 1) goto L11;
        int r2 = r0.length - 1;
        byte[] r4 = new byte[r2];
        System.arraycopy(r0, 1, r4, 0, r2);
        this.resourceInfo = new ResourceInfo(r4);
    L11:
        return r7;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData, android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        super.writeToParcel(r2, r3);
        r2.writeInt(this.subFunction);
        r2.writeParcelable(this.resourceInfo, r3);
    }

    public FunctionResource(int r4, int r5, ResourceInfo r6) {
        super(4, 0, r4, convertPayload(r5, r6));
        this.subFunction = r5;
        this.resourceInfo = r6;
    }

    public FunctionResource(Parcel r2) {
        super(r2);
        this.subFunction = r2.readInt();
        this.resourceInfo = (ResourceInfo) r2.readParcelable(ResourceInfo.class.getClassLoader());
    }
}
