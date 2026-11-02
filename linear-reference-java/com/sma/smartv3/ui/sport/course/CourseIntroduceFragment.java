package com.sma.smartv3.ui.sport.course;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Html;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I1i1i0XO;
import com.android.mltcode.paycertificationapi.O0iIXX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1Ii1001X;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.ScreenUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.sma.smartv3.model.ProgressMarkers;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CourseIntroduceFragment extends BaseFragment {

    @aa1
    private final Lazy mIntroduceTextView$delegate;
    private ProgressMarkers mProgressMarkers;

    @aa1
    private final Lazy mRoundPicImage$delegate;

    @aa1
    private final Lazy mTitleTextView$delegate;

    public static final class OXO1 extends SimpleTarget<Bitmap> {
        public final /* synthetic */ CourseIntroduceFragment IO;

        public OXO1(CourseIntroduceFragment r1) {
            this.IO = r1;
        }

        public void OXO1(Bitmap r3, Transition<? super Bitmap> r4) {
            Intrinsics.X0O(r3, "resource");
            this.IO.setLayoutHeight(r3.getWidth(), r3.getHeight());
            this.IO.getMRoundPicImage().setImageBitmap(r3);
        }

        @Override // com.bumptech.glide.request.target.Target
        public /* bridge */ /* synthetic */ void onResourceReady(Object r1, Transition r2) {
            OXO1((Bitmap) r1, r2);
        }
    }

    public CourseIntroduceFragment() {
        this.mRoundPicImage$delegate = LazyKt__LazyJVMKt.iO(new I1i1i0XO(this));
        this.mTitleTextView$delegate = LazyKt__LazyJVMKt.iO(new O0iIXX(this));
        this.mIntroduceTextView$delegate = LazyKt__LazyJVMKt.iO(new i1Ii1001X(this));
    }

    public static /* synthetic */ TextView XIi00iiXO(CourseIntroduceFragment r0) {
        return mTitleTextView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XO0O10(CourseIntroduceFragment r0) {
        return mIntroduceTextView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iO(CourseIntroduceFragment r0) {
        return mRoundPicImage_delegate$lambda$0(r0);
    }

    private static final TextView mIntroduceTextView_delegate$lambda$0(CourseIntroduceFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.item_special_course_introduce);
    }

    private static final ImageView mRoundPicImage_delegate$lambda$0(CourseIntroduceFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.item_special_course_pic);
    }

    private static final TextView mTitleTextView_delegate$lambda$0(CourseIntroduceFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.item_special_course_title);
    }

    public final TextView getMIntroduceTextView() {
        return (TextView) getValue();
    }

    public final ImageView getMRoundPicImage() {
        return (ImageView) getValue();
    }

    public final TextView getMTitleTextView() {
        return (TextView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        Serializable r3 = getMArg3();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.sma.smartv3.model.ProgressMarkers");
        this.mProgressMarkers = (ProgressMarkers) r3;
    }

    public final void initImage() {
        RequestBuilder<Bitmap> r0 = Glide.with(getMRoundPicImage().getContext()).asBitmap();
        ProgressMarkers r1 = this.mProgressMarkers;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mProgressMarkers");
        r1 = null;
    L5:
        r0.load(r1.getCoverUrl()).into(new OXO1(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        initImage();
        TextView r0 = getMTitleTextView();
        ProgressMarkers r1 = this.mProgressMarkers;
        ProgressMarkers r2 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mProgressMarkers");
        r1 = null;
    L5:
        r0.setText(r1.getTitle());
        TextView r3 = getMIntroduceTextView();
        ProgressMarkers r4 = this.mProgressMarkers;
        if (r4 != null) goto L8;
        Intrinsics.XXO("mProgressMarkers");
    L9:
        r3.setText(Html.fromHtml(r2.getDescribe()));
        return;
    L8:
        r2 = r4;
        goto L9
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_course_introduce;
    }

    public final void setLayoutHeight(int r3, int r4) {
        ViewGroup.LayoutParams r0 = getMRoundPicImage().getLayoutParams();
        r0.height = (ScreenUtils.getAppScreenWidth() * r4) / r3;
        getMRoundPicImage().setLayoutParams(r0);
    }
}
