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

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final ImageView f51171iv;

    @NonNull
    public final LinearLayout llLevelPanel;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: tv */
    @NonNull
    public final DINCondBold f51172tv;

    private ItemWeightReportLevelBinding(@NonNull LinearLayout rootView, @NonNull ImageView iv, @NonNull LinearLayout llLevelPanel, @NonNull DINCondBold tv) {
        this.rootView = rootView;
        this.f51171iv = iv;
        this.llLevelPanel = llLevelPanel;
        this.f51172tv = tv;
    }

    @NonNull
    public static ItemWeightReportLevelBinding bind(@NonNull View rootView) {
        int i = R.id.f51417iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.f51423tv);
            if (dINCondBold != null) {
                return new ItemWeightReportLevelBinding(linearLayout, imageView, linearLayout, dINCondBold);
            }
            i = R.id.f51423tv;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemWeightReportLevelBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemWeightReportLevelBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_weight_report_level, parent, false);
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
