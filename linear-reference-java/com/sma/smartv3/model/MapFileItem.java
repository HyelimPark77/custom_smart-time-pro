package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.ironsource.Y5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MapFileItem {
    private final double distance;

    @aa1
    private final String fileAllSize;
    private final int fileNumber;

    @aa1
    private String filePath;
    private final int id;

    @aa1
    private String imgPath;
    private boolean isRouteUpdate;
    private boolean isSync;

    @aa1
    private String lastName;

    @aa1
    private String name;
    private final long time;

    @aa1
    private String urlFilePath;

    @aa1
    private String urlImgPath;

    public MapFileItem() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        int r8 = 0;
        boolean r9 = false;
        double r10 = 0.0d;
        long r12 = 0;
        String r14 = null;
        boolean r15 = false;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, 8191, null);
    }

    public static /* synthetic */ MapFileItem copy$default(MapFileItem r16, int r17, String r18, String r19, String r20, String r21, String r22, String r23, int r24, boolean r25, double r26, long r28, String r30, boolean r31, int r32, Object r33) {
        if ((r32 & 1) == 0) goto L5;
        int r2 = r16.id;
    L7:
        if ((r32 & 2) == 0) goto L9;
        String r3 = r16.imgPath;
    L11:
        if ((r32 & 4) == 0) goto L13;
        String r4 = r16.filePath;
    L15:
        if ((r32 & 8) == 0) goto L17;
        String r5 = r16.urlImgPath;
    L19:
        if ((r32 & 16) == 0) goto L21;
        String r6 = r16.urlFilePath;
    L23:
        if ((r32 & 32) == 0) goto L25;
        String r7 = r16.name;
    L27:
        if ((r32 & 64) == 0) goto L29;
        String r8 = r16.fileAllSize;
    L31:
        if ((r32 & 128) == 0) goto L33;
        int r9 = r16.fileNumber;
    L35:
        if ((r32 & 256) == 0) goto L37;
        boolean r10 = r16.isSync;
    L39:
        if ((r32 & 512) == 0) goto L41;
        double r11 = r16.distance;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        long r13 = r16.time;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        String r15 = r16.lastName;
    L51:
        if ((r32 & 4096) == 0) goto L54;
        boolean r34 = r16.isRouteUpdate;
    L56:
        return r16.copy(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r34);
    L54:
        r34 = r31;
        goto L56
    L49:
        r15 = r30;
        goto L51
    L45:
        r13 = r28;
        goto L47
    L41:
        r11 = r26;
        goto L43
    L37:
        r10 = r25;
        goto L39
    L33:
        r9 = r24;
        goto L35
    L29:
        r8 = r23;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r2 = r17;
        goto L7
    }

    public final int component1() {
        return this.id;
    }

    public final double component10() {
        return this.distance;
    }

    public final long component11() {
        return this.time;
    }

    @aa1
    public final String component12() {
        return this.lastName;
    }

    public final boolean component13() {
        return this.isRouteUpdate;
    }

    @aa1
    public final String component2() {
        return this.imgPath;
    }

    @aa1
    public final String component3() {
        return this.filePath;
    }

    @aa1
    public final String component4() {
        return this.urlImgPath;
    }

    @aa1
    public final String component5() {
        return this.urlFilePath;
    }

    @aa1
    public final String component6() {
        return this.name;
    }

    @aa1
    public final String component7() {
        return this.fileAllSize;
    }

    public final int component8() {
        return this.fileNumber;
    }

    public final boolean component9() {
        return this.isSync;
    }

    @aa1
    public final MapFileItem copy(int r18, @aa1 String r19, @aa1 String r20, @aa1 String r21, @aa1 String r22, @aa1 String r23, @aa1 String r24, int r25, boolean r26, double r27, long r29, @aa1 String r31, boolean r32) {
        Intrinsics.X0O(r19, "imgPath");
        Intrinsics.X0O(r20, Y5.c.c);
        Intrinsics.X0O(r21, "urlImgPath");
        Intrinsics.X0O(r22, "urlFilePath");
        Intrinsics.X0O(r23, "name");
        Intrinsics.X0O(r24, "fileAllSize");
        Intrinsics.X0O(r31, "lastName");
        return new MapFileItem(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof MapFileItem) == true) goto L8;
        return false;
    L8:
        MapFileItem r9 = (MapFileItem) r8;
        if (this.id == r9.id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.imgPath, r9.imgPath) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.filePath, r9.filePath) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.urlImgPath, r9.urlImgPath) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.urlFilePath, r9.urlFilePath) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.name, r9.name) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.fileAllSize, r9.fileAllSize) == true) goto L30;
        return false;
    L30:
        if (this.fileNumber == r9.fileNumber) goto L33;
        return false;
    L33:
        if (this.isSync == r9.isSync) goto L36;
        return false;
    L36:
        if (Double.compare(this.distance, r9.distance) == 0) goto L39;
        return false;
    L39:
        if (this.time == r9.time) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.lastName, r9.lastName) == true) goto L45;
        return false;
    L45:
        if (this.isRouteUpdate == r9.isRouteUpdate) goto L47;
        return false;
    L47:
        return true;
    }

    public final double getDistance() {
        return this.distance;
    }

    @aa1
    public final String getFileAllSize() {
        return this.fileAllSize;
    }

    public final int getFileNumber() {
        return this.fileNumber;
    }

    @aa1
    public final String getFilePath() {
        return this.filePath;
    }

    public final int getId() {
        return this.id;
    }

    @aa1
    public final String getImgPath() {
        return this.imgPath;
    }

    @aa1
    public final String getLastName() {
        return this.lastName;
    }

    @aa1
    public final String getName() {
        return this.name;
    }

    public final long getTime() {
        return this.time;
    }

    @aa1
    public final String getUrlFilePath() {
        return this.urlFilePath;
    }

    @aa1
    public final String getUrlImgPath() {
        return this.urlImgPath;
    }

    public int hashCode() {
        return (((((((((((((((((((((((Integer.hashCode(this.id) * 31) + this.imgPath.hashCode()) * 31) + this.filePath.hashCode()) * 31) + this.urlImgPath.hashCode()) * 31) + this.urlFilePath.hashCode()) * 31) + this.name.hashCode()) * 31) + this.fileAllSize.hashCode()) * 31) + Integer.hashCode(this.fileNumber)) * 31) + Boolean.hashCode(this.isSync)) * 31) + Double.hashCode(this.distance)) * 31) + Long.hashCode(this.time)) * 31) + this.lastName.hashCode()) * 31) + Boolean.hashCode(this.isRouteUpdate);
    }

    public final boolean isRouteUpdate() {
        return this.isRouteUpdate;
    }

    public final boolean isSync() {
        return this.isSync;
    }

    public final void setFilePath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.filePath = r2;
    }

    public final void setImgPath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.imgPath = r2;
    }

    public final void setLastName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.lastName = r2;
    }

    public final void setName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.name = r2;
    }

    public final void setRouteUpdate(boolean r1) {
        this.isRouteUpdate = r1;
    }

    public final void setSync(boolean r1) {
        this.isSync = r1;
    }

    public final void setUrlFilePath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.urlFilePath = r2;
    }

    public final void setUrlImgPath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.urlImgPath = r2;
    }

    @aa1
    public String toString() {
        return "MapFileItem(id=" + this.id + ", imgPath=" + this.imgPath + ", filePath=" + this.filePath + ", urlImgPath=" + this.urlImgPath + ", urlFilePath=" + this.urlFilePath + ", name=" + this.name + ", fileAllSize=" + this.fileAllSize + ", fileNumber=" + this.fileNumber + ", isSync=" + this.isSync + ", distance=" + this.distance + ", time=" + this.time + ", lastName=" + this.lastName + ", isRouteUpdate=" + this.isRouteUpdate + I000IiI1O.iO.iO;
    }

    public MapFileItem(int r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, @aa1 String r9, int r10, boolean r11, double r12, long r14, @aa1 String r16, boolean r17) {
        Intrinsics.X0O(r4, "imgPath");
        Intrinsics.X0O(r5, Y5.c.c);
        Intrinsics.X0O(r6, "urlImgPath");
        Intrinsics.X0O(r7, "urlFilePath");
        Intrinsics.X0O(r8, "name");
        Intrinsics.X0O(r9, "fileAllSize");
        Intrinsics.X0O(r16, "lastName");
        this.id = r3;
        this.imgPath = r4;
        this.filePath = r5;
        this.urlImgPath = r6;
        this.urlFilePath = r7;
        this.name = r8;
        this.fileAllSize = r9;
        this.fileNumber = r10;
        this.isSync = r11;
        this.distance = r12;
        this.time = r14;
        this.lastName = r16;
        this.isRouteUpdate = r17;
    }

    public /* synthetic */ MapFileItem(int r17, String r18, String r19, String r20, String r21, String r22, String r23, int r24, boolean r25, double r26, long r28, String r30, boolean r31, int r32, DefaultConstructorMarker r33) {
        if ((r32 & 1) == 0) goto L5;
        int r1 = 0;
    L6:
        String r4 = "";
        if ((r32 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r32 & 4) == 0) goto L13;
        String r5 = "";
    L15:
        if ((r32 & 8) == 0) goto L17;
        String r6 = "";
    L19:
        if ((r32 & 16) == 0) goto L21;
        String r7 = "";
    L23:
        if ((r32 & 32) == 0) goto L25;
        String r8 = "";
    L27:
        if ((r32 & 64) == 0) goto L29;
        String r9 = "";
    L31:
        if ((r32 & 128) == 0) goto L33;
        int r10 = 0;
    L35:
        if ((r32 & 256) == 0) goto L37;
        boolean r11 = false;
    L39:
        if ((r32 & 512) == 0) goto L41;
        double r12 = 0.0d;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        long r14 = 0;
    L47:
        if ((r32 & 2048) != 0) goto L51;
        r4 = r30;
    L51:
        if ((r32 & 4096) == 0) goto L54;
        boolean r34 = false;
    L55:
        this(r1, r3, r5, r6, r7, r8, r9, r10, r11, r12, r14, r4, r34);
        return;
    L54:
        r34 = r31;
        goto L55
    L45:
        r14 = r28;
        goto L47
    L41:
        r12 = r26;
        goto L43
    L37:
        r11 = r25;
        goto L39
    L33:
        r10 = r24;
        goto L35
    L29:
        r9 = r23;
        goto L31
    L25:
        r8 = r22;
        goto L27
    L21:
        r7 = r21;
        goto L23
    L17:
        r6 = r20;
        goto L19
    L13:
        r5 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r1 = r17;
        goto L6
    }
}
