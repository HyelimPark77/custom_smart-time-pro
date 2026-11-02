package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
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

    public JobDetail(int i, @aa1 String msg, @aa1 String jobId, int i2, int i3, @aa1 String jobErrMsg, @aa1 String token, @aa1 String imageSign, @aa1 String[] images) {
        Intrinsics.X0O(msg, "msg");
        Intrinsics.X0O(jobId, "jobId");
        Intrinsics.X0O(jobErrMsg, "jobErrMsg");
        Intrinsics.X0O(token, "token");
        Intrinsics.X0O(imageSign, "imageSign");
        Intrinsics.X0O(images, "images");
        this.status = i;
        this.msg = msg;
        this.jobId = jobId;
        this.jobStatus = i2;
        this.jobErrCode = i3;
        this.jobErrMsg = jobErrMsg;
        this.token = token;
        this.imageSign = imageSign;
        this.images = images;
    }

    public static /* synthetic */ JobDetail copy$default(JobDetail jobDetail, int i, String str, String str2, int i2, int i3, String str3, String str4, String str5, String[] strArr, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = jobDetail.status;
        }
        if ((i4 & 2) != 0) {
            str = jobDetail.msg;
        }
        if ((i4 & 4) != 0) {
            str2 = jobDetail.jobId;
        }
        if ((i4 & 8) != 0) {
            i2 = jobDetail.jobStatus;
        }
        if ((i4 & 16) != 0) {
            i3 = jobDetail.jobErrCode;
        }
        if ((i4 & 32) != 0) {
            str3 = jobDetail.jobErrMsg;
        }
        if ((i4 & 64) != 0) {
            str4 = jobDetail.token;
        }
        if ((i4 & 128) != 0) {
            str5 = jobDetail.imageSign;
        }
        if ((i4 & 256) != 0) {
            strArr = jobDetail.images;
        }
        String str6 = str5;
        String[] strArr2 = strArr;
        String str7 = str3;
        String str8 = str4;
        int i5 = i3;
        String str9 = str2;
        return jobDetail.copy(i, str, str9, i2, i5, str7, str8, str6, strArr2);
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
    public final JobDetail copy(int i, @aa1 String msg, @aa1 String jobId, int i2, int i3, @aa1 String jobErrMsg, @aa1 String token, @aa1 String imageSign, @aa1 String[] images) {
        Intrinsics.X0O(msg, "msg");
        Intrinsics.X0O(jobId, "jobId");
        Intrinsics.X0O(jobErrMsg, "jobErrMsg");
        Intrinsics.X0O(token, "token");
        Intrinsics.X0O(imageSign, "imageSign");
        Intrinsics.X0O(images, "images");
        return new JobDetail(i, msg, jobId, i2, i3, jobErrMsg, token, imageSign, images);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobDetail)) {
            return false;
        }
        JobDetail jobDetail = (JobDetail) obj;
        return this.status == jobDetail.status && Intrinsics.XOO0ii0(this.msg, jobDetail.msg) && Intrinsics.XOO0ii0(this.jobId, jobDetail.jobId) && this.jobStatus == jobDetail.jobStatus && this.jobErrCode == jobDetail.jobErrCode && Intrinsics.XOO0ii0(this.jobErrMsg, jobDetail.jobErrMsg) && Intrinsics.XOO0ii0(this.token, jobDetail.token) && Intrinsics.XOO0ii0(this.imageSign, jobDetail.imageSign) && Intrinsics.XOO0ii0(this.images, jobDetail.images);
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

    public final void setImageSign(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.imageSign = str;
    }

    public final void setImages(@aa1 String[] strArr) {
        Intrinsics.X0O(strArr, "<set-?>");
        this.images = strArr;
    }

    public final void setJobErrCode(int i) {
        this.jobErrCode = i;
    }

    public final void setJobErrMsg(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.jobErrMsg = str;
    }

    public final void setJobId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.jobId = str;
    }

    public final void setJobStatus(int i) {
        this.jobStatus = i;
    }

    public final void setMsg(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.msg = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setToken(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.token = str;
    }

    @aa1
    public String toString() {
        return "JobDetail(status=" + this.status + ", msg=" + this.msg + ", jobId=" + this.jobId + ", jobStatus=" + this.jobStatus + ", jobErrCode=" + this.jobErrCode + ", jobErrMsg=" + this.jobErrMsg + ", token=" + this.token + ", imageSign=" + this.imageSign + ", images=" + Arrays.toString(this.images) + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ JobDetail(int i, String str, String str2, int i2, int i3, String str3, String str4, String str5, String[] strArr, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3, (i4 & 32) != 0 ? "" : str3, (i4 & 64) != 0 ? "" : str4, (i4 & 128) != 0 ? "" : str5, strArr);
    }
}
