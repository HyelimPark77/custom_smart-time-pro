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
import com.sma.smartv3.view.SquareImageView;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemDialBgFilePickerBinding implements ViewBinding {

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final SquareImageView f51135iv;

    @NonNull
    private final LinearLayout rootView;

    private ItemDialBgFilePickerBinding(@NonNull LinearLayout rootView, @NonNull SquareImageView iv) {
        this.rootView = rootView;
        this.f51135iv = iv;
    }

    @NonNull
    public static ItemDialBgFilePickerBinding bind(@NonNull View rootView) {
        SquareImageView squareImageView = (SquareImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
        if (squareImageView != null) {
            return new ItemDialBgFilePickerBinding((LinearLayout) rootView, squareImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.f51417iv)));
    }

    @NonNull
    public static ItemDialBgFilePickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemDialBgFilePickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_dial_bg_file_picker, parent, false);
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
