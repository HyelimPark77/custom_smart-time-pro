package com.sma.smartv3.p610ui.device.guide;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.github.appintro.SlideSelectionListener;
import com.sma.smartv3.p610ui.device.guide.BloodGlucoseGuideFragment;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class BloodGlucoseGuideFragment extends BaseFragment implements SlideSelectionListener {
    private TextView tvNo;
    private TextView tvYes;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(BloodGlucoseGuideFragment bloodGlucoseGuideFragment, View view) {
        a01.OXO1.IiI10X().put(b01.I11X11OX, true);
        TextView textView = bloodGlucoseGuideFragment.tvYes;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.XXO("tvYes");
            textView = null;
        }
        textView.setBackgroundTintList(bloodGlucoseGuideFragment.getResources().getColorStateList(R.color.colorAccent));
        TextView textView3 = bloodGlucoseGuideFragment.tvNo;
        if (textView3 == null) {
            Intrinsics.XXO("tvNo");
        } else {
            textView2 = textView3;
        }
        textView2.setBackgroundTintList(bloodGlucoseGuideFragment.getResources().getColorStateList(R.color.light));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(BloodGlucoseGuideFragment bloodGlucoseGuideFragment, View view) {
        a01.OXO1.IiI10X().put(b01.I11X11OX, false);
        TextView textView = bloodGlucoseGuideFragment.tvYes;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.XXO("tvYes");
            textView = null;
        }
        textView.setBackgroundTintList(bloodGlucoseGuideFragment.getResources().getColorStateList(R.color.light));
        TextView textView3 = bloodGlucoseGuideFragment.tvNo;
        if (textView3 == null) {
            Intrinsics.XXO("tvNo");
        } else {
            textView2 = textView3;
        }
        textView2.setBackgroundTintList(bloodGlucoseGuideFragment.getResources().getColorStateList(R.color.colorAccent));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        View viewFindViewById = getMView().findViewById(R.id.tv_yes);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.tvYes = textView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.XXO("tvYes");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X1OI0O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodGlucoseGuideFragment.initView$lambda$0(this.f4299IO, view);
            }
        });
        View viewFindViewById2 = getMView().findViewById(R.id.tv_no);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        TextView textView3 = (TextView) viewFindViewById2;
        this.tvNo = textView3;
        if (textView3 == null) {
            Intrinsics.XXO("tvNo");
        } else {
            textView2 = textView3;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OXXIiiO10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodGlucoseGuideFragment.initView$lambda$1(this.f3542IO, view);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_app_guide_blood_glucose;
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
        boolean z = a01.OXO1.IiI10X().getBoolean(b01.I11X11OX, false);
        i1O0OXO1O.OXO1.OXO1("BloodGlucoseGuideFragment onSlideSelected isFamilyHistory = " + z);
        TextView textView = null;
        if (z) {
            TextView textView2 = this.tvYes;
            if (textView2 == null) {
                Intrinsics.XXO("tvYes");
                textView2 = null;
            }
            textView2.setBackgroundTintList(getResources().getColorStateList(R.color.colorAccent));
            TextView textView3 = this.tvNo;
            if (textView3 == null) {
                Intrinsics.XXO("tvNo");
            } else {
                textView = textView3;
            }
            textView.setBackgroundTintList(getResources().getColorStateList(R.color.light));
            return;
        }
        TextView textView4 = this.tvYes;
        if (textView4 == null) {
            Intrinsics.XXO("tvYes");
            textView4 = null;
        }
        textView4.setBackgroundTintList(getResources().getColorStateList(R.color.light));
        TextView textView5 = this.tvNo;
        if (textView5 == null) {
            Intrinsics.XXO("tvNo");
        } else {
            textView = textView5;
        }
        textView.setBackgroundTintList(getResources().getColorStateList(R.color.colorAccent));
    }
}
