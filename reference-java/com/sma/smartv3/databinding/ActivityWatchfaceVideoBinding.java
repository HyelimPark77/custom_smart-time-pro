package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.ViewPagerForScrollView;
import com.sma.smartv3.view.dial.DialElementView;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityWatchfaceVideoBinding implements ViewBinding {

    @NonNull
    public final DialElementView controlViewCa;

    @NonNull
    public final DialElementView controlViewDis;

    @NonNull
    public final DialElementView controlViewHr;

    @NonNull
    public final DialElementView controlViewStep;

    @NonNull
    public final ImageViewRound customizeDialBg;

    @NonNull
    public final EditText etFrameEdit;

    @NonNull
    public final ImageView ivFrameAdd;

    @NonNull
    public final ImageView ivFrameReduce;

    @NonNull
    public final NestedScrollView nestedScrollView;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final TabLayout table;

    @NonNull
    public final DialElementView timeDigitalView;

    @NonNull
    public final ImageView timePointView;

    @NonNull
    public final ImageView timeScaleView;

    @NonNull
    public final TextView tvMaxCount;

    @NonNull
    public final ViewPagerForScrollView viewPager;

    @NonNull
    public final CardView watchfaceView;

    private ActivityWatchfaceVideoBinding(@NonNull LinearLayout rootView_, @NonNull DialElementView controlViewCa, @NonNull DialElementView controlViewDis, @NonNull DialElementView controlViewHr, @NonNull DialElementView controlViewStep, @NonNull ImageViewRound customizeDialBg, @NonNull EditText etFrameEdit, @NonNull ImageView ivFrameAdd, @NonNull ImageView ivFrameReduce, @NonNull NestedScrollView nestedScrollView, @NonNull LinearLayout rootView, @NonNull TabLayout table, @NonNull DialElementView timeDigitalView, @NonNull ImageView timePointView, @NonNull ImageView timeScaleView, @NonNull TextView tvMaxCount, @NonNull ViewPagerForScrollView viewPager, @NonNull CardView watchfaceView) {
        this.rootView_ = rootView_;
        this.controlViewCa = controlViewCa;
        this.controlViewDis = controlViewDis;
        this.controlViewHr = controlViewHr;
        this.controlViewStep = controlViewStep;
        this.customizeDialBg = customizeDialBg;
        this.etFrameEdit = etFrameEdit;
        this.ivFrameAdd = ivFrameAdd;
        this.ivFrameReduce = ivFrameReduce;
        this.nestedScrollView = nestedScrollView;
        this.rootView = rootView;
        this.table = table;
        this.timeDigitalView = timeDigitalView;
        this.timePointView = timePointView;
        this.timeScaleView = timeScaleView;
        this.tvMaxCount = tvMaxCount;
        this.viewPager = viewPager;
        this.watchfaceView = watchfaceView;
    }

    @NonNull
    public static ActivityWatchfaceVideoBinding bind(@NonNull View rootView) {
        int i = R.id.controlViewCa;
        DialElementView dialElementView = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewCa);
        if (dialElementView != null) {
            i = R.id.controlViewDis;
            DialElementView dialElementView2 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewDis);
            if (dialElementView2 != null) {
                i = R.id.controlViewHr;
                DialElementView dialElementView3 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewHr);
                if (dialElementView3 != null) {
                    i = R.id.controlViewStep;
                    DialElementView dialElementView4 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.controlViewStep);
                    if (dialElementView4 != null) {
                        i = R.id.customizeDialBg;
                        ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.customizeDialBg);
                        if (imageViewRound != null) {
                            i = R.id.et_frame_edit;
                            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_frame_edit);
                            if (editText != null) {
                                i = R.id.iv_frame_add;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_frame_add);
                                if (imageView != null) {
                                    i = R.id.iv_frame_reduce;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_frame_reduce);
                                    if (imageView2 != null) {
                                        i = R.id.nestedScrollView;
                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.nestedScrollView);
                                        if (nestedScrollView != null) {
                                            LinearLayout linearLayout = (LinearLayout) rootView;
                                            i = R.id.table;
                                            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(rootView, R.id.table);
                                            if (tabLayout != null) {
                                                i = R.id.timeDigitalView;
                                                DialElementView dialElementView5 = (DialElementView) ViewBindings.findChildViewById(rootView, R.id.timeDigitalView);
                                                if (dialElementView5 != null) {
                                                    i = R.id.timePointView;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.timePointView);
                                                    if (imageView3 != null) {
                                                        i = R.id.timeScaleView;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.timeScaleView);
                                                        if (imageView4 != null) {
                                                            i = R.id.tv_max_count;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_max_count);
                                                            if (textView != null) {
                                                                i = R.id.view_pager;
                                                                ViewPagerForScrollView viewPagerForScrollView = (ViewPagerForScrollView) ViewBindings.findChildViewById(rootView, R.id.view_pager);
                                                                if (viewPagerForScrollView != null) {
                                                                    i = R.id.watchface_view;
                                                                    CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.watchface_view);
                                                                    if (cardView != null) {
                                                                        return new ActivityWatchfaceVideoBinding(linearLayout, dialElementView, dialElementView2, dialElementView3, dialElementView4, imageViewRound, editText, imageView, imageView2, nestedScrollView, linearLayout, tabLayout, dialElementView5, imageView3, imageView4, textView, viewPagerForScrollView, cardView);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityWatchfaceVideoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityWatchfaceVideoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_watchface_video, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
