package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.TimeView;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemAlarmBinding implements ViewBinding {

    @NonNull
    public final AppCompatCheckBox checkEnabled;

    @NonNull
    public final RelativeLayout itemPanel;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TimeView timeView;

    @NonNull
    public final PFMedium tvRepeat;

    @NonNull
    public final PFMedium tvTag;

    private ItemAlarmBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatCheckBox checkEnabled, @NonNull RelativeLayout itemPanel, @NonNull TimeView timeView, @NonNull PFMedium tvRepeat, @NonNull PFMedium tvTag) {
        this.rootView = rootView;
        this.checkEnabled = checkEnabled;
        this.itemPanel = itemPanel;
        this.timeView = timeView;
        this.tvRepeat = tvRepeat;
        this.tvTag = tvTag;
    }

    @NonNull
    public static ItemAlarmBinding bind(@NonNull View rootView) {
        int r0 = R.id.check_enabled;
        AppCompatCheckBox r4 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_enabled);
        if (r4 == null) goto L13;
        RelativeLayout r3 = (RelativeLayout) rootView;
        r0 = R.id.time_view;
        TimeView r6 = (TimeView) ViewBindings.findChildViewById(rootView, R.id.time_view);
        if (r6 == null) goto L13;
        r0 = R.id.tv_repeat;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_repeat);
        if (r7 == null) goto L13;
        r0 = R.id.tv_tag;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tag);
        if (r8 == null) goto L13;
        return new ItemAlarmBinding(r3, r4, r3, r6, r7, r8);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemAlarmBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemAlarmBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_alarm, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
