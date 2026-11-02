package com.sma.smartv3.p610ui.sport.course;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.jl1;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.base.BaseFragment;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerAdapter;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.sma.smartv3.biz.CourseManager;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.CourseDetails;
import com.sma.smartv3.model.ProgressMarkers;
import com.sma.smartv3.model.VideoFile;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.p610ui.sport.course.CourseDetailsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.io.File;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCourseDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseDetailsActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseDetailsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n19#2:264\n15#2:265\n87#3,7:266\n94#3,3:274\n70#3,7:277\n97#3:284\n1#4:273\n1#4:294\n1#4:310\n104#5,9:285\n113#5,3:295\n99#5,3:298\n104#5,9:301\n113#5,3:311\n99#5,3:314\n1869#6,2:317\n*S KotlinDebug\n*F\n+ 1 CourseDetailsActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseDetailsActivity\n*L\n63#1:264\n63#1:265\n240#1:266,7\n240#1:274,3\n240#1:277,7\n240#1:284\n240#1:273\n258#1:294\n259#1:310\n258#1:285,9\n258#1:295,3\n258#1:298,3\n259#1:301,9\n259#1:311,3\n259#1:314,3\n72#1:317,2\n*E\n"})
public final class CourseDetailsActivity extends BaseActivity implements jl1 {
    private boolean courseCollect;
    private boolean isButtonClick;
    private boolean isDownload;

