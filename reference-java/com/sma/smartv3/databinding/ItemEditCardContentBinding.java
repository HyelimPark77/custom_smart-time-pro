package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemEditCardContentBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvCard;

    private ItemEditCardContentBinding(@NonNull LinearLayout rootView, @NonNull PFMedium tvCard) {
        this.rootView = rootView;
        this.tvCard = tvCard;
    }

    @NonNull
    public static ItemEditCardContentBinding bind(@NonNull View rootView) {
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tvCard);
        if (pFMedium != null) {
            return new ItemEditCardContentBinding((LinearLayout) rootView, pFMedium);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tvCard)));
    }

    @NonNull
    public static ItemEditCardContentBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemEditCardContentBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_edit_card_content, parent, false);
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
