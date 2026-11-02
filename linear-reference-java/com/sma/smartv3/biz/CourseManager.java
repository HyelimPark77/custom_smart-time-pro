package com.sma.smartv3.biz;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.reflect.TypeToken;
import com.ironsource.Y5;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.CourSelectByType;
import com.sma.smartv3.model.CourseDetails;
import com.sma.smartv3.model.CourseList;
import com.sma.smartv3.model.CourseType;
import com.sma.smartv3.model.RecommendSearch;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.CourseCollect;
import com.sma.smartv3.network.GetChoicenessSearchList;
import com.sma.smartv3.network.GetCourSelectByType;
import com.sma.smartv3.network.GetCourseCollectList;
import com.sma.smartv3.network.GetCourseDetailsList;
import com.sma.smartv3.network.GetCourseList;
import com.sma.smartv3.network.GetRecommendSearchList;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nCourseManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseManager.kt\ncom/sma/smartv3/biz/CourseManager\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,316:1\n235#2,11:317\n246#2:329\n256#2:339\n235#2,11:340\n246#2:352\n256#2:362\n235#2,11:363\n246#2:375\n256#2:385\n235#2,11:386\n246#2:398\n256#2:408\n153#2,11:409\n164#2:421\n174#2:431\n153#2,11:432\n164#2:444\n174#2:454\n235#2,11:455\n246#2:467\n256#2:477\n235#2,11:478\n246#2:490\n256#2:500\n1#3:328\n1#3:351\n1#3:374\n1#3:397\n1#3:420\n1#3:443\n1#3:466\n1#3:489\n278#4,8:330\n298#4:338\n278#4,8:353\n298#4:361\n278#4,8:376\n298#4:384\n278#4,8:399\n298#4:407\n226#4,8:422\n245#4:430\n226#4,8:445\n245#4:453\n278#4,8:468\n298#4:476\n278#4,8:491\n298#4:499\n*S KotlinDebug\n*F\n+ 1 CourseManager.kt\ncom/sma/smartv3/biz/CourseManager\n*L\n42#1:317,11\n42#1:329\n42#1:339\n74#1:340,11\n74#1:352\n74#1:362\n103#1:363,11\n103#1:375\n103#1:385\n142#1:386,11\n142#1:398\n142#1:408\n180#1:409,11\n180#1:421\n180#1:431\n210#1:432,11\n210#1:444\n210#1:454\n241#1:455,11\n241#1:467\n241#1:477\n262#1:478,11\n262#1:490\n262#1:500\n42#1:328\n74#1:351\n103#1:374\n142#1:397\n180#1:420\n210#1:443\n241#1:466\n262#1:489\n42#1:330,8\n42#1:338\n74#1:353,8\n74#1:361\n103#1:376,8\n103#1:384\n142#1:399,8\n142#1:407\n180#1:422,8\n180#1:430\n210#1:445,8\n210#1:453\n241#1:468,8\n241#1:476\n262#1:491,8\n262#1:499\n*E\n"})
public final class CourseManager {

    @aa1
    public static final CourseManager OXO1 = null;

    @aa1
    public static final String XIi00iiXO = "CourseManager";

    static {
        OXO1 = new CourseManager();
    }

