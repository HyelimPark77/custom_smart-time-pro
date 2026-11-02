package com.sma.smartv3.p610ui.status;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p610ui.status.ElectrocardiogramDetailsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nElectrocardiogramDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectrocardiogramDetailsActivity.kt\ncom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n69#2,3:54\n72#2,5:58\n1#3:57\n*S KotlinDebug\n*F\n+ 1 ElectrocardiogramDetailsActivity.kt\ncom/sma/smartv3/ui/status/ElectrocardiogramDetailsActivity\n*L\n35#1:54,3\n35#1:58,5\n35#1:57\n*E\n"})
public final class ElectrocardiogramDetailsActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OX1O0ii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ElectrocardiogramDetailsActivity.abhTitleCenter_delegate$lambda$0(this.f3437IO);
        }
    });

    @aa1
    private final Lazy mEditEleSymptom$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii0IXO1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ElectrocardiogramDetailsActivity.mEditEleSymptom_delegate$lambda$0(this.f8522IO);
        }
    });

    @aa1
    private final Lazy mDeleteElectrocardiogram$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXXiIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ElectrocardiogramDetailsActivity.mDeleteElectrocardiogram_delegate$lambda$0(this.f5144IO);
        }
    });

    @aa1
    private final Lazy mDetailsLandscape$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiO0iO0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ElectrocardiogramDetailsActivity.mDetailsLandscape_delegate$lambda$0(this.f5292IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(ElectrocardiogramDetailsActivity electrocardiogramDetailsActivity) {
        return (PFMedium) electrocardiogramDetailsActivity.findViewById(R.id.abh_title_center);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    private final View getMDeleteElectrocardiogram() {
        return (View) this.mDeleteElectrocardiogram$delegate.getValue();
    }

    private final View getMDetailsLandscape() {
        return (View) this.mDetailsLandscape$delegate.getValue();
    }

    private final View getMEditEleSymptom() {
        return (View) this.mEditEleSymptom$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(ElectrocardiogramDetailsActivity electrocardiogramDetailsActivity, View view) {
        electrocardiogramDetailsActivity.startActivity(new Intent(electrocardiogramDetailsActivity, (Class<?>) EleDetailsLandscapeActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mDeleteElectrocardiogram_delegate$lambda$0(ElectrocardiogramDetailsActivity electrocardiogramDetailsActivity) {
        return electrocardiogramDetailsActivity.findViewById(R.id.ele_details_delete);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mDetailsLandscape_delegate$lambda$0(ElectrocardiogramDetailsActivity electrocardiogramDetailsActivity) {
        return electrocardiogramDetailsActivity.findViewById(R.id.ele_details_landscape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mEditEleSymptom_delegate$lambda$0(ElectrocardiogramDetailsActivity electrocardiogramDetailsActivity) {
        return electrocardiogramDetailsActivity.findViewById(R.id.edit_ele_symptom);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getAbhTitleCenter().setText(getString(R.string.electrocardiogram_measurement_details));
        getMDetailsLandscape().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.I1I1i0O1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ElectrocardiogramDetailsActivity.initView$lambda$0(this.f1384IO, view);
            }
        });
        getMEditEleSymptom().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X01IOI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ElectrocardiogramDetailsActivity.initView$lambda$1(view);
            }
        });
        getMDeleteElectrocardiogram().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.Oi11XiXX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ElectrocardiogramDetailsActivity.initView$lambda$2(view);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_electrocardiogram_data_details;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
