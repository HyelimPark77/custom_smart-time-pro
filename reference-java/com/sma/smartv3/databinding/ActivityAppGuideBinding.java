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
public final class ActivityAppGuideBinding implements ViewBinding {

    @NonNull
    public final ImageButton back;

    @NonNull
    public final RelativeLayout background;

    @NonNull
    public final Button done;

    @NonNull
    public final FrameLayout indicatorContainer;

    @NonNull
    public final Button next;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final Button skip;

    @NonNull
    public final AppIntroViewPager viewPager;

    private ActivityAppGuideBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton back, @NonNull RelativeLayout background, @NonNull Button done, @NonNull FrameLayout indicatorContainer, @NonNull Button next, @NonNull Button skip, @NonNull AppIntroViewPager viewPager) {
        this.rootView = rootView;
        this.back = back;
        this.background = background;
        this.done = done;
        this.indicatorContainer = indicatorContainer;
        this.next = next;
        this.skip = skip;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ActivityAppGuideBinding bind(@NonNull View rootView) {
        int i = R.id.back;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.back);
        if (imageButton != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView;
            i = R.id.done;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.done);
            if (button != null) {
                i = R.id.indicator_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.indicator_container);
                if (frameLayout != null) {
                    i = R.id.next;
                    Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.next);
                    if (button2 != null) {
                        i = R.id.skip;
                        Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.skip);
                        if (button3 != null) {
                            i = R.id.view_pager;
                            AppIntroViewPager appIntroViewPager = (AppIntroViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
                            if (appIntroViewPager != null) {
                                return new ActivityAppGuideBinding(relativeLayout, imageButton, relativeLayout, button, frameLayout, button2, button3, appIntroViewPager);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAppGuideBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAppGuideBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_app_guide, parent, false);
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
