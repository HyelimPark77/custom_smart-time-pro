package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PopDialControlBinding implements ViewBinding {

    @NonNull
    public final Button confirmButton;

    @NonNull
    public final LinearLayout dialSelect0;

    @NonNull
    public final LinearLayout dialSelect1;

    @NonNull
    public final LinearLayout dialSelect2;

    @NonNull
    public final LinearLayout dialSelect3;

    @NonNull
    public final ImageView dialSelectStatus0;

    @NonNull
    public final ImageView dialSelectStatus1;

    @NonNull
    public final ImageView dialSelectStatus2;

    @NonNull
    public final ImageView dialSelectStatus3;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f51180rv;

    private PopDialControlBinding(@NonNull LinearLayout rootView, @NonNull Button confirmButton, @NonNull LinearLayout dialSelect0, @NonNull LinearLayout dialSelect1, @NonNull LinearLayout dialSelect2, @NonNull LinearLayout dialSelect3, @NonNull ImageView dialSelectStatus0, @NonNull ImageView dialSelectStatus1, @NonNull ImageView dialSelectStatus2, @NonNull ImageView dialSelectStatus3, @NonNull RecyclerView rv) {
        this.rootView = rootView;
        this.confirmButton = confirmButton;
        this.dialSelect0 = dialSelect0;
        this.dialSelect1 = dialSelect1;
        this.dialSelect2 = dialSelect2;
        this.dialSelect3 = dialSelect3;
        this.dialSelectStatus0 = dialSelectStatus0;
        this.dialSelectStatus1 = dialSelectStatus1;
        this.dialSelectStatus2 = dialSelectStatus2;
        this.dialSelectStatus3 = dialSelectStatus3;
        this.f51180rv = rv;
    }

    @NonNull
    public static PopDialControlBinding bind(@NonNull View rootView) {
        int i = R.id.confirmButton;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.confirmButton);
        if (button != null) {
            i = R.id.dialSelect0;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dialSelect0);
            if (linearLayout != null) {
                i = R.id.dialSelect1;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dialSelect1);
                if (linearLayout2 != null) {
                    i = R.id.dialSelect2;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dialSelect2);
                    if (linearLayout3 != null) {
                        i = R.id.dialSelect3;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dialSelect3);
                        if (linearLayout4 != null) {
                            i = R.id.dialSelectStatus0;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.dialSelectStatus0);
                            if (imageView != null) {
                                i = R.id.dialSelectStatus1;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.dialSelectStatus1);
                                if (imageView2 != null) {
                                    i = R.id.dialSelectStatus2;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.dialSelectStatus2);
                                    if (imageView3 != null) {
                                        i = R.id.dialSelectStatus3;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.dialSelectStatus3);
                                        if (imageView4 != null) {
                                            i = R.id.f51422rv;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                                            if (recyclerView != null) {
                                                return new PopDialControlBinding((LinearLayout) rootView, button, linearLayout, linearLayout2, linearLayout3, linearLayout4, imageView, imageView2, imageView3, imageView4, recyclerView);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopDialControlBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopDialControlBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_dial_control, parent, false);
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
