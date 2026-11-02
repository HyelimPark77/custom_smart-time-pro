package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class DialogGiftTranslationTimeBinding implements ViewBinding {

    @NonNull
    public final TextView freeTimeValueTv;

    @NonNull
    public final ImageView giftTranslationBgIv;

    @NonNull
    public final RelativeLayout giftTranslationConfirmRl;

    @NonNull
    private final RelativeLayout rootView;

    private DialogGiftTranslationTimeBinding(@NonNull RelativeLayout rootView, @NonNull TextView freeTimeValueTv, @NonNull ImageView giftTranslationBgIv, @NonNull RelativeLayout giftTranslationConfirmRl) {
        this.rootView = rootView;
        this.freeTimeValueTv = freeTimeValueTv;
        this.giftTranslationBgIv = giftTranslationBgIv;
        this.giftTranslationConfirmRl = giftTranslationConfirmRl;
    }

    @NonNull
    public static DialogGiftTranslationTimeBinding bind(@NonNull View rootView) {
        int r0 = R.id.freeTimeValueTv;
        TextView r1 = (TextView) ViewBindings.findChildViewById(rootView, R.id.freeTimeValueTv);
        if (r1 == null) goto L11;
        r0 = R.id.giftTranslationBgIv;
        ImageView r2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.giftTranslationBgIv);
        if (r2 == null) goto L11;
        r0 = R.id.giftTranslationConfirmRl;
        RelativeLayout r3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.giftTranslationConfirmRl);
        if (r3 == null) goto L11;
        return new DialogGiftTranslationTimeBinding((RelativeLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static DialogGiftTranslationTimeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static DialogGiftTranslationTimeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.dialog_gift_translation_time, parent, false);
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
