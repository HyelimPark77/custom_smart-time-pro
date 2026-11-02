package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemMineTranslationTimeTitleBinding implements ViewBinding {

    @NonNull
    public final TextView alert;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView title;

    @NonNull
    public final TextView translationAddTimeTv;

    private ItemMineTranslationTimeTitleBinding(@NonNull LinearLayout rootView, @NonNull TextView alert, @NonNull TextView title, @NonNull TextView translationAddTimeTv) {
        this.rootView = rootView;
        this.alert = alert;
        this.title = title;
        this.translationAddTimeTv = translationAddTimeTv;
    }

    @NonNull
    public static ItemMineTranslationTimeTitleBinding bind(@NonNull View rootView) {
        int r0 = R.id.alert;
        TextView r1 = (TextView) ViewBindings.findChildViewById(rootView, R.id.alert);
        if (r1 == null) goto L11;
        r0 = R.id.title;
        TextView r2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
        if (r2 == null) goto L11;
        r0 = R.id.translationAddTimeTv;
        TextView r3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.translationAddTimeTv);
        if (r3 == null) goto L11;
        return new ItemMineTranslationTimeTitleBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemMineTranslationTimeTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemMineTranslationTimeTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_mine_translation_time_title, parent, false);
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
