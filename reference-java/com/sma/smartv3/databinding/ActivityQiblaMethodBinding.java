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
        ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (listView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.list_view)));
        }
        LinearLayout linearLayout = (LinearLayout) rootView;
        return new ActivityQiblaMethodBinding(linearLayout, listView, linearLayout);
    }

    @NonNull
    public static ActivityQiblaMethodBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityQiblaMethodBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_qibla_method, parent, false);
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
