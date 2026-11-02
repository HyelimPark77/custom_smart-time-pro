package com.sma.smartv3.work;

import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.alibaba.sdk.android.oss.common.auth.OSSStsTokenCredentialProvider;
import com.alibaba.sdk.android.oss.model.AppendObjectRequest;
import com.alibaba.sdk.android.oss.model.AppendObjectResult;
import com.alibaba.sdk.android.oss.model.HeadObjectRequest;
import com.alibaba.sdk.android.oss.model.HeadObjectResult;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import com.alibaba.sdk.android.oss.model.OSSResult;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q96;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.Y5;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.db.entity.AlipayBindInfo;
import com.sma.smartv3.db.entity.BloodOxygen;
import com.sma.smartv3.db.entity.BloodPressure;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.db.entity.Hrv;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.db.entity.Temperature;
import com.sma.smartv3.db.entity.Weight;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.JsonFieldContainer;
import com.sma.smartv3.model.SMADataUploadData;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nOSSWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OSSWorker.kt\ncom/sma/smartv3/work/UploadOSSWorker\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,520:1\n19#2:521\n15#2:522\n93#2,2:543\n90#2:545\n19#2:566\n15#2:567\n1869#3,2:523\n1869#3,2:525\n1869#3,2:527\n1869#3,2:529\n1869#3,2:531\n1869#3,2:533\n1869#3,2:535\n1869#3,2:537\n1869#3,2:539\n1869#3,2:541\n126#4,11:546\n146#4:565\n200#5,7:557\n218#5:564\n*S KotlinDebug\n*F\n+ 1 OSSWorker.kt\ncom/sma/smartv3/work/UploadOSSWorker\n*L\n85#1:521\n85#1:522\n331#1:543,2\n331#1:545\n371#1:566\n371#1:567\n93#1:523,2\n114#1:525,2\n129#1:527,2\n145#1:529,2\n161#1:531,2\n176#1:533,2\n194#1:535,2\n211#1:537,2\n226#1:539,2\n269#1:541,2\n344#1:546,11\n344#1:565\n344#1:557,7\n344#1:564\n*E\n"})
public final class UploadOSSWorker {

    @aa1
    public static String IiI10X;

    @tb1
    public static O1XIiIO<Object> O00;

    @aa1
    public static final UploadOSSWorker OXO1 = null;

    @aa1
    public static final StringBuffer XIi00iiXO = null;

    @aa1
    public static final String XO0O10 = null;

    @aa1
    public static final String iO = null;

    @Keep
    public static final class Credentials extends JsonFieldContainer implements Serializable {

        @aa1
        private final String accessKeyId;

        @aa1
        private final String accessKeySecret;

        @aa1
        private final String expiration;

        @aa1
        private final String securityToken;

        public Credentials() {
            String r1 = null;
            String r2 = null;
            String r3 = null;
            String r4 = null;
            this(r1, r2, r3, r4, 15, null);
        }

        public static /* synthetic */ Credentials copy$default(Credentials r0, String r1, String r2, String r3, String r4, int r5, Object r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = r0.securityToken;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r2 = r0.accessKeySecret;
        L9:
            if ((r5 & 4) == 0) goto L12;
            r3 = r0.accessKeyId;
        L12:
            if ((r5 & 8) == 0) goto L15;
            r4 = r0.expiration;
        L15:
            return r0.copy(r1, r2, r3, r4);
        }

        @aa1
        public final String component1() {
            return this.securityToken;
        }

        @aa1
        public final String component2() {
            return this.accessKeySecret;
        }

        @aa1
        public final String component3() {
            return this.accessKeyId;
        }

        @aa1
        public final String component4() {
            return this.expiration;
        }

