package com.sma.smartv3.ui.device;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.X0011i1X;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.io.IOUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareRepairModeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairModeActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairModeActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n11#2,2:54\n69#3,3:56\n72#3,5:60\n1#4:59\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairModeActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairModeActivity\n*L\n37#1:54,2\n43#1:56,3\n43#1:60,5\n43#1:59\n*E\n"})
public final class FirmwareRepairModeActivity extends BaseListActivity<String> {
    public FirmwareRepairModeActivity() {
    }

    public static /* synthetic */ void OIX0iXi(FirmwareRepairModeActivity r0, String r1, View r2) {
        initItem$lambda$0(r0, r1, r2);
    }

    private static final void initItem$lambda$0(FirmwareRepairModeActivity r13, String r14, View r15) {
        if (Intrinsics.XOO0ii0(BleCache.INSTANCE.getMPlatform(), BleDeviceInfo.PLATFORM_REALTEK) == false) goto L6;
        SPUtils r16 = a01.OXO1.XIi00iiXO();
        FirmwareVersion r0 = new FirmwareVersion(null, 0, null, null, null, 0, null, null, null, null, 1023, null);
        r0.setFileUrl(r14);
        String r17 = r0.getFileUrl().substring(StringsKt__StringsKt.ii1I(r0.getFileUrl(), IOUtils.DIR_SEPARATOR_UNIX, 0, false, 6, null) + 1);
        Intrinsics.O10IXXX0X(r17, "substring(...)");
        r0.setFileName(r17);
        r16.put(FirmwareVersion.class.getName(), new Gson().toJson(r0));
        r13.startActivity(new Intent(r13, FirmwareRepairRActivity.class));
        return;
    L6:
        ToastUtils.showLong(R.string.stay_tuned);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (String) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<String> initList() {
        return CollectionsKt___CollectionsKt.OO0Oi10(q62.OXO1.Oi());
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.firmware_repair_mode);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.item_common;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_firmware_repair_mode;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public void initItem(@aa1 ug6 r4, @aa1 final String r5, int r6) {
        Intrinsics.X0O(r4, "holder");
        Intrinsics.X0O(r5, MapController.ITEM_LAYER_TAG);
        ((TextView) r4.O00(R.id.tv_name)).setText(getString(R.string.firmware_repair_mode) + " " + (r6 + 1));
        ((LinearLayout) r4.O00(R.id.ll_item_panel)).setOnClickListener(new X0011i1X(this, r5));
    }
}
