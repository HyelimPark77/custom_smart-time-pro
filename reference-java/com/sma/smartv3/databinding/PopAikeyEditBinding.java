package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class PopAikeyEditBinding implements ViewBinding {

    @NonNull
    public final EditText edt;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvRightTop;

    private PopAikeyEditBinding(@NonNull LinearLayout rootView, @NonNull EditText edt, @NonNull PFMedium tvRightTop) {
        this.rootView = rootView;
        this.edt = edt;
        this.tvRightTop = tvRightTop;
    }

    @NonNull
    public static PopAikeyEditBinding bind(@NonNull View rootView) {
        int i = R.id.edt;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt);
        if (editText != null) {
            i = R.id.tv_right_top;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_right_top);
            if (pFMedium != null) {
                return new PopAikeyEditBinding((LinearLayout) rootView, editText, pFMedium);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopAikeyEditBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopAikeyEditBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_aikey_edit, parent, false);
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
