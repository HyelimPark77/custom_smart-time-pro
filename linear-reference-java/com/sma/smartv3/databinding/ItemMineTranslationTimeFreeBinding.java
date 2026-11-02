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
        int r0 = R.id.giftTranslationAllTimeTv;
        TextView r4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.giftTranslationAllTimeTv);
        if (r4 == null) goto L17;
        r0 = R.id.giftTranslationTime;
        TextView r5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.giftTranslationTime);
        if (r5 == null) goto L17;
        r0 = R.id.giftTranslationTimeExpiredStateTv;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.giftTranslationTimeExpiredStateTv);
        if (r6 == null) goto L17;
        r0 = R.id.giftTranslationTimeIconIv;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.giftTranslationTimeIconIv);
        if (r7 == null) goto L17;
        r0 = R.id.giftTranslationTimeRl;
        RelativeLayout r8 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.giftTranslationTimeRl);
        if (r8 == null) goto L17;
        r0 = R.id.giftTranslationUsedTimeTv;
        TextView r9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.giftTranslationUsedTimeTv);
        if (r9 == null) goto L17;
        return new ItemMineTranslationTimeFreeBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemMineTranslationTimeFreeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemMineTranslationTimeFreeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_mine_translation_time_free, parent, false);
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
