package com.sma.smartv3.biz.fitness_site.google;

import androidx.lifecycle.ViewModelKt;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.bestmafen.androidbase.base.BaseApplication;
import com.example.health.data.HealthConnectManager;
import com.example.health.presentation.screen.exercisesession.ExerciseSessionViewModel;
import com.example.health.presentation.screen.inputreadings.InputReadingsViewModel;
import com.example.health.presentation.screen.sleepsession.SleepSessionViewModel;
import com.example.health.presentation.screen.vitalsigns.VitalSignsViewModel;
import com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel.C154661;
import com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel.C289171;
import com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel.C289181;
import com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel.C289191;
import com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel.C289201;
import com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel.C289211;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p608db.entity.BloodOxygen;
import com.sma.smartv3.p608db.entity.BloodPressure;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.p608db.entity.Sleep;
import com.sma.smartv3.p608db.entity.Weight;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.biz.fitness_site.google.GoogleHealth$postHealthConnectData$1", m39466f = "GoogleHealth.kt", m39467i = {0}, m39468l = {157}, m39469m = "invokeSuspend", m39470n = {"list"}, m39472s = {"L$0"}, m39473v = 1)
@SourceDebugExtension({"SMAP\nGoogleHealth.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleHealth.kt\ncom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,167:1\n309#2,2:168\n321#2,5:170\n67#2,12:175\n251#2,15:187\n279#2,2:202\n293#2,4:204\n333#2,2:208\n345#2,5:210\n357#2,2:215\n369#2,5:217\n*S KotlinDebug\n*F\n+ 1 GoogleHealth.kt\ncom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1\n*L\n106#1:168,2\n106#1:170,5\n114#1:175,12\n122#1:187,15\n130#1:202,2\n130#1:204,4\n138#1:208,2\n138#1:210,5\n146#1:215,2\n146#1:217,5\n*E\n"})
public final class GoogleHealth$postHealthConnectData$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ GoogleHealth this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleHealth$postHealthConnectData$1(GoogleHealth googleHealth, Continuation<? super GoogleHealth$postHealthConnectData$1> continuation) {
        super(2, continuation);
        this.this$0 = googleHealth;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoogleHealth$postHealthConnectData$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((GoogleHealth$postHealthConnectData$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0084  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        ResultKt.X1ii(obj);
        while (true) {
            BaseApplication.OXO1 oxo1 = BaseApplication.f20378I1;
            if (oxo1.OXO1().isEmpty()) {
                return Unit.OXO1;
            }
            List<Object> listTake = oxo1.OXO1().take();
            if (listTake == null || !listTake.isEmpty()) {
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                Intrinsics.XXI(listTake);
                Object objIIII0iI = CollectionsKt___CollectionsKt.IIII0iI(listTake);
                Intrinsics.XXI(objIIII0iI);
                i1o0oxo1o.OXO1("DataWorker postHealthConnectData list = " + objIIII0iI.getClass() + " , size=" + listTake.size());
                if (this.this$0.I0IIOi != null) {
                    SmaHealthConnectModel smaHealthConnectModel = this.this$0.I0IIOi;
                    Intrinsics.XXI(smaHealthConnectModel);
                    if (smaHealthConnectModel.isCleared()) {
                        this.this$0.OIi0();
                    }
                } else {
                    this.this$0.OIi0();
                }
                Object objIIII0iI2 = CollectionsKt___CollectionsKt.IIII0iI(listTake);
                Intrinsics.XXI(objIIII0iI2);
                Class<?> cls = objIIII0iI2.getClass();
                if (Intrinsics.XOO0ii0(cls, HeartRate.class)) {
                    SmaHealthConnectModel smaHealthConnectModel2 = this.this$0.I0IIOi;
                    if (smaHealthConnectModel2 != null) {
                        VitalSignsViewModel vitalSignsViewModel = this.this$0.XOO0ii0;
                        Intrinsics.XXI(vitalSignsViewModel);
                        HealthConnectManager healthConnectManager = this.this$0.f50933iO;
                        Intrinsics.XXI(healthConnectManager);
                        try {
                            XX01Oi.IiI10X(ViewModelKt.getViewModelScope(smaHealthConnectModel2), null, null, smaHealthConnectModel2.new C154661(healthConnectManager, vitalSignsViewModel, listTake, null), 3, null);
                        } catch (Exception e) {
                            e.printStackTrace();
                            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectHeartRate e = " + e);
                        }
                    }
                } else if (Intrinsics.XOO0ii0(cls, Activity.class)) {
                    SmaHealthConnectModel smaHealthConnectModel3 = this.this$0.I0IIOi;
                    if (smaHealthConnectModel3 != null) {
                        ExerciseSessionViewModel exerciseSessionViewModel = this.this$0.XO0O10;
                        Intrinsics.XXI(exerciseSessionViewModel);
                        HealthConnectManager healthConnectManager2 = this.this$0.f50933iO;
                        Intrinsics.XXI(healthConnectManager2);
                        try {
                            XX01Oi.IiI10X(ViewModelKt.getViewModelScope(smaHealthConnectModel3), null, null, smaHealthConnectModel3.new C289211(healthConnectManager2, exerciseSessionViewModel, listTake, null), 3, null);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                } else if (Intrinsics.XOO0ii0(cls, Weight.class)) {
                    SmaHealthConnectModel smaHealthConnectModel4 = this.this$0.I0IIOi;
                    if (smaHealthConnectModel4 != null) {
                        InputReadingsViewModel inputReadingsViewModel = this.this$0.IiI10X;
                        Intrinsics.XXI(inputReadingsViewModel);
                        HealthConnectManager healthConnectManager3 = this.this$0.f50933iO;
                        Intrinsics.XXI(healthConnectManager3);
                        try {
                            XX01Oi.IiI10X(ViewModelKt.getViewModelScope(smaHealthConnectModel4), null, null, smaHealthConnectModel4.new C289201(healthConnectManager3, inputReadingsViewModel, listTake, null), 3, null);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                } else if (Intrinsics.XOO0ii0(cls, Sleep.class)) {
                    SmaHealthConnectModel smaHealthConnectModel5 = this.this$0.I0IIOi;
                    if (smaHealthConnectModel5 != null) {
                        SleepSessionViewModel sleepSessionViewModel = this.this$0.O00;
                        Intrinsics.XXI(sleepSessionViewModel);
                        HealthConnectManager healthConnectManager4 = this.this$0.f50933iO;
                        Intrinsics.XXI(healthConnectManager4);
                        try {
                            XX01Oi.IiI10X(ViewModelKt.getViewModelScope(smaHealthConnectModel5), null, null, smaHealthConnectModel5.new C289191(healthConnectManager4, sleepSessionViewModel, listTake, null), 3, null);
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                } else if (Intrinsics.XOO0ii0(cls, BloodOxygen.class)) {
                    SmaHealthConnectModel smaHealthConnectModel6 = this.this$0.I0IIOi;
                    if (smaHealthConnectModel6 != null) {
                        VitalSignsViewModel vitalSignsViewModel2 = this.this$0.XOO0ii0;
                        Intrinsics.XXI(vitalSignsViewModel2);
                        HealthConnectManager healthConnectManager5 = this.this$0.f50933iO;
                        Intrinsics.XXI(healthConnectManager5);
                        try {
                            XX01Oi.IiI10X(ViewModelKt.getViewModelScope(smaHealthConnectModel6), null, null, smaHealthConnectModel6.new C289171(healthConnectManager5, vitalSignsViewModel2, listTake, null), 3, null);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectHeartRate e = " + e5);
                        }
                    }
                } else if (Intrinsics.XOO0ii0(cls, BloodPressure.class)) {
                    SmaHealthConnectModel smaHealthConnectModel7 = this.this$0.I0IIOi;
                    if (smaHealthConnectModel7 != null) {
                        VitalSignsViewModel vitalSignsViewModel3 = this.this$0.XOO0ii0;
                        Intrinsics.XXI(vitalSignsViewModel3);
                        HealthConnectManager healthConnectManager6 = this.this$0.f50933iO;
                        Intrinsics.XXI(healthConnectManager6);
                        try {
                            XX01Oi.IiI10X(ViewModelKt.getViewModelScope(smaHealthConnectModel7), null, null, smaHealthConnectModel7.new C289181(healthConnectManager6, vitalSignsViewModel3, listTake, null), 3, null);
                        } catch (Exception e6) {
                            e6.printStackTrace();
                            i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectPressure e = " + e6);
                        }
                    }
                } else {
                    Object objIIII0iI3 = CollectionsKt___CollectionsKt.IIII0iI(listTake);
                    Intrinsics.XXI(objIIII0iI3);
                    i1o0oxo1o.OXO1("DataWorker postHealthConnectData list = " + objIIII0iI3.getClass() + " , size=" + listTake.size() + " , not support");
                }
                this.L$0 = SpillingKt.OXO1(listTake);
                this.label = 1;
                if (DelayKt.XIi00iiXO(5000L, this) == objI0iXXO) {
                    return objI0iXXO;
                }
            }
        }
    }
}
