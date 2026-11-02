package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemNotificationOthersBinding implements ViewBinding {

    @NonNull
    public final AppCompatCheckBox checkEnabled;

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvName;

    private ItemNotificationOthersBinding(@NonNull LinearLayout rootView, @NonNull AppCompatCheckBox checkEnabled, @NonNull ImageView ivIcon, @NonNull PFMedium tvName) {
        this.rootView = rootView;
        this.checkEnabled = checkEnabled;
        this.ivIcon = ivIcon;
        this.tvName = tvName;
    }

    @NonNull
    public static ItemNotificationOthersBinding bind(@NonNull View rootView) {
        int i = R.id.check_enabled;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_enabled);
        if (appCompatCheckBox != null) {
            i = R.id.iv_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_icon);
            if (imageView != null) {
                i = R.id.tv_name;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                if (pFMedium != null) {
                    return new ItemNotificationOthersBinding((LinearLayout) rootView, appCompatCheckBox, imageView, pFMedium);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemNotificationOthersBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemNotificationOthersBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_notification_others, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
