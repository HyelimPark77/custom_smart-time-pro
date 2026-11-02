package com.sma.smartv3.model;

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

    /* JADX INFO: renamed from: id */
    @aa1
    private final String f51318id;
    private final boolean isCustomized;

    @aa1
    private final String offset;
    private int time;

    @aa1
    private final String title;

    public ProgressMarkers() {
        this(null, null, null, 0, null, null, null, false, 255, null);
    }

    public static /* synthetic */ ProgressMarkers copy$default(ProgressMarkers progressMarkers, String str, String str2, String str3, int i, String str4, String str5, String str6, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = progressMarkers.f51318id;
        }
        if ((i2 & 2) != 0) {
            str2 = progressMarkers.courseId;
        }
        if ((i2 & 4) != 0) {
            str3 = progressMarkers.offset;
        }
        if ((i2 & 8) != 0) {
            i = progressMarkers.time;
        }
        if ((i2 & 16) != 0) {
            str4 = progressMarkers.coverUrl;
        }
        if ((i2 & 32) != 0) {
            str5 = progressMarkers.title;
        }
        if ((i2 & 64) != 0) {
            str6 = progressMarkers.describe;
        }
        if ((i2 & 128) != 0) {
            z = progressMarkers.isCustomized;
        }
        String str7 = str6;
        boolean z2 = z;
        String str8 = str4;
        String str9 = str5;
        return progressMarkers.copy(str, str2, str3, i, str8, str9, str7, z2);
    }

    @aa1
    public final String component1() {
        return this.f51318id;
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
    public final ProgressMarkers copy(@aa1 String id, @aa1 String courseId, @aa1 String offset, int i, @aa1 String coverUrl, @aa1 String title, @aa1 String describe, boolean z) {
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(courseId, "courseId");
        Intrinsics.X0O(offset, "offset");
        Intrinsics.X0O(coverUrl, "coverUrl");
        Intrinsics.X0O(title, "title");
        Intrinsics.X0O(describe, "describe");
        return new ProgressMarkers(id, courseId, offset, i, coverUrl, title, describe, z);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressMarkers)) {
            return false;
        }
        ProgressMarkers progressMarkers = (ProgressMarkers) obj;
        return Intrinsics.XOO0ii0(this.f51318id, progressMarkers.f51318id) && Intrinsics.XOO0ii0(this.courseId, progressMarkers.courseId) && Intrinsics.XOO0ii0(this.offset, progressMarkers.offset) && this.time == progressMarkers.time && Intrinsics.XOO0ii0(this.coverUrl, progressMarkers.coverUrl) && Intrinsics.XOO0ii0(this.title, progressMarkers.title) && Intrinsics.XOO0ii0(this.describe, progressMarkers.describe) && this.isCustomized == progressMarkers.isCustomized;
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
        return this.f51318id;
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
        return (((((((((((((this.f51318id.hashCode() * 31) + this.courseId.hashCode()) * 31) + this.offset.hashCode()) * 31) + Integer.hashCode(this.time)) * 31) + this.coverUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.describe.hashCode()) * 31) + Boolean.hashCode(this.isCustomized);
    }

    public final boolean isCustomized() {
        return this.isCustomized;
    }

    public final void setTime(int i) {
        this.time = i;
    }

    @aa1
    public String toString() {
        return "ProgressMarkers(id=" + this.f51318id + ", courseId=" + this.courseId + ", offset=" + this.offset + ", time=" + this.time + ", coverUrl=" + this.coverUrl + ", title=" + this.title + ", describe=" + this.describe + ", isCustomized=" + this.isCustomized + I000IiI1O.C2156iO.f1007iO;
    }

    public ProgressMarkers(@aa1 String id, @aa1 String courseId, @aa1 String offset, int i, @aa1 String coverUrl, @aa1 String title, @aa1 String describe, boolean z) {
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(courseId, "courseId");
        Intrinsics.X0O(offset, "offset");
        Intrinsics.X0O(coverUrl, "coverUrl");
        Intrinsics.X0O(title, "title");
        Intrinsics.X0O(describe, "describe");
        this.f51318id = id;
        this.courseId = courseId;
        this.offset = offset;
        this.time = i;
        this.coverUrl = coverUrl;
        this.title = title;
        this.describe = describe;
        this.isCustomized = z;
    }

    public /* synthetic */ ProgressMarkers(String str, String str2, String str3, int i, String str4, String str5, String str6, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "0" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? false : z);
    }
}
