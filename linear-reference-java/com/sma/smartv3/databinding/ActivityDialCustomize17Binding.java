package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.dial.DialElementView;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDialCustomize17Binding implements ViewBinding {

    @NonNull
    public final DialElementView controlViewCa;

    @NonNull
    public final DialElementView controlViewDis;

    @NonNull
    public final DialElementView controlViewHr;

    @NonNull
    public final DialElementView controlViewStep;

    @NonNull
    public final ImageViewRound customizeDialBg;

    @NonNull
    public final NestedScrollView nestedScrollView;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final Button saveDial;

    @NonNull
    public final DialElementView timeDigitalView;

    @NonNull
    public final ImageView timePointView;

    @NonNull
    public final ImageView timeScaleView;

    private ActivityDialCustomize17Binding(@NonNull LinearLayout rootView_, @NonNull DialElementView controlViewCa, @NonNull DialElementView controlViewDis, @NonNull DialElementView controlViewHr, @NonNull DialElementView controlViewStep, @NonNull ImageViewRound customizeDialBg, @NonNull NestedScrollView nestedScrollView, @NonNull LinearLayout rootView, @NonNull Button saveDial, @NonNull DialElementView timeDigitalView, @NonNull ImageView timePointView, @NonNull ImageView timeScaleView) {
        this.rootView_ = rootView_;
        this.controlViewCa = controlViewCa;
        this.controlViewDis = controlViewDis;
        this.controlViewHr = controlViewHr;
        this.controlViewStep = controlViewStep;
        this.customizeDialBg = customizeDialBg;
        this.nestedScrollView = nestedScrollView;
        this.rootView = rootView;
        this.saveDial = saveDial;
        this.timeDigitalView = timeDigitalView;
        this.timePointView = timePointView;
        this.timeScaleView = timeScaleView;
    }

    @NonNull
    public static ActivityDialCustomize17Binding bind(@NonNull View rootView) {
        int r0 = R.id.controlViewCa;
        DialElementView r4 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewCa);
        if (r4 == null) goto L25;
        r0 = R.id.controlViewDis;
        DialElementView r5 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewDis);
        if (r5 == null) goto L25;
        r0 = R.id.controlViewHr;
        DialElementView r6 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewHr);
        if (r6 == null) goto L25;
        r0 = R.id.controlViewStep;
        DialElementView r7 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewStep);
        if (r7 == null) goto L25;
        r0 = R.id.customizeDialBg;
        ImageViewRound r8 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.customizeDialBg);
        if (r8 == null) goto L25;
        r0 = R.id.nestedScrollView;
        NestedScrollView r9 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.nestedScrollView);
        if (r9 == null) goto L25;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.saveDial;
        Button r11 = (Button) ViewBindings.findChildViewById(rootView, R.id.saveDial);
        if (r11 == null) goto L25;
        r0 = R.id.timeDigitalView;
        DialElementView r12 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.timeDigitalView);
        if (r12 == null) goto L25;
        r0 = R.id.timePointView;
        ImageView r13 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.timePointView);
        if (r13 == null) goto L25;
        r0 = R.id.timeScaleView;
        ImageView r14 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.timeScaleView);
        if (r14 == null) goto L25;
        return new ActivityDialCustomize17Binding(r3, r4, r5, r6, r7, r8, r9, r3, r11, r12, r13, r14);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDialCustomize17Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDialCustomize17Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_dial_customize_17, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
