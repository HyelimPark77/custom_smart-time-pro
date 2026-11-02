package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class AiAnswerDescribeBinding implements ViewBinding {

    @NonNull
    public final PFMedium aiAnswerEtDescribe;

    @NonNull
    private final FrameLayout rootView;

    private AiAnswerDescribeBinding(@NonNull FrameLayout rootView, @NonNull PFMedium aiAnswerEtDescribe) {
        this.rootView = rootView;
        this.aiAnswerEtDescribe = aiAnswerEtDescribe;
    }

    @NonNull
    public static AiAnswerDescribeBinding bind(@NonNull View rootView) {
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.ai_answer_et_describe);
        if (r1 == null) goto L7;
        return new AiAnswerDescribeBinding((FrameLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.ai_answer_et_describe)));
    }

    @NonNull
    public static AiAnswerDescribeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static AiAnswerDescribeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.ai_answer_describe, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
