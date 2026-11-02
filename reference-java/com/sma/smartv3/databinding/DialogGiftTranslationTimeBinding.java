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
        int i = R.id.freeTimeValueTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.freeTimeValueTv);
        if (textView != null) {
            i = R.id.giftTranslationBgIv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.giftTranslationBgIv);
            if (imageView != null) {
                i = R.id.giftTranslationConfirmRl;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.giftTranslationConfirmRl);
                if (relativeLayout != null) {
                    return new DialogGiftTranslationTimeBinding((RelativeLayout) rootView, textView, imageView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogGiftTranslationTimeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DialogGiftTranslationTimeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.dialog_gift_translation_time, parent, false);
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
