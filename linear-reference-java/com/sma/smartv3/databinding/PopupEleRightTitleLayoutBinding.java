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
public final class PopupEleRightTitleLayoutBinding implements ViewBinding {

    @NonNull
    public final PFMedium eleDescribe;

    @NonNull
    public final PFMedium eleOperatingGuide;

    @NonNull
    public final PFMedium eleSynchronousRecording;

    @NonNull
    private final LinearLayout rootView;

    private PopupEleRightTitleLayoutBinding(@NonNull LinearLayout rootView, @NonNull PFMedium eleDescribe, @NonNull PFMedium eleOperatingGuide, @NonNull PFMedium eleSynchronousRecording) {
        this.rootView = rootView;
        this.eleDescribe = eleDescribe;
        this.eleOperatingGuide = eleOperatingGuide;
        this.eleSynchronousRecording = eleSynchronousRecording;
    }

    @NonNull
    public static PopupEleRightTitleLayoutBinding bind(@NonNull View rootView) {
        int r0 = R.id.ele_describe;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ele_describe);
        if (r1 == null) goto L11;
        r0 = R.id.ele_operating_guide;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ele_operating_guide);
        if (r2 == null) goto L11;
        r0 = R.id.ele_synchronous_recording;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ele_synchronous_recording);
        if (r3 == null) goto L11;
        return new PopupEleRightTitleLayoutBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopupEleRightTitleLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopupEleRightTitleLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.popup_ele_right_title_layout, parent, false);
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
