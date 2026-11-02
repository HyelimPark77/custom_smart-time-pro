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

    @NonNull
    public final SquareImageView iv;

    @NonNull
    private final LinearLayout rootView;

    private ItemDialBgFilePickerBinding(@NonNull LinearLayout rootView, @NonNull SquareImageView iv) {
        this.rootView = rootView;
        this.iv = iv;
    }

    @NonNull
    public static ItemDialBgFilePickerBinding bind(@NonNull View rootView) {
        SquareImageView r1 = (SquareImageView) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r1 == null) goto L7;
        return new ItemDialBgFilePickerBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.iv)));
    }

    @NonNull
    public static ItemDialBgFilePickerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemDialBgFilePickerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_dial_bg_file_picker, parent, false);
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
