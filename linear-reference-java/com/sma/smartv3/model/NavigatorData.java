package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.entity.Workout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nNavigatorData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorData.kt\ncom/sma/smartv3/model/NavigatorData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1669#2,8:214\n1669#2,8:222\n1788#2,4:231\n1788#2,4:235\n1788#2,4:239\n1788#2,4:243\n1788#2,4:247\n1788#2,4:251\n1788#2,4:255\n1788#2,4:259\n1788#2,4:263\n1#3:230\n*S KotlinDebug\n*F\n+ 1 NavigatorData.kt\ncom/sma/smartv3/model/NavigatorData\n*L\n87#1:214,8\n88#1:222,8\n153#1:231,4\n154#1:235,4\n155#1:239,4\n165#1:243,4\n171#1:247,4\n177#1:251,4\n190#1:255,4\n195#1:259,4\n200#1:263,4\n*E\n"})
public final class NavigatorData {

    @aa1
    public static final NavigatorData INSTANCE = null;

    /* JADX INFO: renamed from: com.sma.smartv3.model.NavigatorData$getNavigatorData$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.model.NavigatorData", f = "NavigatorData.kt", i = {0}, l = {69}, m = "getNavigatorData", n = {"mList"}, s = {"L$0"}, v = 1)
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ NavigatorData this$0;

        public AnonymousClass1(NavigatorData r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @tb1
        public final Object invokeSuspend(@aa1 Object r2) {
            this.result = r2;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getNavigatorData(this);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.model.NavigatorData$getNavigatorData$2, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.model.NavigatorData$getNavigatorData$2", f = "NavigatorData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<NavigatorItem> $mList;
        int label;

        public AnonymousClass2(List<NavigatorItem> r1, Continuation<? super AnonymousClass2> r2) {
            this.$mList = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new AnonymousClass2(this.$mList, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass2) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r9) {
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r9);
            WorkoutDao r0 = MyDb.INSTANCE.getMDatabase().workoutDao();
            NavigatorData r1 = NavigatorData.INSTANCE;
            long r2 = NavigatorData.getTimestamps$default(r1, -30, 0, 0, 6, null);
            NavigatorData.access$packageData(r1, r2, r0.getNavigatorListModeDESC(r2, System.currentTimeMillis(), 9), r0.getNavigatorListByMode(9), this.$mList);
            NavigatorData.access$packageData(r1, r2, r0.getNavigatorListModeDESC(r2, System.currentTimeMillis(), 10), r0.getNavigatorListByMode(10), this.$mList);
            NavigatorData.access$packageData(r1, r2, r0.getNavigatorListModeDESC(r2, System.currentTimeMillis(), 163), r0.getNavigatorListByMode(163), this.$mList);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    static {
        INSTANCE = new NavigatorData();
    }

    private NavigatorData() {
    }

    public static final /* synthetic */ void access$packageData(NavigatorData r0, long r1, List r3, List r4, List r5) {
        r0.packageData(r1, r3, r4, r5);
    }

    public static /* synthetic */ long getTimestamps$default(NavigatorData r0, int r1, int r2, long r3, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = 0;
    L9:
        return r0.getTimestamps(r1, r2, r3);
    }

