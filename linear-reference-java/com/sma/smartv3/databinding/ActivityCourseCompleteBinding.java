package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.PFBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityCourseCompleteBinding implements ViewBinding {

    @NonNull
    public final PFMedium courseDetailsDiff;

    @NonNull
    public final PFMedium courseDetailsHeat;

    @NonNull
    public final PFBold courseDetailsName;

    @NonNull
    public final ImageViewRound courseDetailsPic;

    @NonNull
    public final RelativeLayout courseDetailsPicLayout;

    @NonNull
    public final PFMedium courseDetailsTime;

    @NonNull
    public final PFMedium courseNameNumber;

    @NonNull
    public final RecyclerView courseRecycler;

    @NonNull
    public final ImageView deviceImg;

    @NonNull
    public final PFMedium deviceName;

    @NonNull
    public final ImageView deviceQrCode;

    @NonNull
    public final LinearLayout deviceQrCodeLl;

    @NonNull
    public final LinearLayout deviceSources;

    @NonNull
    public final ImageViewRound ivAppIcon;

    @NonNull
    public final ImageViewRound ivAvatar;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium trainingExperienceHintTv;

    @NonNull
    public final ImageView trainingExperienceImgResult;

    @NonNull
    public final LinearLayout trainingExperienceLayout;

    @NonNull
    public final LinearLayout trainingExperienceLayout1;

    @NonNull
    public final LinearLayout trainingExperienceLayout2;

    @NonNull
    public final LinearLayout trainingExperienceLayout3;

    @NonNull
    public final LinearLayout trainingExperienceLayout4;

    @NonNull
    public final LinearLayout trainingExperienceLayout5;

    @NonNull
    public final LinearLayout trainingExperienceLayoutResult;

    @NonNull
    public final LinearLayout trainingExperienceLayoutSelect;

    @NonNull
    public final PFMedium trainingExperienceTvResult;

    @NonNull
    public final PFMedium tvNickname;

    @NonNull
    public final PFMedium tvTimne;

    private ActivityCourseCompleteBinding(@NonNull LinearLayout rootView, @NonNull PFMedium courseDetailsDiff, @NonNull PFMedium courseDetailsHeat, @NonNull PFBold courseDetailsName, @NonNull ImageViewRound courseDetailsPic, @NonNull RelativeLayout courseDetailsPicLayout, @NonNull PFMedium courseDetailsTime, @NonNull PFMedium courseNameNumber, @NonNull RecyclerView courseRecycler, @NonNull ImageView deviceImg, @NonNull PFMedium deviceName, @NonNull ImageView deviceQrCode, @NonNull LinearLayout deviceQrCodeLl, @NonNull LinearLayout deviceSources, @NonNull ImageViewRound ivAppIcon, @NonNull ImageViewRound ivAvatar, @NonNull PFMedium trainingExperienceHintTv, @NonNull ImageView trainingExperienceImgResult, @NonNull LinearLayout trainingExperienceLayout, @NonNull LinearLayout trainingExperienceLayout1, @NonNull LinearLayout trainingExperienceLayout2, @NonNull LinearLayout trainingExperienceLayout3, @NonNull LinearLayout trainingExperienceLayout4, @NonNull LinearLayout trainingExperienceLayout5, @NonNull LinearLayout trainingExperienceLayoutResult, @NonNull LinearLayout trainingExperienceLayoutSelect, @NonNull PFMedium trainingExperienceTvResult, @NonNull PFMedium tvNickname, @NonNull PFMedium tvTimne) {
        this.rootView = rootView;
        this.courseDetailsDiff = courseDetailsDiff;
        this.courseDetailsHeat = courseDetailsHeat;
        this.courseDetailsName = courseDetailsName;
        this.courseDetailsPic = courseDetailsPic;
        this.courseDetailsPicLayout = courseDetailsPicLayout;
        this.courseDetailsTime = courseDetailsTime;
        this.courseNameNumber = courseNameNumber;
        this.courseRecycler = courseRecycler;
        this.deviceImg = deviceImg;
        this.deviceName = deviceName;
        this.deviceQrCode = deviceQrCode;
        this.deviceQrCodeLl = deviceQrCodeLl;
        this.deviceSources = deviceSources;
        this.ivAppIcon = ivAppIcon;
        this.ivAvatar = ivAvatar;
        this.trainingExperienceHintTv = trainingExperienceHintTv;
        this.trainingExperienceImgResult = trainingExperienceImgResult;
        this.trainingExperienceLayout = trainingExperienceLayout;
        this.trainingExperienceLayout1 = trainingExperienceLayout1;
        this.trainingExperienceLayout2 = trainingExperienceLayout2;
        this.trainingExperienceLayout3 = trainingExperienceLayout3;
        this.trainingExperienceLayout4 = trainingExperienceLayout4;
        this.trainingExperienceLayout5 = trainingExperienceLayout5;
        this.trainingExperienceLayoutResult = trainingExperienceLayoutResult;
        this.trainingExperienceLayoutSelect = trainingExperienceLayoutSelect;
        this.trainingExperienceTvResult = trainingExperienceTvResult;
        this.tvNickname = tvNickname;
        this.tvTimne = tvTimne;
    }

    @NonNull
    public static ActivityCourseCompleteBinding bind(@NonNull View rootView) {
        int r1 = R.id.course_details_diff;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_details_diff);
        if (r5 == null) goto L61;
        r1 = R.id.course_details_heat;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_details_heat);
        if (r6 == null) goto L61;
        r1 = R.id.course_details_name;
        PFBold r7 = (PFBold) ViewBindings.findChildViewById(rootView, R.id.course_details_name);
        if (r7 == null) goto L61;
        r1 = R.id.course_details_pic;
        ImageViewRound r8 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.course_details_pic);
        if (r8 == null) goto L61;
        r1 = R.id.course_details_pic_layout;
        RelativeLayout r9 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.course_details_pic_layout);
        if (r9 == null) goto L61;
        r1 = R.id.course_details_time;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_details_time);
        if (r10 == null) goto L61;
        r1 = R.id.course_name_number;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_name_number);
        if (r11 == null) goto L61;
        r1 = R.id.course_recycler;
        RecyclerView r12 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.course_recycler);
        if (r12 == null) goto L61;
        r1 = R.id.device_img;
        ImageView r13 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.device_img);
        if (r13 == null) goto L61;
        r1 = R.id.device_name;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.device_name);
        if (r14 == null) goto L61;
        r1 = R.id.device_qr_code;
        ImageView r15 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.device_qr_code);
        if (r15 == null) goto L61;
        r1 = R.id.device_qr_code_ll;
        LinearLayout r16 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.device_qr_code_ll);
        if (r16 == null) goto L61;
        r1 = R.id.device_sources;
        LinearLayout r17 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.device_sources);
        if (r17 == null) goto L61;
        r1 = R.id.iv_app_icon;
        ImageViewRound r18 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_app_icon);
        if (r18 == null) goto L61;
        r1 = R.id.iv_avatar;
        ImageViewRound r19 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
        if (r19 == null) goto L61;
        r1 = R.id.training_experience_hint_tv;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.training_experience_hint_tv);
        if (r20 == null) goto L61;
        r1 = R.id.training_experience_img_result;
        ImageView r21 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.training_experience_img_result);
        if (r21 == null) goto L61;
        r1 = R.id.training_experience_layout;
        LinearLayout r22 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout);
        if (r22 == null) goto L61;
        r1 = R.id.training_experience_layout_1;
        LinearLayout r23 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_1);
        if (r23 == null) goto L61;
        r1 = R.id.training_experience_layout_2;
        LinearLayout r24 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_2);
        if (r24 == null) goto L61;
        r1 = R.id.training_experience_layout_3;
        LinearLayout r25 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_3);
        if (r25 == null) goto L61;
        r1 = R.id.training_experience_layout_4;
        LinearLayout r26 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_4);
        if (r26 == null) goto L61;
        r1 = R.id.training_experience_layout_5;
        LinearLayout r27 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_5);
        if (r27 == null) goto L61;
        r1 = R.id.training_experience_layout_result;
        LinearLayout r28 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_result);
        if (r28 == null) goto L61;
        r1 = R.id.training_experience_layout_select;
        LinearLayout r29 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_select);
        if (r29 == null) goto L61;
        r1 = R.id.training_experience_tv_result;
        PFMedium r30 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.training_experience_tv_result);
        if (r30 == null) goto L61;
        r1 = R.id.tv_nickname;
        PFMedium r31 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_nickname);
        if (r31 == null) goto L61;
        r1 = R.id.tv_timne;
        PFMedium r32 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_timne);
        if (r32 == null) goto L61;
        return new ActivityCourseCompleteBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32);
    L61:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityCourseCompleteBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityCourseCompleteBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_course_complete, parent, false);
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
