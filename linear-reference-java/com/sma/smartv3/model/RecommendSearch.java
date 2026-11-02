package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RecommendSearch extends JsonFieldContainer implements Serializable {

    @aa1
    private final ArrayList<CourseRecommendList> courseRecommendList;
    private final int id;
    private long onCreateTime;

    @aa1
    private final String recommendIntro;

    @aa1
    private final String recommendTitle;

    @aa1
    private final String recommendType;

    public RecommendSearch(int r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, long r6, @aa1 ArrayList<CourseRecommendList> r8) {
        Intrinsics.X0O(r3, "recommendTitle");
        Intrinsics.X0O(r4, "recommendType");
        Intrinsics.X0O(r5, "recommendIntro");
        Intrinsics.X0O(r8, "courseRecommendList");
        this.id = r2;
        this.recommendTitle = r3;
        this.recommendType = r4;
        this.recommendIntro = r5;
        this.onCreateTime = r6;
        this.courseRecommendList = r8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendSearch copy$default(RecommendSearch r0, int r1, String r2, String r3, String r4, long r5, ArrayList r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.recommendTitle;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.recommendType;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.recommendIntro;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.onCreateTime;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = r0.courseRecommendList;
    L20:
        ArrayList r10 = r7;
        long r11 = r5;
        String r6 = r3;
        String r12 = r4;
        return r0.copy(r1, r2, r6, r12, r11, r10);
    }

    public final int component1() {
        return this.id;
    }

    @aa1
    public final String component2() {
        return this.recommendTitle;
    }

    @aa1
    public final String component3() {
        return this.recommendType;
    }

    @aa1
    public final String component4() {
        return this.recommendIntro;
    }

    public final long component5() {
        return this.onCreateTime;
    }

    @aa1
    public final ArrayList<CourseRecommendList> component6() {
        return this.courseRecommendList;
    }

    @aa1
    public final RecommendSearch copy(int r10, @aa1 String r11, @aa1 String r12, @aa1 String r13, long r14, @aa1 ArrayList<CourseRecommendList> r16) {
        Intrinsics.X0O(r11, "recommendTitle");
        Intrinsics.X0O(r12, "recommendType");
        Intrinsics.X0O(r13, "recommendIntro");
        Intrinsics.X0O(r16, "courseRecommendList");
        return new RecommendSearch(r10, r11, r12, r13, r14, r16);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof RecommendSearch) == true) goto L8;
        return false;
    L8:
        RecommendSearch r9 = (RecommendSearch) r8;
        if (this.id == r9.id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.recommendTitle, r9.recommendTitle) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.recommendType, r9.recommendType) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.recommendIntro, r9.recommendIntro) == true) goto L21;
        return false;
    L21:
        if (this.onCreateTime == r9.onCreateTime) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.courseRecommendList, r9.courseRecommendList) == true) goto L26;
        return false;
    L26:
        return true;
    }

    @aa1
    public final ArrayList<CourseRecommendList> getCourseRecommendList() {
        return this.courseRecommendList;
    }

    public final int getId() {
        return this.id;
    }

    public final long getOnCreateTime() {
        return this.onCreateTime;
    }

    @aa1
    public final String getRecommendIntro() {
        return this.recommendIntro;
    }

    @aa1
    public final String getRecommendTitle() {
        return this.recommendTitle;
    }

    @aa1
    public final String getRecommendType() {
        return this.recommendType;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.recommendTitle.hashCode()) * 31) + this.recommendType.hashCode()) * 31) + this.recommendIntro.hashCode()) * 31) + Long.hashCode(this.onCreateTime)) * 31) + this.courseRecommendList.hashCode();
    }

    public final void setOnCreateTime(long r1) {
        this.onCreateTime = r1;
    }

    @aa1
    public String toString() {
        return "RecommendSearch(id=" + this.id + ", recommendTitle=" + this.recommendTitle + ", recommendType=" + this.recommendType + ", recommendIntro=" + this.recommendIntro + ", onCreateTime=" + this.onCreateTime + ", courseRecommendList=" + this.courseRecommendList + I000IiI1O.iO.iO;
    }

    public /* synthetic */ RecommendSearch(int r1, String r2, String r3, String r4, long r5, ArrayList r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = 1;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = "体态改善，拉伸训练";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = "INDEX";
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = "111111";
    L15:
        if ((r8 & 16) == 0) goto L17;
        r5 = 0;
    L17:
        long r10 = r5;
        String r6 = r3;
        String r11 = r4;
        this(r1, r2, r6, r11, r10, r7);
    }
}
