package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class DeviceItemSplitTitleBinding implements ViewBinding {

    @NonNull
    private final TextView rootView;

    @NonNull
    public final TextView tvTitle;

    private DeviceItemSplitTitleBinding(@NonNull TextView rootView, @NonNull TextView tvTitle) {
        this.rootView = rootView;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static DeviceItemSplitTitleBinding bind(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) rootView;
        return new DeviceItemSplitTitleBinding(textView, textView);
    }

    @NonNull
    public static DeviceItemSplitTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DeviceItemSplitTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.device_item_split_title, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
