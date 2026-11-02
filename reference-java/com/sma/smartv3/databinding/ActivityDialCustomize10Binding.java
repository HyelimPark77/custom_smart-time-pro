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
public final class ActivityDialCustomize10Binding implements ViewBinding {

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

    private ActivityDialCustomize10Binding(@NonNull LinearLayout rootView_, @NonNull DialElementView controlViewCa, @NonNull DialElementView controlViewDis, @NonNull DialElementView controlViewHr, @NonNull DialElementView controlViewStep, @NonNull ImageViewRound customizeDialBg, @NonNull NestedScrollView nestedScrollView, @NonNull LinearLayout rootView, @NonNull Button saveDial, @NonNull DialElementView timeDigitalView, @NonNull ImageView timePointView, @NonNull ImageView timeScaleView) {
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
    public static ActivityDialCustomize10Binding bind(@NonNull View rootView) {
        int i = R.id.controlViewCa;
        DialElementView dialElementView = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewCa);
        if (dialElementView != null) {
            i = R.id.controlViewDis;
            DialElementView dialElementView2 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewDis);
            if (dialElementView2 != null) {
                i = R.id.controlViewHr;
                DialElementView dialElementView3 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewHr);
                if (dialElementView3 != null) {
                    i = R.id.controlViewStep;
                    DialElementView dialElementView4 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewStep);
                    if (dialElementView4 != null) {
                        i = R.id.customizeDialBg;
                        ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.customizeDialBg);
                        if (imageViewRound != null) {
                            i = R.id.nestedScrollView;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.nestedScrollView);
                            if (nestedScrollView != null) {
                                LinearLayout linearLayout = (LinearLayout) rootView;
                                i = R.id.saveDial;
                                Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.saveDial);
                                if (button != null) {
                                    i = R.id.timeDigitalView;
                                    DialElementView dialElementView5 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.timeDigitalView);
                                    if (dialElementView5 != null) {
                                        i = R.id.timePointView;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.timePointView);
                                        if (imageView != null) {
                                            i = R.id.timeScaleView;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.timeScaleView);
                                            if (imageView2 != null) {
                                                return new ActivityDialCustomize10Binding(linearLayout, dialElementView, dialElementView2, dialElementView3, dialElementView4, imageViewRound, nestedScrollView, linearLayout, button, dialElementView5, imageView, imageView2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityDialCustomize10Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDialCustomize10Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_dial_customize_10, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
