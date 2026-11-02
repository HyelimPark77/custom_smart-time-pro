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
import com.sma.smartv3.view.text.FontTextView;

/* JADX INFO: loaded from: classes19.dex */
public final class PopEditSecurityCodeBinding implements ViewBinding {

    @NonNull
    public final EditText edt;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final FontTextView tvContent;

    private PopEditSecurityCodeBinding(@NonNull LinearLayout rootView, @NonNull EditText edt, @NonNull FontTextView tvContent) {
        this.rootView = rootView;
        this.edt = edt;
        this.tvContent = tvContent;
    }

    @NonNull
    public static PopEditSecurityCodeBinding bind(@NonNull View rootView) {
        int r0 = R.id.edt;
        EditText r1 = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt);
        if (r1 == null) goto L9;
        r0 = R.id.tv_content;
        FontTextView r2 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_content);
        if (r2 == null) goto L9;
        return new PopEditSecurityCodeBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopEditSecurityCodeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopEditSecurityCodeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_edit_security_code, parent, false);
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
