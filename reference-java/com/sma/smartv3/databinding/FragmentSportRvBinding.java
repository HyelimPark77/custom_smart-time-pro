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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f51122rv;

    @NonNull
    public final PFMedium sportTitle;

    private FragmentSportRvBinding(@NonNull RelativeLayout rootView_, @NonNull RelativeLayout rootView, @NonNull RecyclerView rv, @NonNull PFMedium sportTitle) {
        this.rootView_ = rootView_;
        this.rootView = rootView;
        this.f51122rv = rv;
        this.sportTitle = sportTitle;
    }

    @NonNull
    public static FragmentSportRvBinding bind(@NonNull View rootView) {
        RelativeLayout relativeLayout = (RelativeLayout) rootView;
        int i = R.id.f51422rv;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
        if (recyclerView != null) {
            i = R.id.sport_title;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_title);
            if (pFMedium != null) {
                return new FragmentSportRvBinding(relativeLayout, relativeLayout, recyclerView, pFMedium);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSportRvBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSportRvBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sport_rv, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
