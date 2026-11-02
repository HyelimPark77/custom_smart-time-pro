package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentSportRvBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    private final RelativeLayout rootView_;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final PFMedium sportTitle;

    private FragmentSportRvBinding(@NonNull RelativeLayout rootView_, @NonNull RelativeLayout rootView, @NonNull RecyclerView rv, @NonNull PFMedium sportTitle) {
        this.rootView_ = rootView_;
        this.rootView = rootView;
        this.rv = rv;
        this.sportTitle = sportTitle;
    }

    @NonNull
    public static FragmentSportRvBinding bind(@NonNull View rootView) {
        RelativeLayout r0 = (RelativeLayout) rootView;
        int r1 = R.id.rv;
        RecyclerView r2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r2 == null) goto L9;
        r1 = R.id.sport_title;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_title);
        if (r3 == null) goto L9;
        return new FragmentSportRvBinding(r0, r0, r2, r3);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentSportRvBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentSportRvBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_sport_rv, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
