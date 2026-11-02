package com.sma.smartv3.p610ui.sport.course;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Html;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.ScreenUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.sma.smartv3.model.ProgressMarkers;
import com.sma.smartv3.p610ui.sport.course.CourseIntroduceFragment;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CourseIntroduceFragment extends BaseFragment {
    private ProgressMarkers mProgressMarkers;

    @aa1
    private final Lazy mRoundPicImage$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1i1i0XO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseIntroduceFragment.mRoundPicImage_delegate$lambda$0(this.f1484IO);
        }
    });

    @aa1
    private final Lazy mTitleTextView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0iIXX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseIntroduceFragment.mTitleTextView_delegate$lambda$0(this.f2589IO);
        }
    });

    @aa1
    private final Lazy mIntroduceTextView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1Ii1001X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseIntroduceFragment.mIntroduceTextView_delegate$lambda$0(this.f7592IO);
        }
    });

    public static final class OXO1 extends SimpleTarget<Bitmap> {
        public OXO1() {
        }

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
            Intrinsics.X0O(resource, "resource");
            CourseIntroduceFragment.this.setLayoutHeight(resource.getWidth(), resource.getHeight());
            CourseIntroduceFragment.this.getMRoundPicImage().setImageBitmap(resource);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mIntroduceTextView_delegate$lambda$0(CourseIntroduceFragment courseIntroduceFragment) {
        return (TextView) courseIntroduceFragment.getMView().findViewById(R.id.item_special_course_introduce);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mRoundPicImage_delegate$lambda$0(CourseIntroduceFragment courseIntroduceFragment) {
        return (ImageView) courseIntroduceFragment.getMView().findViewById(R.id.item_special_course_pic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTitleTextView_delegate$lambda$0(CourseIntroduceFragment courseIntroduceFragment) {
        return (TextView) courseIntroduceFragment.getMView().findViewById(R.id.item_special_course_title);
    }

    public final TextView getMIntroduceTextView() {
        return (TextView) this.mIntroduceTextView$delegate.getValue();
    }

    public final ImageView getMRoundPicImage() {
        return (ImageView) this.mRoundPicImage$delegate.getValue();
    }

    public final TextView getMTitleTextView() {
        return (TextView) this.mTitleTextView$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.model.ProgressMarkers");
        this.mProgressMarkers = (ProgressMarkers) mArg3;
    }

    public final void initImage() {
        RequestBuilder<Bitmap> requestBuilderAsBitmap = Glide.with(getMRoundPicImage().getContext()).asBitmap();
        ProgressMarkers progressMarkers = this.mProgressMarkers;
        if (progressMarkers == null) {
            Intrinsics.XXO("mProgressMarkers");
            progressMarkers = null;
        }
        requestBuilderAsBitmap.load(progressMarkers.getCoverUrl()).into(new OXO1());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        initImage();
        TextView mTitleTextView = getMTitleTextView();
        ProgressMarkers progressMarkers = this.mProgressMarkers;
        ProgressMarkers progressMarkers2 = null;
        if (progressMarkers == null) {
            Intrinsics.XXO("mProgressMarkers");
            progressMarkers = null;
        }
        mTitleTextView.setText(progressMarkers.getTitle());
        TextView mIntroduceTextView = getMIntroduceTextView();
        ProgressMarkers progressMarkers3 = this.mProgressMarkers;
        if (progressMarkers3 == null) {
            Intrinsics.XXO("mProgressMarkers");
        } else {
            progressMarkers2 = progressMarkers3;
        }
        mIntroduceTextView.setText(Html.fromHtml(progressMarkers2.getDescribe()));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_course_introduce;
    }

    public final void setLayoutHeight(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getMRoundPicImage().getLayoutParams();
        layoutParams.height = (ScreenUtils.getAppScreenWidth() * i2) / i;
        getMRoundPicImage().setLayoutParams(layoutParams);
    }
}
