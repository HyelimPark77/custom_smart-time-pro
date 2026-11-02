package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class PopSaveTranslationBinding implements ViewBinding {

    @NonNull
    public final EditText popSaveEdit;

    @NonNull
    public final PFMedium popTranslationLan;

    @NonNull
    public final TextView popTranslationTime;

    @NonNull
    public final PFMedium popTranslationToLan;

    @NonNull
    private final LinearLayout rootView;

    private PopSaveTranslationBinding(@NonNull LinearLayout rootView, @NonNull EditText popSaveEdit, @NonNull PFMedium popTranslationLan, @NonNull TextView popTranslationTime, @NonNull PFMedium popTranslationToLan) {
        this.rootView = rootView;
        this.popSaveEdit = popSaveEdit;
        this.popTranslationLan = popTranslationLan;
        this.popTranslationTime = popTranslationTime;
        this.popTranslationToLan = popTranslationToLan;
    }

    @NonNull
    public static PopSaveTranslationBinding bind(@NonNull View rootView) {
        int r0 = R.id.pop_save_edit;
        EditText r4 = (EditText) ViewBindings.findChildViewById(rootView, R.id.pop_save_edit);
        if (r4 == null) goto L13;
        r0 = R.id.pop_translation_lan;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_lan);
        if (r5 == null) goto L13;
        r0 = R.id.pop_translation_time;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.pop_translation_time);
        if (r6 == null) goto L13;
        r0 = R.id.pop_translation_to_lan;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_to_lan);
        if (r7 == null) goto L13;
        return new PopSaveTranslationBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopSaveTranslationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopSaveTranslationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_save_translation, parent, false);
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
