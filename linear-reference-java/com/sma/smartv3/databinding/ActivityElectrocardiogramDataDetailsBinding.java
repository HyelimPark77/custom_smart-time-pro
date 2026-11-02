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
        int r0 = R.id.edit_ele_symptom;
        TextView r4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.edit_ele_symptom);
        if (r4 == null) goto L11;
        r0 = R.id.ele_details_delete;
        TextView r5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ele_details_delete);
        if (r5 == null) goto L11;
        r0 = R.id.ele_details_landscape;
        View r6 = ViewBindings.findChildViewById(rootView, R.id.ele_details_landscape);
        if (r6 == null) goto L11;
        LinearLayout r3 = (LinearLayout) rootView;
        return new ActivityElectrocardiogramDataDetailsBinding(r3, r4, r5, r6, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityElectrocardiogramDataDetailsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityElectrocardiogramDataDetailsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_electrocardiogram_data_details, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
