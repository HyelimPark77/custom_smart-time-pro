package com.sma.smartv3.ui.me;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OOI1iiI;
import com.android.mltcode.paycertificationapi.XX1O00Xi0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iOI00IIi;
import com.android.mltcode.paycertificationapi.iXOI1O1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.BleFirmwareInfo;
import com.sma.smartv3.model.BleFirmwareVersionInfoList;
import com.sma.smartv3.model.FirmwareVersionList;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.BleFirmwareVersionList;
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
@SourceDebugExtension({"SMAP\nDeveloperOtaSelectDeviceModeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectDeviceModeActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,94:1\n19#2:95\n15#2:96\n11#2,2:117\n176#3,11:97\n196#3:116\n252#4,7:108\n270#4:115\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectDeviceModeActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity\n*L\n37#1:95\n37#1:96\n60#1:117,2\n75#1:97,11\n75#1:116\n75#1:108,7\n75#1:115\n*E\n"})
public final class DeveloperOtaSelectDeviceModeActivity extends BaseListActivity<BleFirmwareInfo> {

    @aa1
    private final Lazy btNext$delegate;
    private ArrayList<BleFirmwareInfo> dataList;
    private int firmwareID;

    @aa1
    private final Lazy tvSelect$delegate;

    @aa1
    private final Lazy tvSelectRemind$delegate;

    public DeveloperOtaSelectDeviceModeActivity() {
        this.tvSelectRemind$delegate = LazyKt__LazyJVMKt.iO(new iOI00IIi(this));
        this.tvSelect$delegate = LazyKt__LazyJVMKt.iO(new iXOI1O1(this));
        this.btNext$delegate = LazyKt__LazyJVMKt.iO(new OOI1iiI(this));
    }

    public static /* synthetic */ TextView I0iXXO(DeveloperOtaSelectDeviceModeActivity r0) {
        return tvSelect_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AppCompatButton OIX0iXi(DeveloperOtaSelectDeviceModeActivity r0) {
        return btNext_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(DeveloperOtaSelectDeviceModeActivity r0, BleFirmwareInfo r1, View r2) {
        initItem$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ TextView XXI(DeveloperOtaSelectDeviceModeActivity r0) {
        return tvSelectRemind_delegate$lambda$0(r0);
    }

    private static final AppCompatButton btNext_delegate$lambda$0(DeveloperOtaSelectDeviceModeActivity r1) {
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

    private static final void initItem$lambda$0$0(DeveloperOtaSelectDeviceModeActivity r3, BleFirmwareInfo r4, View r5) {
        r3.firmwareID = r4.getId();
        r3.getTvSelect().setText(r4.getBleName() + HelpFormatter.DEFAULT_LONG_OPT_PREFIX + r4.getFlag() + HelpFormatter.DEFAULT_LONG_OPT_PREFIX + r4.getRemark());
        a01.OXO1.XIi00iiXO().put(BleFirmwareInfo.class.getName(), new Gson().toJson(r4));
    }

    private static final TextView tvSelectRemind_delegate$lambda$0(DeveloperOtaSelectDeviceModeActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_select_remind);
    }

    private static final TextView tvSelect_delegate$lambda$0(DeveloperOtaSelectDeviceModeActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_select);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r5) {
        SPUtils r6 = a01.OXO1.XIi00iiXO();
        Object r0 = new BleFirmwareVersionInfoList(0, null, 3, null);
        Object r7 = new Gson().fromJson(r6.getString(BleFirmwareVersionInfoList.class.getName()), BleFirmwareVersionInfoList.class);
        if (r7 == null) goto L6;
        r0 = r7;
    L6:
        this.dataList = ((BleFirmwareVersionInfoList) r0).getData();
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (BleFirmwareInfo) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<BleFirmwareInfo> initList() {
        ArrayList<BleFirmwareInfo> r0 = this.dataList;
        if (r0 != null) goto L6;
        Intrinsics.XXO("dataList");
        return null;
    L6:
        return r0;
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getTvSelectRemind().setText(R.string.select_remind_firmware_mode);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return android.R.layout.simple_list_item_1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_developer_test_ota_select_version_list;
    }

    public final void nextOnClick(@aa1 View r9) {
        Intrinsics.X0O(r9, "view");
        if (this.firmwareID != 0) goto L6;
        ToastUtils.showLong(R.string.check_firmware_mode);
        return;
    L6:
        getBtNext().setVisibility(8);
        ToastUtils.showLong("Network request, please wait", new Object[0]);
        NetWorkUtils r10 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r1 = RequestBodyKt.getBleFirmwareVersionListBody(String.valueOf(this.firmwareID));
        final O1XIiIO<FirmwareVersionList> r2 = new AnonymousClass1(this);
        final Activity r3 = null;
        final uq r4 = r10.loadPopup(null, null);
        String r5 = r10.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleFirmwareVersionList.URL);
        r10.printParam(r5 + BleFirmwareVersionList.URL, r1);
        NetWork r11 = NetWork.OXO1;
        String r12 = r5 + BleFirmwareVersionList.URL;
        final O1XIiIO<Response<FirmwareVersionList>> r6 = new DeveloperOtaSelectDeviceModeActivity$nextOnClick$$inlined$post$default$1(r3, r2, r4);
        AndroidNetworking.post(r12).addBodyParameter(r1).setTag(r12).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{FirmwareVersionList.class}), new DeveloperOtaSelectDeviceModeActivity$nextOnClick$$inlined$post$default$2(r6));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getBtNext().setVisibility(0);
    }

    public void initItem(@aa1 ug6 r6, @aa1 final BleFirmwareInfo r7, int r8) {
        Intrinsics.X0O(r6, "holder");
        Intrinsics.X0O(r7, MapController.ITEM_LAYER_TAG);
        r6.OII(android.R.id.text1, "id:" + r7.getId() + "\nbleName:" + r7.getBleName() + "\nflag:" + r7.getFlag() + "\nremark:" + r7.getRemark());
        r6.O10IXXX0X(android.R.id.text1, new XX1O00Xi0(this, r7));
    }
}
