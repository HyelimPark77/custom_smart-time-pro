package com.sma.smartv3.ui.me;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.android.mltcode.paycertificationapi.I0I0iI;
import com.android.mltcode.paycertificationapi.I0i100IX1;
import com.android.mltcode.paycertificationapi.IIiIiII1;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iO1O10O;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.ExtraPackVersions;
import com.sma.smartv3.model.ExtraPackageData;
import com.sma.smartv3.model.ExtraPackageDataList;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.timezonepicker.TimeZonePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperOtaSelectExtraPackageDialActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectExtraPackageDialActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n19#2:90\n15#2:91\n19#2:92\n15#2:93\n11#2,2:112\n69#3,3:94\n72#3,5:98\n69#3,3:103\n72#3,5:107\n1#4:97\n1#4:106\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectExtraPackageDialActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity\n*L\n26#1:90\n26#1:91\n32#1:92\n32#1:93\n74#1:112,2\n42#1:94,3\n42#1:98,5\n85#1:103,3\n85#1:107,5\n42#1:97\n85#1:106\n*E\n"})
public final class DeveloperOtaSelectExtraPackageDialActivity extends BaseListActivity<ExtraPackageData> {

    @aa1
    private final Lazy btNext$delegate;

    @aa1
    private final ArrayList<ExtraPackageData> dataList;

    @aa1
    private final ExtraPackVersions extraPackVersions;

    @aa1
    private final Lazy tvSelect$delegate;

    @aa1
    private final Lazy tvSelectRemind$delegate;

    public DeveloperOtaSelectExtraPackageDialActivity() {
        this.tvSelectRemind$delegate = LazyKt__LazyJVMKt.iO(new IIiIiII1(this));
        this.tvSelect$delegate = LazyKt__LazyJVMKt.iO(new I0i100IX1(this));
        this.btNext$delegate = LazyKt__LazyJVMKt.iO(new iO1O10O(this));
        this.dataList = new ArrayList();
        SPUtils r0 = a01.OXO1.XIi00iiXO();
        Object r1 = new ExtraPackVersions(null, null, null, null, null, null, null, 127, null);
        Object r2 = new Gson().fromJson(r0.getString(ExtraPackVersions.class.getName()), ExtraPackVersions.class);
        if (r2 == null) goto L6;
        r1 = r2;
    L6:
        this.extraPackVersions = (ExtraPackVersions) r1;
    }

    public static /* synthetic */ TextView I0iXXO(DeveloperOtaSelectExtraPackageDialActivity r0) {
        return tvSelect_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OIX0iXi(DeveloperOtaSelectExtraPackageDialActivity r0, ExtraPackageData r1, View r2) {
        initItem$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ TextView X1ii(DeveloperOtaSelectExtraPackageDialActivity r0) {
        return tvSelectRemind_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AppCompatButton XXI(DeveloperOtaSelectExtraPackageDialActivity r0) {
        return btNext_delegate$lambda$0(r0);
    }

    private static final AppCompatButton btNext_delegate$lambda$0(DeveloperOtaSelectExtraPackageDialActivity r1) {
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

    private static final void initItem$lambda$0$0(DeveloperOtaSelectExtraPackageDialActivity r13, ExtraPackageData r14, View r15) {
        r13.getTvSelect().setText(r14.getVersion() + "  -- " + r14.getInfo());
        r13.extraPackVersions.setDialPackVersion(new FirmwareVersion(r14.getFileName(), r14.getFileSize(), r14.getFileUrl(), r14.getVersion(), r14.getInfo(), 0, null, null, null, null, TimeZonePicker.OXO1, null));
        a01.OXO1.XIi00iiXO().put(ExtraPackVersions.class.getName(), new Gson().toJson(r13.extraPackVersions));
    }

    private static final TextView tvSelectRemind_delegate$lambda$0(DeveloperOtaSelectExtraPackageDialActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_select_remind);
    }

    private static final TextView tvSelect_delegate$lambda$0(DeveloperOtaSelectExtraPackageDialActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_select);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r5) {
        SPUtils r6 = a01.OXO1.XIi00iiXO();
        Object r0 = new ExtraPackageDataList(0, null, 3, null);
        Object r7 = new Gson().fromJson(r6.getString(ExtraPackageDataList.class.getName()), ExtraPackageDataList.class);
        if (r7 == null) goto L6;
        r0 = r7;
    L6:
        Iterator<ExtraPackageData> r8 = ((ExtraPackageDataList) r0).getData().iterator();
        Intrinsics.O10IXXX0X(r8, "iterator(...)");
    L8:
        if (r8.hasNext() == false) goto L13;
        ExtraPackageData r1 = r8.next();
        Intrinsics.O10IXXX0X(r1, "next(...)");
        ExtraPackageData r2 = r1;
        if (r2.getType() != (-7)) goto L8;
        this.dataList.add(r2);
        goto L8
    L13:
        if (this.dataList.size() != 0) goto L21;
        startActivity(new Intent(this, DeveloperOtaStartActivity.class));
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (ExtraPackageData) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<ExtraPackageData> initList() {
        return this.dataList;
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getTvSelectRemind().setText(R.string.select_remind_dial_pack);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return android.R.layout.simple_list_item_1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_developer_test_ota_select_version_list;
    }

    public final void nextOnClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        getBtNext().setVisibility(8);
        startActivity(new Intent(this, DeveloperOtaStartActivity.class));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getBtNext().setVisibility(0);
    }

    public void initItem(@aa1 ug6 r6, @aa1 final ExtraPackageData r7, int r8) {
        Intrinsics.X0O(r6, "holder");
        Intrinsics.X0O(r7, MapController.ITEM_LAYER_TAG);
        r6.OII(android.R.id.text1, "version:" + r7.getVersion() + "\nfileName:" + r7.getFileName() + "\nfirmwareVersion:" + r7.getFirmwareVersion() + "\ninfo:" + r7.getInfo());
        r6.O10IXXX0X(android.R.id.text1, new I0I0iI(this, r7));
    }
}