    private final void packageData(long r24, List<Workout> r26, List<Workout> r27, List<NavigatorItem> r28) {
        if (r27.isEmpty() == false) goto L5;
        return;
    L5:
        HashSet r1 = new HashSet();
        ArrayList r2 = new ArrayList();
        Iterator<T> r0 = r26.iterator();
    L7:
        if (r0.hasNext() == false) goto L11;
        Object r3 = r0.next();
        if (r1.add(Long.valueOf(((Workout) r3).getMStart())) == false) goto L7;
        r2.add(r3);
        goto L7
    L11:
        HashSet r4 = new HashSet();
        ArrayList r5 = new ArrayList();
        Iterator<T> r6 = r27.iterator();
    L13:
        if (r6.hasNext() == false) goto L17;
        Object r7 = r6.next();
        if (r4.add(Long.valueOf(((Workout) r7).getMStart())) == false) goto L13;
        r5.add(r7);
        goto L13
    L17:
        Workout r9 = (Workout) CollectionsKt___CollectionsKt.IIII0iI(r5);
        LinkedHashMap r8 = new LinkedHashMap();
        int r10 = 1;
    L19:
        if (r10 >= 32) goto L21;
        r8.put(Long.valueOf(r24 + (((long) (86400 * r10)) * 1000)), new ArrayList());
        r10 = r10 + 1;
        goto L19
    L21:
        Iterator r11 = r2.iterator();
    L23:
        if (r11.hasNext() == false) goto L30;
        Workout r12 = (Workout) r11.next();
        Iterator r13 = r8.entrySet().iterator();
    L26:
        if (r13.hasNext() == false) goto L23;
        Map.Entry r14 = (Map.Entry) r13.next();
        long r15 = ((Number) r14.getKey()).longValue();
        ArrayList r16 = (ArrayList) r14.getValue();
        if (r12.getMEnd() >= r15) goto L26;
        r16.add(r12);
        goto L23
    L30:
        ArrayList r17 = new ArrayList();
        ArrayList r18 = new ArrayList();
        ArrayList r19 = new ArrayList();
        ArrayList r20 = new ArrayList();
        ArrayList r21 = new ArrayList();
        Iterator r22 = r8.entrySet().iterator();
        float r23 = 0.0f;
    L31:
        int r25 = 0;
        if (r22.hasNext() == false) goto L103;
        ArrayList r110 = (ArrayList) ((Map.Entry) r22.next()).getValue();
        if (r110.isEmpty() == true) goto L101;
        Iterator r111 = r110.iterator();
        int r112 = 0;
    L37:
        if (r111.hasNext() == false) goto L39;
        r112 = r112 + ((Workout) r111.next()).getMNavigatorTargetTime();
        goto L37
    L39:
        if (r112 == 0) goto L45;
        Iterator r113 = r110.iterator();
        int r114 = 0;
    L42:
        if (r113.hasNext() == false) goto L44;
        r114 = r114 + ((Workout) r113.next()).getMNavigatorTargetTime();
        goto L42
    L44:
        r18.add(new Entry(r23, r114 / r110.size()));
    L45:
        Iterator r115 = r110.iterator();
        int r116 = 0;
    L47:
        if (r115.hasNext() == false) goto L49;
        r116 = r116 + ((Workout) r115.next()).getMNavigatorActualTime();
        goto L47
    L49:
        if (r116 == 0) goto L56;
        Iterator r117 = r110.iterator();
        int r118 = 0;
    L52:
        if (r117.hasNext() == false) goto L54;
        r118 = r118 + ((Workout) r117.next()).getMNavigatorActualTime();
        goto L52
    L54:
        r19.add(new Entry(r23, r118 / r110.size()));
    L56:
        if (r9.getMMode() != 10) goto L81;
        Iterator r119 = r110.iterator();
        double r120 = 0.0d;
    L59:
        if (r119.hasNext() == false) goto L62;
        r120 = r120 + ((double) ((Workout) r119.next()).getMNavigatorTargetSpeedV2());
        goto L59
    L62:
        if (r120 != 0.0d) goto L64;
        ArrayList r121 = r2;
    L69:
        Iterator r29 = r110.iterator();
        double r122 = 0.0d;
    L71:
        if (r29.hasNext() == false) goto L73;
        r122 = r122 + ((double) ((Workout) r29.next()).getMNavigatorTargetSpeedV2());
        r22 = r22;
        r29 = r29;
        goto L71
    L73:
        Iterator r30 = r22;
        if (r122 == 0.0d) goto L102;
        Iterator r31 = r110.iterator();
        double r123 = 0.0d;
    L78:
        if (r31.hasNext() == false) goto L80;
        r123 = r123 + ((double) ((Workout) r31.next()).getMNavigatorTargetSpeedV2());
        goto L78
    L80:
        r21.add(new Entry(r23, (float) (r123 / ((double) r110.size()))));
    L102:
        r23 = r23 + 1.0f;
        r22 = r30;
        r2 = r121;
        goto L31
    L64:
        Iterator r32 = r110.iterator();
        double r124 = 0.0d;
    L66:
        if (r32.hasNext() == false) goto L68;
        r124 = r124 + ((double) ((Workout) r32.next()).getMNavigatorTargetSpeedV2());
        r2 = r2;
        goto L66
    L68:
        r121 = r2;
        r20.add(new Entry(r23, (float) (r124 / ((double) r110.size()))));
        goto L69
    L81:
        r30 = r22;
        r121 = r2;
        Iterator r33 = r110.iterator();
        int r34 = 0;
    L83:
        if (r33.hasNext() == false) goto L85;
        r34 = r34 + ((Workout) r33.next()).getMNavigatorTargetPace();
        goto L83
    L85:
        if (r34 == 0) goto L91;
        Iterator r35 = r110.iterator();
        int r36 = 0;
    L88:
        if (r35.hasNext() == false) goto L90;
        r36 = r36 + ((Workout) r35.next()).getMNavigatorTargetPace();
        goto L88
    L90:
        r20.add(new Entry(r23, r36 / r110.size()));
    L91:
        Iterator r37 = r110.iterator();
        int r38 = 0;
    L93:
        if (r37.hasNext() == false) goto L95;
        r38 = r38 + ((Workout) r37.next()).getMNavigatorActualPace();
        goto L93
    L95:
        if (r38 == 0) goto L102;
        Iterator r39 = r110.iterator();
    L98:
        if (r39.hasNext() == false) goto L100;
        r25 = r25 + ((Workout) r39.next()).getMNavigatorActualPace();
        goto L98
    L100:
        r21.add(new Entry(r23, r25 / r110.size()));
        goto L102
    L101:
        r30 = r22;
        r121 = r2;
        goto L102
    L103:
        ArrayList r125 = r2;
        if (r125.isEmpty() == false) goto L106;
        int r40 = 0;
    L117:
        if (r125.isEmpty() == false) goto L119;
        int r126 = 0;
    L131:
        if (r125.isEmpty() == false) goto L133;
        int r127 = 0;
    L144:
        r17.add(new NavigatorMoonItem(r40, r126, r127, r18, r19));
        if (r125.isEmpty() == false) goto L147;
        int r41 = 0;
    L165:
        if (r125.isEmpty() == false) goto L167;
        int r128 = 0;
    L186:
        if (r125.isEmpty() == false) goto L188;
        int r129 = 0;
    L206:
        r17.add(new NavigatorMoonItem(r41, r128, r129, r20, r21));
        int r42 = r9.getMMode();
        if (r5.isEmpty() == false) goto L209;
        int r43 = 0;
    L230:
        if (r5.isEmpty() == false) goto L232;
        int r44 = 0;
    L253:
        if (r5.isEmpty() == true) goto L274;
        Iterator r45 = r5.iterator();
    L257:
        if (r45.hasNext() == false) goto L274;
        Workout r46 = (Workout) r45.next();
        if (r46.getMNavigatorStatusTime() != 0) goto L263;
        if (r46.getMNavigatorTargetTime() == 0) goto L263;
    L271:
        r25 = r25 + 1;
        if (r25 >= 0) goto L257;
        CollectionsKt__CollectionsKt.OO();
    L263:
        if (r46.getMNavigatorStatusPace() != 0) goto L267;
        if (r46.getMNavigatorTargetPace() != 0) goto L271;
    L267:
        if (r46.getMNavigatorStatusSpeed() != 0) goto L257;
        if (r46.getMNavigatorTargetSpeedV2() != 0.0f) goto L271;
    L274:
        r28.add(new NavigatorItem(r42, r43, r44, r25, r9, r17));
        return;
    L232:
        Iterator r47 = r5.iterator();
        int r48 = 0;
    L234:
        if (r47.hasNext() == false) goto L251;
        Workout r49 = (Workout) r47.next();
        if (r49.getMNavigatorStatusTime() != 2) goto L240;
        if (r49.getMNavigatorTargetTime() == 0) goto L240;
    L248:
        r48 = r48 + 1;
        if (r48 >= 0) goto L234;
        CollectionsKt__CollectionsKt.OO();
    L240:
        if (r49.getMNavigatorStatusPace() != 2) goto L244;
        if (r49.getMNavigatorTargetPace() != 0) goto L248;
    L244:
        if (r49.getMNavigatorStatusSpeed() != 2) goto L234;
        if (r49.getMNavigatorTargetSpeedV2() != 0.0f) goto L248;
    L251:
        r44 = r48;
        goto L253
    L209:
        Iterator r50 = r5.iterator();
        int r51 = 0;
    L211:
        if (r50.hasNext() == false) goto L228;
        Workout r52 = (Workout) r50.next();
        if (r52.getMNavigatorStatusTime() != 1) goto L217;
        if (r52.getMNavigatorTargetTime() == 0) goto L217;
    L225:
        r51 = r51 + 1;
        if (r51 >= 0) goto L211;
        CollectionsKt__CollectionsKt.OO();
    L217:
        if (r52.getMNavigatorStatusPace() != 1) goto L221;
        if (r52.getMNavigatorTargetPace() != 0) goto L225;
    L221:
        if (r52.getMNavigatorStatusSpeed() != 1) goto L211;
        if (r52.getMNavigatorTargetSpeedV2() != 0.0f) goto L225;
    L228:
        r43 = r51;
        goto L230
    L188:
        Iterator r53 = r125.iterator();
        int r54 = 0;
    L190:
        if (r53.hasNext() == false) goto L205;
        Workout r55 = (Workout) r53.next();
        if (r9.getMMode() == 10) goto L194;
        if (r55.getMNavigatorStatusPace() != 0) goto L190;
        if (r55.getMNavigatorTargetPace() == 0) goto L190;
    L202:
        r54 = r54 + 1;
        if (r54 >= 0) goto L190;
        CollectionsKt__CollectionsKt.OO();
        goto L190
    L194:
        if (r55.getMNavigatorStatusSpeed() != 0) goto L190;
        if (r55.getMNavigatorTargetSpeedV2() != 0.0f) goto L202;
    L205:
        r129 = r54;
        goto L206
    L167:
        Iterator r56 = r125.iterator();
        int r57 = 0;
    L169:
        if (r56.hasNext() == false) goto L184;
        Workout r58 = (Workout) r56.next();
        if (r9.getMMode() == 10) goto L173;
        if (r58.getMNavigatorStatusPace() != 2) goto L169;
        if (r58.getMNavigatorTargetPace() == 0) goto L169;
    L181:
        r57 = r57 + 1;
        if (r57 >= 0) goto L169;
        CollectionsKt__CollectionsKt.OO();
        goto L169
    L173:
        if (r58.getMNavigatorStatusSpeed() != 2) goto L169;
        if (r58.getMNavigatorTargetSpeedV2() != 0.0f) goto L181;
    L184:
        r128 = r57;
        goto L186
    L147:
        Iterator r59 = r125.iterator();
        r41 = 0;
    L149:
        if (r59.hasNext() == false) goto L165;
        Workout r60 = (Workout) r59.next();
        if (r9.getMMode() == 10) goto L153;
        if (r60.getMNavigatorStatusPace() != 1) goto L149;
        if (r60.getMNavigatorTargetPace() == 0) goto L149;
    L161:
        r41 = r41 + 1;
        if (r41 >= 0) goto L149;
        CollectionsKt__CollectionsKt.OO();
        goto L149
    L153:
        if (r60.getMNavigatorStatusSpeed() != 1) goto L149;
        if (r60.getMNavigatorTargetSpeedV2() != 0.0f) goto L161;
    L133:
        Iterator r61 = r125.iterator();
        int r62 = 0;
    L135:
        if (r61.hasNext() == false) goto L143;
        Workout r63 = (Workout) r61.next();
        if (r63.getMNavigatorStatusTime() != 0) goto L135;
        if (r63.getMNavigatorTargetTime() == 0) goto L135;
        r62 = r62 + 1;
        if (r62 >= 0) goto L135;
        CollectionsKt__CollectionsKt.OO();
        goto L135
    L143:
        r127 = r62;
        goto L144
    L119:
        Iterator r64 = r125.iterator();
        int r65 = 0;
    L121:
        if (r64.hasNext() == false) goto L129;
        Workout r66 = (Workout) r64.next();
        if (r66.getMNavigatorStatusTime() != 2) goto L121;
        if (r66.getMNavigatorTargetTime() == 0) goto L121;
        r65 = r65 + 1;
        if (r65 >= 0) goto L121;
        CollectionsKt__CollectionsKt.OO();
        goto L121
    L129:
        r126 = r65;
        goto L131
    L106:
        Iterator r67 = r125.iterator();
        r40 = 0;
    L108:
        if (r67.hasNext() == false) goto L117;
        Workout r68 = (Workout) r67.next();
        if (r68.getMNavigatorStatusTime() != 1) goto L108;
        if (r68.getMNavigatorTargetTime() == 0) goto L108;
        r40 = r40 + 1;
        if (r40 >= 0) goto L108;
        CollectionsKt__CollectionsKt.OO();
        goto L108
    }

