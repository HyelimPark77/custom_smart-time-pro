package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: renamed from: com.sma.smartv3.databinding.EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazKzweqyd102ActivityFhrzua0Binding */
/* JADX INFO: loaded from: classes19.dex */
public final class C16743x971c0a0f implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTextArqovq;

    private C16743x971c0a0f(@NonNull LinearLayout rootView, @NonNull TextView tvTextArqovq) {
        this.rootView = rootView;
        this.tvTextArqovq = tvTextArqovq;
    }

    @NonNull
    public static C16743x971c0a0f bind(@NonNull View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_text_arqovq);
        if (textView != null) {
            return new C16743x971c0a0f((LinearLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tv_text_arqovq)));
    }

    @NonNull
    public static C16743x971c0a0f inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static C16743x971c0a0f inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.f52650xb9adb1a1, parent, false);
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
