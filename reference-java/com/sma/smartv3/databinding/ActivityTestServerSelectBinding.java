package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityTestServerSelectBinding implements ViewBinding {

    @NonNull
    public final LinearLayout devServerLl;

    @NonNull
    public final LinearLayout kaiServerLl;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final LinearLayout taoServerLl;

    @NonNull
    public final LinearLayout testServerLl;

    private ActivityTestServerSelectBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout devServerLl, @NonNull LinearLayout kaiServerLl, @NonNull LinearLayout rootView, @NonNull LinearLayout taoServerLl, @NonNull LinearLayout testServerLl) {
        this.rootView_ = rootView_;
        this.devServerLl = devServerLl;
        this.kaiServerLl = kaiServerLl;
        this.rootView = rootView;
        this.taoServerLl = taoServerLl;
        this.testServerLl = testServerLl;
    }

    @NonNull
    public static ActivityTestServerSelectBinding bind(@NonNull View rootView) {
        int i = R.id.devServerLl;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.devServerLl);
        if (linearLayout != null) {
            i = R.id.kaiServerLl;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.kaiServerLl);
            if (linearLayout2 != null) {
                LinearLayout linearLayout3 = (LinearLayout) rootView;
                i = R.id.taoServerLl;
                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.taoServerLl);
                if (linearLayout4 != null) {
                    i = R.id.testServerLl;
                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.testServerLl);
                    if (linearLayout5 != null) {
                        return new ActivityTestServerSelectBinding(linearLayout3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityTestServerSelectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityTestServerSelectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_test_server_select, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
