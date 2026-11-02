package com.sma.smartv3.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ProgressMarkers extends JsonFieldContainer implements Serializable {

    @aa1
    private final String courseId;

    @aa1
    private final String coverUrl;

    @aa1
    private final String describe;

    @aa1
    private final String id;
    private final boolean isCustomized;

    @aa1
    private final String offset;
    private int time;

    @aa1
    private final String title;

    public ProgressMarkers() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        int r4 = 0;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        boolean r8 = false;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }

    public static /* synthetic */ ProgressMarkers copy$default(ProgressMarkers r0, String r1, String r2, String r3, int r4, String r5, String r6, String r7, boolean r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.courseId;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.offset;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.time;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.coverUrl;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.title;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.describe;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.isCustomized;
    L26:
        String r11 = r7;
        boolean r12 = r8;
        String r13 = r5;
        String r14 = r6;
        String r15 = r3;
        int r16 = r4;
        return r0.copy(r1, r2, r15, r16, r13, r14, r11, r12);
    }

    @aa1
    public final String component1() {
        return this.id;
    }

    @aa1
    public final String component2() {
        return this.courseId;
    }

    @aa1
    public final String component3() {
        return this.offset;
    }

    public final int component4() {
        return this.time;
    }

    @aa1
    public final String component5() {
        return this.coverUrl;
    }

    @aa1
    public final String component6() {
        return this.title;
    }

    @aa1
    public final String component7() {
        return this.describe;
    }

    public final boolean component8() {
        return this.isCustomized;
    }

    @aa1
    public final ProgressMarkers copy(@aa1 String r11, @aa1 String r12, @aa1 String r13, int r14, @aa1 String r15, @aa1 String r16, @aa1 String r17, boolean r18) {
        Intrinsics.X0O(r11, "id");
        Intrinsics.X0O(r12, "courseId");
        Intrinsics.X0O(r13, TypedValues.CycleType.S_WAVE_OFFSET);
        Intrinsics.X0O(r15, "coverUrl");
        Intrinsics.X0O(r16, "title");
        Intrinsics.X0O(r17, "describe");
        return new ProgressMarkers(r11, r12, r13, r14, r15, r16, r17, r18);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ProgressMarkers) == true) goto L8;
        return false;
    L8:
        ProgressMarkers r6 = (ProgressMarkers) r5;
        if (Intrinsics.XOO0ii0(this.id, r6.id) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.courseId, r6.courseId) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.offset, r6.offset) == true) goto L18;
        return false;
    L18:
        if (this.time == r6.time) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.coverUrl, r6.coverUrl) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.title, r6.title) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.describe, r6.describe) == true) goto L30;
        return false;
    L30:
        if (this.isCustomized == r6.isCustomized) goto L32;
        return false;
    L32:
        return true;
    }

    @aa1
    public final String getCourseId() {
        return this.courseId;
    }

    @aa1
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    @aa1
    public final String getDescribe() {
        return this.describe;
    }

    @aa1
    public final String getId() {
        return this.id;
    }

    @aa1
    public final String getOffset() {
        return this.offset;
    }

    public final int getTime() {
        return this.time;
    }

    @aa1
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((((((this.id.hashCode() * 31) + this.courseId.hashCode()) * 31) + this.offset.hashCode()) * 31) + Integer.hashCode(this.time)) * 31) + this.coverUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.describe.hashCode()) * 31) + Boolean.hashCode(this.isCustomized);
    }

    public final boolean isCustomized() {
        return this.isCustomized;
    }

    public final void setTime(int r1) {
        this.time = r1;
    }

    @aa1
    public String toString() {
        return "ProgressMarkers(id=" + this.id + ", courseId=" + this.courseId + ", offset=" + this.offset + ", time=" + this.time + ", coverUrl=" + this.coverUrl + ", title=" + this.title + ", describe=" + this.describe + ", isCustomized=" + this.isCustomized + I000IiI1O.iO.iO;
    }

    public ProgressMarkers(@aa1 String r2, @aa1 String r3, @aa1 String r4, int r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, boolean r9) {
        Intrinsics.X0O(r2, "id");
        Intrinsics.X0O(r3, "courseId");
        Intrinsics.X0O(r4, TypedValues.CycleType.S_WAVE_OFFSET);
        Intrinsics.X0O(r6, "coverUrl");
        Intrinsics.X0O(r7, "title");
        Intrinsics.X0O(r8, "describe");
        this.id = r2;
        this.courseId = r3;
        this.offset = r4;
        this.time = r5;
        this.coverUrl = r6;
        this.title = r7;
        this.describe = r8;
        this.isCustomized = r9;
    }

    public /* synthetic */ ProgressMarkers(String r3, String r4, String r5, int r6, String r7, String r8, String r9, boolean r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r11 & 4) == 0) goto L12;
        r5 = "0";
    L12:
        if ((r11 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r11 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r11 & 64) == 0) goto L24;
        r9 = "";
    L24:
        if ((r11 & 128) == 0) goto L27;
        boolean r13 = false;
    L26:
        String r14 = r9;
        String r15 = r8;
        String r16 = r7;
        int r17 = r6;
        String r18 = r5;
        this(r3, r4, r18, r17, r16, r15, r14, r13);
        return;
    L27:
        r13 = r10;
        goto L26
    }
}
