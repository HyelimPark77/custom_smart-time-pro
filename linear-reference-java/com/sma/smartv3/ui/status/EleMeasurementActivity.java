package com.sma.smartv3.ui.status;

import android.os.Bundle;
import android.view.View;
import com.android.mltcode.paycertificationapi.XOi0O10I;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EleMeasurementActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    public EleMeasurementActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new XOi0O10I(this));
    }

    public static /* synthetic */ PFMedium OIX0iXi(EleMeasurementActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(EleMeasurementActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAbhTitleCenter().setText(getString(R.string.electrocardiogram_measurement_title));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_electrocardiogram_measurement;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
    }
}
