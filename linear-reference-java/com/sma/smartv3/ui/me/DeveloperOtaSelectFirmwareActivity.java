package com.sma.smartv3.ui.me;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.O1XiOiI;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1ii11Xi0;
import com.android.mltcode.paycertificationapi.iOI10X0X;
import com.android.mltcode.paycertificationapi.iXO0XO;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.BleFirmwareInfo;
import com.sma.smartv3.model.ExtraPackageDataList;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.model.FirmwareVersionList;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.BleExtraPackVersionList;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.pro.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperOtaSelectFirmwareActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectFirmwareActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n19#2:107\n15#2:108\n19#2:109\n15#2:110\n11#2,2:140\n176#3,11:111\n196#3:130\n252#4,7:122\n270#4:129\n69#5,3:131\n72#5,5:135\n1#6:134\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectFirmwareActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity\n*L\n39#1:107\n39#1:108\n41#1:109\n41#1:110\n64#1:140,2\n80#1:111,11\n80#1:130\n80#1:122,7\n80#1:129\n101#1:131,3\n101#1:135,5\n101#1:134\n*E\n"})
public final class DeveloperOtaSelectFirmwareActivity extends BaseListActivity<FirmwareVersion> {

    @aa1
    private final Lazy btNext$delegate;
    private ArrayList<FirmwareVersion> dataList;
    private int firmwareID;

    @aa1
    private final Lazy tvSelect$delegate;

    @aa1
    private final Lazy tvSelectRemind$delegate;

    public DeveloperOtaSelectFirmwareActivity() {
        this.tvSelectRemind$delegate = LazyKt__LazyJVMKt.iO(new iOI10X0X(this));
        this.tvSelect$delegate = LazyKt__LazyJVMKt.iO(new iXO0XO(this));
        this.btNext$delegate = LazyKt__LazyJVMKt.iO(new i1ii11Xi0(this));
    }

    public static /* synthetic */ void I0iXXO(DeveloperOtaSelectFirmwareActivity r0, FirmwareVersion r1, View r2) {
        initItem$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AppCompatButton OIX0iXi(DeveloperOtaSelectFirmwareActivity r0) {
        return btNext_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X1ii(DeveloperOtaSelectFirmwareActivity r0) {
        return tvSelect_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(DeveloperOtaSelectFirmwareActivity r0) {
        return tvSelectRemind_delegate$lambda$0(r0);
    }

    private static final AppCompatButton btNext_delegate$lambda$0(DeveloperOtaSelectFirmwareActivity r1) {
        return (AppCompatButton) r1.findViewById(R.id.bt_next);
    }

    private final AppCompatButton getBtNext() {
        return (AppCompatButton) getValue();
    }

    private final TextView getTvSelect() {
        return (TextView) getValue();
    }

    private final TextView getTvSelectRemind() {
        return (TextView) getValue();
    }

    private static final void initItem$lambda$0$0(DeveloperOtaSelectFirmwareActivity r2, FirmwareVersion r3, View r4) {
        r2.getTvSelect().setText(r3.getVersion() + "  -- " + r3.getInfo());
        a01.OXO1.XIi00iiXO().put(FirmwareVersion.class.getName(), new Gson().toJson(r3));
    }

    private static final TextView tvSelectRemind_delegate$lambda$0(DeveloperOtaSelectFirmwareActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_select_remind);
    }

    private static final TextView tvSelect_delegate$lambda$0(DeveloperOtaSelectFirmwareActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_select);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r9) {
        a01 r10 = a01.OXO1;
        SPUtils r0 = r10.XIi00iiXO();
        Object r1 = new FirmwareVersionList(0, null, 3, null);
        Object r2 = new Gson().fromJson(r0.getString(FirmwareVersionList.class.getName()), FirmwareVersionList.class);
        if (r2 == null) goto L6;
        r1 = r2;
    L6:
        this.dataList = ((FirmwareVersionList) r1).getData();
        SPUtils r11 = r10.XIi00iiXO();
        Object r3 = new BleFirmwareInfo(0, 0, null, null, null, 31, null);
        Object r12 = new Gson().fromJson(r11.getString(BleFirmwareInfo.class.getName()), BleFirmwareInfo.class);
        if (r12 == null) goto L10;
        r3 = r12;
    L10:
        this.firmwareID = ((BleFirmwareInfo) r3).getId();
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (FirmwareVersion) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<FirmwareVersion> initList() {
        ArrayList<FirmwareVersion> r0 = this.dataList;
        if (r0 != null) goto L6;
        Intrinsics.XXO("dataList");
        return null;
    L6:
        return r0;
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getTvSelectRemind().setText(R.string.select_remind_firmware_info);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return android.R.layout.simple_list_item_1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_developer_test_ota_select_version_list;
    }

    public final void nextOnClick(@aa1 View r10) {
        Intrinsics.X0O(r10, "view");
        getBtNext().setVisibility(8);
        int r11 = a01.OXO1.XIi00iiXO().getInt(b01.X11iII1O1);
        if (r11 == 0) goto L18;
        if (r11 != 1) goto L6;
    L16:
        startActivity(new Intent(this, DeveloperOtaStartActivity.class));
        return;
    L6:
        if (r11 == 2) goto L16;
        if (r11 == 4) goto L16;
        if (r11 == 5) goto L18;
        if (r11 == 6) goto L16;
        if (r11 == 7) goto L16;
        return;
    L18:
        ToastUtils.showLong("Network request, please wait", new Object[0]);
        NetWorkUtils r12 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r2 = RequestBodyKt.getBleFirmwareVersionListBody(String.valueOf(this.firmwareID));
        final O1XIiIO<ExtraPackageDataList> r3 = new AnonymousClass1(this);
        final Activity r4 = null;
        final uq r5 = r12.loadPopup(null, null);
        String r6 = r12.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleExtraPackVersionList.URL);
        r12.printParam(r6 + BleExtraPackVersionList.URL, r2);
        NetWork r13 = NetWork.OXO1;
        String r14 = r6 + BleExtraPackVersionList.URL;
        final O1XIiIO<Response<ExtraPackageDataList>> r7 = new DeveloperOtaSelectFirmwareActivity$nextOnClick$$inlined$post$default$1(r4, r3, r5);
        AndroidNetworking.post(r14).addBodyParameter(r2).setTag(r14).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{ExtraPackageDataList.class}), new DeveloperOtaSelectFirmwareActivity$nextOnClick$$inlined$post$default$2(r7));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getBtNext().setVisibility(0);
    }

    public void initItem(@aa1 ug6 r5, @aa1 final FirmwareVersion r6, int r7) {
        Intrinsics.X0O(r5, "holder");
        Intrinsics.X0O(r6, MapController.ITEM_LAYER_TAG);
        r5.OII(android.R.id.text1, "firmwareVersion:" + r6.getVersion() + "\nfileName:" + r6.getFileName() + "\ninfo:" + r6.getInfo());
        r5.O10IXXX0X(android.R.id.text1, new O1XiOiI(this, r6));
    }
}
