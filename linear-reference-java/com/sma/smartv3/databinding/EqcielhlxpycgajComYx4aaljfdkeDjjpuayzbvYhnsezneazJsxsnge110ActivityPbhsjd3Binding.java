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
public final class EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazJsxsnge110ActivityPbhsjd3Binding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTextLsawbv;

    private EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazJsxsnge110ActivityPbhsjd3Binding(@NonNull LinearLayout rootView, @NonNull TextView tvTextLsawbv) {
        this.rootView = rootView;
        this.tvTextLsawbv = tvTextLsawbv;
    }

    @NonNull
    public static EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazJsxsnge110ActivityPbhsjd3Binding bind(@NonNull View rootView) {
        TextView r1 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_text_lsawbv);
        if (r1 == null) goto L7;
        return new EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazJsxsnge110ActivityPbhsjd3Binding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tv_text_lsawbv)));
    }

    @NonNull
    public static EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazJsxsnge110ActivityPbhsjd3Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static EqcielhlxpycgajComYx4aaljfdkeDjjpuayzbvYhnsezneazJsxsnge110ActivityPbhsjd3Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.eqcielhlxpycgaj_com_yx4aaljfdke_djjpuayzbv_yhnsezneaz_jsxsnge110_activity_pbhsjd3, parent, false);
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
