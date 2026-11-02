package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityOnLineLearningFileBinding implements ViewBinding {

    @NonNull
    public final Button onlineLearningButton;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50993rv;

    @NonNull
    public final PFMedium tvFreeSpace;

    private ActivityOnLineLearningFileBinding(@NonNull LinearLayout rootView, @NonNull Button onlineLearningButton, @NonNull RecyclerView rv, @NonNull PFMedium tvFreeSpace) {
        this.rootView = rootView;
        this.onlineLearningButton = onlineLearningButton;
        this.f50993rv = rv;
        this.tvFreeSpace = tvFreeSpace;
    }

    @NonNull
    public static ActivityOnLineLearningFileBinding bind(@NonNull View rootView) {
        int i = R.id.online_learning_button;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.online_learning_button);
        if (button != null) {
            i = R.id.f51422rv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
            if (recyclerView != null) {
                i = R.id.tv_free_space;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_free_space);
                if (pFMedium != null) {
                    return new ActivityOnLineLearningFileBinding((LinearLayout) rootView, button, recyclerView, pFMedium);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOnLineLearningFileBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityOnLineLearningFileBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_on_line_learning_file, parent, false);
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
