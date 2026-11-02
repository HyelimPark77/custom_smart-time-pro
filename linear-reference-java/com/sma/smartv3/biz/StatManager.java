package com.sma.smartv3.biz;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.Y5;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.UploadBaiduServiceCallLogData;
import com.sma.smartv3.model.UploadData;
import com.sma.smartv3.model.UploadDownloadInfo;
import com.sma.smartv3.model.UploadDownloadInfoData;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.szabh.smable3.component.BleCache;
import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nStatManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatManager.kt\ncom/sma/smartv3/biz/StatManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,95:1\n19#2:96\n15#2:97\n258#3,11:98\n279#3:126\n258#3,11:127\n279#3:155\n359#4,17:109\n359#4,17:138\n*S KotlinDebug\n*F\n+ 1 StatManager.kt\ncom/sma/smartv3/biz/StatManager\n*L\n30#1:96\n30#1:97\n48#1:98,11\n48#1:126\n78#1:127,11\n78#1:155\n48#1:109,17\n78#1:138,17\n*E\n"})
public final class StatManager {

    @aa1
    public static final StatManager OXO1 = null;

    @aa1
    public static final String XIi00iiXO = "StatManager";

    static {
        OXO1 = new StatManager();
    }

    public StatManager() {
    }

    public static /* synthetic */ void O00(StatManager r6, String r7, long r8, int r10, int r11, int r12, Object r13) {
        if ((r12 & 8) == 0) goto L5;
        r11 = -1;
    L5:
        r6.XO0O10(r7, r8, r10, r11);
    }

    public static /* synthetic */ void iO(StatManager r0, int r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = "";
    L5:
        r0.XIi00iiXO(r1, r2);
    }

    public final String OXO1(long r3) {
        StringCompanionObject r0 = StringCompanionObject.OXO1;
        String r4 = String.format("%dkb", Arrays.copyOf(new Object[]{Long.valueOf(r3 / ((long) 1024))}, 1));
        Intrinsics.O10IXXX0X(r4, "format(...)");
        return r4;
    }

    public final void XIi00iiXO(int r33, @aa1 String r34) {
        Intrinsics.X0O(r34, "curTypeRemark");
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        UploadData r4 = new UploadData();
        r4.setIdentity(((AppUser) r2).getIdentity());
        UploadBaiduServiceCallLogData r5 = new UploadBaiduServiceCallLogData();
        BleCache r6 = BleCache.INSTANCE;
        r5.setBleName(r6.getMBleName());
        r5.setFirmwareFlag(r6.getMFirmwareFlag());
        r5.setProjectId(58);
        r5.setPlatform(2);
        String r7 = AppUtils.getAppVersionName();
        Intrinsics.O10IXXX0X(r7, "getAppVersionName(...)");
        r5.setAppVersion(r7);
        r5.setCallType(r33);
        r5.setCallTime(System.currentTimeMillis());
        r5.setMacAddress(oe5.IXO0OOi(r6.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        r5.setRemark(r34);
        r4.setData(X0iO1XX.I0iXXO(r5));
        LogUtils.d(new Object[]{"StatManager uploadBaiduServiceCallLog -> " + new Gson().toJson(r4)});
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        final O1XIiIO<Object> r8 = new StatManager$uploadBaiduServiceCallLog$1();
        final Activity r9 = null;
        final uq r10 = r0.loadPopup(null, null);
        i1O0OXO1O r11 = i1O0OXO1O.OXO1;
        Api r12 = Api.INSTANCE;
        r11.OXO1("JSON Api.BASE_URL -> " + r12.getBASE_URL() + " , url = /baiduApi/uploadServiceCallLog");
        String r13 = r0.convertBaseUrl(r12.getBASE_URL(), "/baiduApi/uploadServiceCallLog");
        NetWork r14 = NetWork.OXO1;
        String r15 = r13 + "/baiduApi/uploadServiceCallLog";
        final O1XIiIO<Response<Object>> r16 = new StatManager$uploadBaiduServiceCallLog$$inlined$postJson$default$1(r9, r8, r10);
        AndroidNetworking.post(r15).addApplicationJsonBody(r4).setTag(r15).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{Object.class}), new StatManager$uploadBaiduServiceCallLog$$inlined$postJson$default$2(r16));
    }

    public final void XO0O10(@aa1 String r6, long r7, int r9, int r10) {
        Intrinsics.X0O(r6, Y5.c.c);
        UploadDownloadInfoData r0 = new UploadDownloadInfoData();
        r0.setFilePath(r6);
        r0.setFileSize(OXO1.OXO1(r7));
        r0.setFileCategory(String.valueOf(r9));
        BleCache r8 = BleCache.INSTANCE;
        r0.setBleName(r8.getMBleName());
        r0.setFirmwareFlag(r8.getMFirmwareFlag());
        r0.setProjectId(RequestBodyKt.PROJECT_ID);
        if (r10 == (-1)) goto L5;
        r0.setEleId(String.valueOf(r10));
    L5:
        LogUtils.d(new Object[]{"StatManager uploadDownloadInfo -> " + new Gson().toJson(r0)});
        NetWorkUtils r11 = NetWorkUtils.INSTANCE;
        final O1XIiIO<Object> r12 = new StatManager$uploadDownloadInfo$1();
        final Activity r13 = null;
        final uq r14 = r11.loadPopup(null, null);
        i1O0OXO1O r15 = i1O0OXO1O.OXO1;
        Api r1 = Api.INSTANCE;
        r15.OXO1("JSON Api.BASE_URL -> " + r1.getBASE_URL() + " , url = " + UploadDownloadInfo.URL);
        String r16 = r11.convertBaseUrl(r1.getBASE_URL(), UploadDownloadInfo.URL);
        NetWork r17 = NetWork.OXO1;
        String r18 = r16 + UploadDownloadInfo.URL;
        final O1XIiIO<Response<Object>> r19 = new StatManager$uploadDownloadInfo$$inlined$postJson$default$1(r13, r12, r14);
        AndroidNetworking.post(r18).addApplicationJsonBody(r0).setTag(r18).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{Object.class}), new StatManager$uploadDownloadInfo$$inlined$postJson$default$2(r19));
    }
}
