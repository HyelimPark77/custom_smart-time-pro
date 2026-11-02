package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CourseDetails extends JsonFieldContainer implements Serializable {

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
    private final String courseType;

    /* JADX INFO: renamed from: id */
    @aa1
    private final String f51304id;

    @aa1
    private final List<ProgressMarkers> progressMarkers;

    @aa1
    private final String takeFlag;

    @aa1
    private final String valid;
    private final int version;

    @aa1
    private final VideoFile videoFile;

    public CourseDetails(@aa1 String courseName, @aa1 String courseType, @aa1 String courseDiff, @aa1 String coursePart, @aa1 String courseHeat, @aa1 String courseTime, @aa1 String coursePic1, @aa1 String coursePic2, @aa1 String courseIntro, @aa1 String courseClass, @aa1 String valid, @aa1 String id, int i, @aa1 VideoFile videoFile, @aa1 List<ProgressMarkers> progressMarkers, @aa1 String takeFlag, @aa1 String collectFlag) {
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
        Intrinsics.X0O(videoFile, "videoFile");
        Intrinsics.X0O(progressMarkers, "progressMarkers");
        Intrinsics.X0O(takeFlag, "takeFlag");
        Intrinsics.X0O(collectFlag, "collectFlag");
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
        this.f51304id = id;
        this.version = i;
        this.videoFile = videoFile;
        this.progressMarkers = progressMarkers;
        this.takeFlag = takeFlag;
        this.collectFlag = collectFlag;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseDetails copy$default(CourseDetails courseDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, VideoFile videoFile, List list, String str13, String str14, int i2, Object obj) {
        String str15;
        String str16;
        String str17 = (i2 & 1) != 0 ? courseDetails.courseName : str;
        String str18 = (i2 & 2) != 0 ? courseDetails.courseType : str2;
        String str19 = (i2 & 4) != 0 ? courseDetails.courseDiff : str3;
        String str20 = (i2 & 8) != 0 ? courseDetails.coursePart : str4;
        String str21 = (i2 & 16) != 0 ? courseDetails.courseHeat : str5;
        String str22 = (i2 & 32) != 0 ? courseDetails.courseTime : str6;
        String str23 = (i2 & 64) != 0 ? courseDetails.coursePic1 : str7;
        String str24 = (i2 & 128) != 0 ? courseDetails.coursePic2 : str8;
        String str25 = (i2 & 256) != 0 ? courseDetails.courseIntro : str9;
        String str26 = (i2 & 512) != 0 ? courseDetails.courseClass : str10;
        String str27 = (i2 & 1024) != 0 ? courseDetails.valid : str11;
        String str28 = (i2 & 2048) != 0 ? courseDetails.f51304id : str12;
        int i3 = (i2 & 4096) != 0 ? courseDetails.version : i;
        VideoFile videoFile2 = (i2 & 8192) != 0 ? courseDetails.videoFile : videoFile;
        String str29 = str17;
        List list2 = (i2 & 16384) != 0 ? courseDetails.progressMarkers : list;
        String str30 = (i2 & 32768) != 0 ? courseDetails.takeFlag : str13;
        if ((i2 & 65536) != 0) {
            str16 = str30;
            str15 = courseDetails.collectFlag;
        } else {
            str15 = str14;
            str16 = str30;
        }
        return courseDetails.copy(str29, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, i3, videoFile2, list2, str16, str15);
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
        return this.f51304id;
    }

    public final int component13() {
        return this.version;
    }

    @aa1
    public final VideoFile component14() {
        return this.videoFile;
    }

    @aa1
    public final List<ProgressMarkers> component15() {
        return this.progressMarkers;
    }

    @aa1
    public final String component16() {
        return this.takeFlag;
    }

    @aa1
    public final String component17() {
        return this.collectFlag;
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
    public final CourseDetails copy(@aa1 String courseName, @aa1 String courseType, @aa1 String courseDiff, @aa1 String coursePart, @aa1 String courseHeat, @aa1 String courseTime, @aa1 String coursePic1, @aa1 String coursePic2, @aa1 String courseIntro, @aa1 String courseClass, @aa1 String valid, @aa1 String id, int i, @aa1 VideoFile videoFile, @aa1 List<ProgressMarkers> progressMarkers, @aa1 String takeFlag, @aa1 String collectFlag) {
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
        Intrinsics.X0O(videoFile, "videoFile");
        Intrinsics.X0O(progressMarkers, "progressMarkers");
        Intrinsics.X0O(takeFlag, "takeFlag");
        Intrinsics.X0O(collectFlag, "collectFlag");
        return new CourseDetails(courseName, courseType, courseDiff, coursePart, courseHeat, courseTime, coursePic1, coursePic2, courseIntro, courseClass, valid, id, i, videoFile, progressMarkers, takeFlag, collectFlag);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseDetails)) {
            return false;
        }
        CourseDetails courseDetails = (CourseDetails) obj;
        return Intrinsics.XOO0ii0(this.courseName, courseDetails.courseName) && Intrinsics.XOO0ii0(this.courseType, courseDetails.courseType) && Intrinsics.XOO0ii0(this.courseDiff, courseDetails.courseDiff) && Intrinsics.XOO0ii0(this.coursePart, courseDetails.coursePart) && Intrinsics.XOO0ii0(this.courseHeat, courseDetails.courseHeat) && Intrinsics.XOO0ii0(this.courseTime, courseDetails.courseTime) && Intrinsics.XOO0ii0(this.coursePic1, courseDetails.coursePic1) && Intrinsics.XOO0ii0(this.coursePic2, courseDetails.coursePic2) && Intrinsics.XOO0ii0(this.courseIntro, courseDetails.courseIntro) && Intrinsics.XOO0ii0(this.courseClass, courseDetails.courseClass) && Intrinsics.XOO0ii0(this.valid, courseDetails.valid) && Intrinsics.XOO0ii0(this.f51304id, courseDetails.f51304id) && this.version == courseDetails.version && Intrinsics.XOO0ii0(this.videoFile, courseDetails.videoFile) && Intrinsics.XOO0ii0(this.progressMarkers, courseDetails.progressMarkers) && Intrinsics.XOO0ii0(this.takeFlag, courseDetails.takeFlag) && Intrinsics.XOO0ii0(this.collectFlag, courseDetails.collectFlag);
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
    public final String getCourseType() {
        return this.courseType;
    }

    @aa1
    public final String getId() {
        return this.f51304id;
    }

    @aa1
    public final List<ProgressMarkers> getProgressMarkers() {
        return this.progressMarkers;
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

    @aa1
    public final VideoFile getVideoFile() {
        return this.videoFile;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.courseName.hashCode() * 31) + this.courseType.hashCode()) * 31) + this.courseDiff.hashCode()) * 31) + this.coursePart.hashCode()) * 31) + this.courseHeat.hashCode()) * 31) + this.courseTime.hashCode()) * 31) + this.coursePic1.hashCode()) * 31) + this.coursePic2.hashCode()) * 31) + this.courseIntro.hashCode()) * 31) + this.courseClass.hashCode()) * 31) + this.valid.hashCode()) * 31) + this.f51304id.hashCode()) * 31) + Integer.hashCode(this.version)) * 31) + this.videoFile.hashCode()) * 31) + this.progressMarkers.hashCode()) * 31) + this.takeFlag.hashCode()) * 31) + this.collectFlag.hashCode();
    }

    @aa1
    public String toString() {
        return "CourseDetails(courseName=" + this.courseName + ", courseType=" + this.courseType + ", courseDiff=" + this.courseDiff + ", coursePart=" + this.coursePart + ", courseHeat=" + this.courseHeat + ", courseTime=" + this.courseTime + ", coursePic1=" + this.coursePic1 + ", coursePic2=" + this.coursePic2 + ", courseIntro=" + this.courseIntro + ", courseClass=" + this.courseClass + ", valid=" + this.valid + ", id=" + this.f51304id + ", version=" + this.version + ", videoFile=" + this.videoFile + ", progressMarkers=" + this.progressMarkers + ", takeFlag=" + this.takeFlag + ", collectFlag=" + this.collectFlag + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ CourseDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, VideoFile videoFile, List list, String str13, String str14, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "0" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? "" : str11, (i2 & 2048) != 0 ? "" : str12, i, videoFile, list, (32768 & i2) != 0 ? "N" : str13, (i2 & 65536) != 0 ? "N" : str14);
    }
}
