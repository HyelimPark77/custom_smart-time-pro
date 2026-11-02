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
        int r0 = R.id.abh_pop_cancel;
        TextView r1 = (TextView) ViewBindings.findChildViewById(rootView, R.id.abh_pop_cancel);
        if (r1 == null) goto L9;
        r0 = R.id.list;
        RecyclerView r2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.list);
        if (r2 == null) goto L9;
        return new PopMessageListV2Binding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopMessageListV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopMessageListV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_message_list_v2, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
