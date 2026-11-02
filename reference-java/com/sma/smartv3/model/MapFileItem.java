package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
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

    /* JADX INFO: renamed from: id */
    private final int f51314id;

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
        this(0, null, null, null, null, null, null, 0, false, 0.0d, 0L, null, false, 8191, null);
    }

    public final int component1() {
        return this.f51314id;
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
    public final MapFileItem copy(int i, @aa1 String imgPath, @aa1 String filePath, @aa1 String urlImgPath, @aa1 String urlFilePath, @aa1 String name, @aa1 String fileAllSize, int i2, boolean z, double d, long j, @aa1 String lastName, boolean z2) {
        Intrinsics.X0O(imgPath, "imgPath");
        Intrinsics.X0O(filePath, "filePath");
        Intrinsics.X0O(urlImgPath, "urlImgPath");
        Intrinsics.X0O(urlFilePath, "urlFilePath");
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(fileAllSize, "fileAllSize");
        Intrinsics.X0O(lastName, "lastName");
        return new MapFileItem(i, imgPath, filePath, urlImgPath, urlFilePath, name, fileAllSize, i2, z, d, j, lastName, z2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapFileItem)) {
            return false;
        }
        MapFileItem mapFileItem = (MapFileItem) obj;
        return this.f51314id == mapFileItem.f51314id && Intrinsics.XOO0ii0(this.imgPath, mapFileItem.imgPath) && Intrinsics.XOO0ii0(this.filePath, mapFileItem.filePath) && Intrinsics.XOO0ii0(this.urlImgPath, mapFileItem.urlImgPath) && Intrinsics.XOO0ii0(this.urlFilePath, mapFileItem.urlFilePath) && Intrinsics.XOO0ii0(this.name, mapFileItem.name) && Intrinsics.XOO0ii0(this.fileAllSize, mapFileItem.fileAllSize) && this.fileNumber == mapFileItem.fileNumber && this.isSync == mapFileItem.isSync && Double.compare(this.distance, mapFileItem.distance) == 0 && this.time == mapFileItem.time && Intrinsics.XOO0ii0(this.lastName, mapFileItem.lastName) && this.isRouteUpdate == mapFileItem.isRouteUpdate;
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
        return this.f51314id;
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
        return (((((((((((((((((((((((Integer.hashCode(this.f51314id) * 31) + this.imgPath.hashCode()) * 31) + this.filePath.hashCode()) * 31) + this.urlImgPath.hashCode()) * 31) + this.urlFilePath.hashCode()) * 31) + this.name.hashCode()) * 31) + this.fileAllSize.hashCode()) * 31) + Integer.hashCode(this.fileNumber)) * 31) + Boolean.hashCode(this.isSync)) * 31) + Double.hashCode(this.distance)) * 31) + Long.hashCode(this.time)) * 31) + this.lastName.hashCode()) * 31) + Boolean.hashCode(this.isRouteUpdate);
    }

    public final boolean isRouteUpdate() {
        return this.isRouteUpdate;
    }

    public final boolean isSync() {
        return this.isSync;
    }

    public final void setFilePath(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.filePath = str;
    }

    public final void setImgPath(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.imgPath = str;
    }

    public final void setLastName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.lastName = str;
    }

    public final void setName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.name = str;
    }

    public final void setRouteUpdate(boolean z) {
        this.isRouteUpdate = z;
    }

    public final void setSync(boolean z) {
        this.isSync = z;
    }

    public final void setUrlFilePath(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.urlFilePath = str;
    }

    public final void setUrlImgPath(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.urlImgPath = str;
    }

    @aa1
    public String toString() {
        return "MapFileItem(id=" + this.f51314id + ", imgPath=" + this.imgPath + ", filePath=" + this.filePath + ", urlImgPath=" + this.urlImgPath + ", urlFilePath=" + this.urlFilePath + ", name=" + this.name + ", fileAllSize=" + this.fileAllSize + ", fileNumber=" + this.fileNumber + ", isSync=" + this.isSync + ", distance=" + this.distance + ", time=" + this.time + ", lastName=" + this.lastName + ", isRouteUpdate=" + this.isRouteUpdate + I000IiI1O.C2156iO.f1007iO;
    }

    public MapFileItem(int i, @aa1 String imgPath, @aa1 String filePath, @aa1 String urlImgPath, @aa1 String urlFilePath, @aa1 String name, @aa1 String fileAllSize, int i2, boolean z, double d, long j, @aa1 String lastName, boolean z2) {
        Intrinsics.X0O(imgPath, "imgPath");
        Intrinsics.X0O(filePath, "filePath");
        Intrinsics.X0O(urlImgPath, "urlImgPath");
        Intrinsics.X0O(urlFilePath, "urlFilePath");
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(fileAllSize, "fileAllSize");
        Intrinsics.X0O(lastName, "lastName");
        this.f51314id = i;
        this.imgPath = imgPath;
        this.filePath = filePath;
        this.urlImgPath = urlImgPath;
        this.urlFilePath = urlFilePath;
        this.name = name;
        this.fileAllSize = fileAllSize;
        this.fileNumber = i2;
        this.isSync = z;
        this.distance = d;
        this.time = j;
        this.lastName = lastName;
        this.isRouteUpdate = z2;
    }

    public /* synthetic */ MapFileItem(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, boolean z, double d, long j, String str7, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? false : z, (i3 & 512) != 0 ? 0.0d : d, (i3 & 1024) != 0 ? 0L : j, (i3 & 2048) == 0 ? str7 : "", (i3 & 4096) != 0 ? false : z2);
    }
}
