package com.sma.smartv3.ui.sport.course;

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
import com.android.mltcode.paycertificationapi.I00101OiI;
import com.android.mltcode.paycertificationapi.I01O1;
import com.android.mltcode.paycertificationapi.I1O1OII;
import com.android.mltcode.paycertificationapi.IOOO1ii;
import com.android.mltcode.paycertificationapi.IXOiiOXiO;
import com.android.mltcode.paycertificationapi.IXiI101I;
import com.android.mltcode.paycertificationapi.OXIi1Oii;
import com.android.mltcode.paycertificationapi.OXO10X;
import com.android.mltcode.paycertificationapi.OXOXO11;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i000OXXi1;
import com.android.mltcode.paycertificationapi.i00IX;
import com.android.mltcode.paycertificationapi.i1OIiXX1;
import com.android.mltcode.paycertificationapi.iX01O0I;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCourseDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseDetailsActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseDetailsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n19#2:264\n15#2:265\n87#3,7:266\n94#3,3:274\n70#3,7:277\n97#3:284\n1#4:273\n1#4:294\n1#4:310\n104#5,9:285\n113#5,3:295\n99#5,3:298\n104#5,9:301\n113#5,3:311\n99#5,3:314\n1869#6,2:317\n*S KotlinDebug\n*F\n+ 1 CourseDetailsActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseDetailsActivity\n*L\n63#1:264\n63#1:265\n240#1:266,7\n240#1:274,3\n240#1:277,7\n240#1:284\n240#1:273\n258#1:294\n259#1:310\n258#1:285,9\n258#1:295,3\n258#1:298,3\n259#1:301,9\n259#1:311,3\n259#1:314,3\n72#1:317,2\n*E\n"})
public final class CourseDetailsActivity extends BaseActivity implements jl1 {

    @aa1
    private final Lazy abhTitleOtherRight$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;
    private boolean courseCollect;
    private boolean isButtonClick;
    private boolean isDownload;

    @aa1
    private final Lazy mButton$delegate;

    @aa1
    private final Lazy mCardViewLayout$delegate;

    @tb1
    private CourseDetails mCourseDetails;

    @aa1
    private final Lazy mCourseDetailsHot$delegate;

    @aa1
    private final Lazy mCourseDiff$delegate;

    @aa1
    private final Lazy mCourseHeat$delegate;

    @aa1
    private final Lazy mCourseName$delegate;

    @aa1
    private final Lazy mCourseTime$delegate;
    protected BaseFragmentPagerAdapter mFragmentPagerAdapter;

    @aa1
    private String mIdentity;

    @aa1
    private final Lazy mRoundPicImage$delegate;
    protected ViewPager mViewPager;

    @aa1
    private final Lazy table$delegate;
    private int widthPixels;

    public static final class OXO1 extends SimpleTarget<Bitmap> {
        public final /* synthetic */ CourseDetailsActivity IO;

        public OXO1(CourseDetailsActivity r1) {
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

    public CourseDetailsActivity() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new IXiI101I(this));
        this.mCardViewLayout$delegate = LazyKt__LazyJVMKt.iO(new IOOO1ii(this));
        this.mRoundPicImage$delegate = LazyKt__LazyJVMKt.iO(new OXIi1Oii(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new iX01O0I(this));
        this.abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.iO(new i1OIiXX1(this));
        this.mCourseName$delegate = LazyKt__LazyJVMKt.iO(new i000OXXi1(this));
        this.mCourseDiff$delegate = LazyKt__LazyJVMKt.iO(new OXO10X(this));
        this.mCourseTime$delegate = LazyKt__LazyJVMKt.iO(new IXOiiOXiO(this));
        this.mCourseHeat$delegate = LazyKt__LazyJVMKt.iO(new I1O1OII(this));
        this.mCourseDetailsHot$delegate = LazyKt__LazyJVMKt.iO(new i00IX(this));
        this.mButton$delegate = LazyKt__LazyJVMKt.iO(new I00101OiI(this));
        this.mIdentity = "";
    }

