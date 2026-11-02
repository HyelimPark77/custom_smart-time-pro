package com.sma.smartv3.ui.device.guide;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.OXXIiiO10;
import com.android.mltcode.paycertificationapi.X1OI0O0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.github.appintro.SlideSelectionListener;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class BloodGlucoseGuideFragment extends BaseFragment implements SlideSelectionListener {
    private TextView tvNo;
    private TextView tvYes;

    public BloodGlucoseGuideFragment() {
    }

    public static /* synthetic */ void XIi00iiXO(BloodGlucoseGuideFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ void iO(BloodGlucoseGuideFragment r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    private static final void initView$lambda$0(BloodGlucoseGuideFragment r3, View r4) {
        a01.OXO1.IiI10X().put(b01.I11X11OX, true);
        TextView r5 = r3.tvYes;
        TextView r0 = null;
        if (r5 != null) goto L5;
        Intrinsics.XXO("tvYes");
        r5 = null;
    L5:
        r5.setBackgroundTintList(r3.getResources().getColorStateList(R.color.colorAccent));
        TextView r6 = r3.tvNo;
        if (r6 != null) goto L8;
        Intrinsics.XXO("tvNo");
    L9:
        r0.setBackgroundTintList(r3.getResources().getColorStateList(R.color.light));
        return;
    L8:
        r0 = r6;
        goto L9
    }

    private static final void initView$lambda$1(BloodGlucoseGuideFragment r3, View r4) {
        a01.OXO1.IiI10X().put(b01.I11X11OX, false);
        TextView r5 = r3.tvYes;
        TextView r0 = null;
        if (r5 != null) goto L5;
        Intrinsics.XXO("tvYes");
        r5 = null;
    L5:
        r5.setBackgroundTintList(r3.getResources().getColorStateList(R.color.light));
        TextView r6 = r3.tvNo;
        if (r6 != null) goto L8;
        Intrinsics.XXO("tvNo");
    L9:
        r0.setBackgroundTintList(r3.getResources().getColorStateList(R.color.colorAccent));
        return;
    L8:
        r0 = r6;
        goto L9
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        View r0 = getMView().findViewById(R.id.tv_yes);
        Intrinsics.O10IXXX0X(r0, "findViewById(...)");
        TextView r1 = (TextView) r0;
        this.tvYes = r1;
        TextView r2 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("tvYes");
        r1 = null;
    L5:
        r1.setOnClickListener(new X1OI0O0(this));
        View r3 = getMView().findViewById(R.id.tv_no);
        Intrinsics.O10IXXX0X(r3, "findViewById(...)");
        TextView r4 = (TextView) r3;
        this.tvNo = r4;
        if (r4 != null) goto L8;
        Intrinsics.XXO("tvNo");
    L9:
        r2.setOnClickListener(new OXXIiiO10(this));
        return;
    L8:
        r2 = r4;
        goto L9
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_app_guide_blood_glucose;
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
        boolean r0 = a01.OXO1.IiI10X().getBoolean(b01.I11X11OX, false);
        i1O0OXO1O.OXO1.OXO1("BloodGlucoseGuideFragment onSlideSelected isFamilyHistory = " + r0);
        TextView r5 = null;
        if (r0 == false) goto L13;
        TextView r1 = this.tvYes;
        if (r1 != null) goto L7;
        Intrinsics.XXO("tvYes");
        r1 = null;
    L7:
        r1.setBackgroundTintList(getResources().getColorStateList(R.color.colorAccent));
        TextView r2 = this.tvNo;
        if (r2 != null) goto L10;
        Intrinsics.XXO("tvNo");
    L11:
        r5.setBackgroundTintList(getResources().getColorStateList(R.color.light));
        return;
    L10:
        r5 = r2;
        goto L11
    L13:
        TextView r3 = this.tvYes;
        if (r3 != null) goto L16;
        Intrinsics.XXO("tvYes");
        r3 = null;
    L16:
        r3.setBackgroundTintList(getResources().getColorStateList(R.color.light));
        TextView r4 = this.tvNo;
        if (r4 != null) goto L19;
        Intrinsics.XXO("tvNo");
    L20:
        r5.setBackgroundTintList(getResources().getColorStateList(R.color.colorAccent));
        return;
    L19:
        r5 = r4;
        goto L20
    }
}
