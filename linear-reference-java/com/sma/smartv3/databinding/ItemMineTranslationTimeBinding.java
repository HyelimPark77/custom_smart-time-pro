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
        int r0 = R.id.buyTranslationAllTimeTv;
        TextView r4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.buyTranslationAllTimeTv);
        if (r4 == null) goto L15;
        r0 = R.id.buyTranslationTimeIconIv;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.buyTranslationTimeIconIv);
        if (r5 == null) goto L15;
        r0 = R.id.buyTranslationUsedTimeTv;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.buyTranslationUsedTimeTv);
        if (r6 == null) goto L15;
        r0 = R.id.expiredTimeTv;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.expiredTimeTv);
        if (r7 == null) goto L15;
        r0 = R.id.timeTitleTv;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.timeTitleTv);
        if (r8 == null) goto L15;
        return new ItemMineTranslationTimeBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemMineTranslationTimeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemMineTranslationTimeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_mine_translation_time, parent, false);
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
