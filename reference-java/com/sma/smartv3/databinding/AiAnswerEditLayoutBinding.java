package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class AiAnswerEditLayoutBinding implements ViewBinding {

    @NonNull
    public final EditText itemEdit;

    @NonNull
    public final PFMedium itemEditClear;

    @NonNull
    private final RelativeLayout rootView;

    private AiAnswerEditLayoutBinding(@NonNull RelativeLayout rootView, @NonNull EditText itemEdit, @NonNull PFMedium itemEditClear) {
        this.rootView = rootView;
        this.itemEdit = itemEdit;
        this.itemEditClear = itemEditClear;
    }

    @NonNull
    public static AiAnswerEditLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.item_edit;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.item_edit);
        if (editText != null) {
            i = R.id.item_edit_clear;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_edit_clear);
            if (pFMedium != null) {
                return new AiAnswerEditLayoutBinding((RelativeLayout) rootView, editText, pFMedium);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static AiAnswerEditLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AiAnswerEditLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.ai_answer_edit_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
