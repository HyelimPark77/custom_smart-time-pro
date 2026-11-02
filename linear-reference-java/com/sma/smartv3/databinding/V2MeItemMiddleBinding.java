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
public final class V2MeItemMiddleBinding implements ViewBinding {

    @NonNull
    public final LinearLayout btGoal;

    @NonNull
    public final LinearLayout btUserInfo;

    @NonNull
    private final LinearLayout rootView;

    private V2MeItemMiddleBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout btGoal, @NonNull LinearLayout btUserInfo) {
        this.rootView = rootView;
        this.btGoal = btGoal;
        this.btUserInfo = btUserInfo;
    }

    @NonNull
    public static V2MeItemMiddleBinding bind(@NonNull View rootView) {
        int r0 = R.id.btGoal;
        LinearLayout r1 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btGoal);
        if (r1 == null) goto L9;
        r0 = R.id.btUserInfo;
        LinearLayout r2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btUserInfo);
        if (r2 == null) goto L9;
        return new V2MeItemMiddleBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static V2MeItemMiddleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2MeItemMiddleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_me_item_middle, parent, false);
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
