package com.sma.smartv3.ui.me;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I0101;
import com.android.mltcode.paycertificationapi.IX00X0iX;
import com.android.mltcode.paycertificationapi.O0IOX;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.O1i1X;
import com.android.mltcode.paycertificationapi.OOIiIXO;
import com.android.mltcode.paycertificationapi.OXI11X01O;
import com.android.mltcode.paycertificationapi.OiXIIi;
import com.android.mltcode.paycertificationapi.X1OI1IIiO;
import com.android.mltcode.paycertificationapi.XOIO10IIO;
import com.android.mltcode.paycertificationapi.XOi01OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hn1;
import com.android.mltcode.paycertificationapi.iXIXXX1;
import com.android.mltcode.paycertificationapi.j36;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.io.Location;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import java.io.File;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperTuyaQueryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperTuyaQueryActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,268:1\n176#2,11:269\n196#2:288\n176#2,11:289\n196#2:308\n176#2,11:309\n196#2:328\n252#3,7:280\n270#3:287\n252#3,7:300\n270#3:307\n252#3,7:320\n270#3:327\n*S KotlinDebug\n*F\n+ 1 DeveloperTuyaQueryActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity\n*L\n143#1:269,11\n143#1:288\n178#1:289,11\n178#1:308\n222#1:309,11\n222#1:328\n143#1:280,7\n143#1:287\n178#1:300,7\n178#1:307\n222#1:320,7\n222#1:327\n*E\n"})
public final class DeveloperTuyaQueryActivity extends BaseActivity {

    @aa1
    private final Lazy btnOperate$delegate;

    @aa1
    private final List<String> list;

    @tb1
    private uq mLoadingPopup;
    private String mMac;
    private String mName;

    @tb1
    private dj4 mPopup;

    @aa1
    private final Lazy tvCount$delegate;

    @aa1
    private final Lazy tvInfo$delegate;

    @aa1
    private final Lazy tvState$delegate;

    public DeveloperTuyaQueryActivity() {
        this.tvInfo$delegate = LazyKt__LazyJVMKt.iO(new OiXIIi(this));
        this.tvState$delegate = LazyKt__LazyJVMKt.iO(new O0IOX(this));
        this.btnOperate$delegate = LazyKt__LazyJVMKt.iO(new OXI11X01O(this));
        this.tvCount$delegate = LazyKt__LazyJVMKt.iO(new iXIXXX1(this));
        this.list = CollectionsKt__CollectionsKt.Ii1iii0(new String[]{"0-主板烧录", "1-产线一检", "2-产线二检", "3-包装", "99-恢复默认状态（全部状态置为0）"});
    }

