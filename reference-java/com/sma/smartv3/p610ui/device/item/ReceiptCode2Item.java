package com.sma.smartv3.p610ui.device.item;

import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.model.FileTransmissionKt;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.entity.BleAppInfo;

/* JADX INFO: loaded from: classes18.dex */
public final class ReceiptCode2Item extends BaseDeviceItem {
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        q62 q62Var = q62.OXO1;
        boolean z = true;
        if (!q62Var.m2890i0() ? q62Var.i11XO() : FileTransmissionKt.appStoreIsShowCurrentCategory(BleAppInfo.PACKAGE_CARD_WALLET) && q62Var.i11XO()) {
            z = false;
        }
        setItemHidden(z);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_receipt_code;
    }
}