    public CourseManager() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void I0IIOi(CourseManager r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "INDEX";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = null;
    L8:
        r0.XOO0ii0(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void I0iXXO(CourseManager r0, String r1, String r2, Function1 r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        r0.OIX0iXi(r1, r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IIX1OXO(CourseManager r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "INDEX";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = null;
    L8:
        r0.I1XOi1(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IO(CourseManager r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = GetCourSelectByType.COURSE_DIFF;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = null;
    L8:
        r0.OIi0(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IiI10X(CourseManager r0, String r1, String r2, Function1 r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        r0.O00(r1, r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X0O(CourseManager r1, String r2, String r3, String r4, String r5, Function1 r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = null;
    L17:
        r1.O10IXXX0X(r2, r3, r4, r5, r6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X1ii(CourseManager r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "course_type";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = null;
    L8:
        r0.XXI(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XIi00iiXO(CourseManager r0, String r1, String r2, boolean r3, Function1 r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = null;
    L5:
        r0.OXO1(r1, r2, r3, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XO0O10(CourseManager r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.iO(r1, r2);
    }

    public final void I1XOi1(@aa1 String r10, @tb1 final Function1<? super RecommendSearch[], Unit> r11) {
        Intrinsics.X0O(r10, "type");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getChoicenessSearchListBody(r10);
        final O1XIiIO<RecommendSearch[]> r1 = new CourseManager$getRecommendSearchListList$1(r11);
        Map<String, String> r13 = r0.getHeadersMap();
        final Activity r2 = null;
        final uq r3 = r0.loadPopup(null, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetRecommendSearchList.URL);
        String r6 = r4 + GetRecommendSearchList.URL;
        Map<String, ? extends Object> r7 = kotlin.collections.OXO1.X111IO(r12);
        r7.putAll(r13);
        Unit r8 = Unit.OXO1;
        r0.printParam(r6, r7);
        NetWork r5 = NetWork.OXO1;
        String r9 = r4 + GetRecommendSearchList.URL;
        final O1XIiIO<Response<RecommendSearch[]>> r14 = new CourseManager$getRecommendSearchListList$$inlined$postV2$default$1(r2, r1, r3);
        AndroidNetworking.post(r9).addHeaders(r13).addBodyParameter(r12).setTag(r9).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{RecommendSearch[].class}), new CourseManager$getRecommendSearchListList$$inlined$postV2$default$2(r14));
    }

    public final void O00(@aa1 String r5, @aa1 String r6, @tb1 final Function1<? super Integer, Unit> r7) {
        Intrinsics.X0O(r5, Y5.c.a);
        Intrinsics.X0O(r6, Y5.c.b);
        if (r5.length() != 0) goto L7;
        if (r7 == null) goto L9;
        r7.invoke(-1);
        return;
    L9:
        return;
    L7:
        final Ref.IntRef r0 = new Ref.IntRef();
        r0.element = -1;
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        String r2 = uz0.i0X000X0O(sz0.OXO1).getAbsolutePath();
        Intrinsics.O10IXXX0X(r2, "getAbsolutePath(...)");
        r1.download(r5, r2, r6, new CourseManager$downloadCourse$1(r0, r7));
    }

    public final void O10IXXX0X(@tb1 String r7, @tb1 String r8, @tb1 String r9, @tb1 String r10, @tb1 final Function1<? super Boolean, Unit> r11) {
        LogUtils.i(new Object[]{"getOnLineCourseList -> " + r7 + ", " + r8 + ", " + r9 + ", " + r10});
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getCourseBody(r7, r8, r9, r10);
        final O1XIiIO<CourseList[]> r13 = new CourseManager$getOnLineCourseList$1(r11);
        Map<String, String> r14 = r0.getHeadersMap();
        final Activity r15 = null;
        final uq r16 = r0.loadPopup(null, null);
        String r1 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetCourseList.URL);
        String r3 = r1 + GetCourseList.URL;
        Map<String, ? extends Object> r4 = kotlin.collections.OXO1.X111IO(r12);
        r4.putAll(r14);
        Unit r5 = Unit.OXO1;
        r0.printParam(r3, r4);
        NetWork r2 = NetWork.OXO1;
        String r6 = r1 + GetCourseList.URL;
        final O1XIiIO<Response<CourseList[]>> r17 = new CourseManager$getOnLineCourseList$$inlined$postV2$default$1(r15, r13, r16);
        AndroidNetworking.post(r6).addHeaders(r14).addBodyParameter(r12).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{CourseList[].class}), new CourseManager$getOnLineCourseList$$inlined$postV2$default$2(r17));
    }

    public final void OIX0iXi(@aa1 String r9, @aa1 String r10, @tb1 final Function1<? super CourseDetails, Unit> r11) {
        Intrinsics.X0O(r9, "id");
        Intrinsics.X0O(r10, "uid");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getCourseDetailsBody(r9, r10);
        final O1XIiIO<CourseDetails> r13 = new CourseManager$getCourseDetails$1(r11);
        Map<String, String> r14 = r0.getHeadersMap();
        final Activity r1 = null;
        final uq r2 = r0.loadPopup(null, null);
        String r3 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetCourseDetailsList.URL);
        String r5 = r3 + GetCourseDetailsList.URL;
        Map<String, ? extends Object> r6 = kotlin.collections.OXO1.X111IO(r12);
        r6.putAll(r14);
        Unit r7 = Unit.OXO1;
        r0.printParam(r5, r6);
        NetWork r4 = NetWork.OXO1;
        String r8 = r3 + GetCourseDetailsList.URL;
        final O1XIiIO<Response<CourseDetails>> r15 = new CourseManager$getCourseDetails$$inlined$postV2$default$1(r1, r13, r2);
        AndroidNetworking.post(r8).addHeaders(r14).addBodyParameter(r12).setTag(r8).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{CourseDetails.class}), new CourseManager$getCourseDetails$$inlined$postV2$default$2(r15));
    }

    public final void OIi0(@aa1 String r10, @tb1 final Function1<? super CourSelectByType[], Unit> r11) {
        Intrinsics.X0O(r10, "type");
        LogUtils.d(new Object[]{"getCourSelectByType -> " + r10});
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getCourSelectByTypeBody(r10);
        final O1XIiIO<CourSelectByType[]> r1 = new CourseManager$getCourSelectByType$1(r11);
        Map<String, String> r13 = r0.getHeadersMap();
        final Activity r2 = null;
        final uq r3 = r0.loadPopup(null, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetCourSelectByType.URL);
        String r6 = r4 + GetCourSelectByType.URL;
        Map<String, ? extends Object> r7 = kotlin.collections.OXO1.X111IO(r12);
        r7.putAll(r13);
        Unit r8 = Unit.OXO1;
        r0.printParam(r6, r7);
        NetWork r5 = NetWork.OXO1;
        String r9 = r4 + GetCourSelectByType.URL;
        final O1XIiIO<Response<CourSelectByType[]>> r14 = new CourseManager$getCourSelectByType$$inlined$getV2$default$1(r2, r1, r3);
        AndroidNetworking.get(r9).addQueryParameter(r12).setTag(r9).addHeaders(r13).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{CourSelectByType[].class}), new CourseManager$getCourSelectByType$$inlined$getV2$default$2(r14));
    }

    public final void OXO1(@aa1 String r8, @aa1 String r9, boolean r10, @tb1 final Function1<? super String, Unit> r11) {
        Intrinsics.X0O(r8, "cid");
        Intrinsics.X0O(r9, "uid");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        if (r10 == false) goto L5;
        String r12 = Api.Y;
    L6:
        HashMap<String, String> r13 = RequestBodyKt.getCourseCollectBody(r8, r9, r12);
        final O1XIiIO<CourseList> r14 = new CourseManager$courseCollect$1(r11);
        Map<String, String> r15 = r0.getHeadersMap();
        final Activity r16 = null;
        final uq r1 = r0.loadPopup(null, null);
        String r2 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), CourseCollect.URL);
        String r4 = r2 + CourseCollect.URL;
        Map<String, ? extends Object> r5 = kotlin.collections.OXO1.X111IO(r13);
        r5.putAll(r15);
        Unit r6 = Unit.OXO1;
        r0.printParam(r4, r5);
        NetWork r3 = NetWork.OXO1;
        String r7 = r2 + CourseCollect.URL;
        final O1XIiIO<Response<CourseList>> r17 = new CourseManager$courseCollect$$inlined$postV2$default$1(r16, r14, r1);
        AndroidNetworking.post(r7).addHeaders(r15).addBodyParameter(r13).setTag(r7).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{CourseList.class}), new CourseManager$courseCollect$$inlined$postV2$default$2(r17));
        return;
    L5:
        r12 = "N";
        goto L6
    }

    public final void XOO0ii0(@aa1 String r10, @tb1 final Function1<? super CourseList[], Unit> r11) {
        Intrinsics.X0O(r10, "type");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getChoicenessSearchListBody(r10);
        final O1XIiIO<CourseList[]> r1 = new CourseManager$getChoicenessSearchList$1(r11);
        Map<String, String> r13 = r0.getHeadersMap();
        final Activity r2 = null;
        final uq r3 = r0.loadPopup(null, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetChoicenessSearchList.URL);
        String r6 = r4 + GetChoicenessSearchList.URL;
        Map<String, ? extends Object> r7 = kotlin.collections.OXO1.X111IO(r12);
        r7.putAll(r13);
        Unit r8 = Unit.OXO1;
        r0.printParam(r6, r7);
        NetWork r5 = NetWork.OXO1;
        String r9 = r4 + GetChoicenessSearchList.URL;
        final O1XIiIO<Response<CourseList[]>> r14 = new CourseManager$getChoicenessSearchList$$inlined$postV2$default$1(r2, r1, r3);
        AndroidNetworking.post(r9).addHeaders(r13).addBodyParameter(r12).setTag(r9).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{CourseList[].class}), new CourseManager$getChoicenessSearchList$$inlined$postV2$default$2(r14));
    }

