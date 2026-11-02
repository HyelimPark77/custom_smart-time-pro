package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityQiblaMethodBinding implements ViewBinding {

    @NonNull
    public final ListView listView;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityQiblaMethodBinding(@NonNull LinearLayout rootView, @NonNull ListView listView, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.listView = listView;
        this.root = root;
    }

    @NonNull
    public static ActivityQiblaMethodBinding bind(@NonNull View rootView) {
        ListView r1 = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r1 == null) goto L7;
        LinearLayout r2 = (LinearLayout) rootView;
        return new ActivityQiblaMethodBinding(r2, r1, r2);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.list_view)));
    }

    @NonNull
    public static ActivityQiblaMethodBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityQiblaMethodBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_qibla_method, parent, false);
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
