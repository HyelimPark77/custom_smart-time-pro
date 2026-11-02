package com.sma.smartv3.ui.device.item;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.model.FileTransmissionKt;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.entity.BleAppInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class HardWareAlipayItem extends BaseDslItem {
    public HardWareAlipayItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        q62 r0 = q62.OXO1;
        boolean r2 = false;
        if (r0.i0() == false) goto L8;
        if (FileTransmissionKt.appStoreIsShowCurrentCategory(BleAppInfo.PACKAGE_ALIPAY) == true) goto L10;
    L6:
        r2 = true;
    L10:
        setItemHidden(r2);
        return;
    L8:
        if (r0.Xii1O1Iii() == true) goto L10;
        goto L10
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_hard_ware_alipay;
    }
}
