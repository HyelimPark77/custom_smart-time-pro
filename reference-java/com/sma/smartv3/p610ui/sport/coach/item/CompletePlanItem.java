package com.sma.smartv3.p610ui.sport.coach.item;

import android.view.View;
import android.widget.Button;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class CompletePlanItem extends BaseDslItem {
    private Button mButton;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.coach_item_create_plan);
        Intrinsics.XXI(viewM3483v);
        this.mButton = (Button) viewM3483v;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        Button button = this.mButton;
        if (button == null) {
            Intrinsics.XXO("mButton");
            button = null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IiiOI1OO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                I01XX0.XIi00iiXO(I01XX0.XOIO11O, null, 2, null);
            }
        });
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.coach_item_complete;
    }
}
