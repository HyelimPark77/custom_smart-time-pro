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

    @NonNull
    public final TextView tv;

    private DialControlContent172Binding(@NonNull RelativeLayout rootView, @NonNull LinearLayout controlContent, @NonNull ImageView controlDelete, @NonNull ImageView controlIv, @NonNull RelativeLayout controlRoot, @NonNull TextView tv) {
        this.rootView = rootView;
        this.controlContent = controlContent;
        this.controlDelete = controlDelete;
        this.controlIv = controlIv;
        this.controlRoot = controlRoot;
        this.tv = tv;
    }

    @NonNull
    public static DialControlContent172Binding bind(@NonNull View rootView) {
        int r0 = R.id.controlContent;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.controlContent);
        if (r4 == null) goto L13;
        r0 = R.id.controlDelete;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.controlDelete);
        if (r5 == null) goto L13;
        r0 = R.id.controlIv;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.controlIv);
        if (r6 == null) goto L13;
        RelativeLayout r3 = (RelativeLayout) rootView;
        r0 = R.id.tv;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv);
        if (r8 == null) goto L13;
        return new DialControlContent172Binding(r3, r4, r5, r6, r3, r8);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static DialControlContent172Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static DialControlContent172Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.dial_control_content_172, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
