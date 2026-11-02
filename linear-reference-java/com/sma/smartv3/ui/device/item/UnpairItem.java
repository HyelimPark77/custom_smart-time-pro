package com.sma.smartv3.ui.device.item;

import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.v86;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleConnector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class UnpairItem extends BaseDslItem {

    @tb1
    private Function0<Unit> mOnUnbindListener;

    public UnpairItem() {
    }

    public static /* synthetic */ void O00(UnpairItem r0, View r1) {
        bindView$lambda$0(r0, r1);
    }

    private static final void bindView$lambda$0(UnpairItem r0, View r1) {
        Function0<Unit> r2 = r0.mOnUnbindListener;
        if (r2 == null) goto L6;
        r2.invoke();
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        View r3 = r2.view(R.id.btn_bottom);
        if (r3 == null) goto L6;
        r3.setOnClickListener(new v86(this));
        return;
    }

    @tb1
    public final Function0<Unit> getMOnUnbindListener() {
        return this.mOnUnbindListener;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!BleConnector.INSTANCE.isBound());
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_unpair;
    }

    public final void setMOnUnbindListener(@tb1 Function0<Unit> r1) {
        this.mOnUnbindListener = r1;
    }
}
