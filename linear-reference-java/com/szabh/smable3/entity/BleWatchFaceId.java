package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWatchFaceId extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final long WATCHFACE_ID_INVALID = 4294967295L;

    @aa1
    private List<Integer> mIdList;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleWatchFaceId() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleWatchFaceId copy$default(BleWatchFaceId r0, List r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mIdList;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final List<Integer> component1() {
        return this.mIdList;
    }

    @aa1
    public final BleWatchFaceId copy(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "mIdList");
        return new BleWatchFaceId(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        byte[] r0 = getMBytes();
        if (r0 == null) goto L9;
        int r1 = r0.length / 4;
        if (r1 == 0) goto L11;
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L12;
        this.mIdList.add(Integer.valueOf(BleReadable.readInt32$default(this, null, 1, null)));
        r2 = r2 + 1;
        goto L7
    L12:
        return;
    L11:
        return;
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleWatchFaceId) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mIdList, ((BleWatchFaceId) r4).mIdList) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final List<Integer> getMIdList() {
        return this.mIdList;
    }

    public int hashCode() {
        return this.mIdList.hashCode();
    }

    public final void setMIdList(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mIdList = r2;
    }

    @aa1
    public String toString() {
        return "BleWatchFaceId(mIdList=" + this.mIdList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWatchFaceId(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "mIdList");
        this.mIdList = r2;
    }

    public /* synthetic */ BleWatchFaceId(List r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = new ArrayList();
    L5:
        this(r1);
    }
}
