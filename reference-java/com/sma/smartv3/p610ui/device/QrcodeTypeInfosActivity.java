package com.sma.smartv3.p610ui.device;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.sma.smartv3.model.QrcodeTypeInfo;
import com.sma.smartv3.p610ui.device.QrcodeTypeInfosActivity;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nQrcodeTypeInfosActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QrcodeTypeInfosActivity.kt\ncom/sma/smartv3/ui/device/QrcodeTypeInfosActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n87#2,7:48\n94#2,3:56\n70#2,7:59\n97#2:66\n1#3:55\n*S KotlinDebug\n*F\n+ 1 QrcodeTypeInfosActivity.kt\ncom/sma/smartv3/ui/device/QrcodeTypeInfosActivity\n*L\n31#1:48,7\n31#1:56,3\n31#1:59,7\n31#1:66\n31#1:55\n*E\n"})
public final class QrcodeTypeInfosActivity extends BaseListActivity<QrcodeTypeInfo> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(QrcodeTypeInfosActivity qrcodeTypeInfosActivity, AdapterView adapterView, View view, int i, long j) {
        QrcodeTypeInfo qrcodeTypeInfo = qrcodeTypeInfosActivity.getMList().get(i);
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", qrcodeTypeInfo);
        Intent intent = new Intent(qrcodeTypeInfosActivity, (Class<?>) QrcodeSyncActivity.class);
        intent.putExtras(bundle);
        qrcodeTypeInfosActivity.startActivity(intent);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<QrcodeTypeInfo> initList() {
        return q62.OXO1.IOX1(this, getMArg1());
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(getMArg1() == 1 ? R.string.receipt_code : R.string.my_card_code);
        getMListView().setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.android.mltcode.paycertificationapi.qa2
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                QrcodeTypeInfosActivity.initView$lambda$0(this.f10565IO, adapterView, view, i, j);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return R.layout.item_code_type;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_qrcode_type_infos;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2740np
    public void initItem(@aa1 ug6 holder, @aa1 QrcodeTypeInfo item, int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        ((ImageView) holder.O00(R.id.f51417iv)).setImageResource(item.getIconResId());
        ((TextView) holder.O00(R.id.tv_left)).setText(item.getName());
    }
}
