package com.sma.smartv3.p610ui.device.item;

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
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        int i = 0;
        setItemHidden((i72.OXO1.Xi1i0XOX0() && q62.OXO1.m2882OI()) ? false : true);
        if (!BleConnector.INSTANCE.isBound()) {
            setItemHidden(true);
            TextView tvRight = getTvRight();
            if (tvRight != null) {
                tvRight.setText("");
                return;
            }
            return;
        }
        boolean z = a01.OXO1.m1440iO().getBoolean(b01.XIi00iiXO, false);
        TextView tvRight2 = getTvRight();
        if (tvRight2 != null) {
            if (z) {
                String[] strArrOXO1 = gb1.OXO1();
                if (PermissionUtils.isGranted((String[]) Arrays.copyOf(strArrOXO1, strArrOXO1.length))) {
                    i = 1;
                }
            }
            tvRight2.setText(cp5.XiOIO(i));
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_incoming_call;
    }
}
