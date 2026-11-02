package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButton;
import com.sma.smartv3.view.SquareImageView;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemDialF3Binding implements ViewBinding {

    @NonNull
    public final FrameLayout itemDialNewLl;

    @NonNull
    public final SquareImageView iv;

    @NonNull
    public final ProgressButton pb;

    @NonNull
    private final LinearLayout rootView;

    private ItemDialF3Binding(@NonNull LinearLayout rootView, @NonNull FrameLayout itemDialNewLl, @NonNull SquareImageView iv, @NonNull ProgressButton pb) {
        this.rootView = rootView;
        this.itemDialNewLl = itemDialNewLl;
        this.iv = iv;
        this.pb = pb;
    }

    @NonNull
    public static ItemDialF3Binding bind(@NonNull View rootView) {
        int r0 = R.id.item_dial_new_ll;
        FrameLayout r1 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.item_dial_new_ll);
        if (r1 == null) goto L11;
        r0 = R.id.iv;
        SquareImageView r2 = (SquareImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r2 == null) goto L11;
        r0 = R.id.pb;
        ProgressButton r3 = (ProgressButton) ViewBindings.findChildViewById(rootView, R.id.pb);
        if (r3 == null) goto L11;
        return new ItemDialF3Binding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemDialF3Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemDialF3Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_dial_f3, parent, false);
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
