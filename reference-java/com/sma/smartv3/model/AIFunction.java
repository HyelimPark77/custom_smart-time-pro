package com.sma.smartv3.model;

import android.content.Intent;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AIFunction implements Serializable {

    /* JADX INFO: renamed from: bg */
    private int f51293bg;

    @aa1
    private String desc;
    private int detailsBg;

    @aa1
    private String detailsDescribe;

    @aa1
    private String detailsExample;

    @aa1
    private String detailsHint;

    @aa1
    private String detailsQuestion;
    private int icon;

    @tb1
    private transient Intent intent;
    private boolean isHot;

    @aa1
    private String title;

    @aa1
    private AIFunctionType type;

    public AIFunction(@aa1 AIFunctionType type, @aa1 String title, int i, @aa1 String desc, int i2, int i3, @aa1 String detailsDescribe, @aa1 String detailsHint, @aa1 String detailsExample, @aa1 String detailsQuestion, boolean z, @tb1 Intent intent) {
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(title, "title");
        Intrinsics.X0O(desc, "desc");
        Intrinsics.X0O(detailsDescribe, "detailsDescribe");
        Intrinsics.X0O(detailsHint, "detailsHint");
        Intrinsics.X0O(detailsExample, "detailsExample");
        Intrinsics.X0O(detailsQuestion, "detailsQuestion");
        this.type = type;
        this.title = title;
        this.f51293bg = i;
        this.desc = desc;
        this.icon = i2;
        this.detailsBg = i3;
        this.detailsDescribe = detailsDescribe;
        this.detailsHint = detailsHint;
        this.detailsExample = detailsExample;
        this.detailsQuestion = detailsQuestion;
        this.isHot = z;
        this.intent = intent;
    }

    public static /* synthetic */ AIFunction copy$default(AIFunction aIFunction, AIFunctionType aIFunctionType, String str, int i, String str2, int i2, int i3, String str3, String str4, String str5, String str6, boolean z, Intent intent, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aIFunctionType = aIFunction.type;
        }
        if ((i4 & 2) != 0) {
            str = aIFunction.title;
        }
        if ((i4 & 4) != 0) {
            i = aIFunction.f51293bg;
        }
        if ((i4 & 8) != 0) {
            str2 = aIFunction.desc;
        }
        if ((i4 & 16) != 0) {
            i2 = aIFunction.icon;
        }
        if ((i4 & 32) != 0) {
            i3 = aIFunction.detailsBg;
        }
        if ((i4 & 64) != 0) {
            str3 = aIFunction.detailsDescribe;
        }
        if ((i4 & 128) != 0) {
            str4 = aIFunction.detailsHint;
        }
        if ((i4 & 256) != 0) {
            str5 = aIFunction.detailsExample;
        }
        if ((i4 & 512) != 0) {
            str6 = aIFunction.detailsQuestion;
        }
        if ((i4 & 1024) != 0) {
            z = aIFunction.isHot;
        }
        if ((i4 & 2048) != 0) {
            intent = aIFunction.intent;
        }
        boolean z2 = z;
        Intent intent2 = intent;
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        int i5 = i2;
        int i6 = i3;
        return aIFunction.copy(aIFunctionType, str, i, str2, i5, i6, str9, str10, str7, str8, z2, intent2);
    }

    @aa1
    public final AIFunctionType component1() {
        return this.type;
    }

    @aa1
    public final String component10() {
        return this.detailsQuestion;
    }

    public final boolean component11() {
        return this.isHot;
    }

    @tb1
    public final Intent component12() {
        return this.intent;
    }

    @aa1
    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.f51293bg;
    }

    @aa1
    public final String component4() {
        return this.desc;
    }

    public final int component5() {
        return this.icon;
    }

    public final int component6() {
        return this.detailsBg;
    }

    @aa1
    public final String component7() {
        return this.detailsDescribe;
    }

    @aa1
    public final String component8() {
        return this.detailsHint;
    }

    @aa1
    public final String component9() {
        return this.detailsExample;
    }

    @aa1
    public final AIFunction copy(@aa1 AIFunctionType type, @aa1 String title, int i, @aa1 String desc, int i2, int i3, @aa1 String detailsDescribe, @aa1 String detailsHint, @aa1 String detailsExample, @aa1 String detailsQuestion, boolean z, @tb1 Intent intent) {
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(title, "title");
        Intrinsics.X0O(desc, "desc");
        Intrinsics.X0O(detailsDescribe, "detailsDescribe");
        Intrinsics.X0O(detailsHint, "detailsHint");
        Intrinsics.X0O(detailsExample, "detailsExample");
        Intrinsics.X0O(detailsQuestion, "detailsQuestion");
        return new AIFunction(type, title, i, desc, i2, i3, detailsDescribe, detailsHint, detailsExample, detailsQuestion, z, intent);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIFunction)) {
            return false;
        }
        AIFunction aIFunction = (AIFunction) obj;
        return this.type == aIFunction.type && Intrinsics.XOO0ii0(this.title, aIFunction.title) && this.f51293bg == aIFunction.f51293bg && Intrinsics.XOO0ii0(this.desc, aIFunction.desc) && this.icon == aIFunction.icon && this.detailsBg == aIFunction.detailsBg && Intrinsics.XOO0ii0(this.detailsDescribe, aIFunction.detailsDescribe) && Intrinsics.XOO0ii0(this.detailsHint, aIFunction.detailsHint) && Intrinsics.XOO0ii0(this.detailsExample, aIFunction.detailsExample) && Intrinsics.XOO0ii0(this.detailsQuestion, aIFunction.detailsQuestion) && this.isHot == aIFunction.isHot && Intrinsics.XOO0ii0(this.intent, aIFunction.intent);
    }

    public final int getBg() {
        return this.f51293bg;
    }

    @aa1
    public final String getDesc() {
        return this.desc;
    }

    public final int getDetailsBg() {
        return this.detailsBg;
    }

    @aa1
    public final String getDetailsDescribe() {
        return this.detailsDescribe;
    }

    @aa1
    public final String getDetailsExample() {
        return this.detailsExample;
    }

    @aa1
    public final String getDetailsHint() {
        return this.detailsHint;
    }

    @aa1
    public final String getDetailsQuestion() {
        return this.detailsQuestion;
    }

    public final int getIcon() {
        return this.icon;
    }

    @tb1
    public final Intent getIntent() {
        return this.intent;
    }

    @aa1
    public final String getTitle() {
        return this.title;
    }

    @aa1
    public final AIFunctionType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.f51293bg)) * 31) + this.desc.hashCode()) * 31) + Integer.hashCode(this.icon)) * 31) + Integer.hashCode(this.detailsBg)) * 31) + this.detailsDescribe.hashCode()) * 31) + this.detailsHint.hashCode()) * 31) + this.detailsExample.hashCode()) * 31) + this.detailsQuestion.hashCode()) * 31) + Boolean.hashCode(this.isHot)) * 31;
        Intent intent = this.intent;
        return iHashCode + (intent == null ? 0 : intent.hashCode());
    }

    public final boolean isHot() {
        return this.isHot;
    }

    public final void setBg(int i) {
        this.f51293bg = i;
    }

    public final void setDesc(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.desc = str;
    }

    public final void setDetailsBg(int i) {
        this.detailsBg = i;
    }

    public final void setDetailsDescribe(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.detailsDescribe = str;
    }

    public final void setDetailsExample(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.detailsExample = str;
    }

    public final void setDetailsHint(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.detailsHint = str;
    }

    public final void setDetailsQuestion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.detailsQuestion = str;
    }

    public final void setHot(boolean z) {
        this.isHot = z;
    }

    public final void setIcon(int i) {
        this.icon = i;
    }

    public final void setIntent(@tb1 Intent intent) {
        this.intent = intent;
    }

    public final void setTitle(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.title = str;
    }

    public final void setType(@aa1 AIFunctionType aIFunctionType) {
        Intrinsics.X0O(aIFunctionType, "<set-?>");
        this.type = aIFunctionType;
    }

    @aa1
    public String toString() {
        return "AIFunction(type=" + this.type + ", title=" + this.title + ", bg=" + this.f51293bg + ", desc=" + this.desc + ", icon=" + this.icon + ", detailsBg=" + this.detailsBg + ", detailsDescribe=" + this.detailsDescribe + ", detailsHint=" + this.detailsHint + ", detailsExample=" + this.detailsExample + ", detailsQuestion=" + this.detailsQuestion + ", isHot=" + this.isHot + ", intent=" + this.intent + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ AIFunction(AIFunctionType aIFunctionType, String str, int i, String str2, int i2, int i3, String str3, String str4, String str5, String str6, boolean z, Intent intent, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(aIFunctionType, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3, (i4 & 64) != 0 ? "" : str3, (i4 & 128) != 0 ? "" : str4, (i4 & 256) != 0 ? "" : str5, (i4 & 512) == 0 ? str6 : "", (i4 & 1024) == 0 ? z : false, (i4 & 2048) != 0 ? null : intent);
    }
}
