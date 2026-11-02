package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PopDialNumberBinding implements ViewBinding {

    @NonNull
    public final Button confirmButton;

    @NonNull
    public final RelativeLayout dialSelect0;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f51181rv;

    @NonNull
    public final TextView tv0;

    @NonNull
    public final TextView tv1;

    @NonNull
    public final TextView tv2;

    private PopDialNumberBinding(@NonNull LinearLayout rootView, @NonNull Button confirmButton, @NonNull RelativeLayout dialSelect0, @NonNull RecyclerView rv, @NonNull TextView tv0, @NonNull TextView tv1, @NonNull TextView tv2) {
        this.rootView = rootView;
        this.confirmButton = confirmButton;
        this.dialSelect0 = dialSelect0;
        this.f51181rv = rv;
        this.tv0 = tv0;
        this.tv1 = tv1;
        this.tv2 = tv2;
    }

    @NonNull
    public static PopDialNumberBinding bind(@NonNull View rootView) {
        int i = R.id.confirmButton;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.confirmButton);
        if (button != null) {
            i = R.id.dialSelect0;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.dialSelect0);
            if (relativeLayout != null) {
                i = R.id.f51422rv;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                if (recyclerView != null) {
                    i = R.id.tv0;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv0);
                    if (textView != null) {
                        i = R.id.tv1;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv1);
                        if (textView2 != null) {
                            i = R.id.tv2;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv2);
                            if (textView3 != null) {
                                return new PopDialNumberBinding((LinearLayout) rootView, button, relativeLayout, recyclerView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopDialNumberBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopDialNumberBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_dial_number, parent, false);
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
