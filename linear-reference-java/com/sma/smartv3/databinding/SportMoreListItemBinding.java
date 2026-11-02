package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class SportMoreListItemBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout sportsMoreHrLl;

    @NonNull
    public final AppCompatImageView startMoreIconIm;

    @NonNull
    public final PFMedium startMoreTextName;

    private SportMoreListItemBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout sportsMoreHrLl, @NonNull AppCompatImageView startMoreIconIm, @NonNull PFMedium startMoreTextName) {
        this.rootView = rootView;
        this.sportsMoreHrLl = sportsMoreHrLl;
        this.startMoreIconIm = startMoreIconIm;
        this.startMoreTextName = startMoreTextName;
    }

    @NonNull
    public static SportMoreListItemBinding bind(@NonNull View rootView) {
        LinearLayout r0 = (LinearLayout) rootView;
        int r1 = R.id.start_more_icon_im;
        AppCompatImageView r2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.start_more_icon_im);
        if (r2 == null) goto L9;
        r1 = R.id.start_more_text_name;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.start_more_text_name);
        if (r3 == null) goto L9;
        return new SportMoreListItemBinding(r0, r0, r2, r3);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static SportMoreListItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static SportMoreListItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.sport_more_list_item, parent, false);
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
