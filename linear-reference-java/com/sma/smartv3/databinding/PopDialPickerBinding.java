package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PopDialPickerBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rv;

    private PopDialPickerBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView rv) {
        this.rootView = rootView;
        this.rv = rv;
    }

    @NonNull
    public static PopDialPickerBinding bind(@NonNull View rootView) {
        RecyclerView r1 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r1 == null) goto L7;
        return new PopDialPickerBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.rv)));
    }

    @NonNull
    public static PopDialPickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopDialPickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_dial_picker, parent, false);
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
