package com.sma.smartv3.ui.device.item;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gb1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.blankj.utilcode.util.PermissionUtils;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleConnector;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
public final class IncomingCallItem extends BaseDeviceItem {
    public IncomingCallItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        int r1 = 0;
        if (i72.OXO1.Xi1i0XOX0() == true) goto L5;
    L6:
        boolean r0 = true;
    L8:
        setItemHidden(r0);
        if (BleConnector.INSTANCE.isBound() == false) goto L18;
        boolean r2 = a01.OXO1.iO().getBoolean(b01.XIi00iiXO, false);
        TextView r3 = getTvRight();
        if (r3 == null) goto L22;
        if (r2 == false) goto L16;
        String[] r4 = gb1.OXO1();
        if (PermissionUtils.isGranted((String[]) Arrays.copyOf(r4, r4.length)) == false) goto L16;
        r1 = 1;
    L16:
        r3.setText(cp5.XiOIO(r1));
        return;
    L22:
        return;
    L18:
        setItemHidden(true);
        TextView r5 = getTvRight();
        if (r5 == null) goto L23;
        r5.setText("");
        return;
    L23:
        return;
    L5:
        if (q62.OXO1.OI() == false) goto L6;
        r0 = false;
        goto L8
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_incoming_call;
    }
}
