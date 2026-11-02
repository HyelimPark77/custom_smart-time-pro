package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadBaiduServiceCallLogData {
    public static final int CALL_TYPE_AIGC = 1;
    public static final int CALL_TYPE_NAV = 2;
    public static final int CALL_TYPE_OTHER = 0;
    public static final int CALL_TYPE_SCORE_GOOD = 4;
    public static final int CALL_TYPE_SCORE_HIDE = 6;
    public static final int CALL_TYPE_SCORE_POOR = 5;
    public static final int CALL_TYPE_SCORE_SHOW = 7;
    public static final int CALL_TYPE_VOICE = 3;
    public static final int COUNT_ADS_CLICK_SUCCESS = 19;
    public static final int COUNT_ADS_EXHIBIT_SUCCESS = 18;
    public static final int COUNT_ADS_INITIALIZE_APP = 16;
    public static final int COUNT_ADS_INITIALIZE_SDK = 17;
    public static final int COUNT_NAV_AUTOMATIC_RETRIEVAL = 20;
    public static final int COUNT_NAV_GEOGRAPHIC_DETAIL = 21;
    public static final int COUNT_NAV_ROUTE_PLANNING = 22;

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int MICROSOFT_IDENTIFY = 8;
    public static final int MICROSOFT_PLAY_AUDIO = 10;
    public static final int MICROSOFT_TRANSLATE = 9;
    public static final int PLATFORM_ANDROID = 2;
    public static final int PLATFORM_IOS = 1;
    private long callTime;
    private int callType;
    private int platform;
    private int projectId;

    @aa1
    private String bleName = "";

    @aa1
    private String firmwareFlag = "";

    @aa1
    private String appVersion = "";

    @aa1
    private String macAddress = "";

    @aa1
    private String remark = "";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @aa1
    public final String getAppVersion() {
        return this.appVersion;
    }

    @aa1
    public final String getBleName() {
        return this.bleName;
    }

    public final long getCallTime() {
        return this.callTime;
    }

    public final int getCallType() {
        return this.callType;
    }

    @aa1
    public final String getFirmwareFlag() {
        return this.firmwareFlag;
    }

    @aa1
    public final String getMacAddress() {
        return this.macAddress;
    }

    public final int getPlatform() {
        return this.platform;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    @aa1
    public final String getRemark() {
        return this.remark;
    }

    public final void setAppVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setBleName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.bleName = str;
    }

    public final void setCallTime(long j) {
        this.callTime = j;
    }

    public final void setCallType(int i) {
        this.callType = i;
    }

    public final void setFirmwareFlag(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.firmwareFlag = str;
    }

    public final void setMacAddress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.macAddress = str;
    }

    public final void setPlatform(int i) {
        this.platform = i;
    }

    public final void setProjectId(int i) {
        this.projectId = i;
    }

    public final void setRemark(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.remark = str;
    }
}
