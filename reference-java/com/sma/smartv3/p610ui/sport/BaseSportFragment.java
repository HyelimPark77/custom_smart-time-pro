package com.sma.smartv3.p610ui.sport;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
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
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p610ui.sport.BaseSportFragment;
import com.sma.smartv3.p610ui.status.SportRecordsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.component.BleConnector;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBaseSportFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSportFragment.kt\ncom/sma/smartv3/ui/sport/BaseSportFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n19#2:149\n15#2:150\n19#2:151\n15#2:152\n1869#3,2:153\n78#4,3:155\n81#4,5:159\n99#4,7:164\n106#4,3:172\n79#4,7:175\n109#4:182\n78#4,3:183\n81#4,5:187\n99#4,7:192\n106#4,3:200\n79#4,7:203\n109#4:210\n1#5:158\n1#5:171\n1#5:186\n1#5:199\n*S KotlinDebug\n*F\n+ 1 BaseSportFragment.kt\ncom/sma/smartv3/ui/sport/BaseSportFragment\n*L\n53#1:149\n53#1:150\n124#1:151\n124#1:152\n126#1:153,2\n64#1:155,3\n64#1:159,5\n81#1:164,7\n81#1:172,3\n81#1:175,7\n81#1:182\n85#1:183,3\n85#1:187,5\n145#1:192,7\n145#1:200,3\n145#1:203,7\n145#1:210\n64#1:158\n81#1:171\n85#1:186\n145#1:199\n*E\n"})
public abstract class BaseSportFragment extends BaseFragment {

    @tb1
    private go0 mLocationServerPopup;
    private int mSportMode;

    @aa1
    private final Lazy mWorkoutDao$delegate;

    @aa1
    private AppUser userProfile;

