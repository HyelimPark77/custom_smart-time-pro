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
        int i = R.id.ele_describe;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ele_describe);
        if (pFMedium != null) {
            i = R.id.ele_operating_guide;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ele_operating_guide);
            if (pFMedium2 != null) {
                i = R.id.ele_synchronous_recording;
                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ele_synchronous_recording);
                if (pFMedium3 != null) {
                    return new PopupEleRightTitleLayoutBinding((LinearLayout) rootView, pFMedium, pFMedium2, pFMedium3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopupEleRightTitleLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopupEleRightTitleLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.popup_ele_right_title_layout, parent, false);
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
