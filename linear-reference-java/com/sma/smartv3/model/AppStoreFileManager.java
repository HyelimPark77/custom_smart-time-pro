package com.sma.smartv3.model;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.google.gson.reflect.TypeToken;
import com.ironsource.Y5;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.AppStoreFileListSearch;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.OXO1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nFileTransmission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTransmission.kt\ncom/sma/smartv3/model/AppStoreFileManager\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,243:1\n235#2,11:244\n246#2:256\n256#2:266\n235#2,11:267\n246#2:279\n256#2:289\n1#3:255\n1#3:278\n278#4,8:257\n298#4:265\n278#4,8:280\n298#4:288\n*S KotlinDebug\n*F\n+ 1 FileTransmission.kt\ncom/sma/smartv3/model/AppStoreFileManager\n*L\n170#1:244,11\n170#1:256\n170#1:266\n189#1:267,11\n189#1:279\n189#1:289\n170#1:255\n189#1:278\n170#1:257,8\n170#1:265\n189#1:280,8\n189#1:288\n*E\n"})
public final class AppStoreFileManager {

    @aa1
    public static final AppStoreFileManager INSTANCE = null;

    static {
        INSTANCE = new AppStoreFileManager();
    }

    private AppStoreFileManager() {
    }

    public static /* synthetic */ void downloadAppFile$default(AppStoreFileManager r0, String r1, String r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = 0;
    L5:
        r0.downloadAppFile(r1, r2, r3, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAppStoreFileList$default(AppStoreFileManager r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "1";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = null;
    L8:
        r0.getAppStoreFileList(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAudioBookFileList$default(AppStoreFileManager r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "2";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = null;
    L8:
        r0.getAudioBookFileList(r1, r2);
    }

    public final void downloadAppFile(@aa1 String r4, @aa1 final String r5, final int r6, final int r7) {
        Intrinsics.X0O(r4, "path");
        Intrinsics.X0O(r5, Y5.c.b);
        i1O0OXO1O.OXO1.OXO1("appStore downloadAppFile path = " + r4 + "  , fileName = " + r5 + " , mBleAppFile -> " + r6 + "  , mOpType = " + r7);
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        String r1 = uz0.I0iXXO(sz0.OXO1).getAbsolutePath();
        Intrinsics.O10IXXX0X(r1, "getAbsolutePath(...)");
        r0.download(r4, r1, r5, new AnonymousClass1(r5, r7, r6));
    }

    public final void getAppStoreFileList(@aa1 String r10, @tb1 final Function1<? super List<AppStoreFileList>, Unit> r11) {
        Intrinsics.X0O(r10, AppStoreFileListSearch.APP_MODULE_ID);
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getAppStoreFileListBody(r10);
        final O1XIiIO<AppStoreFileList[]> r1 = new C34191(r11);
        Map<String, String> r13 = r0.getHeadersMap();
        final Activity r2 = null;
        final uq r3 = r0.loadPopup(null, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AppStoreFileListSearch.URL);
        String r6 = r4 + AppStoreFileListSearch.URL;
        Map<String, ? extends Object> r7 = OXO1.X111IO(r12);
        r7.putAll(r13);
        Unit r8 = Unit.OXO1;
        r0.printParam(r6, r7);
        NetWork r5 = NetWork.OXO1;
        String r9 = r4 + AppStoreFileListSearch.URL;
        final O1XIiIO<Response<AppStoreFileList[]>> r14 = new AppStoreFileManager$getAppStoreFileList$$inlined$postV2$default$1(r2, r1, r3);
        AndroidNetworking.post(r9).addHeaders(r13).addBodyParameter(r12).setTag(r9).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AppStoreFileList[].class}), new AppStoreFileManager$getAppStoreFileList$$inlined$postV2$default$2(r14));
    }

    public final void getAudioBookFileList(@aa1 String r10, @tb1 final Function1<? super List<AppFileDetail>, Unit> r11) {
        Intrinsics.X0O(r10, AppStoreFileListSearch.APP_MODULE_ID);
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getAppStoreFileListBody(r10);
        final O1XIiIO<AppFileDetail[]> r1 = new C34201(r11);
        Map<String, String> r13 = r0.getHeadersMap();
        final Activity r2 = null;
        final uq r3 = r0.loadPopup(null, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AppStoreFileListSearch.URL);
        String r6 = r4 + AppStoreFileListSearch.URL;
        Map<String, ? extends Object> r7 = OXO1.X111IO(r12);
        r7.putAll(r13);
        Unit r8 = Unit.OXO1;
        r0.printParam(r6, r7);
        NetWork r5 = NetWork.OXO1;
        String r9 = r4 + AppStoreFileListSearch.URL;
        final O1XIiIO<Response<AppFileDetail[]>> r14 = new AppStoreFileManager$getAudioBookFileList$$inlined$postV2$default$1(r2, r1, r3);
        AndroidNetworking.post(r9).addHeaders(r13).addBodyParameter(r12).setTag(r9).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AppFileDetail[].class}), new AppStoreFileManager$getAudioBookFileList$$inlined$postV2$default$2(r14));
    }
}
