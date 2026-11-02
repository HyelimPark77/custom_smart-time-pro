package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class DeviceItemSplitLine1dpBinding implements ViewBinding {

    @NonNull
    private final View rootView;

    private DeviceItemSplitLine1dpBinding(@NonNull View rootView) {
        this.rootView = rootView;
    }

    @NonNull
    public static DeviceItemSplitLine1dpBinding bind(@NonNull View rootView) {
        if (rootView != null) {
            return new DeviceItemSplitLine1dpBinding(rootView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static DeviceItemSplitLine1dpBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DeviceItemSplitLine1dpBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.device_item_split_line_1dp, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}
