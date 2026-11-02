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

    /* JADX INFO: renamed from: id */
    private final int f51306id;

    public CourseRecommendList(int i, @aa1 String courseTitle, @aa1 CourseDetails course) {
        Intrinsics.X0O(courseTitle, "courseTitle");
        Intrinsics.X0O(course, "course");
        this.f51306id = i;
        this.courseTitle = courseTitle;
        this.course = course;
    }

    public static /* synthetic */ CourseRecommendList copy$default(CourseRecommendList courseRecommendList, int i, String str, CourseDetails courseDetails, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = courseRecommendList.f51306id;
        }
        if ((i2 & 2) != 0) {
            str = courseRecommendList.courseTitle;
        }
        if ((i2 & 4) != 0) {
            courseDetails = courseRecommendList.course;
        }
        return courseRecommendList.copy(i, str, courseDetails);
    }

    public final int component1() {
        return this.f51306id;
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
    public final CourseRecommendList copy(int i, @aa1 String courseTitle, @aa1 CourseDetails course) {
        Intrinsics.X0O(courseTitle, "courseTitle");
        Intrinsics.X0O(course, "course");
        return new CourseRecommendList(i, courseTitle, course);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseRecommendList)) {
            return false;
        }
        CourseRecommendList courseRecommendList = (CourseRecommendList) obj;
        return this.f51306id == courseRecommendList.f51306id && Intrinsics.XOO0ii0(this.courseTitle, courseRecommendList.courseTitle) && Intrinsics.XOO0ii0(this.course, courseRecommendList.course);
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
        return this.f51306id;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f51306id) * 31) + this.courseTitle.hashCode()) * 31) + this.course.hashCode();
    }

    public final void setCourseTitle(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.courseTitle = str;
    }

    @aa1
    public String toString() {
        return "CourseRecommendList(id=" + this.f51306id + ", courseTitle=" + this.courseTitle + ", course=" + this.course + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ CourseRecommendList(int i, String str, CourseDetails courseDetails, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? "" : str, courseDetails);
    }
}
