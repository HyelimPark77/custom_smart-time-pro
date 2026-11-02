package com.bestmafen.androidbase.dsl;

import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.IXOX01OOX;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iO0IXOIi;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseDslItem extends DslAdapterItem {
    private final boolean initEvent;

    public BaseDslItem() {
        setItemLayoutId(layoutId());
        setItemViewAttachedToWindow(new iO0IXOIi(this));
        setItemViewDetachedToWindow(new IXOX01OOX(this));
    }

    public static /* synthetic */ Unit XO0O10(BaseDslItem r0, DslViewHolder r1, int r2) {
        return _init_$lambda$0(r0, r1, r2);
    }

    private static final Unit _init_$lambda$0(BaseDslItem r1, DslViewHolder r2, int r3) {
        Intrinsics.X0O(r2, "itemHolder");
        super.onItemViewAttachedToWindow(r2, r3);
        r1.onAttach(r2, r3);
        return Unit.OXO1;
    }

    private static final Unit _init_$lambda$1(BaseDslItem r1, DslViewHolder r2, int r3) {
        Intrinsics.X0O(r2, "itemHolder");
        super.onItemViewDetachedToWindow(r2, r3);
        r1.onDetach(r2, r3);
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit iO(BaseDslItem r0, DslViewHolder r1, int r2) {
        return _init_$lambda$1(r0, r1, r2);
    }

    public abstract void bindView(@aa1 DslViewHolder r1);

    public boolean getInitEvent() {
        return this.initEvent;
    }

    public abstract void initView();

    public abstract int layoutId();

    @CallSuper
    public void onAttach(@aa1 DslViewHolder r1, int r2) {
        Intrinsics.X0O(r1, "itemHolder");
        initView();     // Catch: Exception -> L5
    L8:
        if (getInitEvent() == false) goto L13;
        O11XO1X.XO0O10().X1ii(this);
        return;
    L13:
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L8
    }

    public void onDetach(@aa1 DslViewHolder r1, int r2) {
        Intrinsics.X0O(r1, "itemHolder");
        if (getInitEvent() == false) goto L6;
        O11XO1X.XO0O10().OiIIX101O(this);
        return;
    }

    @Override // com.angcyo.dsladapter.DslAdapterItem
    @CallSuper
    public void onItemBind(@aa1 DslViewHolder r2, int r3, @aa1 DslAdapterItem r4) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "adapterItem");
        super.onItemBind(r2, r3, r4);
        bindView(r2);
    }
}
