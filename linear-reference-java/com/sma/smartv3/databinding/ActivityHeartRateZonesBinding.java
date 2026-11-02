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
        int r0 = R.id.hr_value_1;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.hr_value_1);
        if (r4 == null) goto L19;
        r0 = R.id.hr_value_2;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.hr_value_2);
        if (r5 == null) goto L19;
        r0 = R.id.hr_value_3;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.hr_value_3);
        if (r6 == null) goto L19;
        r0 = R.id.hr_value_4;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.hr_value_4);
        if (r7 == null) goto L19;
        r0 = R.id.hr_value_5;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.hr_value_5);
        if (r8 == null) goto L19;
        FrameLayout r3 = (FrameLayout) rootView;
        r0 = R.id.show_heart_rate_ll;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.show_heart_rate_ll);
        if (r10 == null) goto L19;
        r0 = R.id.show_heart_rate_null_ll;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.show_heart_rate_null_ll);
        if (r11 == null) goto L19;
        return new ActivityHeartRateZonesBinding(r3, r4, r5, r6, r7, r8, r3, r10, r11);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityHeartRateZonesBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityHeartRateZonesBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_heart_rate_zones, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
