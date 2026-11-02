package com.sma.smartv3.ui.sport.coach.item;

import android.view.View;
import android.widget.Button;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IiiOI1OO;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class CompletePlanItem extends BaseDslItem {
    private Button mButton;

    public CompletePlanItem() {
    }

    public static /* synthetic */ void O00(View r0) {
        initView$lambda$0(r0);
    }

    private static final void initView$lambda$0(View r2) {
        I01XX0.XIi00iiXO(I01XX0.XOIO11O, null, 2, null);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        View r3 = r2.v(R.id.coach_item_create_plan);
        Intrinsics.XXI(r3);
        this.mButton = (Button) r3;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        Button r0 = this.mButton;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mButton");
        r0 = null;
    L5:
        r0.setOnClickListener(new IiiOI1OO());
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.coach_item_complete;
    }
}
