package com.sma.smartv3.p610ui.p612me;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ad6;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.example.health.data.HealthConnectManager;
import com.example.health.presentation.HealthConnectPermissionsActivity;
import com.example.health.presentation.screen.exercisesession.ExerciseSessionViewModel;
import com.example.health.presentation.screen.exercisesession.ExerciseSessionViewModelFactory;
import com.example.health.presentation.screen.inputreadings.InputReadingsViewModel;
import com.example.health.presentation.screen.inputreadings.InputReadingsViewModelFactory;
import com.example.health.presentation.screen.sleepsession.SleepSessionViewModel;
import com.example.health.presentation.screen.sleepsession.SleepSessionViewModelFactory;
import com.sma.smartv3.p610ui.p612me.HealthConnectActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nHealthConnectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectActivity.kt\ncom/sma/smartv3/ui/me/HealthConnectActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n87#2,7:247\n94#2,3:255\n70#2,7:258\n97#2:265\n1#3:254\n*S KotlinDebug\n*F\n+ 1 HealthConnectActivity.kt\ncom/sma/smartv3/ui/me/HealthConnectActivity\n*L\n137#1:247,7\n137#1:255,3\n137#1:258,7\n137#1:265\n137#1:254\n*E\n"})
public final class HealthConnectActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    public static final int DIFFERENTIAL_CHANGES = 3;

    @aa1
    public static final String DOWNLOAD_URL = "https://play.google.com/store/apps/details?id=com.google.android.apps.healthdata&pcampaignid=web_share";
    public static final int EXERCISE_SESSION = 0;

    @aa1
    public static final String HEALTH_CONNECT = "com.google.android.apps.healthdata";
    public static final int INPUT_READINGS = 2;
    public static final int SETTING = 4;
    public static final int SLEEP_SESSION = 1;

    @aa1
    public static final String TAG = "HealthConnectActivity";
    public static final int VERSION = 34;

    @tb1
    private HealthConnectManager healthConnectManager;

    @tb1
    private ExerciseSessionViewModel viewModel;

    @tb1
    private InputReadingsViewModel viewModelInput;

    @tb1
    private SleepSessionViewModel viewModelSleep;

    @aa1
    private final Timer mTimer = new Timer();

    @aa1
    private final Lazy abh_title_center$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XX01OiXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HealthConnectActivity.abh_title_center_delegate$lambda$0(this.f4936IO);
        }
    });

    @aa1
    private final Lazy abh_title_other_right$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiI1XIX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HealthConnectActivity.abh_title_other_right_delegate$lambda$0(this.f2227IO);
        }
    });

    @aa1
    private final Lazy check_health_connect$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0XIXO11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HealthConnectActivity.check_health_connect_delegate$lambda$0(this.f2555IO);
        }
    });

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.HealthConnectActivity$onCheckHealthConnect$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.me.HealthConnectActivity$onCheckHealthConnect$1", m39466f = "HealthConnectActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C189451 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C189451(Continuation<? super C189451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HealthConnectActivity.this.new C189451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C189451) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            HealthConnectManager healthConnectManager = HealthConnectActivity.this.healthConnectManager;
            if (healthConnectManager != null) {
                healthConnectManager.O00(HealthConnectActivity.this);
            }
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.HealthConnectActivity$onLaunch$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.me.HealthConnectActivity$onLaunch$1", m39466f = "HealthConnectActivity.kt", m39467i = {0, 0}, m39468l = {152}, m39469m = "invokeSuspend", m39470n = {"it", "$i$a$-let-HealthConnectActivity$onLaunch$1$1"}, m39472s = {"L$1", "I$1"}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nHealthConnectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectActivity.kt\ncom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n140#2,5:247\n145#2,5:253\n1#3:252\n*S KotlinDebug\n*F\n+ 1 HealthConnectActivity.kt\ncom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1\n*L\n159#1:247,5\n159#1:253,5\n159#1:252\n*E\n"})
    public static final class C290131 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $id;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C290131(int i, Continuation<? super C290131> continuation) {
            super(2, continuation);
            this.$id = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HealthConnectActivity.this.new C290131(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290131) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HealthConnectActivity healthConnectActivity;
            int i;
            Object objI0iXXO = C2798pb.I0iXXO();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.X1ii(obj);
                ExerciseSessionViewModel exerciseSessionViewModel = HealthConnectActivity.this.viewModel;
                if (exerciseSessionViewModel != null) {
                    healthConnectActivity = HealthConnectActivity.this;
                    int i3 = this.$id;
                    HealthConnectManager healthConnectManager = healthConnectActivity.healthConnectManager;
                    Intrinsics.XXI(healthConnectManager);
                    Set<String> permissions = exerciseSessionViewModel.getPermissions(i3);
                    this.L$0 = healthConnectActivity;
                    this.L$1 = SpillingKt.OXO1(exerciseSessionViewModel);
                    this.I$0 = i3;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = healthConnectManager.iIiiO(permissions, this);
                    if (obj == objI0iXXO) {
                        return objI0iXXO;
                    }
                    i = i3;
                }
                return Unit.OXO1;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            healthConnectActivity = (HealthConnectActivity) this.L$0;
            ResultKt.X1ii(obj);
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            LogUtils.m11130i("HealthConnectActivity hasAllPermissions " + zBooleanValue);
            if (!zBooleanValue) {
                Bundle bundle = new Bundle();
                bundle.putInt(String.valueOf(healthConnectActivity.getMArg1()), i);
                Intent intent = new Intent(healthConnectActivity, (Class<?>) HealthConnectPermissionsActivity.class);
                intent.putExtras(bundle);
                healthConnectActivity.startActivityForResult(intent, i);
            }
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.HealthConnectActivity$onTitleRightOtherClick$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.me.HealthConnectActivity$onTitleRightOtherClick$1", m39466f = "HealthConnectActivity.kt", m39467i = {}, m39468l = {116}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C290141 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C290141(Continuation<? super C290141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HealthConnectActivity.this.new C290141(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290141) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                HealthConnectManager healthConnectManager = HealthConnectActivity.this.healthConnectManager;
                if (healthConnectManager != null) {
                    this.label = 1;
                    if (healthConnectManager.II1Xi0(this) == objI0iXXO) {
                        return objI0iXXO;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.HealthConnectActivity$setCheckView$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.me.HealthConnectActivity$setCheckView$1", m39466f = "HealthConnectActivity.kt", m39467i = {0, 0}, m39468l = {103}, m39469m = "invokeSuspend", m39470n = {"it", "$i$a$-let-HealthConnectActivity$setCheckView$1$1"}, m39472s = {"L$0", "I$0"}, m39473v = 1)
    public static final class C290151 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        public C290151(Continuation<? super C290151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HealthConnectActivity.this.new C290151(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290151) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AppCompatCheckBox appCompatCheckBox;
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                ExerciseSessionViewModel exerciseSessionViewModel = HealthConnectActivity.this.viewModel;
                if (exerciseSessionViewModel != null) {
                    HealthConnectActivity healthConnectActivity = HealthConnectActivity.this;
                    if (ad6.XIi00iiXO(healthConnectActivity.getMContext(), "com.google.android.apps.healthdata")) {
                        AppCompatCheckBox check_health_connect = healthConnectActivity.getCheck_health_connect();
                        HealthConnectManager healthConnectManager = healthConnectActivity.healthConnectManager;
                        Intrinsics.XXI(healthConnectManager);
                        Set<String> permissions = exerciseSessionViewModel.getPermissions(0);
                        this.L$0 = SpillingKt.OXO1(exerciseSessionViewModel);
                        this.L$1 = check_health_connect;
                        this.I$0 = 0;
                        this.label = 1;
                        obj = healthConnectManager.iIiiO(permissions, this);
                        if (obj == objI0iXXO) {
                            return objI0iXXO;
                        }
                        appCompatCheckBox = check_health_connect;
                    } else {
                        healthConnectActivity.getCheck_health_connect().setChecked(false);
                    }
                }
                return Unit.OXO1;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            appCompatCheckBox = (AppCompatCheckBox) this.L$1;
            ResultKt.X1ii(obj);
            appCompatCheckBox.setChecked(((Boolean) obj).booleanValue());
            return Unit.OXO1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abh_title_center_delegate$lambda$0(HealthConnectActivity healthConnectActivity) {
        return (PFMedium) healthConnectActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abh_title_other_right_delegate$lambda$0(HealthConnectActivity healthConnectActivity) {
        return (ImageView) healthConnectActivity.findViewById(R.id.abh_title_other_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatCheckBox check_health_connect_delegate$lambda$0(HealthConnectActivity healthConnectActivity) {
        return (AppCompatCheckBox) healthConnectActivity.findViewById(R.id.check_health_connect);
    }

    private final PFMedium getAbh_title_center() {
        return (PFMedium) this.abh_title_center$delegate.getValue();
    }

    private final ImageView getAbh_title_other_right() {
        return (ImageView) this.abh_title_other_right$delegate.getValue();
    }

    private final int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatCheckBox getCheck_health_connect() {
        return (AppCompatCheckBox) this.check_health_connect$delegate.getValue();
    }

    private final void onLaunch(int i) {
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C290131(i, null), 3, null);
    }

    private final void onPermission(int i) {
        if (getApiLevel() >= 34) {
            if (ad6.O00(this)) {
                onLaunch(i);
            }
        } else {
            if (ad6.XIi00iiXO(getMContext(), "com.google.android.apps.healthdata")) {
                onLaunch(i);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", DOWNLOAD_URL);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }

    private final void onTime() {
        this.mTimer.schedule(new TimerTask() { // from class: com.sma.smartv3.ui.me.HealthConnectActivity$onTime$task$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this.f54719IO), null, null, new HealthConnectActivity$onTime$task$1$run$1(this.f54719IO, null), 3, null);
            }
        }, 0L, 1000L);
    }

    private final void setCheckView() {
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C290151(null), 3, null);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        this.healthConnectManager = new HealthConnectManager(this);
        HealthConnectManager healthConnectManager = this.healthConnectManager;
        Intrinsics.XXI(healthConnectManager);
        this.viewModel = (ExerciseSessionViewModel) new ViewModelProvider(this, new ExerciseSessionViewModelFactory(healthConnectManager)).get(ExerciseSessionViewModel.class);
        HealthConnectManager healthConnectManager2 = this.healthConnectManager;
        Intrinsics.XXI(healthConnectManager2);
        this.viewModelSleep = (SleepSessionViewModel) new ViewModelProvider(this, new SleepSessionViewModelFactory(healthConnectManager2)).get(SleepSessionViewModel.class);
        HealthConnectManager healthConnectManager3 = this.healthConnectManager;
        Intrinsics.XXI(healthConnectManager3);
        this.viewModelInput = (InputReadingsViewModel) new ViewModelProvider(this, new InputReadingsViewModelFactory(healthConnectManager3)).get(InputReadingsViewModel.class);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getAbh_title_center().setText(R.string.health_connect);
        getAbh_title_other_right().setImageResource(R.drawable.icon_run_setting);
        setCheckView();
        onTime();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_health_connect;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        ExerciseSessionViewModel exerciseSessionViewModel;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == 0 && (exerciseSessionViewModel = this.viewModel) != null) {
            ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("result") : null;
            if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                return;
            }
            getCheck_health_connect().setChecked(stringArrayListExtra.size() == exerciseSessionViewModel.getPermissions(0).size());
            LogUtils.m11130i("HealthConnectActivity onResult" + (stringArrayListExtra.size() == exerciseSessionViewModel.getPermissions(0).size()));
        }
    }

    public final void onCheckHealthConnect(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (!getCheck_health_connect().isChecked()) {
            XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C189451(null), 3, null);
            return;
        }
        LogUtils.m11130i("HealthConnectActivity onPermission");
        getCheck_health_connect().setChecked(false);
        onPermission(0);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mTimer.cancel();
    }

    public final void onExerciseSessions(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        onPermission(0);
    }

    public final void onInputChanges(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        LogUtils.m11130i("HealthConnectActivity onInputChanges");
        onPermission(3);
    }

    public final void onInputReadings(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        LogUtils.m11130i("HealthConnectActivity onInputReadings");
        onPermission(2);
    }

    public final void onSleepSessions(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        onPermission(1);
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightOtherClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C290141(null), 3, null);
    }
}
