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
import com.sma.smartv3.view.ImageViewRound;

/* JADX INFO: loaded from: classes19.dex */
public final class PopDialBg10Binding implements ViewBinding {

    @NonNull
    public final ImageViewRound dialSelect0;

    @NonNull
    public final ImageViewRound dialSelect1;

    @NonNull
    public final ImageViewRound dialSelect2;

    @NonNull
    public final ImageViewRound dialSelect3;

    @NonNull
    public final ImageViewRound dialSelect4;

    @NonNull
    public final ImageViewRound dialSelect5;

    @NonNull
    private final LinearLayout rootView;

    private PopDialBg10Binding(@NonNull LinearLayout rootView, @NonNull ImageViewRound dialSelect0, @NonNull ImageViewRound dialSelect1, @NonNull ImageViewRound dialSelect2, @NonNull ImageViewRound dialSelect3, @NonNull ImageViewRound dialSelect4, @NonNull ImageViewRound dialSelect5) {
        this.rootView = rootView;
        this.dialSelect0 = dialSelect0;
        this.dialSelect1 = dialSelect1;
        this.dialSelect2 = dialSelect2;
        this.dialSelect3 = dialSelect3;
        this.dialSelect4 = dialSelect4;
        this.dialSelect5 = dialSelect5;
    }

    @NonNull
    public static PopDialBg10Binding bind(@NonNull View rootView) {
        int r0 = R.id.dialSelect0;
        ImageViewRound r4 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.dialSelect0);
        if (r4 == null) goto L17;
        r0 = R.id.dialSelect1;
        ImageViewRound r5 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.dialSelect1);
        if (r5 == null) goto L17;
        r0 = R.id.dialSelect2;
        ImageViewRound r6 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.dialSelect2);
        if (r6 == null) goto L17;
        r0 = R.id.dialSelect3;
        ImageViewRound r7 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.dialSelect3);
        if (r7 == null) goto L17;
        r0 = R.id.dialSelect4;
        ImageViewRound r8 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.dialSelect4);
        if (r8 == null) goto L17;
        r0 = R.id.dialSelect5;
        ImageViewRound r9 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.dialSelect5);
        if (r9 == null) goto L17;
        return new PopDialBg10Binding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopDialBg10Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopDialBg10Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_dial_bg_10, parent, false);
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
