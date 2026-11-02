package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentStatusEcgDayV2Binding implements ViewBinding {

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final RelativeLayout loading;

    @NonNull
    public final ImageButton nextTime;

    @NonNull
    public final PFMedium nowTime;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final View viewDayItem;

    private FragmentStatusEcgDayV2Binding(@NonNull LinearLayout rootView, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull RelativeLayout loading, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull NestedScrollView scrollView, @NonNull View viewDayItem) {
        this.rootView = rootView;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.loading = loading;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.scrollView = scrollView;
        this.viewDayItem = viewDayItem;
    }

    @NonNull
    public static FragmentStatusEcgDayV2Binding bind(@NonNull View rootView) {
        int i = R.id.beforeTime;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (imageButton != null) {
            i = R.id.dataContent;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
            if (linearLayout != null) {
                i = R.id.loading;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
                if (relativeLayout != null) {
                    i = R.id.nextTime;
                    ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
                    if (imageButton2 != null) {
                        i = R.id.nowTime;
                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
                        if (pFMedium != null) {
                            i = R.id.scrollView;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                            if (nestedScrollView != null) {
                                i = R.id.view_day_item;
                                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.view_day_item);
                                if (viewFindChildViewById != null) {
                                    return new FragmentStatusEcgDayV2Binding((LinearLayout) rootView, imageButton, linearLayout, relativeLayout, imageButton2, pFMedium, nestedScrollView, viewFindChildViewById);
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
    public static FragmentStatusEcgDayV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentStatusEcgDayV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_status_ecg_day_v2, parent, false);
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
