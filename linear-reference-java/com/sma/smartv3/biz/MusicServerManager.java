package com.sma.smartv3.biz;

import android.app.Activity;
import android.content.Context;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.common.auth.OSSStsTokenCredentialProvider;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.e44;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.Y5;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.TeraBoxItemDLink;
import com.sma.smartv3.model.TeraBoxListItem;
import com.sma.smartv3.model.TeraBoxShareLink;
import com.sma.smartv3.model.TeraBoxToken;
import com.sma.smartv3.model.TeraBoxTokenInfo;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetInternalTeraBoxRefreshToken;
import com.sma.smartv3.network.GetInternalTeraBoxToken;
import com.sma.smartv3.network.GetShareUrl;
import com.sma.smartv3.network.GetTeraBoxRefreshToken;
import com.sma.smartv3.network.GetTeraBoxToken;
import com.sma.smartv3.network.GetTeraBoxTokenInfo;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.work.UploadOSSWorker;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nMusicServerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicServerManager.kt\ncom/sma/smartv3/biz/MusicServerManager\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,529:1\n235#2,11:530\n246#2:542\n256#2:552\n235#2,11:553\n246#2:565\n256#2:575\n235#2,11:576\n246#2:588\n256#2:598\n235#2,11:599\n246#2:611\n256#2:621\n126#2,11:625\n146#2:644\n1#3:541\n1#3:564\n1#3:587\n1#3:610\n278#4,8:543\n298#4:551\n278#4,8:566\n298#4:574\n278#4,8:589\n298#4:597\n278#4,8:612\n298#4:620\n200#4,7:636\n218#4:643\n93#5,2:622\n90#5:624\n*S KotlinDebug\n*F\n+ 1 MusicServerManager.kt\ncom/sma/smartv3/biz/MusicServerManager\n*L\n312#1:530,11\n312#1:542\n312#1:552\n342#1:553,11\n342#1:565\n342#1:575\n387#1:576,11\n387#1:588\n387#1:598\n439#1:599,11\n439#1:611\n439#1:621\n492#1:625,11\n492#1:644\n312#1:541\n342#1:564\n387#1:587\n439#1:610\n312#1:543,8\n312#1:551\n342#1:566,8\n342#1:574\n387#1:589,8\n387#1:597\n439#1:612,8\n439#1:620\n492#1:636,7\n492#1:643\n479#1:622,2\n479#1:624\n*E\n"})
public final class MusicServerManager {

    @tb1
    public static OSSClient IiI10X = null;

    @aa1
    public static String O00 = null;

    @aa1
    public static final MusicServerManager OXO1 = null;

    @aa1
    public static final String XIi00iiXO = "TeraBoxManager";
    public static final int XO0O10 = 200;
    public static final int iO = -1;

    static {
        OXO1 = new MusicServerManager();
        O00 = "";
    }

