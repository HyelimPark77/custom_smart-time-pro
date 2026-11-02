package com.sma.smartv3.biz;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.OnlineWatchFaceV2;
import com.sma.smartv3.model.WatchFaceBanner;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.model.WatchFaceDetail;
import com.sma.smartv3.model.WatchFaceInstallRecord;
import com.sma.smartv3.network.AddUserWatchDownloadRecord;
import com.sma.smartv3.network.AddWatchFaceClick;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetOnLinWatchFaceListV2;
import com.sma.smartv3.network.GetPurchaseHistoryList;
import com.sma.smartv3.network.GetUserWatchDownloadRecord;
import com.sma.smartv3.network.GetWatchFaceBanner;
import com.sma.smartv3.network.GetWatchFaceDetail;
import com.sma.smartv3.network.GetWatchFaceDetailList;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nWatchFaceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceManager.kt\ncom/sma/smartv3/biz/WatchFaceManager\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,312:1\n198#2,8:313\n233#2:321\n198#2,8:322\n233#2:330\n235#2,11:331\n246#2:343\n256#2:353\n235#2,11:354\n246#2:366\n256#2:376\n235#2,11:377\n246#2:389\n256#2:399\n235#2,11:400\n246#2:412\n256#2:422\n235#2,11:423\n246#2:435\n256#2:445\n235#2,11:446\n246#2:458\n256#2:468\n235#2,11:469\n246#2:481\n256#2:491\n1#3:342\n1#3:365\n1#3:388\n1#3:411\n1#3:434\n1#3:457\n1#3:480\n278#4,8:344\n298#4:352\n278#4,8:367\n298#4:375\n278#4,8:390\n298#4:398\n278#4,8:413\n298#4:421\n278#4,8:436\n298#4:444\n278#4,8:459\n298#4:467\n278#4,8:482\n298#4:490\n*S KotlinDebug\n*F\n+ 1 WatchFaceManager.kt\ncom/sma/smartv3/biz/WatchFaceManager\n*L\n53#1:313,8\n53#1:321\n82#1:322,8\n82#1:330\n109#1:331,11\n109#1:343\n109#1:353\n132#1:354,11\n132#1:366\n132#1:376\n167#1:377,11\n167#1:389\n167#1:399\n198#1:400,11\n198#1:412\n198#1:422\n229#1:423,11\n229#1:435\n229#1:445\n262#1:446,11\n262#1:458\n262#1:468\n285#1:469,11\n285#1:481\n285#1:491\n109#1:342\n132#1:365\n167#1:388\n198#1:411\n229#1:434\n262#1:457\n285#1:480\n109#1:344,8\n109#1:352\n132#1:367,8\n132#1:375\n167#1:390,8\n167#1:398\n198#1:413,8\n198#1:421\n229#1:436,8\n229#1:444\n262#1:459,8\n262#1:467\n285#1:482,8\n285#1:490\n*E\n"})
public final class WatchFaceManager {

    @aa1
    public static final WatchFaceManager OXO1 = null;

    @aa1
    public static final String XIi00iiXO = "WatchFaceManager";

    static {
        OXO1 = new WatchFaceManager();
    }

