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
public final class ItemAllPopTv2Binding implements ViewBinding {

    @NonNull
    public final TextView courseTypeTv;

    @NonNull
    private final TextView rootView;

    private ItemAllPopTv2Binding(@NonNull TextView rootView, @NonNull TextView courseTypeTv) {
        this.rootView = rootView;
        this.courseTypeTv = courseTypeTv;
    }

    @NonNull
    public static ItemAllPopTv2Binding bind(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) rootView;
        return new ItemAllPopTv2Binding(textView, textView);
    }

    @NonNull
    public static ItemAllPopTv2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemAllPopTv2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_all_pop_tv2, parent, false);
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
