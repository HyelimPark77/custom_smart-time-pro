package com.sma.smartv3.p610ui.sport.course;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.CourseList;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p610ui.p612me.GoalSettingActivity;
import com.sma.smartv3.p610ui.sport.SportGoalSetActivity;
import com.sma.smartv3.p610ui.sport.SportOnGoingGpsActivity;
import com.sma.smartv3.p610ui.sport.SportSettingActivity;
import com.sma.smartv3.p610ui.sport.course.BaseSportV2Fragment;
import com.sma.smartv3.p610ui.status.SportRecordsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.component.BleConnector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBaseSportV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSportV2Fragment.kt\ncom/sma/smartv3/ui/sport/course/BaseSportV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,223:1\n19#2:224\n15#2:225\n19#2:226\n15#2:227\n50#2,3:230\n53#2:236\n55#2,2:238\n1869#3,2:228\n1563#3:233\n1634#3,2:234\n1636#3:237\n1#4:240\n1#4:244\n1#4:253\n1#4:262\n1#4:275\n1#4:290\n1#4:303\n78#5,3:241\n81#5,5:245\n78#5,3:250\n81#5,5:254\n78#5,3:259\n81#5,5:263\n99#5,7:268\n106#5,3:276\n79#5,7:279\n109#5:286\n78#5,3:287\n81#5,5:291\n99#5,7:296\n106#5,3:304\n79#5,7:307\n109#5:314\n*S KotlinDebug\n*F\n+ 1 BaseSportV2Fragment.kt\ncom/sma/smartv3/ui/sport/course/BaseSportV2Fragment\n*L\n80#1:224\n80#1:225\n160#1:226\n160#1:227\n189#1:230,3\n189#1:236\n189#1:238,2\n166#1:228,2\n189#1:233\n189#1:234,2\n189#1:237\n92#1:244\n95#1:253\n98#1:262\n117#1:275\n121#1:290\n181#1:303\n92#1:241,3\n92#1:245,5\n95#1:250,3\n95#1:254,5\n98#1:259,3\n98#1:263,5\n117#1:268,7\n117#1:276,3\n117#1:279,7\n117#1:286\n121#1:287,3\n121#1:291,5\n181#1:296,7\n181#1:304,3\n181#1:307,7\n181#1:314\n*E\n"})
public abstract class BaseSportV2Fragment extends BaseFragment {

    @tb1
    private List<CourseList> mCourseList;

    @tb1
    private go0 mLocationServerPopup;
    private int mSportMode;

    @aa1
    private final Lazy mWorkoutDao$delegate;

    @aa1
    private AppUser userProfile;

