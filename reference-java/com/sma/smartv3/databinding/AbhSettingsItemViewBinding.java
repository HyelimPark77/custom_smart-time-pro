package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class AbhSettingsItemViewBinding implements ViewBinding {

    @NonNull
    public final View bottomLine;

    @NonNull
    public final EditText edtValue;

    @NonNull
    public final ImageView ivEnter;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final View topLine;

    @NonNull
    public final PFMedium tvLabel;

    @NonNull
    public final PFMedium tvValue;

    private AbhSettingsItemViewBinding(@NonNull LinearLayout rootView, @NonNull View bottomLine, @NonNull EditText edtValue, @NonNull ImageView ivEnter, @NonNull View topLine, @NonNull PFMedium tvLabel, @NonNull PFMedium tvValue) {
        this.rootView = rootView;
        this.bottomLine = bottomLine;
        this.edtValue = edtValue;
        this.ivEnter = ivEnter;
        this.topLine = topLine;
        this.tvLabel = tvLabel;
        this.tvValue = tvValue;
    }

    @NonNull
    public static AbhSettingsItemViewBinding bind(@NonNull View rootView) {
        int i = R.id.bottom_line;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bottom_line);
        if (viewFindChildViewById != null) {
            i = R.id.edt_value;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt_value);
            if (editText != null) {
                i = R.id.iv_enter;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_enter);
                if (imageView != null) {
                    i = R.id.top_line;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.top_line);
                    if (viewFindChildViewById2 != null) {
                        i = R.id.tv_label;
                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_label);
                        if (pFMedium != null) {
                            i = R.id.tv_value;
                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_value);
                            if (pFMedium2 != null) {
                                return new AbhSettingsItemViewBinding((LinearLayout) rootView, viewFindChildViewById, editText, imageView, viewFindChildViewById2, pFMedium, pFMedium2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static AbhSettingsItemViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AbhSettingsItemViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.abh_settings_item_view, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
