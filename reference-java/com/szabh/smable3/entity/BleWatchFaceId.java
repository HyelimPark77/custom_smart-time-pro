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
    public static final Companion Companion = new Companion(null);
    public static final long WATCHFACE_ID_INVALID = 4294967295L;

    @aa1
    private List<Integer> mIdList;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleWatchFaceId() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleWatchFaceId copy$default(BleWatchFaceId bleWatchFaceId, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bleWatchFaceId.mIdList;
        }
        return bleWatchFaceId.copy(list);
    }

    @aa1
    public final List<Integer> component1() {
        return this.mIdList;
    }

    @aa1
    public final BleWatchFaceId copy(@aa1 List<Integer> mIdList) {
        Intrinsics.X0O(mIdList, "mIdList");
        return new BleWatchFaceId(mIdList);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        int length;
        super.decode();
        byte[] mBytes = getMBytes();
        if (mBytes == null || (length = mBytes.length / 4) == 0) {
            return;
        }
        for (int i = 0; i < length; i++) {
            this.mIdList.add(Integer.valueOf(BleReadable.readInt32$default(this, null, 1, null)));
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleWatchFaceId) && Intrinsics.XOO0ii0(this.mIdList, ((BleWatchFaceId) obj).mIdList);
    }

    @aa1
    public final List<Integer> getMIdList() {
        return this.mIdList;
    }

    public int hashCode() {
        return this.mIdList.hashCode();
    }

    public final void setMIdList(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mIdList = list;
    }

    @aa1
    public String toString() {
        return "BleWatchFaceId(mIdList=" + this.mIdList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWatchFaceId(@aa1 List<Integer> mIdList) {
        Intrinsics.X0O(mIdList, "mIdList");
        this.mIdList = mIdList;
    }

    public /* synthetic */ BleWatchFaceId(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
