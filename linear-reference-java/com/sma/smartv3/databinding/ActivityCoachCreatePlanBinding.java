package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.appintro.internal.AppIntroViewPager;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityCoachCreatePlanBinding implements ViewBinding {

    @NonNull
    public final ImageButton back;

    @NonNull
    public final RelativeLayout background;

    @NonNull
    public final LayoutTitleIvTvIvBinding createPlanTitle;

    @NonNull
    public final Button done;

    @NonNull
    public final FrameLayout indicatorContainer;

    @NonNull
    public final Button next;

    @NonNull
    public final Button nextCustomClick;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final Button skip;

    @NonNull
    public final AppIntroViewPager viewPager;

    private ActivityCoachCreatePlanBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton back, @NonNull RelativeLayout background, @NonNull LayoutTitleIvTvIvBinding createPlanTitle, @NonNull Button done, @NonNull FrameLayout indicatorContainer, @NonNull Button next, @NonNull Button nextCustomClick, @NonNull Button skip, @NonNull AppIntroViewPager viewPager) {
        this.rootView = rootView;
        this.back = back;
        this.background = background;
        this.createPlanTitle = createPlanTitle;
        this.done = done;
        this.indicatorContainer = indicatorContainer;
        this.next = next;
        this.nextCustomClick = nextCustomClick;
        this.skip = skip;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ActivityCoachCreatePlanBinding bind(@NonNull View rootView) {
        int r0 = R.id.back;
        ImageButton r4 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.back);
        if (r4 == null) goto L21;
        RelativeLayout r3 = (RelativeLayout) rootView;
        r0 = R.id.create_plan_title;
        View r1 = ViewBindings.findChildViewById(rootView, R.id.create_plan_title);
        if (r1 == null) goto L21;
        LayoutTitleIvTvIvBinding r6 = LayoutTitleIvTvIvBinding.bind(r1);
        r0 = R.id.done;
        Button r7 = (Button) ViewBindings.findChildViewById(rootView, R.id.done);
        if (r7 == null) goto L21;
        r0 = R.id.indicator_container;
        FrameLayout r8 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.indicator_container);
        if (r8 == null) goto L21;
        r0 = R.id.next;
        Button r9 = (Button) ViewBindings.findChildViewById(rootView, R.id.next);
        if (r9 == null) goto L21;
        r0 = R.id.next_custom_click;
        Button r10 = (Button) ViewBindings.findChildViewById(rootView, R.id.next_custom_click);
        if (r10 == null) goto L21;
        r0 = R.id.skip;
        Button r11 = (Button) ViewBindings.findChildViewById(rootView, R.id.skip);
        if (r11 == null) goto L21;
        r0 = R.id.view_pager;
        AppIntroViewPager r12 = (AppIntroViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
        if (r12 == null) goto L21;
        return new ActivityCoachCreatePlanBinding(r3, r4, r3, r6, r7, r8, r9, r10, r11, r12);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityCoachCreatePlanBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityCoachCreatePlanBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_coach_create_plan, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