    public static /* synthetic */ CardView I0iXXO(CourseDetailsActivity r0) {
        return mCardViewLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView I1XOi1(CourseDetailsActivity r0) {
        return mRoundPicImage_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium IIX1OXO(CourseDetailsActivity r0) {
        return mCourseDiff_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit O10IXXX0X(CourseDetailsActivity r0, File r1, int r2) {
        return onButtonClick$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ ImageView OIX0iXi(CourseDetailsActivity r0) {
        return abhTitleOtherRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OiIIX101O(CourseDetailsActivity r0) {
        return mCourseDetailsHot_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X0O(CourseDetailsActivity r0, CourseDetails r1) {
        return init$lambda$0(r0, r1);
    }

    public static /* synthetic */ PFMedium X1ii(CourseDetailsActivity r0) {
        return mCourseHeat_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TabLayout XX0(CourseDetailsActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XXI(CourseDetailsActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button XiOIO(CourseDetailsActivity r0) {
        return mButton_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XiOIii1(CourseDetailsActivity r0) {
        return mCourseName_delegate$lambda$0(r0);
    }

    private static final ImageView abhTitleOtherRight_delegate$lambda$0(CourseDetailsActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_other_right);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(CourseDetailsActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    public static /* synthetic */ PFMedium iIiiO(CourseDetailsActivity r0) {
        return mCourseTime_delegate$lambda$0(r0);
    }

    private static final Unit init$lambda$0(CourseDetailsActivity r4, CourseDetails r5) {
        if (r5 == null) goto L14;
        r4.mCourseDetails = r5;
        List<ProgressMarkers> r6 = r5.getProgressMarkers();
        if (r6 == null) goto L13;
        Iterator<T> r7 = r6.iterator();
        int r1 = -1;
    L7:
        if (r7.hasNext() == false) goto L13;
        ProgressMarkers r2 = (ProgressMarkers) r7.next();
        if (r1 != (-1)) goto L11;
        r1 = Integer.parseInt(r2.getOffset());
    L12:
        r2.setTime(r1);
        goto L7
    L11:
        r1 = Integer.parseInt(r2.getOffset()) - r1;
    L13:
        r4.setView();
    L16:
        return Unit.OXO1;
    L14:
        ToastUtils.showLong(R.string.auto_retry_active_tip);
        goto L16
    }

    private static final Button mButton_delegate$lambda$0(CourseDetailsActivity r1) {
        return (Button) r1.findViewById(R.id.course_details_btn);
    }

    private static final CardView mCardViewLayout_delegate$lambda$0(CourseDetailsActivity r1) {
        return (CardView) r1.findViewById(R.id.course_cardView);
    }

    private static final PFMedium mCourseDetailsHot_delegate$lambda$0(CourseDetailsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.course_details_hot);
    }

    private static final PFMedium mCourseDiff_delegate$lambda$0(CourseDetailsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.course_details_diff);
    }

    private static final PFMedium mCourseHeat_delegate$lambda$0(CourseDetailsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.course_details_heat);
    }

    private static final TextView mCourseName_delegate$lambda$0(CourseDetailsActivity r1) {
        return (TextView) r1.findViewById(R.id.course_details_name);
    }

    private static final PFMedium mCourseTime_delegate$lambda$0(CourseDetailsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.course_details_time);
    }

    private static final ImageView mRoundPicImage_delegate$lambda$0(CourseDetailsActivity r1) {
        return (ImageView) r1.findViewById(R.id.course_details_pic);
    }

    private static final Unit onButtonClick$lambda$0(CourseDetailsActivity r1, File r2, int r3) {
        if (r3 <= 100) goto L6;
        r1.getMButton().setText(R.string.start_training);
        String r4 = r2.getAbsolutePath();
        Intrinsics.O10IXXX0X(r4, "getAbsolutePath(...)");
        r1.playVideo(r4);
    L13:
        return Unit.OXO1;
    L6:
        if (r3 == (-1)) goto L8;
        String r5 = r1.getString(R.string.downloading);
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        r1.getMButton().setText(r5 + r3 + "%");
        goto L13
    L8:
        if (r2.exists() == false) goto L10;
        r2.delete();
    L10:
        r1.getMButton().setText(R.string.get_music_down_link_error);
        r1.isButtonClick = false;
        goto L13
    }

    private static final TabLayout table_delegate$lambda$0(CourseDetailsActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    public final boolean getCourseCollect() {
        return this.courseCollect;
    }

    public final Button getMButton() {
        return (Button) getValue();
    }

    public final CardView getMCardViewLayout() {
        return (CardView) getValue();
    }

    public final PFMedium getMCourseDetailsHot() {
        return (PFMedium) getValue();
    }

    public final PFMedium getMCourseDiff() {
        return (PFMedium) getValue();
    }

    public final PFMedium getMCourseHeat() {
        return (PFMedium) getValue();
    }

    public final TextView getMCourseName() {
        return (TextView) getValue();
    }

    public final PFMedium getMCourseTime() {
        return (PFMedium) getValue();
    }

    @aa1
    public final BaseFragmentPagerAdapter getMFragmentPagerAdapter() {
        BaseFragmentPagerAdapter r0 = this.mFragmentPagerAdapter;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mFragmentPagerAdapter");
        return null;
    }

    @aa1
    public final String getMIdentity() {
        return this.mIdentity;
    }

    public final ImageView getMRoundPicImage() {
        return (ImageView) getValue();
    }

    @aa1
    public final ViewPager getMViewPager() {
        ViewPager r0 = this.mViewPager;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mViewPager");
        return null;
    }

    public final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    public final int getWidthPixels() {
        return this.widthPixels;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r33) {
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mIdentity = ((AppUser) r2).getIdentity();
        if (getMArg0() == null) goto L9;
        CourseManager r4 = CourseManager.OXO1;
        String r5 = getMArg0();
        Intrinsics.XXI(r5);
        r4.OIX0iXi(r5, this.mIdentity, new OXOXO11(this));
    L10:
        this.widthPixels = ScreenUtils.getAppScreenWidth();
        return;
    L9:
        ToastUtils.showLong(R.string.request_error);
        goto L10
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        BaseFragment.OXO1 r0 = BaseFragment.Companion;
        CourseDetails r1 = this.mCourseDetails;
        if (r1 == null) goto L5;
        String r2 = r1.getCourseIntro();
    L6:
        Bundle r3 = new Bundle();
        r3.putString("mArg0", r2);
        r3.putParcelable("mArg2", null);
        r3.putSerializable("mArg3", null);
        BaseFragment r5 = (BaseFragment) DetailIntroduceFragment.class.newInstance();
        r5.setArguments(r3);
        if (r5 == null) goto L15;
        DetailIntroduceFragment r6 = (DetailIntroduceFragment) r5;
        CourseDetails r4 = this.mCourseDetails;
        Bundle r7 = new Bundle();
        r7.putString("mArg0", null);
        r7.putParcelable("mArg2", null);
        r7.putSerializable("mArg3", r4);
        BaseFragment r8 = (BaseFragment) CourseActionFragment.class.newInstance();
        r8.setArguments(r7);
        if (r8 == null) goto L13;
        return CollectionsKt__CollectionsKt.iXiX011(new BaseFragment[]{r6, (CourseActionFragment) r8});
    L13:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.course.CourseActionFragment");
    L15:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.course.DetailIntroduceFragment");
    L5:
        r2 = null;
        goto L6
    }

    public final void initImage() {
        RequestBuilder<Bitmap> r0 = Glide.with(getMRoundPicImage().getContext()).asBitmap();
        CourseDetails r1 = this.mCourseDetails;
        if (r1 == null) goto L5;
        String r2 = r1.getCoursePic1();
    L6:
        r0.load(r2).into(new OXO1(this));
        return;
    L5:
        r2 = null;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getTable().setBackgroundColor(gk4.iO(getMContext(), R.color.view_page_tablayout_bg));
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

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_course_details;
    }

    @SuppressLint({"SetTextI18n"})
    public final void onButtonClick(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        if (this.isButtonClick == false) goto L5;
        return;
    L5:
        CourseDetails r6 = this.mCourseDetails;
        String r0 = null;
        if (r6 == null) goto L8;
        VideoFile r7 = r6.getVideoFile();
    L9:
        if (r7 != null) goto L12;
        ToastUtils.showLong(R.string.no_exit_file_doload);
        return;
    L12:
        this.isButtonClick = true;
        String r1 = "course" + getMArg0() + ".mp4";
        final File r2 = new File(uz0.i0X000X0O(sz0.OXO1).getAbsolutePath(), r1);
        if (r2.exists() == true) goto L21;
        this.isDownload = true;
        CourseManager r8 = CourseManager.OXO1;
        CourseDetails r3 = this.mCourseDetails;
        if (r3 == null) goto L19;
        VideoFile r4 = r3.getVideoFile();
        if (r4 == null) goto L19;
        r0 = r4.getFilePath();
    L19:
        Intrinsics.XXI(r0);
        r8.O00(r0, r1, new I01O1(this, r2));
        return;
    L21:
        String r9 = r2.getAbsolutePath();
        Intrinsics.O10IXXX0X(r9, "getAbsolutePath(...)");
        playVideo(r9);
        return;
    L8:
        r7 = null;
        goto L9
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (this.isDownload == false) goto L6;
        ToastUtils.showLong(R.string.music_down_transmit_tip);
        return;
    L6:
        super.onHandleBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initImage();
        this.isButtonClick = false;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        ToastUtils.showLong("功能开发中..", new Object[0]);
    }

    public final void onTitleRightOtherClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
    }

    public final void playVideo(@aa1 String r5) {
        Intrinsics.X0O(r5, "absolutePath");
        this.isDownload = false;
        CourseDetails r1 = this.mCourseDetails;
        Bundle r2 = new Bundle();
        r2.putString("mArg0", r5);
        r2.putParcelable("mArg2", null);
        r2.putSerializable("mArg3", r1);
        Intent r6 = new Intent(this, CourseVideoActivity.class);
        r6.putExtras(r2);
        startActivity(r6);
        this.isButtonClick = false;
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public FragmentManager provideFragmentManager() {
        FragmentManager r0 = getSupportFragmentManager();
        Intrinsics.O10IXXX0X(r0, "getSupportFragmentManager(...)");
        return r0;
    }

    public final void setButtonClick(boolean r1) {
        this.isButtonClick = r1;
    }

    public final void setCollectImage() {
        ImageView r0 = getAbhTitleRight();
        if (this.courseCollect == false) goto L5;
        int r1 = R.drawable.icon_course_collection_true;
    L6:
        r0.setImageResource(r1);
        return;
    L5:
        r1 = R.drawable.icon_course_collection;
        goto L6
    }

    public final void setCourseCollect(boolean r1) {
        this.courseCollect = r1;
    }

    public final void setDownload(boolean r1) {
        this.isDownload = r1;
    }

    public final void setLayoutHeight(int r4, int r5) {
        ViewGroup.LayoutParams r0 = getMCardViewLayout().getLayoutParams();
        r0.height = ((this.widthPixels - SizeUtils.dp2px(30.0f)) * r5) / r4;
        getMCardViewLayout().setLayoutParams(r0);
    }

    public final void setMFragmentPagerAdapter(@aa1 BaseFragmentPagerAdapter r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFragmentPagerAdapter = r2;
    }

    public final void setMIdentity(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mIdentity = r2;
    }

    public final void setMViewPager(@aa1 ViewPager r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mViewPager = r2;
    }

    @SuppressLint({"SetTextI18n"})
    public final void setView() {
        TextView r0 = (TextView) findViewById(R.id.abh_title_center);
        CourseDetails r1 = this.mCourseDetails;
        String r2 = null;
        if (r1 == null) goto L5;
        String r3 = r1.getCourseName();
    L6:
        r0.setText(r3);
        initImage();
        TextView r4 = getMCourseName();
        CourseDetails r5 = this.mCourseDetails;
        if (r5 == null) goto L9;
        String r6 = r5.getCourseName();
    L10:
        r4.setText(r6);
        PFMedium r7 = getMCourseDetailsHot();
        CourseDetails r8 = this.mCourseDetails;
        if (r8 == null) goto L13;
        String r9 = r8.getCourseClass();
    L14:
        r7.setText(r9 + getString(R.string.people_join));
        PFMedium r10 = getMCourseDiff();
        CourseDetails r11 = this.mCourseDetails;
        if (r11 == null) goto L17;
        String r12 = r11.getCourseDiff();
    L18:
        r10.setText(r12);
        PFMedium r13 = getMCourseTime();
        CourseDetails r14 = this.mCourseDetails;
        if (r14 == null) goto L21;
        String r15 = r14.getCourseTime();
    L22:
        r13.setText(r15 + getMContext().getString(R.string.minute));
        PFMedium r16 = getMCourseHeat();
        CourseDetails r17 = this.mCourseDetails;
        if (r17 == null) goto L25;
        String r18 = r17.getCourseHeat();
    L26:
        r16.setText(r18 + getString(R.string.kcal));
        CourseDetails r19 = this.mCourseDetails;
        if (r19 == null) goto L29;
        r2 = r19.getCollectFlag();
    L29:
        this.courseCollect = Intrinsics.XOO0ii0(r2, Api.Y);
        setCollectImage();
        View r20 = findViewById(R.id.view_pager);
        Intrinsics.O10IXXX0X(r20, "findViewById(...)");
        setMViewPager((ViewPager) r20);
        BaseFragmentPagerAdapter r21 = new BaseFragmentPagerAdapter(this);
        getMViewPager().setAdapter(r21);
        getMViewPager().setOffscreenPageLimit(r21.getCount());
        setMFragmentPagerAdapter(r21);
        getMFragmentPagerAdapter().setTitles(new String[]{getMContext().getString(R.string.heath_course_description), getMContext().getString(R.string.course_action)});
        getTable().setupWithViewPager(getMViewPager());
        return;
    L25:
        r18 = null;
        goto L26
    L21:
        r15 = null;
        goto L22
    L17:
        r12 = null;
        goto L18
    L13:
        r9 = null;
        goto L14
    L9:
        r6 = null;
        goto L10
    L5:
        r3 = null;
        goto L6
    }

    public final void setWidthPixels(int r1) {
        this.widthPixels = r1;
    }
}
