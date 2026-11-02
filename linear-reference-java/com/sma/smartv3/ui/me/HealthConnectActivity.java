package com.sma.smartv3.ui.me;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IiI1XIX1;
import com.android.mltcode.paycertificationapi.O0XIXO11;
import com.android.mltcode.paycertificationapi.XX01OiXi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ad6;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nHealthConnectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectActivity.kt\ncom/sma/smartv3/ui/me/HealthConnectActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n87#2,7:247\n94#2,3:255\n70#2,7:258\n97#2:265\n1#3:254\n*S KotlinDebug\n*F\n+ 1 HealthConnectActivity.kt\ncom/sma/smartv3/ui/me/HealthConnectActivity\n*L\n137#1:247,7\n137#1:255,3\n137#1:258,7\n137#1:265\n137#1:254\n*E\n"})
public final class HealthConnectActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = null;
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

    @aa1
    private final Lazy abh_title_center$delegate;

    @aa1
    private final Lazy abh_title_other_right$delegate;

    @aa1
    private final Lazy check_health_connect$delegate;

    @tb1
    private HealthConnectManager healthConnectManager;

    @aa1
    private final Timer mTimer;

    @tb1
    private ExerciseSessionViewModel viewModel;

    @tb1
    private InputReadingsViewModel viewModelInput;

    @tb1
    private SleepSessionViewModel viewModelSleep;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.HealthConnectActivity$onCheckHealthConnect$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.me.HealthConnectActivity$onCheckHealthConnect$1", f = "HealthConnectActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ HealthConnectActivity this$0;

        public AnonymousClass1(HealthConnectActivity r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new AnonymousClass1(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r2) {
            pb.I0iXXO();
            if (this.label != 0) goto L10;
            ResultKt.X1ii(r2);
            HealthConnectManager r3 = HealthConnectActivity.access$getHealthConnectManager$p(this.this$0);
            if (r3 == null) goto L8;
            r3.O00(this.this$0);
        L8:
            return Unit.OXO1;
        L10:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.HealthConnectActivity$onLaunch$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.me.HealthConnectActivity$onLaunch$1", f = "HealthConnectActivity.kt", i = {0, 0}, l = {152}, m = "invokeSuspend", n = {"it", "$i$a$-let-HealthConnectActivity$onLaunch$1$1"}, s = {"L$1", "I$1"}, v = 1)
    @SourceDebugExtension({"SMAP\nHealthConnectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectActivity.kt\ncom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n140#2,5:247\n145#2,5:253\n1#3:252\n*S KotlinDebug\n*F\n+ 1 HealthConnectActivity.kt\ncom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1\n*L\n159#1:247,5\n159#1:253,5\n159#1:252\n*E\n"})
    public static final class C34801 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $id;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ HealthConnectActivity this$0;

        public C34801(HealthConnectActivity r1, int r2, Continuation<? super C34801> r3) {
            this.this$0 = r1;
            this.$id = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new C34801(this.this$0, this.$id, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34801) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r7) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            int r2 = this.I$0;
            ExerciseSessionViewModel r3 = (ExerciseSessionViewModel) this.L$1;
            HealthConnectActivity r4 = (HealthConnectActivity) this.L$0;
            ResultKt.X1ii(r7);
        L14:
            boolean r8 = ((Boolean) r7).booleanValue();
            LogUtils.i(new Object[]{"HealthConnectActivity hasAllPermissions " + r8});
            if (r8 == true) goto L18;
            Bundle r9 = new Bundle();
            r9.putInt(String.valueOf(r4.getMArg1()), r2);
            Intent r5 = new Intent(r4, HealthConnectPermissionsActivity.class);
            r5.putExtras(r9);
            r4.startActivityForResult(r5, r2);
        L18:
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r7);
            ExerciseSessionViewModel r10 = HealthConnectActivity.access$getViewModel$p(this.this$0);
            if (r10 == null) goto L18;
            r4 = this.this$0;
            int r6 = this.$id;
            HealthConnectManager r11 = HealthConnectActivity.access$getHealthConnectManager$p(r4);
            Intrinsics.XXI(r11);
            Set<String> r12 = r10.getPermissions(r6);
            this.L$0 = r4;
            this.L$1 = SpillingKt.OXO1(r10);
            this.I$0 = r6;
            this.I$1 = 0;
            this.label = 1;
            r7 = r11.iIiiO(r12, this);
            if (r7 != r0) goto L13;
            return r0;
        L13:
            r2 = r6;
            goto L14
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.HealthConnectActivity$onTitleRightOtherClick$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.me.HealthConnectActivity$onTitleRightOtherClick$1", f = "HealthConnectActivity.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34811 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ HealthConnectActivity this$0;

        public C34811(HealthConnectActivity r1, Continuation<? super C34811> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34811(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34811) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r4);
        L14:
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r4);
            HealthConnectManager r5 = HealthConnectActivity.access$getHealthConnectManager$p(this.this$0);
            if (r5 == null) goto L14;
            this.label = 1;
            if (r5.II1Xi0(this) != r0) goto L14;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.HealthConnectActivity$setCheckView$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.me.HealthConnectActivity$setCheckView$1", f = "HealthConnectActivity.kt", i = {0, 0}, l = {103}, m = "invokeSuspend", n = {"it", "$i$a$-let-HealthConnectActivity$setCheckView$1$1"}, s = {"L$0", "I$0"}, v = 1)
    public static final class C34821 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ HealthConnectActivity this$0;

        public C34821(HealthConnectActivity r1, Continuation<? super C34821> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34821(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34821) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r7) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            AppCompatCheckBox r2 = (AppCompatCheckBox) this.L$1;
            ExerciseSessionViewModel r3 = (ExerciseSessionViewModel) this.L$0;
            ResultKt.X1ii(r7);
        L16:
            r2.setChecked(((Boolean) r7).booleanValue());
        L19:
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r7);
            ExerciseSessionViewModel r8 = HealthConnectActivity.access$getViewModel$p(this.this$0);
            if (r8 == null) goto L19;
            HealthConnectActivity r4 = this.this$0;
            if (ad6.XIi00iiXO(HealthConnectActivity.access$getMContext(r4), "com.google.android.apps.healthdata") == false) goto L17;
            AppCompatCheckBox r5 = HealthConnectActivity.access$getCheck_health_connect(r4);
            HealthConnectManager r6 = HealthConnectActivity.access$getHealthConnectManager$p(r4);
            Intrinsics.XXI(r6);
            Set<String> r9 = r8.getPermissions(0);
            this.L$0 = SpillingKt.OXO1(r8);
            this.L$1 = r5;
            this.I$0 = 0;
            this.label = 1;
            r7 = r6.iIiiO(r9, this);
            if (r7 != r0) goto L15;
            return r0;
        L15:
            r2 = r5;
            goto L16
        L17:
            HealthConnectActivity.access$getCheck_health_connect(r4).setChecked(false);
            goto L19
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public HealthConnectActivity() {
        this.mTimer = new Timer();
        this.abh_title_center$delegate = LazyKt__LazyJVMKt.iO(new XX01OiXi(this));
        this.abh_title_other_right$delegate = LazyKt__LazyJVMKt.iO(new IiI1XIX1(this));
        this.check_health_connect$delegate = LazyKt__LazyJVMKt.iO(new O0XIXO11(this));
    }

    public static /* synthetic */ PFMedium I0iXXO(HealthConnectActivity r0) {
        return abh_title_center_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AppCompatCheckBox OIX0iXi(HealthConnectActivity r0) {
        return check_health_connect_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XXI(HealthConnectActivity r0) {
        return abh_title_other_right_delegate$lambda$0(r0);
    }

    private static final PFMedium abh_title_center_delegate$lambda$0(HealthConnectActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abh_title_other_right_delegate$lambda$0(HealthConnectActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_other_right);
    }

    public static final /* synthetic */ AppCompatCheckBox access$getCheck_health_connect(HealthConnectActivity r0) {
        return r0.getCheck_health_connect();
    }

    public static final /* synthetic */ HealthConnectManager access$getHealthConnectManager$p(HealthConnectActivity r0) {
        return r0.healthConnectManager;
    }

    public static final /* synthetic */ Activity access$getMContext(HealthConnectActivity r0) {
        return r0.getMContext();
    }

    public static final /* synthetic */ ExerciseSessionViewModel access$getViewModel$p(HealthConnectActivity r0) {
        return r0.viewModel;
    }

    private static final AppCompatCheckBox check_health_connect_delegate$lambda$0(HealthConnectActivity r1) {
        return (AppCompatCheckBox) r1.findViewById(R.id.check_health_connect);
    }

    private final PFMedium getAbh_title_center() {
        return (PFMedium) getValue();
    }

    private final ImageView getAbh_title_other_right() {
        return (ImageView) getValue();
    }

    private final int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    private final AppCompatCheckBox getCheck_health_connect() {
        return (AppCompatCheckBox) getValue();
    }

    private final void onLaunch(int r7) {
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C34801(this, r7, null), 3, null);
    }

    private final void onPermission(int r3) {
        if (getApiLevel() >= 34) goto L11;
        if (ad6.XIi00iiXO(getMContext(), "com.google.android.apps.healthdata") == false) goto L8;
        onLaunch(r3);
        return;
    L8:
        Bundle r4 = new Bundle();
        r4.putString("mArg0", DOWNLOAD_URL);
        r4.putParcelable("mArg2", null);
        r4.putSerializable("mArg3", null);
        Intent r0 = new Intent(this, WebViewActivity.class);
        r0.putExtras(r4);
        startActivity(r0);
        return;
    L11:
        if (ad6.O00(this) == false) goto L14;
        onLaunch(r3);
        return;
    }

    private final void onTime() {
        TimerTask r1 = new HealthConnectActivity$onTime$task$1(this);
        this.mTimer.schedule(r1, 0, 1000);
    }

    private final void setCheckView() {
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C34821(this, null), 3, null);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        this.healthConnectManager = new HealthConnectManager(this);
        HealthConnectManager r0 = this.healthConnectManager;
        Intrinsics.XXI(r0);
        this.viewModel = (ExerciseSessionViewModel) new ViewModelProvider(this, new ExerciseSessionViewModelFactory(r0)).get(ExerciseSessionViewModel.class);
        HealthConnectManager r1 = this.healthConnectManager;
        Intrinsics.XXI(r1);
        this.viewModelSleep = (SleepSessionViewModel) new ViewModelProvider(this, new SleepSessionViewModelFactory(r1)).get(SleepSessionViewModel.class);
        HealthConnectManager r3 = this.healthConnectManager;
        Intrinsics.XXI(r3);
        this.viewModelInput = (InputReadingsViewModel) new ViewModelProvider(this, new InputReadingsViewModelFactory(r3)).get(InputReadingsViewModel.class);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAbh_title_center().setText(R.string.health_connect);
        getAbh_title_other_right().setImageResource(R.drawable.icon_run_setting);
        setCheckView();
        onTime();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_health_connect;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onActivityResult(int r5, int r6, @tb1 Intent r7) {
        super.onActivityResult(r5, r6, r7);
        if (r5 != 0) goto L23;
        if (r6 != 0) goto L24;
        ExerciseSessionViewModel r8 = this.viewModel;
        if (r8 == null) goto L25;
        if (r7 == null) goto L9;
        ArrayList<String> r9 = r7.getStringArrayListExtra("result");
    L10:
        if (r9 != null) goto L12;
        return;
    L12:
        if (r9.isEmpty() == true) goto L27;
        AppCompatCheckBox r10 = getCheck_health_connect();
        boolean r1 = false;
        if (r9.size() != r8.getPermissions(0).size()) goto L17;
        boolean r0 = true;
    L18:
        r10.setChecked(r0);
        if (r9.size() != r8.getPermissions(0).size()) goto L21;
        r1 = true;
    L21:
        LogUtils.i(new Object[]{"HealthConnectActivity onResult" + r1});
        return;
    L17:
        r0 = false;
        goto L18
    L27:
        return;
    L9:
        r9 = null;
        goto L10
    L25:
        return;
    L24:
        return;
    }

    public final void onCheckHealthConnect(@aa1 View r8) {
        Intrinsics.X0O(r8, "view");
        if (getCheck_health_connect().isChecked() == false) goto L6;
        LogUtils.i(new Object[]{"HealthConnectActivity onPermission"});
        getCheck_health_connect().setChecked(false);
        onPermission(0);
        return;
    L6:
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(this, null), 3, null);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mTimer.cancel();
    }

    public final void onExerciseSessions(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        onPermission(0);
    }

    public final void onInputChanges(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        LogUtils.i(new Object[]{"HealthConnectActivity onInputChanges"});
        onPermission(3);
    }

    public final void onInputReadings(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        LogUtils.i(new Object[]{"HealthConnectActivity onInputReadings"});
        onPermission(2);
    }

    public final void onSleepSessions(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        onPermission(1);
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightOtherClick(@aa1 View r8) {
        Intrinsics.X0O(r8, "view");
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C34811(this, null), 3, null);
    }
}
