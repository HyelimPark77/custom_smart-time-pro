package com.sma.smartv3.biz.wx.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WxSnsSync extends JsonFieldContainer implements Serializable {
    private final int ContinueFlag;
    private final int SnsCount;

    @aa1
    private final String SnsSyncKey;

    public WxSnsSync(int r2, @aa1 String r3, int r4) {
        Intrinsics.X0O(r3, "SnsSyncKey");
        this.ContinueFlag = r2;
        this.SnsSyncKey = r3;
        this.SnsCount = r4;
    }

    public static /* synthetic */ WxSnsSync copy$default(WxSnsSync r0, int r1, String r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.ContinueFlag;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.SnsSyncKey;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.SnsCount;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.ContinueFlag;
    }

    @aa1
    public final String component2() {
        return this.SnsSyncKey;
    }

    public final int component3() {
        return this.SnsCount;
    }

    @aa1
    public final WxSnsSync copy(int r2, @aa1 String r3, int r4) {
        Intrinsics.X0O(r3, "SnsSyncKey");
        return new WxSnsSync(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WxSnsSync) == true) goto L8;
        return false;
    L8:
        WxSnsSync r6 = (WxSnsSync) r5;
        if (this.ContinueFlag == r6.ContinueFlag) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.SnsSyncKey, r6.SnsSyncKey) == true) goto L15;
        return false;
    L15:
        if (this.SnsCount == r6.SnsCount) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getContinueFlag() {
        return this.ContinueFlag;
    }

    public final int getSnsCount() {
        return this.SnsCount;
    }

    @aa1
    public final String getSnsSyncKey() {
        return this.SnsSyncKey;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.ContinueFlag) * 31) + this.SnsSyncKey.hashCode()) * 31) + Integer.hashCode(this.SnsCount);
    }

    @aa1
    public String toString() {
        return "WxSnsSync(ContinueFlag=" + this.ContinueFlag + ", SnsSyncKey=" + this.SnsSyncKey + ", SnsCount=" + this.SnsCount + I000IiI1O.iO.iO;
    }
}
