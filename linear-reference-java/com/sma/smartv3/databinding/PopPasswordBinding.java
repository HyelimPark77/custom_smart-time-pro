package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class PopPasswordBinding implements ViewBinding {

    @NonNull
    public final PFMedium action2;

    @NonNull
    public final EditText edt;

    @NonNull
    public final GridLayout numberPanel;

    @NonNull
    private final LinearLayout rootView;

    private PopPasswordBinding(@NonNull LinearLayout rootView, @NonNull PFMedium action2, @NonNull EditText edt, @NonNull GridLayout numberPanel) {
        this.rootView = rootView;
        this.action2 = action2;
        this.edt = edt;
        this.numberPanel = numberPanel;
    }

    @NonNull
    public static PopPasswordBinding bind(@NonNull View rootView) {
        int r0 = R.id.action2;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.action2);
        if (r1 == null) goto L11;
        r0 = R.id.edt;
        EditText r2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt);
        if (r2 == null) goto L11;
        r0 = R.id.number_panel;
        GridLayout r3 = (GridLayout) ViewBindings.findChildViewById(rootView, R.id.number_panel);
        if (r3 == null) goto L11;
        return new PopPasswordBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopPasswordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopPasswordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_password, parent, false);
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
