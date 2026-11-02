package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class JobDetailV2 extends JsonFieldContainer {

    @aa1
    private String imageSign;

    @aa1
    private String[] images;

    public JobDetailV2(@aa1 String imageSign, @aa1 String[] images) {
        Intrinsics.X0O(imageSign, "imageSign");
        Intrinsics.X0O(images, "images");
        this.imageSign = imageSign;
        this.images = images;
    }

    public static /* synthetic */ JobDetailV2 copy$default(JobDetailV2 jobDetailV2, String str, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jobDetailV2.imageSign;
        }
        if ((i & 2) != 0) {
            strArr = jobDetailV2.images;
        }
        return jobDetailV2.copy(str, strArr);
    }

    @aa1
    public final String component1() {
        return this.imageSign;
    }

    @aa1
    public final String[] component2() {
        return this.images;
    }

    @aa1
    public final JobDetailV2 copy(@aa1 String imageSign, @aa1 String[] images) {
        Intrinsics.X0O(imageSign, "imageSign");
        Intrinsics.X0O(images, "images");
        return new JobDetailV2(imageSign, images);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobDetailV2)) {
            return false;
        }
        JobDetailV2 jobDetailV2 = (JobDetailV2) obj;
        return Intrinsics.XOO0ii0(this.imageSign, jobDetailV2.imageSign) && Intrinsics.XOO0ii0(this.images, jobDetailV2.images);
    }

    @aa1
    public final String getImageSign() {
        return this.imageSign;
    }

    @aa1
    public final String[] getImages() {
        return this.images;
    }

    public int hashCode() {
        return (this.imageSign.hashCode() * 31) + Arrays.hashCode(this.images);
    }

    public final void setImageSign(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.imageSign = str;
    }

    public final void setImages(@aa1 String[] strArr) {
        Intrinsics.X0O(strArr, "<set-?>");
        this.images = strArr;
    }

    @aa1
    public String toString() {
        return "JobDetailV2(imageSign=" + this.imageSign + ", images=" + Arrays.toString(this.images) + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ JobDetailV2(String str, String[] strArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, strArr);
    }
}
