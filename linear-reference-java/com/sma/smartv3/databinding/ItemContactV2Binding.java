package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemContactV2Binding implements ViewBinding {

    @NonNull
    public final ImageButton btDeleteSportRecord;

    @NonNull
    public final LinearLayout menuWrapLayout;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final PFMedium tvNumber;

    private ItemContactV2Binding(@NonNull RelativeLayout rootView, @NonNull ImageButton btDeleteSportRecord, @NonNull LinearLayout menuWrapLayout, @NonNull PFMedium tvName, @NonNull PFMedium tvNumber) {
        this.rootView = rootView;
        this.btDeleteSportRecord = btDeleteSportRecord;
        this.menuWrapLayout = menuWrapLayout;
        this.tvName = tvName;
        this.tvNumber = tvNumber;
    }

    @NonNull
    public static ItemContactV2Binding bind(@NonNull View rootView) {
        int r0 = R.id.bt_delete_sport_record;
        ImageButton r4 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.bt_delete_sport_record);
        if (r4 == null) goto L13;
        r0 = R.id.menu_wrap_layout;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_wrap_layout);
        if (r5 == null) goto L13;
        r0 = R.id.tv_name;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r6 == null) goto L13;
        r0 = R.id.tv_number;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_number);
        if (r7 == null) goto L13;
        return new ItemContactV2Binding((RelativeLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemContactV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemContactV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_contact_v2, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
