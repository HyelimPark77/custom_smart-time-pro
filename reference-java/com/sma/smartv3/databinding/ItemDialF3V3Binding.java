package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.SquareImageView;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemDialF3V3Binding implements ViewBinding {

    @NonNull
    public final FrameLayout itemDialNewLl;

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final SquareImageView f51140iv;

    /* JADX INFO: renamed from: pb */
    @NonNull
    public final TextView f51141pb;

    @NonNull
    private final LinearLayout rootView;

    private ItemDialF3V3Binding(@NonNull LinearLayout rootView, @NonNull FrameLayout itemDialNewLl, @NonNull SquareImageView iv, @NonNull TextView pb) {
        this.rootView = rootView;
        this.itemDialNewLl = itemDialNewLl;
        this.f51140iv = iv;
        this.f51141pb = pb;
    }

    @NonNull
    public static ItemDialF3V3Binding bind(@NonNull View rootView) {
        int i = R.id.item_dial_new_ll;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.item_dial_new_ll);
        if (frameLayout != null) {
            i = R.id.f51417iv;
            SquareImageView squareImageView = (SquareImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
            if (squareImageView != null) {
                i = R.id.f51421pb;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.f51421pb);
                if (textView != null) {
                    return new ItemDialF3V3Binding((LinearLayout) rootView, frameLayout, squareImageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemDialF3V3Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemDialF3V3Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_dial_f3_v3, parent, false);
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