    public final void XXI(@aa1 String r10, @tb1 final Function1<? super CourseType[], Unit> r11) {
        Intrinsics.X0O(r10, "type");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        String r1 = "/system/dict/data/type/" + r10;
        HashMap<String, String> r12 = RequestBodyKt.getCourseTypeListBody(r10);
        final O1XIiIO<CourseType[]> r2 = new CourseManager$getCourseType$1(r11);
        Map<String, String> r13 = r0.getHeadersMap();
        final Activity r3 = null;
        final uq r4 = r0.loadPopup(null, null);
        String r5 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), r1);
        Map<String, ? extends Object> r7 = kotlin.collections.OXO1.X111IO(r12);
        r7.putAll(r13);
        Unit r8 = Unit.OXO1;
        r0.printParam(r5 + r1, r7);
        NetWork r6 = NetWork.OXO1;
        String r9 = r5 + r1;
        final O1XIiIO<Response<CourseType[]>> r14 = new CourseManager$getCourseType$$inlined$getV2$default$1(r3, r2, r4);
        AndroidNetworking.get(r9).addQueryParameter(r12).setTag(r9).addHeaders(r13).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{CourseType[].class}), new CourseManager$getCourseType$$inlined$getV2$default$2(r14));
    }

    public final void iO(@aa1 String r10, @tb1 final Function1<? super CourseList[], Unit> r11) {
        Intrinsics.X0O(r10, "uid");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getCourseCollectList(r10);
        final O1XIiIO<CourseList[]> r1 = new CourseManager$courseCollectList$1(r11);
        Map<String, String> r13 = r0.getHeadersMap();
        final Activity r2 = null;
        final uq r3 = r0.loadPopup(null, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetCourseCollectList.URL);
        String r6 = r4 + GetCourseCollectList.URL;
        Map<String, ? extends Object> r7 = kotlin.collections.OXO1.X111IO(r12);
        r7.putAll(r13);
        Unit r8 = Unit.OXO1;
        r0.printParam(r6, r7);
        NetWork r5 = NetWork.OXO1;
        String r9 = r4 + GetCourseCollectList.URL;
        final O1XIiIO<Response<CourseList[]>> r14 = new CourseManager$courseCollectList$$inlined$postV2$default$1(r2, r1, r3);
        AndroidNetworking.post(r9).addHeaders(r13).addBodyParameter(r12).setTag(r9).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{CourseList[].class}), new CourseManager$courseCollectList$$inlined$postV2$default$2(r14));
    }
}