        @aa1
        public final Credentials copy(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5) {
            Intrinsics.X0O(r2, "securityToken");
            Intrinsics.X0O(r3, "accessKeySecret");
            Intrinsics.X0O(r4, "accessKeyId");
            Intrinsics.X0O(r5, "expiration");
            return new Credentials(r2, r3, r4, r5);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Credentials) == true) goto L8;
            return false;
        L8:
            Credentials r6 = (Credentials) r5;
            if (Intrinsics.XOO0ii0(this.securityToken, r6.securityToken) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.XOO0ii0(this.accessKeySecret, r6.accessKeySecret) == true) goto L15;
            return false;
        L15:
            if (Intrinsics.XOO0ii0(this.accessKeyId, r6.accessKeyId) == true) goto L18;
            return false;
        L18:
            if (Intrinsics.XOO0ii0(this.expiration, r6.expiration) == true) goto L20;
            return false;
        L20:
            return true;
        }

        @aa1
        public final String getAccessKeyId() {
            return this.accessKeyId;
        }

        @aa1
        public final String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        @aa1
        public final String getExpiration() {
            return this.expiration;
        }

        @aa1
        public final String getSecurityToken() {
            return this.securityToken;
        }

        public int hashCode() {
            return (((((this.securityToken.hashCode() * 31) + this.accessKeySecret.hashCode()) * 31) + this.accessKeyId.hashCode()) * 31) + this.expiration.hashCode();
        }

        @aa1
        public String toString() {
            return "Credentials(securityToken=" + this.securityToken + ", accessKeySecret=" + this.accessKeySecret + ", accessKeyId=" + this.accessKeyId + ", expiration=" + this.expiration + I000IiI1O.iO.iO;
        }

        public Credentials(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5) {
            Intrinsics.X0O(r2, "securityToken");
            Intrinsics.X0O(r3, "accessKeySecret");
            Intrinsics.X0O(r4, "accessKeyId");
            Intrinsics.X0O(r5, "expiration");
            this.securityToken = r2;
            this.accessKeySecret = r3;
            this.accessKeyId = r4;
            this.expiration = r5;
        }

        public /* synthetic */ Credentials(String r2, String r3, String r4, String r5, int r6, DefaultConstructorMarker r7) {
            if ((r6 & 1) == 0) goto L6;
            r2 = "";
        L6:
            if ((r6 & 2) == 0) goto L9;
            r3 = "";
        L9:
            if ((r6 & 4) == 0) goto L12;
            r4 = "";
        L12:
            if ((r6 & 8) == 0) goto L14;
            r5 = "";
        L14:
            this(r2, r3, r4, r5);
        }
    }

    public static final class OXO1 implements OSSCompletedCallback<AppendObjectRequest, AppendObjectResult> {
        public final /* synthetic */ File OXO1;

        public OXO1(File r1) {
            this.OXO1 = r1;
        }

        public void OXO1(AppendObjectRequest r2, ClientException r3, ServiceException r4) {
            Intrinsics.X0O(r3, "clientExcepion");
            Intrinsics.X0O(r4, "serviceException");
            i1O0OXO1O.OXO1.OXO1(UploadOSSWorker.XO0O10() + " append failure request = " + r2);
            O1XIiIO r5 = UploadOSSWorker.iO();
            if (r5 == null) goto L6;
            r5.handleResponse("append failure request = " + r2);
            return;
        }

        public void XIi00iiXO(AppendObjectRequest r4, AppendObjectResult r5) {
            Intrinsics.X0O(r5, "result");
            i1O0OXO1O.OXO1.OXO1(UploadOSSWorker.XO0O10() + " AppendSuccess , NextPosition " + r5.getNextPosition());
            if (this.OXO1.exists() == false) goto L8;
            FileUtils.delete(this.OXO1);
            O1XIiIO r6 = UploadOSSWorker.iO();
            if (r6 == null) goto L9;
            r6.handleResponse("append success");
            return;
        L9:
            return;
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        public /* bridge */ /* synthetic */ void onFailure(OSSRequest r1, ClientException r2, ServiceException r3) {
            OXO1((AppendObjectRequest) r1, r2, r3);
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        public /* bridge */ /* synthetic */ void onSuccess(OSSRequest r1, OSSResult r2) {
            XIi00iiXO((AppendObjectRequest) r1, (AppendObjectResult) r2);
        }
    }

    @Keep
    public static final class ResponseData extends JsonFieldContainer implements Serializable {

        @tb1
        private final Credentials credentials;

        /* JADX WARN: Multi-variable type inference failed */
        public ResponseData() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ResponseData copy$default(ResponseData r0, Credentials r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = r0.credentials;
        L6:
            return r0.copy(r1);
        }

        @tb1
        public final Credentials component1() {
            return this.credentials;
        }

        @aa1
        public final ResponseData copy(@tb1 Credentials r2) {
            return new ResponseData(r2);
        }

        public boolean equals(@tb1 Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof ResponseData) == true) goto L9;
            return false;
        L9:
            if (Intrinsics.XOO0ii0(this.credentials, ((ResponseData) r4).credentials) == true) goto L11;
            return false;
        L11:
            return true;
        }

        @tb1
        public final Credentials getCredentials() {
            return this.credentials;
        }

        public int hashCode() {
            Credentials r0 = this.credentials;
            if (r0 != null) goto L7;
            return 0;
        L7:
            return r0.hashCode();
        }

        @aa1
        public String toString() {
            return "ResponseData(credentials=" + this.credentials + I000IiI1O.iO.iO;
        }

        public ResponseData(@tb1 Credentials r1) {
            this.credentials = r1;
        }

        public /* synthetic */ ResponseData(Credentials r1, int r2, DefaultConstructorMarker r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = null;
        L5:
            this(r1);
        }
    }

    @Keep
    public static final class StsRamData extends JsonFieldContainer implements Serializable {

        @aa1
        private final String bucket;

        @aa1
        private final String endPoint;

        @tb1
        private final ResponseData response;

        public StsRamData() {
            String r1 = null;
            String r2 = null;
            ResponseData r3 = null;
            this(r1, r2, r3, 7, null);
        }

        public static /* synthetic */ StsRamData copy$default(StsRamData r0, String r1, String r2, ResponseData r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = r0.bucket;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = r0.endPoint;
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = r0.response;
        L12:
            return r0.copy(r1, r2, r3);
        }

        @aa1
        public final String component1() {
            return this.bucket;
        }

        @aa1
        public final String component2() {
            return this.endPoint;
        }

        @tb1
        public final ResponseData component3() {
            return this.response;
        }

        @aa1
        public final StsRamData copy(@aa1 String r2, @aa1 String r3, @tb1 ResponseData r4) {
            Intrinsics.X0O(r2, "bucket");
            Intrinsics.X0O(r3, "endPoint");
            return new StsRamData(r2, r3, r4);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof StsRamData) == true) goto L8;
            return false;
        L8:
            StsRamData r6 = (StsRamData) r5;
            if (Intrinsics.XOO0ii0(this.bucket, r6.bucket) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.XOO0ii0(this.endPoint, r6.endPoint) == true) goto L15;
            return false;
        L15:
            if (Intrinsics.XOO0ii0(this.response, r6.response) == true) goto L17;
            return false;
        L17:
            return true;
        }

        @aa1
        public final String getBucket() {
            return this.bucket;
        }

        @aa1
        public final String getEndPoint() {
            return this.endPoint;
        }

        @tb1
        public final ResponseData getResponse() {
            return this.response;
        }

        public int hashCode() {
            int r0 = ((this.bucket.hashCode() * 31) + this.endPoint.hashCode()) * 31;
            ResponseData r1 = this.response;
            if (r1 != null) goto L5;
            int r2 = 0;
        L7:
            return r0 + r2;
        L5:
            r2 = r1.hashCode();
            goto L7
        }

        @aa1
        public String toString() {
            return "StsRamData(bucket=" + this.bucket + ", endPoint=" + this.endPoint + ", response=" + this.response + I000IiI1O.iO.iO;
        }

        public StsRamData(@aa1 String r2, @aa1 String r3, @tb1 ResponseData r4) {
            Intrinsics.X0O(r2, "bucket");
            Intrinsics.X0O(r3, "endPoint");
            this.bucket = r2;
            this.endPoint = r3;
            this.response = r4;
        }

        public /* synthetic */ StsRamData(String r2, String r3, ResponseData r4, int r5, DefaultConstructorMarker r6) {
            if ((r5 & 1) == 0) goto L6;
            r2 = "";
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = "";
        L9:
            if ((r5 & 4) == 0) goto L11;
            r4 = null;
        L11:
            this(r2, r3, r4);
        }
    }

    public static final class XIi00iiXO implements OSSCompletedCallback<HeadObjectRequest, HeadObjectResult> {
        public final /* synthetic */ O1XIiIO<Long> OXO1;

        public XIi00iiXO(O1XIiIO<Long> r1) {
            this.OXO1 = r1;
        }

        public void OXO1(HeadObjectRequest r4, ClientException r5, ServiceException r6) {
            Intrinsics.X0O(r5, "clientExcepion");
            Intrinsics.X0O(r6, "serviceException");
            r5.printStackTrace();
            handleError(r5.toString());
            i1O0OXO1O r7 = i1O0OXO1O.OXO1;
            r7.OXO1(" " + UploadOSSWorker.XO0O10() + " clientExcepion? handleError  ServiceException = " + r5);
            r7.OXO1(" " + UploadOSSWorker.XO0O10() + " serviceException? handleError  ServiceException = " + r5);
            r7.XIi00iiXO(UploadOSSWorker.XO0O10() + " ErrorCode " + r6.getErrorCode());
            r7.XIi00iiXO(UploadOSSWorker.XO0O10() + " RequestId " + r6.getRequestId());
            r7.XIi00iiXO(UploadOSSWorker.XO0O10() + " HostId " + r6.getHostId());
            r7.XIi00iiXO(UploadOSSWorker.XO0O10() + " RawMessage " + r6.getRawMessage());
            handleError(r5.toString());
        }

        public void XIi00iiXO(HeadObjectRequest r3, HeadObjectResult r4) {
            Intrinsics.X0O(r4, "result");
            handleResponse(Long.valueOf(r4.getMetadata().getContentLength()));
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        public /* bridge */ /* synthetic */ void onFailure(OSSRequest r1, ClientException r2, ServiceException r3) {
            OXO1((HeadObjectRequest) r1, r2, r3);
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        public /* bridge */ /* synthetic */ void onSuccess(OSSRequest r1, OSSResult r2) {
            XIi00iiXO((HeadObjectRequest) r1, (HeadObjectResult) r2);
        }
    }

    static {
        OXO1 = new UploadOSSWorker();
        XIi00iiXO = new StringBuffer();
        iO = "UploadOSSWorker";
        XO0O10 = "OSSExpiryTime";
        IiI10X = "";
    }

    public UploadOSSWorker() {
    }

    public static final void IiI10X(AppendObjectRequest r0, long r1, long r3) {
    }

    public static /* synthetic */ void OXO1(AppendObjectRequest r0, long r1, long r3) {
        IiI10X(r0, r1, r3);
    }

    public static final /* synthetic */ void XIi00iiXO(UploadOSSWorker r0, AppendObjectRequest r1, OSSClient r2, long r3, File r5) {
        r0.O00(r1, r2, r3, r5);
    }

    public static final /* synthetic */ String XO0O10() {
        return iO;
    }

    public static final /* synthetic */ O1XIiIO iO() {
        return O00;
    }

    public final long I0IIOi(long r3) {
        return (r3 - SMADataUploadData.defaultTime) / ((long) 1000);
    }

    @aa1
    public final StringBuffer I0iXXO() {
        return XIi00iiXO;
    }

    public final void I1XOi1(@aa1 File r6) {
        Intrinsics.X0O(r6, "cacheFile");
        SPUtils r0 = a01.OXO1.IiI10X();
        String r1 = XO0O10;
        Object r2 = new Gson().fromJson(r0.getString(r1 + '_' + StsRamData.class.getName()), StsRamData.class);
        if (r2 != null) goto L5;
        r2 = StsRamData.class.newInstance();
    L5:
        StsRamData r3 = (StsRamData) r2;
        ResponseData r4 = r3.getResponse();
        if (r4 == null) goto L19;
        Credentials r5 = r4.getCredentials();
        if (r5 == null) goto L19;
        String r7 = r5.getExpiration();
        if (r7 == null) goto L19;
        if (r7.length() <= 0) goto L19;
        if (IO(r3.getResponse().getCredentials().getExpiration()) == false) goto L17;
        X1ii(r6);
        return;
    L17:
        OIi0(r3, r6);
        return;
    L19:
        X1ii(r6);
    }

    public final boolean IO(@aa1 String r10) {
        Intrinsics.X0O(r10, "iso8601String");
        SimpleDateFormat r0 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        r0.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date r11 = r0.parse(r10);
        Intrinsics.XXI(r11);
        long r1 = r11.getTime();
        i1O0OXO1O r12 = i1O0OXO1O.OXO1;
        String r2 = iO;
        long r3 = System.currentTimeMillis();
        if (r1 >= System.currentTimeMillis()) goto L5;
        boolean r5 = true;
    L6:
        r12.OXO1(r2 + " expiryTime = " + r1 + " ,  currentTimeMillis = " + r3 + " ,  B = " + r5);
        if (r1 >= System.currentTimeMillis()) goto L9;
        return true;
    L9:
        return false;
    L5:
        r5 = false;
        goto L6
    }

    public final void O00(AppendObjectRequest r1, OSSClient r2, long r3, File r5) {
        r1.setPosition(r3);
        r1.setProgressCallback(new q96());
        Intrinsics.O10IXXX0X(r2.asyncAppendObject(r1, new OXO1(r5)), "asyncAppendObject(...)");
    }

    @aa1
    public final String O10IXXX0X() {
        return XO0O10;
    }

    public final <T> void OIX0iXi(@aa1 List<? extends T> r36, @aa1 O1XIiIO<Object> r37) {
        Intrinsics.X0O(r36, "dataList");
        Intrinsics.X0O(r37, "callback");
        i1O0OXO1O r2 = i1O0OXO1O.OXO1;
        r2.OXO1(" generateFile dataList.isEmpty() =  " + r36.isEmpty());
        if (r36.isEmpty() == true) goto L96;
        String r4 = "";
        if (Intrinsics.XOO0ii0(IiI10X, String.valueOf(CollectionsKt___CollectionsKt.Xi1XO00(r36))) == false) goto L9;
        r2.XIi00iiXO("generateFile   handleError -->  \nlastClass = " + IiI10X + " , \ndataList.last() = " + CollectionsKt___CollectionsKt.Xi1XO00(r36));
        r37.handleError("");
        return;
    L9:
        IiI10X = String.valueOf(CollectionsKt___CollectionsKt.Xi1XO00(r36));
        O00 = r37;
        SPUtils r3 = a01.OXO1.IiI10X();
        Object r5 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r6 = new Gson().fromJson(r3.getString(AppUser.class.getName()), AppUser.class);
        if (r6 == null) goto L13;
        r5 = r6;
    L13:
        AppUser r7 = (AppUser) r5;
        StringBuffer r8 = XIi00iiXO;
        r8.delete(0, r8.length());
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r36)) == false) goto L20;
        r4 = r7.getIdentity() + "1";
        Iterator<T> r0 = r36.iterator();
    L17:
        if (r0.hasNext() == false) goto L75;
        T r9 = r0.next();
        Intrinsics.X1ii(r9, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r10 = (Activity) r9;
        r10.setMIsSync(1);
        StringBuffer r11 = XIi00iiXO;
        r11.append("1");
        r11.append('\t');
        r11.append(OXO1.I0IIOi(r10.getMTime()));
        r11.append('\t');
        r11.append(r10.getMMode());
        r11.append('\t');
        r11.append(r10.getMState());
        r11.append('\t');
        r11.append(r10.getMStep());
        r11.append('\t');
        r11.append(r10.getMCalorie() / 10000);
        r11.append('\t');
        r11.append(r10.getMDistance() / 10000);
        r11.append('\t');
        r11.append(r10.getMIsDelete());
        r11.append('\t');
        r11.append('\n');
        Unit r12 = Unit.OXO1;
    L75:
        if (r4.length() <= 0) goto L83;
        File r1 = new File(uz0.I0iXXO(sz0.OXO1), r4);
        StringBuffer r13 = XIi00iiXO;
        FileIOUtils.writeFileFromString(r1, r13.toString());
        i1O0OXO1O.OXO1.OXO1(iO + " :  cacheFile = " + r1.getPath() + "  content  :\n" + r13);
        I1XOi1(r1);     // Catch: Exception -> L79
        return;
    L79:
        e = move-exception;
        r37.handleError(e.toString());
        return;
    L83:
        return;
    L20:
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r36)) == false) goto L26;
        r4 = r7.getIdentity() + "3";
        Iterator<T> r14 = r36.iterator();
    L23:
        if (r14.hasNext() == false) goto L75;
        T r15 = r14.next();
        Intrinsics.X1ii(r15, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
        HeartRate r16 = (HeartRate) r15;
        r16.setMIsSync(1);
        StringBuffer r17 = XIi00iiXO;
        r17.append("3");
        r17.append('\t');
        r17.append(OXO1.I0IIOi(r16.getMTime()));
        r17.append('\t');
        r17.append(r16.getMBpm());
        r17.append('\t');
        r17.append('\n');
        Unit r18 = Unit.OXO1;
        goto L23
    L26:
        if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r36)) == false) goto L32;
        r4 = r7.getIdentity() + "10";
        Iterator<T> r19 = r36.iterator();
    L29:
        if (r19.hasNext() == false) goto L75;
        T r20 = r19.next();
        Intrinsics.X1ii(r20, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
        Hrv r21 = (Hrv) r20;
        r21.setMIsSync(1);
        StringBuffer r22 = XIi00iiXO;
        r22.append("10");
        r22.append('\t');
        r22.append(OXO1.I0IIOi(r21.getMTime()));
        r22.append('\t');
        r22.append(r21.getMValue());
        r22.append('\t');
        r22.append(r21.getMAvgValue());
        r22.append('\t');
        r22.append('\n');
        Unit r23 = Unit.OXO1;
        goto L29
    L32:
        if (BloodPressure.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r36)) == false) goto L38;
        r4 = r7.getIdentity() + "2";
        Iterator<T> r24 = r36.iterator();
    L35:
        if (r24.hasNext() == false) goto L75;
        T r25 = r24.next();
        Intrinsics.X1ii(r25, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
        BloodPressure r26 = (BloodPressure) r25;
        r26.setMIsSync(1);
        StringBuffer r27 = XIi00iiXO;
        r27.append("2");
        r27.append('\t');
        r27.append(OXO1.I0IIOi(r26.getMTime()));
        r27.append('\t');
        r27.append(r26.getMSystolic());
        r27.append('\t');
        r27.append(r26.getMDiastolic());
        r27.append('\t');
        r27.append('\n');
        Unit r28 = Unit.OXO1;
        goto L35
    L38:
        if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r36)) == false) goto L44;
        r4 = r7.getIdentity() + "9";
        Iterator<T> r29 = r36.iterator();
    L41:
        if (r29.hasNext() == false) goto L75;
        T r30 = r29.next();
        Intrinsics.X1ii(r30, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
        BloodOxygen r31 = (BloodOxygen) r30;
        r31.setMIsSync(1);
        StringBuffer r32 = XIi00iiXO;
        r32.append("9");
        r32.append('\t');
        r32.append(OXO1.I0IIOi(r31.getMTime()));
        r32.append('\t');
        r32.append(r31.getMValue());
        r32.append('\t');
        r32.append('\n');
        Unit r33 = Unit.OXO1;
        goto L41
    L44:
        if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r36)) == false) goto L50;
        r4 = r7.getIdentity() + "4";
        Iterator<T> r34 = r36.iterator();
    L47:
        if (r34.hasNext() == false) goto L75;
        T r35 = r34.next();
        Intrinsics.X1ii(r35, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
        Location r38 = (Location) r35;
        r38.setMIsSync(1);
        StringBuffer r39 = XIi00iiXO;
        r39.append("4");
        r39.append('\t');
        r39.append(OXO1.I0IIOi(r38.getMTime()));
        r39.append('\t');
        r39.append(r38.getMAltitude());
        r39.append('\t');
        r39.append(r38.getMLongitude());
        r39.append('\t');
        r39.append(r38.getMLatitude());
        r39.append('\t');
        r39.append(r38.getMSource());
        r39.append('\t');
        r39.append('\n');
        Unit r40 = Unit.OXO1;
        goto L47
    L50:
        if (Sleep.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r36)) == false) goto L56;
        r4 = r7.getIdentity() + "5";
        Iterator<T> r41 = r36.iterator();
    L53:
        if (r41.hasNext() == false) goto L75;
        T r42 = r41.next();
        Intrinsics.X1ii(r42, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        Sleep r43 = (Sleep) r42;
        r43.setMIsSync(1);
        StringBuffer r44 = XIi00iiXO;
        r44.append("5");
        r44.append('\t');
        r44.append(OXO1.I0IIOi(r43.getMTime()));
        r44.append('\t');
        r44.append(r43.getMMode());
        r44.append('\t');
        r44.append(r43.getMSoft());
        r44.append('\t');
        r44.append(r43.getMStrong());
        r44.append('\t');
        r44.append('\n');
        Unit r45 = Unit.OXO1;
        goto L53
    L56:
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r36)) == false) goto L62;
        r4 = r7.getIdentity() + "6";
        Iterator<T> r46 = r36.iterator();
    L59:
        if (r46.hasNext() == false) goto L75;
        T r47 = r46.next();
        Intrinsics.X1ii(r47, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r48 = (Weight) r47;
        r48.setMIsSync(1);
        StringBuffer r49 = XIi00iiXO;
        r49.append("6");
        r49.append('\t');
        r49.append(OXO1.I0IIOi(r48.getMTime()));
        r49.append('\t');
        r49.append(r48.getMWeight());
        r49.append('\t');
        r49.append('\n');
        Unit r50 = Unit.OXO1;
        goto L59
    L62:
        if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r36)) == false) goto L68;
        r4 = r7.getIdentity() + "7";
        Iterator<T> r51 = r36.iterator();
    L65:
        if (r51.hasNext() == false) goto L75;
        T r52 = r51.next();
        Intrinsics.X1ii(r52, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        Workout r53 = (Workout) r52;
        r53.setMIsSync(1);
        StringBuffer r54 = XIi00iiXO;
        r54.append("7");
        r54.append('\t');
        UploadOSSWorker r55 = OXO1;
        r54.append(r55.I0IIOi(r53.getMStart()));
        r54.append('\t');
        r54.append(r55.I0IIOi(r53.getMEnd()));
        r54.append('\t');
        r54.append(r53.getMDuration());
        r54.append('\t');
        r54.append(r53.getMAltitude());
        r54.append('\t');
        r54.append(r53.getMAirPressure());
        r54.append('\t');
        r54.append(r53.getMSpm());
        r54.append('\t');
        r54.append(r53.getMMode());
        r54.append('\t');
        r54.append(r53.getMStep());
        r54.append('\t');
        r54.append(r53.getMDistance());
        r54.append('\t');
        r54.append(r53.getMCalorie());
        r54.append('\t');
        r54.append(r53.getMSpeed());
        r54.append('\t');
        r54.append(r53.getMPace());
        r54.append('\t');
        r54.append(r53.getMIsDelete());
        r54.append('\t');
        r54.append(r53.getMAvgBpm());
        r54.append('\t');
        r54.append(r53.getMMaxBpm());
        r54.append('\t');
        r54.append(r53.getMMinBpm());
        r54.append('\t');
        r54.append(r53.getMMaxSpm());
        r54.append('\t');
        r54.append(r53.getMMinSpm());
        r54.append('\t');
        r54.append(r53.getMMaxPace());
        r54.append('\t');
        r54.append(r53.getMMinPace());
        r54.append('\t');
        r54.append(r53.getMMaxAltitude());
        r54.append('\t');
        r54.append(r53.getMMinAltitude());
        r54.append('\t');
        r54.append(r53.getMMinStress());
        r54.append('\t');
        r54.append(r53.getMMaxStress());
        r54.append('\t');
        r54.append(r53.getMAvgStress());
        r54.append('\t');
        r54.append(r53.getMSource());
        r54.append('\t');
        r54.append(r53.getMFeel());
        r54.append('\t');
        r54.append(r53.getMPrototype());
        r54.append('\t');
        r54.append(r53.getMFirmwareFlag());
        r54.append('\t');
        r54.append(r53.getMBleName());
        r54.append('\t');
        r54.append('\n');
        Unit r56 = Unit.OXO1;
        goto L65
    L68:
        if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r36)) == false) goto L73;
        r4 = r7.getIdentity() + "8";
        Iterator<T> r57 = r36.iterator();
    L71:
        if (r57.hasNext() == false) goto L75;
        T r58 = r57.next();
        Intrinsics.X1ii(r58, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
        Temperature r59 = (Temperature) r58;
        r59.setMIsSync(1);
        StringBuffer r60 = XIi00iiXO;
        r60.append("8");
        r60.append('\t');
        r60.append(OXO1.I0IIOi(r59.getMTime()));
        r60.append('\t');
        r60.append(r59.getMTemperature());
        r60.append('\t');
        r60.append('\n');
        Unit r61 = Unit.OXO1;
        goto L71
    L73:
        AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r36));
        goto L75
    }

    public final void OIi0(@tb1 StsRamData r37, @aa1 File r38) {
        Intrinsics.X0O(r38, "cacheFile");
        String r1 = "";
        if (r37 == null) goto L10;
        ResponseData r2 = r37.getResponse();
        if (r2 == null) goto L10;
        Credentials r3 = r2.getCredentials();
        if (r3 == null) goto L10;
        String r4 = r3.getAccessKeySecret();
        if (r4 == null) goto L10;
    L11:
        if (r37 == null) goto L18;
        ResponseData r5 = r37.getResponse();
        if (r5 == null) goto L18;
        Credentials r6 = r5.getCredentials();
        if (r6 == null) goto L18;
        String r7 = r6.getAccessKeyId();
        if (r7 == null) goto L18;
    L19:
        if (r37 == null) goto L26;
        ResponseData r8 = r37.getResponse();
        if (r8 == null) goto L26;
        Credentials r9 = r8.getCredentials();
        if (r9 == null) goto L26;
        String r10 = r9.getSecurityToken();
        if (r10 == null) goto L26;
    L27:
        if (r37 == null) goto L30;
        String r11 = r37.getBucket();
        if (r11 == null) goto L30;
    L31:
        if (r37 == null) goto L37;
        String r12 = r37.getEndPoint();
        if (r12 == null) goto L37;
        r1 = r12;
    L37:
        if (r10.length() > 0) goto L39;
    L56:
        O1XIiIO<Object> r0 = O00;
        if (r0 == null) goto L61;
        r0.handleResponse("token = null");
        return;
    L61:
        return;
    L39:
        if (r4.length() <= 0) goto L56;
        if (r7.length() <= 0) goto L56;
        if (r11.length() <= 0) goto L56;
        OSSClient r13 = new OSSClient(Utils.getApp(), r1, new OSSStsTokenCredentialProvider(r7, r4, r10));
        SPUtils r14 = a01.OXO1.IiI10X();
        Object r15 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r16 = new Gson().fromJson(r14.getString(AppUser.class.getName()), AppUser.class);
        if (r16 == null) goto L48;
        r15 = r16;
    L48:
        AppUser r17 = (AppUser) r15;
        i1O0OXO1O.OXO1.OXO1(iO + " , onCreateOSSClient appUser.dbUrl = " + r17.getDbUrl());
        if (r17.getDbUrl().length() <= 0) goto L52;
        XOO0ii0((String) CollectionsKt___CollectionsKt.Xi1XO00(StringsKt__StringsKt.i1I(r17.getDbUrl(), new String[]{"/"}, false, 0, 6, null)), r13, r11, r38);
        return;
    L52:
        O1XIiIO<Object> r18 = O00;
        if (r18 == null) goto L60;
        r18.handleResponse("dbUrl = null");
        return;
    L60:
        return;
    L30:
        r11 = "";
    L26:
        r10 = "";
    L18:
        r7 = "";
    L10:
        r4 = "";
        goto L11
    }

    public final void X0O(@aa1 String r4, @aa1 OSSClient r5, @aa1 String r6, @aa1 O1XIiIO<Boolean> r7) {
        Intrinsics.X0O(r4, Y5.c.b);
        Intrinsics.X0O(r5, OSSConstants.RESOURCE_NAME_OSS);
        Intrinsics.X0O(r6, "bucket");
        Intrinsics.X0O(r7, "callback");
        i1O0OXO1O.OXO1.OXO1(iO + "  isFileExist = " + r4 + "  bucket = " + r6);
    L9:
        e = move-exception;
        e.printStackTrace();
        r7.handleError(e.toString());
        return;
    L7:
        e = move-exception;
        String r8 = e.toString();
        Intrinsics.O10IXXX0X(r8, "toString(...)");
        r7.handleError(r8);
        i1O0OXO1O r9 = i1O0OXO1O.OXO1;
        String r10 = iO;
        r9.XIi00iiXO(r10 + " ErrorCode " + e.getErrorCode());
        r9.XIi00iiXO(r10 + " RequestId " + e.getRequestId());
        r9.XIi00iiXO(r10 + " HostId " + e.getHostId());
        r9.XIi00iiXO(r10 + " RawMessage " + e.getRawMessage());
        return;
    L4:
        if (r5.doesObjectExist(r6, "db/" + r4) == false) goto L11;
        r7.handleResponse(Boolean.TRUE);     // Catch: ServiceException -> L7 ClientException -> L9
        return;
    L11:
        r7.handleResponse(Boolean.FALSE);     // Catch: ServiceException -> L7 ClientException -> L9
    }

    public final void X1ii(@aa1 final File r8) {
        Intrinsics.X0O(r8, "cacheFile");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap r1 = new HashMap();
        final O1XIiIO<StsRamData> r2 = new UploadOSSWorker$getNetWorkUtilsSts$1(r8);
        final android.app.Activity r9 = null;
        final uq r3 = r0.loadPopup(null, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), "/ali/getStsRam");
        r0.printParam(r4 + "/ali/getStsRam", r1);
        NetWork r5 = NetWork.OXO1;
        String r6 = r4 + "/ali/getStsRam";
        final O1XIiIO<Response<StsRamData>> r7 = new UploadOSSWorker$getNetWorkUtilsSts$$inlined$get$default$1(r9, r2, r3);
        AndroidNetworking.get(r6).addQueryParameter(r1).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{StsRamData.class}), new UploadOSSWorker$getNetWorkUtilsSts$$inlined$get$default$2(r7));
    }

    public final void XOO0ii0(@aa1 final String r8, @aa1 final OSSClient r9, @aa1 final String r10, @aa1 final File r11) {
        Intrinsics.X0O(r8, Y5.c.b);
        Intrinsics.X0O(r9, OSSConstants.RESOURCE_NAME_OSS);
        Intrinsics.X0O(r10, "bucket");
        Intrinsics.X0O(r11, "cacheFile");
        final AppendObjectRequest r5 = new AppendObjectRequest(r10, "db/" + r8, r11.getPath());
        X0O(r8, r9, r10, new UploadOSSWorker$appendUpload$1(r8, r9, r10, r5, r11));
    }

    public final void XXI(@aa1 String r4, @aa1 OSSClient r5, @aa1 String r6, @aa1 O1XIiIO<Long> r7) {
        Intrinsics.X0O(r4, Y5.c.b);
        Intrinsics.X0O(r5, OSSConstants.RESOURCE_NAME_OSS);
        Intrinsics.X0O(r6, "bucket");
        Intrinsics.X0O(r7, "callback");
        Intrinsics.O10IXXX0X(r5.asyncHeadObject(new HeadObjectRequest(r6, "db/" + r4), new XIi00iiXO(r7)), "asyncHeadObject(...)");
    }
}
