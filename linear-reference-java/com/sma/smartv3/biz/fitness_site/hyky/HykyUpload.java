package com.sma.smartv3.biz.fitness_site.hyky;

import androidx.core.app.NotificationCompat;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bm;
import com.android.mltcode.paycertificationapi.bo0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.p1;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.TimeUtils;
import com.google.gson.reflect.TypeToken;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.db.entity.BloodOxygen;
import com.sma.smartv3.db.entity.BloodPressure;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.db.entity.Hrv;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.db.entity.Temperature;
import com.sma.smartv3.db.entity.Weight;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.network.GetSNCodeHYKY;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.util.TimePeriod;
import com.szabh.smable3.entity.BleSleep;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nHykyUpload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyUpload.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyUpload\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n*L\n1#1,491:1\n1563#2:492\n1634#2,3:493\n1869#2,2:496\n1563#2:498\n1634#2,3:499\n1491#2:502\n1516#2,3:503\n1519#2,3:513\n1999#2,14:519\n1563#2:534\n1634#2,3:535\n1869#2,2:538\n1563#2:540\n1634#2,3:541\n1869#2,2:544\n1563#2:546\n1634#2,3:547\n1869#2,2:550\n1563#2:552\n1634#2,3:553\n1869#2,2:556\n1563#2:558\n1634#2,3:559\n1869#2,2:562\n1563#2:564\n1634#2,3:565\n1869#2,2:568\n1563#2:570\n1634#2,3:571\n1869#2,2:574\n1869#2:598\n1870#2:621\n1573#2:622\n1604#2,4:623\n1869#2:627\n1870#2:650\n382#3,7:506\n126#4:516\n153#4,2:517\n155#4:533\n766#5,21:576\n802#5:597\n766#5,21:599\n802#5:620\n766#5,21:628\n802#5:649\n*S KotlinDebug\n*F\n+ 1 HykyUpload.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyUpload\n*L\n77#1:492\n77#1:493,3\n83#1:496,2\n91#1:498\n91#1:499,3\n93#1:502\n93#1:503,3\n93#1:513,3\n98#1:519,14\n99#1:534\n99#1:535,3\n104#1:538,2\n116#1:540\n116#1:541,3\n123#1:544,2\n131#1:546\n131#1:547,3\n137#1:550,2\n145#1:552\n145#1:553,3\n151#1:556,2\n164#1:558\n164#1:559,3\n170#1:562,2\n178#1:564\n178#1:565,3\n180#1:568,2\n188#1:570\n188#1:571,3\n194#1:574,2\n291#1:598\n291#1:621\n314#1:622\n314#1:623,4\n372#1:627\n372#1:650\n93#1:506,7\n96#1:516\n96#1:517,2\n96#1:533\n267#1:576,21\n267#1:597\n292#1:599,21\n292#1:620\n373#1:628,21\n373#1:649\n*E\n"})
public final class HykyUpload {

    @aa1
    private final String TAG;

    @aa1
    private final LinkedBlockingQueue<List<Object>> mUploadData;

