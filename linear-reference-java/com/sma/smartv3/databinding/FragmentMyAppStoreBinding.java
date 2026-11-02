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

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final PFMedium storageDevice;

    private FragmentMyAppStoreBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout appStoreEmptyLayout, @NonNull LinearLayout rootView, @NonNull RecyclerView rv, @NonNull PFMedium storageDevice) {
        this.rootView_ = rootView_;
        this.appStoreEmptyLayout = appStoreEmptyLayout;
        this.rootView = rootView;
        this.rv = rv;
        this.storageDevice = storageDevice;
    }

    @NonNull
    public static FragmentMyAppStoreBinding bind(@NonNull View rootView) {
        int r0 = R.id.app_store_empty_layout;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.app_store_empty_layout);
        if (r4 == null) goto L11;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.rv;
        RecyclerView r6 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r6 == null) goto L11;
        r0 = R.id.storage_device;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.storage_device);
        if (r7 == null) goto L11;
        return new FragmentMyAppStoreBinding(r3, r4, r3, r6, r7);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentMyAppStoreBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentMyAppStoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_my_app_store, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
