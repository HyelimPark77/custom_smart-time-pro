package com.sma.smartv3.biz;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetTempSignedPutUrl;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.xmly.businesssdk.trace.config.TraceConfiguration;
import java.io.File;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nUploadFileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadFileManager.kt\ncom/sma/smartv3/biz/UploadFileManager\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,106:1\n126#2,11:107\n146#2:126\n200#3,7:118\n218#3:125\n*S KotlinDebug\n*F\n+ 1 UploadFileManager.kt\ncom/sma/smartv3/biz/UploadFileManager\n*L\n40#1:107,11\n40#1:126\n40#1:118,7\n40#1:125\n*E\n"})
public final class UploadFileManager {

    @aa1
    public static final UploadFileManager OXO1 = null;

    @aa1
    public static final String XIi00iiXO = null;

    @aa1
    public static final String iO = null;

    static {
        OXO1 = new UploadFileManager();
        XIi00iiXO = "UploadFileManager";
        iO = "applog/Android";
    }

    public UploadFileManager() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XOO0ii0(UploadFileManager r0, String r1, File r2, O1XIiIO r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        r0.IiI10X(r1, r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void iO(UploadFileManager r0, String r1, String r2, O1XIiIO r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        r0.XIi00iiXO(r1, r2, r3);
    }

    public final void IiI10X(@aa1 String r4, @aa1 final File r5, @tb1 final O1XIiIO<String> r6) {
        Intrinsics.X0O(r4, "identity");
        Intrinsics.X0O(r5, "file");
        LogUtils.d(new Object[]{XIi00iiXO + " uploadLogFile -> " + r4 + ", " + r5});
        XIi00iiXO(r4, iO + "/" + r5.getName(), new UploadFileManager$uploadLogFile$1(r6, r5));
    }

    public final boolean O00() {
        if ((System.currentTimeMillis() - a01.OXO1.IiI10X().getLong(b01.I0)) <= TraceConfiguration.DEFAULT_SESSION_TIMEOUT) goto L6;
        return true;
    L6:
        return false;
    }

    @aa1
    public final String OXO1() {
        return XIi00iiXO;
    }

    public final void XIi00iiXO(@aa1 String r6, @aa1 String r7, @tb1 final O1XIiIO<String> r8) {
        Intrinsics.X0O(r6, "identity");
        Intrinsics.X0O(r7, GetTempSignedPutUrl.UPLOAD_OSSFILEPATH);
        LogUtils.d(new Object[]{XIi00iiXO + " getTempSignedPutUrl -> " + r6 + ", " + r7});
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r9 = RequestBodyKt.getTempSignedPutUrlBody(r6, r7);
        final O1XIiIO<String> r10 = new UploadFileManager$getTempSignedPutUrl$1(r8);
        final Activity r11 = null;
        final uq r1 = r0.loadPopup(null, null);
        String r2 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetTempSignedPutUrl.URL);
        r0.printParam(r2 + GetTempSignedPutUrl.URL, r9);
        NetWork r3 = NetWork.OXO1;
        String r4 = r2 + GetTempSignedPutUrl.URL;
        final O1XIiIO<Response<String>> r5 = new UploadFileManager$getTempSignedPutUrl$$inlined$get$default$1(r11, r10, r1);
        AndroidNetworking.get(r4).addQueryParameter(r9).setTag(r4).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new UploadFileManager$getTempSignedPutUrl$$inlined$get$default$2(r5));
    }

    @aa1
    public final String XO0O10() {
        return iO;
    }
}
