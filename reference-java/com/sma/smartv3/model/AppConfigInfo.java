package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AppConfigInfo extends JsonFieldContainer {

    @aa1
    private String aiPrompt;

    @aa1
    private String supAdsc_;

    @aa1
    private String supComment;

    @aa1
    private String supCreate;

    @aa1
    private String supMember;

    public AppConfigInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AppConfigInfo copy$default(AppConfigInfo appConfigInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appConfigInfo.supComment;
        }
        if ((i & 2) != 0) {
            str2 = appConfigInfo.supCreate;
        }
        if ((i & 4) != 0) {
            str3 = appConfigInfo.supMember;
        }
        if ((i & 8) != 0) {
            str4 = appConfigInfo.aiPrompt;
        }
        if ((i & 16) != 0) {
            str5 = appConfigInfo.supAdsc_;
        }
        String str6 = str5;
        String str7 = str3;
        return appConfigInfo.copy(str, str2, str7, str4, str6);
    }

    @aa1
    public final String component1() {
        return this.supComment;
    }

    @aa1
    public final String component2() {
        return this.supCreate;
    }

    @aa1
    public final String component3() {
        return this.supMember;
    }

    @aa1
    public final String component4() {
        return this.aiPrompt;
    }

    @aa1
    public final String component5() {
        return this.supAdsc_;
    }

    @aa1
    public final AppConfigInfo copy(@aa1 String supComment, @aa1 String supCreate, @aa1 String supMember, @aa1 String aiPrompt, @aa1 String supAdsc_) {
        Intrinsics.X0O(supComment, "supComment");
        Intrinsics.X0O(supCreate, "supCreate");
        Intrinsics.X0O(supMember, "supMember");
        Intrinsics.X0O(aiPrompt, "aiPrompt");
        Intrinsics.X0O(supAdsc_, "supAdsc_");
        return new AppConfigInfo(supComment, supCreate, supMember, aiPrompt, supAdsc_);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppConfigInfo)) {
            return false;
        }
        AppConfigInfo appConfigInfo = (AppConfigInfo) obj;
        return Intrinsics.XOO0ii0(this.supComment, appConfigInfo.supComment) && Intrinsics.XOO0ii0(this.supCreate, appConfigInfo.supCreate) && Intrinsics.XOO0ii0(this.supMember, appConfigInfo.supMember) && Intrinsics.XOO0ii0(this.aiPrompt, appConfigInfo.aiPrompt) && Intrinsics.XOO0ii0(this.supAdsc_, appConfigInfo.supAdsc_);
    }

    @aa1
    public final String getAiPrompt() {
        return this.aiPrompt;
    }

    @aa1
    public final String getSupAdsc_() {
        return this.supAdsc_;
    }

    @aa1
    public final String getSupComment() {
        return this.supComment;
    }

    @aa1
    public final String getSupCreate() {
        return this.supCreate;
    }

    @aa1
    public final String getSupMember() {
        return this.supMember;
    }

    public int hashCode() {
        return (((((((this.supComment.hashCode() * 31) + this.supCreate.hashCode()) * 31) + this.supMember.hashCode()) * 31) + this.aiPrompt.hashCode()) * 31) + this.supAdsc_.hashCode();
    }

    public final void setAiPrompt(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.aiPrompt = str;
    }

    public final void setSupAdsc_(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.supAdsc_ = str;
    }

    public final void setSupComment(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.supComment = str;
    }

    public final void setSupCreate(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.supCreate = str;
    }

    public final void setSupMember(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.supMember = str;
    }

    @aa1
    public String toString() {
        return "AppConfigInfo(supComment=" + this.supComment + ", supCreate=" + this.supCreate + ", supMember=" + this.supMember + ", aiPrompt=" + this.aiPrompt + ", supAdsc_=" + this.supAdsc_ + I000IiI1O.C2156iO.f1007iO;
    }

    public AppConfigInfo(@aa1 String supComment, @aa1 String supCreate, @aa1 String supMember, @aa1 String aiPrompt, @aa1 String supAdsc_) {
        Intrinsics.X0O(supComment, "supComment");
        Intrinsics.X0O(supCreate, "supCreate");
        Intrinsics.X0O(supMember, "supMember");
        Intrinsics.X0O(aiPrompt, "aiPrompt");
        Intrinsics.X0O(supAdsc_, "supAdsc_");
        this.supComment = supComment;
        this.supCreate = supCreate;
        this.supMember = supMember;
        this.aiPrompt = aiPrompt;
        this.supAdsc_ = supAdsc_;
    }

    public /* synthetic */ AppConfigInfo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? "1" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "0" : str5);
    }
}
