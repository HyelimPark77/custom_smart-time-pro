package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CourseList extends JsonFieldContainer implements Serializable {

    @aa1
    private final String collectFlag;

    @aa1
    private final String courseClass;

    @aa1
    private final String courseDiff;

    @aa1
    private final String courseHeat;

    @aa1
    private final String courseIntro;

    @aa1
    private final String courseName;

    @aa1
    private final String coursePart;

    @aa1
    private final String coursePic1;

    @aa1
    private final String coursePic2;

    @aa1
    private final String courseTime;

    @aa1
    private String courseTitle;

    @aa1
    private final String courseType;

    /* JADX INFO: renamed from: id */
    @aa1
    private final String f51305id;
    private long onSaveTime;

    @aa1
    private final String takeFlag;

    @aa1
    private final String valid;
    private final int version;

    public CourseList(@aa1 String courseName, @aa1 String courseType, @aa1 String courseDiff, @aa1 String coursePart, @aa1 String courseHeat, @aa1 String courseTime, @aa1 String coursePic1, @aa1 String coursePic2, @aa1 String courseIntro, @aa1 String courseClass, @aa1 String valid, @aa1 String id, int i, long j, @aa1 String takeFlag, @aa1 String collectFlag, @aa1 String courseTitle) {
        Intrinsics.X0O(courseName, "courseName");
        Intrinsics.X0O(courseType, "courseType");
        Intrinsics.X0O(courseDiff, "courseDiff");
        Intrinsics.X0O(coursePart, "coursePart");
        Intrinsics.X0O(courseHeat, "courseHeat");
        Intrinsics.X0O(courseTime, "courseTime");
        Intrinsics.X0O(coursePic1, "coursePic1");
        Intrinsics.X0O(coursePic2, "coursePic2");
        Intrinsics.X0O(courseIntro, "courseIntro");
        Intrinsics.X0O(courseClass, "courseClass");
        Intrinsics.X0O(valid, "valid");
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(takeFlag, "takeFlag");
        Intrinsics.X0O(collectFlag, "collectFlag");
        Intrinsics.X0O(courseTitle, "courseTitle");
        this.courseName = courseName;
        this.courseType = courseType;
        this.courseDiff = courseDiff;
        this.coursePart = coursePart;
        this.courseHeat = courseHeat;
        this.courseTime = courseTime;
        this.coursePic1 = coursePic1;
        this.coursePic2 = coursePic2;
        this.courseIntro = courseIntro;
        this.courseClass = courseClass;
        this.valid = valid;
        this.f51305id = id;
        this.version = i;
        this.onSaveTime = j;
        this.takeFlag = takeFlag;
        this.collectFlag = collectFlag;
        this.courseTitle = courseTitle;
    }

    public static /* synthetic */ CourseList copy$default(CourseList courseList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, long j, String str13, String str14, String str15, int i2, Object obj) {
        String str16;
        String str17;
        String str18 = (i2 & 1) != 0 ? courseList.courseName : str;
        String str19 = (i2 & 2) != 0 ? courseList.courseType : str2;
        String str20 = (i2 & 4) != 0 ? courseList.courseDiff : str3;
        String str21 = (i2 & 8) != 0 ? courseList.coursePart : str4;
        String str22 = (i2 & 16) != 0 ? courseList.courseHeat : str5;
        String str23 = (i2 & 32) != 0 ? courseList.courseTime : str6;
        String str24 = (i2 & 64) != 0 ? courseList.coursePic1 : str7;
        String str25 = (i2 & 128) != 0 ? courseList.coursePic2 : str8;
        String str26 = (i2 & 256) != 0 ? courseList.courseIntro : str9;
        String str27 = (i2 & 512) != 0 ? courseList.courseClass : str10;
        String str28 = (i2 & 1024) != 0 ? courseList.valid : str11;
        String str29 = (i2 & 2048) != 0 ? courseList.f51305id : str12;
        int i3 = (i2 & 4096) != 0 ? courseList.version : i;
        String str30 = str18;
        String str31 = str19;
        long j2 = (i2 & 8192) != 0 ? courseList.onSaveTime : j;
        String str32 = (i2 & 16384) != 0 ? courseList.takeFlag : str13;
        String str33 = (i2 & 32768) != 0 ? courseList.collectFlag : str14;
        if ((i2 & 65536) != 0) {
            str17 = str33;
            str16 = courseList.courseTitle;
        } else {
            str16 = str15;
            str17 = str33;
        }
        return courseList.copy(str30, str31, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, i3, j2, str32, str17, str16);
    }

    @aa1
    public final String component1() {
        return this.courseName;
    }

    @aa1
    public final String component10() {
        return this.courseClass;
    }

    @aa1
    public final String component11() {
        return this.valid;
    }

    @aa1
    public final String component12() {
        return this.f51305id;
    }

    public final int component13() {
        return this.version;
    }

    public final long component14() {
        return this.onSaveTime;
    }

    @aa1
    public final String component15() {
        return this.takeFlag;
    }

    @aa1
    public final String component16() {
        return this.collectFlag;
    }

    @aa1
    public final String component17() {
        return this.courseTitle;
    }

    @aa1
    public final String component2() {
        return this.courseType;
    }

    @aa1
    public final String component3() {
        return this.courseDiff;
    }

    @aa1
    public final String component4() {
        return this.coursePart;
    }

    @aa1
    public final String component5() {
        return this.courseHeat;
    }

    @aa1
    public final String component6() {
        return this.courseTime;
    }

    @aa1
    public final String component7() {
        return this.coursePic1;
    }

    @aa1
    public final String component8() {
        return this.coursePic2;
    }

    @aa1
    public final String component9() {
        return this.courseIntro;
    }

    @aa1
    public final CourseList copy(@aa1 String courseName, @aa1 String courseType, @aa1 String courseDiff, @aa1 String coursePart, @aa1 String courseHeat, @aa1 String courseTime, @aa1 String coursePic1, @aa1 String coursePic2, @aa1 String courseIntro, @aa1 String courseClass, @aa1 String valid, @aa1 String id, int i, long j, @aa1 String takeFlag, @aa1 String collectFlag, @aa1 String courseTitle) {
        Intrinsics.X0O(courseName, "courseName");
        Intrinsics.X0O(courseType, "courseType");
        Intrinsics.X0O(courseDiff, "courseDiff");
        Intrinsics.X0O(coursePart, "coursePart");
        Intrinsics.X0O(courseHeat, "courseHeat");
        Intrinsics.X0O(courseTime, "courseTime");
        Intrinsics.X0O(coursePic1, "coursePic1");
        Intrinsics.X0O(coursePic2, "coursePic2");
        Intrinsics.X0O(courseIntro, "courseIntro");
        Intrinsics.X0O(courseClass, "courseClass");
        Intrinsics.X0O(valid, "valid");
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(takeFlag, "takeFlag");
        Intrinsics.X0O(collectFlag, "collectFlag");
        Intrinsics.X0O(courseTitle, "courseTitle");
        return new CourseList(courseName, courseType, courseDiff, coursePart, courseHeat, courseTime, coursePic1, coursePic2, courseIntro, courseClass, valid, id, i, j, takeFlag, collectFlag, courseTitle);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseList)) {
            return false;
        }
        CourseList courseList = (CourseList) obj;
        return Intrinsics.XOO0ii0(this.courseName, courseList.courseName) && Intrinsics.XOO0ii0(this.courseType, courseList.courseType) && Intrinsics.XOO0ii0(this.courseDiff, courseList.courseDiff) && Intrinsics.XOO0ii0(this.coursePart, courseList.coursePart) && Intrinsics.XOO0ii0(this.courseHeat, courseList.courseHeat) && Intrinsics.XOO0ii0(this.courseTime, courseList.courseTime) && Intrinsics.XOO0ii0(this.coursePic1, courseList.coursePic1) && Intrinsics.XOO0ii0(this.coursePic2, courseList.coursePic2) && Intrinsics.XOO0ii0(this.courseIntro, courseList.courseIntro) && Intrinsics.XOO0ii0(this.courseClass, courseList.courseClass) && Intrinsics.XOO0ii0(this.valid, courseList.valid) && Intrinsics.XOO0ii0(this.f51305id, courseList.f51305id) && this.version == courseList.version && this.onSaveTime == courseList.onSaveTime && Intrinsics.XOO0ii0(this.takeFlag, courseList.takeFlag) && Intrinsics.XOO0ii0(this.collectFlag, courseList.collectFlag) && Intrinsics.XOO0ii0(this.courseTitle, courseList.courseTitle);
    }

    @aa1
    public final String getCollectFlag() {
        return this.collectFlag;
    }

    @aa1
    public final String getCourseClass() {
        return this.courseClass;
    }

    @aa1
    public final String getCourseDiff() {
        return this.courseDiff;
    }

    @aa1
    public final String getCourseHeat() {
        return this.courseHeat;
    }

    @aa1
    public final String getCourseIntro() {
        return this.courseIntro;
    }

    @aa1
    public final String getCourseName() {
        return this.courseName;
    }

    @aa1
    public final String getCoursePart() {
        return this.coursePart;
    }

    @aa1
    public final String getCoursePic1() {
        return this.coursePic1;
    }

    @aa1
    public final String getCoursePic2() {
        return this.coursePic2;
    }

    @aa1
    public final String getCourseTime() {
        return this.courseTime;
    }

    @aa1
    public final String getCourseTitle() {
        return this.courseTitle;
    }

    @aa1
    public final String getCourseType() {
        return this.courseType;
    }

    @aa1
    public final String getId() {
        return this.f51305id;
    }

    public final long getOnSaveTime() {
        return this.onSaveTime;
    }

    @aa1
    public final String getTakeFlag() {
        return this.takeFlag;
    }

    @aa1
    public final String getValid() {
        return this.valid;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.courseName.hashCode() * 31) + this.courseType.hashCode()) * 31) + this.courseDiff.hashCode()) * 31) + this.coursePart.hashCode()) * 31) + this.courseHeat.hashCode()) * 31) + this.courseTime.hashCode()) * 31) + this.coursePic1.hashCode()) * 31) + this.coursePic2.hashCode()) * 31) + this.courseIntro.hashCode()) * 31) + this.courseClass.hashCode()) * 31) + this.valid.hashCode()) * 31) + this.f51305id.hashCode()) * 31) + Integer.hashCode(this.version)) * 31) + Long.hashCode(this.onSaveTime)) * 31) + this.takeFlag.hashCode()) * 31) + this.collectFlag.hashCode()) * 31) + this.courseTitle.hashCode();
    }

    public final void setCourseTitle(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.courseTitle = str;
    }

    public final void setOnSaveTime(long j) {
        this.onSaveTime = j;
    }

    @aa1
    public String toString() {
        return "CourseList(courseName=" + this.courseName + ", courseType=" + this.courseType + ", courseDiff=" + this.courseDiff + ", coursePart=" + this.coursePart + ", courseHeat=" + this.courseHeat + ", courseTime=" + this.courseTime + ", coursePic1=" + this.coursePic1 + ", coursePic2=" + this.coursePic2 + ", courseIntro=" + this.courseIntro + ", courseClass=" + this.courseClass + ", valid=" + this.valid + ", id=" + this.f51305id + ", version=" + this.version + ", onSaveTime=" + this.onSaveTime + ", takeFlag=" + this.takeFlag + ", collectFlag=" + this.collectFlag + ", courseTitle=" + this.courseTitle + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ CourseList(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, long j, String str13, String str14, String str15, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "0" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? "" : str11, (i2 & 2048) != 0 ? "" : str12, i, j, (i2 & 16384) != 0 ? "N" : str13, (32768 & i2) != 0 ? "N" : str14, (i2 & 65536) != 0 ? "" : str15);
    }
}
