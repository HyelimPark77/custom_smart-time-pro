package com.sma.smartv3.biz.voice;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(message = "")
public final class VoiceMessage {

    @aa1
    public static final Companion Companion = null;
    public static final int STATUS_FAIL = 2;
    public static final int STATUS_NORMAL = 0;
    public static final int STATUS_WAIT = 1;
    public static final int STATUS_WORKING = 3;
    public static final int TYPE_RECEIVED = 2;
    public static final int TYPE_RECEIVED_AUDIO = 3;
    public static final int TYPE_SEND = 1;
    public static final int TYPE_SEND_AUDIO = 4;
    public static final int TYPE_SYSTEM = 4;
    private int mAIMode;

    @aa1
    private String mContent;

    @aa1
    private String mExtraInfo;
    private final int mId;

    @aa1
    private String mLocalTime;
    private int mStatus;
    private int mType;

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

    public VoiceMessage() {
        int r1 = 0;
        String r2 = null;
        int r3 = 0;
        String r4 = null;
        String r5 = null;
        int r6 = 0;
        int r7 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ VoiceMessage copy$default(VoiceMessage r0, int r1, String r2, int r3, String r4, String r5, int r6, int r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mId;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mLocalTime;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.mType;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.mContent;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.mExtraInfo;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.mStatus;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.mAIMode;
    L23:
        int r10 = r6;
        int r11 = r7;
        String r12 = r4;
        String r13 = r5;
        int r14 = r3;
        int r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
    }

    public final int component1() {
        return this.mId;
    }

    @aa1
    public final String component2() {
        return this.mLocalTime;
    }

    public final int component3() {
        return this.mType;
    }

    @aa1
    public final String component4() {
        return this.mContent;
    }

    @aa1
    public final String component5() {
        return this.mExtraInfo;
    }

    public final int component6() {
        return this.mStatus;
    }

    public final int component7() {
        return this.mAIMode;
    }

    @aa1
    public final VoiceMessage copy(int r10, @aa1 String r11, int r12, @aa1 String r13, @aa1 String r14, int r15, int r16) {
        Intrinsics.X0O(r11, "mLocalTime");
        Intrinsics.X0O(r13, "mContent");
        Intrinsics.X0O(r14, "mExtraInfo");
        return new VoiceMessage(r10, r11, r12, r13, r14, r15, r16);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof VoiceMessage) == true) goto L8;
        return false;
    L8:
        VoiceMessage r6 = (VoiceMessage) r5;
        if (this.mId == r6.mId) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r6.mLocalTime) == true) goto L15;
        return false;
    L15:
        if (this.mType == r6.mType) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mContent, r6.mContent) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mExtraInfo, r6.mExtraInfo) == true) goto L24;
        return false;
    L24:
        if (this.mStatus == r6.mStatus) goto L27;
        return false;
    L27:
        if (this.mAIMode == r6.mAIMode) goto L29;
        return false;
    L29:
        return true;
    }

    public final int getMAIMode() {
        return this.mAIMode;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    @aa1
    public final String getMExtraInfo() {
        return this.mExtraInfo;
    }

    public final int getMId() {
        return this.mId;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    public final int getMStatus() {
        return this.mStatus;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mId) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mType)) * 31) + this.mContent.hashCode()) * 31) + this.mExtraInfo.hashCode()) * 31) + Integer.hashCode(this.mStatus)) * 31) + Integer.hashCode(this.mAIMode);
    }

    public final void setMAIMode(int r1) {
        this.mAIMode = r1;
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    public final void setMExtraInfo(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mExtraInfo = r2;
    }

    public final void setMLocalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocalTime = r2;
    }

    public final void setMStatus(int r1) {
        this.mStatus = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "VoiceMessage(mId=" + this.mId + ", mLocalTime=" + this.mLocalTime + ", mType=" + this.mType + ", mContent=" + this.mContent + ", mExtraInfo=" + this.mExtraInfo + ", mStatus=" + this.mStatus + ", mAIMode=" + this.mAIMode + I000IiI1O.iO.iO;
    }

    public VoiceMessage(int r2, @aa1 String r3, int r4, @aa1 String r5, @aa1 String r6, int r7, int r8) {
        Intrinsics.X0O(r3, "mLocalTime");
        Intrinsics.X0O(r5, "mContent");
        Intrinsics.X0O(r6, "mExtraInfo");
        this.mId = r2;
        this.mLocalTime = r3;
        this.mType = r4;
        this.mContent = r5;
        this.mExtraInfo = r6;
        this.mStatus = r7;
        this.mAIMode = r8;
    }

    public /* synthetic */ VoiceMessage(int r3, String r4, int r5, String r6, String r7, int r8, int r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r10 & 32) == 0) goto L21;
        r8 = 0;
    L21:
        if ((r10 & 64) == 0) goto L23;
        r9 = -1;
    L23:
        int r12 = r9;
        int r13 = r8;
        String r14 = r7;
        String r15 = r6;
        int r16 = r5;
        this(r3, r4, r16, r15, r14, r13, r12);
    }
}
