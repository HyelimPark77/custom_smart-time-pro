package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class JobInfo extends JsonFieldContainer {

    @aa1
    private String jobId;

    @aa1
    private String logId;

    @aa1
    private String msg;

    @aa1
    private String token;

    @aa1
    private String userId;
    private int waitTime;

    public JobInfo() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ JobInfo copy$default(JobInfo r0, int r1, String r2, String r3, String r4, String r5, String r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.waitTime;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.jobId;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.msg;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.logId;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.token;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.userId;
    L20:
        String r9 = r5;
        String r10 = r6;
        String r11 = r3;
        String r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final int component1() {
        return this.waitTime;
    }

    @aa1
    public final String component2() {
        return this.jobId;
    }

    @aa1
    public final String component3() {
        return this.msg;
    }

    @aa1
    public final String component4() {
        return this.logId;
    }

    @aa1
    public final String component5() {
        return this.token;
    }

    @aa1
    public final String component6() {
        return this.userId;
    }

    @aa1
    public final JobInfo copy(int r9, @aa1 String r10, @aa1 String r11, @aa1 String r12, @aa1 String r13, @aa1 String r14) {
        Intrinsics.X0O(r10, "jobId");
        Intrinsics.X0O(r11, "msg");
        Intrinsics.X0O(r12, "logId");
        Intrinsics.X0O(r13, "token");
        Intrinsics.X0O(r14, "userId");
        return new JobInfo(r9, r10, r11, r12, r13, r14);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof JobInfo) == true) goto L8;
        return false;
    L8:
        JobInfo r6 = (JobInfo) r5;
        if (this.waitTime == r6.waitTime) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.jobId, r6.jobId) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.msg, r6.msg) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.logId, r6.logId) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.token, r6.token) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.userId, r6.userId) == true) goto L26;
        return false;
    L26:
        return true;
    }

    @aa1
    public final String getJobId() {
        return this.jobId;
    }

    @aa1
    public final String getLogId() {
        return this.logId;
    }

    @aa1
    public final String getMsg() {
        return this.msg;
    }

    @aa1
    public final String getToken() {
        return this.token;
    }

    @aa1
    public final String getUserId() {
        return this.userId;
    }

    public final int getWaitTime() {
        return this.waitTime;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.waitTime) * 31) + this.jobId.hashCode()) * 31) + this.msg.hashCode()) * 31) + this.logId.hashCode()) * 31) + this.token.hashCode()) * 31) + this.userId.hashCode();
    }

    public final void setJobId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.jobId = r2;
    }

    public final void setLogId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.logId = r2;
    }

    public final void setMsg(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.msg = r2;
    }

    public final void setToken(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.token = r2;
    }

    public final void setUserId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.userId = r2;
    }

    public final void setWaitTime(int r1) {
        this.waitTime = r1;
    }

    @aa1
    public String toString() {
        return "JobInfo(waitTime=" + this.waitTime + ", jobId=" + this.jobId + ", msg=" + this.msg + ", logId=" + this.logId + ", token=" + this.token + ", userId=" + this.userId + I000IiI1O.iO.iO;
    }

    public JobInfo(int r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7) {
        Intrinsics.X0O(r3, "jobId");
        Intrinsics.X0O(r4, "msg");
        Intrinsics.X0O(r5, "logId");
        Intrinsics.X0O(r6, "token");
        Intrinsics.X0O(r7, "userId");
        this.waitTime = r2;
        this.jobId = r3;
        this.msg = r4;
        this.logId = r5;
        this.token = r6;
        this.userId = r7;
    }

    public /* synthetic */ JobInfo(int r2, String r3, String r4, String r5, String r6, String r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r8 & 32) == 0) goto L20;
        String r10 = "";
    L21:
        this(r2, r3, r4, r5, r6, r10);
        return;
    L20:
        r10 = r7;
        goto L21
    }
}
