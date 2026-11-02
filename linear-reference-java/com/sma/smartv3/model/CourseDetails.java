package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.network.CourseCollect;
import com.sma.smartv3.network.GetCourseList;
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

    @aa1
    private final String id;

    @aa1
    private final List<ProgressMarkers> progressMarkers;

    @aa1
    private final String takeFlag;

    @aa1
    private final String valid;
    private final int version;

    @aa1
    private final VideoFile videoFile;

    public CourseDetails(@aa1 String r17, @aa1 String r18, @aa1 String r19, @aa1 String r20, @aa1 String r21, @aa1 String r22, @aa1 String r23, @aa1 String r24, @aa1 String r25, @aa1 String r26, @aa1 String r27, @aa1 String r28, int r29, @aa1 VideoFile r30, @aa1 List<ProgressMarkers> r31, @aa1 String r32, @aa1 String r33) {
        Intrinsics.X0O(r17, "courseName");
        Intrinsics.X0O(r18, GetCourseList.COURSE_TYPE);
        Intrinsics.X0O(r19, GetCourseList.COURSE_DIFF);
        Intrinsics.X0O(r20, GetCourseList.COURSE_PART);
        Intrinsics.X0O(r21, "courseHeat");
        Intrinsics.X0O(r22, "courseTime");
        Intrinsics.X0O(r23, "coursePic1");
        Intrinsics.X0O(r24, "coursePic2");
        Intrinsics.X0O(r25, "courseIntro");
        Intrinsics.X0O(r26, "courseClass");
        Intrinsics.X0O(r27, "valid");
        Intrinsics.X0O(r28, "id");
        Intrinsics.X0O(r30, "videoFile");
        Intrinsics.X0O(r31, "progressMarkers");
        Intrinsics.X0O(r32, "takeFlag");
        Intrinsics.X0O(r33, CourseCollect.COLLECT_FLAG);
        this.courseName = r17;
        this.courseType = r18;
        this.courseDiff = r19;
        this.coursePart = r20;
        this.courseHeat = r21;
        this.courseTime = r22;
        this.coursePic1 = r23;
        this.coursePic2 = r24;
        this.courseIntro = r25;
        this.courseClass = r26;
        this.valid = r27;
        this.id = r28;
        this.version = r29;
        this.videoFile = r30;
        this.progressMarkers = r31;
        this.takeFlag = r32;
        this.collectFlag = r33;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseDetails copy$default(CourseDetails r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, int r30, VideoFile r31, List r32, String r33, String r34, int r35, Object r36) {
        if ((r35 & 1) == 0) goto L5;
        String r2 = r17.courseName;
    L7:
        if ((r35 & 2) == 0) goto L9;
        String r3 = r17.courseType;
    L11:
        if ((r35 & 4) == 0) goto L13;
        String r4 = r17.courseDiff;
    L15:
        if ((r35 & 8) == 0) goto L17;
        String r5 = r17.coursePart;
    L19:
        if ((r35 & 16) == 0) goto L21;
        String r6 = r17.courseHeat;
    L23:
        if ((r35 & 32) == 0) goto L25;
        String r7 = r17.courseTime;
    L27:
        if ((r35 & 64) == 0) goto L29;
        String r8 = r17.coursePic1;
    L31:
        if ((r35 & 128) == 0) goto L33;
        String r9 = r17.coursePic2;
    L35:
        if ((r35 & 256) == 0) goto L37;
        String r10 = r17.courseIntro;
    L39:
        if ((r35 & 512) == 0) goto L41;
        String r11 = r17.courseClass;
    L43:
        if ((r35 & 1024) == 0) goto L45;
        String r12 = r17.valid;
    L47:
        if ((r35 & 2048) == 0) goto L49;
        String r13 = r17.id;
    L51:
        if ((r35 & 4096) == 0) goto L53;
        int r14 = r17.version;
    L55:
        if ((r35 & 8192) == 0) goto L57;
        VideoFile r15 = r17.videoFile;
    L58:
        String r110 = r2;
        if ((r35 & 16384) == 0) goto L61;
        List r16 = r17.progressMarkers;
    L63:
        if ((r35 & 32768) == 0) goto L65;
        String r1 = r17.takeFlag;
    L67:
        if ((r35 & 65536) == 0) goto L69;
        String r111 = r1;
        String r37 = r111;
        String r38 = r17.collectFlag;
    L71:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r37, r38);
    L69:
        r38 = r34;
        r37 = r1;
        goto L71
    L65:
        r1 = r33;
        goto L67
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
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
        return this.id;
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
    public final CourseDetails copy(@aa1 String r20, @aa1 String r21, @aa1 String r22, @aa1 String r23, @aa1 String r24, @aa1 String r25, @aa1 String r26, @aa1 String r27, @aa1 String r28, @aa1 String r29, @aa1 String r30, @aa1 String r31, int r32, @aa1 VideoFile r33, @aa1 List<ProgressMarkers> r34, @aa1 String r35, @aa1 String r36) {
        Intrinsics.X0O(r20, "courseName");
        Intrinsics.X0O(r21, GetCourseList.COURSE_TYPE);
        Intrinsics.X0O(r22, GetCourseList.COURSE_DIFF);
        Intrinsics.X0O(r23, GetCourseList.COURSE_PART);
        Intrinsics.X0O(r24, "courseHeat");
        Intrinsics.X0O(r25, "courseTime");
        Intrinsics.X0O(r26, "coursePic1");
        Intrinsics.X0O(r27, "coursePic2");
        Intrinsics.X0O(r28, "courseIntro");
        Intrinsics.X0O(r29, "courseClass");
        Intrinsics.X0O(r30, "valid");
        Intrinsics.X0O(r31, "id");
        Intrinsics.X0O(r33, "videoFile");
        Intrinsics.X0O(r34, "progressMarkers");
        Intrinsics.X0O(r35, "takeFlag");
        Intrinsics.X0O(r36, CourseCollect.COLLECT_FLAG);
        return new CourseDetails(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CourseDetails) == true) goto L8;
        return false;
    L8:
        CourseDetails r6 = (CourseDetails) r5;
        if (Intrinsics.XOO0ii0(this.courseName, r6.courseName) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.courseType, r6.courseType) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.courseDiff, r6.courseDiff) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.coursePart, r6.coursePart) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.courseHeat, r6.courseHeat) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.courseTime, r6.courseTime) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.coursePic1, r6.coursePic1) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.coursePic2, r6.coursePic2) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.courseIntro, r6.courseIntro) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.courseClass, r6.courseClass) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.valid, r6.valid) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.id, r6.id) == true) goto L45;
        return false;
    L45:
        if (this.version == r6.version) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.videoFile, r6.videoFile) == true) goto L51;
        return false;
    L51:
        if (Intrinsics.XOO0ii0(this.progressMarkers, r6.progressMarkers) == true) goto L54;
        return false;
    L54:
        if (Intrinsics.XOO0ii0(this.takeFlag, r6.takeFlag) == true) goto L57;
        return false;
    L57:
        if (Intrinsics.XOO0ii0(this.collectFlag, r6.collectFlag) == true) goto L59;
        return false;
    L59:
        return true;
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
        return this.id;
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
        return (((((((((((((((((((((((((((((((this.courseName.hashCode() * 31) + this.courseType.hashCode()) * 31) + this.courseDiff.hashCode()) * 31) + this.coursePart.hashCode()) * 31) + this.courseHeat.hashCode()) * 31) + this.courseTime.hashCode()) * 31) + this.coursePic1.hashCode()) * 31) + this.coursePic2.hashCode()) * 31) + this.courseIntro.hashCode()) * 31) + this.courseClass.hashCode()) * 31) + this.valid.hashCode()) * 31) + this.id.hashCode()) * 31) + Integer.hashCode(this.version)) * 31) + this.videoFile.hashCode()) * 31) + this.progressMarkers.hashCode()) * 31) + this.takeFlag.hashCode()) * 31) + this.collectFlag.hashCode();
    }

    @aa1
    public String toString() {
        return "CourseDetails(courseName=" + this.courseName + ", courseType=" + this.courseType + ", courseDiff=" + this.courseDiff + ", coursePart=" + this.coursePart + ", courseHeat=" + this.courseHeat + ", courseTime=" + this.courseTime + ", coursePic1=" + this.coursePic1 + ", coursePic2=" + this.coursePic2 + ", courseIntro=" + this.courseIntro + ", courseClass=" + this.courseClass + ", valid=" + this.valid + ", id=" + this.id + ", version=" + this.version + ", videoFile=" + this.videoFile + ", progressMarkers=" + this.progressMarkers + ", takeFlag=" + this.takeFlag + ", collectFlag=" + this.collectFlag + I000IiI1O.iO.iO;
    }

    public /* synthetic */ CourseDetails(String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, int r34, VideoFile r35, List r36, String r37, String r38, int r39, DefaultConstructorMarker r40) {
        if ((r39 & 1) == 0) goto L5;
        String r4 = "";
    L7:
        if ((r39 & 2) == 0) goto L9;
        String r5 = "";
    L11:
        if ((r39 & 4) == 0) goto L13;
        String r6 = "";
    L15:
        if ((r39 & 8) == 0) goto L17;
        String r7 = "";
    L19:
        if ((r39 & 16) == 0) goto L21;
        String r8 = "";
    L23:
        if ((r39 & 32) == 0) goto L25;
        String r9 = "0";
    L27:
        if ((r39 & 64) == 0) goto L29;
        String r10 = "";
    L31:
        if ((r39 & 128) == 0) goto L33;
        String r11 = "";
    L35:
        if ((r39 & 256) == 0) goto L37;
        String r12 = "";
    L39:
        if ((r39 & 512) == 0) goto L41;
        String r13 = "";
    L43:
        if ((r39 & 1024) == 0) goto L45;
        String r14 = "";
    L47:
        if ((r39 & 2048) == 0) goto L49;
        String r15 = "";
    L51:
        if ((32768 & r39) == 0) goto L53;
        String r19 = "N";
    L55:
        if ((r39 & 65536) == 0) goto L58;
        String r20 = "N";
    L59:
        this(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r34, r35, r36, r19, r20);
        return;
    L58:
        r20 = r38;
        goto L59
    L53:
        r19 = r37;
        goto L55
    L49:
        r15 = r33;
        goto L51
    L45:
        r14 = r32;
        goto L47
    L41:
        r13 = r31;
        goto L43
    L37:
        r12 = r30;
        goto L39
    L33:
        r11 = r29;
        goto L35
    L29:
        r10 = r28;
        goto L31
    L25:
        r9 = r27;
        goto L27
    L21:
        r8 = r26;
        goto L23
    L17:
        r7 = r25;
        goto L19
    L13:
        r6 = r24;
        goto L15
    L9:
        r5 = r23;
        goto L11
    L5:
        r4 = r22;
        goto L7
    }
}
