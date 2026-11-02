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

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final PFMedium tvFreeSpace;

    private ActivityOnLineLearningFileBinding(@NonNull LinearLayout rootView, @NonNull Button onlineLearningButton, @NonNull RecyclerView rv, @NonNull PFMedium tvFreeSpace) {
        this.rootView = rootView;
        this.onlineLearningButton = onlineLearningButton;
        this.rv = rv;
        this.tvFreeSpace = tvFreeSpace;
    }

    @NonNull
    public static ActivityOnLineLearningFileBinding bind(@NonNull View rootView) {
        int r0 = R.id.online_learning_button;
        Button r1 = (Button) ViewBindings.findChildViewById(rootView, R.id.online_learning_button);
        if (r1 == null) goto L11;
        r0 = R.id.rv;
        RecyclerView r2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r2 == null) goto L11;
        r0 = R.id.tv_free_space;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_free_space);
        if (r3 == null) goto L11;
        return new ActivityOnLineLearningFileBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityOnLineLearningFileBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityOnLineLearningFileBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_on_line_learning_file, parent, false);
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
