package com.sma.smartv3.p610ui.status.item;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.w85;
import com.angcyo.dsladapter.DslViewHolder;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p610ui.status.StepActivity;
import com.sma.smartv3.p610ui.status.item.StepItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.StepProgressBar;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class StepItem extends MainStepItem {
    private StepProgressBar stepProgressBar;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(StepItem stepItem, View view) {
        if (w85.OXO1.OXO1()) {
            ContextCompat.startActivity(stepItem.getMContext(), new Intent(stepItem.getMContext(), (Class<?>) StepActivity.class), new Bundle());
        }
    }

    @Override // com.sma.smartv3.p610ui.status.item.MainStepItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        super.bindView(itemHolder);
        View viewM3483v = itemHolder.m3483v(R.id.stepPB);
        Intrinsics.XXI(viewM3483v);
        StepProgressBar stepProgressBar = (StepProgressBar) viewM3483v;
        this.stepProgressBar = stepProgressBar;
        if (stepProgressBar == null) {
            Intrinsics.XXO("stepProgressBar");
            stepProgressBar = null;
        }
        stepProgressBar.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ia5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StepItem.bindView$lambda$0(this.f8463IO, view);
            }
        });
    }

    @Override // com.sma.smartv3.p610ui.status.item.MainStepItem
    public void updateActivity() {
        super.updateActivity();
        StepProgressBar stepProgressBar = this.stepProgressBar;
        if (stepProgressBar == null) {
            Intrinsics.XXO("stepProgressBar");
            stepProgressBar = null;
        }
        Activity activity = getActivity();
        Intrinsics.XXI(activity);
        stepProgressBar.XO0O10(activity.getMStep(), BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.STEP_GOAL, 0, null, 6, null));
    }
}
