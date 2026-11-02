package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityElectrocardiogramDataDetailsBinding implements ViewBinding {

    @NonNull
    public final TextView editEleSymptom;

    @NonNull
    public final TextView eleDetailsDelete;

    @NonNull
    public final View eleDetailsLandscape;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityElectrocardiogramDataDetailsBinding(@NonNull LinearLayout rootView, @NonNull TextView editEleSymptom, @NonNull TextView eleDetailsDelete, @NonNull View eleDetailsLandscape, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.editEleSymptom = editEleSymptom;
        this.eleDetailsDelete = eleDetailsDelete;
        this.eleDetailsLandscape = eleDetailsLandscape;
        this.root = root;
    }

    @NonNull
    public static ActivityElectrocardiogramDataDetailsBinding bind(@NonNull View rootView) {
        int i = R.id.edit_ele_symptom;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.edit_ele_symptom);
        if (textView != null) {
            i = R.id.ele_details_delete;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ele_details_delete);
            if (textView2 != null) {
                i = R.id.ele_details_landscape;
                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.ele_details_landscape);
                if (viewFindChildViewById != null) {
                    LinearLayout linearLayout = (LinearLayout) rootView;
                    return new ActivityElectrocardiogramDataDetailsBinding(linearLayout, textView, textView2, viewFindChildViewById, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityElectrocardiogramDataDetailsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityElectrocardiogramDataDetailsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_electrocardiogram_data_details, parent, false);
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