    @aa1
    private final Lazy root_view$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOIX1OX1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportV2Fragment.root_view_delegate$lambda$0(this.f3232IO);
        }
    });

    @aa1
    private final Lazy ivGpsSignal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOX1i0XO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportV2Fragment.ivGpsSignal_delegate$lambda$0(this.f1864IO);
        }
    });

    @aa1
    private final Lazy distanceNow$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIOOI0X1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportV2Fragment.distanceNow_delegate$lambda$0(this.f3012IO);
        }
    });

    @aa1
    private final Lazy distanceUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1XIi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportV2Fragment.distanceUnit_delegate$lambda$0(this.f7672IO);
        }
    });

    @aa1
    private final Lazy gpsLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXO0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportV2Fragment.gpsLl_delegate$lambda$0(this.f8339IO);
        }
    });

    @aa1
    private final Lazy cumulativeRunningLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOOI011O1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportV2Fragment.cumulativeRunningLl_delegate$lambda$0(this.f1833IO);
        }
    });

    @aa1
    private final Lazy sportSet$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1XXIX1O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportV2Fragment.sportSet_delegate$lambda$0(this.f7683IO);
        }
    });

    @aa1
    private final Lazy sportHot$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIiXOiX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportV2Fragment.sportHot_delegate$lambda$0(this.f1698IO);
        }
    });

    @aa1
    private final Lazy sportRecommendationCourse$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiIX1OO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportV2Fragment.sportRecommendationCourse_delegate$lambda$0(this.f5272IO);
        }
    });

    @aa1
    private final Lazy sportStart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OO0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportV2Fragment.sportStart_delegate$lambda$0(this.f3109IO);
        }
    });

    @aa1
    private final Lazy sportGoalSet$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIX1O10OI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportV2Fragment.sportGoalSet_delegate$lambda$0(this.f1644IO);
        }
    });

    @aa1
    private final Lazy mRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIXXOI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportV2Fragment.mRecyclerView_delegate$lambda$0(this.f3056IO);
        }
    });

    @aa1
    private final Lazy ivBg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Xi00XOi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportV2Fragment.ivBg_delegate$lambda$0(this.f5183IO);
        }
    });

    public BaseSportV2Fragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.mWorkoutDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1Xi0I1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseSportV2Fragment.mWorkoutDao_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout cumulativeRunningLl_delegate$lambda$0(BaseSportV2Fragment baseSportV2Fragment) {
        return (LinearLayout) baseSportV2Fragment.getMView().findViewById(R.id.cumulativeRunningLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold distanceNow_delegate$lambda$0(BaseSportV2Fragment baseSportV2Fragment) {
        return (DINCondBold) baseSportV2Fragment.getMView().findViewById(R.id.distanceNow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium distanceUnit_delegate$lambda$0(BaseSportV2Fragment baseSportV2Fragment) {
        return (PFMedium) baseSportV2Fragment.getMView().findViewById(R.id.nowGoalUnit);
    }

    private final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) this.mWorkoutDao$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout gpsLl_delegate$lambda$0(BaseSportV2Fragment baseSportV2Fragment) {
        return (LinearLayout) baseSportV2Fragment.getMView().findViewById(R.id.gpsLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(BaseSportV2Fragment baseSportV2Fragment, View view) {
        baseSportV2Fragment.startActivity(new Intent(baseSportV2Fragment.getActivity(), (Class<?>) GoalSettingActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(BaseSportV2Fragment baseSportV2Fragment, View view) {
        baseSportV2Fragment.startActivity(new Intent(baseSportV2Fragment.getActivity(), (Class<?>) SportSettingActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(BaseSportV2Fragment baseSportV2Fragment, View view) {
        baseSportV2Fragment.startActivity(new Intent(baseSportV2Fragment.getActivity(), (Class<?>) AllCourseActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(BaseSportV2Fragment baseSportV2Fragment, View view) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        LogUtils.m11130i("startSport2" + bleConnector.isBound());
        if (!q62.OXO1.X0100I()) {
            baseSportV2Fragment.onStartSport();
        } else if (BluetoothAdapter.getDefaultAdapter().isEnabled() && bleConnector.isBound()) {
            baseSportV2Fragment.onStartSport();
        } else {
            ToastUtils.showLong(R.string.ble_not_bind);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(BaseSportV2Fragment baseSportV2Fragment, View view) {
        int i = baseSportV2Fragment.mSportMode;
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", i);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(baseSportV2Fragment.getActivity(), (Class<?>) SportGoalSetActivity.class);
        intent.putExtras(bundle);
        baseSportV2Fragment.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$5(BaseSportV2Fragment baseSportV2Fragment, View view) {
        baseSportV2Fragment.startActivity(new Intent(baseSportV2Fragment.getActivity(), (Class<?>) SportRecordsActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivBg_delegate$lambda$0(BaseSportV2Fragment baseSportV2Fragment) {
        return (ImageView) baseSportV2Fragment.getMView().findViewById(R.id.iv_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivGpsSignal_delegate$lambda$0(BaseSportV2Fragment baseSportV2Fragment) {
        return (ImageView) baseSportV2Fragment.getMView().findViewById(R.id.ivGpsSignal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean locationServerRemind$lambda$0$0(BaseSportV2Fragment baseSportV2Fragment) {
        baseSportV2Fragment.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 6);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerView_delegate$lambda$0(BaseSportV2Fragment baseSportV2Fragment) {
        return (RecyclerView) baseSportV2Fragment.getMView().findViewById(R.id.sportRecommendationRecycler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkoutDao mWorkoutDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    private final void onStartSport() {
        if (!UtilsKt.m38846X1()) {
            locationServerRemind();
        } else if (q62.OXO1.XIXO0iiO(this.mSportMode)) {
            hr1.X0i1O(hr1.OXO1, getMActivity(), false, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.i1iOii00
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseSportV2Fragment.onStartSport$lambda$0(this.f7723IO, ((Boolean) obj).booleanValue());
                }
            }, 6, null);
        } else {
            startSport();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStartSport$lambda$0(BaseSportV2Fragment baseSportV2Fragment, boolean z) {
        if (z) {
            baseSportV2Fragment.startSport();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout root_view_delegate$lambda$0(BaseSportV2Fragment baseSportV2Fragment) {
        return (RelativeLayout) baseSportV2Fragment.getMView().findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView sportGoalSet_delegate$lambda$0(BaseSportV2Fragment baseSportV2Fragment) {
        return (ImageView) baseSportV2Fragment.getMView().findViewById(R.id.sportGoalSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView sportHot_delegate$lambda$0(BaseSportV2Fragment baseSportV2Fragment) {
        return (ImageView) baseSportV2Fragment.getMView().findViewById(R.id.sportHot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium sportRecommendationCourse_delegate$lambda$0(BaseSportV2Fragment baseSportV2Fragment) {
        return (PFMedium) baseSportV2Fragment.getMView().findViewById(R.id.sportRecommendationCourse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium sportSet_delegate$lambda$0(BaseSportV2Fragment baseSportV2Fragment) {
        return (PFMedium) baseSportV2Fragment.getMView().findViewById(R.id.sportSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageButton sportStart_delegate$lambda$0(BaseSportV2Fragment baseSportV2Fragment) {
        return (ImageButton) baseSportV2Fragment.getMView().findViewById(R.id.sportStart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startSport$lambda$0(BaseSportV2Fragment baseSportV2Fragment, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        int i = baseSportV2Fragment.mSportMode;
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", i);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(baseSportV2Fragment.getActivity(), (Class<?>) SportOnGoingGpsActivity.class);
        intent.putExtras(bundle);
        baseSportV2Fragment.startActivity(intent);
        return Unit.OXO1;
    }

    public final LinearLayout getCumulativeRunningLl() {
        return (LinearLayout) this.cumulativeRunningLl$delegate.getValue();
    }

    public final DINCondBold getDistanceNow() {
        return (DINCondBold) this.distanceNow$delegate.getValue();
    }

    public final PFMedium getDistanceUnit() {
        return (PFMedium) this.distanceUnit$delegate.getValue();
    }

    public final LinearLayout getGpsLl() {
        return (LinearLayout) this.gpsLl$delegate.getValue();
    }

    public final ImageView getIvBg() {
        return (ImageView) this.ivBg$delegate.getValue();
    }

    public final ImageView getIvGpsSignal() {
        return (ImageView) this.ivGpsSignal$delegate.getValue();
    }

    public final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.mRecyclerView$delegate.getValue();
    }

    public final int getMSportMode() {
        return this.mSportMode;
    }

    public final RelativeLayout getRoot_view() {
        return (RelativeLayout) this.root_view$delegate.getValue();
    }

    public final ImageView getSportGoalSet() {
        return (ImageView) this.sportGoalSet$delegate.getValue();
    }

    public final ImageView getSportHot() {
        return (ImageView) this.sportHot$delegate.getValue();
    }

    public final PFMedium getSportRecommendationCourse() {
        return (PFMedium) this.sportRecommendationCourse$delegate.getValue();
    }

    public final PFMedium getSportSet() {
        return (PFMedium) this.sportSet$delegate.getValue();
    }

    public final ImageButton getSportStart() {
        return (ImageButton) this.sportStart$delegate.getValue();
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    public final void initRecyclerView() {
        Collection collectionM39402iI;
        try {
            JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.IXiOXO)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                collectionM39402iI.add(new Gson().fromJson(it.next(), CourseList.class));
            }
        } catch (Exception unused) {
            collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        this.mCourseList = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
        getMRecyclerView().setAdapter(new BaseSportV2Fragment$initRecyclerView$mAdapter$1(this, requireActivity(), this.mCourseList));
    }

    public void initView() {
        getSportSet().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O1iiiO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSportV2Fragment.initView$lambda$0(this.f2862IO, view);
            }
        });
        getSportHot().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OIX1OII
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSportV2Fragment.initView$lambda$1(this.f3036IO, view);
            }
        });
        getSportRecommendationCourse().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.Ii0i0i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSportV2Fragment.initView$lambda$2(this.f2186IO, view);
            }
        });
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(requireActivity()));
        initRecyclerView();
        getSportStart().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OI1X100iX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSportV2Fragment.initView$lambda$3(this.f2927IO, view);
            }
        });
        getSportGoalSet().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iOX1i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSportV2Fragment.initView$lambda$4(this.f8146IO, view);
            }
        });
        getCumulativeRunningLl().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.i001OX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSportV2Fragment.initView$lambda$5(this.f7263IO, view);
            }
        });
        showDistance(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_gps_sport_v2;
    }

    public final void locationServerRemind() {
        if (this.mLocationServerPopup == null) {
            go0 go0Var = new go0(getMActivity(), 0, 2, null);
            go0Var.O1O(R.string.location_server_notification);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.OXXI
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseSportV2Fragment.locationServerRemind$lambda$0$0(this.f3539IO));
                }
            });
            this.mLocationServerPopup = go0Var;
        }
        ToastUtils.showLong(R.string.no_location_authorization_key);
        go0 go0Var2 = this.mLocationServerPopup;
        if (go0Var2 != null) {
            go0Var2.X0O(R.id.root_view);
        }
    }

    public final void setMSportMode(int i) {
        this.mSportMode = i;
    }

    @sf5(tag = I01XX0.O00)
    public final void showDistance(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        this.userProfile = (AppUser) appUser;
        Iterator<T> it = getMWorkoutDao().getListByMode(this.mSportMode, !i72.OXO1.XXI0XOIX() ? 1 : 0).iterator();
        int mDistance = 0;
        while (it.hasNext()) {
            mDistance += ((Workout) it.next()).getMDistance();
        }
        getDistanceNow().setText(String.valueOf(cp5.X1ii(mDistance, this.userProfile.getUnit(), false, 4, null)));
        getDistanceUnit().setText(getString(cp5.XX0(this.userProfile.getUnit())));
    }

    @sf5(tag = "test_refresh_page")
    public final void showRecyclerViewData(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        initRecyclerView();
    }

    public void startSport() {
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.ACTIVITY_RECOGNITION);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        String string = getString(R.string.activity_explain_title);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        String string2 = getString(R.string.activity_explain_content);
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        ds1.XIi00iiXO(permissionUtilsPermission, string, string2, new Function1() { // from class: com.android.mltcode.paycertificationapi.X0I00iXi0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseSportV2Fragment.startSport$lambda$0(this.f3944IO, (PermissionStatus) obj);
            }
        });
    }
}
