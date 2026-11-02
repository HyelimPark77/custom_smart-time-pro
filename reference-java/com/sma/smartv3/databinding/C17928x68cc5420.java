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

/* JADX INFO: renamed from: com.sma.smartv3.databinding.EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazVithiqe120ActivityWdwcil11Binding */
/* JADX INFO: loaded from: classes19.dex */
public final class C17928x68cc5420 implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTextDxiroc;

    private C17928x68cc5420(@NonNull LinearLayout rootView, @NonNull TextView tvTextDxiroc) {
        this.rootView = rootView;
        this.tvTextDxiroc = tvTextDxiroc;
    }

    @NonNull
    public static C17928x68cc5420 bind(@NonNull View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_text_dxiroc);
        if (textView != null) {
            return new C17928x68cc5420((LinearLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tv_text_dxiroc)));
    }

    @NonNull
    public static C17928x68cc5420 inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static C17928x68cc5420 inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.f53835x301be8ba, parent, false);
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
