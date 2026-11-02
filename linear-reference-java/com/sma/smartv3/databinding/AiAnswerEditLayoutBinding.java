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
        int r0 = R.id.item_edit;
        EditText r1 = (EditText) ViewBindings.findChildViewById(rootView, R.id.item_edit);
        if (r1 == null) goto L9;
        r0 = R.id.item_edit_clear;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_edit_clear);
        if (r2 == null) goto L9;
        return new AiAnswerEditLayoutBinding((RelativeLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static AiAnswerEditLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static AiAnswerEditLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.ai_answer_edit_layout, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
