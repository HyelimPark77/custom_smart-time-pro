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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public VoiceMessage() {
        this(0, null, 0, null, null, 0, 0, 127, null);
    }

    public static /* synthetic */ VoiceMessage copy$default(VoiceMessage voiceMessage, int i, String str, int i2, String str2, String str3, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = voiceMessage.mId;
        }
        if ((i5 & 2) != 0) {
            str = voiceMessage.mLocalTime;
        }
        if ((i5 & 4) != 0) {
            i2 = voiceMessage.mType;
        }
        if ((i5 & 8) != 0) {
            str2 = voiceMessage.mContent;
        }
        if ((i5 & 16) != 0) {
            str3 = voiceMessage.mExtraInfo;
        }
        if ((i5 & 32) != 0) {
            i3 = voiceMessage.mStatus;
        }
        if ((i5 & 64) != 0) {
            i4 = voiceMessage.mAIMode;
        }
        int i6 = i3;
        int i7 = i4;
        String str4 = str3;
        int i8 = i2;
        return voiceMessage.copy(i, str, i8, str2, str4, i6, i7);
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
    public final VoiceMessage copy(int i, @aa1 String mLocalTime, int i2, @aa1 String mContent, @aa1 String mExtraInfo, int i3, int i4) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mContent, "mContent");
        Intrinsics.X0O(mExtraInfo, "mExtraInfo");
        return new VoiceMessage(i, mLocalTime, i2, mContent, mExtraInfo, i3, i4);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceMessage)) {
            return false;
        }
        VoiceMessage voiceMessage = (VoiceMessage) obj;
        return this.mId == voiceMessage.mId && Intrinsics.XOO0ii0(this.mLocalTime, voiceMessage.mLocalTime) && this.mType == voiceMessage.mType && Intrinsics.XOO0ii0(this.mContent, voiceMessage.mContent) && Intrinsics.XOO0ii0(this.mExtraInfo, voiceMessage.mExtraInfo) && this.mStatus == voiceMessage.mStatus && this.mAIMode == voiceMessage.mAIMode;
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

    public final void setMAIMode(int i) {
        this.mAIMode = i;
    }

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    public final void setMExtraInfo(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mExtraInfo = str;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMStatus(int i) {
        this.mStatus = i;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "VoiceMessage(mId=" + this.mId + ", mLocalTime=" + this.mLocalTime + ", mType=" + this.mType + ", mContent=" + this.mContent + ", mExtraInfo=" + this.mExtraInfo + ", mStatus=" + this.mStatus + ", mAIMode=" + this.mAIMode + I000IiI1O.C2156iO.f1007iO;
    }

    public VoiceMessage(int i, @aa1 String mLocalTime, int i2, @aa1 String mContent, @aa1 String mExtraInfo, int i3, int i4) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mContent, "mContent");
        Intrinsics.X0O(mExtraInfo, "mExtraInfo");
        this.mId = i;
        this.mLocalTime = mLocalTime;
        this.mType = i2;
        this.mContent = mContent;
        this.mExtraInfo = mExtraInfo;
        this.mStatus = i3;
        this.mAIMode = i4;
    }

    public /* synthetic */ VoiceMessage(int i, String str, int i2, String str2, String str3, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? "" : str2, (i5 & 16) != 0 ? "" : str3, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? -1 : i4);
    }
}
