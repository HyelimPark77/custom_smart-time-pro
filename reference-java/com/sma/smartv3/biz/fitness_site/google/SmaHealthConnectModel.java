package com.sma.smartv3.biz.fitness_site.google;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.I111IiiI1;
import com.android.mltcode.paycertificationapi.I1O1000iI;
import com.android.mltcode.paycertificationapi.X10i1OOOX;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ad6;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1iXIO;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ud5;
import com.android.mltcode.paycertificationapi.xm4;
import com.blankj.utilcode.util.LogUtils;
import com.example.health.data.HealthConnectManager;
import com.example.health.presentation.screen.exercisesession.ExerciseSessionViewModel;
import com.example.health.presentation.screen.inputreadings.InputReadingsViewModel;
import com.example.health.presentation.screen.sleepsession.SleepSessionViewModel;
import com.example.health.presentation.screen.vitalsigns.VitalSignsViewModel;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p608db.entity.BloodOxygen;
import com.sma.smartv3.p608db.entity.BloodPressure;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.p608db.entity.Sleep;
import com.sma.smartv3.p608db.entity.Weight;
import com.szabh.smable3.entity.BleSleep;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C20141iO;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,629:1\n1563#2:630\n1634#2,3:631\n1878#2,3:634\n1056#2:637\n1869#2,2:638\n774#2:640\n865#2,2:641\n1563#2:643\n1634#2,3:644\n1869#2,2:647\n1869#2,2:649\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n88#1:630\n88#1:631,3\n90#1:634,3\n203#1:637\n213#1:638,2\n418#1:640\n418#1:641,2\n431#1:643\n431#1:644,3\n443#1:647,2\n604#1:649,2\n*E\n"})
public final class SmaHealthConnectModel extends ViewModel {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    public static final int TIME_MIN_SIXTY = 60000;

    @aa1
    private final MutableLiveData<Integer> healthConnectLiveData = new MutableLiveData<>();
    private boolean isCleared;

    @tb1
    @SuppressLint({"StaticFieldLeak"})
    private Context mContext;

    public static final class HealthConnectModelFactory implements ViewModelProvider.Factory {

        @tb1
        private final Context context;

