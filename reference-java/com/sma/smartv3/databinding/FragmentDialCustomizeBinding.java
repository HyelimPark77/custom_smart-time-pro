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
        int i = R.id.item_customize;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.item_customize);
        if (linearLayout != null) {
            i = R.id.item_video;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.item_video);
            if (linearLayout2 != null) {
                ScrollView scrollView = (ScrollView) rootView;
                i = R.id.tv_dial_customize_desc;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_dial_customize_desc);
                if (textView != null) {
                    return new FragmentDialCustomizeBinding(scrollView, linearLayout, linearLayout2, scrollView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDialCustomizeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentDialCustomizeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_dial_customize, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.rootView_;
    }
}
