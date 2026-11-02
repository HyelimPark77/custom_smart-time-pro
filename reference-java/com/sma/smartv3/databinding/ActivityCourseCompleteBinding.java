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
        int i = R.id.course_details_diff;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_details_diff);
        if (pFMedium != null) {
            i = R.id.course_details_heat;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_details_heat);
            if (pFMedium2 != null) {
                i = R.id.course_details_name;
                PFBold pFBold = (PFBold) ViewBindings.findChildViewById(rootView, R.id.course_details_name);
                if (pFBold != null) {
                    i = R.id.course_details_pic;
                    ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.course_details_pic);
                    if (imageViewRound != null) {
                        i = R.id.course_details_pic_layout;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.course_details_pic_layout);
                        if (relativeLayout != null) {
                            i = R.id.course_details_time;
                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_details_time);
                            if (pFMedium3 != null) {
                                i = R.id.course_name_number;
                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_name_number);
                                if (pFMedium4 != null) {
                                    i = R.id.course_recycler;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.course_recycler);
                                    if (recyclerView != null) {
                                        i = R.id.device_img;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.device_img);
                                        if (imageView != null) {
                                            i = R.id.device_name;
                                            PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.device_name);
                                            if (pFMedium5 != null) {
                                                i = R.id.device_qr_code;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.device_qr_code);
                                                if (imageView2 != null) {
                                                    i = R.id.device_qr_code_ll;
                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.device_qr_code_ll);
                                                    if (linearLayout != null) {
                                                        i = R.id.device_sources;
                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.device_sources);
                                                        if (linearLayout2 != null) {
                                                            i = R.id.iv_app_icon;
                                                            ImageViewRound imageViewRound2 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_app_icon);
                                                            if (imageViewRound2 != null) {
                                                                i = R.id.iv_avatar;
                                                                ImageViewRound imageViewRound3 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
                                                                if (imageViewRound3 != null) {
                                                                    i = R.id.training_experience_hint_tv;
                                                                    PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.training_experience_hint_tv);
                                                                    if (pFMedium6 != null) {
                                                                        i = R.id.training_experience_img_result;
                                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.training_experience_img_result);
                                                                        if (imageView3 != null) {
                                                                            i = R.id.training_experience_layout;
                                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout);
                                                                            if (linearLayout3 != null) {
                                                                                i = R.id.training_experience_layout_1;
                                                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_1);
                                                                                if (linearLayout4 != null) {
                                                                                    i = R.id.training_experience_layout_2;
                                                                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_2);
                                                                                    if (linearLayout5 != null) {
                                                                                        i = R.id.training_experience_layout_3;
                                                                                        LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_3);
                                                                                        if (linearLayout6 != null) {
                                                                                            i = R.id.training_experience_layout_4;
                                                                                            LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_4);
                                                                                            if (linearLayout7 != null) {
                                                                                                i = R.id.training_experience_layout_5;
                                                                                                LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_5);
                                                                                                if (linearLayout8 != null) {
                                                                                                    i = R.id.training_experience_layout_result;
                                                                                                    LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_result);
                                                                                                    if (linearLayout9 != null) {
                                                                                                        i = R.id.training_experience_layout_select;
                                                                                                        LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_select);
                                                                                                        if (linearLayout10 != null) {
                                                                                                            i = R.id.training_experience_tv_result;
                                                                                                            PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.training_experience_tv_result);
                                                                                                            if (pFMedium7 != null) {
                                                                                                                i = R.id.tv_nickname;
                                                                                                                PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_nickname);
                                                                                                                if (pFMedium8 != null) {
                                                                                                                    i = R.id.tv_timne;
                                                                                                                    PFMedium pFMedium9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_timne);
                                                                                                                    if (pFMedium9 != null) {
                                                                                                                        return new ActivityCourseCompleteBinding((LinearLayout) rootView, pFMedium, pFMedium2, pFBold, imageViewRound, relativeLayout, pFMedium3, pFMedium4, recyclerView, imageView, pFMedium5, imageView2, linearLayout, linearLayout2, imageViewRound2, imageViewRound3, pFMedium6, imageView3, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, pFMedium7, pFMedium8, pFMedium9);
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
    public static ActivityCourseCompleteBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCourseCompleteBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_course_complete, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
