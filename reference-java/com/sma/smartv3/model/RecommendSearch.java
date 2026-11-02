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

    /* JADX INFO: renamed from: id */
    private final int f51319id;
    private long onCreateTime;

    @aa1
    private final String recommendIntro;

    @aa1
    private final String recommendTitle;

    @aa1
    private final String recommendType;

    public RecommendSearch(int i, @aa1 String recommendTitle, @aa1 String recommendType, @aa1 String recommendIntro, long j, @aa1 ArrayList<CourseRecommendList> courseRecommendList) {
        Intrinsics.X0O(recommendTitle, "recommendTitle");
        Intrinsics.X0O(recommendType, "recommendType");
        Intrinsics.X0O(recommendIntro, "recommendIntro");
        Intrinsics.X0O(courseRecommendList, "courseRecommendList");
        this.f51319id = i;
        this.recommendTitle = recommendTitle;
        this.recommendType = recommendType;
        this.recommendIntro = recommendIntro;
        this.onCreateTime = j;
        this.courseRecommendList = courseRecommendList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendSearch copy$default(RecommendSearch recommendSearch, int i, String str, String str2, String str3, long j, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recommendSearch.f51319id;
        }
        if ((i2 & 2) != 0) {
            str = recommendSearch.recommendTitle;
        }
        if ((i2 & 4) != 0) {
            str2 = recommendSearch.recommendType;
        }
        if ((i2 & 8) != 0) {
            str3 = recommendSearch.recommendIntro;
        }
        if ((i2 & 16) != 0) {
            j = recommendSearch.onCreateTime;
        }
        if ((i2 & 32) != 0) {
            arrayList = recommendSearch.courseRecommendList;
        }
        ArrayList arrayList2 = arrayList;
        long j2 = j;
        return recommendSearch.copy(i, str, str2, str3, j2, arrayList2);
    }

    public final int component1() {
        return this.f51319id;
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
    public final RecommendSearch copy(int i, @aa1 String recommendTitle, @aa1 String recommendType, @aa1 String recommendIntro, long j, @aa1 ArrayList<CourseRecommendList> courseRecommendList) {
        Intrinsics.X0O(recommendTitle, "recommendTitle");
        Intrinsics.X0O(recommendType, "recommendType");
        Intrinsics.X0O(recommendIntro, "recommendIntro");
        Intrinsics.X0O(courseRecommendList, "courseRecommendList");
        return new RecommendSearch(i, recommendTitle, recommendType, recommendIntro, j, courseRecommendList);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendSearch)) {
            return false;
        }
        RecommendSearch recommendSearch = (RecommendSearch) obj;
        return this.f51319id == recommendSearch.f51319id && Intrinsics.XOO0ii0(this.recommendTitle, recommendSearch.recommendTitle) && Intrinsics.XOO0ii0(this.recommendType, recommendSearch.recommendType) && Intrinsics.XOO0ii0(this.recommendIntro, recommendSearch.recommendIntro) && this.onCreateTime == recommendSearch.onCreateTime && Intrinsics.XOO0ii0(this.courseRecommendList, recommendSearch.courseRecommendList);
    }

    @aa1
    public final ArrayList<CourseRecommendList> getCourseRecommendList() {
        return this.courseRecommendList;
    }

    public final int getId() {
        return this.f51319id;
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
        return (((((((((Integer.hashCode(this.f51319id) * 31) + this.recommendTitle.hashCode()) * 31) + this.recommendType.hashCode()) * 31) + this.recommendIntro.hashCode()) * 31) + Long.hashCode(this.onCreateTime)) * 31) + this.courseRecommendList.hashCode();
    }

    public final void setOnCreateTime(long j) {
        this.onCreateTime = j;
    }

    @aa1
    public String toString() {
        return "RecommendSearch(id=" + this.f51319id + ", recommendTitle=" + this.recommendTitle + ", recommendType=" + this.recommendType + ", recommendIntro=" + this.recommendIntro + ", onCreateTime=" + this.onCreateTime + ", courseRecommendList=" + this.courseRecommendList + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ RecommendSearch(int i, String str, String str2, String str3, long j, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? "体态改善，拉伸训练" : str, (i2 & 4) != 0 ? "INDEX" : str2, (i2 & 8) != 0 ? "111111" : str3, (i2 & 16) != 0 ? 0L : j, arrayList);
    }
}
