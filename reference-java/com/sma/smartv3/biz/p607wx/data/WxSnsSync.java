package com.sma.smartv3.biz.p607wx.data;

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

    public WxSnsSync(int i, @aa1 String SnsSyncKey, int i2) {
        Intrinsics.X0O(SnsSyncKey, "SnsSyncKey");
        this.ContinueFlag = i;
        this.SnsSyncKey = SnsSyncKey;
        this.SnsCount = i2;
    }

    public static /* synthetic */ WxSnsSync copy$default(WxSnsSync wxSnsSync, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = wxSnsSync.ContinueFlag;
        }
        if ((i3 & 2) != 0) {
            str = wxSnsSync.SnsSyncKey;
        }
        if ((i3 & 4) != 0) {
            i2 = wxSnsSync.SnsCount;
        }
        return wxSnsSync.copy(i, str, i2);
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
    public final WxSnsSync copy(int i, @aa1 String SnsSyncKey, int i2) {
        Intrinsics.X0O(SnsSyncKey, "SnsSyncKey");
        return new WxSnsSync(i, SnsSyncKey, i2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WxSnsSync)) {
            return false;
        }
        WxSnsSync wxSnsSync = (WxSnsSync) obj;
        return this.ContinueFlag == wxSnsSync.ContinueFlag && Intrinsics.XOO0ii0(this.SnsSyncKey, wxSnsSync.SnsSyncKey) && this.SnsCount == wxSnsSync.SnsCount;
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
        return "WxSnsSync(ContinueFlag=" + this.ContinueFlag + ", SnsSyncKey=" + this.SnsSyncKey + ", SnsCount=" + this.SnsCount + I000IiI1O.C2156iO.f1007iO;
    }
}
