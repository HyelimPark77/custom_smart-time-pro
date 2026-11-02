package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemLanguageSelectBinding implements ViewBinding {

    @NonNull
    public final PFMedium languageName;

    @NonNull
    private final LinearLayout rootView;

    private ItemLanguageSelectBinding(@NonNull LinearLayout rootView, @NonNull PFMedium languageName) {
        this.rootView = rootView;
        this.languageName = languageName;
    }

    @NonNull
    public static ItemLanguageSelectBinding bind(@NonNull View rootView) {
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.languageName);
        if (r1 == null) goto L7;
        return new ItemLanguageSelectBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.languageName)));
    }

    @NonNull
    public static ItemLanguageSelectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemLanguageSelectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_language_select, parent, false);
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
