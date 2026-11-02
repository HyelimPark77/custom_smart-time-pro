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
        int i = R.id.edt;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt);
        if (editText != null) {
            i = R.id.tv_content;
            FontTextView fontTextView = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_content);
            if (fontTextView != null) {
                return new PopEditSecurityCodeBinding((LinearLayout) rootView, editText, fontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopEditSecurityCodeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopEditSecurityCodeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_edit_security_code, parent, false);
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
