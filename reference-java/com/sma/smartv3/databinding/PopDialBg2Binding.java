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
public final class PopDialBg2Binding implements ViewBinding {

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

    private PopDialBg2Binding(@NonNull LinearLayout rootView, @NonNull ImageViewRound dialSelect0, @NonNull ImageViewRound dialSelect1, @NonNull ImageViewRound dialSelect2, @NonNull ImageViewRound dialSelect3, @NonNull ImageViewRound dialSelect4, @NonNull ImageViewRound dialSelect5) {
        this.rootView = rootView;
        this.dialSelect0 = dialSelect0;
        this.dialSelect1 = dialSelect1;
        this.dialSelect2 = dialSelect2;
        this.dialSelect3 = dialSelect3;
        this.dialSelect4 = dialSelect4;
        this.dialSelect5 = dialSelect5;
    }

    @NonNull
    public static PopDialBg2Binding bind(@NonNull View rootView) {
        int i = R.id.dialSelect0;
        ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.dialSelect0);
        if (imageViewRound != null) {
            i = R.id.dialSelect1;
            ImageViewRound imageViewRound2 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.dialSelect1);
            if (imageViewRound2 != null) {
                i = R.id.dialSelect2;
                ImageViewRound imageViewRound3 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.dialSelect2);
                if (imageViewRound3 != null) {
                    i = R.id.dialSelect3;
                    ImageViewRound imageViewRound4 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.dialSelect3);
                    if (imageViewRound4 != null) {
                        i = R.id.dialSelect4;
                        ImageViewRound imageViewRound5 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.dialSelect4);
                        if (imageViewRound5 != null) {
                            i = R.id.dialSelect5;
                            ImageViewRound imageViewRound6 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.dialSelect5);
                            if (imageViewRound6 != null) {
                                return new PopDialBg2Binding((LinearLayout) rootView, imageViewRound, imageViewRound2, imageViewRound3, imageViewRound4, imageViewRound5, imageViewRound6);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopDialBg2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopDialBg2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_dial_bg_2, parent, false);
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
