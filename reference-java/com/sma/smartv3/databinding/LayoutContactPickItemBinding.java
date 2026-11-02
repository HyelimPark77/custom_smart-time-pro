package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.p610ui.contactpicker.RoundLetterView;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutContactPickItemBinding implements ViewBinding {

    @NonNull
    public final AppCompatCheckBox cbSelectedState;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvContactName;

    @NonNull
    public final TextView tvNumber;

    @NonNull
    public final RoundLetterView vRoundLetterView;

    private LayoutContactPickItemBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatCheckBox cbSelectedState, @NonNull TextView tvContactName, @NonNull TextView tvNumber, @NonNull RoundLetterView vRoundLetterView) {
        this.rootView = rootView;
        this.cbSelectedState = cbSelectedState;
        this.tvContactName = tvContactName;
        this.tvNumber = tvNumber;
        this.vRoundLetterView = vRoundLetterView;
    }

    @NonNull
    public static LayoutContactPickItemBinding bind(@NonNull View rootView) {
        int i = R.id.cbSelectedState;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cbSelectedState);
        if (appCompatCheckBox != null) {
            i = R.id.tvContactName;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvContactName);
            if (textView != null) {
                i = R.id.tvNumber;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvNumber);
                if (textView2 != null) {
                    i = R.id.vRoundLetterView;
                    RoundLetterView roundLetterView = (RoundLetterView) ViewBindings.findChildViewById(rootView, R.id.vRoundLetterView);
                    if (roundLetterView != null) {
                        return new LayoutContactPickItemBinding((RelativeLayout) rootView, appCompatCheckBox, textView, textView2, roundLetterView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutContactPickItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutContactPickItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_contact_pick_item, parent, false);
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
