package com.bestmafen.androidbase.dsl;

import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseDslItem extends DslAdapterItem {
    private final boolean initEvent;

    public BaseDslItem() {
        setItemLayoutId(layoutId());
        setItemViewAttachedToWindow(new Function2() { // from class: com.android.mltcode.paycertificationapi.iO0IXOIi
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj, Object obj2) {
                return BaseDslItem._init_$lambda$0(this.f7992IO, (DslViewHolder) obj, ((Integer) obj2).intValue());
            }
        });
        setItemViewDetachedToWindow(new Function2() { // from class: com.android.mltcode.paycertificationapi.IXOX01OOX
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj, Object obj2) {
                return BaseDslItem._init_$lambda$1(this.f2071IO, (DslViewHolder) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(BaseDslItem baseDslItem, DslViewHolder itemHolder, int i) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        super.onItemViewAttachedToWindow(itemHolder, i);
        baseDslItem.onAttach(itemHolder, i);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(BaseDslItem baseDslItem, DslViewHolder itemHolder, int i) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        super.onItemViewDetachedToWindow(itemHolder, i);
        baseDslItem.onDetach(itemHolder, i);
        return Unit.OXO1;
    }

    public abstract void bindView(@aa1 DslViewHolder dslViewHolder);

    public boolean getInitEvent() {
        return this.initEvent;
    }

    public abstract void initView();

    public abstract int layoutId();

    @CallSuper
    public void onAttach(@aa1 DslViewHolder itemHolder, int i) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        try {
            initView();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (getInitEvent()) {
            O11XO1X.XO0O10().X1ii(this);
        }
    }

    public void onDetach(@aa1 DslViewHolder itemHolder, int i) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        if (getInitEvent()) {
            O11XO1X.XO0O10().OiIIX101O(this);
        }
    }

    @Override // com.angcyo.dsladapter.DslAdapterItem
    @CallSuper
    public void onItemBind(@aa1 DslViewHolder itemHolder, int i, @aa1 DslAdapterItem adapterItem) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(adapterItem, "adapterItem");
        super.onItemBind(itemHolder, i, adapterItem);
        bindView(itemHolder);
    }
}
