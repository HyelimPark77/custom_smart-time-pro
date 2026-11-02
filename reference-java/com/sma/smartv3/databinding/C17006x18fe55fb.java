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

/* JADX INFO: renamed from: com.sma.smartv3.databinding.EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazMpbrnc2ActivityMlaizf5Binding */
/* JADX INFO: loaded from: classes19.dex */
public final class C17006x18fe55fb implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTextDdaykw;

    private C17006x18fe55fb(@NonNull LinearLayout rootView, @NonNull TextView tvTextDdaykw) {
        this.rootView = rootView;
        this.tvTextDdaykw = tvTextDdaykw;
    }

    @NonNull
    public static C17006x18fe55fb bind(@NonNull View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_text_ddaykw);
        if (textView != null) {
            return new C17006x18fe55fb((LinearLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tv_text_ddaykw)));
    }

    @NonNull
    public static C17006x18fe55fb inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static C17006x18fe55fb inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.f52913x5797c07b, parent, false);
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