    @tb1
    private CourseDetails mCourseDetails;
    protected BaseFragmentPagerAdapter mFragmentPagerAdapter;
    protected ViewPager mViewPager;
    private int widthPixels;

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXiI101I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseDetailsActivity.table_delegate$lambda$0(this.f2138IO);
        }
    });

    @aa1
    private final Lazy mCardViewLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOOO1ii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseDetailsActivity.mCardViewLayout_delegate$lambda$0(this.f1839IO);
        }
    });

    @aa1
    private final Lazy mRoundPicImage$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXIi1Oii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseDetailsActivity.mRoundPicImage_delegate$lambda$0(this.f3473IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iX01O0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseDetailsActivity.abhTitleRight_delegate$lambda$0(this.f8219IO);
        }
    });

    @aa1
    private final Lazy abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1OIiXX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseDetailsActivity.abhTitleOtherRight_delegate$lambda$0(this.f7625IO);
        }
    });

    @aa1
    private final Lazy mCourseName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i000OXXi1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseDetailsActivity.mCourseName_delegate$lambda$0(this.f7254IO);
        }
    });

    @aa1
    private final Lazy mCourseDiff$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXO10X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseDetailsActivity.mCourseDiff_delegate$lambda$0(this.f3490IO);
        }
    });

    @aa1
    private final Lazy mCourseTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXOiiOXiO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseDetailsActivity.mCourseTime_delegate$lambda$0(this.f2083IO);
        }
    });

    @aa1
    private final Lazy mCourseHeat$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1O1OII
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseDetailsActivity.mCourseHeat_delegate$lambda$0(this.f1419IO);
        }
    });

    @aa1
    private final Lazy mCourseDetailsHot$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i00IX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseDetailsActivity.mCourseDetailsHot_delegate$lambda$0(this.f7272IO);
        }
    });

    @aa1
    private final Lazy mButton$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I00101OiI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseDetailsActivity.mButton_delegate$lambda$0(this.f1009IO);
        }
    });

    @aa1
    private String mIdentity = "";

    public static final class OXO1 extends SimpleTarget<Bitmap> {
        public OXO1() {
        }

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
            Intrinsics.X0O(resource, "resource");
            CourseDetailsActivity.this.setLayoutHeight(resource.getWidth(), resource.getHeight());
            CourseDetailsActivity.this.getMRoundPicImage().setImageBitmap(resource);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleOtherRight_delegate$lambda$0(CourseDetailsActivity courseDetailsActivity) {
        return (ImageView) courseDetailsActivity.findViewById(R.id.abh_title_other_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(CourseDetailsActivity courseDetailsActivity) {
        return (ImageView) courseDetailsActivity.findViewById(R.id.abh_title_right);
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) this.abhTitleOtherRight$delegate.getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$0(CourseDetailsActivity courseDetailsActivity, CourseDetails courseDetails) {
        if (courseDetails != null) {
            courseDetailsActivity.mCourseDetails = courseDetails;
            List<ProgressMarkers> progressMarkers = courseDetails.getProgressMarkers();
            if (progressMarkers != null) {
                int i = -1;
                for (ProgressMarkers progressMarkers2 : progressMarkers) {
                    i = i == -1 ? Integer.parseInt(progressMarkers2.getOffset()) : Integer.parseInt(progressMarkers2.getOffset()) - i;
                    progressMarkers2.setTime(i);
                }
            }
            courseDetailsActivity.setView();
        } else {
            ToastUtils.showLong(R.string.auto_retry_active_tip);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button mButton_delegate$lambda$0(CourseDetailsActivity courseDetailsActivity) {
        return (Button) courseDetailsActivity.findViewById(R.id.course_details_btn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardView mCardViewLayout_delegate$lambda$0(CourseDetailsActivity courseDetailsActivity) {
        return (CardView) courseDetailsActivity.findViewById(R.id.course_cardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mCourseDetailsHot_delegate$lambda$0(CourseDetailsActivity courseDetailsActivity) {
        return (PFMedium) courseDetailsActivity.findViewById(R.id.course_details_hot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mCourseDiff_delegate$lambda$0(CourseDetailsActivity courseDetailsActivity) {
        return (PFMedium) courseDetailsActivity.findViewById(R.id.course_details_diff);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mCourseHeat_delegate$lambda$0(CourseDetailsActivity courseDetailsActivity) {
        return (PFMedium) courseDetailsActivity.findViewById(R.id.course_details_heat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mCourseName_delegate$lambda$0(CourseDetailsActivity courseDetailsActivity) {
        return (TextView) courseDetailsActivity.findViewById(R.id.course_details_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mCourseTime_delegate$lambda$0(CourseDetailsActivity courseDetailsActivity) {
        return (PFMedium) courseDetailsActivity.findViewById(R.id.course_details_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mRoundPicImage_delegate$lambda$0(CourseDetailsActivity courseDetailsActivity) {
        return (ImageView) courseDetailsActivity.findViewById(R.id.course_details_pic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onButtonClick$lambda$0(CourseDetailsActivity courseDetailsActivity, File file, int i) {
        if (i > 100) {
            courseDetailsActivity.getMButton().setText(R.string.start_training);
            String absolutePath = file.getAbsolutePath();
            Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
            courseDetailsActivity.playVideo(absolutePath);
        } else if (i == -1) {
            if (file.exists()) {
                file.delete();
            }
            courseDetailsActivity.getMButton().setText(R.string.get_music_down_link_error);
            courseDetailsActivity.isButtonClick = false;
        } else {
            String string = courseDetailsActivity.getString(R.string.downloading);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            courseDetailsActivity.getMButton().setText(string + i + "%");
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabLayout table_delegate$lambda$0(CourseDetailsActivity courseDetailsActivity) {
        return (TabLayout) courseDetailsActivity.findViewById(R.id.table);
    }

    public final boolean getCourseCollect() {
        return this.courseCollect;
    }

    public final Button getMButton() {
        return (Button) this.mButton$delegate.getValue();
    }

    public final CardView getMCardViewLayout() {
        return (CardView) this.mCardViewLayout$delegate.getValue();
    }

    public final PFMedium getMCourseDetailsHot() {
        return (PFMedium) this.mCourseDetailsHot$delegate.getValue();
    }

    public final PFMedium getMCourseDiff() {
        return (PFMedium) this.mCourseDiff$delegate.getValue();
    }

    public final PFMedium getMCourseHeat() {
        return (PFMedium) this.mCourseHeat$delegate.getValue();
    }

    public final TextView getMCourseName() {
        return (TextView) this.mCourseName$delegate.getValue();
    }

    public final PFMedium getMCourseTime() {
        return (PFMedium) this.mCourseTime$delegate.getValue();
    }

    @aa1
    public final BaseFragmentPagerAdapter getMFragmentPagerAdapter() {
        BaseFragmentPagerAdapter baseFragmentPagerAdapter = this.mFragmentPagerAdapter;
        if (baseFragmentPagerAdapter != null) {
            return baseFragmentPagerAdapter;
        }
        Intrinsics.XXO("mFragmentPagerAdapter");
        return null;
    }

    @aa1
    public final String getMIdentity() {
        return this.mIdentity;
    }

    public final ImageView getMRoundPicImage() {
        return (ImageView) this.mRoundPicImage$delegate.getValue();
    }

    @aa1
    public final ViewPager getMViewPager() {
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            return viewPager;
        }
        Intrinsics.XXO("mViewPager");
        return null;
    }

    public final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
    }

    public final int getWidthPixels() {
        return this.widthPixels;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        this.mIdentity = ((AppUser) appUser).getIdentity();
        if (getMArg0() != null) {
            CourseManager courseManager = CourseManager.OXO1;
            String mArg0 = getMArg0();
            Intrinsics.XXI(mArg0);
            courseManager.OIX0iXi(mArg0, this.mIdentity, new Function1() { // from class: com.android.mltcode.paycertificationapi.OXOXO11
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CourseDetailsActivity.init$lambda$0(this.f3520IO, (CourseDetails) obj);
                }
            });
        } else {
            ToastUtils.showLong(R.string.request_error);
        }
        this.widthPixels = ScreenUtils.getAppScreenWidth();
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        BaseFragment.OXO1 oxo1 = BaseFragment.Companion;
        CourseDetails courseDetails = this.mCourseDetails;
        String courseIntro = courseDetails != null ? courseDetails.getCourseIntro() : null;
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", courseIntro);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        BaseFragment baseFragment = (BaseFragment) DetailIntroduceFragment.class.newInstance();
        baseFragment.setArguments(bundle);
        if (baseFragment == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.course.DetailIntroduceFragment");
        }
        DetailIntroduceFragment detailIntroduceFragment = (DetailIntroduceFragment) baseFragment;
        CourseDetails courseDetails2 = this.mCourseDetails;
        Bundle bundle2 = new Bundle();
        bundle2.putString("mArg0", null);
        bundle2.putParcelable("mArg2", null);
        bundle2.putSerializable("mArg3", courseDetails2);
        BaseFragment baseFragment2 = (BaseFragment) CourseActionFragment.class.newInstance();
        baseFragment2.setArguments(bundle2);
        if (baseFragment2 != null) {
            return CollectionsKt__CollectionsKt.iXiX011(detailIntroduceFragment, (CourseActionFragment) baseFragment2);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.course.CourseActionFragment");
    }

    public final void initImage() {
        RequestBuilder<Bitmap> requestBuilderAsBitmap = Glide.with(getMRoundPicImage().getContext()).asBitmap();
        CourseDetails courseDetails = this.mCourseDetails;
        requestBuilderAsBitmap.load(courseDetails != null ? courseDetails.getCoursePic1() : null).into(new OXO1());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getTable().setBackgroundColor(gk4.m1859iO(getMContext(), R.color.view_page_tablayout_bg));
        setCollectImage();
        getAbhTitleOtherRight().setVisibility(0);
        getAbhTitleOtherRight().setImageResource(R.drawable.icon_course_share);
    }

    public final boolean isButtonClick() {
        return this.isButtonClick;
    }

    public final boolean isDownload() {
        return this.isDownload;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_course_details;
    }

    @SuppressLint({"SetTextI18n"})
    public final void onButtonClick(@aa1 View view) {
        VideoFile videoFile;
        Intrinsics.X0O(view, "view");
        if (this.isButtonClick) {
            return;
        }
        CourseDetails courseDetails = this.mCourseDetails;
        String filePath = null;
        if ((courseDetails != null ? courseDetails.getVideoFile() : null) == null) {
            ToastUtils.showLong(R.string.no_exit_file_doload);
            return;
        }
        this.isButtonClick = true;
        String str = "course" + getMArg0() + ".mp4";
        final File file = new File(uz0.i0X000X0O(sz0.OXO1).getAbsolutePath(), str);
        if (file.exists()) {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
            playVideo(absolutePath);
            return;
        }
        this.isDownload = true;
        CourseManager courseManager = CourseManager.OXO1;
        CourseDetails courseDetails2 = this.mCourseDetails;
        if (courseDetails2 != null && (videoFile = courseDetails2.getVideoFile()) != null) {
            filePath = videoFile.getFilePath();
        }
        Intrinsics.XXI(filePath);
        courseManager.O00(filePath, str, new Function1() { // from class: com.android.mltcode.paycertificationapi.I01O1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseDetailsActivity.onButtonClick$lambda$0(this.f1072IO, file, ((Integer) obj).intValue());
            }
        });
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (this.isDownload) {
            ToastUtils.showLong(R.string.music_down_transmit_tip);
        } else {
            super.onHandleBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initImage();
        this.isButtonClick = false;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        ToastUtils.showLong("功能开发中..", new Object[0]);
    }

    public final void onTitleRightOtherClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
    }

    public final void playVideo(@aa1 String absolutePath) {
        Intrinsics.X0O(absolutePath, "absolutePath");
        this.isDownload = false;
        CourseDetails courseDetails = this.mCourseDetails;
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", absolutePath);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", courseDetails);
        Intent intent = new Intent(this, (Class<?>) CourseVideoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
        this.isButtonClick = false;
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public FragmentManager provideFragmentManager() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.O10IXXX0X(supportFragmentManager, "getSupportFragmentManager(...)");
        return supportFragmentManager;
    }

    public final void setButtonClick(boolean z) {
        this.isButtonClick = z;
    }

    public final void setCollectImage() {
        getAbhTitleRight().setImageResource(this.courseCollect ? R.drawable.icon_course_collection_true : R.drawable.icon_course_collection);
    }

    public final void setCourseCollect(boolean z) {
        this.courseCollect = z;
    }

    public final void setDownload(boolean z) {
        this.isDownload = z;
    }

    public final void setLayoutHeight(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getMCardViewLayout().getLayoutParams();
        layoutParams.height = ((this.widthPixels - SizeUtils.dp2px(30.0f)) * i2) / i;
        getMCardViewLayout().setLayoutParams(layoutParams);
    }

    public final void setMFragmentPagerAdapter(@aa1 BaseFragmentPagerAdapter baseFragmentPagerAdapter) {
        Intrinsics.X0O(baseFragmentPagerAdapter, "<set-?>");
        this.mFragmentPagerAdapter = baseFragmentPagerAdapter;
    }

    public final void setMIdentity(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mIdentity = str;
    }

    public final void setMViewPager(@aa1 ViewPager viewPager) {
        Intrinsics.X0O(viewPager, "<set-?>");
        this.mViewPager = viewPager;
    }

    @SuppressLint({"SetTextI18n"})
    public final void setView() {
        TextView textView = (TextView) findViewById(R.id.abh_title_center);
        CourseDetails courseDetails = this.mCourseDetails;
        textView.setText(courseDetails != null ? courseDetails.getCourseName() : null);
        initImage();
        TextView mCourseName = getMCourseName();
        CourseDetails courseDetails2 = this.mCourseDetails;
        mCourseName.setText(courseDetails2 != null ? courseDetails2.getCourseName() : null);
        PFMedium mCourseDetailsHot = getMCourseDetailsHot();
        CourseDetails courseDetails3 = this.mCourseDetails;
        String courseClass = courseDetails3 != null ? courseDetails3.getCourseClass() : null;
        mCourseDetailsHot.setText(courseClass + getString(R.string.people_join));
        PFMedium mCourseDiff = getMCourseDiff();
        CourseDetails courseDetails4 = this.mCourseDetails;
        mCourseDiff.setText(courseDetails4 != null ? courseDetails4.getCourseDiff() : null);
        PFMedium mCourseTime = getMCourseTime();
        CourseDetails courseDetails5 = this.mCourseDetails;
        String courseTime = courseDetails5 != null ? courseDetails5.getCourseTime() : null;
        mCourseTime.setText(courseTime + getMContext().getString(R.string.minute));
        PFMedium mCourseHeat = getMCourseHeat();
        CourseDetails courseDetails6 = this.mCourseDetails;
        String courseHeat = courseDetails6 != null ? courseDetails6.getCourseHeat() : null;
        mCourseHeat.setText(courseHeat + getString(R.string.kcal));
        CourseDetails courseDetails7 = this.mCourseDetails;
        this.courseCollect = Intrinsics.XOO0ii0(courseDetails7 != null ? courseDetails7.getCollectFlag() : null, Api.f51338Y);
        setCollectImage();
        View viewFindViewById = findViewById(R.id.view_pager);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        setMViewPager((ViewPager) viewFindViewById);
        BaseFragmentPagerAdapter baseFragmentPagerAdapter = new BaseFragmentPagerAdapter(this);
        getMViewPager().setAdapter(baseFragmentPagerAdapter);
        getMViewPager().setOffscreenPageLimit(baseFragmentPagerAdapter.getCount());
        setMFragmentPagerAdapter(baseFragmentPagerAdapter);
        getMFragmentPagerAdapter().setTitles(new String[]{getMContext().getString(R.string.heath_course_description), getMContext().getString(R.string.course_action)});
        getTable().setupWithViewPager(getMViewPager());
    }

    public final void setWidthPixels(int i) {
        this.widthPixels = i;
    }
}
