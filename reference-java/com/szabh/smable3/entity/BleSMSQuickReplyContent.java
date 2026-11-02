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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 61;

    @aa1
    private String mContent;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleSMSQuickReplyContent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleSMSQuickReplyContent copy$default(BleSMSQuickReplyContent bleSMSQuickReplyContent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleSMSQuickReplyContent.mContent;
        }
        return bleSMSQuickReplyContent.copy(str);
    }

    @aa1
    public final String component1() {
        return this.mContent;
    }

    @aa1
    public final BleSMSQuickReplyContent copy(@aa1 String mContent) {
        Intrinsics.X0O(mContent, "mContent");
        return new BleSMSQuickReplyContent(mContent);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(getMId());
        BleWritable.writeStringWithFix$default(this, this.mContent, 60, null, 4, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleSMSQuickReplyContent) && Intrinsics.XOO0ii0(this.mContent, ((BleSMSQuickReplyContent) obj).mContent);
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

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    @aa1
    public String toString() {
        return "BleSMSQuickReplyContent(mId='" + getMId() + "',mContent='" + this.mContent + "')";
    }

    public BleSMSQuickReplyContent(@aa1 String mContent) {
        Intrinsics.X0O(mContent, "mContent");
        this.mContent = mContent;
    }

    public /* synthetic */ BleSMSQuickReplyContent(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
