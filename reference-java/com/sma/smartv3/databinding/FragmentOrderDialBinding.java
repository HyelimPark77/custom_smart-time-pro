package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentOrderDialBinding implements ViewBinding {

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final ImageView image;

    @NonNull
    public final RelativeLayout loading;

    @NonNull
    public final ImageButton nextTime;

    @NonNull
    public final PFMedium nowTime;

    @NonNull
    public final DINCondBold nowTimeDetails;

    @NonNull
    public final DINCondBold nowValue;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final PFMedium tvView;

    @NonNull
    public final PFMedium valueUnit;

    private FragmentOrderDialBinding(@NonNull LinearLayout rootView, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull ImageView image, @NonNull RelativeLayout loading, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull RecyclerView recyclerView, @NonNull NestedScrollView scrollView, @NonNull PFMedium tvView, @NonNull PFMedium valueUnit) {
        this.rootView = rootView;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.image = image;
        this.loading = loading;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.recyclerView = recyclerView;
        this.scrollView = scrollView;
        this.tvView = tvView;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentOrderDialBinding bind(@NonNull View rootView) {
        int i = R.id.beforeTime;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (imageButton != null) {
            i = R.id.dataContent;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
            if (linearLayout != null) {
                i = R.id.image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
                if (imageView != null) {
                    i = R.id.loading;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
                    if (relativeLayout != null) {
                        i = R.id.nextTime;
                        ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
                        if (imageButton2 != null) {
                            i = R.id.nowTime;
                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
                            if (pFMedium != null) {
                                i = R.id.nowTimeDetails;
                                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
                                if (dINCondBold != null) {
                                    i = R.id.nowValue;
                                    DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
                                    if (dINCondBold2 != null) {
                                        i = R.id.recycler_view;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view);
                                        if (recyclerView != null) {
                                            i = R.id.scrollView;
                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                            if (nestedScrollView != null) {
                                                i = R.id.tv_view;
                                                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_view);
                                                if (pFMedium2 != null) {
                                                    i = R.id.valueUnit;
                                                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
                                                    if (pFMedium3 != null) {
                                                        return new FragmentOrderDialBinding((LinearLayout) rootView, imageButton, linearLayout, imageView, relativeLayout, imageButton2, pFMedium, dINCondBold, dINCondBold2, recyclerView, nestedScrollView, pFMedium2, pFMedium3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOrderDialBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentOrderDialBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_order_dial, parent, false);
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
