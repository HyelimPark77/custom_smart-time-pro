package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class DialogUserNoLoginBinding implements ViewBinding {

    @NonNull
    public final Button confirmBt;

    @NonNull
    private final LinearLayout rootView;

    private DialogUserNoLoginBinding(@NonNull LinearLayout rootView, @NonNull Button confirmBt) {
        this.rootView = rootView;
        this.confirmBt = confirmBt;
    }

    @NonNull
    public static DialogUserNoLoginBinding bind(@NonNull View rootView) {
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.confirmBt);
        if (button != null) {
            return new DialogUserNoLoginBinding((LinearLayout) rootView, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.confirmBt)));
    }

    @NonNull
    public static DialogUserNoLoginBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DialogUserNoLoginBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.dialog_user_no_login, parent, false);
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
