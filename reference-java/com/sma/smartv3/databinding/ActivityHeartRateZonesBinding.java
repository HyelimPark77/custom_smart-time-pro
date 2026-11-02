package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityHeartRateZonesBinding implements ViewBinding {

    @NonNull
    public final PFMedium hrValue1;

    @NonNull
    public final PFMedium hrValue2;

    @NonNull
    public final PFMedium hrValue3;

    @NonNull
    public final PFMedium hrValue4;

    @NonNull
    public final PFMedium hrValue5;

    @NonNull
    public final FrameLayout root;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final LinearLayout showHeartRateLl;

    @NonNull
    public final LinearLayout showHeartRateNullLl;

    private ActivityHeartRateZonesBinding(@NonNull FrameLayout rootView, @NonNull PFMedium hrValue1, @NonNull PFMedium hrValue2, @NonNull PFMedium hrValue3, @NonNull PFMedium hrValue4, @NonNull PFMedium hrValue5, @NonNull FrameLayout root, @NonNull LinearLayout showHeartRateLl, @NonNull LinearLayout showHeartRateNullLl) {
        this.rootView = rootView;
        this.hrValue1 = hrValue1;
        this.hrValue2 = hrValue2;
        this.hrValue3 = hrValue3;
        this.hrValue4 = hrValue4;
        this.hrValue5 = hrValue5;
        this.root = root;
        this.showHeartRateLl = showHeartRateLl;
        this.showHeartRateNullLl = showHeartRateNullLl;
    }

    @NonNull
    public static ActivityHeartRateZonesBinding bind(@NonNull View rootView) {
        int i = R.id.hr_value_1;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.hr_value_1);
        if (pFMedium != null) {
            i = R.id.hr_value_2;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.hr_value_2);
            if (pFMedium2 != null) {
                i = R.id.hr_value_3;
                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.hr_value_3);
                if (pFMedium3 != null) {
                    i = R.id.hr_value_4;
                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.hr_value_4);
                    if (pFMedium4 != null) {
                        i = R.id.hr_value_5;
                        PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.hr_value_5);
                        if (pFMedium5 != null) {
                            FrameLayout frameLayout = (FrameLayout) rootView;
                            i = R.id.show_heart_rate_ll;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.show_heart_rate_ll);
                            if (linearLayout != null) {
                                i = R.id.show_heart_rate_null_ll;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.show_heart_rate_null_ll);
                                if (linearLayout2 != null) {
                                    return new ActivityHeartRateZonesBinding(frameLayout, pFMedium, pFMedium2, pFMedium3, pFMedium4, pFMedium5, frameLayout, linearLayout, linearLayout2);
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
    public static ActivityHeartRateZonesBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityHeartRateZonesBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_heart_rate_zones, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
