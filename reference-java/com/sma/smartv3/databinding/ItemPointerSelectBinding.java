package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemPointerSelectBinding implements ViewBinding {

    @NonNull
    public final ImageView pointerIv;

    @NonNull
    private final RelativeLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RelativeLayout f51156rv;

    @NonNull
    public final ImageView selectStatus;

    private ItemPointerSelectBinding(@NonNull RelativeLayout rootView, @NonNull ImageView pointerIv, @NonNull RelativeLayout rv, @NonNull ImageView selectStatus) {
        this.rootView = rootView;
        this.pointerIv = pointerIv;
        this.f51156rv = rv;
        this.selectStatus = selectStatus;
    }

    @NonNull
    public static ItemPointerSelectBinding bind(@NonNull View rootView) {
        int i = R.id.pointerIv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pointerIv);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.selectStatus);
            if (imageView2 != null) {
                return new ItemPointerSelectBinding(relativeLayout, imageView, relativeLayout, imageView2);
            }
            i = R.id.selectStatus;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemPointerSelectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemPointerSelectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_pointer_select, parent, false);
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
