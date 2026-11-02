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
public final class FragmentMyAppStoreBinding implements ViewBinding {

    @NonNull
    public final LinearLayout appStoreEmptyLayout;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f51115rv;

    @NonNull
    public final PFMedium storageDevice;

    private FragmentMyAppStoreBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout appStoreEmptyLayout, @NonNull LinearLayout rootView, @NonNull RecyclerView rv, @NonNull PFMedium storageDevice) {
        this.rootView_ = rootView_;
        this.appStoreEmptyLayout = appStoreEmptyLayout;
        this.rootView = rootView;
        this.f51115rv = rv;
        this.storageDevice = storageDevice;
    }

    @NonNull
    public static FragmentMyAppStoreBinding bind(@NonNull View rootView) {
        int i = R.id.app_store_empty_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.app_store_empty_layout);
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) rootView;
            i = R.id.f51422rv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
            if (recyclerView != null) {
                i = R.id.storage_device;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.storage_device);
                if (pFMedium != null) {
                    return new FragmentMyAppStoreBinding(linearLayout2, linearLayout, linearLayout2, recyclerView, pFMedium);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMyAppStoreBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentMyAppStoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_my_app_store, parent, false);
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
