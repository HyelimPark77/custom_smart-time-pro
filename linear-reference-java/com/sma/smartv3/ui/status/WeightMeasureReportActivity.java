package com.sma.smartv3.ui.status;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.d07;
import com.android.mltcode.paycertificationapi.e07;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.base.BaseFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.fragment.WeightMeasureFragment;
import com.sma.smartv3.view.text.PFMedium;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWeightMeasureReportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightMeasureReportActivity.kt\ncom/sma/smartv3/ui/status/WeightMeasureReportActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n104#2,9:48\n113#2,3:58\n99#2,3:61\n1#3:57\n*S KotlinDebug\n*F\n+ 1 WeightMeasureReportActivity.kt\ncom/sma/smartv3/ui/status/WeightMeasureReportActivity\n*L\n33#1:48,9\n33#1:58,3\n33#1:61,3\n33#1:57\n*E\n"})
public final class WeightMeasureReportActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;
    public WeightMeasureFragment weightMeasureFragment;

    public WeightMeasureReportActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new d07(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new e07(this));
    }

    public static /* synthetic */ ImageView I0iXXO(WeightMeasureReportActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OIX0iXi(WeightMeasureReportActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(WeightMeasureReportActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(WeightMeasureReportActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    @aa1
    public final WeightMeasureFragment getWeightMeasureFragment() {
        WeightMeasureFragment r0 = this.weightMeasureFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("weightMeasureFragment");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAbhTitleCenter().setText(setTitle());
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_share);
        BaseFragment.OXO1 r0 = BaseFragment.Companion;
        int r1 = getMArg1();
        Serializable r2 = getMArg3();
        Bundle r3 = new Bundle();
        r3.putString("mArg0", null);
        r3.putInt("mArg1", r1);
        r3.putParcelable("mArg2", null);
        r3.putSerializable("mArg3", r2);
        BaseFragment r4 = (BaseFragment) WeightMeasureFragment.class.newInstance();
        r4.setArguments(r3);
        if (r4 == null) goto L7;
        setWeightMeasureFragment((WeightMeasureFragment) r4);
        getSupportFragmentManager().beginTransaction().add(R.id.content, getWeightMeasureFragment()).commit();
        return;
    L7:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.status.fragment.WeightMeasureFragment");
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_weight_measure_report;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        getWeightMeasureFragment().share();
    }

    @aa1
    public final String setTitle() {
        String r0 = getString(R.string.measure_report);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }

    public final void setWeightMeasureFragment(@aa1 WeightMeasureFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.weightMeasureFragment = r2;
    }
}
