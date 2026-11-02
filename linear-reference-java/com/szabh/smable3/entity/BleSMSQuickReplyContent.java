package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSMSQuickReplyContent extends BleIdObject {
    public static final int CONTENT_MAX_LENGTH = 60;

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 61;

    @aa1
    private String mContent;

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
    public BleSMSQuickReplyContent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleSMSQuickReplyContent copy$default(BleSMSQuickReplyContent r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mContent;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final String component1() {
        return this.mContent;
    }

    @aa1
    public final BleSMSQuickReplyContent copy(@aa1 String r2) {
        Intrinsics.X0O(r2, "mContent");
        return new BleSMSQuickReplyContent(r2);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(getMId());
        BleWritable.writeStringWithFix$default(this, this.mContent, 60, null, 4, null);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleSMSQuickReplyContent) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mContent, ((BleSMSQuickReplyContent) r4).mContent) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 61;
    }

    public int hashCode() {
        return this.mContent.hashCode();
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    @aa1
    public String toString() {
        return "BleSMSQuickReplyContent(mId='" + getMId() + "',mContent='" + this.mContent + "')";
    }

    public BleSMSQuickReplyContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "mContent");
        this.mContent = r2;
    }

    public /* synthetic */ BleSMSQuickReplyContent(String r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
