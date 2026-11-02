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
        int i = R.id.alert;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.alert);
        if (textView != null) {
            i = R.id.title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
            if (textView2 != null) {
                i = R.id.translationAddTimeTv;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.translationAddTimeTv);
                if (textView3 != null) {
                    return new ItemMineTranslationTimeTitleBinding((LinearLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemMineTranslationTimeTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemMineTranslationTimeTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_mine_translation_time_title, parent, false);
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
