package com.sma.smartv3.ui.status.bg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import com.android.mltcode.paycertificationapi.XII1i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.base.BaseFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.fragment.BloodGlucose2MonthFragment;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBloodGlucoseTrendActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseTrendActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseTrendActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,45:1\n104#2,9:46\n113#2,3:56\n99#2,3:59\n1#3:55\n1#3:65\n69#4,3:62\n72#4,5:66\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseTrendActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseTrendActivity\n*L\n34#1:46,9\n34#1:56,3\n34#1:59,3\n34#1:55\n43#1:65\n43#1:62,3\n43#1:66,5\n*E\n"})
public final class BloodGlucoseTrendActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleRight$delegate;
    private BloodGlucose2MonthFragment bloodGlucose2MonthFragment;

    public BloodGlucoseTrendActivity() {
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new XII1i(this));
    }

    public static /* synthetic */ ImageView OIX0iXi(BloodGlucoseTrendActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(BloodGlucoseTrendActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.blood_glucose_trend);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_blood_glucose_record);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        BaseFragment.OXO1 r0 = BaseFragment.Companion;
        int r1 = getMArg1();
        Serializable r2 = getMArg3();
        Bundle r3 = new Bundle();
        BloodGlucose2MonthFragment r4 = null;
        r3.putString("mArg0", null);
        r3.putInt("mArg1", r1);
        r3.putParcelable("mArg2", null);
        r3.putSerializable("mArg3", r2);
        BaseFragment r5 = (BaseFragment) BloodGlucose2MonthFragment.class.newInstance();
        r5.setArguments(r3);
        if (r5 == null) goto L11;
        this.bloodGlucose2MonthFragment = (BloodGlucose2MonthFragment) r5;
        FragmentTransaction r6 = getSupportFragmentManager().beginTransaction();
        BloodGlucose2MonthFragment r7 = this.bloodGlucose2MonthFragment;
        if (r7 != null) goto L7;
        Intrinsics.XXO("bloodGlucose2MonthFragment");
    L8:
        r6.add(R.id.content, r4).commit();
        return;
    L7:
        r4 = r7;
        goto L8
    L11:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.status.fragment.BloodGlucose2MonthFragment");
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_blood_glucose_trend;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, BloodGlucoseRecordActivity.class));
    }

    @aa1
    public final String setTitle() {
        String r0 = getString(R.string.blood_glucose);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }
}
