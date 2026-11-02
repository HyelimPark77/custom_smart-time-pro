package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class SportItemStartBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium sportItemStartListMore;

    @NonNull
    public final RecyclerView startRecyclerview;

    private SportItemStartBinding(@NonNull LinearLayout rootView, @NonNull PFMedium sportItemStartListMore, @NonNull RecyclerView startRecyclerview) {
        this.rootView = rootView;
        this.sportItemStartListMore = sportItemStartListMore;
        this.startRecyclerview = startRecyclerview;
    }

    @NonNull
    public static SportItemStartBinding bind(@NonNull View rootView) {
        int r0 = R.id.sport_item_start_list_more;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_item_start_list_more);
        if (r1 == null) goto L9;
        r0 = R.id.start_recyclerview;
        RecyclerView r2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.start_recyclerview);
        if (r2 == null) goto L9;
        return new SportItemStartBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static SportItemStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static SportItemStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.sport_item_start, parent, false);
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
