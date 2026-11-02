package com.sma.smartv3.ui.status.item;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ia5;
import com.android.mltcode.paycertificationapi.w85;
import com.angcyo.dsladapter.DslViewHolder;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.StepActivity;
import com.sma.smartv3.view.StepProgressBar;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class StepItem extends MainStepItem {
    private StepProgressBar stepProgressBar;

    public StepItem() {
    }

    public static /* synthetic */ void I0IIOi(StepItem r0, View r1) {
        bindView$lambda$0(r0, r1);
    }

    private static final void bindView$lambda$0(StepItem r2, View r3) {
        if (w85.OXO1.OXO1() == false) goto L6;
        ContextCompat.startActivity(r2.getMContext(), new Intent(r2.getMContext(), StepActivity.class), new Bundle());
        return;
    }

    @Override // com.sma.smartv3.ui.status.item.MainStepItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        super.bindView(r2);
        View r3 = r2.v(R.id.stepPB);
        Intrinsics.XXI(r3);
        StepProgressBar r4 = (StepProgressBar) r3;
        this.stepProgressBar = r4;
        if (r4 != null) goto L5;
        Intrinsics.XXO("stepProgressBar");
        r4 = null;
    L5:
        r4.setOnClickListener(new ia5(this));
    }

    @Override // com.sma.smartv3.ui.status.item.MainStepItem
    public void updateActivity() {
        super.updateActivity();
        StepProgressBar r0 = this.stepProgressBar;
        if (r0 != null) goto L5;
        Intrinsics.XXO("stepProgressBar");
        r0 = null;
    L5:
        Activity r1 = getActivity();
        Intrinsics.XXI(r1);
        r0.XO0O10(r1.getMStep(), BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.STEP_GOAL, 0, null, 6, null));
    }
}
