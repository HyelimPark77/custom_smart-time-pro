package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PopMessageListV2Binding implements ViewBinding {

    @NonNull
    public final TextView abhPopCancel;

    @NonNull
    public final RecyclerView list;

    @NonNull
    private final LinearLayout rootView;

    private PopMessageListV2Binding(@NonNull LinearLayout rootView, @NonNull TextView abhPopCancel, @NonNull RecyclerView list) {
        this.rootView = rootView;
        this.abhPopCancel = abhPopCancel;
        this.list = list;
    }

    @NonNull
    public static PopMessageListV2Binding bind(@NonNull View rootView) {
        int i = R.id.abh_pop_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.abh_pop_cancel);
        if (textView != null) {
            i = R.id.list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.list);
            if (recyclerView != null) {
                return new PopMessageListV2Binding((LinearLayout) rootView, textView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopMessageListV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopMessageListV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_message_list_v2, parent, false);
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
