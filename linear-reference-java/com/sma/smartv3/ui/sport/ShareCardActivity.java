package com.sma.smartv3.ui.sport;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.r84;
import com.android.mltcode.paycertificationapi.s84;
import com.android.mltcode.paycertificationapi.t84;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.u84;
import com.android.mltcode.paycertificationapi.v84;
import com.bestmafen.androidbase.base.BaseFragment;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.LocationDao;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nShareCardActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareCardActivity.kt\ncom/sma/smartv3/ui/sport/ShareCardActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,143:1\n104#2,9:144\n113#2,3:154\n99#2,3:157\n104#2,9:160\n113#2,3:170\n99#2,3:173\n104#2,9:176\n113#2,3:186\n99#2,3:189\n104#2,9:192\n113#2,3:202\n99#2,3:205\n104#2,9:208\n113#2,3:218\n99#2,3:221\n104#2,9:224\n113#2,3:234\n99#2,3:237\n104#2,9:240\n113#2,3:250\n99#2,3:253\n1#3:153\n1#3:169\n1#3:185\n1#3:201\n1#3:217\n1#3:233\n1#3:249\n37#4,2:256\n*S KotlinDebug\n*F\n+ 1 ShareCardActivity.kt\ncom/sma/smartv3/ui/sport/ShareCardActivity\n*L\n47#1:144,9\n47#1:154,3\n47#1:157,3\n48#1:160,9\n48#1:170,3\n48#1:173,3\n49#1:176,9\n49#1:186,3\n49#1:189,3\n50#1:192,9\n50#1:202,3\n50#1:205,3\n52#1:208,9\n52#1:218,3\n52#1:221,3\n53#1:224,9\n53#1:234,3\n53#1:237,3\n54#1:240,9\n54#1:250,3\n54#1:253,3\n47#1:153\n48#1:169\n49#1:185\n50#1:201\n52#1:217\n53#1:233\n54#1:249\n114#1:256,2\n*E\n"})
public final class ShareCardActivity extends BaseFragmentPagerActivity implements ViewPager.OnPageChangeListener {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;
    private boolean isLocationEmpty;
    private DetailCaloriesCardFragment mDetailCaloriesCardFragment;
    private DetailCustomizeCardFragment mDetailCustomizeCardFragment;
    private DetailDataCardFragment mDetailDataCardFragment;
    private DetailMapCardFragment mDetailMapCardFragment;
    private DetailRouteCardFragment mDetailRouteCardFragment;

    @aa1
    private final Lazy mLocationDao$delegate;
    private Workout mWorkout;

    @aa1
    private final Lazy mWorkoutDao$delegate;

    @aa1
    private final Lazy table$delegate;

    public ShareCardActivity() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new r84(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new s84(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new t84(this));
        this.mLocationDao$delegate = LazyKt__LazyJVMKt.iO(new u84());
        this.mWorkoutDao$delegate = LazyKt__LazyJVMKt.iO(new v84());
        this.isLocationEmpty = true;
    }

    public static /* synthetic */ WorkoutDao I0iXXO() {
        return mWorkoutDao_delegate$lambda$0();
    }