    public WatchFaceManager() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void O00(WatchFaceManager r1, String r2, AppCompatActivity r3, View r4, Function1 r5, int r6, Object r7) {
        if ((r6 & 4) == 0) goto L6;
        r4 = null;
    L6:
        if ((r6 & 8) == 0) goto L8;
        r5 = null;
    L8:
        r1.XO0O10(r2, r3, r4, r5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OIX0iXi(WatchFaceManager r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.IO(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OIi0(WatchFaceManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.I0IIOi(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X0O(WatchFaceManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.O10IXXX0X(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X1ii(WatchFaceManager r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.XXI(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XOO0ii0(WatchFaceManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.IiI10X(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void iO(WatchFaceManager r0, boolean r1, AppCompatActivity r2, Function1 r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = true;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = null;
    L8:
        r0.XIi00iiXO(r1, r2, r3);
    }

    public final void I0IIOi(@tb1 final Function1<? super Boolean, Unit> r11) {
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r1 = RequestBodyKt.getWatchFaceBannerBody();
        final O1XIiIO<List<? extends WatchFaceBanner>> r2 = new WatchFaceManager$getWatchFaceBanner$1(r11);
        Map<String, String> r12 = r0.getHeadersMap();
        final Activity r3 = null;
        final uq r4 = r0.loadPopup(null, null);
        String r5 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetWatchFaceBanner.URL);
        String r7 = r5 + GetWatchFaceBanner.URL;
        Map<String, ? extends Object> r8 = kotlin.collections.OXO1.X111IO(r1);
        r8.putAll(r12);
        Unit r9 = Unit.OXO1;
        r0.printParam(r7, r8);
        NetWork r6 = NetWork.OXO1;
        String r10 = r5 + GetWatchFaceBanner.URL;
        final O1XIiIO<Response<List<? extends WatchFaceBanner>>> r13 = new WatchFaceManager$getWatchFaceBanner$$inlined$postV2$default$1(r3, r2, r4);
        AndroidNetworking.post(r10).addHeaders(r12).addBodyParameter(r1).setTag(r10).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{List.class}), new WatchFaceManager$getWatchFaceBanner$$inlined$postV2$default$2(r13));
    }

    public final void I0iXXO(@aa1 String r11) {
        Intrinsics.X0O(r11, "watchFaceId");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getWatchFaceDetailsClick(r11);
        final O1XIiIO<WatchFaceDetail> r1 = new WatchFaceManager$getWatchFaceDetailClick$1();
        Map<String, String> r2 = r0.getHeadersMap();
        final Activity r3 = null;
        final uq r4 = r0.loadPopup(null, null);
        String r5 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AddWatchFaceClick.URL);
        String r7 = r5 + AddWatchFaceClick.URL;
        Map<String, ? extends Object> r8 = kotlin.collections.OXO1.X111IO(r12);
        r8.putAll(r2);
        Unit r9 = Unit.OXO1;
        r0.printParam(r7, r8);
        NetWork r6 = NetWork.OXO1;
        String r10 = r5 + AddWatchFaceClick.URL;
        final O1XIiIO<Response<WatchFaceDetail>> r13 = new WatchFaceManager$getWatchFaceDetailClick$$inlined$postV2$default$1(r3, r1, r4);
        AndroidNetworking.post(r10).addHeaders(r2).addBodyParameter(r12).setTag(r10).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{WatchFaceDetail.class}), new WatchFaceManager$getWatchFaceDetailClick$$inlined$postV2$default$2(r13));
    }

    public final void IO(@aa1 String r10, @tb1 final Function1<? super WatchFaceDetail, Unit> r11) {
        Intrinsics.X0O(r10, "watchFaceId");
        String r0 = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getWatchFaceDetail -> " + r0);
        if (r0.length() != 0) goto L5;
        return;
    L5:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getWatchFaceDetails(r0, r10);
        final O1XIiIO<WatchFaceDetail> r2 = new WatchFaceManager$getWatchFaceDetail$1(r11);
        Map<String, String> r13 = r1.getHeadersMap();
        final Activity r3 = null;
        final uq r4 = r1.loadPopup(null, null);
        String r5 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetWatchFaceDetail.URL);
        String r6 = r5 + GetWatchFaceDetail.URL;
        Map<String, ? extends Object> r7 = kotlin.collections.OXO1.X111IO(r12);
        r7.putAll(r13);
        Unit r8 = Unit.OXO1;
        r1.printParam(r6, r7);
        NetWork r9 = NetWork.OXO1;
        String r14 = r5 + GetWatchFaceDetail.URL;
        final O1XIiIO<Response<WatchFaceDetail>> r15 = new WatchFaceManager$getWatchFaceDetail$$inlined$postV2$default$1(r3, r2, r4);
        AndroidNetworking.post(r14).addHeaders(r13).addBodyParameter(r12).setTag(r14).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{WatchFaceDetail.class}), new WatchFaceManager$getWatchFaceDetail$$inlined$postV2$default$2(r15));
    }

    public final void IiI10X(@tb1 final Function1<? super Boolean, Unit> r11) {
        String r0 = i72.OXO1.O001I();
        if (r0.length() != 0) goto L5;
        return;
    L5:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r2 = RequestBodyKt.getUserPointsMemberBody(r0);
        final O1XIiIO<WatchFaceCategoryV2[]> r3 = new WatchFaceManager$getUserWatchFaceInstallRecord$1(r11);
        Map<String, String> r12 = r1.getHeadersMap();
        final Activity r4 = null;
        final uq r5 = r1.loadPopup(null, null);
        String r6 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetUserWatchDownloadRecord.URL);
        String r7 = r6 + GetUserWatchDownloadRecord.URL;
        Map<String, ? extends Object> r8 = kotlin.collections.OXO1.X111IO(r2);
        r8.putAll(r12);
        Unit r9 = Unit.OXO1;
        r1.printParam(r7, r8);
        NetWork r10 = NetWork.OXO1;
        String r13 = r6 + GetUserWatchDownloadRecord.URL;
        final O1XIiIO<Response<WatchFaceCategoryV2[]>> r14 = new WatchFaceManager$getUserWatchFaceInstallRecord$$inlined$postV2$default$1(r4, r3, r5);
        AndroidNetworking.post(r13).addHeaders(r12).addBodyParameter(r2).setTag(r13).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{WatchFaceCategoryV2[].class}), new WatchFaceManager$getUserWatchFaceInstallRecord$$inlined$postV2$default$2(r14));
    }

