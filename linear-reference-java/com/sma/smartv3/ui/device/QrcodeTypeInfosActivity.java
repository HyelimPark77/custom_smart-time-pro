package com.sma.smartv3.ui.device;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qa2;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.sma.smartv3.model.QrcodeTypeInfo;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nQrcodeTypeInfosActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QrcodeTypeInfosActivity.kt\ncom/sma/smartv3/ui/device/QrcodeTypeInfosActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n87#2,7:48\n94#2,3:56\n70#2,7:59\n97#2:66\n1#3:55\n*S KotlinDebug\n*F\n+ 1 QrcodeTypeInfosActivity.kt\ncom/sma/smartv3/ui/device/QrcodeTypeInfosActivity\n*L\n31#1:48,7\n31#1:56,3\n31#1:59,7\n31#1:66\n31#1:55\n*E\n"})
public final class QrcodeTypeInfosActivity extends BaseListActivity<QrcodeTypeInfo> {
    public QrcodeTypeInfosActivity() {
    }

    public static /* synthetic */ void OIX0iXi(QrcodeTypeInfosActivity r0, AdapterView r1, View r2, int r3, long r4) {
        initView$lambda$0(r0, r1, r2, r3, r4);
    }

    private static final void initView$lambda$0(QrcodeTypeInfosActivity r0, AdapterView r1, View r2, int r3, long r4) {
        QrcodeTypeInfo r5 = r0.getMList().get(r3);
        Bundle r6 = new Bundle();
        r6.putString("mArg0", null);
        r6.putParcelable("mArg2", null);
        r6.putSerializable("mArg3", r5);
        Intent r7 = new Intent(r0, QrcodeSyncActivity.class);
        r7.putExtras(r6);
        r0.startActivity(r7);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (QrcodeTypeInfo) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<QrcodeTypeInfo> initList() {
        return q62.OXO1.IOX1(this, getMArg1());
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        TextView r0 = (TextView) findViewById(R.id.abh_title_center);
        if (getMArg1() != 1) goto L5;
        int r1 = R.string.receipt_code;
    L6:
        r0.setText(r1);
        getMListView().setOnItemClickListener(new qa2(this));
        return;
    L5:
        r1 = R.string.my_card_code;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.item_code_type;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_qrcode_type_infos;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public void initItem(@aa1 ug6 r2, @aa1 QrcodeTypeInfo r3, int r4) {
        Intrinsics.X0O(r2, "holder");
        Intrinsics.X0O(r3, MapController.ITEM_LAYER_TAG);
        ((ImageView) r2.O00(R.id.iv)).setImageResource(r3.getIconResId());
        ((TextView) r2.O00(R.id.tv_left)).setText(r3.getName());
    }
}
