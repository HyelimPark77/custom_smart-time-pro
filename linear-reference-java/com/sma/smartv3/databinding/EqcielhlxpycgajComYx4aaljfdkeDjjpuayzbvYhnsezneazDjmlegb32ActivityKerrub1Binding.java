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

/* JADX INFO: loaded from: classes19.dex */
public final class EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazDjmlegb32ActivityKerrub1Binding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTextJslacl;

    private EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazDjmlegb32ActivityKerrub1Binding(@NonNull LinearLayout rootView, @NonNull TextView tvTextJslacl) {
        this.rootView = rootView;
        this.tvTextJslacl = tvTextJslacl;
    }

    @NonNull
    public static EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazDjmlegb32ActivityKerrub1Binding bind(@NonNull View rootView) {
        TextView r1 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_text_jslacl);
        if (r1 == null) goto L7;
        return new EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazDjmlegb32ActivityKerrub1Binding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tv_text_jslacl)));
    }

    @NonNull
    public static EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazDjmlegb32ActivityKerrub1Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazDjmlegb32ActivityKerrub1Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.eqcielhlxpycgaj_com_yx4aaljfdke_djjpuayzbv_yhnsezneaz_djmlegb32_activity_kerrub1, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
