package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButton;
import com.sma.smartv3.view.SquareImageView;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemDialF3Binding implements ViewBinding {

    @NonNull
    public final FrameLayout itemDialNewLl;

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final SquareImageView f51136iv;

    /* JADX INFO: renamed from: pb */
    @NonNull
    public final ProgressButton f51137pb;

    @NonNull
    private final LinearLayout rootView;

    private ItemDialF3Binding(@NonNull LinearLayout rootView, @NonNull FrameLayout itemDialNewLl, @NonNull SquareImageView iv, @NonNull ProgressButton pb) {
        this.rootView = rootView;
        this.itemDialNewLl = itemDialNewLl;
        this.f51136iv = iv;
        this.f51137pb = pb;
    }

    @NonNull
    public static ItemDialF3Binding bind(@NonNull View rootView) {
        int i = R.id.item_dial_new_ll;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.item_dial_new_ll);
        if (frameLayout != null) {
            i = R.id.f51417iv;
            SquareImageView squareImageView = (SquareImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
            if (squareImageView != null) {
                i = R.id.f51421pb;
                ProgressButton progressButton = (ProgressButton) ViewBindings.findChildViewById(rootView, R.id.f51421pb);
                if (progressButton != null) {
                    return new ItemDialF3Binding((LinearLayout) rootView, frameLayout, squareImageView, progressButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemDialF3Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemDialF3Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_dial_f3, parent, false);
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
