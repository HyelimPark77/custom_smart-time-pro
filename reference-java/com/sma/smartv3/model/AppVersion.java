package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AppVersion {

    @aa1
    private String appName;

    @aa1
    private String fileUrl;
    private int flag;

    /* JADX INFO: renamed from: id */
    private int f51299id;

    @aa1
    private String info;

    @aa1
    private String platform;

    @aa1
    private String version;

    public AppVersion() {
        this(0, null, null, null, null, null, 0, 127, null);
    }

    public static /* synthetic */ AppVersion copy$default(AppVersion appVersion, int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = appVersion.f51299id;
        }
        if ((i3 & 2) != 0) {
            str = appVersion.appName;
        }
        if ((i3 & 4) != 0) {
            str2 = appVersion.platform;
        }
        if ((i3 & 8) != 0) {
            str3 = appVersion.version;
        }
        if ((i3 & 16) != 0) {
            str4 = appVersion.fileUrl;
        }
        if ((i3 & 32) != 0) {
            str5 = appVersion.info;
        }
        if ((i3 & 64) != 0) {
            i2 = appVersion.flag;
        }
        String str6 = str5;
        int i4 = i2;
        String str7 = str4;
        String str8 = str2;
        return appVersion.copy(i, str, str8, str3, str7, str6, i4);
    }

    public final int component1() {
        return this.f51299id;
    }

    @aa1
    public final String component2() {
        return this.appName;
    }

    @aa1
    public final String component3() {
        return this.platform;
    }

    @aa1
    public final String component4() {
        return this.version;
    }

    @aa1
    public final String component5() {
        return this.fileUrl;
    }

    @aa1
    public final String component6() {
        return this.info;
    }

    public final int component7() {
        return this.flag;
    }

    @aa1
    public final AppVersion copy(int i, @aa1 String appName, @aa1 String platform, @aa1 String version, @aa1 String fileUrl, @aa1 String info, int i2) {
        Intrinsics.X0O(appName, "appName");
        Intrinsics.X0O(platform, "platform");
        Intrinsics.X0O(version, "version");
        Intrinsics.X0O(fileUrl, "fileUrl");
        Intrinsics.X0O(info, "info");
        return new AppVersion(i, appName, platform, version, fileUrl, info, i2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppVersion)) {
            return false;
        }
        AppVersion appVersion = (AppVersion) obj;
        return this.f51299id == appVersion.f51299id && Intrinsics.XOO0ii0(this.appName, appVersion.appName) && Intrinsics.XOO0ii0(this.platform, appVersion.platform) && Intrinsics.XOO0ii0(this.version, appVersion.version) && Intrinsics.XOO0ii0(this.fileUrl, appVersion.fileUrl) && Intrinsics.XOO0ii0(this.info, appVersion.info) && this.flag == appVersion.flag;
    }

    @aa1
    public final String getAppName() {
        return this.appName;
    }

    @aa1
    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final int getFlag() {
        return this.flag;
    }

    public final int getId() {
        return this.f51299id;
    }

    @aa1
    public final String getInfo() {
        return this.info;
    }

    @aa1
    public final String getPlatform() {
        return this.platform;
    }

    @aa1
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f51299id) * 31) + this.appName.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.version.hashCode()) * 31) + this.fileUrl.hashCode()) * 31) + this.info.hashCode()) * 31) + Integer.hashCode(this.flag);
    }

    public final void setAppName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.appName = str;
    }

    public final void setFileUrl(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.fileUrl = str;
    }

    public final void setFlag(int i) {
        this.flag = i;
    }

    public final void setId(int i) {
        this.f51299id = i;
    }

    public final void setInfo(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.info = str;
    }

    public final void setPlatform(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.platform = str;
    }

    public final void setVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.version = str;
    }

    @aa1
    public String toString() {
        return "AppVersion(id=" + this.f51299id + ", appName=" + this.appName + ", platform=" + this.platform + ", version=" + this.version + ", fileUrl=" + this.fileUrl + ", info=" + this.info + ", flag=" + this.flag + I000IiI1O.C2156iO.f1007iO;
    }

    public AppVersion(int i, @aa1 String appName, @aa1 String platform, @aa1 String version, @aa1 String fileUrl, @aa1 String info, int i2) {
        Intrinsics.X0O(appName, "appName");
        Intrinsics.X0O(platform, "platform");
        Intrinsics.X0O(version, "version");
        Intrinsics.X0O(fileUrl, "fileUrl");
        Intrinsics.X0O(info, "info");
        this.f51299id = i;
        this.appName = appName;
        this.platform = platform;
        this.version = version;
        this.fileUrl = fileUrl;
        this.info = info;
        this.flag = i2;
    }

    public /* synthetic */ AppVersion(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? 0 : i2);
    }
}
