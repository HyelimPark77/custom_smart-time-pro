package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CourseRecommendList extends JsonFieldContainer implements Serializable {

    @aa1
    private final CourseDetails course;

    @aa1
    private String courseTitle;
    private final int id;

    public CourseRecommendList(int r2, @aa1 String r3, @aa1 CourseDetails r4) {
        Intrinsics.X0O(r3, "courseTitle");
        Intrinsics.X0O(r4, "course");
        this.id = r2;
        this.courseTitle = r3;
        this.course = r4;
    }

    public static /* synthetic */ CourseRecommendList copy$default(CourseRecommendList r0, int r1, String r2, CourseDetails r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.courseTitle;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.course;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.id;
    }

    @aa1
    public final String component2() {
        return this.courseTitle;
    }

    @aa1
    public final CourseDetails component3() {
        return this.course;
    }

    @aa1
    public final CourseRecommendList copy(int r2, @aa1 String r3, @aa1 CourseDetails r4) {
        Intrinsics.X0O(r3, "courseTitle");
        Intrinsics.X0O(r4, "course");
        return new CourseRecommendList(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CourseRecommendList) == true) goto L8;
        return false;
    L8:
        CourseRecommendList r6 = (CourseRecommendList) r5;
        if (this.id == r6.id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.courseTitle, r6.courseTitle) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.course, r6.course) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final CourseDetails getCourse() {
        return this.course;
    }

    @aa1
    public final String getCourseTitle() {
        return this.courseTitle;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.courseTitle.hashCode()) * 31) + this.course.hashCode();
    }

    public final void setCourseTitle(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.courseTitle = r2;
    }

    @aa1
    public String toString() {
        return "CourseRecommendList(id=" + this.id + ", courseTitle=" + this.courseTitle + ", course=" + this.course + I000IiI1O.iO.iO;
    }

    public /* synthetic */ CourseRecommendList(int r1, String r2, CourseDetails r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 1;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2, r3);
    }
}
