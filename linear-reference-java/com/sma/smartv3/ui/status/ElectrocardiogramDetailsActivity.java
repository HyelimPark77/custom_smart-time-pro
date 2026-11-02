package com.sma.smartv3.ui.status;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.android.mltcode.paycertificationapi.I1I1i0O1;
import com.android.mltcode.paycertificationapi.OX1O0ii;
import com.android.mltcode.paycertificationapi.Oi11XiXX;
import com.android.mltcode.paycertificationapi.X01IOI;
import com.android.mltcode.paycertificationapi.XXXiIO;
import com.android.mltcode.paycertificationapi.XiO0iO0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ii0IXO1i;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nElectrocardiogramDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectrocardiogramDetailsActivity.kt\ncom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n69#2,3:54\n72#2,5:58\n1#3:57\n*S KotlinDebug\n*F\n+ 1 ElectrocardiogramDetailsActivity.kt\ncom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity\n*L\n35#1:54,3\n35#1:58,5\n35#1:57\n*E\n"})
public final class ElectrocardiogramDetailsActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy mDeleteElectrocardiogram$delegate;

    @aa1
    private final Lazy mDetailsLandscape$delegate;

    @aa1
    private final Lazy mEditEleSymptom$delegate;

    public ElectrocardiogramDetailsActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new OX1O0ii(this));
        this.mEditEleSymptom$delegate = LazyKt__LazyJVMKt.iO(new ii0IXO1i(this));
        this.mDeleteElectrocardiogram$delegate = LazyKt__LazyJVMKt.iO(new XXXiIO(this));
        this.mDetailsLandscape$delegate = LazyKt__LazyJVMKt.iO(new XiO0iO0(this));
    }

    public static /* synthetic */ View I0iXXO(ElectrocardiogramDetailsActivity r0) {
        return mDeleteElectrocardiogram_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View I1XOi1(ElectrocardiogramDetailsActivity r0) {
        return mEditEleSymptom_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium O10IXXX0X(ElectrocardiogramDetailsActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OIX0iXi(View r0) {
        initView$lambda$2(r0);
    }

    public static /* synthetic */ View X0O(ElectrocardiogramDetailsActivity r0) {
        return mDetailsLandscape_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(View r0) {
        initView$lambda$1(r0);
    }

    public static /* synthetic */ void XXI(ElectrocardiogramDetailsActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(ElectrocardiogramDetailsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    private final View getMDeleteElectrocardiogram() {
        return (View) getValue();
    }

    private final View getMDetailsLandscape() {
        return (View) getValue();
    }

    private final View getMEditEleSymptom() {
        return (View) getValue();
    }

    private static final void initView$lambda$0(ElectrocardiogramDetailsActivity r1, View r2) {
        r1.startActivity(new Intent(r1, EleDetailsLandscapeActivity.class));
    }

    private static final void initView$lambda$1(View r0) {
    }

    private static final void initView$lambda$2(View r0) {
    }

    private static final View mDeleteElectrocardiogram_delegate$lambda$0(ElectrocardiogramDetailsActivity r1) {
        return r1.findViewById(R.id.ele_details_delete);
    }

    private static final View mDetailsLandscape_delegate$lambda$0(ElectrocardiogramDetailsActivity r1) {
        return r1.findViewById(R.id.ele_details_landscape);
    }

    private static final View mEditEleSymptom_delegate$lambda$0(ElectrocardiogramDetailsActivity r1) {
        return r1.findViewById(R.id.edit_ele_symptom);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAbhTitleCenter().setText(getString(R.string.electrocardiogram_measurement_details));
        getMDetailsLandscape().setOnClickListener(new I1I1i0O1(this));
        getMEditEleSymptom().setOnClickListener(new X01IOI());
        getMDeleteElectrocardiogram().setOnClickListener(new Oi11XiXX());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_electrocardiogram_data_details;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
