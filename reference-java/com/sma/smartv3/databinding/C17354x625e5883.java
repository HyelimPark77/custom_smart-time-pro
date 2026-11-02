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

/* JADX INFO: renamed from: com.sma.smartv3.databinding.EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazPylgebb27ActivityTyjzqk10Binding */
/* JADX INFO: loaded from: classes19.dex */
public final class C17354x625e5883 implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTextSmpffs;

    private C17354x625e5883(@NonNull LinearLayout rootView, @NonNull TextView tvTextSmpffs) {
        this.rootView = rootView;
        this.tvTextSmpffs = tvTextSmpffs;
    }

    @NonNull
    public static C17354x625e5883 bind(@NonNull View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_text_smpffs);
        if (textView != null) {
            return new C17354x625e5883((LinearLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tv_text_smpffs)));
    }

    @NonNull
    public static C17354x625e5883 inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static C17354x625e5883 inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.f53261x7e988c31, parent, false);
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
