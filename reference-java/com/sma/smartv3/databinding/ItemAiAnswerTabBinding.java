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

    /* JADX INFO: renamed from: tv */
    @NonNull
    public final TextView f51127tv;

    private ItemAiAnswerTabBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout llItemPanel, @NonNull TextView tv) {
        this.rootView = rootView;
        this.llItemPanel = llItemPanel;
        this.f51127tv = tv;
    }

    @NonNull
    public static ItemAiAnswerTabBinding bind(@NonNull View rootView) {
        RelativeLayout relativeLayout = (RelativeLayout) rootView;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.f51423tv);
        if (textView != null) {
            return new ItemAiAnswerTabBinding(relativeLayout, relativeLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.f51423tv)));
    }

    @NonNull
    public static ItemAiAnswerTabBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemAiAnswerTabBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_ai_answer_tab, parent, false);
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
