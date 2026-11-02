package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutSportRecordListItemBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    private LayoutSportRecordListItemBinding(@NonNull LinearLayout rootView) {
        this.rootView = rootView;
    }

    @NonNull
    public static LayoutSportRecordListItemBinding bind(@NonNull View rootView) {
        if (rootView != null) {
            return new LayoutSportRecordListItemBinding((LinearLayout) rootView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static LayoutSportRecordListItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutSportRecordListItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_sport_record_list_item, parent, false);
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
