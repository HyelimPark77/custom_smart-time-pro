package com.sma.smartv3.p610ui.sport.course;

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
import com.android.mltcode.paycertificationapi.C2229at;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
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
import com.sma.smartv3.p610ui.p612me.UserInfoActivity;
import com.sma.smartv3.p610ui.sport.course.CompleteCourseActivity;
import com.sma.smartv3.pro.R;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCompleteCourseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompleteCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/CompleteCourseActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,252:1\n19#2:253\n15#2:254\n1#3:255\n1#3:259\n69#4,3:256\n72#4,5:260\n*S KotlinDebug\n*F\n+ 1 CompleteCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/CompleteCourseActivity\n*L\n125#1:253\n125#1:254\n123#1:259\n123#1:256,3\n123#1:260,5\n*E\n"})
public final class CompleteCourseActivity extends BaseActivity {
    private CourseDetails mCourseDetails;
    private final int mFeel;

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOXOO0iO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.abhTitleRight_delegate$lambda$0(this.f1875IO);
        }
    });

    @aa1
    private final Lazy mUserAvatar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0XXiO0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mUserAvatar_delegate$lambda$0(this.f7457IO);
        }
    });

    @aa1
    private final Lazy mUserNickname$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOO011OXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mUserNickname_delegate$lambda$0(this.f8093IO);
        }
    });

    @aa1
    private final Lazy mDateTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X00X001
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mDateTime_delegate$lambda$0(this.f3880IO);
        }
    });

    @aa1
    private final Lazy mRelativeLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOIOI0iI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mRelativeLayout_delegate$lambda$0(this.f4767IO);
        }
    });

    @aa1
    private final Lazy mRoundPicImage$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0XOIX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mRoundPicImage_delegate$lambda$0(this.f2557IO);
        }
    });

    @aa1
    private final Lazy mCourseName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIiI1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mCourseName_delegate$lambda$0(this.f4613IO);
        }
    });

    @aa1
    private final Lazy mCourseDiff$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOiXXO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mCourseDiff_delegate$lambda$0(this.f8203IO);
        }
    });

    @aa1
    private final Lazy mCourseTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1000i00
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mCourseTime_delegate$lambda$0(this.f7497IO);
        }
    });

    @aa1
    private final Lazy mCourseHeat$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1OIXXO0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mCourseHeat_delegate$lambda$0(this.f7624IO);
        }
    });

    @aa1
    private final Lazy mCourseNumber$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iI1001X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mCourseNumber_delegate$lambda$0(this.f7810IO);
        }
    });

    @aa1
    private final Lazy mRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIOiX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mRecyclerView_delegate$lambda$0(this.f7890IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperience$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X10Oi10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mTrainingExperience_delegate$lambda$0(this.f4156IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceSelect$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iii111O1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mTrainingExperienceSelect_delegate$lambda$0(this.f8666IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceSelect1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0OI1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mTrainingExperienceSelect1_delegate$lambda$0(this.f2497IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceSelect2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXIiXi1I0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mTrainingExperienceSelect2_delegate$lambda$0(this.f3477IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceSelect3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XX1O0iOXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mTrainingExperienceSelect3_delegate$lambda$0(this.f4989IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceSelect4$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1XXOII
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mTrainingExperienceSelect4_delegate$lambda$0(this.f2808IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceSelect5$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XI1Ii0O1I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mTrainingExperienceSelect5_delegate$lambda$0(this.f4468IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceResult$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIXO0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mTrainingExperienceResult_delegate$lambda$0(this.f4587IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceResultImg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XX1iO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mTrainingExperienceResultImg_delegate$lambda$0(this.f5008IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceResultTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOO010
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mTrainingExperienceResultTv_delegate$lambda$0(this.f3250IO);
        }
    });

    @aa1
    private final Lazy mDeviceSources$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O11XiX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mDeviceSources_delegate$lambda$0(this.f2687IO);
        }
    });

    @aa1
    private final Lazy mDeviceImg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXI00iI1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mDeviceImg_delegate$lambda$0(this.f1990IO);
        }
    });

    @aa1
    private final Lazy mDeviceName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1Ii010
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mDeviceName_delegate$lambda$0(this.f7591IO);
        }
    });

    @aa1
    private final Lazy mDeviceQRCode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOiI11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mDeviceQRCode_delegate$lambda$0(this.f3374IO);
        }
    });

    @aa1
    private final Lazy mDeviceQRCodeLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOi0O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CompleteCourseActivity.mDeviceQRCodeLayout_delegate$lambda$0(this.f8178IO);
        }
    });

    public static final class OXO1 extends SimpleTarget<Bitmap> {
        public OXO1() {
        }

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
            Intrinsics.X0O(resource, "resource");
            CompleteCourseActivity.this.setLayoutHeight(resource.getWidth(), resource.getHeight());
            CompleteCourseActivity.this.getMRoundPicImage().setImageBitmap(resource);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (ImageView) completeCourseActivity.findViewById(R.id.abh_title_right);
    }

    private final void avatarShow() {
        getMUserAvatar().setImageDrawable(gk4.XOO0ii0(getMUserAvatar().getContext(), R.drawable.pic_avatar_default));
        sz0 sz0Var = sz0.OXO1;
        if (uz0.OIi0(sz0Var).exists()) {
            getMUserAvatar().setImageURI(Uri.fromFile(uz0.OIi0(sz0Var)));
        }
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final PFMedium getMDateTime() {
        return (PFMedium) this.mDateTime$delegate.getValue();
    }

    private final ImageView getMDeviceImg() {
        return (ImageView) this.mDeviceImg$delegate.getValue();
    }

    private final TextView getMDeviceName() {
        return (TextView) this.mDeviceName$delegate.getValue();
    }

    private final ImageView getMDeviceQRCode() {
        return (ImageView) this.mDeviceQRCode$delegate.getValue();
    }

    private final LinearLayout getMDeviceQRCodeLayout() {
        return (LinearLayout) this.mDeviceQRCodeLayout$delegate.getValue();
    }

    private final LinearLayout getMDeviceSources() {
        return (LinearLayout) this.mDeviceSources$delegate.getValue();
    }

    private final LinearLayout getMTrainingExperience() {
        return (LinearLayout) this.mTrainingExperience$delegate.getValue();
    }

    private final LinearLayout getMTrainingExperienceResult() {
        return (LinearLayout) this.mTrainingExperienceResult$delegate.getValue();
    }

    private final ImageView getMTrainingExperienceResultImg() {
        return (ImageView) this.mTrainingExperienceResultImg$delegate.getValue();
    }

    private final TextView getMTrainingExperienceResultTv() {
        return (TextView) this.mTrainingExperienceResultTv$delegate.getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect() {
        return (LinearLayout) this.mTrainingExperienceSelect$delegate.getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect1() {
        return (LinearLayout) this.mTrainingExperienceSelect1$delegate.getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect2() {
        return (LinearLayout) this.mTrainingExperienceSelect2$delegate.getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect3() {
        return (LinearLayout) this.mTrainingExperienceSelect3$delegate.getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect4() {
        return (LinearLayout) this.mTrainingExperienceSelect4$delegate.getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect5() {
        return (LinearLayout) this.mTrainingExperienceSelect5$delegate.getValue();
    }

    private final ImageViewRound getMUserAvatar() {
        return (ImageViewRound) this.mUserAvatar$delegate.getValue();
    }

    private final PFMedium getMUserNickname() {
        return (PFMedium) this.mUserNickname$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(CompleteCourseActivity completeCourseActivity, View view) {
        completeCourseActivity.startActivity(new Intent(completeCourseActivity, (Class<?>) UserInfoActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mCourseDiff_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (PFMedium) completeCourseActivity.findViewById(R.id.course_details_diff);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mCourseHeat_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (PFMedium) completeCourseActivity.findViewById(R.id.course_details_heat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFBold mCourseName_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (PFBold) completeCourseActivity.findViewById(R.id.course_details_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mCourseNumber_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (PFMedium) completeCourseActivity.findViewById(R.id.course_name_number);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mCourseTime_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (PFMedium) completeCourseActivity.findViewById(R.id.course_details_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mDateTime_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (PFMedium) completeCourseActivity.findViewById(R.id.tv_timne);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mDeviceImg_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (ImageView) completeCourseActivity.findViewById(R.id.device_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mDeviceName_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (TextView) completeCourseActivity.findViewById(R.id.device_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mDeviceQRCodeLayout_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (LinearLayout) completeCourseActivity.findViewById(R.id.device_qr_code_ll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mDeviceQRCode_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (ImageView) completeCourseActivity.findViewById(R.id.device_qr_code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mDeviceSources_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (LinearLayout) completeCourseActivity.findViewById(R.id.device_sources);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerView_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (RecyclerView) completeCourseActivity.findViewById(R.id.course_recycler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout mRelativeLayout_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (RelativeLayout) completeCourseActivity.findViewById(R.id.course_details_pic_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageViewRound mRoundPicImage_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (ImageViewRound) completeCourseActivity.findViewById(R.id.course_details_pic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mTrainingExperienceResultImg_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (ImageView) completeCourseActivity.findViewById(R.id.training_experience_img_result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTrainingExperienceResultTv_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (TextView) completeCourseActivity.findViewById(R.id.training_experience_tv_result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mTrainingExperienceResult_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (LinearLayout) completeCourseActivity.findViewById(R.id.training_experience_layout_result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mTrainingExperienceSelect1_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (LinearLayout) completeCourseActivity.findViewById(R.id.training_experience_layout_1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mTrainingExperienceSelect2_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (LinearLayout) completeCourseActivity.findViewById(R.id.training_experience_layout_2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mTrainingExperienceSelect3_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (LinearLayout) completeCourseActivity.findViewById(R.id.training_experience_layout_3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mTrainingExperienceSelect4_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (LinearLayout) completeCourseActivity.findViewById(R.id.training_experience_layout_4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mTrainingExperienceSelect5_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (LinearLayout) completeCourseActivity.findViewById(R.id.training_experience_layout_5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mTrainingExperienceSelect_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (LinearLayout) completeCourseActivity.findViewById(R.id.training_experience_layout_select);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mTrainingExperience_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (LinearLayout) completeCourseActivity.findViewById(R.id.training_experience_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageViewRound mUserAvatar_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (ImageViewRound) completeCourseActivity.findViewById(R.id.iv_avatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mUserNickname_delegate$lambda$0(CompleteCourseActivity completeCourseActivity) {
        return (PFMedium) completeCourseActivity.findViewById(R.id.tv_nickname);
    }

    private final void setTrainingExperience(int i) {
        findViewById(R.id.training_experience_hint_tv).setVisibility(8);
        getMTrainingExperienceSelect().setVisibility(8);
        getMTrainingExperienceResult().setVisibility(0);
        getMTrainingExperienceResultImg().setImageResource(getTrainingExperienceImage(this, i));
        getMTrainingExperienceResultTv().setText(getString(getTrainingExperienceName(this, i)));
        getMTrainingExperience().setBackgroundResource(R.drawable.ripple_training_experience_bg);
    }

    private final void trainingExperienceSelect() {
        int i = this.mFeel;
        if (i > 0) {
            setTrainingExperience(i);
            return;
        }
        getMTrainingExperienceSelect().setVisibility(0);
        getMTrainingExperienceResult().setVisibility(8);
        getMTrainingExperienceSelect1().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IiIXXX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2245IO.trainingSelectListener(1);
            }
        });
        getMTrainingExperienceSelect2().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IXX0I11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2084IO.trainingSelectListener(2);
            }
        });
        getMTrainingExperienceSelect3().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iII11II
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7840IO.trainingSelectListener(3);
            }
        });
        getMTrainingExperienceSelect4().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IIii1X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1703IO.trainingSelectListener(4);
            }
        });
        getMTrainingExperienceSelect5().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iIIOIXXI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7853IO.trainingSelectListener(5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trainingSelectListener(int i) {
        setTrainingExperience(i);
        I01XX0.OXO1(I01XX0.XXiO0i, Integer.valueOf(i));
    }

    public final PFMedium getMCourseDiff() {
        return (PFMedium) this.mCourseDiff$delegate.getValue();
    }

    public final PFMedium getMCourseHeat() {
        return (PFMedium) this.mCourseHeat$delegate.getValue();
    }

    public final PFBold getMCourseName() {
        return (PFBold) this.mCourseName$delegate.getValue();
    }

    public final PFMedium getMCourseNumber() {
        return (PFMedium) this.mCourseNumber$delegate.getValue();
    }

    public final PFMedium getMCourseTime() {
        return (PFMedium) this.mCourseTime$delegate.getValue();
    }

    public final int getMFeel() {
        return this.mFeel;
    }

    public final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.mRecyclerView$delegate.getValue();
    }

    public final RelativeLayout getMRelativeLayout() {
        return (RelativeLayout) this.mRelativeLayout$delegate.getValue();
    }

    public final ImageViewRound getMRoundPicImage() {
        return (ImageViewRound) this.mRoundPicImage$delegate.getValue();
    }

    public final int getTrainingExperienceImage(@aa1 Context mContext, int i) {
        Intrinsics.X0O(mContext, "mContext");
        try {
            return mContext.getResources().getIdentifier("icon_training_experience_" + i, "drawable", mContext.getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return R.drawable.icon_training_experience_1;
        }
    }

    public final int getTrainingExperienceName(@aa1 Context mContext, int i) {
        Intrinsics.X0O(mContext, "mContext");
        try {
            return mContext.getResources().getIdentifier("training_experience_" + i, TypedValues.Custom.S_STRING, mContext.getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return R.string.training_experience_1;
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.model.CourseDetails");
        this.mCourseDetails = (CourseDetails) mArg3;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText("(功能开发中..)");
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.icon_course_share);
        getMUserAvatar().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.i0IOXiI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CompleteCourseActivity.initView$lambda$0(this.f7354IO, view);
            }
        });
        PFMedium mUserNickname = getMUserNickname();
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        mUserNickname.setText(((AppUser) appUser).getNickname());
        CourseDetails courseDetails = null;
        getMDateTime().setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date()));
        RequestBuilder<Bitmap> requestBuilderAsBitmap = Glide.with(getMRoundPicImage().getContext()).asBitmap();
        CourseDetails courseDetails2 = this.mCourseDetails;
        if (courseDetails2 == null) {
            Intrinsics.XXO("mCourseDetails");
            courseDetails2 = null;
        }
        requestBuilderAsBitmap.load(courseDetails2.getCoursePic1()).into(new OXO1());
        PFBold mCourseName = getMCourseName();
        CourseDetails courseDetails3 = this.mCourseDetails;
        if (courseDetails3 == null) {
            Intrinsics.XXO("mCourseDetails");
            courseDetails3 = null;
        }
        mCourseName.setText(courseDetails3.getCourseName());
        PFMedium mCourseDiff = getMCourseDiff();
        CourseDetails courseDetails4 = this.mCourseDetails;
        if (courseDetails4 == null) {
            Intrinsics.XXO("mCourseDetails");
            courseDetails4 = null;
        }
        mCourseDiff.setText(courseDetails4.getCourseDiff());
        PFMedium mCourseTime = getMCourseTime();
        CourseDetails courseDetails5 = this.mCourseDetails;
        if (courseDetails5 == null) {
            Intrinsics.XXO("mCourseDetails");
            courseDetails5 = null;
        }
        String courseTime = courseDetails5.getCourseTime();
        mCourseTime.setText((courseTime != null ? Integer.valueOf(Integer.parseInt(courseTime) / 60) : null) + "分钟");
        PFMedium mCourseHeat = getMCourseHeat();
        CourseDetails courseDetails6 = this.mCourseDetails;
        if (courseDetails6 == null) {
            Intrinsics.XXO("mCourseDetails");
            courseDetails6 = null;
        }
        mCourseHeat.setText(courseDetails6.getCourseHeat() + getString(R.string.kpa));
        PFMedium mCourseNumber = getMCourseNumber();
        CourseDetails courseDetails7 = this.mCourseDetails;
        if (courseDetails7 == null) {
            Intrinsics.XXO("mCourseDetails");
            courseDetails7 = null;
        }
        mCourseNumber.setText("课程名称:" + courseDetails7.getCourseName() + "  第一次完成");
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(getMContext(), 1, false));
        final Activity mContext = getMContext();
        CourseDetails courseDetails8 = this.mCourseDetails;
        if (courseDetails8 == null) {
            Intrinsics.XXO("mCourseDetails");
        } else {
            courseDetails = courseDetails8;
        }
        final List<ProgressMarkers> progressMarkers = courseDetails.getProgressMarkers();
        getMRecyclerView().setAdapter(new CommonAdapter<ProgressMarkers>(mContext, progressMarkers) { // from class: com.sma.smartv3.ui.sport.course.CompleteCourseActivity$initView$mAdapter$1
            @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
            public void convert(ViewHolder viewHolder, ProgressMarkers item, int i) {
                Intrinsics.X0O(viewHolder, "viewHolder");
                Intrinsics.X0O(item, "item");
                viewHolder.setText(R.id.course_number, String.valueOf(i + 1));
                viewHolder.setText(R.id.course_action_name, item.getTitle());
                viewHolder.setText(R.id.course_time, O0X11OiO.XOO0XOOii(item.getTime()));
            }
        });
        avatarShow();
        trainingExperienceSelect();
        setDeviceSource();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_course_complete;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        ToastUtils.showLong("功能开发中..", new Object[0]);
    }

    public final void setDeviceSource() {
        BleCache bleCache = BleCache.INSTANCE;
        if (bleCache.getMBleName().length() == 0) {
            getMDeviceSources().setVisibility(8);
            return;
        }
        File fileM3190X1 = uz0.m3190X1(sz0.OXO1, bleCache.getMBleName(), bleCache.getMFirmwareFlag());
        getMDeviceImg().setImageDrawable(getDrawable(q62.OXO1.m2893iX(new BleDeviceInfo(0, null, bleCache.getMBleName(), null, null, null, bleCache.getMPrototype(), bleCache.getMFirmwareFlag(), 0, 0L, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -197, -1, -1, -1, C2229at.f5560IO, null))));
        if (FileUtils.isFileExists(fileM3190X1)) {
            getMDeviceImg().setImageBitmap(ImageUtils.getBitmap(fileM3190X1));
        }
        getMDeviceName().setText(bleCache.getMBleName());
    }

    public final void setLayoutHeight(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getMRelativeLayout().getLayoutParams();
        layoutParams.height = ((ScreenUtils.getAppScreenWidth() - SizeUtils.dp2px(30.0f)) * i2) / i;
        getMRelativeLayout().setLayoutParams(layoutParams);
    }
}