    public static /* synthetic */ PFMedium O10IXXX0X(ShareCardActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OIX0iXi(ShareCardActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TabLayout X1ii(ShareCardActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LocationDao XXI() {
        return mLocationDao_delegate$lambda$0();
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(ShareCardActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(ShareCardActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private final LocationDao getMLocationDao() {
        return (LocationDao) getValue();
    }

    private final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) getValue();
    }

    private static final LocationDao mLocationDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().locationDao();
    }

    private static final WorkoutDao mWorkoutDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    private static final TabLayout table_delegate$lambda$0(ShareCardActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    public final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r11) {
        this.mWorkout = getMWorkoutDao().getWorkoutById(getMArg1());
        LocationDao r12 = getMLocationDao();
        Workout r0 = this.mWorkout;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mWorkout");
        r0 = null;
    L5:
        long r3 = r0.getMStart();
        Workout r1 = this.mWorkout;
        if (r1 != null) goto L8;
        Intrinsics.XXO("mWorkout");
        r1 = null;
    L8:
        List<Location> r13 = r12.getLocation(r3, r1.getMEnd());
        if (r13.isEmpty() == false) goto L11;
    L14:
        boolean r14 = true;
    L15:
        this.isLocationEmpty = r14;
        if (r14 == true) goto L47;
        BaseFragment.OXO1 r15 = BaseFragment.Companion;
        Workout r16 = this.mWorkout;
        if (r16 != null) goto L20;
        Intrinsics.XXO("mWorkout");
        r16 = null;
    L20:
        Bundle r9 = new Bundle();
        r9.putString("mArg0", null);
        r9.putParcelable("mArg2", null);
        r9.putSerializable("mArg3", r16);
        BaseFragment r17 = (BaseFragment) DetailMapCardFragment.class.newInstance();
        r17.setArguments(r9);
        if (r17 == null) goto L46;
        this.mDetailMapCardFragment = (DetailMapCardFragment) r17;
        Workout r18 = this.mWorkout;
        if (r18 != null) goto L25;
        Intrinsics.XXO("mWorkout");
        r18 = null;
    L25:
        Bundle r10 = new Bundle();
        r10.putString("mArg0", null);
        r10.putParcelable("mArg2", null);
        r10.putSerializable("mArg3", r18);
        BaseFragment r19 = (BaseFragment) DetailCaloriesCardFragment.class.newInstance();
        r19.setArguments(r10);
        if (r19 == null) goto L44;
        this.mDetailCaloriesCardFragment = (DetailCaloriesCardFragment) r19;
        Workout r110 = this.mWorkout;
        if (r110 != null) goto L30;
        Intrinsics.XXO("mWorkout");
        r110 = null;
    L30:
        Bundle r4 = new Bundle();
        r4.putString("mArg0", null);
        r4.putParcelable("mArg2", null);
        r4.putSerializable("mArg3", r110);
        BaseFragment r111 = (BaseFragment) DetailRouteCardFragment.class.newInstance();
        r111.setArguments(r4);
        if (r111 == null) goto L42;
        this.mDetailRouteCardFragment = (DetailRouteCardFragment) r111;
        Workout r112 = this.mWorkout;
        if (r112 != null) goto L35;
        Intrinsics.XXO("mWorkout");
        r112 = null;
    L35:
        Bundle r2 = new Bundle();
        r2.putString("mArg0", null);
        r2.putParcelable("mArg2", null);
        r2.putSerializable("mArg3", r112);
        BaseFragment r113 = (BaseFragment) DetailCustomizeCardFragment.class.newInstance();
        r113.setArguments(r2);
        if (r113 == null) goto L40;
        this.mDetailCustomizeCardFragment = (DetailCustomizeCardFragment) r113;
        return;
    L40:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailCustomizeCardFragment");
    L42:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailRouteCardFragment");
    L44:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailCaloriesCardFragment");
    L46:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailMapCardFragment");
    L47:
        BaseFragment.OXO1 r114 = BaseFragment.Companion;
        Workout r115 = this.mWorkout;
        if (r115 != null) goto L50;
        Intrinsics.XXO("mWorkout");
        r115 = null;
    L50:
        Bundle r20 = new Bundle();
        r20.putString("mArg0", null);
        r20.putParcelable("mArg2", null);
        r20.putSerializable("mArg3", r115);
        BaseFragment r116 = (BaseFragment) DetailDataCardFragment.class.newInstance();
        r116.setArguments(r20);
        if (r116 == null) goto L69;
        this.mDetailDataCardFragment = (DetailDataCardFragment) r116;
        Workout r117 = this.mWorkout;
        if (r117 != null) goto L55;
        Intrinsics.XXO("mWorkout");
        r117 = null;
    L55:
        Bundle r21 = new Bundle();
        r21.putString("mArg0", null);
        r21.putParcelable("mArg2", null);
        r21.putSerializable("mArg3", r117);
        BaseFragment r118 = (BaseFragment) DetailCaloriesCardFragment.class.newInstance();
        r118.setArguments(r21);
        if (r118 == null) goto L67;
        this.mDetailCaloriesCardFragment = (DetailCaloriesCardFragment) r118;
        Workout r119 = this.mWorkout;
        if (r119 != null) goto L60;
        Intrinsics.XXO("mWorkout");
        r119 = null;
    L60:
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", r119);
        BaseFragment r120 = (BaseFragment) DetailCustomizeCardFragment.class.newInstance();
        r120.setArguments(r5);
        if (r120 == null) goto L65;
        this.mDetailCustomizeCardFragment = (DetailCustomizeCardFragment) r120;
        return;
    L65:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailCustomizeCardFragment");
    L67:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailCaloriesCardFragment");
    L69:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.sport.DetailDataCardFragment");
    L11:
        if (r13.size() < 2) goto L14;
        r14 = false;
        goto L15
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        ArrayList r0 = new ArrayList();
        DetailCustomizeCardFragment r4 = null;
        if (this.isLocationEmpty == true) goto L19;
        DetailMapCardFragment r1 = this.mDetailMapCardFragment;
        if (r1 != null) goto L7;
        Intrinsics.XXO("mDetailMapCardFragment");
        r1 = null;
    L7:
        r0.add(r1);
        DetailCaloriesCardFragment r2 = this.mDetailCaloriesCardFragment;
        if (r2 != null) goto L10;
        Intrinsics.XXO("mDetailCaloriesCardFragment");
        r2 = null;
    L10:
        r0.add(r2);
        DetailRouteCardFragment r3 = this.mDetailRouteCardFragment;
        if (r3 != null) goto L13;
        Intrinsics.XXO("mDetailRouteCardFragment");
        r3 = null;
    L13:
        r0.add(r3);
        DetailCustomizeCardFragment r5 = this.mDetailCustomizeCardFragment;
        if (r5 != null) goto L16;
        Intrinsics.XXO("mDetailCustomizeCardFragment");
    L17:
        r0.add(r4);
        return r0;
    L16:
        r4 = r5;
        goto L17
    L19:
        DetailDataCardFragment r6 = this.mDetailDataCardFragment;
        if (r6 != null) goto L22;
        Intrinsics.XXO("mDetailDataCardFragment");
        r6 = null;
    L22:
        r0.add(r6);
        DetailCaloriesCardFragment r7 = this.mDetailCaloriesCardFragment;
        if (r7 != null) goto L25;
        Intrinsics.XXO("mDetailCaloriesCardFragment");
        r7 = null;
    L25:
        r0.add(r7);
        DetailCustomizeCardFragment r8 = this.mDetailCustomizeCardFragment;
        if (r8 != null) goto L28;
        Intrinsics.XXO("mDetailCustomizeCardFragment");
    L29:
        r0.add(r4);
        return r0;
    L28:
        r4 = r8;
        goto L29
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    @SuppressLint({"SuspiciousIndentation"})
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.share));
        ArrayList r0 = new ArrayList();
        if (this.isLocationEmpty == true) goto L5;
        String r1 = getString(R.string.map);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
        r0.add(r1);
        String r2 = getString(R.string.calories);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        r0.add(r2);
        String r3 = getString(R.string.route);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        r0.add(r3);
        String r4 = getString(R.string.eq_user);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        r0.add(r4);
    L6:
        getMFragmentPagerAdapter().setTitles((CharSequence[]) r0.toArray(new String[0]));
        getTable().setBackgroundColor(gk4.iO(getMContext(), R.color.view_page_tablayout_bg));
        getTable().setupWithViewPager(getMViewPager());
        getMViewPager().addOnPageChangeListener(this);
        return;
    L5:
        String r5 = getString(R.string.data);
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        r0.add(r5);
        String r6 = getString(R.string.calories);
        Intrinsics.O10IXXX0X(r6, "getString(...)");
        r0.add(r6);
        String r7 = getString(R.string.eq_user);
        Intrinsics.O10IXXX0X(r7, "getString(...)");
        r0.add(r7);
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_share_map_card;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r6, int r7, @tb1 Intent r8) {
        super.onActivityResult(r6, r7, r8);
        Fragment r3 = null;
        if (this.isLocationEmpty == true) goto L21;
        if (getMViewPager().getCurrentItem() != 2) goto L13;
        DetailRouteCardFragment r0 = this.mDetailRouteCardFragment;
        if (r0 != null) goto L9;
        Intrinsics.XXO("mDetailRouteCardFragment");
    L10:
        r3.onActivityResult(r6, r7, r8);
        return;
    L9:
        r3 = r0;
        goto L10
    L13:
        if (getMViewPager().getCurrentItem() != 3) goto L36;
        DetailCustomizeCardFragment r1 = this.mDetailCustomizeCardFragment;
        if (r1 != null) goto L17;
        Intrinsics.XXO("mDetailCustomizeCardFragment");
    L18:
        r3.onActivityResult(r6, r7, r8);
        return;
    L17:
        r3 = r1;
        goto L18
    L36:
        return;
    L21:
        if (getMViewPager().getCurrentItem() != 1) goto L29;
        DetailDataCardFragment r2 = this.mDetailDataCardFragment;
        if (r2 != null) goto L25;
        Intrinsics.XXO("mDetailDataCardFragment");
    L26:
        r3.onActivityResult(r6, r7, r8);
        return;
    L25:
        r3 = r2;
        goto L26
    L29:
        if (getMViewPager().getCurrentItem() != 2) goto L37;
        DetailCustomizeCardFragment r4 = this.mDetailCustomizeCardFragment;
        if (r4 != null) goto L33;
        Intrinsics.XXO("mDetailCustomizeCardFragment");
    L34:
        r3.onActivityResult(r6, r7, r8);
        return;
    L33:
        r3 = r4;
        goto L34
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int r1) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int r1, float r2, int r3) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int r2) {
        if (r2 == 2) goto L5;
        return;
    L5:
        if (this.isLocationEmpty == true) goto L12;
        DetailRouteCardFragment r3 = this.mDetailRouteCardFragment;
        if (r3 != null) goto L9;
        Intrinsics.XXO("mDetailRouteCardFragment");
        r3 = null;
    L9:
        r3.getSnapShot();
        return;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
