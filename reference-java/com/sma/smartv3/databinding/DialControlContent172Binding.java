package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class DialControlContent172Binding implements ViewBinding {

    @NonNull
    public final LinearLayout controlContent;

    @NonNull
    public final ImageView controlDelete;

    @NonNull
    public final ImageView controlIv;

    @NonNull
    public final RelativeLayout controlRoot;

    @NonNull
    private final RelativeLayout rootView;

    /* JADX INFO: renamed from: tv */
    @NonNull
    public final TextView f51103tv;

    private DialControlContent172Binding(@NonNull RelativeLayout rootView, @NonNull LinearLayout controlContent, @NonNull ImageView controlDelete, @NonNull ImageView controlIv, @NonNull RelativeLayout controlRoot, @NonNull TextView tv) {
        this.rootView = rootView;
        this.controlContent = controlContent;
        this.controlDelete = controlDelete;
        this.controlIv = controlIv;
        this.controlRoot = controlRoot;
        this.f51103tv = tv;
    }

    @NonNull
    public static DialControlContent172Binding bind(@NonNull View rootView) {
        int i = R.id.controlContent;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.controlContent);
        if (linearLayout != null) {
            i = R.id.controlDelete;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.controlDelete);
            if (imageView != null) {
                i = R.id.controlIv;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.controlIv);
                if (imageView2 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) rootView;
                    i = R.id.f51423tv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.f51423tv);
                    if (textView != null) {
                        return new DialControlContent172Binding(relativeLayout, linearLayout, imageView, imageView2, relativeLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialControlContent172Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DialControlContent172Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.dial_control_content_172, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
