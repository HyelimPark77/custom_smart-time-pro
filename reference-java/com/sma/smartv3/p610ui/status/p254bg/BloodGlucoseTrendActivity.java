package com.sma.smartv3.p610ui.status.p254bg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.base.BaseFragment;
import com.sma.smartv3.p610ui.status.fragment.BloodGlucose2MonthFragment;
import com.sma.smartv3.p610ui.status.p254bg.BloodGlucoseTrendActivity;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBloodGlucoseTrendActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseTrendActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseTrendActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,45:1\n104#2,9:46\n113#2,3:56\n99#2,3:59\n1#3:55\n1#3:65\n69#4,3:62\n72#4,5:66\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseTrendActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseTrendActivity\n*L\n34#1:46,9\n34#1:56,3\n34#1:59,3\n34#1:55\n43#1:65\n43#1:62,3\n43#1:66,5\n*E\n"})
public final class BloodGlucoseTrendActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XII1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucoseTrendActivity.abhTitleRight_delegate$lambda$0(this.f4507IO);
        }
    });
    private BloodGlucose2MonthFragment bloodGlucose2MonthFragment;

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(BloodGlucoseTrendActivity bloodGlucoseTrendActivity) {
        return (ImageView) bloodGlucoseTrendActivity.findViewById(R.id.abh_title_right);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.blood_glucose_trend);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_blood_glucose_record);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        BaseFragment.OXO1 oxo1 = BaseFragment.Companion;
        int mArg1 = getMArg1();
        Serializable mArg3 = getMArg3();
        Bundle bundle = new Bundle();
        BloodGlucose2MonthFragment bloodGlucose2MonthFragment = null;
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", mArg1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", mArg3);
        BaseFragment baseFragment = (BaseFragment) BloodGlucose2MonthFragment.class.newInstance();
        baseFragment.setArguments(bundle);
        if (baseFragment == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.status.fragment.BloodGlucose2MonthFragment");
        }
        this.bloodGlucose2MonthFragment = (BloodGlucose2MonthFragment) baseFragment;
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        BloodGlucose2MonthFragment bloodGlucose2MonthFragment2 = this.bloodGlucose2MonthFragment;
        if (bloodGlucose2MonthFragment2 == null) {
            Intrinsics.XXO("bloodGlucose2MonthFragment");
        } else {
            bloodGlucose2MonthFragment = bloodGlucose2MonthFragment2;
        }
        fragmentTransactionBeginTransaction.add(R.id.content, bloodGlucose2MonthFragment).commit();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_blood_glucose_trend;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) BloodGlucoseRecordActivity.class));
    }

    @aa1
    public final String setTitle() {
        String string = getString(R.string.blood_glucose);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }
}
