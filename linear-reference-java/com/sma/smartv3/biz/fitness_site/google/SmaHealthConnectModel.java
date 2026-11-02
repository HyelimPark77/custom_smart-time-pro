package com.sma.smartv3.biz.fitness_site.google;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.I111IiiI1;
import com.android.mltcode.paycertificationapi.I1O1000iI;
import com.android.mltcode.paycertificationapi.X10i1OOOX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ad6;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1iXIO;
import com.android.mltcode.paycertificationapi.pb;
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
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.db.entity.BloodOxygen;
import com.sma.smartv3.db.entity.BloodPressure;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.db.entity.Weight;
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
import kotlin.ranges.iO;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,629:1\n1563#2:630\n1634#2,3:631\n1878#2,3:634\n1056#2:637\n1869#2,2:638\n774#2:640\n865#2,2:641\n1563#2:643\n1634#2,3:644\n1869#2,2:647\n1869#2,2:649\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n88#1:630\n88#1:631,3\n90#1:634,3\n203#1:637\n213#1:638,2\n418#1:640\n418#1:641,2\n431#1:643\n431#1:644,3\n443#1:647,2\n604#1:649,2\n*E\n"})
public final class SmaHealthConnectModel extends ViewModel {

    @aa1
    public static final OXO1 Companion = null;
    public static final int TIME_MIN_SIXTY = 60000;

    @aa1
    private final MutableLiveData<Integer> healthConnectLiveData;
    private boolean isCleared;

    @tb1
    @SuppressLint({"StaticFieldLeak"})
    private Context mContext;

    public static final class HealthConnectModelFactory implements ViewModelProvider.Factory {

        @tb1
        private final Context context;

