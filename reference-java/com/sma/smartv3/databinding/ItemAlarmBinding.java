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
        int i = R.id.check_enabled;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_enabled);
        if (appCompatCheckBox != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView;
            i = R.id.time_view;
            TimeView timeView = (TimeView) ViewBindings.findChildViewById(rootView, R.id.time_view);
            if (timeView != null) {
                i = R.id.tv_repeat;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_repeat);
                if (pFMedium != null) {
                    i = R.id.tv_tag;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tag);
                    if (pFMedium2 != null) {
                        return new ItemAlarmBinding(relativeLayout, appCompatCheckBox, relativeLayout, timeView, pFMedium, pFMedium2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemAlarmBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemAlarmBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_alarm, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
