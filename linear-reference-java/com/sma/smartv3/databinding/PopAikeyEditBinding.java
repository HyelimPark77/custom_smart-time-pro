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
        int r0 = R.id.edt;
        EditText r1 = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt);
        if (r1 == null) goto L9;
        r0 = R.id.tv_right_top;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_right_top);
        if (r2 == null) goto L9;
        return new PopAikeyEditBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopAikeyEditBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopAikeyEditBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_aikey_edit, parent, false);
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
