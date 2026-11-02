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
public final class FragmentAllAppStoreBinding implements ViewBinding {

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f51110rv;

    @NonNull
    public final PFMedium storageDevice;

    private FragmentAllAppStoreBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout rootView, @NonNull RecyclerView rv, @NonNull PFMedium storageDevice) {
        this.rootView_ = rootView_;
        this.rootView = rootView;
        this.f51110rv = rv;
        this.storageDevice = storageDevice;
    }

    @NonNull
    public static FragmentAllAppStoreBinding bind(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.f51422rv;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
        if (recyclerView != null) {
            i = R.id.storage_device;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.storage_device);
            if (pFMedium != null) {
                return new FragmentAllAppStoreBinding(linearLayout, linearLayout, recyclerView, pFMedium);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentAllAppStoreBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentAllAppStoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_all_app_store, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
