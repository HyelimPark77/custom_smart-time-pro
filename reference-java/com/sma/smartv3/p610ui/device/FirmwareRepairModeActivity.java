package com.sma.smartv3.p610ui.device;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.p598io.IOUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.p610ui.device.FirmwareRepairModeActivity;
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
    /* JADX INFO: Access modifiers changed from: private */
    public static final void initItem$lambda$0(FirmwareRepairModeActivity firmwareRepairModeActivity, String str, View view) {
        if (!Intrinsics.XOO0ii0(BleCache.INSTANCE.getMPlatform(), BleDeviceInfo.PLATFORM_REALTEK)) {
            ToastUtils.showLong(R.string.stay_tuned);
            return;
        }
        SPUtils sPUtilsXIi00iiXO = a01.OXO1.XIi00iiXO();
        FirmwareVersion firmwareVersion = new FirmwareVersion(null, 0, null, null, null, 0, null, null, null, null, 1023, null);
        firmwareVersion.setFileUrl(str);
        String strSubstring = firmwareVersion.getFileUrl().substring(StringsKt__StringsKt.ii1I(firmwareVersion.getFileUrl(), IOUtils.DIR_SEPARATOR_UNIX, 0, false, 6, null) + 1);
        Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
        firmwareVersion.setFileName(strSubstring);
        sPUtilsXIi00iiXO.put(FirmwareVersion.class.getName(), new Gson().toJson(firmwareVersion));
        firmwareRepairModeActivity.startActivity(new Intent(firmwareRepairModeActivity, (Class<?>) FirmwareRepairRActivity.class));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<String> initList() {
        return CollectionsKt___CollectionsKt.OO0Oi10(q62.OXO1.m2885Oi());
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.firmware_repair_mode);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return R.layout.item_common;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_firmware_repair_mode;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2740np
    public void initItem(@aa1 ug6 holder, @aa1 final String item, int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        ((TextView) holder.O00(R.id.tv_name)).setText(getString(R.string.firmware_repair_mode) + " " + (i + 1));
        ((LinearLayout) holder.O00(R.id.ll_item_panel)).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X0011i1X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FirmwareRepairModeActivity.initItem$lambda$0(this.f3864IO, item, view);
            }
        });
    }
}
