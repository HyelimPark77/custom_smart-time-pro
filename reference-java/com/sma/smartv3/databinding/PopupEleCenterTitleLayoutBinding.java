package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class PopupEleCenterTitleLayoutBinding implements ViewBinding {

    @NonNull
    public final PFMedium eleAllRecord;

    @NonNull
    public final PFMedium eleSymptomRecord;

    @NonNull
    private final LinearLayout rootView;

    private PopupEleCenterTitleLayoutBinding(@NonNull LinearLayout rootView, @NonNull PFMedium eleAllRecord, @NonNull PFMedium eleSymptomRecord) {
        this.rootView = rootView;
        this.eleAllRecord = eleAllRecord;
        this.eleSymptomRecord = eleSymptomRecord;
    }

    @NonNull
    public static PopupEleCenterTitleLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.ele_all_record;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ele_all_record);
        if (pFMedium != null) {
            i = R.id.ele_symptom_record;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ele_symptom_record);
            if (pFMedium2 != null) {
                return new PopupEleCenterTitleLayoutBinding((LinearLayout) rootView, pFMedium, pFMedium2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopupEleCenterTitleLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopupEleCenterTitleLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.popup_ele_center_title_layout, parent, false);
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
