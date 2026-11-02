package com.sma.smartv3.p610ui.device.item;

import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.p610ui.device.item.UnpairItem;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleConnector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class UnpairItem extends BaseDslItem {

    @tb1
    private Function0<Unit> mOnUnbindListener;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(UnpairItem unpairItem, View view) {
        Function0<Unit> function0 = unpairItem.mOnUnbindListener;
        if (function0 != null) {
            function0.invoke2();
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View view = itemHolder.view(R.id.btn_bottom);
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.v86
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UnpairItem.bindView$lambda$0(this.f11675IO, view2);
                }
            });
        }
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

    public final void setMOnUnbindListener(@tb1 Function0<Unit> function0) {
        this.mOnUnbindListener = function0;
    }
}
