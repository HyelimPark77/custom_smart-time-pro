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
        this(0, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ JobInfo copy$default(JobInfo jobInfo, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = jobInfo.waitTime;
        }
        if ((i2 & 2) != 0) {
            str = jobInfo.jobId;
        }
        if ((i2 & 4) != 0) {
            str2 = jobInfo.msg;
        }
        if ((i2 & 8) != 0) {
            str3 = jobInfo.logId;
        }
        if ((i2 & 16) != 0) {
            str4 = jobInfo.token;
        }
        if ((i2 & 32) != 0) {
            str5 = jobInfo.userId;
        }
        String str6 = str4;
        String str7 = str5;
        return jobInfo.copy(i, str, str2, str3, str6, str7);
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
    public final JobInfo copy(int i, @aa1 String jobId, @aa1 String msg, @aa1 String logId, @aa1 String token, @aa1 String userId) {
        Intrinsics.X0O(jobId, "jobId");
        Intrinsics.X0O(msg, "msg");
        Intrinsics.X0O(logId, "logId");
        Intrinsics.X0O(token, "token");
        Intrinsics.X0O(userId, "userId");
        return new JobInfo(i, jobId, msg, logId, token, userId);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobInfo)) {
            return false;
        }
        JobInfo jobInfo = (JobInfo) obj;
        return this.waitTime == jobInfo.waitTime && Intrinsics.XOO0ii0(this.jobId, jobInfo.jobId) && Intrinsics.XOO0ii0(this.msg, jobInfo.msg) && Intrinsics.XOO0ii0(this.logId, jobInfo.logId) && Intrinsics.XOO0ii0(this.token, jobInfo.token) && Intrinsics.XOO0ii0(this.userId, jobInfo.userId);
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

    public final void setJobId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.jobId = str;
    }

    public final void setLogId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.logId = str;
    }

    public final void setMsg(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.msg = str;
    }

    public final void setToken(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.token = str;
    }

    public final void setUserId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.userId = str;
    }

    public final void setWaitTime(int i) {
        this.waitTime = i;
    }

    @aa1
    public String toString() {
        return "JobInfo(waitTime=" + this.waitTime + ", jobId=" + this.jobId + ", msg=" + this.msg + ", logId=" + this.logId + ", token=" + this.token + ", userId=" + this.userId + I000IiI1O.C2156iO.f1007iO;
    }

    public JobInfo(int i, @aa1 String jobId, @aa1 String msg, @aa1 String logId, @aa1 String token, @aa1 String userId) {
        Intrinsics.X0O(jobId, "jobId");
        Intrinsics.X0O(msg, "msg");
        Intrinsics.X0O(logId, "logId");
        Intrinsics.X0O(token, "token");
        Intrinsics.X0O(userId, "userId");
        this.waitTime = i;
        this.jobId = jobId;
        this.msg = msg;
        this.logId = logId;
        this.token = token;
        this.userId = userId;
    }

    public /* synthetic */ JobInfo(int i, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5);
    }
}
