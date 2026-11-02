package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemMineTranslationTimeFreeBinding implements ViewBinding {

    @NonNull
    public final TextView giftTranslationAllTimeTv;

    @NonNull
    public final TextView giftTranslationTime;

    @NonNull
    public final TextView giftTranslationTimeExpiredStateTv;

    @NonNull
    public final ImageView giftTranslationTimeIconIv;

    @NonNull
    public final RelativeLayout giftTranslationTimeRl;

    @NonNull
    public final TextView giftTranslationUsedTimeTv;

    @NonNull
    private final LinearLayout rootView;

    private ItemMineTranslationTimeFreeBinding(@NonNull LinearLayout rootView, @NonNull TextView giftTranslationAllTimeTv, @NonNull TextView giftTranslationTime, @NonNull TextView giftTranslationTimeExpiredStateTv, @NonNull ImageView giftTranslationTimeIconIv, @NonNull RelativeLayout giftTranslationTimeRl, @NonNull TextView giftTranslationUsedTimeTv) {
        this.rootView = rootView;
        this.giftTranslationAllTimeTv = giftTranslationAllTimeTv;
        this.giftTranslationTime = giftTranslationTime;
        this.giftTranslationTimeExpiredStateTv = giftTranslationTimeExpiredStateTv;
        this.giftTranslationTimeIconIv = giftTranslationTimeIconIv;
        this.giftTranslationTimeRl = giftTranslationTimeRl;
        this.giftTranslationUsedTimeTv = giftTranslationUsedTimeTv;
    }

    @NonNull
    public static ItemMineTranslationTimeFreeBinding bind(@NonNull View rootView) {
        int i = R.id.giftTranslationAllTimeTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.giftTranslationAllTimeTv);
        if (textView != null) {
            i = R.id.giftTranslationTime;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.giftTranslationTime);
            if (textView2 != null) {
                i = R.id.giftTranslationTimeExpiredStateTv;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.giftTranslationTimeExpiredStateTv);
                if (textView3 != null) {
                    i = R.id.giftTranslationTimeIconIv;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.giftTranslationTimeIconIv);
                    if (imageView != null) {
                        i = R.id.giftTranslationTimeRl;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.giftTranslationTimeRl);
                        if (relativeLayout != null) {
                            i = R.id.giftTranslationUsedTimeTv;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.giftTranslationUsedTimeTv);
                            if (textView4 != null) {
                                return new ItemMineTranslationTimeFreeBinding((LinearLayout) rootView, textView, textView2, textView3, imageView, relativeLayout, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemMineTranslationTimeFreeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemMineTranslationTimeFreeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_mine_translation_time_free, parent, false);
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
