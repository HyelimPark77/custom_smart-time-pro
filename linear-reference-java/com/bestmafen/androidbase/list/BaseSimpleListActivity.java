package com.bestmafen.androidbase.list;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iXOO0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseSimpleListActivity<T> extends BaseListActivity<T> {
    public BaseSimpleListActivity() {
    }

    public static /* synthetic */ void OIX0iXi(BaseSimpleListActivity r0, AdapterView r1, View r2, int r3, long r4) {
        initView$lambda$0(r0, r1, r2, r3, r4);
    }

    private static final void initView$lambda$0(BaseSimpleListActivity r0, AdapterView r1, View r2, int r3, long r4) {
        r0.onItemClick(r3, r0.getMList().get(r3));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public void initItem(@aa1 ug6 r1, T r2, int r3) {
        Intrinsics.X0O(r1, "holder");
        View r4 = r1.XIi00iiXO();
        Intrinsics.X1ii(r4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) r4).setText(String.valueOf(r2));
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getMListView().setOnItemClickListener(new iXOO0(this));
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.simple_list_item_1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return com.bestmafen.androidbase.R.layout.activity_list;
    }

    public abstract void onItemClick(int r1, T r2);
}
