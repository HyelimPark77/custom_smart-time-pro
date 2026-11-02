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

/* JADX INFO: loaded from: classes19.dex */
public final class PopEditBinding implements ViewBinding {

    @NonNull
    public final EditText edt;

    @NonNull
    private final LinearLayout rootView;

    private PopEditBinding(@NonNull LinearLayout rootView, @NonNull EditText edt) {
        this.rootView = rootView;
        this.edt = edt;
    }

    @NonNull
    public static PopEditBinding bind(@NonNull View rootView) {
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt);
        if (editText != null) {
            return new PopEditBinding((LinearLayout) rootView, editText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.edt)));
    }

    @NonNull
    public static PopEditBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopEditBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_edit, parent, false);
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