    @tb1
    private XiOIO uploadJob;

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.hyky.HykyUpload$distribute$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.biz.fitness_site.hyky.HykyUpload", f = "HykyUpload.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7}, l = {84, 105, 124, 138, 152, 171, 181, 195}, m = "distribute", n = {"dataList", "first", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HykyUpload$distribute$3", "dataList", "first", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HykyUpload$distribute$8", "dataList", "first", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HykyUpload$distribute$10", "dataList", "first", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HykyUpload$distribute$12", "dataList", "first", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HykyUpload$distribute$14", "dataList", "first", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HykyUpload$distribute$16", "dataList", "first", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HykyUpload$distribute$18", "dataList", "first", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HykyUpload$distribute$20"}, s = {"L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1"}, v = 1)
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ HykyUpload this$0;

        public AnonymousClass1(HykyUpload r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @tb1
        public final Object invokeSuspend(@aa1 Object r2) {
            this.result = r2;
            this.label |= Integer.MIN_VALUE;
            return HykyUpload.access$distribute(this.this$0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.hyky.HykyUpload$startUpload$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.biz.fitness_site.hyky.HykyUpload$startUpload$1", f = "HykyUpload.kt", i = {0, 1, 2}, l = {57, 61, 65}, m = "invokeSuspend", n = {"dataList", "dataList", "dataList"}, s = {"L$0", "L$0", "L$0"}, v = 1)
    public static final class C33921 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ HykyUpload this$0;

        public C33921(HykyUpload r1, Continuation<? super C33921> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C33921(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C33921) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0063 -> B:15:0x0031). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0088 -> B:15:0x0031). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r9) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L14;
            if (r1 == 1) goto L13;
            if (r1 == 2) goto L10;
            if (r1 != 3) goto L9;
            List r2 = (List) this.L$0;
            goto L14
        L9:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L10:
            List r3 = (List) this.L$0;
            ResultKt.X1ii(r9);     // Catch: Exception -> L32
        L27:
            this.L$0 = SpillingKt.OXO1(r3);
            this.label = 3;
            if (DelayKt.XIi00iiXO(10000, this) != r0) goto L16;
        L29:
            return r0;
        L16:
            if (HykyUpload.access$getMUploadData$p(this.this$0).isEmpty() == true) goto L31;
            List r10 = (List) HykyUpload.access$getMUploadData$p(this.this$0).take();
            HykyManager r4 = HykyManager.Companion.getInstance();
            this.L$0 = r10;
            this.label = 1;
            Object r5 = r4.refreshToken(this);
            if (r5 == r0) goto L29;
            r3 = r10;
            r9 = r5;
        L22:
            if (((Boolean) r9).booleanValue() == false) goto L16;
            HykyUpload r11 = this.this$0;     // Catch: Exception -> L32
            Intrinsics.XXI(r3);     // Catch: Exception -> L32
            this.L$0 = SpillingKt.OXO1(r3);     // Catch: Exception -> L32
            this.label = 2;     // Catch: Exception -> L32
            if (HykyUpload.access$distribute(r11, r3, this) != r0) goto L27;
        L31:
            return Unit.OXO1;
        L13:
            r3 = (List) this.L$0;
            ResultKt.X1ii(r9);
        L14:
            ResultKt.X1ii(r9);
            goto L16
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public HykyUpload() {
        this.TAG = "HykyUpload";
        this.mUploadData = new LinkedBlockingQueue();
        startUpload();
    }

    public static final /* synthetic */ Object access$distribute(HykyUpload r0, List r1, Continuation r2) {
        return r0.distribute(r1, r2);
    }

    public static final /* synthetic */ LinkedBlockingQueue access$getMUploadData$p(HykyUpload r0) {
        return r0.mUploadData;
    }

    private final List<UploadSleepDataHYKY.SleepData> bleSleepToSleepData(List<Sleep> r44) {
        ArrayList r1 = new ArrayList();
        int r2 = 0;
        int r3 = r44.get(0).getMAlgorithmType();
        List<Sleep> r0 = r44;
        ArrayList r4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));
        Iterator<T> r5 = r0.iterator();
    L4:
        if (r5.hasNext() == false) goto L12;
        Object r6 = r5.next();
        int r7 = r2 + 1;
        if (r2 >= 0) goto L8;
        CollectionsKt__CollectionsKt.XOX0O0();
    L8:
        Sleep r8 = (Sleep) r6;
        if (r8.getMMode() != 17) goto L11;
        r3 = r8.getMAlgorithmType();
    L11:
        r4.add(new BleSleep((int) (r8.getMTime() / ((long) 1000)), r8.getMMode(), r8.getMSoft(), r8.getMStrong()));
        r2 = r7;
        goto L4
    L12:
        i1O0OXO1O.OXO1.OXO1(this.TAG + " bleSleepToSleepData source " + r3 + " " + r4);
        List<BleSleep> r9 = BleSleep.Companion.analyseSleep(r4, r3);
        if (r9.isEmpty() == true) goto L18;
        String r12 = TimeUtils.millis2String(((long) ((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(r9)).getMTime()) * 1000, O0X11OiO.IO0iXO0O());
        String r13 = TimeUtils.millis2String(((long) ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r9)).getMTime()) * 1000, O0X11OiO.IO0iXO0O());
        long r10 = 300000;
        UploadSleepDataHYKY.SleepData r22 = new UploadSleepDataHYKY.SleepData("Dev_" + UUID.randomUUID(), 1, TimeUtils.millis2String((((long) ((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(r9)).getMTime()) * 1000) - r10, O0X11OiO.IO0iXO0O()), r12, r13, TimeUtils.millis2String((((long) ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(r9)).getMTime()) * 1000) + r10, O0X11OiO.IO0iXO0O()), null, null, null, null, null, null, O0X11OiO.IO0iXO0O().format(Long.valueOf(System.currentTimeMillis())), null, null, null, null, null, 257984, null);
        r1.add(r22);
        List<Integer> r11 = HykyUtils.INSTANCE.analyseSleepToStatus(r9);
        if (r11.isEmpty() == true) goto L18;
        UploadSleepDataHYKY.SleepData r14 = UploadSleepDataHYKY.SleepData.copy$default(r22, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, p1.OXO1, null);
        r14.setSleepDataType(2);
        r14.setSleepStatusArr(r11);
        r1.add(r14);
    L18:
        return r1;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x042e -> B:108:0x042f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x04e4 -> B:122:0x04e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x058c -> B:139:0x058d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x0607 -> B:153:0x0608). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x06a0 -> B:167:0x06a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x01a3 -> B:37:0x01a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x02f4 -> B:78:0x02f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x039a -> B:94:0x039b). Please report as a decompilation issue!!! */
    private final Object distribute(List<? extends Object> r19, Continuation<? super Unit> r20) {
        if ((r20 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r2 = (AnonymousClass1) r20;
        int r3 = r2.label;
        if ((r3 & Integer.MIN_VALUE) == 0) goto L7;
        r2.label = r3 - Integer.MIN_VALUE;
    L8:
        Object r1 = r2.result;
        Object r4 = pb.I0iXXO();
        switch(r2.label) {
            case 0: goto L20;
            case 1: goto L19;
            case 2: goto L18;
            case 3: goto L17;
            case 4: goto L16;
            case 5: goto L15;
            case 6: goto L14;
            case 7: goto L13;
            case 8: goto L12;
            default: goto L11;
        };
    L12:
        int r5 = r2.I$0;
        UploadHealthDataHYKY.Temperature r6 = (UploadHealthDataHYKY.Temperature) r2.L$5;
        Iterator r7 = (Iterator) r2.L$3;
        Iterable r10 = (Iterable) r2.L$2;
        Object r11 = r2.L$1;
        List<? extends Object> r12 = (List) r2.L$0;
        ResultKt.X1ii(r1);
        List<? extends Object> r8 = r12;
    L167:
        healthDataUpload(r6);
    L162:
        if (r7.hasNext() == false) goto L169;
        Object r9 = r7.next();
        UploadHealthDataHYKY.Temperature r13 = (UploadHealthDataHYKY.Temperature) r9;
        r2.L$0 = SpillingKt.OXO1(r8);
        r2.L$1 = SpillingKt.OXO1(r11);
        r2.L$2 = SpillingKt.OXO1(r10);
        r2.L$3 = r7;
        r2.L$4 = SpillingKt.OXO1(r9);
        r2.L$5 = r13;
        r2.I$0 = r5;
        r2.I$1 = 0;
        r2.label = 8;
        if (DelayKt.XIi00iiXO(100, r2) != r4) goto L166;
    L165:
        return r4;
    L166:
        r6 = r13;
    L169:
        return Unit.OXO1;
    L13:
        int r14 = r2.I$0;
        Workout r15 = (Workout) r2.L$5;
        Iterator r16 = (Iterator) r2.L$3;
        Iterable r17 = (Iterable) r2.L$2;
        Object r18 = r2.L$1;
        List<? extends Object> r110 = (List) r2.L$0;
        ResultKt.X1ii(r1);
        List<? extends Object> r21 = r110;
    L153:
        sportDataUpload(r15);
    L148:
        if (r16.hasNext() == false) goto L169;
        Object r22 = r16.next();
        Workout r23 = (Workout) r22;
        r2.L$0 = SpillingKt.OXO1(r21);
        r2.L$1 = SpillingKt.OXO1(r18);
        r2.L$2 = SpillingKt.OXO1(r17);
        r2.L$3 = r16;
        r2.L$4 = SpillingKt.OXO1(r22);
        r2.L$5 = r23;
        r2.I$0 = r14;
        r2.I$1 = 0;
        r2.label = 7;
        if (DelayKt.XIi00iiXO(100, r2) == r4) goto L165;
        r15 = r23;
        goto L153
    L14:
        int r24 = r2.I$0;
        UploadHealthDataHYKY.Weight r25 = (UploadHealthDataHYKY.Weight) r2.L$5;
        Iterator r26 = (Iterator) r2.L$3;
        Iterable r111 = (Iterable) r2.L$2;
        Object r112 = r2.L$1;
        List<? extends Object> r113 = (List) r2.L$0;
        ResultKt.X1ii(r1);
        List<? extends Object> r27 = r113;
    L139:
        healthDataUpload(r25);
    L134:
        if (r26.hasNext() == false) goto L169;
        Object r28 = r26.next();
        UploadHealthDataHYKY.Weight r29 = (UploadHealthDataHYKY.Weight) r28;
        r2.L$0 = SpillingKt.OXO1(r27);
        r2.L$1 = SpillingKt.OXO1(r112);
        r2.L$2 = SpillingKt.OXO1(r111);
        r2.L$3 = r26;
        r2.L$4 = SpillingKt.OXO1(r28);
        r2.L$5 = r29;
        r2.I$0 = r24;
        r2.I$1 = 0;
        r2.label = 6;
        if (DelayKt.XIi00iiXO(100, r2) == r4) goto L165;
        r25 = r29;
        goto L139
    L15:
        int r30 = r2.I$0;
        UploadHealthDataHYKY.Location r31 = (UploadHealthDataHYKY.Location) r2.L$5;
        Iterator r32 = (Iterator) r2.L$3;
        Iterable r114 = (Iterable) r2.L$2;
        Object r115 = r2.L$1;
        List<? extends Object> r116 = (List) r2.L$0;
        ResultKt.X1ii(r1);
        List<? extends Object> r33 = r116;
    L122:
        healthDataUpload(r31);
    L117:
        if (r32.hasNext() == false) goto L169;
        Object r34 = r32.next();
        UploadHealthDataHYKY.Location r35 = (UploadHealthDataHYKY.Location) r34;
        r2.L$0 = SpillingKt.OXO1(r33);
        r2.L$1 = SpillingKt.OXO1(r115);
        r2.L$2 = SpillingKt.OXO1(r114);
        r2.L$3 = r32;
        r2.L$4 = SpillingKt.OXO1(r34);
        r2.L$5 = r35;
        r2.I$0 = r30;
        r2.I$1 = 0;
        r2.label = 5;
        if (DelayKt.XIi00iiXO(100, r2) == r4) goto L165;
        r31 = r35;
        goto L122
    L16:
        int r36 = r2.I$0;
        UploadHealthDataHYKY.BloodOxygen r37 = (UploadHealthDataHYKY.BloodOxygen) r2.L$5;
        Iterator r38 = (Iterator) r2.L$3;
        Iterable r117 = (Iterable) r2.L$2;
        Object r118 = r2.L$1;
        List<? extends Object> r119 = (List) r2.L$0;
        ResultKt.X1ii(r1);
        List<? extends Object> r39 = r119;
    L108:
        healthDataUpload(r37);
    L103:
        if (r38.hasNext() == false) goto L169;
        Object r40 = r38.next();
        UploadHealthDataHYKY.BloodOxygen r41 = (UploadHealthDataHYKY.BloodOxygen) r40;
        r2.L$0 = SpillingKt.OXO1(r39);
        r2.L$1 = SpillingKt.OXO1(r118);
        r2.L$2 = SpillingKt.OXO1(r117);
        r2.L$3 = r38;
        r2.L$4 = SpillingKt.OXO1(r40);
        r2.L$5 = r41;
        r2.I$0 = r36;
        r2.I$1 = 0;
        r2.label = 4;
        if (DelayKt.XIi00iiXO(100, r2) == r4) goto L165;
        r37 = r41;
        goto L108
    L17:
        int r42 = r2.I$0;
        UploadHealthDataHYKY.BloodPressure r43 = (UploadHealthDataHYKY.BloodPressure) r2.L$5;
        Iterator r120 = (Iterator) r2.L$3;
        Iterable r121 = (Iterable) r2.L$2;
        Object r122 = r2.L$1;
        List<? extends Object> r123 = (List) r2.L$0;
        ResultKt.X1ii(r1);
        List<? extends Object> r44 = r123;
    L94:
        healthDataUpload(r43);
    L89:
        if (r120.hasNext() == false) goto L169;
        Object r45 = r120.next();
        UploadHealthDataHYKY.BloodPressure r46 = (UploadHealthDataHYKY.BloodPressure) r45;
        r2.L$0 = SpillingKt.OXO1(r44);
        r2.L$1 = SpillingKt.OXO1(r122);
        r2.L$2 = SpillingKt.OXO1(r121);
        r2.L$3 = r120;
        r2.L$4 = SpillingKt.OXO1(r45);
        r2.L$5 = r46;
        r2.I$0 = r42;
        r2.I$1 = 0;
        r2.label = 3;
        if (DelayKt.XIi00iiXO(100, r2) == r4) goto L165;
        r43 = r46;
        goto L94
    L18:
        int r47 = r2.I$0;
        UploadHealthDataHYKY.HeartRate r48 = (UploadHealthDataHYKY.HeartRate) r2.L$5;
        Iterator r49 = (Iterator) r2.L$3;
        Iterable r124 = (Iterable) r2.L$2;
        Object r125 = r2.L$1;
        List<? extends Object> r126 = (List) r2.L$0;
        ResultKt.X1ii(r1);
        List<? extends Object> r50 = r126;
    L78:
        healthDataUpload(r48);
    L73:
        if (r49.hasNext() == false) goto L169;
        Object r51 = r49.next();
        UploadHealthDataHYKY.HeartRate r52 = (UploadHealthDataHYKY.HeartRate) r51;
        r2.L$0 = SpillingKt.OXO1(r50);
        r2.L$1 = SpillingKt.OXO1(r125);
        r2.L$2 = SpillingKt.OXO1(r124);
        r2.L$3 = r49;
        r2.L$4 = SpillingKt.OXO1(r51);
        r2.L$5 = r52;
        r2.I$0 = r47;
        r2.I$1 = 0;
        r2.label = 2;
        if (DelayKt.XIi00iiXO(100, r2) == r4) goto L165;
        r48 = r52;
        goto L78
    L19:
        int r53 = r2.I$0;
        UploadHealthDataHYKY.StepCount r54 = (UploadHealthDataHYKY.StepCount) r2.L$5;
        Iterator r127 = (Iterator) r2.L$3;
        Iterable r128 = (Iterable) r2.L$2;
        Object r129 = r2.L$1;
        List<? extends Object> r130 = (List) r2.L$0;
        ResultKt.X1ii(r1);
        List<? extends Object> r55 = r130;
    L37:
        healthDataUpload(r54);
    L32:
        if (r127.hasNext() == false) goto L169;
        Object r56 = r127.next();
        UploadHealthDataHYKY.StepCount r131 = (UploadHealthDataHYKY.StepCount) r56;
        r2.L$0 = SpillingKt.OXO1(r55);
        r2.L$1 = SpillingKt.OXO1(r129);
        r2.L$2 = SpillingKt.OXO1(r128);
        r2.L$3 = r127;
        r2.L$4 = SpillingKt.OXO1(r56);
        r2.L$5 = r131;
        r2.I$0 = r53;
        r2.I$1 = 0;
        r2.label = 1;
        if (DelayKt.XIi00iiXO(100, r2) == r4) goto L165;
        r54 = r131;
        goto L37
    L20:
        ResultKt.X1ii(r1);
        if (CollectionsKt___CollectionsKt.iXi1iI0(r19) == null) goto L23;
        Object r57 = CollectionsKt___CollectionsKt.IIII0iI(r19);
        Intrinsics.XXI(r57);
        if (Activity.class.isInstance(r57) == false) goto L39;
        List<? extends Object> r58 = r19;
        ArrayList r59 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r58, 10));
        Iterator<T> r60 = r58.iterator();
    L28:
        if (r60.hasNext() == false) goto L30;
        Object r132 = r60.next();
        Intrinsics.X1ii(r132, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r133 = (Activity) r132;
        UploadHealthDataHYKY.StepCount r134 = new UploadHealthDataHYKY.StepCount(0, 1, null);
        r134.setStep(r133.getMStep());
        r134.setRecordTime(HykyUtils.INSTANCE.dateFormatToHyky(r133.getMLocalTime()));
        r59.add(r134);
        goto L28
    L30:
        r129 = r57;
        r127 = r59.iterator();
        r128 = r59;
        r53 = 0;
        r55 = r19;
        goto L32
    L39:
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r19)) == false) goto L80;
        List<? extends Object> r61 = r19;
        ArrayList r62 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r61, 10));
        Iterator<T> r63 = r61.iterator();
    L42:
        if (r63.hasNext() == false) goto L44;
        Object r135 = r63.next();
        Intrinsics.X1ii(r135, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
        r62.add((HeartRate) r135);
        goto L42
    L44:
        LinkedHashMap r64 = new LinkedHashMap();
        Iterator r65 = r62.iterator();
    L46:
        if (r65.hasNext() == false) goto L51;
        Object r136 = r65.next();
        Long r66 = Boxing.XOO0ii0(((HeartRate) r136).getMTime() / ((long) 60000));
        Object r67 = r64.get(r66);
        if (r67 != null) goto L50;
        r67 = new ArrayList();
        r64.put(r66, r67);
    L50:
        ((List) r67).add(r136);
        goto L46
    L51:
        ArrayList r68 = new ArrayList(r64.size());
        Iterator r69 = r64.entrySet().iterator();
    L53:
        if (r69.hasNext() == false) goto L67;
        Iterator r70 = ((List) ((Map.Entry) r69.next()).getValue()).iterator();
        if (r70.hasNext() == true) goto L57;
        Object r71 = null;
    L66:
        r68.add((HeartRate) r71);
        goto L53
    L57:
        r71 = r70.next();
        if (r70.hasNext() == false) goto L66;
        long r137 = ((HeartRate) r71).getMTime();
    L61:
        Object r138 = r70.next();
        long r139 = ((HeartRate) r138).getMTime();
        if (r137 >= r139) goto L65;
        r71 = r138;
        r137 = r139;
    L65:
        if (r70.hasNext() == true) goto L61;
    L67:
        List r72 = CollectionsKt___CollectionsKt.OXXO0O1X(r68);
        ArrayList r73 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r72, 10));
        Iterator r74 = r72.iterator();
    L69:
        if (r74.hasNext() == false) goto L71;
        HeartRate r75 = (HeartRate) r74.next();
        UploadHealthDataHYKY.HeartRate r76 = new UploadHealthDataHYKY.HeartRate(0, 1, null);
        r76.setHeartRate(r75.getMBpm());
        r76.setRecordTime(HykyUtils.INSTANCE.dateFormatToHyky(r75.getMLocalTime()));
        r73.add(r76);
        goto L69
    L71:
        r125 = r57;
        r49 = r73.iterator();
        r124 = r73;
        r47 = 0;
        r50 = r19;
        goto L73
    L80:
        if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r19)) == true) goto L169;
        if (BloodPressure.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r19)) == false) goto L96;
        List<? extends Object> r77 = r19;
        ArrayList r78 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r77, 10));
        Iterator<T> r79 = r77.iterator();
    L85:
        if (r79.hasNext() == false) goto L87;
        Object r80 = r79.next();
        Intrinsics.X1ii(r80, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
        BloodPressure r81 = (BloodPressure) r80;
        UploadHealthDataHYKY.BloodPressure r82 = new UploadHealthDataHYKY.BloodPressure(0, 0, 3, null);
        r82.setBloodPressureLow(r81.getMDiastolic());
        r82.setBloodPressureHigh(r81.getMSystolic());
        r82.setRecordTime(HykyUtils.INSTANCE.dateFormatToHyky(r81.getMLocalTime()));
        r78.add(r82);
        goto L85
    L87:
        r122 = r57;
        r120 = r78.iterator();
        r121 = r78;
        r42 = 0;
        r44 = r19;
        goto L89
    L96:
        if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r19)) == false) goto L110;
        List<? extends Object> r83 = r19;
        ArrayList r84 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r83, 10));
        Iterator<T> r85 = r83.iterator();
    L99:
        if (r85.hasNext() == false) goto L101;
        Object r86 = r85.next();
        Intrinsics.X1ii(r86, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
        BloodOxygen r87 = (BloodOxygen) r86;
        UploadHealthDataHYKY.BloodOxygen r88 = new UploadHealthDataHYKY.BloodOxygen(0, 1, null);
        r88.setBloodOxygen(r87.getMValue());
        r88.setRecordTime(HykyUtils.INSTANCE.dateFormatToHyky(r87.getMLocalTime()));
        r84.add(r88);
        goto L99
    L101:
        r118 = r57;
        r38 = r84.iterator();
        r117 = r84;
        r36 = 0;
        r39 = r19;
        goto L103
    L110:
        if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r19)) == false) goto L124;
        List<? extends Object> r89 = r19;
        ArrayList r90 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r89, 10));
        Iterator<T> r91 = r89.iterator();
    L113:
        if (r91.hasNext() == false) goto L115;
        Object r92 = r91.next();
        Intrinsics.X1ii(r92, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
        Location r93 = (Location) r92;
        UploadHealthDataHYKY.Location r94 = new UploadHealthDataHYKY.Location(null, 1, null);
        r94.setLocation(I000IiI1O.iO.XIi00iiXO + r93.getMLongitude() + I000IiI1O.iO.XO0O10 + r93.getMLatitude() + I000IiI1O.iO.iO);
        r94.setRecordTime(HykyUtils.INSTANCE.dateFormatToHyky(r93.getMLocalTime()));
        r90.add(r94);
        goto L113
    L115:
        r115 = r57;
        r32 = r90.iterator();
        r114 = r90;
        r30 = 0;
        r33 = r19;
        goto L117
    L124:
        if (Sleep.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r19)) == false) goto L127;
        handleSleepUpload();
        goto L169
    L127:
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r19)) == false) goto L141;
        List<? extends Object> r95 = r19;
        ArrayList r96 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r95, 10));
        Iterator<T> r97 = r95.iterator();
    L130:
        if (r97.hasNext() == false) goto L132;
        Object r140 = r97.next();
        Intrinsics.X1ii(r140, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r141 = (Weight) r140;
        UploadHealthDataHYKY.Weight r142 = new UploadHealthDataHYKY.Weight(0.0d, 1, null);
        r142.setWeight(r141.getMWeight());
        r142.setRecordTime(HykyUtils.INSTANCE.dateFormatToHyky(r141.getMLocalTime()));
        r96.add(r142);
        goto L130
    L132:
        r112 = r57;
        r26 = r96.iterator();
        r111 = r96;
        r24 = 0;
        r27 = r19;
        goto L134
    L141:
        if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r19)) == false) goto L155;
        List<? extends Object> r98 = r19;
        ArrayList r99 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r98, 10));
        Iterator<T> r100 = r98.iterator();
    L144:
        if (r100.hasNext() == false) goto L146;
        Object r101 = r100.next();
        Intrinsics.X1ii(r101, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        r99.add((Workout) r101);
        goto L144
    L146:
        r18 = r57;
        r16 = r99.iterator();
        r17 = r99;
        r14 = 0;
        r21 = r19;
        goto L148
    L155:
        if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r19)) == false) goto L169;
        List<? extends Object> r102 = r19;
        ArrayList r103 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r102, 10));
        Iterator<T> r104 = r102.iterator();
    L158:
        if (r104.hasNext() == false) goto L160;
        Object r143 = r104.next();
        Intrinsics.X1ii(r143, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
        Temperature r144 = (Temperature) r143;
        UploadHealthDataHYKY.Temperature r145 = new UploadHealthDataHYKY.Temperature(0.0d, 1, null);
        r145.setTemperature(((double) r144.getMTemperature()) / 10.0d);
        r145.setRecordTime(HykyUtils.INSTANCE.dateFormatToHyky(r144.getMLocalTime()));
        r103.add(r145);
        goto L158
    L160:
        r11 = r57;
        r7 = r103.iterator();
        r10 = r103;
        r5 = 0;
        r8 = r19;
        goto L162
    L23:
        return Unit.OXO1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r2 = new AnonymousClass1(this, r20);
        goto L8
    }

    private final boolean enableLocation(UploadSportDataHYKY.SportData r2) {
        int r3 = r2.getSportType();
        if (r3 != UploadSportDataHYKY.SportType.RUNNING.getValue()) goto L5;
        return true;
    L5:
        if (r3 != UploadSportDataHYKY.SportType.CYCLING.getValue()) goto L7;
        return true;
    L7:
        if (r3 != UploadSportDataHYKY.SportType.MOUNTAINEERING.getValue()) goto L9;
        return true;
    L9:
        if (r3 == UploadSportDataHYKY.SportType.WALK.getValue()) goto L17;
        return false;
    L17:
        return true;
    }

    private final boolean enablePace(UploadSportDataHYKY.SportData r2) {
        int r3 = r2.getSportType();
        if (r3 != UploadSportDataHYKY.SportType.RUNNING.getValue()) goto L5;
        return true;
    L5:
        if (r3 != UploadSportDataHYKY.SportType.CYCLING.getValue()) goto L7;
        return true;
    L7:
        if (r3 != UploadSportDataHYKY.SportType.MOUNTAINEERING.getValue()) goto L9;
        return true;
    L9:
        if (r3 == UploadSportDataHYKY.SportType.WALK.getValue()) goto L17;
        return false;
    L17:
        return true;
    }

    private final boolean enableStepFreq(UploadSportDataHYKY.SportData r2) {
        int r3 = r2.getSportType();
        if (r3 != UploadSportDataHYKY.SportType.RUNNING.getValue()) goto L5;
        return true;
    L5:
        if (r3 != UploadSportDataHYKY.SportType.MOUNTAINEERING.getValue()) goto L7;
        return true;
    L7:
        if (r3 == UploadSportDataHYKY.SportType.WALK.getValue()) goto L14;
        return false;
    L14:
        return true;
    }

    private final void handleSleepUpload() {
        String r3 = HykyManager.Companion.getInstance().getUploadSleepLastDate();
        String r0 = O0X11OiO.IO0iXO0O().format(new Date());
        Intrinsics.XXI(r0);
        int r4 = O0X11OiO.I0iXXO(r3, r0, "yyyy-MM-dd HH:mm:ss");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " handleSleepUpload -> lastDate=" + r3 + ", curDate=" + r0 + ", days=" + r4);
        if (r4 <= 0) goto L24;
        char r5 = 0;
        int r6 = 0;
    L6:
        if (r6 >= r4) goto L34;
        Calendar r7 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r7, "getInstance(...)");
        long[] r1 = O0X11OiO.I1(r7, TimePeriod.DAY, r6 - r4);
        String r8 = O0X11OiO.IO0iXO0O().format(new Date(r1[r5]));
        String r9 = O0X11OiO.I0IIOi().format(new Date(r1[r5]));
        String r2 = O0X11OiO.IO0iXO0O().format(new Date(r1[1]));
        i1O0OXO1O r10 = i1O0OXO1O.OXO1;
        r10.OXO1(this.TAG + " handleSleepUpload " + r8 + " timeRange -> " + r8 + " - " + r2 + " , date = " + r9);
        if (Intrinsics.XOO0ii0(r3, r8) == false) goto L10;
        r10.XIi00iiXO(this.TAG + " handleSleepUpload -> can not upload, " + r8 + " is uploaded");
        int r11 = r6;
    L23:
        r6 = r11 + 1;
        r5 = 0;
        goto L6
    L10:
        a01.OXO1.IiI10X().put(b01.i1iII1i1, r8);
        long r13 = O0X11OiO.I0IIOi().parse(r9).getTime();     // Catch: Exception -> L20
        r11 = r6;
        long r12 = O0X11OiO.iXiX011;
        long r14 = r13 - r12;
        long r15 = r13 + r12;
        r10.OXO1(this.TAG + " handleSleepUpload " + r8 + " sleeps -> " + O0X11OiO.IO0iXO0O().format(new Date(r14)) + " - " + O0X11OiO.IO0iXO0O().format(new Date(r15)));     // Catch: Exception -> L18
        List<Sleep> r16 = MyDb.INSTANCE.getMDatabase().sleepDao().getSleeps(r14, r15);     // Catch: Exception -> L18
        r10.OXO1(this.TAG + " handleSleepUpload " + r8 + " sleeps -> " + r16);     // Catch: Exception -> L18
        if (r16.isEmpty() == true) goto L23;
        sleepDataUpload(r16);     // Catch: Exception -> L18
    L18:
        e = e;
    L22:
        e.printStackTrace();
    L20:
        e = e;
        r11 = r6;
        goto L22
    L34:
        return;
    }

    private final void sleepDataUpload(List<Sleep> r14) {
        HykyUtils r0 = HykyUtils.INSTANCE;
        GetSNCodeHYKY.Response r1 = r0.getDeviceCode();
        if (r1 == null) goto L10;
        String r6 = r0.getDeviceID(r1.getMac());
        if (r6 == null) goto L12;
        Iterator<T> r15 = bleSleepToSleepData(r14).iterator();
    L8:
        if (r15.hasNext() == false) goto L13;
        UploadSleepDataHYKY.SleepData r10 = (UploadSleepDataHYKY.SleepData) r15.next();
        NetWorkUtils r2 = NetWorkUtils.INSTANCE;
        HykyManager.Companion r3 = HykyManager.Companion;
        UploadSleepDataHYKY.BodyData r4 = new UploadSleepDataHYKY.BodyData(r3.getInstance().getMAppUser().noAreaCodePhone(), 0, r6, r1.getCmei(), r1.getSn(), r1.getMac(), r10, 2, null);
        String r5 = HykyAPI.INSTANCE.getBASE_URL_HYKY() + UploadSleepDataHYKY.URL;
        final O1XIiIO r7 = null;
        AndroidNetworking.post(r5).addHeaders("Authorization", r3.getInstance().getToken().getTokenType() + " " + r3.getInstance().getToken().getAccessToken()).addApplicationJsonBody(r4).setTag(r5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(HykyResponse.class, new Type[]{Object.class}), new HykyUpload$sleepDataUpload$lambda$0$0$0$$inlined$postHyky$default$1(r7));
        goto L8
    L13:
        return;
    L12:
        return;
    }

    private final void startUpload() {
        XiOIO r0 = this.uploadJob;
        if (r0 != null) goto L5;
    L7:
        this.uploadJob = I100X1.O00(I0IIOi.OXO1(IXOX0Xiii.iO()), null, null, new C33921(this, null), 3, null);
        return;
    L5:
        if (r0.isActive() != true) goto L7;
    }

    private final List<UploadSportDataHYKY.SportData> workoutToSportData(Workout r21) {
        ArrayList r2 = new ArrayList();
        UploadSportDataHYKY.SportOverView r3 = new UploadSportDataHYKY.SportOverView(null, null, null, null, null, null, null, null, null, null, null, null, null, null, bm.OXO1, null);
        r3.setAvgHr(Integer.valueOf(r21.getMAvgBpm()));
        r3.setMinHr(Integer.valueOf(r21.getMMinBpm()));
        r3.setMaxHr(Integer.valueOf(r21.getMMaxBpm()));
        r3.setCalorie(Integer.valueOf(r21.getMCalorie()));
        r3.setDuration(Integer.valueOf(r21.getMDuration()));
        r3.setDistance(Integer.valueOf(r21.getMDistance()));
        String r4 = String.valueOf(r21.getMStart());
        String r6 = String.valueOf(r21.getMEnd());
        String r7 = "Dev_" + UUID.randomUUID();
        HykyUtils r8 = HykyUtils.INSTANCE;
        UploadSportDataHYKY.SportData r5 = new UploadSportDataHYKY.SportData(0, r4, r6, r7, 0, r8.dateFormatToHyky(r21.getMLocalTime()), r3, null, null, null, null, null, 3985, null);
        r2.add(r8.getSportOverView(r21, r5));
        UploadSportDataHYKY.SportData r9 = r8.getHrData(r21, UploadSportDataHYKY.SportData.copy$default(r5, 0, null, null, null, 0, null, null, null, null, null, null, null, bo0.iO, null));
        if (r9 == null) goto L6;
        r2.add(r9);
    L6:
        if (enableLocation(r5) == false) goto L11;
        UploadSportDataHYKY.SportData r10 = r8.getLocationData(r21, UploadSportDataHYKY.SportData.copy$default(r5, 0, null, null, null, 0, null, null, null, null, null, null, null, bo0.iO, null));
        if (r10 == null) goto L11;
        r2.add(r10);
    L11:
        if (enableStepFreq(r5) == false) goto L16;
        UploadSportDataHYKY.SportData r11 = r8.getStepFreqData(r21, UploadSportDataHYKY.SportData.copy$default(r5, 0, null, null, null, 0, null, null, null, null, null, null, null, bo0.iO, null));
        if (r11 == null) goto L16;
        r2.add(r11);
    L16:
        if (enablePace(r5) == false) goto L20;
        UploadSportDataHYKY.SportData r0 = r8.getPaceData(r21, UploadSportDataHYKY.SportData.copy$default(r5, 0, null, null, null, 0, null, null, null, null, null, null, null, bo0.iO, null));
        if (r0 == null) goto L20;
        r2.add(r0);
    L20:
        return r2;
    }

    public final void healthDataUpload(@aa1 Object r14) {
        Intrinsics.X0O(r14, "healthData");
        HykyUtils r0 = HykyUtils.INSTANCE;
        GetSNCodeHYKY.Response r1 = r0.getDeviceCode();
        if (r1 == null) goto L8;
        String r6 = r0.getDeviceID(r1.getMac());
        if (r6 == null) goto L9;
        NetWorkUtils r2 = NetWorkUtils.INSTANCE;
        HykyManager.Companion r3 = HykyManager.Companion;
        UploadHealthDataHYKY.BodyData r4 = new UploadHealthDataHYKY.BodyData(r3.getInstance().getMAppUser().noAreaCodePhone(), 0, r6, r1.getCmei(), r1.getSn(), r1.getMac(), r14, 2, null);
        String r15 = HykyAPI.INSTANCE.getBASE_URL_HYKY() + UploadHealthDataHYKY.URL;
        final O1XIiIO r5 = null;
        AndroidNetworking.post(r15).addHeaders("Authorization", r3.getInstance().getToken().getTokenType() + " " + r3.getInstance().getToken().getAccessToken()).addApplicationJsonBody(r4).setTag(r15).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(HykyResponse.class, new Type[]{Object.class}), new HykyUpload$healthDataUpload$lambda$0$0$$inlined$postHyky$default$1(r5));
        return;
    L9:
        return;
    }

    public final void putData(@aa1 List<? extends Object> r2) {
        Intrinsics.X0O(r2, "dataList");
        this.mUploadData.put(r2);
        startUpload();
    }

    public final void sportDataUpload(@aa1 Workout r14) {
        Intrinsics.X0O(r14, NotificationCompat.CATEGORY_WORKOUT);
        HykyUtils r0 = HykyUtils.INSTANCE;
        GetSNCodeHYKY.Response r1 = r0.getDeviceCode();
        if (r1 == null) goto L10;
        String r6 = r0.getDeviceID(r1.getMac());
        if (r6 == null) goto L12;
        Iterator<T> r15 = workoutToSportData(r14).iterator();
    L8:
        if (r15.hasNext() == false) goto L13;
        UploadSportDataHYKY.SportData r10 = (UploadSportDataHYKY.SportData) r15.next();
        NetWorkUtils r2 = NetWorkUtils.INSTANCE;
        HykyManager.Companion r3 = HykyManager.Companion;
        UploadSportDataHYKY.BodyData r4 = new UploadSportDataHYKY.BodyData(r3.getInstance().getMAppUser().noAreaCodePhone(), 0, r6, r1.getCmei(), r1.getSn(), r1.getMac(), r10, 2, null);
        String r5 = HykyAPI.INSTANCE.getBASE_URL_HYKY() + UploadSportDataHYKY.URL;
        final O1XIiIO r7 = null;
        AndroidNetworking.post(r5).addHeaders("Authorization", r3.getInstance().getToken().getTokenType() + " " + r3.getInstance().getToken().getAccessToken()).addApplicationJsonBody(r4).setTag(r5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(HykyResponse.class, new Type[]{Object.class}), new HykyUpload$sportDataUpload$lambda$0$0$0$$inlined$postHyky$default$1(r7));
        goto L8
    L13:
        return;
    L12:
        return;
    }
}
