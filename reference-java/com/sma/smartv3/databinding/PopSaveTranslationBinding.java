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
        int i = R.id.pop_save_edit;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.pop_save_edit);
        if (editText != null) {
            i = R.id.pop_translation_lan;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_lan);
            if (pFMedium != null) {
                i = R.id.pop_translation_time;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.pop_translation_time);
                if (textView != null) {
                    i = R.id.pop_translation_to_lan;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pop_translation_to_lan);
                    if (pFMedium2 != null) {
                        return new PopSaveTranslationBinding((LinearLayout) rootView, editText, pFMedium, textView, pFMedium2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopSaveTranslationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopSaveTranslationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_save_translation, parent, false);
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
