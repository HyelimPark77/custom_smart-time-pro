package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadDownloadInfoData {

    @aa1
    public static final Companion Companion = null;
    public static final int TYPE_BUSINESS = 3;
    public static final int TYPE_DYNAMIC = 1;
    public static final int TYPE_EXERCISE = 2;
    public static final int TYPE_ILLUSTRATION = 6;
    public static final int TYPE_MACHINERY = 4;
    public static final int TYPE_OTHER = 0;
    public static final int TYPE_SIMPLE = 5;

    @aa1
    private String bleName;

    @aa1
    private String eleId;

    @aa1
    private String fileCategory;

    @aa1
    private String filePath;

    @aa1
    private String fileSize;

    @aa1
    private String firmwareFlag;

    @aa1
    private String projectId;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public UploadDownloadInfoData() {
        this.bleName = "";
        this.projectId = "";
        this.firmwareFlag = "";
        this.filePath = "";
        this.fileSize = "";
        this.fileCategory = "";
        this.eleId = "";
    }

    @aa1
    public final String getBleName() {
        return this.bleName;
    }

    @aa1
    public final String getEleId() {
        return this.eleId;
    }

    @aa1
    public final String getFileCategory() {
        return this.fileCategory;
    }

    @aa1
    public final String getFilePath() {
        return this.filePath;
    }

    @aa1
    public final String getFileSize() {
        return this.fileSize;
    }

    @aa1
    public final String getFirmwareFlag() {
        return this.firmwareFlag;
    }

    @aa1
    public final String getProjectId() {
        return this.projectId;
    }

    public final void setBleName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.bleName = r2;
    }

    public final void setEleId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.eleId = r2;
    }

    public final void setFileCategory(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.fileCategory = r2;
    }

    public final void setFilePath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.filePath = r2;
    }

    public final void setFileSize(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.fileSize = r2;
    }

    public final void setFirmwareFlag(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.firmwareFlag = r2;
    }

    public final void setProjectId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.projectId = r2;
    }
}
