package com.sma.smartv3.ui.sport.course;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IIii1X;
import com.android.mltcode.paycertificationapi.IOXOO0iO;
import com.android.mltcode.paycertificationapi.IXI00iI1;
import com.android.mltcode.paycertificationapi.IXX0I11;
import com.android.mltcode.paycertificationapi.IiIXXX;
import com.android.mltcode.paycertificationapi.O0OI1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O0XOIX1;
import com.android.mltcode.paycertificationapi.O11XiX;
import com.android.mltcode.paycertificationapi.O1XXOII;
import com.android.mltcode.paycertificationapi.OOO010;
import com.android.mltcode.paycertificationapi.OOiI11;
import com.android.mltcode.paycertificationapi.OXIiXi1I0;
import com.android.mltcode.paycertificationapi.X00X001;
import com.android.mltcode.paycertificationapi.X10Oi10;
import com.android.mltcode.paycertificationapi.XI1Ii0O1I;
import com.android.mltcode.paycertificationapi.XIXO0i;
import com.android.mltcode.paycertificationapi.XIiI1i;
import com.android.mltcode.paycertificationapi.XOIOI0iI;
import com.android.mltcode.paycertificationapi.XX1O0iOXi;
import com.android.mltcode.paycertificationapi.XX1iO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.at;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i0IOXiI;
import com.android.mltcode.paycertificationapi.i0XXiO0i;
import com.android.mltcode.paycertificationapi.i1000i00;
import com.android.mltcode.paycertificationapi.i1Ii010;
import com.android.mltcode.paycertificationapi.i1OIXXO0;
import com.android.mltcode.paycertificationapi.iI1001X;
import com.android.mltcode.paycertificationapi.iII11II;
import com.android.mltcode.paycertificationapi.iIIOIXXI;
import com.android.mltcode.paycertificationapi.iIOiX;
import com.android.mltcode.paycertificationapi.iOO011OXI;
import com.android.mltcode.paycertificationapi.iOi0O;
import com.android.mltcode.paycertificationapi.iOiXXO;
import com.android.mltcode.paycertificationapi.iii111O1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.CourseDetails;
import com.sma.smartv3.model.ProgressMarkers;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.UserInfoActivity;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.PFBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCompleteCourseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompleteCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/CompleteCourseActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,252:1\n19#2:253\n15#2:254\n1#3:255\n1#3:259\n69#4,3:256\n72#4,5:260\n*S KotlinDebug\n*F\n+ 1 CompleteCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/CompleteCourseActivity\n*L\n125#1:253\n125#1:254\n123#1:259\n123#1:256,3\n123#1:260,5\n*E\n"})
public final class CompleteCourseActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleRight$delegate;
    private CourseDetails mCourseDetails;

    @aa1
    private final Lazy mCourseDiff$delegate;

    @aa1
    private final Lazy mCourseHeat$delegate;

    @aa1
    private final Lazy mCourseName$delegate;

    @aa1
    private final Lazy mCourseNumber$delegate;

    @aa1
    private final Lazy mCourseTime$delegate;

    @aa1
    private final Lazy mDateTime$delegate;

    @aa1
    private final Lazy mDeviceImg$delegate;

    @aa1
    private final Lazy mDeviceName$delegate;

    @aa1
    private final Lazy mDeviceQRCode$delegate;

    @aa1
    private final Lazy mDeviceQRCodeLayout$delegate;

    @aa1
    private final Lazy mDeviceSources$delegate;
    private final int mFeel;

    @aa1
    private final Lazy mRecyclerView$delegate;

    @aa1
    private final Lazy mRelativeLayout$delegate;

    @aa1
    private final Lazy mRoundPicImage$delegate;

    @aa1
    private final Lazy mTrainingExperience$delegate;

    @aa1
    private final Lazy mTrainingExperienceResult$delegate;

    @aa1
    private final Lazy mTrainingExperienceResultImg$delegate;

    @aa1
    private final Lazy mTrainingExperienceResultTv$delegate;

    @aa1
    private final Lazy mTrainingExperienceSelect$delegate;

    @aa1
    private final Lazy mTrainingExperienceSelect1$delegate;

    @aa1
    private final Lazy mTrainingExperienceSelect2$delegate;

    @aa1
    private final Lazy mTrainingExperienceSelect3$delegate;

    @aa1
    private final Lazy mTrainingExperienceSelect4$delegate;

    @aa1
    private final Lazy mTrainingExperienceSelect5$delegate;

    @aa1
    private final Lazy mUserAvatar$delegate;

    @aa1
    private final Lazy mUserNickname$delegate;

    public static final class OXO1 extends SimpleTarget<Bitmap> {
        public final /* synthetic */ CompleteCourseActivity IO;

        public OXO1(CompleteCourseActivity r1) {
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

    public CompleteCourseActivity() {
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new IOXOO0iO(this));
        this.mUserAvatar$delegate = LazyKt__LazyJVMKt.iO(new i0XXiO0i(this));
        this.mUserNickname$delegate = LazyKt__LazyJVMKt.iO(new iOO011OXI(this));
        this.mDateTime$delegate = LazyKt__LazyJVMKt.iO(new X00X001(this));
        this.mRelativeLayout$delegate = LazyKt__LazyJVMKt.iO(new XOIOI0iI(this));
        this.mRoundPicImage$delegate = LazyKt__LazyJVMKt.iO(new O0XOIX1(this));
        this.mCourseName$delegate = LazyKt__LazyJVMKt.iO(new XIiI1i(this));
        this.mCourseDiff$delegate = LazyKt__LazyJVMKt.iO(new iOiXXO(this));
        this.mCourseTime$delegate = LazyKt__LazyJVMKt.iO(new i1000i00(this));
        this.mCourseHeat$delegate = LazyKt__LazyJVMKt.iO(new i1OIXXO0(this));
        this.mCourseNumber$delegate = LazyKt__LazyJVMKt.iO(new iI1001X(this));
        this.mRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new iIOiX(this));
        this.mTrainingExperience$delegate = LazyKt__LazyJVMKt.iO(new X10Oi10(this));
        this.mTrainingExperienceSelect$delegate = LazyKt__LazyJVMKt.iO(new iii111O1(this));
        this.mTrainingExperienceSelect1$delegate = LazyKt__LazyJVMKt.iO(new O0OI1(this));
        this.mTrainingExperienceSelect2$delegate = LazyKt__LazyJVMKt.iO(new OXIiXi1I0(this));
        this.mTrainingExperienceSelect3$delegate = LazyKt__LazyJVMKt.iO(new XX1O0iOXi(this));
        this.mTrainingExperienceSelect4$delegate = LazyKt__LazyJVMKt.iO(new O1XXOII(this));
        this.mTrainingExperienceSelect5$delegate = LazyKt__LazyJVMKt.iO(new XI1Ii0O1I(this));
        this.mTrainingExperienceResult$delegate = LazyKt__LazyJVMKt.iO(new XIXO0i(this));
        this.mTrainingExperienceResultImg$delegate = LazyKt__LazyJVMKt.iO(new XX1iO(this));
        this.mTrainingExperienceResultTv$delegate = LazyKt__LazyJVMKt.iO(new OOO010(this));
        this.mDeviceSources$delegate = LazyKt__LazyJVMKt.iO(new O11XiX(this));
        this.mDeviceImg$delegate = LazyKt__LazyJVMKt.iO(new IXI00iI1(this));
        this.mDeviceName$delegate = LazyKt__LazyJVMKt.iO(new i1Ii010(this));
        this.mDeviceQRCode$delegate = LazyKt__LazyJVMKt.iO(new OOiI11(this));
        this.mDeviceQRCodeLayout$delegate = LazyKt__LazyJVMKt.iO(new iOi0O(this));
    }

    public static /* synthetic */ LinearLayout I0iXXO(CompleteCourseActivity r0) {
        return mTrainingExperienceSelect4_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout I1(CompleteCourseActivity r0) {
        return mTrainingExperienceSelect3_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFBold I1XOi1(CompleteCourseActivity r0) {
        return mCourseName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void II1Xi0(CompleteCourseActivity r0, View r1) {
        trainingExperienceSelect$lambda$3(r0, r1);
    }

    public static /* synthetic */ RelativeLayout IIX1OXO(CompleteCourseActivity r0) {
        return mRelativeLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium IXXOO(CompleteCourseActivity r0) {
        return mCourseNumber_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O10IXXX0X(CompleteCourseActivity r0) {
        return mDeviceName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView O1O(CompleteCourseActivity r0) {
        return mRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OII(CompleteCourseActivity r0) {
        return mDeviceImg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout OIX0iXi(CompleteCourseActivity r0) {
        return mTrainingExperience_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OX(CompleteCourseActivity r0) {
        return mTrainingExperienceResultTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OiIIX101O(CompleteCourseActivity r0, View r1) {
        trainingExperienceSelect$lambda$4(r0, r1);
    }

    public static /* synthetic */ LinearLayout X01IiOiIi(CompleteCourseActivity r0) {
        return mTrainingExperienceResult_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X0O(CompleteCourseActivity r0) {
        return mDeviceQRCode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium X0i1O(CompleteCourseActivity r0) {
        return mUserNickname_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout X11iII1O1(CompleteCourseActivity r0) {
        return mTrainingExperienceSelect1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1IX(CompleteCourseActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ ImageView X1ii(CompleteCourseActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XX0(CompleteCourseActivity r0) {
        return mTrainingExperienceSelect5_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXI(CompleteCourseActivity r0, View r1) {
        trainingExperienceSelect$lambda$1(r0, r1);
    }

    public static /* synthetic */ void XXIIO1i11(CompleteCourseActivity r0, View r1) {
        trainingExperienceSelect$lambda$2(r0, r1);
    }

    public static /* synthetic */ LinearLayout XXX11i(CompleteCourseActivity r0) {
        return mDeviceSources_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIO(CompleteCourseActivity r0, View r1) {
        trainingExperienceSelect$lambda$0(r0, r1);
    }

    public static /* synthetic */ LinearLayout XiOIii1(CompleteCourseActivity r0) {
        return mTrainingExperienceSelect2_delegate$lambda$0(r0);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(CompleteCourseActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private final void avatarShow() {
        getMUserAvatar().setImageDrawable(gk4.XOO0ii0(getMUserAvatar().getContext(), R.drawable.pic_avatar_default));
        sz0 r0 = sz0.OXO1;
        if (uz0.OIi0(r0).exists() == false) goto L6;
        getMUserAvatar().setImageURI(Uri.fromFile(uz0.OIi0(r0)));
        return;
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final PFMedium getMDateTime() {
        return (PFMedium) getValue();
    }

    private final ImageView getMDeviceImg() {
        return (ImageView) getValue();
    }

    private final TextView getMDeviceName() {
        return (TextView) getValue();
    }

    private final ImageView getMDeviceQRCode() {
        return (ImageView) getValue();
    }

    private final LinearLayout getMDeviceQRCodeLayout() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getMDeviceSources() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getMTrainingExperience() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getMTrainingExperienceResult() {
        return (LinearLayout) getValue();
    }

    private final ImageView getMTrainingExperienceResultImg() {
        return (ImageView) getValue();
    }

    private final TextView getMTrainingExperienceResultTv() {
        return (TextView) getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect1() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect2() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect3() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect4() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect5() {
        return (LinearLayout) getValue();
    }

    private final ImageViewRound getMUserAvatar() {
        return (ImageViewRound) getValue();
    }

    private final PFMedium getMUserNickname() {
        return (PFMedium) getValue();
    }

    public static /* synthetic */ LinearLayout i010I(CompleteCourseActivity r0) {
        return mDeviceQRCodeLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageViewRound iI(CompleteCourseActivity r0) {
        return mUserAvatar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium iIXi1iiXI(CompleteCourseActivity r0) {
        return mDateTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout iIiiO(CompleteCourseActivity r0) {
        return mTrainingExperienceSelect_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium iOO1ii1(CompleteCourseActivity r0) {
        return mCourseHeat_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium iOOX010X(CompleteCourseActivity r0) {
        return mCourseDiff_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageViewRound iX(CompleteCourseActivity r0) {
        return mRoundPicImage_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iX1O1(CompleteCourseActivity r0) {
        return mTrainingExperienceResultImg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium iXiX011(CompleteCourseActivity r0) {
        return mCourseTime_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(CompleteCourseActivity r1, View r2) {
        r1.startActivity(new Intent(r1, UserInfoActivity.class));
    }

    private static final PFMedium mCourseDiff_delegate$lambda$0(CompleteCourseActivity r1) {
        return (PFMedium) r1.findViewById(R.id.course_details_diff);
    }

    private static final PFMedium mCourseHeat_delegate$lambda$0(CompleteCourseActivity r1) {
        return (PFMedium) r1.findViewById(R.id.course_details_heat);
    }

    private static final PFBold mCourseName_delegate$lambda$0(CompleteCourseActivity r1) {
        return (PFBold) r1.findViewById(R.id.course_details_name);
    }

    private static final PFMedium mCourseNumber_delegate$lambda$0(CompleteCourseActivity r1) {
        return (PFMedium) r1.findViewById(R.id.course_name_number);
    }

    private static final PFMedium mCourseTime_delegate$lambda$0(CompleteCourseActivity r1) {
        return (PFMedium) r1.findViewById(R.id.course_details_time);
    }

    private static final PFMedium mDateTime_delegate$lambda$0(CompleteCourseActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_timne);
    }

    private static final ImageView mDeviceImg_delegate$lambda$0(CompleteCourseActivity r1) {
        return (ImageView) r1.findViewById(R.id.device_img);
    }

    private static final TextView mDeviceName_delegate$lambda$0(CompleteCourseActivity r1) {
        return (TextView) r1.findViewById(R.id.device_name);
    }

    private static final LinearLayout mDeviceQRCodeLayout_delegate$lambda$0(CompleteCourseActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.device_qr_code_ll);
    }

    private static final ImageView mDeviceQRCode_delegate$lambda$0(CompleteCourseActivity r1) {
        return (ImageView) r1.findViewById(R.id.device_qr_code);
    }

    private static final LinearLayout mDeviceSources_delegate$lambda$0(CompleteCourseActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.device_sources);
    }

    private static final RecyclerView mRecyclerView_delegate$lambda$0(CompleteCourseActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.course_recycler);
    }

    private static final RelativeLayout mRelativeLayout_delegate$lambda$0(CompleteCourseActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.course_details_pic_layout);
    }

    private static final ImageViewRound mRoundPicImage_delegate$lambda$0(CompleteCourseActivity r1) {
        return (ImageViewRound) r1.findViewById(R.id.course_details_pic);
    }

    private static final ImageView mTrainingExperienceResultImg_delegate$lambda$0(CompleteCourseActivity r1) {
        return (ImageView) r1.findViewById(R.id.training_experience_img_result);
    }

    private static final TextView mTrainingExperienceResultTv_delegate$lambda$0(CompleteCourseActivity r1) {
        return (TextView) r1.findViewById(R.id.training_experience_tv_result);
    }

    private static final LinearLayout mTrainingExperienceResult_delegate$lambda$0(CompleteCourseActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.training_experience_layout_result);
    }

    private static final LinearLayout mTrainingExperienceSelect1_delegate$lambda$0(CompleteCourseActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.training_experience_layout_1);
    }

    private static final LinearLayout mTrainingExperienceSelect2_delegate$lambda$0(CompleteCourseActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.training_experience_layout_2);
    }

    private static final LinearLayout mTrainingExperienceSelect3_delegate$lambda$0(CompleteCourseActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.training_experience_layout_3);
    }

    private static final LinearLayout mTrainingExperienceSelect4_delegate$lambda$0(CompleteCourseActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.training_experience_layout_4);
    }

    private static final LinearLayout mTrainingExperienceSelect5_delegate$lambda$0(CompleteCourseActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.training_experience_layout_5);
    }

    private static final LinearLayout mTrainingExperienceSelect_delegate$lambda$0(CompleteCourseActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.training_experience_layout_select);
    }

    private static final LinearLayout mTrainingExperience_delegate$lambda$0(CompleteCourseActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.training_experience_layout);
    }

    private static final ImageViewRound mUserAvatar_delegate$lambda$0(CompleteCourseActivity r1) {
        return (ImageViewRound) r1.findViewById(R.id.iv_avatar);
    }

    private static final PFMedium mUserNickname_delegate$lambda$0(CompleteCourseActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_nickname);
    }

    private final void setTrainingExperience(int r3) {
        findViewById(R.id.training_experience_hint_tv).setVisibility(8);
        getMTrainingExperienceSelect().setVisibility(8);
        getMTrainingExperienceResult().setVisibility(0);
        getMTrainingExperienceResultImg().setImageResource(getTrainingExperienceImage(this, r3));
        getMTrainingExperienceResultTv().setText(getString(getTrainingExperienceName(this, r3)));
        getMTrainingExperience().setBackgroundResource(R.drawable.ripple_training_experience_bg);
    }

    private final void trainingExperienceSelect() {
        int r0 = this.mFeel;
        if (r0 <= 0) goto L6;
        setTrainingExperience(r0);
        return;
    L6:
        getMTrainingExperienceSelect().setVisibility(0);
        getMTrainingExperienceResult().setVisibility(8);
        getMTrainingExperienceSelect1().setOnClickListener(new IiIXXX(this));
        getMTrainingExperienceSelect2().setOnClickListener(new IXX0I11(this));
        getMTrainingExperienceSelect3().setOnClickListener(new iII11II(this));
        getMTrainingExperienceSelect4().setOnClickListener(new IIii1X(this));
        getMTrainingExperienceSelect5().setOnClickListener(new iIIOIXXI(this));
    }

    private static final void trainingExperienceSelect$lambda$0(CompleteCourseActivity r0, View r1) {
        r0.trainingSelectListener(1);
    }

    private static final void trainingExperienceSelect$lambda$1(CompleteCourseActivity r0, View r1) {
        r0.trainingSelectListener(2);
    }

    private static final void trainingExperienceSelect$lambda$2(CompleteCourseActivity r0, View r1) {
        r0.trainingSelectListener(3);
    }

    private static final void trainingExperienceSelect$lambda$3(CompleteCourseActivity r0, View r1) {
        r0.trainingSelectListener(4);
    }

    private static final void trainingExperienceSelect$lambda$4(CompleteCourseActivity r0, View r1) {
        r0.trainingSelectListener(5);
    }

    private final void trainingSelectListener(int r2) {
        setTrainingExperience(r2);
        I01XX0.OXO1(I01XX0.XXiO0i, Integer.valueOf(r2));
    }

    public final PFMedium getMCourseDiff() {
        return (PFMedium) getValue();
    }

    public final PFMedium getMCourseHeat() {
        return (PFMedium) getValue();
    }

    public final PFBold getMCourseName() {
        return (PFBold) getValue();
    }

    public final PFMedium getMCourseNumber() {
        return (PFMedium) getValue();
    }

    public final PFMedium getMCourseTime() {
        return (PFMedium) getValue();
    }

    public final int getMFeel() {
        return this.mFeel;
    }

    public final RecyclerView getMRecyclerView() {
        return (RecyclerView) getValue();
    }

    public final RelativeLayout getMRelativeLayout() {
        return (RelativeLayout) getValue();
    }

    public final ImageViewRound getMRoundPicImage() {
        return (ImageViewRound) getValue();
    }

    public final int getTrainingExperienceImage(@aa1 Context r4, int r5) {
        Intrinsics.X0O(r4, "mContext");
        return r4.getResources().getIdentifier("icon_training_experience_" + r5, "drawable", r4.getPackageName());
    L5:
        e = move-exception;
        e.printStackTrace();
        return R.drawable.icon_training_experience_1;
    }

    public final int getTrainingExperienceName(@aa1 Context r4, int r5) {
        Intrinsics.X0O(r4, "mContext");
        return r4.getResources().getIdentifier("training_experience_" + r5, TypedValues.Custom.S_STRING, r4.getPackageName());
    L5:
        e = move-exception;
        e.printStackTrace();
        return R.string.training_experience_1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        Serializable r3 = getMArg3();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.sma.smartv3.model.CourseDetails");
        this.mCourseDetails = (CourseDetails) r3;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText("(功能开发中..)");
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.icon_course_share);
        getMUserAvatar().setOnClickListener(new i0IOXiI(this));
        PFMedium r1 = getMUserNickname();
        SPUtils r3 = a01.OXO1.IiI10X();
        Object r4 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r5 = new Gson().fromJson(r3.getString(AppUser.class.getName()), AppUser.class);
        if (r5 == null) goto L6;
        r4 = r5;
    L6:
        r1.setText(((AppUser) r4).getNickname());
        CourseDetails r6 = null;
        getMDateTime().setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date()));
        RequestBuilder<Bitmap> r2 = Glide.with(getMRoundPicImage().getContext()).asBitmap();
        CourseDetails r7 = this.mCourseDetails;
        if (r7 != null) goto L9;
        Intrinsics.XXO("mCourseDetails");
        r7 = null;
    L9:
        r2.load(r7.getCoursePic1()).into(new OXO1(this));
        PFBold r8 = getMCourseName();
        CourseDetails r9 = this.mCourseDetails;
        if (r9 != null) goto L12;
        Intrinsics.XXO("mCourseDetails");
        r9 = null;
    L12:
        r8.setText(r9.getCourseName());
        PFMedium r10 = getMCourseDiff();
        CourseDetails r11 = this.mCourseDetails;
        if (r11 != null) goto L15;
        Intrinsics.XXO("mCourseDetails");
        r11 = null;
    L15:
        r10.setText(r11.getCourseDiff());
        PFMedium r12 = getMCourseTime();
        CourseDetails r13 = this.mCourseDetails;
        if (r13 != null) goto L18;
        Intrinsics.XXO("mCourseDetails");
        r13 = null;
    L18:
        String r14 = r13.getCourseTime();
        if (r14 == null) goto L21;
        Integer r15 = Integer.valueOf(Integer.parseInt(r14) / 60);
    L22:
        r12.setText(r15 + "分钟");
        PFMedium r16 = getMCourseHeat();
        CourseDetails r17 = this.mCourseDetails;
        if (r17 != null) goto L25;
        Intrinsics.XXO("mCourseDetails");
        r17 = null;
    L25:
        r16.setText(r17.getCourseHeat() + getString(R.string.kpa));
        PFMedium r18 = getMCourseNumber();
        CourseDetails r19 = this.mCourseDetails;
        if (r19 != null) goto L28;
        Intrinsics.XXO("mCourseDetails");
        r19 = null;
    L28:
        r18.setText("课程名称:" + r19.getCourseName() + "  第一次完成");
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(getMContext(), 1, false));
        final Activity r20 = getMContext();
        CourseDetails r21 = this.mCourseDetails;
        if (r21 != null) goto L31;
        Intrinsics.XXO("mCourseDetails");
    L32:
        final List<ProgressMarkers> r22 = r6.getProgressMarkers();
        getMRecyclerView().setAdapter(new CompleteCourseActivity$initView$mAdapter$1(r20, r22));
        avatarShow();
        trainingExperienceSelect();
        setDeviceSource();
        return;
    L31:
        r6 = r21;
        goto L32
    L21:
        r15 = null;
        goto L22
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_course_complete;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        ToastUtils.showLong("功能开发中..", new Object[0]);
    }

    public final void setDeviceSource() {
        BleCache r0 = BleCache.INSTANCE;
        if (r0.getMBleName().length() != 0) goto L6;
        getMDeviceSources().setVisibility(8);
        return;
    L6:
        File r1 = uz0.X1(sz0.OXO1, r0.getMBleName(), r0.getMFirmwareFlag());
        q62 r2 = q62.OXO1;
        String r6 = r0.getMBleName();
        String r11 = r0.getMFirmwareFlag();
        int r3 = r2.iX(new BleDeviceInfo(0, null, r6, null, null, null, r0.getMPrototype(), r11, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -197, -1, -1, -1, at.IO, null));
        getMDeviceImg().setImageDrawable(getDrawable(r3));
        if (FileUtils.isFileExists(r1) == false) goto L9;
        getMDeviceImg().setImageBitmap(ImageUtils.getBitmap(r1));
    L9:
        getMDeviceName().setText(r0.getMBleName());
    }

    public final void setLayoutHeight(int r4, int r5) {
        ViewGroup.LayoutParams r0 = getMRelativeLayout().getLayoutParams();
        r0.height = ((ScreenUtils.getAppScreenWidth() - SizeUtils.dp2px(30.0f)) * r5) / r4;
        getMRelativeLayout().setLayoutParams(r0);
    }
}
