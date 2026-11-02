package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class JobV2Extra {

    @aa1
    private String img_n;

    @aa1
    private String img_style;

    /* JADX WARN: Multi-variable type inference failed */
    public JobV2Extra() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ JobV2Extra copy$default(JobV2Extra jobV2Extra, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jobV2Extra.img_style;
        }
        if ((i & 2) != 0) {
            str2 = jobV2Extra.img_n;
        }
        return jobV2Extra.copy(str, str2);
    }

    @aa1
    public final String component1() {
        return this.img_style;
    }

    @aa1
    public final String component2() {
        return this.img_n;
    }

    @aa1
    public final JobV2Extra copy(@aa1 String img_style, @aa1 String img_n) {
        Intrinsics.X0O(img_style, "img_style");
        Intrinsics.X0O(img_n, "img_n");
        return new JobV2Extra(img_style, img_n);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobV2Extra)) {
            return false;
        }
        JobV2Extra jobV2Extra = (JobV2Extra) obj;
        return Intrinsics.XOO0ii0(this.img_style, jobV2Extra.img_style) && Intrinsics.XOO0ii0(this.img_n, jobV2Extra.img_n);
    }

    @aa1
    public final String getImg_n() {
        return this.img_n;
    }

    @aa1
    public final String getImg_style() {
        return this.img_style;
    }

    public int hashCode() {
        return (this.img_style.hashCode() * 31) + this.img_n.hashCode();
    }

    public final void setImg_n(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.img_n = str;
    }

    public final void setImg_style(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.img_style = str;
    }

    @aa1
    public String toString() {
        return "JobV2Extra(img_style=" + this.img_style + ", img_n=" + this.img_n + I000IiI1O.C2156iO.f1007iO;
    }

    public JobV2Extra(@aa1 String img_style, @aa1 String img_n) {
        Intrinsics.X0O(img_style, "img_style");
        Intrinsics.X0O(img_n, "img_n");
        this.img_style = img_style;
        this.img_n = img_n;
    }

    public /* synthetic */ JobV2Extra(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "default" : str, (i & 2) != 0 ? "1" : str2);
    }
}
