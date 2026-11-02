package com.sma.smartv3.biz.fitness_site.google;

import androidx.lifecycle.ViewModelKt;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.bestmafen.androidbase.base.BaseApplication;
import com.example.health.data.HealthConnectManager;
import com.example.health.presentation.screen.exercisesession.ExerciseSessionViewModel;
import com.example.health.presentation.screen.inputreadings.InputReadingsViewModel;
import com.example.health.presentation.screen.sleepsession.SleepSessionViewModel;
import com.example.health.presentation.screen.vitalsigns.VitalSignsViewModel;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.db.entity.BloodOxygen;
import com.sma.smartv3.db.entity.BloodPressure;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.db.entity.Weight;
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
@DebugMetadata(c = "com.sma.smartv3.biz.fitness_site.google.GoogleHealth$postHealthConnectData$1", f = "GoogleHealth.kt", i = {0}, l = {157}, m = "invokeSuspend", n = {"list"}, s = {"L$0"}, v = 1)
@SourceDebugExtension({"SMAP\nGoogleHealth.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleHealth.kt\ncom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,167:1\n309#2,2:168\n321#2,5:170\n67#2,12:175\n251#2,15:187\n279#2,2:202\n293#2,4:204\n333#2,2:208\n345#2,5:210\n357#2,2:215\n369#2,5:217\n*S KotlinDebug\n*F\n+ 1 GoogleHealth.kt\ncom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1\n*L\n106#1:168,2\n106#1:170,5\n114#1:175,12\n122#1:187,15\n130#1:202,2\n130#1:204,4\n138#1:208,2\n138#1:210,5\n146#1:215,2\n146#1:217,5\n*E\n"})
public final class GoogleHealth$postHealthConnectData$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ GoogleHealth this$0;

    public GoogleHealth$postHealthConnectData$1(GoogleHealth r1, Continuation<? super GoogleHealth$postHealthConnectData$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new GoogleHealth$postHealthConnectData$1(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((GoogleHealth$postHealthConnectData$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r18) {
        Object r2 = pb.I0iXXO();
        int r0 = this.label;
        if (r0 == 0) goto L8;
        if (r0 != 1) goto L7;
        List r1 = (List) this.L$0;
        goto L8
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r18);
    L9:
        BaseApplication.OXO1 r3 = BaseApplication.I1;
        if (r3.OXO1().isEmpty() == true) goto L80;
        List<Object> r8 = r3.OXO1().take();
        if (r8 == null) goto L16;
        if (r8.isEmpty() == true) goto L9;
    L16:
        i1O0OXO1O r4 = i1O0OXO1O.OXO1;
        Intrinsics.XXI(r8);
        Object r5 = CollectionsKt___CollectionsKt.IIII0iI(r8);
        Intrinsics.XXI(r5);
        r4.OXO1("DataWorker postHealthConnectData list = " + r5.getClass() + " , size=" + r8.size());
        if (GoogleHealth.iO(this.this$0) == null) goto L20;
        SmaHealthConnectModel r6 = GoogleHealth.iO(this.this$0);
        Intrinsics.XXI(r6);
        if (r6.isCleared() == true) goto L20;
    L21:
        Object r7 = CollectionsKt___CollectionsKt.IIII0iI(r8);
        Intrinsics.XXI(r7);
        Class<?> r9 = r7.getClass();
        if (Intrinsics.XOO0ii0(r9, HeartRate.class) == false) goto L31;
        SmaHealthConnectModel r10 = GoogleHealth.iO(this.this$0);
        if (r10 == null) goto L76;
        VitalSignsViewModel r11 = GoogleHealth.IiI10X(this.this$0);
        Intrinsics.XXI(r11);
        HealthConnectManager r12 = GoogleHealth.OXO1(this.this$0);
        Intrinsics.XXI(r12);
        I100X1.O00(ViewModelKt.getViewModelScope(r10), null, null, new SmaHealthConnectModel.AnonymousClass1(r10, r12, r11, r8, null), 3, null);     // Catch: Exception -> L28
    L28:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectHeartRate e = " + e);
    L76:
        this.L$0 = SpillingKt.OXO1(r8);
        this.label = 1;
        if (DelayKt.XIi00iiXO(5000, this) != r2) goto L9;
        return r2;
    L31:
        if (Intrinsics.XOO0ii0(r9, Activity.class) == false) goto L40;
        SmaHealthConnectModel r13 = GoogleHealth.iO(this.this$0);
        if (r13 == null) goto L76;
        ExerciseSessionViewModel r14 = GoogleHealth.XIi00iiXO(this.this$0);
        Intrinsics.XXI(r14);
        HealthConnectManager r15 = GoogleHealth.OXO1(this.this$0);
        Intrinsics.XXI(r15);
        I100X1.O00(ViewModelKt.getViewModelScope(r13), null, null, new SmaHealthConnectModel.C33881(r13, r15, r14, r8, null), 3, null);     // Catch: Exception -> L37
    L37:
        e = move-exception;
        e.printStackTrace();
        goto L76
    L40:
        if (Intrinsics.XOO0ii0(r9, Weight.class) == false) goto L49;
        SmaHealthConnectModel r16 = GoogleHealth.iO(this.this$0);
        if (r16 == null) goto L76;
        InputReadingsViewModel r17 = GoogleHealth.XO0O10(this.this$0);
        Intrinsics.XXI(r17);
        HealthConnectManager r19 = GoogleHealth.OXO1(this.this$0);
        Intrinsics.XXI(r19);
        I100X1.O00(ViewModelKt.getViewModelScope(r16), null, null, new SmaHealthConnectModel.C33871(r16, r19, r17, r8, null), 3, null);     // Catch: Exception -> L46
    L46:
        e = move-exception;
        e.printStackTrace();
        goto L76
    L49:
        if (Intrinsics.XOO0ii0(r9, Sleep.class) == false) goto L58;
        SmaHealthConnectModel r20 = GoogleHealth.iO(this.this$0);
        if (r20 == null) goto L76;
        SleepSessionViewModel r21 = GoogleHealth.O00(this.this$0);
        Intrinsics.XXI(r21);
        HealthConnectManager r22 = GoogleHealth.OXO1(this.this$0);
        Intrinsics.XXI(r22);
        I100X1.O00(ViewModelKt.getViewModelScope(r20), null, null, new SmaHealthConnectModel.C33861(r20, r22, r21, r8, null), 3, null);     // Catch: Exception -> L55
    L55:
        e = move-exception;
        e.printStackTrace();
        goto L76
    L58:
        if (Intrinsics.XOO0ii0(r9, BloodOxygen.class) == false) goto L67;
        SmaHealthConnectModel r23 = GoogleHealth.iO(this.this$0);
        if (r23 == null) goto L76;
        VitalSignsViewModel r24 = GoogleHealth.IiI10X(this.this$0);
        Intrinsics.XXI(r24);
        HealthConnectManager r25 = GoogleHealth.OXO1(this.this$0);
        Intrinsics.XXI(r25);
        I100X1.O00(ViewModelKt.getViewModelScope(r23), null, null, new SmaHealthConnectModel.C33841(r23, r25, r24, r8, null), 3, null);     // Catch: Exception -> L64
    L64:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectHeartRate e = " + e);
        goto L76
    L67:
        if (Intrinsics.XOO0ii0(r9, BloodPressure.class) == false) goto L75;
        SmaHealthConnectModel r26 = GoogleHealth.iO(this.this$0);
        if (r26 == null) goto L76;
        VitalSignsViewModel r27 = GoogleHealth.IiI10X(this.this$0);
        Intrinsics.XXI(r27);
        HealthConnectManager r28 = GoogleHealth.OXO1(this.this$0);
        Intrinsics.XXI(r28);
        I100X1.O00(ViewModelKt.getViewModelScope(r26), null, null, new SmaHealthConnectModel.C33851(r26, r28, r27, r8, null), 3, null);     // Catch: Exception -> L73
    L73:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1("DataWorker uploadHealthConnectPressure e = " + e);
        goto L76
    L75:
        Object r29 = CollectionsKt___CollectionsKt.IIII0iI(r8);
        Intrinsics.XXI(r29);
        r4.OXO1("DataWorker postHealthConnectData list = " + r29.getClass() + " , size=" + r8.size() + " , not support");
    L20:
        this.this$0.OIi0();
        goto L21
    L80:
        return Unit.OXO1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
