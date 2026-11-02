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
        int r0 = R.id.learn_card_all_choose_icon;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.learn_card_all_choose_icon);
        if (r4 == null) goto L15;
        r0 = R.id.learn_card_all_choose_layout;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.learn_card_all_choose_layout);
        if (r5 == null) goto L15;
        r0 = R.id.learn_card_arrow_icon;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.learn_card_arrow_icon);
        if (r6 == null) goto L15;
        r0 = R.id.learn_card_arrow_tv_content;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.learn_card_arrow_tv_content);
        if (r7 == null) goto L15;
        r0 = R.id.learn_card_arrow_tv_title;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.learn_card_arrow_tv_title);
        if (r8 == null) goto L15;
        return new ItemLearnCardTitleBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemLearnCardTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemLearnCardTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_learn_card_title, parent, false);
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
