package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemLearnCardTitleBinding implements ViewBinding {

    @NonNull
    public final ImageView learnCardAllChooseIcon;

    @NonNull
    public final LinearLayout learnCardAllChooseLayout;

    @NonNull
    public final ImageView learnCardArrowIcon;

    @NonNull
    public final PFMedium learnCardArrowTvContent;

    @NonNull
    public final PFMedium learnCardArrowTvTitle;

    @NonNull
    private final LinearLayout rootView;

    private ItemLearnCardTitleBinding(@NonNull LinearLayout rootView, @NonNull ImageView learnCardAllChooseIcon, @NonNull LinearLayout learnCardAllChooseLayout, @NonNull ImageView learnCardArrowIcon, @NonNull PFMedium learnCardArrowTvContent, @NonNull PFMedium learnCardArrowTvTitle) {
        this.rootView = rootView;
        this.learnCardAllChooseIcon = learnCardAllChooseIcon;
        this.learnCardAllChooseLayout = learnCardAllChooseLayout;
        this.learnCardArrowIcon = learnCardArrowIcon;
        this.learnCardArrowTvContent = learnCardArrowTvContent;
        this.learnCardArrowTvTitle = learnCardArrowTvTitle;
    }

    @NonNull
    public static ItemLearnCardTitleBinding bind(@NonNull View rootView) {
        int i = R.id.learn_card_all_choose_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.learn_card_all_choose_icon);
        if (imageView != null) {
            i = R.id.learn_card_all_choose_layout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.learn_card_all_choose_layout);
            if (linearLayout != null) {
                i = R.id.learn_card_arrow_icon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.learn_card_arrow_icon);
                if (imageView2 != null) {
                    i = R.id.learn_card_arrow_tv_content;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.learn_card_arrow_tv_content);
                    if (pFMedium != null) {
                        i = R.id.learn_card_arrow_tv_title;
                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.learn_card_arrow_tv_title);
                        if (pFMedium2 != null) {
                            return new ItemLearnCardTitleBinding((LinearLayout) rootView, imageView, linearLayout, imageView2, pFMedium, pFMedium2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemLearnCardTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemLearnCardTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_learn_card_title, parent, false);
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