        public HealthConnectModelFactory(@tb1 Context r1) {
            this.context = r1;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @aa1
        public /* bridge */ <T extends ViewModel> T create(@aa1 Class<T> r1, @aa1 CreationExtras r2) {
            return (T) super.create(r1, r2);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @aa1
        public /* bridge */ <T extends ViewModel> T create(@aa1 KClass<T> r1, @aa1 CreationExtras r2) {
            return (T) super.create(r1, r2);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @aa1
        public <T extends ViewModel> T create(@aa1 Class<T> r2) {
            Intrinsics.X0O(r2, "modelClass");
            if (r2.isAssignableFrom(SmaHealthConnectModel.class) == false) goto L7;
            return new SmaHealthConnectModel(this.context);
        L7:
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
    }

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,328:1\n203#2:329\n*E\n"})
    public static final class XIi00iiXO<T> implements Comparator {
        public XIi00iiXO() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T r3, T r4) {
            return ComparisonsKt__ComparisonsKt.I0iXXO(Long.valueOf(((Activity) r3).getMTime()), Long.valueOf(((Activity) r4).getMTime()));
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectHeartRate$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectHeartRate$1", f = "SmaHealthConnectModel.kt", i = {}, l = {312}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,629:1\n488#2,19:630\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1\n*L\n313#1:630,19\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<T> $dataList;
        final /* synthetic */ HealthConnectManager $healthConnectManager;
        final /* synthetic */ VitalSignsViewModel $viewModel;
        int label;
        final /* synthetic */ SmaHealthConnectModel this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(SmaHealthConnectModel r1, HealthConnectManager r2, VitalSignsViewModel r3, List<? extends T> r4, Continuation<? super AnonymousClass1> r5) {
            this.this$0 = r1;
            this.$healthConnectManager = r2;
            this.$viewModel = r3;
            this.$dataList = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            return new AnonymousClass1(this.this$0, this.$healthConnectManager, this.$viewModel, this.$dataList, r8);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r8) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r8);
        L16:
            if (((Boolean) r8).booleanValue() == false) goto L26;
            List<T> r9 = this.$dataList;
            VitalSignsViewModel r2 = this.$viewModel;
            if (r9.isEmpty() == true) goto L29;
            if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r9)) == false) goto L29;
            ArrayList r3 = new ArrayList();
            Iterator r10 = r9.iterator();
        L23:
            if (r10.hasNext() == false) goto L25;
            Object r4 = r10.next();
            Intrinsics.X1ii(r4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
            HeartRate r5 = (HeartRate) r4;
            r3.add(new I111IiiI1(r5.getMBpm(), r5.getMTime()));
            goto L23
        L25:
            r2.inputHeartRateReadings(r3);
            i1O0OXO1O.OXO1.OXO1("DataWorker inputHeartRateReadings  list.size=" + r3.size());
        L29:
            return Unit.OXO1;
        L26:
            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectHeartRate  no permission");
            goto L29
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r8);
            Context r11 = this.this$0.getMContext();
            Intrinsics.XXI(r11);
            if (ad6.XIi00iiXO(r11, "com.google.android.apps.healthdata") == true) goto L11;
        L27:
            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectHeartRate  no install");
            goto L29
        L11:
            if (ad6.iO() == false) goto L27;
            HealthConnectManager r12 = this.$healthConnectManager;
            Set<String> r6 = getPermissionsHeartRate();
            this.label = 1;
            r8 = r12.iIiiO(r6, this);
            if (r8 != r0) goto L16;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectOxygen$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectOxygen$1", f = "SmaHealthConnectModel.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectOxygen$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,629:1\n513#2,19:630\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectOxygen$1\n*L\n337#1:630,19\n*E\n"})
    public static final class C33841 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<T> $dataList;
        final /* synthetic */ HealthConnectManager $healthConnectManager;
        final /* synthetic */ VitalSignsViewModel $viewModel;
        int label;
        final /* synthetic */ SmaHealthConnectModel this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public C33841(SmaHealthConnectModel r1, HealthConnectManager r2, VitalSignsViewModel r3, List<? extends T> r4, Continuation<? super C33841> r5) {
            this.this$0 = r1;
            this.$healthConnectManager = r2;
            this.$viewModel = r3;
            this.$dataList = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            return new C33841(this.this$0, this.$healthConnectManager, this.$viewModel, this.$dataList, r8);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C33841) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r8) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r8);
        L16:
            if (((Boolean) r8).booleanValue() == false) goto L26;
            List<T> r9 = this.$dataList;
            VitalSignsViewModel r2 = this.$viewModel;
            if (r9.isEmpty() == true) goto L29;
            if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r9)) == false) goto L29;
            ArrayList r3 = new ArrayList();
            Iterator r10 = r9.iterator();
        L23:
            if (r10.hasNext() == false) goto L25;
            Object r4 = r10.next();
            Intrinsics.X1ii(r4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
            BloodOxygen r5 = (BloodOxygen) r4;
            r3.add(new I1O1000iI(r5.getMValue(), r5.getMTime()));
            goto L23
        L25:
            r2.inputBloodOxyReadings(r3);
            i1O0OXO1O.OXO1.OXO1("DataWorker inputBloodOxyReadings  list.size=" + r3.size());
        L29:
            return Unit.OXO1;
        L26:
            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectOxygen  no permission");
            goto L29
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r8);
            Context r11 = this.this$0.getMContext();
            Intrinsics.XXI(r11);
            if (ad6.XIi00iiXO(r11, "com.google.android.apps.healthdata") == true) goto L11;
        L27:
            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectOxygen  no install");
            goto L29
        L11:
            if (ad6.iO() == false) goto L27;
            HealthConnectManager r12 = this.$healthConnectManager;
            Set<String> r6 = getPermissionsOxygen();
            this.label = 1;
            r8 = r12.iIiiO(r6, this);
            if (r8 != r0) goto L16;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectPressure$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectPressure$1", f = "SmaHealthConnectModel.kt", i = {}, l = {360}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectPressure$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,629:1\n538#2,21:630\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectPressure$1\n*L\n361#1:630,21\n*E\n"})
    public static final class C33851 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<T> $dataList;
        final /* synthetic */ HealthConnectManager $healthConnectManager;
        final /* synthetic */ VitalSignsViewModel $viewModel;
        int label;
        final /* synthetic */ SmaHealthConnectModel this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public C33851(SmaHealthConnectModel r1, HealthConnectManager r2, VitalSignsViewModel r3, List<? extends T> r4, Continuation<? super C33851> r5) {
            this.this$0 = r1;
            this.$healthConnectManager = r2;
            this.$viewModel = r3;
            this.$dataList = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            return new C33851(this.this$0, this.$healthConnectManager, this.$viewModel, this.$dataList, r8);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C33851) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r9) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r9);
        L16:
            if (((Boolean) r9).booleanValue() == false) goto L26;
            List<T> r10 = this.$dataList;
            VitalSignsViewModel r2 = this.$viewModel;
            if (r10.isEmpty() == true) goto L29;
            if (BloodPressure.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r10)) == false) goto L29;
            ArrayList r3 = new ArrayList();
            Iterator r11 = r10.iterator();
        L23:
            if (r11.hasNext() == false) goto L25;
            Object r4 = r11.next();
            Intrinsics.X1ii(r4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
            BloodPressure r5 = (BloodPressure) r4;
            r3.add(new X10i1OOOX(r5.getMSystolic(), r5.getMDiastolic(), r5.getMTime()));
            goto L23
        L25:
            r2.inputBloodPressureReadings(r3);
            i1O0OXO1O.OXO1.OXO1("DataWorker inputBloodPressureReadings  list.size=" + r3.size());
        L29:
            return Unit.OXO1;
        L26:
            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectPressure  no permission");
            goto L29
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r9);
            Context r12 = this.this$0.getMContext();
            Intrinsics.XXI(r12);
            if (ad6.XIi00iiXO(r12, "com.google.android.apps.healthdata") == true) goto L11;
        L27:
            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectPressure  no install");
            goto L29
        L11:
            if (ad6.iO() == false) goto L27;
            HealthConnectManager r13 = this.$healthConnectManager;
            Set<String> r6 = getPermissionsPressure();
            this.label = 1;
            r9 = r13.iIiiO(r6, this);
            if (r9 != r0) goto L16;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectSleep$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectSleep$1", f = "SmaHealthConnectModel.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectSleep$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,629:1\n427#2,5:630\n432#2,8:638\n442#2,2:647\n444#2,31:650\n478#2:682\n1563#3:635\n1634#3,2:636\n1636#3:646\n1869#3:649\n1870#3:681\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectSleep$1\n*L\n284#1:630,5\n284#1:638,8\n284#1:647,2\n284#1:650,31\n284#1:682\n284#1:635\n284#1:636,2\n284#1:646\n284#1:649\n284#1:681\n*E\n"})
    public static final class C33861 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<T> $dataList;
        final /* synthetic */ HealthConnectManager $healthConnectManager;
        final /* synthetic */ SleepSessionViewModel $viewModel;
        int label;
        final /* synthetic */ SmaHealthConnectModel this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public C33861(SmaHealthConnectModel r1, HealthConnectManager r2, SleepSessionViewModel r3, List<? extends T> r4, Continuation<? super C33861> r5) {
            this.this$0 = r1;
            this.$healthConnectManager = r2;
            this.$viewModel = r3;
            this.$dataList = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            return new C33861(this.this$0, this.$healthConnectManager, this.$viewModel, this.$dataList, r8);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C33861) create(r1, r2)).invokeSuspend(Unit.OXO1);
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
        public final Object invokeSuspend(Object r19) {
            Object r1 = pb.I0iXXO();
            int r2 = this.label;
            if (r2 == 0) goto L8;
            if (r2 != 1) goto L7;
            ResultKt.X1ii(r19);
            Object r3 = r19;
        L16:
            if (((Boolean) r3).booleanValue() == false) goto L43;
            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectSleep  go upload");
            SmaHealthConnectModel r4 = this.this$0;
            List<T> r5 = this.$dataList;
            SleepSessionViewModel r6 = this.$viewModel;
            if (r5.isEmpty() == true) goto L46;
            if (Sleep.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r5)) == false) goto L46;
            List<T> r7 = r5;
            ArrayList r8 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r7, 10));
            Iterator r9 = r7.iterator();
            int r10 = 0;
        L23:
            if (r9.hasNext() == false) goto L25;
            Object r11 = r9.next();
            Intrinsics.X1ii(r11, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
            Sleep r12 = (Sleep) r11;
            r10 = r12.getMAlgorithmType();
            r8.add(new BleSleep((int) (r12.getMTime() / ((long) 1000)), r12.getMMode(), r12.getMSoft(), r12.getMStrong()));
            goto L23
        L25:
            Iterator<T> r13 = r4.splitByMode17(r8).iterator();
        L27:
            if (r13.hasNext() == false) goto L46;
            List<BleSleep> r14 = BleSleep.Companion.analyseSleep((List) r13.next(), r10);
            if (r14.isEmpty() == true) goto L46;
            if (r14.size() < 2) goto L46;
            ArrayList r15 = new ArrayList();
            int r16 = r14.size() - 2;
            long r17 = 1000;
            if (r16 < 0) goto L39;
            int r18 = 0;
        L36:
            Instant r110 = Instant.ofEpochMilli(((long) r14.get(r18).getMTime()) * r17);
            int r111 = r18 + 1;
            Instant r112 = Instant.ofEpochMilli(((long) r14.get(r111).getMTime()) * r17);
            int r113 = r4.getStageList(r14, r18);
            Intrinsics.XXI(r110);
            Intrinsics.XXI(r112);
            long r114 = r17;
            r15.add(new xm4.OXO1(r110, r112, r113));
            if (r18 == r16) goto L40;
            r18 = r111;
            r17 = r114;
        L40:
            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectSleep input sleepHealth.size=" + r15.size());
            if (r6 == null) goto L27;
            r6.generateSleepData(((long) ((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(r14)).getMTime()) * r114, ((long) ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r14)).getMTime()) * r114, r15);
            goto L27
        L39:
            r114 = 1000;
        L46:
            return Unit.OXO1;
        L43:
            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectSleep  no permission");
            goto L46
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r19);
            Context r20 = this.this$0.getMContext();
            Intrinsics.XXI(r20);
            if (ad6.XIi00iiXO(r20, "com.google.android.apps.healthdata") == true) goto L11;
        L44:
            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectSleep  no install");
            goto L46
        L11:
            if (ad6.iO() == false) goto L44;
            HealthConnectManager r21 = this.$healthConnectManager;
            Set<String> r22 = getPermissions();
            this.label = 1;
            r3 = r21.iIiiO(r22, this);
            if (r3 != r1) goto L16;
            return r1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectWight$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectWight$1", f = "SmaHealthConnectModel.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,629:1\n380#2,14:630\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1\n*L\n255#1:630,14\n*E\n"})
    public static final class C33871 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<T> $dataList;
        final /* synthetic */ HealthConnectManager $healthConnectManager;
        final /* synthetic */ InputReadingsViewModel $viewModel;
        int label;
        final /* synthetic */ SmaHealthConnectModel this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public C33871(SmaHealthConnectModel r1, HealthConnectManager r2, InputReadingsViewModel r3, List<? extends T> r4, Continuation<? super C33871> r5) {
            this.this$0 = r1;
            this.$healthConnectManager = r2;
            this.$viewModel = r3;
            this.$dataList = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            return new C33871(this.this$0, this.$healthConnectManager, this.$viewModel, this.$dataList, r8);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C33871) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r7) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r7);
        L16:
            if (((Boolean) r7).booleanValue() == false) goto L26;
            List<T> r8 = this.$dataList;
            InputReadingsViewModel r2 = this.$viewModel;
            if (r8.isEmpty() == true) goto L26;
            if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r8)) == false) goto L26;
            Iterator r9 = r8.iterator();
        L23:
            if (r9.hasNext() == false) goto L26;
            Object r3 = r9.next();
            Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
            Weight r4 = (Weight) r3;
            LogUtils.i(new Object[]{"postHealthConnectData", "weight" + r4.getMWeight() + ud5.I0iXXO});
            r2.inputReadings((double) r4.getMWeight());
        L26:
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r7);
            Context r10 = this.this$0.getMContext();
            Intrinsics.XXI(r10);
            if (ad6.XIi00iiXO(r10, "com.google.android.apps.healthdata") == false) goto L26;
            if (ad6.iO() == false) goto L26;
            HealthConnectManager r11 = this.$healthConnectManager;
            Set<String> r5 = getPermissions();
            this.label = 1;
            r7 = r11.iIiiO(r5, this);
            if (r7 != r0) goto L16;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectWorkout$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectWorkout$1", f = "SmaHealthConnectModel.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWorkout$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,629:1\n84#2,5:630\n89#2:638\n90#2:640\n91#2,33:643\n155#2:677\n1563#3:635\n1634#3,2:636\n1636#3:639\n1878#3,2:641\n1880#3:676\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWorkout$1\n*L\n71#1:630,5\n71#1:638\n71#1:640\n71#1:643,33\n71#1:677\n71#1:635\n71#1:636,2\n71#1:639\n71#1:641,2\n71#1:676\n*E\n"})
    public static final class C33881 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<T> $dataList;
        final /* synthetic */ HealthConnectManager $healthConnectManager;
        final /* synthetic */ ExerciseSessionViewModel $viewModel;
        int label;
        final /* synthetic */ SmaHealthConnectModel this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public C33881(SmaHealthConnectModel r1, HealthConnectManager r2, ExerciseSessionViewModel r3, List<? extends T> r4, Continuation<? super C33881> r5) {
            this.this$0 = r1;
            this.$healthConnectManager = r2;
            this.$viewModel = r3;
            this.$dataList = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            return new C33881(this.this$0, this.$healthConnectManager, this.$viewModel, this.$dataList, r8);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C33881) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r22) {
            Object r1 = pb.I0iXXO();
            int r2 = this.label;
            if (r2 == 0) goto L8;
            if (r2 != 1) goto L7;
            ResultKt.X1ii(r22);
            Object r3 = r22;
        L16:
            if (((Boolean) r3).booleanValue() == false) goto L46;
            SmaHealthConnectModel r4 = this.this$0;
            List<T> r5 = this.$dataList;
            ExerciseSessionViewModel r6 = this.$viewModel;
            if (r5.isEmpty() == true) goto L46;
            if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r5)) == false) goto L46;
            List<T> r7 = r5;
            int r8 = 10;
            ArrayList r9 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r7, 10));
            Iterator r10 = r7.iterator();
        L23:
            if (r10.hasNext() == false) goto L25;
            Object r11 = r10.next();
            Intrinsics.X1ii(r11, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
            r9.add((Activity) r11);
            goto L23
        L25:
            Iterator r12 = r4.groupByTimeIntervalLoop(r9).iterator();
            int r13 = 0;
        L27:
            if (r12.hasNext() == false) goto L46;
            Object r14 = r12.next();
            int r18 = r13 + 1;
            if (r13 >= 0) goto L31;
            CollectionsKt__CollectionsKt.XOX0O0();
        L31:
            List<Activity> r15 = (List) r14;
            if (r15.isEmpty() == false) goto L34;
            SmaHealthConnectModel r19 = r4;
            Iterator r23 = r12;
            ExerciseSessionViewModel r16 = r6;
            int r0 = r8;
        L44:
            r12 = r23;
            r8 = r0;
            r6 = r16;
            r13 = r18;
            r4 = r19;
            goto L27
        L34:
            Pair<Activity, Activity> r17 = r4.getTimePeriod(r15);
            Activity r20 = r17.getFirst();
            Activity r21 = r17.getSecond();
            long r24 = iO.OiIIX101O((long) Math.floor((r21.getMTime() - r20.getMTime()) / 60000.0f), 1);
            long r110 = r21.getMStep() - r20.getMStep();
            double r111 = ((double) (r21.getMDistance() - r20.getMDistance())) / ((double) 10000);
            r23 = r12;
            r16 = r6;
            double r112 = ((double) (r21.getMCalorie() - r20.getMCalorie())) / ((double) r8);
            ArrayList<Integer> r25 = r4.getHrvListTime(r20.getMTime(), r21.getMTime());
            r19 = r4;
            i1O0OXO1O.OXO1.OXO1("HealthConnectModel : Activity__ValueID = " + r20.getMId() + HelpFormatter.DEFAULT_OPT_PREFIX + r21.getMId() + " , time=" + r24 + " step=" + r110 + " distance=" + r111 + "  calories=" + r112 + " size=" + r15.size() + ud5.I0iXXO);
            if (r110 > 0) goto L37;
        L43:
            r0 = 10;
            goto L44
        L37:
            if (r111 <= 0.0d) goto L43;
            if (r112 <= 0.0d) goto L43;
            if (r16 == null) goto L43;
            r0 = 10;
            r16.insertExerciseSession(r24, 12, r110, r111, r112, r25, r20.getMTime(), r21.getMTime());
            r16 = r16;
        L46:
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r22);
            Context r26 = this.this$0.getMContext();
            Intrinsics.XXI(r26);
            if (ad6.XIi00iiXO(r26, "com.google.android.apps.healthdata") == false) goto L46;
            if (ad6.iO() == false) goto L46;
            HealthConnectManager r27 = this.$healthConnectManager;
            Set<String> r28 = getPermissions();
            this.label = 1;
            r3 = r27.iIiiO(r28, this);
            if (r3 != r1) goto L16;
            return r1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public SmaHealthConnectModel(@tb1 Context r1) {
        this.mContext = r1;
        this.healthConnectLiveData = new MutableLiveData();
    }

    private static final long groupByTimeIntervalLoop$truncateToMinute(long r2) {
        return r2 / 60000;
    }

    private final boolean isSameDay(long r2, long r4) {
        ZoneId r0 = ZoneId.systemDefault();
        return Intrinsics.XOO0ii0(Instant.ofEpochMilli(r2).atZone(r0).toLocalDate(), Instant.ofEpochMilli(r4).atZone(r0).toLocalDate());
    }

    @aa1
    public final Pair<Integer, Integer> getCalender(long r2) {
        Date r0 = new Date(r2);
        Calendar r3 = Calendar.getInstance();
        r3.setTime(r0);
        int r4 = r3.get(11);
        return new Pair(Integer.valueOf(r3.get(12)), Integer.valueOf(r4));
    }

    @aa1
    public final MutableLiveData<Integer> getHealthConnectLiveData() {
        return this.healthConnectLiveData;
    }

    @aa1
    public final ArrayList<Integer> getHrvListTime(long r3, long r5) {
        ArrayList<Integer> r0 = new ArrayList();
        List<HeartRate> r4 = MyDb.INSTANCE.getMDatabase().heartRateDao().getHeartRates(r3, r5);
        LogUtils.i(new Object[]{"getHrvListTime list" + r4});
        Iterator<T> r6 = r4.iterator();
    L4:
        if (r6.hasNext() == false) goto L6;
        r0.add(Integer.valueOf(((HeartRate) r6.next()).getMBpm()));
        goto L4
    L6:
        return r0;
    }

    @tb1
    public final Context getMContext() {
        return this.mContext;
    }

    public final int getStageList(@aa1 List<BleSleep> r2, int r3) {
        Intrinsics.X0O(r2, "analyseSleep");
        int r4 = r2.get(r3).getMMode();
        if (r4 == 1) goto L19;
        if (r4 == 2) goto L17;
        if (r4 == 3) goto L15;
        if (r4 == 9) goto L13;
        return xm4.OXO1.OXO1();
    L13:
        return xm4.OXO1.O00();
    L15:
        return xm4.OXO1.XIi00iiXO();
    L17:
        return xm4.OXO1.XO0O10();
    L19:
        return xm4.OXO1.iO();
    }

    @aa1
    public final Pair<Activity, Activity> getTimePeriod(@aa1 List<Activity> r8) {
        Intrinsics.X0O(r8, "list");
        Object r0 = CollectionsKt___CollectionsKt.IIII0iI(r8);
        Activity r9 = (Activity) CollectionsKt___CollectionsKt.Xi1XO00(r8);
        Activity r2 = (Activity) r0;
        Activity r1 = MyDb.INSTANCE.getMDatabase().activityDao().getPreviousItemByID(r2.getMId());
        if (r1 == null) goto L10;
        if (r1.getMStep() == r2.getMStep()) goto L10;
        if (isSameDay(r1.getMTime(), r2.getMTime()) == false) goto L10;
        r0 = r1;
    L10:
        return new Pair(r0, r9);
    }

    @aa1
    public final List<List<Activity>> groupByTimeIntervalLoop(@aa1 List<Activity> r9) {
        Intrinsics.X0O(r9, "list");
        if (r9.isEmpty() == true) goto L5;
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.OXO1("HealthConnectModel : groupByTimeIntervalLoop__" + ((Activity) CollectionsKt___CollectionsKt.IIII0iI(r9)).getMId() + i1iXIO.XO0O10 + ((Activity) CollectionsKt___CollectionsKt.Xi1XO00(r9)).getMId());
        List r10 = CollectionsKt___CollectionsKt.II0O1(r9, new XIi00iiXO());
        ArrayList r2 = new ArrayList();
        r0.OXO1("HealthConnectModel : groupByTimeIntervalLoop sorted__" + ((Activity) CollectionsKt___CollectionsKt.IIII0iI(r10)).getMId() + i1iXIO.XO0O10 + ((Activity) CollectionsKt___CollectionsKt.Xi1XO00(r10)).getMId());
        Iterator r11 = r10.iterator();
    L8:
        if (r11.hasNext() == false) goto L18;
        Activity r1 = (Activity) r11.next();
        List r3 = (List) CollectionsKt___CollectionsKt.Oi0(r2);
        if (r3 == null) goto L11;
        Activity r4 = (Activity) CollectionsKt___CollectionsKt.Xi1XO00(r3);
        if ((groupByTimeIntervalLoop$truncateToMinute(r1.getMTime()) - groupByTimeIntervalLoop$truncateToMinute(r4.getMTime())) > 1) goto L17;
        if (isSameDay(r1.getMTime(), r4.getMTime()) == false) goto L17;
        r3.add(r1);
    L17:
        r2.add(CollectionsKt__CollectionsKt.Ii1iii0(new Activity[]{r1}));
        goto L8
    L11:
        r2.add(CollectionsKt__CollectionsKt.Ii1iii0(new Activity[]{r1}));
        goto L8
    L18:
        return r2;
    L5:
        return CollectionsKt__CollectionsKt.iI();
    }

    public final boolean isCleared() {
        return this.isCleared;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.isCleared = true;
        super.onCleared();
    }

    public final void setCleared(boolean r1) {
        this.isCleared = r1;
    }

    public final void setMContext(@tb1 Context r1) {
        this.mContext = r1;
    }

    @aa1
    public final List<List<BleSleep>> splitByMode17(@aa1 List<BleSleep> r7) {
        Intrinsics.X0O(r7, "<this>");
        if (r7.isEmpty() == true) goto L5;
        ArrayList r0 = new ArrayList();
        Iterator<BleSleep> r8 = r7.iterator();
    L7:
        boolean r2 = false;
    L9:
        if (r8.hasNext() == false) goto L20;
        BleSleep r3 = r8.next();
        if (r3.getMMode() != 17) goto L13;
        r0.add(new ArrayList());
        r2 = true;
    L13:
        if (r2 == false) goto L18;
        List r4 = (List) CollectionsKt___CollectionsKt.Oi0(r0);
        if (r4 == null) goto L18;
        r4.add(r3);
    L18:
        if (r3.getMMode() != 34) goto L9;
    L20:
        ArrayList r9 = new ArrayList();
        Iterator r1 = r0.iterator();
    L22:
        if (r1.hasNext() == false) goto L26;
        Object r5 = r1.next();
        if (((List) r5).isEmpty() == true) goto L22;
        r9.add(r5);
        goto L22
    L26:
        return r9;
    L5:
        return CollectionsKt__CollectionsKt.iI();
    }

    @RequiresApi(34)
    public final /* synthetic */ <T> void uploadHealthConnectBloodPressure(List<? extends T> r8, VitalSignsViewModel r9) {
        Intrinsics.X0O(r8, "dataList");
        Intrinsics.X0O(r9, "viewModel");
        if (r8.isEmpty() == false) goto L5;
        return;
    L5:
        if (BloodPressure.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r8)) == false) goto L14;
        ArrayList r0 = new ArrayList();
        Iterator<? extends T> r10 = r8.iterator();
    L8:
        if (r10.hasNext() == false) goto L10;
        T r1 = r10.next();
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
        BloodPressure r2 = (BloodPressure) r1;
        r0.add(new X10i1OOOX(r2.getMSystolic(), r2.getMDiastolic(), r2.getMTime()));
        goto L8
    L10:
        r9.inputBloodPressureReadings(r0);
        i1O0OXO1O.OXO1.OXO1("DataWorker inputBloodPressureReadings  list.size=" + r0.size());
        return;
    }

    @RequiresApi(34)
    public final /* synthetic */ <T> void uploadHealthConnectHeartRate(List<? extends T> r9, VitalSignsViewModel r10, HealthConnectManager r11) {
        Intrinsics.X0O(r9, "dataList");
        Intrinsics.X0O(r10, "viewModel");
        Intrinsics.X0O(r11, "healthConnectManager");
        I100X1.O00(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(this, r11, r10, r9, null), 3, null);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectHeartRate e = " + e);
    }

    @RequiresApi(34)
    public final /* synthetic */ <T> void uploadHealthConnectOxygen(List<? extends T> r9, VitalSignsViewModel r10, HealthConnectManager r11) {
        Intrinsics.X0O(r9, "dataList");
        Intrinsics.X0O(r10, "viewModel");
        Intrinsics.X0O(r11, "healthConnectManager");
        I100X1.O00(ViewModelKt.getViewModelScope(this), null, null, new C33841(this, r11, r10, r9, null), 3, null);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectHeartRate e = " + e);
    }

    @RequiresApi(34)
    public final /* synthetic */ <T> void uploadHealthConnectPressure(List<? extends T> r9, VitalSignsViewModel r10, HealthConnectManager r11) {
        Intrinsics.X0O(r9, "dataList");
        Intrinsics.X0O(r10, "viewModel");
        Intrinsics.X0O(r11, "healthConnectManager");
        I100X1.O00(ViewModelKt.getViewModelScope(this), null, null, new C33851(this, r11, r10, r9, null), 3, null);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectPressure e = " + e);
    }

    public final /* synthetic */ <T> void uploadHealthConnectSleep(List<? extends T> r9, SleepSessionViewModel r10, HealthConnectManager r11) {
        Intrinsics.X0O(r9, "dataList");
        Intrinsics.X0O(r10, "viewModel");
        Intrinsics.X0O(r11, "healthConnectManager");
        I100X1.O00(ViewModelKt.getViewModelScope(this), null, null, new C33861(this, r11, r10, r9, null), 3, null);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
    }

    public final /* synthetic */ <T> void uploadHealthConnectWight(List<? extends T> r9, InputReadingsViewModel r10, HealthConnectManager r11) {
        Intrinsics.X0O(r9, "dataList");
        Intrinsics.X0O(r10, "viewModel");
        Intrinsics.X0O(r11, "healthConnectManager");
        I100X1.O00(ViewModelKt.getViewModelScope(this), null, null, new C33871(this, r11, r10, r9, null), 3, null);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
    }

    public final /* synthetic */ <T> void uploadHealthConnectWorkout(List<? extends T> r9, ExerciseSessionViewModel r10, HealthConnectManager r11) {
        Intrinsics.X0O(r9, "dataList");
        Intrinsics.X0O(r10, "viewModel");
        Intrinsics.X0O(r11, "healthConnectManager");
        I100X1.O00(ViewModelKt.getViewModelScope(this), null, null, new C33881(this, r11, r10, r9, null), 3, null);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
    }

    @RequiresApi(26)
    public final /* synthetic */ <T> void uploadHealthConnectSleep(List<? extends T> r14, SleepSessionViewModel r15) {
        Intrinsics.X0O(r14, "dataListAsc");
        if (r14.isEmpty() == false) goto L5;
        return;
    L5:
        if (Sleep.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r14)) == false) goto L37;
        List<? extends T> r16 = r14;
        ArrayList r0 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r16, 10));
        Iterator<T> r17 = r16.iterator();
        int r2 = 0;
    L8:
        if (r17.hasNext() == false) goto L10;
        T r3 = r17.next();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        Sleep r4 = (Sleep) r3;
        int r5 = r4.getMAlgorithmType();
        r0.add(new BleSleep((int) (r4.getMTime() / ((long) 1000)), r4.getMMode(), r4.getMSoft(), r4.getMStrong()));
        r2 = r5;
        goto L8
    L10:
        Iterator<T> r18 = splitByMode17(r0).iterator();
    L12:
        if (r18.hasNext() == false) goto L38;
        List<BleSleep> r1 = BleSleep.Companion.analyseSleep((List) r18.next(), r2);
        if (r1.isEmpty() == true) goto L39;
        if (r1.size() < 2) goto L40;
        ArrayList r10 = new ArrayList();
        int r6 = r1.size() - 2;
        if (r6 < 0) goto L24;
        int r7 = 0;
    L21:
        Instant r8 = Instant.ofEpochMilli(((long) r1.get(r7).getMTime()) * 1000);
        int r9 = r7 + 1;
        Instant r11 = Instant.ofEpochMilli(((long) r1.get(r9).getMTime()) * 1000);
        int r12 = getStageList(r1, r7);
        Intrinsics.XXI(r8);
        Intrinsics.XXI(r11);
        r10.add(new xm4.OXO1(r8, r11, r12));
        if (r7 == r6) goto L24;
        r7 = r9;
    L24:
        i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectSleep input sleepHealth.size=" + r10.size());
        if (r15 == null) goto L27;
        SleepSessionViewModel r13 = r15;
        r13.generateSleepData(((long) ((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(r1)).getMTime()) * 1000, ((long) ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r1)).getMTime()) * 1000, r10);
    L28:
        r15 = r13;
        goto L12
    L27:
        r13 = r15;
        goto L28
    L40:
        return;
    L39:
        return;
    L38:
        return;
    }

    @RequiresApi(26)
    public final /* synthetic */ <T> void uploadHealthConnectWight(List<? extends T> r6, InputReadingsViewModel r7) {
        Intrinsics.X0O(r6, "dataList");
        Intrinsics.X0O(r7, "viewModel");
        if (r6.isEmpty() == false) goto L5;
        return;
    L5:
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r6)) == false) goto L12;
        Iterator<? extends T> r8 = r6.iterator();
    L8:
        if (r8.hasNext() == false) goto L13;
        T r0 = r8.next();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r1 = (Weight) r0;
        LogUtils.i(new Object[]{"postHealthConnectData", "weight" + r1.getMWeight() + ud5.I0iXXO});
        r7.inputReadings((double) r1.getMWeight());
        goto L8
    L13:
        return;
    }

    public final /* synthetic */ <T> void uploadHealthConnectWorkout(List<? extends T> r28, ExerciseSessionViewModel r29) {
        SmaHealthConnectModel r0 = this;
        Intrinsics.X0O(r28, "dataListAsc");
        if (r28.isEmpty() == false) goto L5;
        return;
    L5:
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r28)) == false) goto L38;
        List<? extends T> r1 = r28;
        int r3 = 10;
        ArrayList r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
        Iterator<T> r4 = r1.iterator();
    L8:
        if (r4.hasNext() == false) goto L10;
        T r5 = r4.next();
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        r2.add((Activity) r5);
        goto L8
    L10:
        Iterator<T> r6 = r0.groupByTimeIntervalLoop(r2).iterator();
        int r7 = 0;
    L12:
        if (r6.hasNext() == false) goto L39;
        T r8 = r6.next();
        int r9 = r7 + 1;
        if (r7 >= 0) goto L16;
        CollectionsKt__CollectionsKt.XOX0O0();
    L16:
        List<Activity> r10 = (List) r8;
        if (r10.isEmpty() == false) goto L19;
        Iterator<T> r210 = r6;
        int r26 = r9;
    L28:
        r3 = 10;
        r0 = this;
        r6 = r210;
        r7 = r26;
        goto L12
    L19:
        Pair<Activity, Activity> r11 = r0.getTimePeriod(r10);
        Activity r12 = r11.getFirst();
        Activity r13 = r11.getSecond();
        long r14 = iO.OiIIX101O((long) Math.floor((r13.getMTime() - r12.getMTime()) / 60000.0f), 1);
        long r15 = r13.getMStep() - r12.getMStep();
        double r16 = ((double) (r13.getMDistance() - r12.getMDistance())) / ((double) 10000);
        r210 = r6;
        double r17 = ((double) (r13.getMCalorie() - r12.getMCalorie())) / ((double) r3);
        ArrayList<Integer> r21 = r0.getHrvListTime(r12.getMTime(), r13.getMTime());
        i1O0OXO1O r18 = i1O0OXO1O.OXO1;
        int r19 = r12.getMId();
        int r20 = r13.getMId();
        int r22 = r10.size();
        StringBuilder r23 = new StringBuilder();
        r26 = r9;
        r23.append("HealthConnectModel : Activity__ValueID = ");
        r23.append(r19);
        r23.append(HelpFormatter.DEFAULT_OPT_PREFIX);
        r23.append(r20);
        r23.append(" , time=");
        r23.append(r14);
        r23.append(" step=");
        r23.append(r15);
        r23.append(" distance=");
        r23.append(r16);
        r23.append("  calories=");
        r23.append(r17);
        r23.append(" size=");
        r23.append(r22);
        r23.append(ud5.I0iXXO);
        r18.OXO1(r23.toString());
        if (r15 <= 0) goto L28;
        if (r16 <= 0.0d) goto L28;
        if (r17 <= 0.0d) goto L28;
        if (r29 == null) goto L28;
        r29.insertExerciseSession(r14, 12, r15, r16, r17, r21, r12.getMTime(), r13.getMTime());
        goto L28
    L39:
        return;
    }

    @RequiresApi(34)
    public final /* synthetic */ <T> void uploadHealthConnectHeartRate(List<? extends T> r7, VitalSignsViewModel r8) {
        Intrinsics.X0O(r7, "dataList");
        Intrinsics.X0O(r8, "viewModel");
        if (r7.isEmpty() == false) goto L5;
        return;
    L5:
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r7)) == false) goto L14;
        ArrayList r0 = new ArrayList();
        Iterator<? extends T> r9 = r7.iterator();
    L8:
        if (r9.hasNext() == false) goto L10;
        T r1 = r9.next();
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
        HeartRate r2 = (HeartRate) r1;
        r0.add(new I111IiiI1(r2.getMBpm(), r2.getMTime()));
        goto L8
    L10:
        r8.inputHeartRateReadings(r0);
        i1O0OXO1O.OXO1.OXO1("DataWorker inputHeartRateReadings  list.size=" + r0.size());
        return;
    }

    @RequiresApi(34)
    public final /* synthetic */ <T> void uploadHealthConnectOxygen(List<? extends T> r7, VitalSignsViewModel r8) {
        Intrinsics.X0O(r7, "dataList");
        Intrinsics.X0O(r8, "viewModel");
        if (r7.isEmpty() == false) goto L5;
        return;
    L5:
        if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r7)) == false) goto L14;
        ArrayList r0 = new ArrayList();
        Iterator<? extends T> r9 = r7.iterator();
    L8:
        if (r9.hasNext() == false) goto L10;
        T r1 = r9.next();
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
        BloodOxygen r2 = (BloodOxygen) r1;
        r0.add(new I1O1000iI(r2.getMValue(), r2.getMTime()));
        goto L8
    L10:
        r8.inputBloodOxyReadings(r0);
        i1O0OXO1O.OXO1.OXO1("DataWorker inputBloodOxyReadings  list.size=" + r0.size());
        return;
    }
}
