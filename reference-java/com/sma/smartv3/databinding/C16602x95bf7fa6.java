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

/* JADX INFO: renamed from: com.sma.smartv3.databinding.EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazJjqlltc71ActivityAfdyxv21Binding */
/* JADX INFO: loaded from: classes19.dex */
public final class C16602x95bf7fa6 implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTextDcjapy;

    private C16602x95bf7fa6(@NonNull LinearLayout rootView, @NonNull TextView tvTextDcjapy) {
        this.rootView = rootView;
        this.tvTextDcjapy = tvTextDcjapy;
    }

    @NonNull
    public static C16602x95bf7fa6 bind(@NonNull View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_text_dcjapy);
        if (textView != null) {
            return new C16602x95bf7fa6((LinearLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tv_text_dcjapy)));
    }

    @NonNull
    public static C16602x95bf7fa6 inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static C16602x95bf7fa6 inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.f52509x1c61316e, parent, false);
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