    @aa1
    private final Lazy root_view$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i10Xi0i10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportFragment.root_view_delegate$lambda$0(this.f7525IO);
        }
    });

    @aa1
    private final Lazy ivGpsSignal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIO0X1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportFragment.ivGpsSignal_delegate$lambda$0(this.f2983IO);
        }
    });

    @aa1
    private final Lazy distanceNow$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1XXOIiI0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportFragment.distanceNow_delegate$lambda$0(this.f2809IO);
        }
    });

    @aa1
    private final Lazy distanceUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXIXX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportFragment.distanceUnit_delegate$lambda$0(this.f2027IO);
        }
    });

    @aa1
    private final Lazy gpsLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIiOOIXI0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportFragment.gpsLl_delegate$lambda$0(this.f4620IO);
        }
    });

    @aa1
    private final Lazy cumulativeRunningLl$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OiI0XIi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportFragment.cumulativeRunningLl_delegate$lambda$0(this.f3704IO);
        }
    });

    @aa1
    private final Lazy sportSet$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXii01X0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportFragment.sportSet_delegate$lambda$0(this.f2152IO);
        }
    });

    @aa1
    private final Lazy sportStart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Oi1II
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportFragment.sportStart_delegate$lambda$0(this.f3665IO);
        }
    });

    @aa1
    private final Lazy sportGoalSet$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I100IIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportFragment.sportGoalSet_delegate$lambda$0(this.f1292IO);
        }
    });

    @aa1
    private final Lazy ivBg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOOiI1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseSportFragment.ivBg_delegate$lambda$0(this.f8129IO);
        }
    });

    public BaseSportFragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.mWorkoutDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OI1i1i0O
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseSportFragment.mWorkoutDao_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout cumulativeRunningLl_delegate$lambda$0(BaseSportFragment baseSportFragment) {
        return (LinearLayout) baseSportFragment.getMView().findViewById(R.id.cumulativeRunningLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold distanceNow_delegate$lambda$0(BaseSportFragment baseSportFragment) {
        return (DINCondBold) baseSportFragment.getMView().findViewById(R.id.distanceNow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium distanceUnit_delegate$lambda$0(BaseSportFragment baseSportFragment) {
        return (PFMedium) baseSportFragment.getMView().findViewById(R.id.nowGoalUnit);
    }

    private final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) this.mWorkoutDao$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout gpsLl_delegate$lambda$0(BaseSportFragment baseSportFragment) {
        return (LinearLayout) baseSportFragment.getMView().findViewById(R.id.gpsLl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(BaseSportFragment baseSportFragment, View view) {
        baseSportFragment.startActivity(new Intent(baseSportFragment.getActivity(), (Class<?>) SportSettingActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(BaseSportFragment baseSportFragment, View view) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        LogUtils.m11130i("startSport" + bleConnector.isBound());
        if (!q62.OXO1.X0100I()) {
            baseSportFragment.onStartSport();
        } else if (BluetoothAdapter.getDefaultAdapter().isEnabled() && bleConnector.isBound()) {
            baseSportFragment.onStartSport();
        } else {
            ToastUtils.showLong(R.string.ble_not_bind);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(BaseSportFragment baseSportFragment, View view) {
        int i = baseSportFragment.mSportMode;
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", i);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(baseSportFragment.getActivity(), (Class<?>) SportGoalSetActivity.class);
        intent.putExtras(bundle);
        baseSportFragment.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(BaseSportFragment baseSportFragment, View view) {
        baseSportFragment.startActivity(new Intent(baseSportFragment.getActivity(), (Class<?>) SportRecordsActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivBg_delegate$lambda$0(BaseSportFragment baseSportFragment) {
        return (ImageView) baseSportFragment.getMView().findViewById(R.id.iv_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivGpsSignal_delegate$lambda$0(BaseSportFragment baseSportFragment) {
        return (ImageView) baseSportFragment.getMView().findViewById(R.id.ivGpsSignal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean locationServerRemind$lambda$0$0(BaseSportFragment baseSportFragment) {
        baseSportFragment.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 6);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkoutDao mWorkoutDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    private final void onStartSport() {
        if (!UtilsKt.m38846X1()) {
            locationServerRemind();
        } else if (q62.OXO1.XIXO0iiO(this.mSportMode)) {
            hr1.X0i1O(hr1.OXO1, getMActivity(), false, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.IXXI1O1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseSportFragment.onStartSport$lambda$0(this.f2099IO, ((Boolean) obj).booleanValue());
                }
            }, 6, null);
        } else {
            startSport();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStartSport$lambda$0(BaseSportFragment baseSportFragment, boolean z) {
        if (z) {
            baseSportFragment.startSport();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout root_view_delegate$lambda$0(BaseSportFragment baseSportFragment) {
        return (RelativeLayout) baseSportFragment.getMView().findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView sportGoalSet_delegate$lambda$0(BaseSportFragment baseSportFragment) {
        return (ImageView) baseSportFragment.getMView().findViewById(R.id.sportGoalSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView sportSet_delegate$lambda$0(BaseSportFragment baseSportFragment) {
        return (ImageView) baseSportFragment.getMView().findViewById(R.id.sportSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageButton sportStart_delegate$lambda$0(BaseSportFragment baseSportFragment) {
        return (ImageButton) baseSportFragment.getMView().findViewById(R.id.sportStart);
    }

    private final void startSport() {
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.ACTIVITY_RECOGNITION);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        String string = getString(R.string.activity_explain_title);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        String string2 = getString(R.string.activity_explain_content);
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        ds1.XIi00iiXO(permissionUtilsPermission, string, string2, new Function1() { // from class: com.android.mltcode.paycertificationapi.iI0000X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseSportFragment.startSport$lambda$0(this.f7779IO, (PermissionStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startSport$lambda$0(BaseSportFragment baseSportFragment, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        int i = baseSportFragment.mSportMode;
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", i);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(baseSportFragment.getActivity(), (Class<?>) SportOnGoingGpsActivity.class);
        intent.putExtras(bundle);
        baseSportFragment.startActivity(intent);
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

    public final int getMSportMode() {
        return this.mSportMode;
    }

    public final RelativeLayout getRoot_view() {
        return (RelativeLayout) this.root_view$delegate.getValue();
    }

    public final ImageView getSportGoalSet() {
        return (ImageView) this.sportGoalSet$delegate.getValue();
    }

    public final ImageView getSportSet() {
        return (ImageView) this.sportSet$delegate.getValue();
    }

    public final ImageButton getSportStart() {
        return (ImageButton) this.sportStart$delegate.getValue();
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    public void initView() {
        getSportSet().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iO00OI0i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSportFragment.initView$lambda$0(this.f7975IO, view);
            }
        });
        getSportStart().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IOOIXX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSportFragment.initView$lambda$1(this.f1837IO, view);
            }
        });
        getSportGoalSet().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IO1X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSportFragment.initView$lambda$2(this.f1770IO, view);
            }
        });
        getCumulativeRunningLl().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XO0XO0X0X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSportFragment.initView$lambda$3(this.f4685IO, view);
            }
        });
        showDistance(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_gps_sport;
    }

    public final void locationServerRemind() {
        if (this.mLocationServerPopup == null) {
            go0 go0Var = new go0(getMActivity(), 0, 2, null);
            go0Var.O1O(R.string.location_server_notification);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.IiIOX00iI
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseSportFragment.locationServerRemind$lambda$0$0(this.f2237IO));
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
        Iterator<T> it = getMWorkoutDao().getListByMode(this.mSportMode, 1).iterator();
        int mDistance = 0;
        while (it.hasNext()) {
            mDistance += ((Workout) it.next()).getMDistance();
        }
        float fX1ii = cp5.X1ii(mDistance, this.userProfile.getUnit(), false, 4, null);
        getDistanceNow().setText(fX1ii == 0.0f ? "0" : String.valueOf(fX1ii));
        getDistanceUnit().setText(getString(cp5.XX0(this.userProfile.getUnit())));
    }
}