        public HealthConnectModelFactory(@tb1 Context context) {
            this.context = context;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @aa1
        public /* bridge */ <T extends ViewModel> T create(@aa1 Class<T> cls, @aa1 CreationExtras creationExtras) {
            return (T) super.create(cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @aa1
        public /* bridge */ <T extends ViewModel> T create(@aa1 KClass<T> kClass, @aa1 CreationExtras creationExtras) {
            return (T) super.create(kClass, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @aa1
        public <T extends ViewModel> T create(@aa1 Class<T> modelClass) {
            Intrinsics.X0O(modelClass, "modelClass");
            if (modelClass.isAssignableFrom(SmaHealthConnectModel.class)) {
                return new SmaHealthConnectModel(this.context);
            }
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
    }

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,328:1\n203#2:329\n*E\n"})
    public static final class XIi00iiXO<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.I0iXXO(Long.valueOf(((Activity) t).getMTime()), Long.valueOf(((Activity) t2).getMTime()));
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectHeartRate$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectHeartRate$1", m39466f = "SmaHealthConnectModel.kt", m39467i = {}, m39468l = {312}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,629:1\n488#2,19:630\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1\n*L\n313#1:630,19\n*E\n"})
    public static final class C154661 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<T> $dataList;
        final /* synthetic */ HealthConnectManager $healthConnectManager;
        final /* synthetic */ VitalSignsViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C154661(HealthConnectManager healthConnectManager, VitalSignsViewModel vitalSignsViewModel, List<? extends T> list, Continuation<? super C154661> continuation) {
            super(2, continuation);
            this.$healthConnectManager = healthConnectManager;
            this.$viewModel = vitalSignsViewModel;
            this.$dataList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SmaHealthConnectModel.this.new C154661(this.$healthConnectManager, this.$viewModel, this.$dataList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C154661) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                Context mContext = SmaHealthConnectModel.this.getMContext();
                Intrinsics.XXI(mContext);
                if (ad6.XIi00iiXO(mContext, "com.google.android.apps.healthdata") && ad6.m1464iO()) {
                    HealthConnectManager healthConnectManager = this.$healthConnectManager;
                    Set<String> permissionsHeartRate = this.$viewModel.getPermissionsHeartRate();
                    this.label = 1;
                    obj = healthConnectManager.iIiiO(permissionsHeartRate, this);
                    if (obj == objI0iXXO) {
                        return objI0iXXO;
                    }
                } else {
                    i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectHeartRate  no install");
                }
                return Unit.OXO1;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            if (((Boolean) obj).booleanValue()) {
                List<T> list = this.$dataList;
                VitalSignsViewModel vitalSignsViewModel = this.$viewModel;
                if (!list.isEmpty() && HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
                        HeartRate heartRate = (HeartRate) obj2;
                        arrayList.add(new I111IiiI1(heartRate.getMBpm(), heartRate.getMTime()));
                    }
                    vitalSignsViewModel.inputHeartRateReadings(arrayList);
                    i1O0OXO1O.OXO1.OXO1("DataWorker inputHeartRateReadings  list.size=" + arrayList.size());
                }
            } else {
                i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectHeartRate  no permission");
            }
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectOxygen$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectOxygen$1", m39466f = "SmaHealthConnectModel.kt", m39467i = {}, m39468l = {336}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectOxygen$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,629:1\n513#2,19:630\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectOxygen$1\n*L\n337#1:630,19\n*E\n"})
    public static final class C289171 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<T> $dataList;
        final /* synthetic */ HealthConnectManager $healthConnectManager;
        final /* synthetic */ VitalSignsViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C289171(HealthConnectManager healthConnectManager, VitalSignsViewModel vitalSignsViewModel, List<? extends T> list, Continuation<? super C289171> continuation) {
            super(2, continuation);
            this.$healthConnectManager = healthConnectManager;
            this.$viewModel = vitalSignsViewModel;
            this.$dataList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SmaHealthConnectModel.this.new C289171(this.$healthConnectManager, this.$viewModel, this.$dataList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289171) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                Context mContext = SmaHealthConnectModel.this.getMContext();
                Intrinsics.XXI(mContext);
                if (ad6.XIi00iiXO(mContext, "com.google.android.apps.healthdata") && ad6.m1464iO()) {
                    HealthConnectManager healthConnectManager = this.$healthConnectManager;
                    Set<String> permissionsOxygen = this.$viewModel.getPermissionsOxygen();
                    this.label = 1;
                    obj = healthConnectManager.iIiiO(permissionsOxygen, this);
                    if (obj == objI0iXXO) {
                        return objI0iXXO;
                    }
                } else {
                    i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectOxygen  no install");
                }
                return Unit.OXO1;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            if (((Boolean) obj).booleanValue()) {
                List<T> list = this.$dataList;
                VitalSignsViewModel vitalSignsViewModel = this.$viewModel;
                if (!list.isEmpty() && BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
                        BloodOxygen bloodOxygen = (BloodOxygen) obj2;
                        arrayList.add(new I1O1000iI(bloodOxygen.getMValue(), bloodOxygen.getMTime()));
                    }
                    vitalSignsViewModel.inputBloodOxyReadings(arrayList);
                    i1O0OXO1O.OXO1.OXO1("DataWorker inputBloodOxyReadings  list.size=" + arrayList.size());
                }
            } else {
                i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectOxygen  no permission");
            }
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectPressure$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectPressure$1", m39466f = "SmaHealthConnectModel.kt", m39467i = {}, m39468l = {360}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectPressure$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,629:1\n538#2,21:630\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectPressure$1\n*L\n361#1:630,21\n*E\n"})
    public static final class C289181 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<T> $dataList;
        final /* synthetic */ HealthConnectManager $healthConnectManager;
        final /* synthetic */ VitalSignsViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C289181(HealthConnectManager healthConnectManager, VitalSignsViewModel vitalSignsViewModel, List<? extends T> list, Continuation<? super C289181> continuation) {
            super(2, continuation);
            this.$healthConnectManager = healthConnectManager;
            this.$viewModel = vitalSignsViewModel;
            this.$dataList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SmaHealthConnectModel.this.new C289181(this.$healthConnectManager, this.$viewModel, this.$dataList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289181) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                Context mContext = SmaHealthConnectModel.this.getMContext();
                Intrinsics.XXI(mContext);
                if (ad6.XIi00iiXO(mContext, "com.google.android.apps.healthdata") && ad6.m1464iO()) {
                    HealthConnectManager healthConnectManager = this.$healthConnectManager;
                    Set<String> permissionsPressure = this.$viewModel.getPermissionsPressure();
                    this.label = 1;
                    obj = healthConnectManager.iIiiO(permissionsPressure, this);
                    if (obj == objI0iXXO) {
                        return objI0iXXO;
                    }
                } else {
                    i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectPressure  no install");
                }
                return Unit.OXO1;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            if (((Boolean) obj).booleanValue()) {
                List<T> list = this.$dataList;
                VitalSignsViewModel vitalSignsViewModel = this.$viewModel;
                if (!list.isEmpty() && BloodPressure.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
                        BloodPressure bloodPressure = (BloodPressure) obj2;
                        arrayList.add(new X10i1OOOX(bloodPressure.getMSystolic(), bloodPressure.getMDiastolic(), bloodPressure.getMTime()));
                    }
                    vitalSignsViewModel.inputBloodPressureReadings(arrayList);
                    i1O0OXO1O.OXO1.OXO1("DataWorker inputBloodPressureReadings  list.size=" + arrayList.size());
                }
            } else {
                i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectPressure  no permission");
            }
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectSleep$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectSleep$1", m39466f = "SmaHealthConnectModel.kt", m39467i = {}, m39468l = {282}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectSleep$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,629:1\n427#2,5:630\n432#2,8:638\n442#2,2:647\n444#2,31:650\n478#2:682\n1563#3:635\n1634#3,2:636\n1636#3:646\n1869#3:649\n1870#3:681\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectSleep$1\n*L\n284#1:630,5\n284#1:638,8\n284#1:647,2\n284#1:650,31\n284#1:682\n284#1:635\n284#1:636,2\n284#1:646\n284#1:649\n284#1:681\n*E\n"})
    public static final class C289191 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<T> $dataList;
        final /* synthetic */ HealthConnectManager $healthConnectManager;
        final /* synthetic */ SleepSessionViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C289191(HealthConnectManager healthConnectManager, SleepSessionViewModel sleepSessionViewModel, List<? extends T> list, Continuation<? super C289191> continuation) {
            super(2, continuation);
            this.$healthConnectManager = healthConnectManager;
            this.$viewModel = sleepSessionViewModel;
            this.$dataList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SmaHealthConnectModel.this.new C289191(this.$healthConnectManager, this.$viewModel, this.$dataList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289191) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objIIiiO;
            long j;
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                Context mContext = SmaHealthConnectModel.this.getMContext();
                Intrinsics.XXI(mContext);
                if (ad6.XIi00iiXO(mContext, "com.google.android.apps.healthdata") && ad6.m1464iO()) {
                    HealthConnectManager healthConnectManager = this.$healthConnectManager;
                    Set<String> permissions = this.$viewModel.getPermissions();
                    this.label = 1;
                    objIIiiO = healthConnectManager.iIiiO(permissions, this);
                    if (objIIiiO == objI0iXXO) {
                        return objI0iXXO;
                    }
                } else {
                    i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectSleep  no install");
                }
                return Unit.OXO1;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            objIIiiO = obj;
            if (((Boolean) objIIiiO).booleanValue()) {
                i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectSleep  go upload");
                SmaHealthConnectModel smaHealthConnectModel = SmaHealthConnectModel.this;
                List<T> list = this.$dataList;
                SleepSessionViewModel sleepSessionViewModel = this.$viewModel;
                if (!list.isEmpty() && Sleep.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    List<T> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                    int mAlgorithmType = 0;
                    for (Object obj2 : list2) {
                        Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                        Sleep sleep = (Sleep) obj2;
                        mAlgorithmType = sleep.getMAlgorithmType();
                        arrayList.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
                    }
                    Iterator<T> it = smaHealthConnectModel.splitByMode17(arrayList).iterator();
                    while (it.hasNext()) {
                        List<BleSleep> listAnalyseSleep = BleSleep.Companion.analyseSleep((List) it.next(), mAlgorithmType);
                        if (listAnalyseSleep.isEmpty() || listAnalyseSleep.size() < 2) {
                            break;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int size = listAnalyseSleep.size() - 2;
                        long j2 = 1000;
                        if (size >= 0) {
                            int i2 = 0;
                            while (true) {
                                Instant instantOfEpochMilli = Instant.ofEpochMilli(((long) listAnalyseSleep.get(i2).getMTime()) * j2);
                                int i3 = i2 + 1;
                                Instant instantOfEpochMilli2 = Instant.ofEpochMilli(((long) listAnalyseSleep.get(i3).getMTime()) * j2);
                                int stageList = smaHealthConnectModel.getStageList(listAnalyseSleep, i2);
                                Intrinsics.XXI(instantOfEpochMilli);
                                Intrinsics.XXI(instantOfEpochMilli2);
                                j = j2;
                                arrayList2.add(new xm4.OXO1(instantOfEpochMilli, instantOfEpochMilli2, stageList));
                                if (i2 == size) {
                                    break;
                                }
                                i2 = i3;
                                j2 = j;
                            }
                        } else {
                            j = 1000;
                        }
                        i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectSleep input sleepHealth.size=" + arrayList2.size());
                        if (sleepSessionViewModel != null) {
                            sleepSessionViewModel.generateSleepData(((long) ((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(listAnalyseSleep)).getMTime()) * j, ((long) ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(listAnalyseSleep)).getMTime()) * j, arrayList2);
                        }
                    }
                }
            } else {
                i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectSleep  no permission");
            }
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectWight$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectWight$1", m39466f = "SmaHealthConnectModel.kt", m39467i = {}, m39468l = {254}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,629:1\n380#2,14:630\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1\n*L\n255#1:630,14\n*E\n"})
    public static final class C289201 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<T> $dataList;
        final /* synthetic */ HealthConnectManager $healthConnectManager;
        final /* synthetic */ InputReadingsViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C289201(HealthConnectManager healthConnectManager, InputReadingsViewModel inputReadingsViewModel, List<? extends T> list, Continuation<? super C289201> continuation) {
            super(2, continuation);
            this.$healthConnectManager = healthConnectManager;
            this.$viewModel = inputReadingsViewModel;
            this.$dataList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SmaHealthConnectModel.this.new C289201(this.$healthConnectManager, this.$viewModel, this.$dataList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289201) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                Context mContext = SmaHealthConnectModel.this.getMContext();
                Intrinsics.XXI(mContext);
                if (ad6.XIi00iiXO(mContext, "com.google.android.apps.healthdata") && ad6.m1464iO()) {
                    HealthConnectManager healthConnectManager = this.$healthConnectManager;
                    Set<String> permissions = this.$viewModel.getPermissions();
                    this.label = 1;
                    obj = healthConnectManager.iIiiO(permissions, this);
                    if (obj == objI0iXXO) {
                        return objI0iXXO;
                    }
                }
                return Unit.OXO1;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            if (((Boolean) obj).booleanValue()) {
                List<T> list = this.$dataList;
                InputReadingsViewModel inputReadingsViewModel = this.$viewModel;
                if (!list.isEmpty() && Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    for (Object obj2 : list) {
                        Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                        Weight weight = (Weight) obj2;
                        LogUtils.m11130i("postHealthConnectData", "weight" + weight.getMWeight() + ud5.I0iXXO);
                        inputReadingsViewModel.inputReadings((double) weight.getMWeight());
                    }
                }
            }
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectWorkout$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectWorkout$1", m39466f = "SmaHealthConnectModel.kt", m39467i = {}, m39468l = {70}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWorkout$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,629:1\n84#2,5:630\n89#2:638\n90#2:640\n91#2,33:643\n155#2:677\n1563#3:635\n1634#3,2:636\n1636#3:639\n1878#3,2:641\n1880#3:676\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWorkout$1\n*L\n71#1:630,5\n71#1:638\n71#1:640\n71#1:643,33\n71#1:677\n71#1:635\n71#1:636,2\n71#1:639\n71#1:641,2\n71#1:676\n*E\n"})
    public static final class C289211 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<T> $dataList;
        final /* synthetic */ HealthConnectManager $healthConnectManager;
        final /* synthetic */ ExerciseSessionViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C289211(HealthConnectManager healthConnectManager, ExerciseSessionViewModel exerciseSessionViewModel, List<? extends T> list, Continuation<? super C289211> continuation) {
            super(2, continuation);
            this.$healthConnectManager = healthConnectManager;
            this.$viewModel = exerciseSessionViewModel;
            this.$dataList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SmaHealthConnectModel.this.new C289211(this.$healthConnectManager, this.$viewModel, this.$dataList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289211) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objIIiiO;
            Iterator it;
            ExerciseSessionViewModel exerciseSessionViewModel;
            SmaHealthConnectModel smaHealthConnectModel;
            int i;
            Object objI0iXXO = C2798pb.I0iXXO();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.X1ii(obj);
                Context mContext = SmaHealthConnectModel.this.getMContext();
                Intrinsics.XXI(mContext);
                if (ad6.XIi00iiXO(mContext, "com.google.android.apps.healthdata") && ad6.m1464iO()) {
                    HealthConnectManager healthConnectManager = this.$healthConnectManager;
                    Set<String> permissions = this.$viewModel.getPermissions();
                    this.label = 1;
                    objIIiiO = healthConnectManager.iIiiO(permissions, this);
                    if (objIIiiO == objI0iXXO) {
                        return objI0iXXO;
                    }
                }
                return Unit.OXO1;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            objIIiiO = obj;
            if (((Boolean) objIIiiO).booleanValue()) {
                SmaHealthConnectModel smaHealthConnectModel2 = SmaHealthConnectModel.this;
                List<T> list = this.$dataList;
                ExerciseSessionViewModel exerciseSessionViewModel2 = this.$viewModel;
                if (!list.isEmpty() && Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    List<T> list2 = list;
                    int i3 = 10;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                    for (Object obj2 : list2) {
                        Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        arrayList.add((Activity) obj2);
                    }
                    Iterator it2 = smaHealthConnectModel2.groupByTimeIntervalLoop(arrayList).iterator();
                    int i4 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt__CollectionsKt.XOX0O0();
                        }
                        List<Activity> list3 = (List) next;
                        if (list3.isEmpty()) {
                            smaHealthConnectModel = smaHealthConnectModel2;
                            it = it2;
                            exerciseSessionViewModel = exerciseSessionViewModel2;
                            i = i3;
                        } else {
                            Pair<Activity, Activity> timePeriod = smaHealthConnectModel2.getTimePeriod(list3);
                            Activity first = timePeriod.getFirst();
                            Activity second = timePeriod.getSecond();
                            long jOiIIX101O = C20141iO.OiIIX101O((long) Math.floor((second.getMTime() - first.getMTime()) / 60000.0f), 1L);
                            long mStep = second.getMStep() - first.getMStep();
                            double mDistance = ((double) (second.getMDistance() - first.getMDistance())) / ((double) 10000);
                            it = it2;
                            exerciseSessionViewModel = exerciseSessionViewModel2;
                            double mCalorie = ((double) (second.getMCalorie() - first.getMCalorie())) / ((double) i3);
                            ArrayList<Integer> hrvListTime = smaHealthConnectModel2.getHrvListTime(first.getMTime(), second.getMTime());
                            smaHealthConnectModel = smaHealthConnectModel2;
                            i1O0OXO1O.OXO1.OXO1("HealthConnectModel : Activity__ValueID = " + first.getMId() + HelpFormatter.DEFAULT_OPT_PREFIX + second.getMId() + " , time=" + jOiIIX101O + " step=" + mStep + " distance=" + mDistance + "  calories=" + mCalorie + " size=" + list3.size() + ud5.I0iXXO);
                            if (mStep <= 0 || mDistance <= 0.0d || mCalorie <= 0.0d || exerciseSessionViewModel == null) {
                                i = 10;
                            } else {
                                i = 10;
                                exerciseSessionViewModel.insertExerciseSession(jOiIIX101O, 12, mStep, mDistance, mCalorie, hrvListTime, first.getMTime(), second.getMTime());
                                exerciseSessionViewModel = exerciseSessionViewModel;
                            }
                        }
                        it2 = it;
                        i3 = i;
                        exerciseSessionViewModel2 = exerciseSessionViewModel;
                        i4 = i5;
                        smaHealthConnectModel2 = smaHealthConnectModel;
                    }
                }
            }
            return Unit.OXO1;
        }
    }

    public SmaHealthConnectModel(@tb1 Context context) {
        this.mContext = context;
    }

    private static final long groupByTimeIntervalLoop$truncateToMinute(long j) {
        return j / 60000;
    }

    private final boolean isSameDay(long j, long j2) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        return Intrinsics.XOO0ii0(Instant.ofEpochMilli(j).atZone(zoneIdSystemDefault).toLocalDate(), Instant.ofEpochMilli(j2).atZone(zoneIdSystemDefault).toLocalDate());
    }

    @aa1
    public final Pair<Integer, Integer> getCalender(long j) {
        Date date = new Date(j);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return new Pair<>(Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(11)));
    }

    @aa1
    public final MutableLiveData<Integer> getHealthConnectLiveData() {
        return this.healthConnectLiveData;
    }

    @aa1
    public final ArrayList<Integer> getHrvListTime(long j, long j2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        List<HeartRate> heartRates = MyDb.INSTANCE.getMDatabase().heartRateDao().getHeartRates(j, j2);
        LogUtils.m11130i("getHrvListTime list" + heartRates);
        Iterator<T> it = heartRates.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((HeartRate) it.next()).getMBpm()));
        }
        return arrayList;
    }

    @tb1
    public final Context getMContext() {
        return this.mContext;
    }

    public final int getStageList(@aa1 List<BleSleep> analyseSleep, int i) {
        Intrinsics.X0O(analyseSleep, "analyseSleep");
        int mMode = analyseSleep.get(i).getMMode();
        if (mMode == 1) {
            return xm4.OXO1.m3310iO();
        }
        if (mMode == 2) {
            return xm4.OXO1.XO0O10();
        }
        if (mMode != 3) {
            return mMode != 9 ? xm4.OXO1.OXO1() : xm4.OXO1.O00();
        }
        return xm4.OXO1.XIi00iiXO();
    }

    @aa1
    public final Pair<Activity, Activity> getTimePeriod(@aa1 List<Activity> list) {
        Intrinsics.X0O(list, "list");
        Object objIIII0iI = CollectionsKt___CollectionsKt.IIII0iI(list);
        Activity activity = (Activity) CollectionsKt___CollectionsKt.Xi1XO00(list);
        Activity activity2 = (Activity) objIIII0iI;
        Activity previousItemByID = MyDb.INSTANCE.getMDatabase().activityDao().getPreviousItemByID(activity2.getMId());
        if (previousItemByID != null && previousItemByID.getMStep() != activity2.getMStep() && isSameDay(previousItemByID.getMTime(), activity2.getMTime())) {
            objIIII0iI = previousItemByID;
        }
        return new Pair<>(objIIII0iI, activity);
    }

    @aa1
    public final List<List<Activity>> groupByTimeIntervalLoop(@aa1 List<Activity> list) {
        Intrinsics.X0O(list, "list");
        if (list.isEmpty()) {
            return CollectionsKt__CollectionsKt.m39402iI();
        }
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("HealthConnectModel : groupByTimeIntervalLoop__" + ((Activity) CollectionsKt___CollectionsKt.IIII0iI(list)).getMId() + i1iXIO.XO0O10 + ((Activity) CollectionsKt___CollectionsKt.Xi1XO00(list)).getMId());
        List<Activity> listII0O1 = CollectionsKt___CollectionsKt.II0O1(list, new XIi00iiXO());
        ArrayList arrayList = new ArrayList();
        i1o0oxo1o.OXO1("HealthConnectModel : groupByTimeIntervalLoop sorted__" + ((Activity) CollectionsKt___CollectionsKt.IIII0iI(listII0O1)).getMId() + i1iXIO.XO0O10 + ((Activity) CollectionsKt___CollectionsKt.Xi1XO00(listII0O1)).getMId());
        for (Activity activity : listII0O1) {
            List list2 = (List) CollectionsKt___CollectionsKt.Oi0(arrayList);
            if (list2 == null) {
                arrayList.add(CollectionsKt__CollectionsKt.Ii1iii0(activity));
            } else {
                Activity activity2 = (Activity) CollectionsKt___CollectionsKt.Xi1XO00(list2);
                if (groupByTimeIntervalLoop$truncateToMinute(activity.getMTime()) - groupByTimeIntervalLoop$truncateToMinute(activity2.getMTime()) > 1 || !isSameDay(activity.getMTime(), activity2.getMTime())) {
                    arrayList.add(CollectionsKt__CollectionsKt.Ii1iii0(activity));
                } else {
                    list2.add(activity);
                }
            }
        }
        return arrayList;
    }

    public final boolean isCleared() {
        return this.isCleared;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.isCleared = true;
        super.onCleared();
    }

    public final void setCleared(boolean z) {
        this.isCleared = z;
    }

    public final void setMContext(@tb1 Context context) {
        this.mContext = context;
    }

    @aa1
    public final List<List<BleSleep>> splitByMode17(@aa1 List<BleSleep> list) {
        BleSleep next;
        List list2;
        Intrinsics.X0O(list, "<this>");
        if (list.isEmpty()) {
            return CollectionsKt__CollectionsKt.m39402iI();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<BleSleep> it = list.iterator();
        loop0: while (true) {
            boolean z = false;
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                next = it.next();
                if (next.getMMode() == 17) {
                    arrayList.add(new ArrayList());
                    z = true;
                }
                if (z && (list2 = (List) CollectionsKt___CollectionsKt.Oi0(arrayList)) != null) {
                    list2.add(next);
                }
            } while (next.getMMode() != 34);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((List) obj).isEmpty()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @RequiresApi(34)
    public final /* synthetic */ <T> void uploadHealthConnectBloodPressure(List<? extends T> dataList, VitalSignsViewModel viewModel) {
        Intrinsics.X0O(dataList, "dataList");
        Intrinsics.X0O(viewModel, "viewModel");
        if (dataList.isEmpty() || !BloodPressure.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataList))) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : dataList) {
            Intrinsics.X1ii(t, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
            BloodPressure bloodPressure = (BloodPressure) t;
            arrayList.add(new X10i1OOOX(bloodPressure.getMSystolic(), bloodPressure.getMDiastolic(), bloodPressure.getMTime()));
        }
        viewModel.inputBloodPressureReadings(arrayList);
        i1O0OXO1O.OXO1.OXO1("DataWorker inputBloodPressureReadings  list.size=" + arrayList.size());
    }

    @RequiresApi(34)
    public final /* synthetic */ <T> void uploadHealthConnectHeartRate(List<? extends T> dataList, VitalSignsViewModel viewModel, HealthConnectManager healthConnectManager) {
        Intrinsics.X0O(dataList, "dataList");
        Intrinsics.X0O(viewModel, "viewModel");
        Intrinsics.X0O(healthConnectManager, "healthConnectManager");
        try {
            XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), null, null, new C154661(healthConnectManager, viewModel, dataList, null), 3, null);
        } catch (Exception e) {
            e.printStackTrace();
            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectHeartRate e = " + e);
        }
    }

    @RequiresApi(34)
    public final /* synthetic */ <T> void uploadHealthConnectOxygen(List<? extends T> dataList, VitalSignsViewModel viewModel, HealthConnectManager healthConnectManager) {
        Intrinsics.X0O(dataList, "dataList");
        Intrinsics.X0O(viewModel, "viewModel");
        Intrinsics.X0O(healthConnectManager, "healthConnectManager");
        try {
            XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), null, null, new C289171(healthConnectManager, viewModel, dataList, null), 3, null);
        } catch (Exception e) {
            e.printStackTrace();
            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectHeartRate e = " + e);
        }
    }

    @RequiresApi(34)
    public final /* synthetic */ <T> void uploadHealthConnectPressure(List<? extends T> dataList, VitalSignsViewModel viewModel, HealthConnectManager healthConnectManager) {
        Intrinsics.X0O(dataList, "dataList");
        Intrinsics.X0O(viewModel, "viewModel");
        Intrinsics.X0O(healthConnectManager, "healthConnectManager");
        try {
            XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), null, null, new C289181(healthConnectManager, viewModel, dataList, null), 3, null);
        } catch (Exception e) {
            e.printStackTrace();
            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectPressure e = " + e);
        }
    }

    public final /* synthetic */ <T> void uploadHealthConnectSleep(List<? extends T> dataList, SleepSessionViewModel viewModel, HealthConnectManager healthConnectManager) {
        Intrinsics.X0O(dataList, "dataList");
        Intrinsics.X0O(viewModel, "viewModel");
        Intrinsics.X0O(healthConnectManager, "healthConnectManager");
        try {
            XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), null, null, new C289191(healthConnectManager, viewModel, dataList, null), 3, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final /* synthetic */ <T> void uploadHealthConnectWight(List<? extends T> dataList, InputReadingsViewModel viewModel, HealthConnectManager healthConnectManager) {
        Intrinsics.X0O(dataList, "dataList");
        Intrinsics.X0O(viewModel, "viewModel");
        Intrinsics.X0O(healthConnectManager, "healthConnectManager");
        try {
            XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), null, null, new C289201(healthConnectManager, viewModel, dataList, null), 3, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final /* synthetic */ <T> void uploadHealthConnectWorkout(List<? extends T> dataList, ExerciseSessionViewModel viewModel, HealthConnectManager healthConnectManager) {
        Intrinsics.X0O(dataList, "dataList");
        Intrinsics.X0O(viewModel, "viewModel");
        Intrinsics.X0O(healthConnectManager, "healthConnectManager");
        try {
            XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), null, null, new C289211(healthConnectManager, viewModel, dataList, null), 3, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequiresApi(26)
    public final /* synthetic */ <T> void uploadHealthConnectSleep(List<? extends T> dataListAsc, SleepSessionViewModel sleepSessionViewModel) {
        SleepSessionViewModel sleepSessionViewModel2;
        Intrinsics.X0O(dataListAsc, "dataListAsc");
        if (dataListAsc.isEmpty() || !Sleep.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataListAsc))) {
            return;
        }
        List<? extends T> list = dataListAsc;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
        int i = 0;
        for (T t : list) {
            Intrinsics.X1ii(t, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
            Sleep sleep = (Sleep) t;
            int mAlgorithmType = sleep.getMAlgorithmType();
            arrayList.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
            i = mAlgorithmType;
        }
        Iterator<T> it = splitByMode17(arrayList).iterator();
        while (it.hasNext()) {
            List<BleSleep> listAnalyseSleep = BleSleep.Companion.analyseSleep((List) it.next(), i);
            if (listAnalyseSleep.isEmpty() || listAnalyseSleep.size() < 2) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            int size = listAnalyseSleep.size() - 2;
            if (size >= 0) {
                int i2 = 0;
                while (true) {
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(((long) listAnalyseSleep.get(i2).getMTime()) * 1000);
                    int i3 = i2 + 1;
                    Instant instantOfEpochMilli2 = Instant.ofEpochMilli(((long) listAnalyseSleep.get(i3).getMTime()) * 1000);
                    int stageList = getStageList(listAnalyseSleep, i2);
                    Intrinsics.XXI(instantOfEpochMilli);
                    Intrinsics.XXI(instantOfEpochMilli2);
                    arrayList2.add(new xm4.OXO1(instantOfEpochMilli, instantOfEpochMilli2, stageList));
                    if (i2 == size) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectSleep input sleepHealth.size=" + arrayList2.size());
            if (sleepSessionViewModel != null) {
                sleepSessionViewModel2 = sleepSessionViewModel;
                sleepSessionViewModel2.generateSleepData(((long) ((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(listAnalyseSleep)).getMTime()) * 1000, ((long) ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(listAnalyseSleep)).getMTime()) * 1000, arrayList2);
            } else {
                sleepSessionViewModel2 = sleepSessionViewModel;
            }
            sleepSessionViewModel = sleepSessionViewModel2;
        }
    }

    @RequiresApi(26)
    public final /* synthetic */ <T> void uploadHealthConnectWight(List<? extends T> dataList, InputReadingsViewModel viewModel) {
        Intrinsics.X0O(dataList, "dataList");
        Intrinsics.X0O(viewModel, "viewModel");
        if (dataList.isEmpty() || !Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataList))) {
            return;
        }
        for (T t : dataList) {
            Intrinsics.X1ii(t, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
            Weight weight = (Weight) t;
            LogUtils.m11130i("postHealthConnectData", "weight" + weight.getMWeight() + ud5.I0iXXO);
            viewModel.inputReadings((double) weight.getMWeight());
        }
    }

    public final /* synthetic */ <T> void uploadHealthConnectWorkout(List<? extends T> dataListAsc, ExerciseSessionViewModel exerciseSessionViewModel) {
        Iterator<T> it;
        int i;
        SmaHealthConnectModel smaHealthConnectModel = this;
        Intrinsics.X0O(dataListAsc, "dataListAsc");
        if (dataListAsc.isEmpty() || !Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataListAsc))) {
            return;
        }
        List<? extends T> list = dataListAsc;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
        for (T t : list) {
            Intrinsics.X1ii(t, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
            arrayList.add((Activity) t);
        }
        Iterator<T> it2 = smaHealthConnectModel.groupByTimeIntervalLoop(arrayList).iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            T next = it2.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            List<Activity> list2 = (List) next;
            if (list2.isEmpty()) {
                it = it2;
                i = i4;
            } else {
                Pair<Activity, Activity> timePeriod = smaHealthConnectModel.getTimePeriod(list2);
                Activity first = timePeriod.getFirst();
                Activity second = timePeriod.getSecond();
                long jOiIIX101O = C20141iO.OiIIX101O((long) Math.floor((second.getMTime() - first.getMTime()) / 60000.0f), 1L);
                long mStep = second.getMStep() - first.getMStep();
                double mDistance = ((double) (second.getMDistance() - first.getMDistance())) / ((double) 10000);
                it = it2;
                double mCalorie = ((double) (second.getMCalorie() - first.getMCalorie())) / ((double) i2);
                ArrayList<Integer> hrvListTime = smaHealthConnectModel.getHrvListTime(first.getMTime(), second.getMTime());
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                int mId = first.getMId();
                int mId2 = second.getMId();
                int size = list2.size();
                StringBuilder sb = new StringBuilder();
                i = i4;
                sb.append("HealthConnectModel : Activity__ValueID = ");
                sb.append(mId);
                sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
                sb.append(mId2);
                sb.append(" , time=");
                sb.append(jOiIIX101O);
                sb.append(" step=");
                sb.append(mStep);
                sb.append(" distance=");
                sb.append(mDistance);
                sb.append("  calories=");
                sb.append(mCalorie);
                sb.append(" size=");
                sb.append(size);
                sb.append(ud5.I0iXXO);
                i1o0oxo1o.OXO1(sb.toString());
                if (mStep > 0 && mDistance > 0.0d && mCalorie > 0.0d && exerciseSessionViewModel != null) {
                    exerciseSessionViewModel.insertExerciseSession(jOiIIX101O, 12, mStep, mDistance, mCalorie, hrvListTime, first.getMTime(), second.getMTime());
                }
            }
            i2 = 10;
            smaHealthConnectModel = this;
            it2 = it;
            i3 = i;
        }
    }

    @RequiresApi(34)
    public final /* synthetic */ <T> void uploadHealthConnectHeartRate(List<? extends T> dataList, VitalSignsViewModel viewModel) {
        Intrinsics.X0O(dataList, "dataList");
        Intrinsics.X0O(viewModel, "viewModel");
        if (dataList.isEmpty() || !HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataList))) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : dataList) {
            Intrinsics.X1ii(t, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
            HeartRate heartRate = (HeartRate) t;
            arrayList.add(new I111IiiI1(heartRate.getMBpm(), heartRate.getMTime()));
        }
        viewModel.inputHeartRateReadings(arrayList);
        i1O0OXO1O.OXO1.OXO1("DataWorker inputHeartRateReadings  list.size=" + arrayList.size());
    }

    @RequiresApi(34)
    public final /* synthetic */ <T> void uploadHealthConnectOxygen(List<? extends T> dataList, VitalSignsViewModel viewModel) {
        Intrinsics.X0O(dataList, "dataList");
        Intrinsics.X0O(viewModel, "viewModel");
        if (dataList.isEmpty() || !BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(dataList))) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : dataList) {
            Intrinsics.X1ii(t, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
            BloodOxygen bloodOxygen = (BloodOxygen) t;
            arrayList.add(new I1O1000iI(bloodOxygen.getMValue(), bloodOxygen.getMTime()));
        }
        viewModel.inputBloodOxyReadings(arrayList);
        i1O0OXO1O.OXO1.OXO1("DataWorker inputBloodOxyReadings  list.size=" + arrayList.size());
    }
}
