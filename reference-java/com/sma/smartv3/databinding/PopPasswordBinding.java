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
        int i = R.id.action2;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.action2);
        if (pFMedium != null) {
            i = R.id.edt;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt);
            if (editText != null) {
                i = R.id.number_panel;
                GridLayout gridLayout = (GridLayout) ViewBindings.findChildViewById(rootView, R.id.number_panel);
                if (gridLayout != null) {
                    return new PopPasswordBinding((LinearLayout) rootView, pFMedium, editText, gridLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopPasswordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopPasswordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_password, parent, false);
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
