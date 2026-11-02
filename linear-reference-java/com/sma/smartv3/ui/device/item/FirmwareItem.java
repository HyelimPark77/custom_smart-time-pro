package com.sma.smartv3.ui.device.item;

import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.google.gson.Gson;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFirmwareItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareItem.kt\ncom/sma/smartv3/ui/device/item/FirmwareItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,40:1\n15#2:41\n*S KotlinDebug\n*F\n+ 1 FirmwareItem.kt\ncom/sma/smartv3/ui/device/item/FirmwareItem\n*L\n31#1:41\n*E\n"})
public final class FirmwareItem extends BaseDslItem {
    private final boolean initEvent;

    @tb1
    private ImageView ivRemind;

    public FirmwareItem() {
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        this.ivRemind = (ImageView) r2.v(R.id.ivRemind);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!q62.OXO1.XOIO11O());
        FirmwareVersion r0 = (FirmwareVersion) new Gson().fromJson(a01.OXO1.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        ImageView r1 = this.ivRemind;
        if (r1 == null) goto L9;
        if (r0 == null) goto L6;
        int r2 = 0;
    L7:
        r1.setVisibility(r2);
        return;
    L6:
        r2 = 8;
        goto L7
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_firmware;
    }

    @sf5(tag = I01XX0.iXiiiO)
    public final void onFirmwareVersionChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        i1O0OXO1O.OXO1.OXO1("onFirmwareVersionChanged");
        initView();
    }
}
