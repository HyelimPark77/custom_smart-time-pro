package com.sma.smartv3.work;

import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.common.auth.OSSStsTokenCredentialProvider;
import com.alibaba.sdk.android.oss.model.AppendObjectRequest;
import com.alibaba.sdk.android.oss.model.AppendObjectResult;
import com.alibaba.sdk.android.oss.model.HeadObjectRequest;
import com.alibaba.sdk.android.oss.model.HeadObjectResult;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.JsonFieldContainer;
import com.sma.smartv3.model.SMADataUploadData;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p608db.entity.AlipayBindInfo;
import com.sma.smartv3.p608db.entity.BloodOxygen;
import com.sma.smartv3.p608db.entity.BloodPressure;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.p608db.entity.Hrv;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p608db.entity.Sleep;
import com.sma.smartv3.p608db.entity.Temperature;
import com.sma.smartv3.p608db.entity.Weight;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.work.UploadOSSWorker;
import java.io.File;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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

    @tb1
    public static O1XIiIO<Object> O00;

    @aa1
    public static final UploadOSSWorker OXO1 = new UploadOSSWorker();

    @aa1
    public static final StringBuffer XIi00iiXO = new StringBuffer();

    /* JADX INFO: renamed from: iO */
    @aa1
    public static final String f55114iO = "UploadOSSWorker";

    @aa1
    public static final String XO0O10 = "OSSExpiryTime";

    @aa1
    public static String IiI10X = "";

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
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Credentials copy$default(Credentials credentials, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = credentials.securityToken;
            }
            if ((i & 2) != 0) {
                str2 = credentials.accessKeySecret;
            }
            if ((i & 4) != 0) {
                str3 = credentials.accessKeyId;
            }
            if ((i & 8) != 0) {
                str4 = credentials.expiration;
            }
            return credentials.copy(str, str2, str3, str4);
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
        public final Credentials copy(@aa1 String securityToken, @aa1 String accessKeySecret, @aa1 String accessKeyId, @aa1 String expiration) {
            Intrinsics.X0O(securityToken, "securityToken");
            Intrinsics.X0O(accessKeySecret, "accessKeySecret");
            Intrinsics.X0O(accessKeyId, "accessKeyId");
            Intrinsics.X0O(expiration, "expiration");
            return new Credentials(securityToken, accessKeySecret, accessKeyId, expiration);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Credentials)) {
                return false;
            }
            Credentials credentials = (Credentials) obj;
            return Intrinsics.XOO0ii0(this.securityToken, credentials.securityToken) && Intrinsics.XOO0ii0(this.accessKeySecret, credentials.accessKeySecret) && Intrinsics.XOO0ii0(this.accessKeyId, credentials.accessKeyId) && Intrinsics.XOO0ii0(this.expiration, credentials.expiration);
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
            return "Credentials(securityToken=" + this.securityToken + ", accessKeySecret=" + this.accessKeySecret + ", accessKeyId=" + this.accessKeyId + ", expiration=" + this.expiration + I000IiI1O.C2156iO.f1007iO;
        }

        public Credentials(@aa1 String securityToken, @aa1 String accessKeySecret, @aa1 String accessKeyId, @aa1 String expiration) {
            Intrinsics.X0O(securityToken, "securityToken");
            Intrinsics.X0O(accessKeySecret, "accessKeySecret");
            Intrinsics.X0O(accessKeyId, "accessKeyId");
            Intrinsics.X0O(expiration, "expiration");
            this.securityToken = securityToken;
            this.accessKeySecret = accessKeySecret;
            this.accessKeyId = accessKeyId;
            this.expiration = expiration;
        }

        public /* synthetic */ Credentials(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }
    }

    public static final class OXO1 implements OSSCompletedCallback<AppendObjectRequest, AppendObjectResult> {
        public final /* synthetic */ File OXO1;

        public OXO1(File file) {
            this.OXO1 = file;
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public void onFailure(AppendObjectRequest appendObjectRequest, ClientException clientExcepion, ServiceException serviceException) {
            Intrinsics.X0O(clientExcepion, "clientExcepion");
            Intrinsics.X0O(serviceException, "serviceException");
            i1O0OXO1O.OXO1.OXO1(UploadOSSWorker.f55114iO + " append failure request = " + appendObjectRequest);
            O1XIiIO o1XIiIO = UploadOSSWorker.O00;
            if (o1XIiIO != null) {
                o1XIiIO.handleResponse("append failure request = " + appendObjectRequest);
            }
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AppendObjectRequest appendObjectRequest, AppendObjectResult result) {
            Intrinsics.X0O(result, "result");
            i1O0OXO1O.OXO1.OXO1(UploadOSSWorker.f55114iO + " AppendSuccess , NextPosition " + result.getNextPosition());
            if (this.OXO1.exists()) {
                FileUtils.delete(this.OXO1);
                O1XIiIO o1XIiIO = UploadOSSWorker.O00;
                if (o1XIiIO != null) {
                    o1XIiIO.handleResponse("append success");
                }
            }
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

        public static /* synthetic */ ResponseData copy$default(ResponseData responseData, Credentials credentials, int i, Object obj) {
            if ((i & 1) != 0) {
                credentials = responseData.credentials;
            }
            return responseData.copy(credentials);
        }

        @tb1
        public final Credentials component1() {
            return this.credentials;
        }

        @aa1
        public final ResponseData copy(@tb1 Credentials credentials) {
            return new ResponseData(credentials);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResponseData) && Intrinsics.XOO0ii0(this.credentials, ((ResponseData) obj).credentials);
        }

        @tb1
        public final Credentials getCredentials() {
            return this.credentials;
        }

        public int hashCode() {
            Credentials credentials = this.credentials;
            if (credentials == null) {
                return 0;
            }
            return credentials.hashCode();
        }

        @aa1
        public String toString() {
            return "ResponseData(credentials=" + this.credentials + I000IiI1O.C2156iO.f1007iO;
        }

        public ResponseData(@tb1 Credentials credentials) {
            this.credentials = credentials;
        }

        public /* synthetic */ ResponseData(Credentials credentials, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : credentials);
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
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ StsRamData copy$default(StsRamData stsRamData, String str, String str2, ResponseData responseData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stsRamData.bucket;
            }
            if ((i & 2) != 0) {
                str2 = stsRamData.endPoint;
            }
            if ((i & 4) != 0) {
                responseData = stsRamData.response;
            }
            return stsRamData.copy(str, str2, responseData);
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
        public final StsRamData copy(@aa1 String bucket, @aa1 String endPoint, @tb1 ResponseData responseData) {
            Intrinsics.X0O(bucket, "bucket");
            Intrinsics.X0O(endPoint, "endPoint");
            return new StsRamData(bucket, endPoint, responseData);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StsRamData)) {
                return false;
            }
            StsRamData stsRamData = (StsRamData) obj;
            return Intrinsics.XOO0ii0(this.bucket, stsRamData.bucket) && Intrinsics.XOO0ii0(this.endPoint, stsRamData.endPoint) && Intrinsics.XOO0ii0(this.response, stsRamData.response);
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
            int iHashCode = ((this.bucket.hashCode() * 31) + this.endPoint.hashCode()) * 31;
            ResponseData responseData = this.response;
            return iHashCode + (responseData == null ? 0 : responseData.hashCode());
        }

        @aa1
        public String toString() {
            return "StsRamData(bucket=" + this.bucket + ", endPoint=" + this.endPoint + ", response=" + this.response + I000IiI1O.C2156iO.f1007iO;
        }

        public StsRamData(@aa1 String bucket, @aa1 String endPoint, @tb1 ResponseData responseData) {
            Intrinsics.X0O(bucket, "bucket");
            Intrinsics.X0O(endPoint, "endPoint");
            this.bucket = bucket;
            this.endPoint = endPoint;
            this.response = responseData;
        }

        public /* synthetic */ StsRamData(String str, String str2, ResponseData responseData, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : responseData);
        }
    }

    public static final class XIi00iiXO implements OSSCompletedCallback<HeadObjectRequest, HeadObjectResult> {
        public final /* synthetic */ O1XIiIO<Long> OXO1;

        public XIi00iiXO(O1XIiIO<Long> o1XIiIO) {
            this.OXO1 = o1XIiIO;
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public void onFailure(HeadObjectRequest headObjectRequest, ClientException clientExcepion, ServiceException serviceException) {
            Intrinsics.X0O(clientExcepion, "clientExcepion");
            Intrinsics.X0O(serviceException, "serviceException");
            clientExcepion.printStackTrace();
            this.OXO1.handleError(clientExcepion.toString());
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(" " + UploadOSSWorker.f55114iO + " clientExcepion? handleError  ServiceException = " + clientExcepion);
            i1o0oxo1o.OXO1(" " + UploadOSSWorker.f55114iO + " serviceException? handleError  ServiceException = " + clientExcepion);
            i1o0oxo1o.XIi00iiXO(UploadOSSWorker.f55114iO + " ErrorCode " + serviceException.getErrorCode());
            i1o0oxo1o.XIi00iiXO(UploadOSSWorker.f55114iO + " RequestId " + serviceException.getRequestId());
            i1o0oxo1o.XIi00iiXO(UploadOSSWorker.f55114iO + " HostId " + serviceException.getHostId());
            i1o0oxo1o.XIi00iiXO(UploadOSSWorker.f55114iO + " RawMessage " + serviceException.getRawMessage());
            this.OXO1.handleError(clientExcepion.toString());
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
        public void onSuccess(HeadObjectRequest headObjectRequest, HeadObjectResult result) {
            Intrinsics.X0O(result, "result");
            this.OXO1.handleResponse(Long.valueOf(result.getMetadata().getContentLength()));
        }
    }

    public static final void IiI10X(AppendObjectRequest appendObjectRequest, long j, long j2) {
    }

    public final long I0IIOi(long j) {
        return (j - SMADataUploadData.defaultTime) / ((long) 1000);
    }

    @aa1
    public final StringBuffer I0iXXO() {
        return XIi00iiXO;
    }

    public final void I1XOi1(@aa1 File cacheFile) throws IllegalAccessException, InstantiationException {
        Credentials credentials;
        String expiration;
        Intrinsics.X0O(cacheFile, "cacheFile");
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        String str = XO0O10;
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(str + '_' + StsRamData.class.getName()), (Class<Object>) StsRamData.class);
        if (objFromJson == null) {
            objFromJson = StsRamData.class.newInstance();
        }
        StsRamData stsRamData = (StsRamData) objFromJson;
        ResponseData response = stsRamData.getResponse();
        if (response == null || (credentials = response.getCredentials()) == null || (expiration = credentials.getExpiration()) == null || expiration.length() <= 0) {
            X1ii(cacheFile);
        } else if (m38959IO(stsRamData.getResponse().getCredentials().getExpiration())) {
            X1ii(cacheFile);
        } else {
            OIi0(stsRamData, cacheFile);
        }
    }

    /* JADX INFO: renamed from: IO */
    public final boolean m38959IO(@aa1 String iso8601String) throws ParseException {
        Intrinsics.X0O(iso8601String, "iso8601String");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = simpleDateFormat.parse(iso8601String);
        Intrinsics.XXI(date);
        long time = date.getTime();
        i1O0OXO1O.OXO1.OXO1(f55114iO + " expiryTime = " + time + " ,  currentTimeMillis = " + System.currentTimeMillis() + " ,  B = " + (time < System.currentTimeMillis()));
        return time < System.currentTimeMillis();
    }

    public final void O00(AppendObjectRequest appendObjectRequest, OSSClient oSSClient, long j, File file) {
        appendObjectRequest.setPosition(j);
        appendObjectRequest.setProgressCallback(new OSSProgressCallback() { // from class: com.android.mltcode.paycertificationapi.q96
            @Override // com.alibaba.sdk.android.oss.callback.OSSProgressCallback
            public final void onProgress(Object obj, long j2, long j3) {
                UploadOSSWorker.IiI10X((AppendObjectRequest) obj, j2, j3);
            }
        });
        Intrinsics.O10IXXX0X(oSSClient.asyncAppendObject(appendObjectRequest, new OXO1(file)), "asyncAppendObject(...)");
    }

    @aa1
    public final String O10IXXX0X() {
        return XO0O10;
    }

    public final <T> void OIX0iXi(@aa1 List<? extends T> dataList, @aa1 O1XIiIO<Object> callback) {
        Intrinsics.X0O(dataList, "dataList");
        Intrinsics.X0O(callback, "callback");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(" generateFile dataList.isEmpty() =  " + dataList.isEmpty());
        if (dataList.isEmpty()) {
            return;
        }
        String str = "";
        if (Intrinsics.XOO0ii0(IiI10X, String.valueOf(CollectionsKt___CollectionsKt.Xi1XO00(dataList)))) {
            i1o0oxo1o.XIi00iiXO("generateFile   handleError -->  \nlastClass = " + IiI10X + " , \ndataList.last() = " + CollectionsKt___CollectionsKt.Xi1XO00(dataList));
            callback.handleError("");
            return;
        }
        IiI10X = String.valueOf(CollectionsKt___CollectionsKt.Xi1XO00(dataList));
        O00 = callback;
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        StringBuffer stringBuffer = XIi00iiXO;
        stringBuffer.delete(0, stringBuffer.length());
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataList))) {
            str = appUser2.getIdentity() + "1";
            for (T t : dataList) {
                Intrinsics.X1ii(t, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                Activity activity = (Activity) t;
                activity.setMIsSync(1);
                StringBuffer stringBuffer2 = XIi00iiXO;
                stringBuffer2.append("1");
                stringBuffer2.append('\t');
                stringBuffer2.append(OXO1.I0IIOi(activity.getMTime()));
                stringBuffer2.append('\t');
                stringBuffer2.append(activity.getMMode());
                stringBuffer2.append('\t');
                stringBuffer2.append(activity.getMState());
                stringBuffer2.append('\t');
                stringBuffer2.append(activity.getMStep());
                stringBuffer2.append('\t');
                stringBuffer2.append(activity.getMCalorie() / 10000);
                stringBuffer2.append('\t');
                stringBuffer2.append(activity.getMDistance() / 10000);
                stringBuffer2.append('\t');
                stringBuffer2.append(activity.getMIsDelete());
                stringBuffer2.append('\t');
                stringBuffer2.append('\n');
                Unit unit = Unit.OXO1;
            }
        } else if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataList))) {
            str = appUser2.getIdentity() + "3";
            for (T t2 : dataList) {
                Intrinsics.X1ii(t2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
                HeartRate heartRate = (HeartRate) t2;
                heartRate.setMIsSync(1);
                StringBuffer stringBuffer3 = XIi00iiXO;
                stringBuffer3.append("3");
                stringBuffer3.append('\t');
                stringBuffer3.append(OXO1.I0IIOi(heartRate.getMTime()));
                stringBuffer3.append('\t');
                stringBuffer3.append(heartRate.getMBpm());
                stringBuffer3.append('\t');
                stringBuffer3.append('\n');
                Unit unit2 = Unit.OXO1;
            }
        } else if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataList))) {
            str = appUser2.getIdentity() + "10";
            for (T t3 : dataList) {
                Intrinsics.X1ii(t3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
                Hrv hrv = (Hrv) t3;
                hrv.setMIsSync(1);
                StringBuffer stringBuffer4 = XIi00iiXO;
                stringBuffer4.append("10");
                stringBuffer4.append('\t');
                stringBuffer4.append(OXO1.I0IIOi(hrv.getMTime()));
                stringBuffer4.append('\t');
                stringBuffer4.append(hrv.getMValue());
                stringBuffer4.append('\t');
                stringBuffer4.append(hrv.getMAvgValue());
                stringBuffer4.append('\t');
                stringBuffer4.append('\n');
                Unit unit3 = Unit.OXO1;
            }
        } else if (BloodPressure.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataList))) {
            str = appUser2.getIdentity() + "2";
            for (T t4 : dataList) {
                Intrinsics.X1ii(t4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
                BloodPressure bloodPressure = (BloodPressure) t4;
                bloodPressure.setMIsSync(1);
                StringBuffer stringBuffer5 = XIi00iiXO;
                stringBuffer5.append("2");
                stringBuffer5.append('\t');
                stringBuffer5.append(OXO1.I0IIOi(bloodPressure.getMTime()));
                stringBuffer5.append('\t');
                stringBuffer5.append(bloodPressure.getMSystolic());
                stringBuffer5.append('\t');
                stringBuffer5.append(bloodPressure.getMDiastolic());
                stringBuffer5.append('\t');
                stringBuffer5.append('\n');
                Unit unit4 = Unit.OXO1;
            }
        } else if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataList))) {
            str = appUser2.getIdentity() + "9";
            for (T t5 : dataList) {
                Intrinsics.X1ii(t5, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
                BloodOxygen bloodOxygen = (BloodOxygen) t5;
                bloodOxygen.setMIsSync(1);
                StringBuffer stringBuffer6 = XIi00iiXO;
                stringBuffer6.append("9");
                stringBuffer6.append('\t');
                stringBuffer6.append(OXO1.I0IIOi(bloodOxygen.getMTime()));
                stringBuffer6.append('\t');
                stringBuffer6.append(bloodOxygen.getMValue());
                stringBuffer6.append('\t');
                stringBuffer6.append('\n');
                Unit unit5 = Unit.OXO1;
            }
        } else if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataList))) {
            str = appUser2.getIdentity() + "4";
            for (T t6 : dataList) {
                Intrinsics.X1ii(t6, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
                Location location = (Location) t6;
                location.setMIsSync(1);
                StringBuffer stringBuffer7 = XIi00iiXO;
                stringBuffer7.append("4");
                stringBuffer7.append('\t');
                stringBuffer7.append(OXO1.I0IIOi(location.getMTime()));
                stringBuffer7.append('\t');
                stringBuffer7.append(location.getMAltitude());
                stringBuffer7.append('\t');
                stringBuffer7.append(location.getMLongitude());
                stringBuffer7.append('\t');
                stringBuffer7.append(location.getMLatitude());
                stringBuffer7.append('\t');
                stringBuffer7.append(location.getMSource());
                stringBuffer7.append('\t');
                stringBuffer7.append('\n');
                Unit unit6 = Unit.OXO1;
            }
        } else if (Sleep.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataList))) {
            str = appUser2.getIdentity() + "5";
            for (T t7 : dataList) {
                Intrinsics.X1ii(t7, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                Sleep sleep = (Sleep) t7;
                sleep.setMIsSync(1);
                StringBuffer stringBuffer8 = XIi00iiXO;
                stringBuffer8.append("5");
                stringBuffer8.append('\t');
                stringBuffer8.append(OXO1.I0IIOi(sleep.getMTime()));
                stringBuffer8.append('\t');
                stringBuffer8.append(sleep.getMMode());
                stringBuffer8.append('\t');
                stringBuffer8.append(sleep.getMSoft());
                stringBuffer8.append('\t');
                stringBuffer8.append(sleep.getMStrong());
                stringBuffer8.append('\t');
                stringBuffer8.append('\n');
                Unit unit7 = Unit.OXO1;
            }
        } else if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataList))) {
            str = appUser2.getIdentity() + "6";
            for (T t8 : dataList) {
                Intrinsics.X1ii(t8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                Weight weight = (Weight) t8;
                weight.setMIsSync(1);
                StringBuffer stringBuffer9 = XIi00iiXO;
                stringBuffer9.append("6");
                stringBuffer9.append('\t');
                stringBuffer9.append(OXO1.I0IIOi(weight.getMTime()));
                stringBuffer9.append('\t');
                stringBuffer9.append(weight.getMWeight());
                stringBuffer9.append('\t');
                stringBuffer9.append('\n');
                Unit unit8 = Unit.OXO1;
            }
        } else if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataList))) {
            str = appUser2.getIdentity() + "7";
            for (T t9 : dataList) {
                Intrinsics.X1ii(t9, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
                Workout workout = (Workout) t9;
                workout.setMIsSync(1);
                StringBuffer stringBuffer10 = XIi00iiXO;
                stringBuffer10.append("7");
                stringBuffer10.append('\t');
                UploadOSSWorker uploadOSSWorker = OXO1;
                stringBuffer10.append(uploadOSSWorker.I0IIOi(workout.getMStart()));
                stringBuffer10.append('\t');
                stringBuffer10.append(uploadOSSWorker.I0IIOi(workout.getMEnd()));
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMDuration());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMAltitude());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMAirPressure());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMSpm());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMMode());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMStep());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMDistance());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMCalorie());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMSpeed());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMPace());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMIsDelete());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMAvgBpm());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMMaxBpm());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMMinBpm());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMMaxSpm());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMMinSpm());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMMaxPace());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMMinPace());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMMaxAltitude());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMMinAltitude());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMMinStress());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMMaxStress());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMAvgStress());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMSource());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMFeel());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMPrototype());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMFirmwareFlag());
                stringBuffer10.append('\t');
                stringBuffer10.append(workout.getMBleName());
                stringBuffer10.append('\t');
                stringBuffer10.append('\n');
                Unit unit9 = Unit.OXO1;
            }
        } else if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataList))) {
            str = appUser2.getIdentity() + "8";
            for (T t10 : dataList) {
                Intrinsics.X1ii(t10, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
                Temperature temperature = (Temperature) t10;
                temperature.setMIsSync(1);
                StringBuffer stringBuffer11 = XIi00iiXO;
                stringBuffer11.append("8");
                stringBuffer11.append('\t');
                stringBuffer11.append(OXO1.I0IIOi(temperature.getMTime()));
                stringBuffer11.append('\t');
                stringBuffer11.append(temperature.getMTemperature());
                stringBuffer11.append('\t');
                stringBuffer11.append('\n');
                Unit unit10 = Unit.OXO1;
            }
        } else {
            AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataList));
        }
        if (str.length() > 0) {
            File file = new File(uz0.I0iXXO(sz0.OXO1), str);
            StringBuffer stringBuffer12 = XIi00iiXO;
            FileIOUtils.writeFileFromString(file, stringBuffer12.toString());
            i1O0OXO1O.OXO1.OXO1(f55114iO + " :  cacheFile = " + file.getPath() + "  content  :\n" + ((Object) stringBuffer12));
            try {
                I1XOi1(file);
            } catch (Exception e) {
                callback.handleError(e.toString());
            }
        }
    }

    public final void OIi0(@tb1 StsRamData stsRamData, @aa1 File cacheFile) {
        String accessKeySecret;
        String accessKeyId;
        String securityToken;
        String bucket;
        String endPoint;
        ResponseData response;
        Credentials credentials;
        ResponseData response2;
        Credentials credentials2;
        ResponseData response3;
        Credentials credentials3;
        Intrinsics.X0O(cacheFile, "cacheFile");
        String str = "";
        if (stsRamData == null || (response3 = stsRamData.getResponse()) == null || (credentials3 = response3.getCredentials()) == null || (accessKeySecret = credentials3.getAccessKeySecret()) == null) {
            accessKeySecret = "";
        }
        if (stsRamData == null || (response2 = stsRamData.getResponse()) == null || (credentials2 = response2.getCredentials()) == null || (accessKeyId = credentials2.getAccessKeyId()) == null) {
            accessKeyId = "";
        }
        if (stsRamData == null || (response = stsRamData.getResponse()) == null || (credentials = response.getCredentials()) == null || (securityToken = credentials.getSecurityToken()) == null) {
            securityToken = "";
        }
        if (stsRamData == null || (bucket = stsRamData.getBucket()) == null) {
            bucket = "";
        }
        if (stsRamData != null && (endPoint = stsRamData.getEndPoint()) != null) {
            str = endPoint;
        }
        if (securityToken.length() <= 0 || accessKeySecret.length() <= 0 || accessKeyId.length() <= 0 || bucket.length() <= 0) {
            O1XIiIO<Object> o1XIiIO = O00;
            if (o1XIiIO != null) {
                o1XIiIO.handleResponse("token = null");
                return;
            }
            return;
        }
        OSSClient oSSClient = new OSSClient(Utils.getApp(), str, new OSSStsTokenCredentialProvider(accessKeyId, accessKeySecret, securityToken));
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        i1O0OXO1O.OXO1.OXO1(f55114iO + " , onCreateOSSClient appUser.dbUrl = " + appUser2.getDbUrl());
        if (appUser2.getDbUrl().length() > 0) {
            XOO0ii0((String) CollectionsKt___CollectionsKt.Xi1XO00(StringsKt__StringsKt.i1I(appUser2.getDbUrl(), new String[]{"/"}, false, 0, 6, null)), oSSClient, bucket, cacheFile);
            return;
        }
        O1XIiIO<Object> o1XIiIO2 = O00;
        if (o1XIiIO2 != null) {
            o1XIiIO2.handleResponse("dbUrl = null");
        }
    }

    public final void X0O(@aa1 String fileName, @aa1 OSSClient oss, @aa1 String bucket, @aa1 O1XIiIO<Boolean> callback) {
        Intrinsics.X0O(fileName, "fileName");
        Intrinsics.X0O(oss, "oss");
        Intrinsics.X0O(bucket, "bucket");
        Intrinsics.X0O(callback, "callback");
        i1O0OXO1O.OXO1.OXO1(f55114iO + "  isFileExist = " + fileName + "  bucket = " + bucket);
        try {
            if (oss.doesObjectExist(bucket, "db/" + fileName)) {
                callback.handleResponse(Boolean.TRUE);
            } else {
                callback.handleResponse(Boolean.FALSE);
            }
        } catch (ClientException e) {
            e.printStackTrace();
            callback.handleError(e.toString());
        } catch (ServiceException e2) {
            String string = e2.toString();
            Intrinsics.O10IXXX0X(string, "toString(...)");
            callback.handleError(string);
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            String str = f55114iO;
            i1o0oxo1o.XIi00iiXO(str + " ErrorCode " + e2.getErrorCode());
            i1o0oxo1o.XIi00iiXO(str + " RequestId " + e2.getRequestId());
            i1o0oxo1o.XIi00iiXO(str + " HostId " + e2.getHostId());
            i1o0oxo1o.XIi00iiXO(str + " RawMessage " + e2.getRawMessage());
        }
    }

    public final void X1ii(@aa1 final File cacheFile) {
        Intrinsics.X0O(cacheFile, "cacheFile");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap map = new HashMap();
        final O1XIiIO<StsRamData> o1XIiIO = new O1XIiIO<StsRamData>() { // from class: com.sma.smartv3.work.UploadOSSWorker$getNetWorkUtilsSts$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(UploadOSSWorker.StsRamData stsRamData) {
                i1O0OXO1O.OXO1.OXO1(UploadOSSWorker.f55114iO + " handleResponse : " + stsRamData);
                UploadOSSWorker uploadOSSWorker = UploadOSSWorker.OXO1;
                uploadOSSWorker.OIi0(stsRamData, cacheFile);
                a01.OXO1.IiI10X().put(uploadOSSWorker.O10IXXX0X() + '_' + UploadOSSWorker.StsRamData.class.getName(), new Gson().toJson(stsRamData), false);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.XIi00iiXO(UploadOSSWorker.f55114iO + " getStsError : " + error);
                O1XIiIO o1XIiIO2 = UploadOSSWorker.O00;
                if (o1XIiIO2 != null) {
                    o1XIiIO2.handleResponse(error);
                }
            }
        };
        final android.app.Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), "/ali/getStsRam");
        netWorkUtils.printParam(strConvertBaseUrl + "/ali/getStsRam", map);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + "/ali/getStsRam";
        final O1XIiIO<Response<StsRamData>> o1XIiIO2 = new O1XIiIO<Response<StsRamData>>() { // from class: com.sma.smartv3.work.UploadOSSWorker$getNetWorkUtilsSts$$inlined$get$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<UploadOSSWorker.StsRamData> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                android.app.Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.get(str).addQueryParameter((Map<String, String>) map).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, StsRamData.class), new ParsedRequestListener<Response<StsRamData>>() { // from class: com.sma.smartv3.work.UploadOSSWorker$getNetWorkUtilsSts$$inlined$get$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<UploadOSSWorker.StsRamData> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void XOO0ii0(@aa1 final String fileName, @aa1 final OSSClient oss, @aa1 final String bucket, @aa1 final File cacheFile) {
        Intrinsics.X0O(fileName, "fileName");
        Intrinsics.X0O(oss, "oss");
        Intrinsics.X0O(bucket, "bucket");
        Intrinsics.X0O(cacheFile, "cacheFile");
        final AppendObjectRequest appendObjectRequest = new AppendObjectRequest(bucket, "db/" + fileName, cacheFile.getPath());
        X0O(fileName, oss, bucket, new O1XIiIO<Boolean>() { // from class: com.sma.smartv3.work.UploadOSSWorker$appendUpload$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Boolean bool) {
                if (!Intrinsics.XOO0ii0(bool, Boolean.TRUE)) {
                    UploadOSSWorker.OXO1.O00(appendObjectRequest, oss, 0L, cacheFile);
                    return;
                }
                UploadOSSWorker uploadOSSWorker = UploadOSSWorker.OXO1;
                String str = fileName;
                final OSSClient oSSClient = oss;
                String str2 = bucket;
                final AppendObjectRequest appendObjectRequest2 = appendObjectRequest;
                final File file = cacheFile;
                uploadOSSWorker.XXI(str, oSSClient, str2, new O1XIiIO<Long>() { // from class: com.sma.smartv3.work.UploadOSSWorker$appendUpload$1$handleResponse$1
                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                    public void handleResponse(Long l) {
                        i1O0OXO1O.OXO1.OXO1(UploadOSSWorker.f55114iO + "  fileLength  result = " + l);
                        UploadOSSWorker uploadOSSWorker2 = UploadOSSWorker.OXO1;
                        AppendObjectRequest appendObjectRequest3 = appendObjectRequest2;
                        OSSClient oSSClient2 = oSSClient;
                        Intrinsics.XXI(l);
                        uploadOSSWorker2.O00(appendObjectRequest3, oSSClient2, l.longValue(), file);
                    }

                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleError(String error) {
                        Intrinsics.X0O(error, "error");
                        O1XIiIO o1XIiIO = UploadOSSWorker.O00;
                        if (o1XIiIO != null) {
                            o1XIiIO.handleResponse(error);
                        }
                        i1O0OXO1O.OXO1.OXO1(UploadOSSWorker.f55114iO + "  fileLength  error = " + error);
                    }
                });
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                O1XIiIO o1XIiIO = UploadOSSWorker.O00;
                if (o1XIiIO != null) {
                    o1XIiIO.handleResponse(error);
                }
                i1O0OXO1O.OXO1.OXO1(UploadOSSWorker.f55114iO + "  file is not exist, handleError  error = " + error);
            }
        });
    }

    public final void XXI(@aa1 String fileName, @aa1 OSSClient oss, @aa1 String bucket, @aa1 O1XIiIO<Long> callback) {
        Intrinsics.X0O(fileName, "fileName");
        Intrinsics.X0O(oss, "oss");
        Intrinsics.X0O(bucket, "bucket");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.O10IXXX0X(oss.asyncHeadObject(new HeadObjectRequest(bucket, "db/" + fileName), new XIi00iiXO(callback)), "asyncHeadObject(...)");
    }
}