    public static /* synthetic */ boolean I0iXXO(DeveloperTuyaQueryActivity r0, int r1) {
        return onOperate$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ TextView I1XOi1(DeveloperTuyaQueryActivity r0) {
        return tvState_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean O10IXXX0X(DeveloperTuyaQueryActivity r0) {
        return onQuery$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean OIX0iXi(DeveloperTuyaQueryActivity r0) {
        return onExportCsv$lambda$0$0(r0);
    }

    public static /* synthetic */ TextView X0O(DeveloperTuyaQueryActivity r0) {
        return tvCount_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button X1ii(DeveloperTuyaQueryActivity r0) {
        return btnOperate_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(DeveloperTuyaQueryActivity r0) {
        return tvInfo_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ uq access$getMLoadingPopup$p(DeveloperTuyaQueryActivity r0) {
        return r0.mLoadingPopup;
    }

    public static final /* synthetic */ String access$getMNow(DeveloperTuyaQueryActivity r0) {
        return r0.getMNow();
    }

    public static final /* synthetic */ File access$getShareFile(DeveloperTuyaQueryActivity r0, String r1) {
        return r0.getShareFile(r1);
    }

    public static final /* synthetic */ TextView access$getTvCount(DeveloperTuyaQueryActivity r0) {
        return r0.getTvCount();
    }

    public static final /* synthetic */ TextView access$getTvState(DeveloperTuyaQueryActivity r0) {
        return r0.getTvState();
    }

    private static final Button btnOperate_delegate$lambda$0(DeveloperTuyaQueryActivity r1) {
        return (Button) r1.findViewById(R.id.btn_operate);
    }

    private final Button getBtnOperate() {
        return (Button) getValue();
    }

    private final String getMNow() {
        return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.getDefault()).format(new Date());
    }

    private final File getShareFile(String r5) {
        return sz0.OXO1.OXO1(Location.EXTERNAL, hn1.XIi00iiXO.O00().XIi00iiXO("share"), r5);
    }

    private final TextView getTvCount() {
        return (TextView) getValue();
    }

    private final TextView getTvInfo() {
        return (TextView) getValue();
    }

    private final TextView getTvState() {
        return (TextView) getValue();
    }

    private static final boolean onExportCsv$lambda$0$0(DeveloperTuyaQueryActivity r0) {
        r0.export();
        return true;
    }

    private static final boolean onOperate$lambda$0$0(DeveloperTuyaQueryActivity r4, int r5) {
        r4.getBtnOperate().setText("当前：\n" + r4.list.get(r5));
        a01.OXO1.XIi00iiXO().put(IX00X0iX.OXO1, r5);
        r4.queryCount(r5);
        return true;
    }

    private static final boolean onQuery$lambda$0$0(DeveloperTuyaQueryActivity r3) {
        int r0 = a01.OXO1.XIi00iiXO().getInt(IX00X0iX.OXO1, 0);
        if (r0 != 4) goto L5;
        r3.query(99);
        return true;
    L5:
        r3.query(r0);
        return true;
    }

    private static final TextView tvCount_delegate$lambda$0(DeveloperTuyaQueryActivity r1) {
        return (TextView) r1.findViewById(R.id.tvCount);
    }

    private static final TextView tvInfo_delegate$lambda$0(DeveloperTuyaQueryActivity r1) {
        return (TextView) r1.findViewById(R.id.tvInfo);
    }

    private static final TextView tvState_delegate$lambda$0(DeveloperTuyaQueryActivity r1) {
        return (TextView) r1.findViewById(R.id.tvState);
    }

    public final void export() {
        if (this.mLoadingPopup != null) goto L5;
        uq r1 = new uq(getMContext());
        r1.I0iXXO(false);
        this.mLoadingPopup = r1;
    L5:
        uq r2 = this.mLoadingPopup;
        if (r2 == null) goto L8;
        r2.IIX1OXO();
    L8:
        NetWorkUtils r3 = NetWorkUtils.INSTANCE;
        HashMap r4 = new HashMap();
        String r5 = this.mName;
        final Activity r6 = null;
        if (r5 != null) goto L11;
        Intrinsics.XXO("mName");
        r5 = null;
    L11:
        r4.put("bleName", r5);
        final O1XIiIO<j36[]> r7 = new AnonymousClass3(this);
        final uq r8 = r3.loadPopup(null, null);
        String r9 = r3.convertBaseUrl(Api.INSTANCE.getBASE_URL(), I0101.XIi00iiXO);
        r3.printParam(r9 + I0101.XIi00iiXO, r4);
        NetWork r10 = NetWork.OXO1;
        String r11 = r9 + I0101.XIi00iiXO;
        final O1XIiIO<Response<j36[]>> r12 = new DeveloperTuyaQueryActivity$export$$inlined$post$default$1(r6, r7, r8);
        AndroidNetworking.post(r11).addBodyParameter(r4).setTag(r11).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{j36[].class}), new DeveloperTuyaQueryActivity$export$$inlined$post$default$2(r12));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        this.mName = String.valueOf(getIntent().getStringExtra("name"));
        this.mMac = String.valueOf(getIntent().getStringExtra("mac"));
        TextView r0 = getTvInfo();
        String r1 = this.mName;
        String r2 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mName");
        r1 = null;
    L5:
        String r3 = this.mMac;
        if (r3 != null) goto L8;
        Intrinsics.XXO("mMac");
    L9:
        r0.setText("蓝牙名\n" + r1 + "\n\n\n地址\n" + r2);
        Button r4 = getBtnOperate();
        List<String> r5 = this.list;
        a01 r6 = a01.OXO1;
        r4.setText("当前：\n" + r5.get(r6.XIi00iiXO().getInt(IX00X0iX.OXO1, 0)));
        queryCount(r6.XIi00iiXO().getInt(IX00X0iX.OXO1, 0));
        return;
    L8:
        r2 = r3;
        goto L9
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_developer_test_tuya_query;
    }

    public final void onExportCsv(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        go0 r5 = new go0(this, 0, 2, null);
        r5.iI("是否导出数据？");
        go0.X11iII1O1(r5, Integer.valueOf(R.string.cancel), null, 2, null);
        r5.X1IX(R.string.confirm, new OOIiIXO(this));
        r5.X0O(R.id.root_view);
    }

    public final void onOperate(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        if (this.mPopup != null) goto L5;
        int r3 = 0;
        DeveloperTuyaQueryActivity r1 = this;
        dj4 r0 = new dj4(r1, this.list, r3, 4, null);
        r0.i010I(new O1i1X(this));
        r1.mPopup = r0;
    L6:
        dj4 r8 = r1.mPopup;
        if (r8 == null) goto L10;
        r8.II1Xi0(a01.OXO1.XIi00iiXO().getInt(IX00X0iX.OXO1, 0));
        r8.X0O(R.id.root_view);
        return;
    L10:
        return;
    L5:
        r1 = this;
        goto L6
    }

    public final void onQuery(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        go0 r8 = new go0(this, 0, 2, null);
        r8.iI("当前：\n" + this.list.get(a01.OXO1.XIi00iiXO().getInt(IX00X0iX.OXO1, 0)));
        go0.X11iII1O1(r8, Integer.valueOf(R.string.cancel), null, 2, null);
        r8.X1IX(R.string.confirm, new X1OI1IIiO(this));
        r8.X0O(R.id.root_view);
    }

    public final void query(int r9) {
        if (this.mLoadingPopup != null) goto L5;
        uq r1 = new uq(getMContext());
        r1.I0iXXO(false);
        this.mLoadingPopup = r1;
    L5:
        uq r2 = this.mLoadingPopup;
        if (r2 == null) goto L8;
        r2.IIX1OXO();
    L8:
        NetWorkUtils r3 = NetWorkUtils.INSTANCE;
        HashMap r4 = new HashMap();
        String r5 = this.mName;
        final Activity r6 = null;
        if (r5 != null) goto L11;
        Intrinsics.XXO("mName");
        r5 = null;
    L11:
        r4.put("bleName", r5);
        String r7 = this.mMac;
        if (r7 != null) goto L14;
        Intrinsics.XXO("mMac");
        r7 = null;
    L14:
        r4.put("mac", r7);
        r4.put("queryStep", String.valueOf(r9));
        final O1XIiIO<String> r10 = new C34783(this);
        final uq r8 = r3.loadPopup(null, null);
        String r11 = r3.convertBaseUrl(Api.INSTANCE.getBASE_URL(), XOIO10IIO.XIi00iiXO);
        r3.printParam(r11 + XOIO10IIO.XIi00iiXO, r4);
        NetWork r12 = NetWork.OXO1;
        String r13 = r11 + XOIO10IIO.XIi00iiXO;
        final O1XIiIO<Response<String>> r14 = new DeveloperTuyaQueryActivity$query$$inlined$post$default$1(r6, r10, r8);
        AndroidNetworking.post(r13).addBodyParameter(r4).setTag(r13).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new DeveloperTuyaQueryActivity$query$$inlined$post$default$2(r14));
    }

    public final void queryCount(int r9) {
        if (this.mLoadingPopup != null) goto L5;
        uq r1 = new uq(getMContext());
        r1.I0iXXO(false);
        this.mLoadingPopup = r1;
    L5:
        uq r2 = this.mLoadingPopup;
        if (r2 == null) goto L8;
        r2.IIX1OXO();
    L8:
        NetWorkUtils r3 = NetWorkUtils.INSTANCE;
        HashMap r4 = new HashMap();
        String r5 = this.mName;
        final Activity r6 = null;
        if (r5 != null) goto L11;
        Intrinsics.XXO("mName");
        r5 = null;
    L11:
        r4.put("bleName", r5);
        if (r9 != 4) goto L14;
        String r10 = "99";
    L15:
        r4.put("queryStep", r10);
        final O1XIiIO<String> r11 = new C34793(this);
        final uq r7 = r3.loadPopup(null, null);
        String r8 = r3.convertBaseUrl(Api.INSTANCE.getBASE_URL(), XOi01OiO.XIi00iiXO);
        r3.printParam(r8 + XOi01OiO.XIi00iiXO, r4);
        NetWork r12 = NetWork.OXO1;
        String r13 = r8 + XOi01OiO.XIi00iiXO;
        final O1XIiIO<Response<String>> r14 = new DeveloperTuyaQueryActivity$queryCount$$inlined$post$default$1(r6, r11, r7);
        AndroidNetworking.post(r13).addBodyParameter(r4).setTag(r13).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new DeveloperTuyaQueryActivity$queryCount$$inlined$post$default$2(r14));
        return;
    L14:
        r10 = String.valueOf(r9);
        goto L15
    }
}
