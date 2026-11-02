package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemAiAnswerTabBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout llItemPanel;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tv;

    private ItemAiAnswerTabBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout llItemPanel, @NonNull TextView tv) {
        this.rootView = rootView;
        this.llItemPanel = llItemPanel;
        this.tv = tv;
    }

    @NonNull
    public static ItemAiAnswerTabBinding bind(@NonNull View rootView) {
        RelativeLayout r0 = (RelativeLayout) rootView;
        TextView r2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv);
        if (r2 == null) goto L7;
        return new ItemAiAnswerTabBinding(r0, r0, r2);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tv)));
    }

    @NonNull
    public static ItemAiAnswerTabBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemAiAnswerTabBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_ai_answer_tab, parent, false);
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
