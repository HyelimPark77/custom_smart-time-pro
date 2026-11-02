package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class JobDetail extends JsonFieldContainer {

    @aa1
    private String imageSign;

    @aa1
    private String[] images;
    private int jobErrCode;

    @aa1
    private String jobErrMsg;

    @aa1
    private String jobId;
    private int jobStatus;

    @aa1
    private String msg;
    private int status;

    @aa1
    private String token;

    public JobDetail(int r2, @aa1 String r3, @aa1 String r4, int r5, int r6, @aa1 String r7, @aa1 String r8, @aa1 String r9, @aa1 String[] r10) {
        Intrinsics.X0O(r3, "msg");
        Intrinsics.X0O(r4, "jobId");
        Intrinsics.X0O(r7, "jobErrMsg");
        Intrinsics.X0O(r8, "token");
        Intrinsics.X0O(r9, "imageSign");
        Intrinsics.X0O(r10, uz0.iO);
        this.status = r2;
        this.msg = r3;
        this.jobId = r4;
        this.jobStatus = r5;
        this.jobErrCode = r6;
        this.jobErrMsg = r7;
        this.token = r8;
        this.imageSign = r9;
        this.images = r10;
    }

    public static /* synthetic */ JobDetail copy$default(JobDetail r0, int r1, String r2, String r3, int r4, int r5, String r6, String r7, String r8, String[] r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.status;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.msg;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.jobId;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.jobStatus;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.jobErrCode;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.jobErrMsg;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.token;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r0.imageSign;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r0.images;
    L29:
        String r12 = r8;
        String[] r13 = r9;
        String r14 = r6;
        String r15 = r7;
        int r16 = r4;
        int r17 = r5;
        String r18 = r3;
        int r19 = r1;
        return r0.copy(r19, r2, r18, r16, r17, r14, r15, r12, r13);
    }

    public final int component1() {
        return this.status;
    }

    @aa1
    public final String component2() {
        return this.msg;
    }

    @aa1
    public final String component3() {
        return this.jobId;
    }

    public final int component4() {
        return this.jobStatus;
    }

    public final int component5() {
        return this.jobErrCode;
    }

    @aa1
    public final String component6() {
        return this.jobErrMsg;
    }

    @aa1
    public final String component7() {
        return this.token;
    }

    @aa1
    public final String component8() {
        return this.imageSign;
    }

    @aa1
    public final String[] component9() {
        return this.images;
    }

    @aa1
    public final JobDetail copy(int r12, @aa1 String r13, @aa1 String r14, int r15, int r16, @aa1 String r17, @aa1 String r18, @aa1 String r19, @aa1 String[] r20) {
        Intrinsics.X0O(r13, "msg");
        Intrinsics.X0O(r14, "jobId");
        Intrinsics.X0O(r17, "jobErrMsg");
        Intrinsics.X0O(r18, "token");
        Intrinsics.X0O(r19, "imageSign");
        Intrinsics.X0O(r20, uz0.iO);
        return new JobDetail(r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof JobDetail) == true) goto L8;
        return false;
    L8:
        JobDetail r6 = (JobDetail) r5;
        if (this.status == r6.status) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.msg, r6.msg) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.jobId, r6.jobId) == true) goto L18;
        return false;
    L18:
        if (this.jobStatus == r6.jobStatus) goto L21;
        return false;
    L21:
        if (this.jobErrCode == r6.jobErrCode) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.jobErrMsg, r6.jobErrMsg) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.token, r6.token) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.imageSign, r6.imageSign) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.images, r6.images) == true) goto L35;
        return false;
    L35:
        return true;
    }

    @aa1
    public final String getImageSign() {
        return this.imageSign;
    }

    @aa1
    public final String[] getImages() {
        return this.images;
    }

    public final int getJobErrCode() {
        return this.jobErrCode;
    }

    @aa1
    public final String getJobErrMsg() {
        return this.jobErrMsg;
    }

    @aa1
    public final String getJobId() {
        return this.jobId;
    }

    public final int getJobStatus() {
        return this.jobStatus;
    }

    @aa1
    public final String getMsg() {
        return this.msg;
    }

    public final int getStatus() {
        return this.status;
    }

    @aa1
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.status) * 31) + this.msg.hashCode()) * 31) + this.jobId.hashCode()) * 31) + Integer.hashCode(this.jobStatus)) * 31) + Integer.hashCode(this.jobErrCode)) * 31) + this.jobErrMsg.hashCode()) * 31) + this.token.hashCode()) * 31) + this.imageSign.hashCode()) * 31) + Arrays.hashCode(this.images);
    }

    public final void setImageSign(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.imageSign = r2;
    }

    public final void setImages(@aa1 String[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.images = r2;
    }

    public final void setJobErrCode(int r1) {
        this.jobErrCode = r1;
    }

    public final void setJobErrMsg(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.jobErrMsg = r2;
    }

    public final void setJobId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.jobId = r2;
    }

    public final void setJobStatus(int r1) {
        this.jobStatus = r1;
    }

    public final void setMsg(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.msg = r2;
    }

    public final void setStatus(int r1) {
        this.status = r1;
    }

    public final void setToken(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.token = r2;
    }

    @aa1
    public String toString() {
        return "JobDetail(status=" + this.status + ", msg=" + this.msg + ", jobId=" + this.jobId + ", jobStatus=" + this.jobStatus + ", jobErrCode=" + this.jobErrCode + ", jobErrMsg=" + this.jobErrMsg + ", token=" + this.token + ", imageSign=" + this.imageSign + ", images=" + Arrays.toString(this.images) + I000IiI1O.iO.iO;
    }

    public /* synthetic */ JobDetail(int r3, String r4, String r5, int r6, int r7, String r8, String r9, String r10, String[] r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r12 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r12 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r7 = 0;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r12 & 64) == 0) goto L24;
        r9 = "";
    L24:
        if ((r12 & 128) == 0) goto L27;
        String r14 = "";
    L26:
        String r15 = r9;
        String r16 = r8;
        int r17 = r7;
        int r18 = r6;
        String r19 = r5;
        this(r3, r4, r19, r18, r17, r16, r15, r14, r11);
        return;
    L27:
        r14 = r10;
        goto L26
    }
}
