package com.bestmafen.androidbase.list;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.bestmafen.androidbase.C4238R;
import com.bestmafen.androidbase.list.BaseSimpleListActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseSimpleListActivity<T> extends BaseListActivity<T> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(BaseSimpleListActivity baseSimpleListActivity, AdapterView adapterView, View view, int i, long j) {
        baseSimpleListActivity.onItemClick(i, baseSimpleListActivity.getMList().get(i));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2740np
    public void initItem(@aa1 ug6 holder, T t, int i) {
        Intrinsics.X0O(holder, "holder");
        View viewXIi00iiXO = holder.XIi00iiXO();
        Intrinsics.X1ii(viewXIi00iiXO, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewXIi00iiXO).setText(String.valueOf(t));
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getMListView().setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.android.mltcode.paycertificationapi.iXOO0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                BaseSimpleListActivity.initView$lambda$0(this.f8367IO, adapterView, view, i, j);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return R.layout.simple_list_item_1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return C4238R.layout.activity_list;
    }

    public abstract void onItemClick(int i, T t);
}
