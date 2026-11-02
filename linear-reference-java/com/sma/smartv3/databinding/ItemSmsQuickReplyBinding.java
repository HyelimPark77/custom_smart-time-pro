package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemSmsQuickReplyBinding implements ViewBinding {

    @NonNull
    public final ImageButton btnDelete;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tv;

    private ItemSmsQuickReplyBinding(@NonNull LinearLayout rootView, @NonNull ImageButton btnDelete, @NonNull PFMedium tv) {
        this.rootView = rootView;
        this.btnDelete = btnDelete;
        this.tv = tv;
    }

    @NonNull
    public static ItemSmsQuickReplyBinding bind(@NonNull View rootView) {
        int r0 = R.id.btn_delete;
        ImageButton r1 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.btn_delete);
        if (r1 == null) goto L9;
        r0 = R.id.tv;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv);
        if (r2 == null) goto L9;
        return new ItemSmsQuickReplyBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemSmsQuickReplyBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemSmsQuickReplyBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_sms_quick_reply, parent, false);
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
