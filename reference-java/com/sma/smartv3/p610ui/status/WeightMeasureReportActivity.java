package com.sma.smartv3.p610ui.status;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.base.BaseFragment;
import com.sma.smartv3.p610ui.status.WeightMeasureReportActivity;
import com.sma.smartv3.p610ui.status.fragment.WeightMeasureFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWeightMeasureReportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightMeasureReportActivity.kt\ncom/sma/smartv3/ui/status/WeightMeasureReportActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n104#2,9:48\n113#2,3:58\n99#2,3:61\n1#3:57\n*S KotlinDebug\n*F\n+ 1 WeightMeasureReportActivity.kt\ncom/sma/smartv3/ui/status/WeightMeasureReportActivity\n*L\n33#1:48,9\n33#1:58,3\n33#1:61,3\n33#1:57\n*E\n"})
public final class WeightMeasureReportActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.d07
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureReportActivity.abhTitleCenter_delegate$lambda$0(this.f6100IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.e07
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightMeasureReportActivity.abhTitleRight_delegate$lambda$0(this.f6313IO);
        }
    });
    public WeightMeasureFragment weightMeasureFragment;

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(WeightMeasureReportActivity weightMeasureReportActivity) {
        return (PFMedium) weightMeasureReportActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(WeightMeasureReportActivity weightMeasureReportActivity) {
        return (ImageView) weightMeasureReportActivity.findViewById(R.id.abh_title_right);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    @aa1
    public final WeightMeasureFragment getWeightMeasureFragment() {
        WeightMeasureFragment weightMeasureFragment = this.weightMeasureFragment;
        if (weightMeasureFragment != null) {
            return weightMeasureFragment;
        }
        Intrinsics.XXO("weightMeasureFragment");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getAbhTitleCenter().setText(setTitle());
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_share);
        BaseFragment.OXO1 oxo1 = BaseFragment.Companion;
        int mArg1 = getMArg1();
        Serializable mArg3 = getMArg3();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", mArg1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", mArg3);
        BaseFragment baseFragment = (BaseFragment) WeightMeasureFragment.class.newInstance();
        baseFragment.setArguments(bundle);
        if (baseFragment == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.status.fragment.WeightMeasureFragment");
        }
        setWeightMeasureFragment((WeightMeasureFragment) baseFragment);
        getSupportFragmentManager().beginTransaction().add(R.id.content, getWeightMeasureFragment()).commit();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_weight_measure_report;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        getWeightMeasureFragment().share();
    }

    @aa1
    public final String setTitle() {
        String string = getString(R.string.measure_report);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }

    public final void setWeightMeasureFragment(@aa1 WeightMeasureFragment weightMeasureFragment) {
        Intrinsics.X0O(weightMeasureFragment, "<set-?>");
        this.weightMeasureFragment = weightMeasureFragment;
    }
}
