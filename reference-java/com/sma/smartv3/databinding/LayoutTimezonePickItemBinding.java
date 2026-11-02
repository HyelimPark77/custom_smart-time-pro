package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutTimezonePickItemBinding implements ViewBinding {

    @NonNull
    public final AppCompatCheckBox cbSelectedState;

    @NonNull
    public final AppCompatRadioButton rbSelectedState;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvName;

    @NonNull
    public final TextView tvTip;

    @NonNull
    public final TextView tvTitle;

    private LayoutTimezonePickItemBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatCheckBox cbSelectedState, @NonNull AppCompatRadioButton rbSelectedState, @NonNull TextView tvName, @NonNull TextView tvTip, @NonNull TextView tvTitle) {
        this.rootView = rootView;
        this.cbSelectedState = cbSelectedState;
        this.rbSelectedState = rbSelectedState;
        this.tvName = tvName;
        this.tvTip = tvTip;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static LayoutTimezonePickItemBinding bind(@NonNull View rootView) {
        int i = R.id.cbSelectedState;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cbSelectedState);
        if (appCompatCheckBox != null) {
            i = R.id.rbSelectedState;
            AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) ViewBindings.findChildViewById(rootView, R.id.rbSelectedState);
            if (appCompatRadioButton != null) {
                i = R.id.tvName;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvName);
                if (textView != null) {
                    i = R.id.tvTip;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvTip);
                    if (textView2 != null) {
                        i = R.id.tvTitle;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvTitle);
                        if (textView3 != null) {
                            return new LayoutTimezonePickItemBinding((RelativeLayout) rootView, appCompatCheckBox, appCompatRadioButton, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutTimezonePickItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutTimezonePickItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_timezone_pick_item, parent, false);
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
