package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemMineTranslationTimeBinding implements ViewBinding {

    @NonNull
    public final TextView buyTranslationAllTimeTv;

    @NonNull
    public final ImageView buyTranslationTimeIconIv;

    @NonNull
    public final TextView buyTranslationUsedTimeTv;

    @NonNull
    public final TextView expiredTimeTv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView timeTitleTv;

    private ItemMineTranslationTimeBinding(@NonNull LinearLayout rootView, @NonNull TextView buyTranslationAllTimeTv, @NonNull ImageView buyTranslationTimeIconIv, @NonNull TextView buyTranslationUsedTimeTv, @NonNull TextView expiredTimeTv, @NonNull TextView timeTitleTv) {
        this.rootView = rootView;
        this.buyTranslationAllTimeTv = buyTranslationAllTimeTv;
        this.buyTranslationTimeIconIv = buyTranslationTimeIconIv;
        this.buyTranslationUsedTimeTv = buyTranslationUsedTimeTv;
        this.expiredTimeTv = expiredTimeTv;
        this.timeTitleTv = timeTitleTv;
    }

    @NonNull
    public static ItemMineTranslationTimeBinding bind(@NonNull View rootView) {
        int i = R.id.buyTranslationAllTimeTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.buyTranslationAllTimeTv);
        if (textView != null) {
            i = R.id.buyTranslationTimeIconIv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.buyTranslationTimeIconIv);
            if (imageView != null) {
                i = R.id.buyTranslationUsedTimeTv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.buyTranslationUsedTimeTv);
                if (textView2 != null) {
                    i = R.id.expiredTimeTv;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.expiredTimeTv);
                    if (textView3 != null) {
                        i = R.id.timeTitleTv;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.timeTitleTv);
                        if (textView4 != null) {
                            return new ItemMineTranslationTimeBinding((LinearLayout) rootView, textView, imageView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemMineTranslationTimeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemMineTranslationTimeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_mine_translation_time, parent, false);
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
