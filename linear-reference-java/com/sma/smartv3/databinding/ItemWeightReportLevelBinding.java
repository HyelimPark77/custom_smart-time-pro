package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemWeightReportLevelBinding implements ViewBinding {

    @NonNull
    public final ImageView iv;

    @NonNull
    public final LinearLayout llLevelPanel;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final DINCondBold tv;

    private ItemWeightReportLevelBinding(@NonNull LinearLayout rootView, @NonNull ImageView iv, @NonNull LinearLayout llLevelPanel, @NonNull DINCondBold tv) {
        this.rootView = rootView;
        this.iv = iv;
        this.llLevelPanel = llLevelPanel;
        this.tv = tv;
    }

    @NonNull
    public static ItemWeightReportLevelBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv;
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r1 == null) goto L10;
        LinearLayout r2 = (LinearLayout) rootView;
        DINCondBold r3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv);
        if (r3 != null) goto L7;
        r0 = R.id.tv;
        goto L10
    L7:
        return new ItemWeightReportLevelBinding(r2, r1, r2, r3);
    L10:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemWeightReportLevelBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemWeightReportLevelBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_weight_report_level, parent, false);
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