    public MusicServerManager() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IO(MusicServerManager r0, String r1, List r2, Function1 r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        r0.OIi0(r1, r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void O00(MusicServerManager r0, String r1, String r2, String r3, Function1 r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = null;
    L5:
        r0.XO0O10(r1, r2, r3, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X0O(MusicServerManager r6, String r7, String r8, int r9, int r10, Function1 r11, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L5;
        r8 = "/";
    L5:
        String r2 = r8;
        if ((r12 & 4) == 0) goto L8;
        r9 = 1;
    L8:
        int r3 = r9;
        if ((r12 & 8) == 0) goto L11;
        r10 = 100;
    L11:
        int r4 = r10;
        if ((r12 & 16) == 0) goto L14;
        r11 = null;
    L14:
        r6.O10IXXX0X(r7, r2, r3, r4, r11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X1ii(MusicServerManager r0, String r1, String r2, Function1 r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        r0.XXI(r1, r2, r3);
    }

    @tb1
    public final OSSClient I0IIOi() {
        return IiI10X;
    }

    public final void I0iXXO(final Function1<? super Pair<UploadOSSWorker.StsRamData, Integer>, Unit> r8) {
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap r1 = new HashMap();
        final O1XIiIO<UploadOSSWorker.StsRamData> r2 = new MusicServerManager$getNetWorkUtilsSts$1(r8);
        final Activity r9 = null;
        final uq r3 = r0.loadPopup(null, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), "/ali/getStsRam");
        r0.printParam(r4 + "/ali/getStsRam", r1);
        NetWork r5 = NetWork.OXO1;
        String r6 = r4 + "/ali/getStsRam";
        final O1XIiIO<Response<UploadOSSWorker.StsRamData>> r7 = new MusicServerManager$getNetWorkUtilsSts$$inlined$get$default$1(r9, r2, r3);
        AndroidNetworking.get(r6).addQueryParameter(r1).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{UploadOSSWorker.StsRamData.class}), new MusicServerManager$getNetWorkUtilsSts$$inlined$get$default$2(r7));
    }

    public final void I1XOi1(@aa1 String r10, @aa1 final Function1<? super Boolean, Unit> r11) {
        Intrinsics.X0O(r10, "token");
        Intrinsics.X0O(r11, "callback");
        if (i72.OXO1.I0i1OXiI() == false) goto L5;
        HashMap<String, String> r12 = RequestBodyKt.getTeraBoxRefreshTokenBody(r10);
        String r0 = GetTeraBoxRefreshToken.URL;
    L6:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        final O1XIiIO<TeraBoxToken> r2 = new MusicServerManager$getTeraBoxRefreshToken$1(r11);
        Map<String, String> r13 = r1.getHeadersMap();
        final Activity r3 = null;
        final uq r4 = r1.loadPopup(null, null);
        String r5 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), r0);
        Map<String, ? extends Object> r7 = kotlin.collections.OXO1.X111IO(r12);
        r7.putAll(r13);
        Unit r8 = Unit.OXO1;
        r1.printParam(r5 + r0, r7);
        NetWork r6 = NetWork.OXO1;
        String r9 = r5 + r0;
        final O1XIiIO<Response<TeraBoxToken>> r14 = new MusicServerManager$getTeraBoxRefreshToken$$inlined$postV2$default$1(r3, r2, r4);
        AndroidNetworking.post(r9).addHeaders(r13).addBodyParameter(r12).setTag(r9).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{TeraBoxToken.class}), new MusicServerManager$getTeraBoxRefreshToken$$inlined$postV2$default$2(r14));
        return;
    L5:
        r12 = RequestBodyKt.getInternalTeraBoxRefreshTokenBody(r10);
        r0 = GetInternalTeraBoxRefreshToken.URL;
        goto L6
    }

    public final void IIX1OXO(@aa1 String r10, @aa1 final Function1<? super String, Unit> r11) {
        Intrinsics.X0O(r10, "code");
        Intrinsics.X0O(r11, "callback");
        if (i72.OXO1.I0i1OXiI() == false) goto L5;
        HashMap<String, String> r12 = RequestBodyKt.getTeraBoxTokenBody(r10);
        String r0 = GetTeraBoxToken.URL;
    L6:
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        final O1XIiIO<TeraBoxToken> r2 = new MusicServerManager$getTeraBoxToken$1(r11);
        Map<String, String> r13 = r1.getHeadersMap();
        final Activity r3 = null;
        final uq r4 = r1.loadPopup(null, null);
        String r5 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), r0);
        Map<String, ? extends Object> r7 = kotlin.collections.OXO1.X111IO(r12);
        r7.putAll(r13);
        Unit r8 = Unit.OXO1;
        r1.printParam(r5 + r0, r7);
        NetWork r6 = NetWork.OXO1;
        String r9 = r5 + r0;
        final O1XIiIO<Response<TeraBoxToken>> r14 = new MusicServerManager$getTeraBoxToken$$inlined$postV2$default$1(r3, r2, r4);
        AndroidNetworking.post(r9).addHeaders(r13).addBodyParameter(r12).setTag(r9).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{TeraBoxToken.class}), new MusicServerManager$getTeraBoxToken$$inlined$postV2$default$2(r14));
        return;
    L5:
        r12 = RequestBodyKt.getInternalTeraBoxTokenBody(r10, UtilsKt.XXO(R.string.tera_box_domestic_url_scheme));
        r0 = GetInternalTeraBoxToken.URL;
        goto L6
    }

    @aa1
    public final String IiI10X(@aa1 Context r5) {
        Intrinsics.X0O(r5, "context");
        if (i72.OXO1.I0i1OXiI() == false) goto L9;
        if (Intrinsics.XOO0ii0(Api.INSTANCE.getBASE_URL(), e44.iO) == true) goto L9;
        return "https://www.terabox.com/wap/outside/login?clientId=" + r5.getString(R.string.tera_box_client) + "&isFromApp=1";
    L9:
        return "http://openapi.baidu.com/oauth/2.0/authorize?response_type=code&display=mobile&device_id=" + r5.getString(R.string.tera_box_domestic_client_id) + "&client_id=" + r5.getString(R.string.tera_box_domestic_client_key) + "&redirect_uri=" + UtilsKt.XXO(R.string.tera_box_domestic_url_scheme) + "&scope=basic,netdisk";
    }

    public final void O10IXXX0X(@aa1 String r4, @aa1 String r5, int r6, int r7, @tb1 final Function1<? super List<TeraBoxListItem>, Unit> r8) {
        Intrinsics.X0O(r4, "access_tokens");
        Intrinsics.X0O(r5, MapBundleKey.MapObjKey.OBJ_DIR);
        if (i72.OXO1.I0i1OXiI() == false) goto L5;
        String r9 = "https://www.terabox.com/openapi/api/list?access_tokens=" + r4 + "&page=" + r6 + "&dir=" + r5 + "&num=" + r7;
    L6:
        AndroidNetworking.get(r9).setPriority(Priority.LOW).build().getAsJSONObject(new MusicServerManager$getTeraBoxList$1(r8));
        return;
    L5:
        r9 = "https://pan.baidu.com/rest/2.0/xpan/file?method=list&access_token=" + r4 + "&dir=" + r5;
        goto L6
    }

    public final void OII(@tb1 OSSClient r1) {
        IiI10X = r1;
    }

    public final void OIX0iXi(@aa1 final Function1<? super String, Unit> r11) {
        Intrinsics.X0O(r11, "callback");
        boolean r0 = i72.OXO1.I0i1OXiI();
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap r2 = new HashMap();
        r2.put("internalFlag", String.valueOf(r0 ? 1 : 0));
        final O1XIiIO<TeraBoxShareLink> r3 = new MusicServerManager$getNetDiskShareUrl$2(r11);
        Map<String, String> r12 = r1.getHeadersMap();
        final Activity r4 = null;
        final uq r5 = r1.loadPopup(null, null);
        String r6 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetShareUrl.URL);
        String r7 = r6 + GetShareUrl.URL;
        Map<String, ? extends Object> r8 = kotlin.collections.OXO1.X111IO(r2);
        r8.putAll(r12);
        Unit r9 = Unit.OXO1;
        r1.printParam(r7, r8);
        NetWork r10 = NetWork.OXO1;
        String r13 = r6 + GetShareUrl.URL;
        final O1XIiIO<Response<TeraBoxShareLink>> r14 = new MusicServerManager$getNetDiskShareUrl$$inlined$postV2$default$1(r4, r3, r5);
        AndroidNetworking.post(r13).addHeaders(r12).addBodyParameter(r2).setTag(r13).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{TeraBoxShareLink.class}), new MusicServerManager$getNetDiskShareUrl$$inlined$postV2$default$2(r14));
    }

    public final void OIi0(@aa1 String r3, @aa1 List<Long> r4, @tb1 final Function1<? super List<TeraBoxItemDLink>, Unit> r5) {
        Intrinsics.X0O(r3, "access_tokens");
        Intrinsics.X0O(r4, "fidlist");
        if (i72.OXO1.I0i1OXiI() == false) goto L5;
        String r6 = "https://www.terabox.com/openapi/api/download?access_tokens=" + r3 + "&fidlist=" + r4 + "&type=dlink";
    L6:
        AndroidNetworking.get(r6).setPriority(Priority.LOW).build().getAsJSONObject(new MusicServerManager$getMusicDownLoaLink$1(r5));
        return;
    L5:
        r6 = "http://pan.baidu.com/rest/2.0/xpan/multimedia?method=filemetas&access_token=" + r3 + "&fsids=" + r4 + "&dlink=1";
        goto L6
    }

    public final void OXO1() {
        if (O00.length() <= 0) goto L6;
        AndroidNetworking.cancel(O00);
        return;
    }

    public final void OiIIX101O() {
        a01 r0 = a01.OXO1;
        r0.IiI10X().remove(b01.O1);
        r0.IiI10X().remove(b01.O1iXiI);
    }

    @tb1
    public final OSSClient XIi00iiXO(@tb1 UploadOSSWorker.StsRamData r6) {
        String r0 = "";
        if (r6 == null) goto L10;
        UploadOSSWorker.ResponseData r1 = r6.getResponse();
        if (r1 == null) goto L10;
        UploadOSSWorker.Credentials r2 = r1.getCredentials();
        if (r2 == null) goto L10;
        String r3 = r2.getAccessKeySecret();
        if (r3 == null) goto L10;
    L11:
        if (r6 == null) goto L18;
        UploadOSSWorker.ResponseData r4 = r6.getResponse();
        if (r4 == null) goto L18;
        UploadOSSWorker.Credentials r5 = r4.getCredentials();
        if (r5 == null) goto L18;
        String r7 = r5.getAccessKeyId();
        if (r7 == null) goto L18;
    L19:
        if (r6 == null) goto L26;
        UploadOSSWorker.ResponseData r8 = r6.getResponse();
        if (r8 == null) goto L26;
        UploadOSSWorker.Credentials r9 = r8.getCredentials();
        if (r9 == null) goto L26;
        String r10 = r9.getSecurityToken();
        if (r10 == null) goto L26;
    L27:
        if (r6 == null) goto L30;
        String r11 = r6.getBucket();
        if (r11 == null) goto L30;
    L31:
        if (r6 == null) goto L37;
        String r12 = r6.getEndPoint();
        if (r12 == null) goto L37;
        r0 = r12;
    L37:
        if (r10.length() <= 0) goto L46;
        if (r3.length() <= 0) goto L46;
        if (r7.length() <= 0) goto L46;
        if (r11.length() <= 0) goto L46;
        IiI10X = new OSSClient(Utils.getApp(), r0, new OSSStsTokenCredentialProvider(r7, r3, r10));
        i1O0OXO1O.OXO1.OXO1("TeraBoxManager  createOSSClient   bucket = " + r11);
    L46:
        return IiI10X;
    L30:
        r11 = "";
    L26:
        r10 = "";
    L18:
        r7 = "";
    L10:
        r3 = "";
        goto L11
    }

    public final void XO0O10(@aa1 String r9, @aa1 String r10, @aa1 String r11, @tb1 final Function1<? super Integer, Unit> r12) {
        Intrinsics.X0O(r9, "url");
        Intrinsics.X0O(r10, "access_tokens");
        Intrinsics.X0O(r11, Y5.c.b);
        LogUtils.d(new Object[]{"terabox list item downLoaLink = " + r11 + " "});
        if (i72.OXO1.I0i1OXiI() == false) goto L6;
        O00 = r9 + "&access_tokens=" + r10;
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        String r13 = r9 + "&access_tokens=" + r10;
        String r14 = uz0.O001I(sz0.OXO1).getAbsolutePath();
        Intrinsics.O10IXXX0X(r14, "getAbsolutePath(...)");
        r0.download(r13, r14, r11, new MusicServerManager$downLoadLink$1(r12));
        return;
    L6:
        HashMap r4 = new HashMap();
        r4.put("User-Agent", "pan.baidu.com");
        O00 = r9 + "&access_token=" + r10;
        String r5 = uz0.O001I(sz0.OXO1).getAbsolutePath();
        Intrinsics.O10IXXX0X(r5, "getAbsolutePath(...)");
        NetWorkUtils.INSTANCE.downloadV2(r9 + "&access_token=" + r10, r4, r5, r11, new MusicServerManager$downLoadLink$2(r12));
    }

    @aa1
    public final String XOO0ii0() {
        return O00;
    }

    public final void XX0(@aa1 Function1<? super Pair<UploadOSSWorker.StsRamData, Integer>, Unit> r7) {
        Intrinsics.X0O(r7, "callback");
        SPUtils r0 = a01.OXO1.iO();
        UploadOSSWorker r1 = UploadOSSWorker.OXO1;
        String r2 = r1.O10IXXX0X();
        Object r3 = new Gson().fromJson(r0.getString(r2 + '_' + UploadOSSWorker.StsRamData.class.getName()), UploadOSSWorker.StsRamData.class);
        if (r3 != null) goto L5;
        r3 = UploadOSSWorker.StsRamData.class.newInstance();
    L5:
        UploadOSSWorker.StsRamData r4 = (UploadOSSWorker.StsRamData) r3;
        UploadOSSWorker.ResponseData r5 = r4.getResponse();
        if (r5 == null) goto L19;
        UploadOSSWorker.Credentials r6 = r5.getCredentials();
        if (r6 == null) goto L19;
        String r8 = r6.getExpiration();
        if (r8 == null) goto L19;
        if (r8.length() <= 0) goto L19;
        if (r1.IO(r4.getResponse().getCredentials().getExpiration()) == false) goto L17;
        I0iXXO(r7);
        return;
    L17:
        r7.invoke(new Pair(r4, 0));
        return;
    L19:
        I0iXXO(r7);
    }

    public final void XXI(@aa1 String r4, @aa1 String r5, @tb1 final Function1<? super List<TeraBoxListItem>, Unit> r6) {
        Intrinsics.X0O(r4, "access_tokens");
        Intrinsics.X0O(r5, "key");
        if (i72.OXO1.I0i1OXiI() == false) goto L5;
        String r7 = "https://www.terabox.com/openapi/api/search?access_tokens=" + r4 + "&key=" + r5;
    L6:
        LogUtils.d(new Object[]{"getMusicSearch url -> " + r7});
        AndroidNetworking.get(r7).setPriority(Priority.LOW).build().getAsJSONObject(new MusicServerManager$getTeraBoxFileSearch$1(r6));
        return;
    L5:
        r7 = "http://pan.baidu.com/rest/2.0/xpan/file?access_token=" + r4 + "&key=" + r5 + "&method=search&recursion=1";
        goto L6
    }

    public final void XiOIO(@aa1 String r10, @aa1 final Function1<? super Boolean, Unit> r11) {
        Intrinsics.X0O(r10, "token");
        Intrinsics.X0O(r11, "callback");
        if (i72.OXO1.I0i1OXiI() == false) goto L6;
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r12 = RequestBodyKt.getTeraBoxTokenInfoBody(r10);
        final O1XIiIO<TeraBoxTokenInfo> r1 = new MusicServerManager$getTeraBoxTokenInfo$1(r11);
        Map<String, String> r13 = r0.getHeadersMap();
        final Activity r2 = null;
        final uq r3 = r0.loadPopup(null, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetTeraBoxTokenInfo.URL);
        String r6 = r4 + GetTeraBoxTokenInfo.URL;
        Map<String, ? extends Object> r7 = kotlin.collections.OXO1.X111IO(r12);
        r7.putAll(r13);
        Unit r8 = Unit.OXO1;
        r0.printParam(r6, r7);
        NetWork r5 = NetWork.OXO1;
        String r9 = r4 + GetTeraBoxTokenInfo.URL;
        final O1XIiIO<Response<TeraBoxTokenInfo>> r14 = new MusicServerManager$getTeraBoxTokenInfo$$inlined$postV2$default$1(r2, r1, r3);
        AndroidNetworking.post(r9).addHeaders(r13).addBodyParameter(r12).setTag(r9).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{TeraBoxTokenInfo.class}), new MusicServerManager$getTeraBoxTokenInfo$$inlined$postV2$default$2(r14));
        return;
    L6:
        r11.invoke(Boolean.valueOf(iO(a01.OXO1.IiI10X().getLong(b01.IX0iIX, 0))));
    }

    public final void XiOIii1(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        O00 = r2;
    }

    public final boolean iIiiO(@aa1 String r5) {
        Intrinsics.X0O(r5, "name");
        if (oe5.O0Ii(r5, ".mp3", false, 2, null) == false) goto L5;
        return true;
    L5:
        if (oe5.O0Ii(r5, ".MP3", false, 2, null) == true) goto L10;
        return false;
    L10:
        return true;
    }

    public final boolean iO(long r3) {
        if ((System.currentTimeMillis() - r3) <= 864000) goto L6;
        return true;
    L6:
        return false;
    }
}
