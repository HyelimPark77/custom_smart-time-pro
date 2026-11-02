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
        int r0 = R.id.devServerLl;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.devServerLl);
        if (r4 == null) goto L13;
        r0 = R.id.kaiServerLl;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.kaiServerLl);
        if (r5 == null) goto L13;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.taoServerLl;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.taoServerLl);
        if (r7 == null) goto L13;
        r0 = R.id.testServerLl;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.testServerLl);
        if (r8 == null) goto L13;
        return new ActivityTestServerSelectBinding(r3, r4, r5, r3, r7, r8);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityTestServerSelectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityTestServerSelectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_test_server_select, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