    public final void O10IXXX0X(@tb1 final Function1<? super Boolean, Unit> r12) {
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        final Activity r2 = null;
        HashMap r3 = RequestBodyKt.getPurchaseHistoryWatchFace$default(null, 1, null);
        final O1XIiIO<WatchFaceCategoryV2[]> r4 = new WatchFaceManager$getWatchFacePayedSearchList$1(r12);
        Map<String, String> r13 = r0.getHeadersMap();
        final uq r5 = r0.loadPopup(null, null);
        String r6 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetPurchaseHistoryList.URL);
        String r8 = r6 + GetPurchaseHistoryList.URL;
        Map<String, ? extends Object> r9 = kotlin.collections.OXO1.X111IO(r3);
        r9.putAll(r13);
        Unit r10 = Unit.OXO1;
        r0.printParam(r8, r9);
        NetWork r1 = NetWork.OXO1;
        String r7 = r6 + GetPurchaseHistoryList.URL;
        final O1XIiIO<Response<WatchFaceCategoryV2[]>> r11 = new WatchFaceManager$getWatchFacePayedSearchList$$inlined$postV2$default$1(r2, r4, r5);
        AndroidNetworking.post(r7).addHeaders(r13).addBodyParameter(r3).setTag(r7).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{WatchFaceCategoryV2[].class}), new WatchFaceManager$getWatchFacePayedSearchList$$inlined$postV2$default$2(r11));
    }

    public final void OXO1(@aa1 String r11) {
        Intrinsics.X0O(r11, "watchFaceId");
        String r0 = i72.OXO1.O001I();
        if (r0.length() != 0) goto L5;
        return;
    L5:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getAddUserWatchDownloadRecordBody(r0, r11);
        final O1XIiIO<WatchFaceInstallRecord> r2 = new WatchFaceManager$addWatchDownloadRecord$1();
        Map<String, String> r3 = r1.getHeadersMap();
        final Activity r4 = null;
        final uq r5 = r1.loadPopup(null, null);
        String r6 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AddUserWatchDownloadRecord.URL);
        String r7 = r6 + AddUserWatchDownloadRecord.URL;
        Map<String, ? extends Object> r8 = kotlin.collections.OXO1.X111IO(r12);
        r8.putAll(r3);
        Unit r9 = Unit.OXO1;
        r1.printParam(r7, r8);
        NetWork r10 = NetWork.OXO1;
        String r13 = r6 + AddUserWatchDownloadRecord.URL;
        final O1XIiIO<Response<WatchFaceInstallRecord>> r14 = new WatchFaceManager$addWatchDownloadRecord$$inlined$postV2$default$1(r4, r2, r5);
        AndroidNetworking.post(r13).addHeaders(r3).addBodyParameter(r12).setTag(r13).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{WatchFaceInstallRecord.class}), new WatchFaceManager$addWatchDownloadRecord$$inlined$postV2$default$2(r14));
    }

    public final void XIi00iiXO(boolean r18, @aa1 AppCompatActivity r19, @tb1 final Function1<? super Boolean, Unit> r20) {
        Intrinsics.X0O(r19, "activity");
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap r7 = RequestBodyKt.getOnLinWatchFaceV2$default(null, r18, 1, null);
        O1XIiIO<OnlineWatchFaceV2[]> r10 = new WatchFaceManager$getOnLineWatchFaceList$1(r20);
        Map<String, String> r8 = r1.getHeadersMap();
        WeakReference r9 = new WeakReference(r19);
        uq r5 = r1.loadPopup(r19, null);
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(r19), null, null, new WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1(r5, GetOnLinWatchFaceListV2.URL, r7, r8, r9, r10, null), 3, null);
    }

    public final void XO0O10(@aa1 String r17, @aa1 AppCompatActivity r18, @tb1 View r19, @tb1 final Function1<? super WatchFaceCategoryV2[], Unit> r20) {
        Intrinsics.X0O(r17, "dialType");
        Intrinsics.X0O(r18, "activity");
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap r11 = RequestBodyKt.getOnLinWatchFaceMoveV2$default(null, r17, 0, 0, 13, null);
        O1XIiIO<OnlineWatchFaceV2[]> r14 = new WatchFaceManager$getOnLineWatchFaceMoveList$1(r20);
        Map<String, String> r12 = r1.getHeadersMap();
        WeakReference r13 = new WeakReference(r18);
        uq r9 = r1.loadPopup(r18, r19);
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(r18), null, null, new WatchFaceManager$getOnLineWatchFaceMoveList$$inlined$postV3$default$1(r9, GetOnLinWatchFaceListV2.URL, r11, r12, r13, r14, null), 3, null);
    }

    public final void XXI(@aa1 String r10, @tb1 final Function1<? super WatchFaceCategoryV2[], Unit> r11) {
        Intrinsics.X0O(r10, "watchFaceId");
        String r0 = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager createOrder -> " + r0);
        if (r0.length() != 0) goto L5;
        return;
    L5:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getWatchFaceDetailsList(r0, r10);
        final O1XIiIO<WatchFaceCategoryV2[]> r2 = new WatchFaceManager$getWatchFaceDetailList$1(r11);
        Map<String, String> r13 = r1.getHeadersMap();
        final Activity r3 = null;
        final uq r4 = r1.loadPopup(null, null);
        String r5 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetWatchFaceDetailList.URL);
        String r6 = r5 + GetWatchFaceDetailList.URL;
        Map<String, ? extends Object> r7 = kotlin.collections.OXO1.X111IO(r12);
        r7.putAll(r13);
        Unit r8 = Unit.OXO1;
        r1.printParam(r6, r7);
        NetWork r9 = NetWork.OXO1;
        String r14 = r5 + GetWatchFaceDetailList.URL;
        final O1XIiIO<Response<WatchFaceCategoryV2[]>> r15 = new WatchFaceManager$getWatchFaceDetailList$$inlined$postV2$default$1(r3, r2, r4);
        AndroidNetworking.post(r14).addHeaders(r13).addBodyParameter(r12).setTag(r14).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{WatchFaceCategoryV2[].class}), new WatchFaceManager$getWatchFaceDetailList$$inlined$postV2$default$2(r15));
    }
}
