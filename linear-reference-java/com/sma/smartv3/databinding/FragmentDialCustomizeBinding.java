package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentDialCustomizeBinding implements ViewBinding {

    @NonNull
    public final LinearLayout itemCustomize;

    @NonNull
    public final LinearLayout itemVideo;

    @NonNull
    public final ScrollView rootView;

    @NonNull
    private final ScrollView rootView_;

    @NonNull
    public final TextView tvDialCustomizeDesc;

    private FragmentDialCustomizeBinding(@NonNull ScrollView rootView_, @NonNull LinearLayout itemCustomize, @NonNull LinearLayout itemVideo, @NonNull ScrollView rootView, @NonNull TextView tvDialCustomizeDesc) {
        this.rootView_ = rootView_;
        this.itemCustomize = itemCustomize;
        this.itemVideo = itemVideo;
        this.rootView = rootView;
        this.tvDialCustomizeDesc = tvDialCustomizeDesc;
    }

    @NonNull
    public static FragmentDialCustomizeBinding bind(@NonNull View rootView) {
        int r0 = R.id.item_customize;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.item_customize);
        if (r4 == null) goto L11;
        r0 = R.id.item_video;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.item_video);
        if (r5 == null) goto L11;
        ScrollView r3 = (ScrollView) rootView;
        r0 = R.id.tv_dial_customize_desc;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_dial_customize_desc);
        if (r7 == null) goto L11;
        return new FragmentDialCustomizeBinding(r3, r4, r5, r3, r7);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentDialCustomizeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentDialCustomizeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_dial_customize, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.rootView_;
    }
}