    @tb1
    public final Object getNavigatorData(@aa1 Continuation<? super List<NavigatorItem>> r7) {
        if ((r7 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r7;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.label = r1 - Integer.MIN_VALUE;
    L8:
        Object r8 = r0.result;
        Object r2 = pb.I0iXXO();
        int r3 = r0.label;
        if (r3 == 0) goto L15;
        if (r3 != 1) goto L14;
        List r4 = (List) r0.L$0;
        ResultKt.X1ii(r8);
        return r4;
    L14:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L15:
        ResultKt.X1ii(r8);
        ArrayList r9 = new ArrayList();
        CoroutineDispatcher r5 = IXOX0Xiii.iO();
        AnonymousClass2 r6 = new AnonymousClass2(r9, null);
        r0.L$0 = r9;
        r0.label = 1;
        if (I100X1.I0IIOi(r5, r6, r0) != r2) goto L18;
        return r2;
    L18:
        return r9;
    L7:
        r0 = new AnonymousClass1(this, r7);
        goto L8
    }

    public final long getTimestamps(int r8, int r9, long r10) {
        Calendar r0 = Calendar.getInstance();
        if (r10 == 0) goto L5;
        r0.setTimeInMillis(r10);
        r0.set(11, 23);
        r0.set(12, 59);
        r0.set(13, 59);
        r0.set(14, 0);
        r8 = r8 + 1;
    L6:
        r0.add(6, r8);
        return r0.getTimeInMillis();
    L5:
        r0.set(11, r9);
        r0.set(12, 0);
        r0.set(13, 0);
        r0.set(14, 0);
        goto L6
    }
}
