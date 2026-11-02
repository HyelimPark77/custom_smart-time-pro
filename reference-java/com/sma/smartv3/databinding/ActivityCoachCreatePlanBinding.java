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
        int i = R.id.back;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.back);
        if (imageButton != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView;
            i = R.id.create_plan_title;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.create_plan_title);
            if (viewFindChildViewById != null) {
                LayoutTitleIvTvIvBinding layoutTitleIvTvIvBindingBind = LayoutTitleIvTvIvBinding.bind(viewFindChildViewById);
                i = R.id.done;
                Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.done);
                if (button != null) {
                    i = R.id.indicator_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.indicator_container);
                    if (frameLayout != null) {
                        i = R.id.next;
                        Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.next);
                        if (button2 != null) {
                            i = R.id.next_custom_click;
                            Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.next_custom_click);
                            if (button3 != null) {
                                i = R.id.skip;
                                Button button4 = (Button) ViewBindings.findChildViewById(rootView, R.id.skip);
                                if (button4 != null) {
                                    i = R.id.view_pager;
                                    AppIntroViewPager appIntroViewPager = (AppIntroViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
                                    if (appIntroViewPager != null) {
                                        return new ActivityCoachCreatePlanBinding(relativeLayout, imageButton, relativeLayout, layoutTitleIvTvIvBindingBind, button, frameLayout, button2, button3, button4, appIntroViewPager);
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
    public static ActivityCoachCreatePlanBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCoachCreatePlanBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_coach_create_plan, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
