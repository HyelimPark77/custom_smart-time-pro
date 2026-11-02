package com.sma.smartv3.ui.device.item;

import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.model.FileTransmissionKt;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.entity.BleAppInfo;

/* JADX INFO: loaded from: classes18.dex */
public final class ReceiptCodeItem extends BaseDeviceItem {
    public ReceiptCodeItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        q62 r0 = q62.OXO1;
        boolean r2 = true;
        if (r0.i0() == false) goto L11;
        if (FileTransmissionKt.appStoreIsShowCurrentCategory(BleAppInfo.PACKAGE_CARD_WALLET) == true) goto L7;
    L12:
        setItemHidden(r2);
        return;
    L7:
        if (r0.Xi1X() == false) goto L12;
    L9:
        r2 = false;
        goto L12
    L11:
        if (r0.Xi1X() == true) goto L9;
        goto L9
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_receipt_code;
    }
}
