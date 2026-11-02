package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class MarkerViewDeveloperGsensorBinding implements ViewBinding {

    @NonNull
    private final AppCompatTextView rootView;

    @NonNull
    public final AppCompatTextView tvContent;

    private MarkerViewDeveloperGsensorBinding(@NonNull AppCompatTextView rootView, @NonNull AppCompatTextView tvContent) {
        this.rootView = rootView;
        this.tvContent = tvContent;
    }

    @NonNull
    public static MarkerViewDeveloperGsensorBinding bind(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) rootView;
        return new MarkerViewDeveloperGsensorBinding(appCompatTextView, appCompatTextView);
    }

    @NonNull
    public static MarkerViewDeveloperGsensorBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static MarkerViewDeveloperGsensorBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.marker_view_developer_gsensor, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public AppCompatTextView getRoot() {
        return this.rootView;
    }
}
