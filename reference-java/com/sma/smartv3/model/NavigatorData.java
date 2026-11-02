package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.tb1;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.entity.Workout;
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
    public static final NavigatorData INSTANCE = new NavigatorData();

    /* JADX INFO: renamed from: com.sma.smartv3.model.NavigatorData$getNavigatorData$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.model.NavigatorData", m39466f = "NavigatorData.kt", m39467i = {0}, m39468l = {69}, m39469m = "getNavigatorData", m39470n = {"mList"}, m39472s = {"L$0"}, m39473v = 1)
    public static final class C186021 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C186021(Continuation<? super C186021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @tb1
        public final Object invokeSuspend(@aa1 Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NavigatorData.this.getNavigatorData(this);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.model.NavigatorData$getNavigatorData$2 */
    @DebugMetadata(m39465c = "com.sma.smartv3.model.NavigatorData$getNavigatorData$2", m39466f = "NavigatorData.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C186032 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<NavigatorItem> $mList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C186032(List<NavigatorItem> list, Continuation<? super C186032> continuation) {
            super(2, continuation);
            this.$mList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C186032(this.$mList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C186032) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            WorkoutDao workoutDao = MyDb.INSTANCE.getMDatabase().workoutDao();
            NavigatorData navigatorData = NavigatorData.INSTANCE;
            long timestamps$default = NavigatorData.getTimestamps$default(navigatorData, -30, 0, 0L, 6, null);
            navigatorData.packageData(timestamps$default, workoutDao.getNavigatorListModeDESC(timestamps$default, System.currentTimeMillis(), 9), workoutDao.getNavigatorListByMode(9), this.$mList);
            navigatorData.packageData(timestamps$default, workoutDao.getNavigatorListModeDESC(timestamps$default, System.currentTimeMillis(), 10), workoutDao.getNavigatorListByMode(10), this.$mList);
            navigatorData.packageData(timestamps$default, workoutDao.getNavigatorListModeDESC(timestamps$default, System.currentTimeMillis(), 163), workoutDao.getNavigatorListByMode(163), this.$mList);
            return Unit.OXO1;
        }
    }

    private NavigatorData() {
    }

    public static /* synthetic */ long getTimestamps$default(NavigatorData navigatorData, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            j = 0;
        }
        return navigatorData.getTimestamps(i, i2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:348:0x0440 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x040f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x03fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x03c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x03b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0383 A[SYNTHETIC] */
    public final void packageData(long j, List<Workout> list, List<Workout> list2, List<NavigatorItem> list3) {
        int mNavigatorActualPace;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Iterator it;
        ArrayList arrayList;
        if (list2.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList<Workout> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(Long.valueOf(((Workout) obj).getMStart()))) {
                arrayList2.add(obj);
            }
        }
        HashSet hashSet2 = new HashSet();
        ArrayList<Workout> arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (hashSet2.add(Long.valueOf(((Workout) obj2).getMStart()))) {
                arrayList3.add(obj2);
            }
        }
        Workout workout = (Workout) CollectionsKt___CollectionsKt.IIII0iI(arrayList3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i9 = 1; i9 < 32; i9++) {
            linkedHashMap.put(Long.valueOf(j + (((long) (86400 * i9)) * 1000)), new ArrayList());
        }
        for (Workout workout2 : arrayList2) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                ArrayList arrayList4 = (ArrayList) entry.getValue();
                if (workout2.getMEnd() < jLongValue) {
                    arrayList4.add(workout2);
                    break;
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        Iterator it2 = linkedHashMap.entrySet().iterator();
        float f = 0.0f;
        while (true) {
            mNavigatorActualPace = 0;
            if (!it2.hasNext()) {
                break;
            }
            ArrayList arrayList10 = (ArrayList) ((Map.Entry) it2.next()).getValue();
            if (arrayList10.isEmpty()) {
                it = it2;
                arrayList = arrayList2;
            } else {
                Iterator it3 = arrayList10.iterator();
                int mNavigatorTargetTime = 0;
                while (it3.hasNext()) {
                    mNavigatorTargetTime += ((Workout) it3.next()).getMNavigatorTargetTime();
                }
                if (mNavigatorTargetTime != 0) {
                    Iterator it4 = arrayList10.iterator();
                    int mNavigatorTargetTime2 = 0;
                    while (it4.hasNext()) {
                        mNavigatorTargetTime2 += ((Workout) it4.next()).getMNavigatorTargetTime();
                    }
                    arrayList6.add(new Entry(f, mNavigatorTargetTime2 / arrayList10.size()));
                }
                Iterator it5 = arrayList10.iterator();
                int mNavigatorActualTime = 0;
                while (it5.hasNext()) {
                    mNavigatorActualTime += ((Workout) it5.next()).getMNavigatorActualTime();
                }
                if (mNavigatorActualTime != 0) {
                    Iterator it6 = arrayList10.iterator();
                    int mNavigatorActualTime2 = 0;
                    while (it6.hasNext()) {
                        mNavigatorActualTime2 += ((Workout) it6.next()).getMNavigatorActualTime();
                    }
                    arrayList7.add(new Entry(f, mNavigatorActualTime2 / arrayList10.size()));
                }
                if (workout.getMMode() == 10) {
                    Iterator it7 = arrayList10.iterator();
                    double mNavigatorTargetSpeedV2 = 0.0d;
                    while (it7.hasNext()) {
                        mNavigatorTargetSpeedV2 += (double) ((Workout) it7.next()).getMNavigatorTargetSpeedV2();
                    }
                    if (mNavigatorTargetSpeedV2 == 0.0d) {
                        arrayList = arrayList2;
                    } else {
                        Iterator it8 = arrayList10.iterator();
                        double mNavigatorTargetSpeedV3 = 0.0d;
                        while (it8.hasNext()) {
                            mNavigatorTargetSpeedV3 += (double) ((Workout) it8.next()).getMNavigatorTargetSpeedV2();
                            arrayList2 = arrayList2;
                        }
                        arrayList = arrayList2;
                        arrayList8.add(new Entry(f, (float) (mNavigatorTargetSpeedV3 / ((double) arrayList10.size()))));
                    }
                    double mNavigatorTargetSpeedV4 = 0.0d;
                    for (Iterator it9 = arrayList10.iterator(); it9.hasNext(); it9 = it9) {
                        mNavigatorTargetSpeedV4 += (double) ((Workout) it9.next()).getMNavigatorTargetSpeedV2();
                        it2 = it2;
                    }
                    it = it2;
                    if (mNavigatorTargetSpeedV4 != 0.0d) {
                        Iterator it10 = arrayList10.iterator();
                        double mNavigatorTargetSpeedV5 = 0.0d;
                        while (it10.hasNext()) {
                            mNavigatorTargetSpeedV5 += (double) ((Workout) it10.next()).getMNavigatorTargetSpeedV2();
                        }
                        arrayList9.add(new Entry(f, (float) (mNavigatorTargetSpeedV5 / ((double) arrayList10.size()))));
                    }
                } else {
                    it = it2;
                    arrayList = arrayList2;
                    Iterator it11 = arrayList10.iterator();
                    int mNavigatorTargetPace = 0;
                    while (it11.hasNext()) {
                        mNavigatorTargetPace += ((Workout) it11.next()).getMNavigatorTargetPace();
                    }
                    if (mNavigatorTargetPace != 0) {
                        Iterator it12 = arrayList10.iterator();
                        int mNavigatorTargetPace2 = 0;
                        while (it12.hasNext()) {
                            mNavigatorTargetPace2 += ((Workout) it12.next()).getMNavigatorTargetPace();
                        }
                        arrayList8.add(new Entry(f, mNavigatorTargetPace2 / arrayList10.size()));
                    }
                    Iterator it13 = arrayList10.iterator();
                    int mNavigatorActualPace2 = 0;
                    while (it13.hasNext()) {
                        mNavigatorActualPace2 += ((Workout) it13.next()).getMNavigatorActualPace();
                    }
                    if (mNavigatorActualPace2 != 0) {
                        Iterator it14 = arrayList10.iterator();
                        while (it14.hasNext()) {
                            mNavigatorActualPace += ((Workout) it14.next()).getMNavigatorActualPace();
                        }
                        arrayList9.add(new Entry(f, mNavigatorActualPace / arrayList10.size()));
                    }
                }
            }
            f += 1.0f;
            it2 = it;
            arrayList2 = arrayList;
        }
        ArrayList<Workout> arrayList11 = arrayList2;
        if (arrayList11.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (Workout workout3 : arrayList11) {
                if (workout3.getMNavigatorStatusTime() == 1 && workout3.getMNavigatorTargetTime() != 0 && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.m39400OO();
                }
            }
        }
        if (arrayList11.isEmpty()) {
            i2 = 0;
        } else {
            int i10 = 0;
            for (Workout workout4 : arrayList11) {
                if (workout4.getMNavigatorStatusTime() == 2 && workout4.getMNavigatorTargetTime() != 0 && (i10 = i10 + 1) < 0) {
                    CollectionsKt__CollectionsKt.m39400OO();
                }
            }
            i2 = i10;
        }
        if (arrayList11.isEmpty()) {
            i3 = 0;
        } else {
            int i11 = 0;
            for (Workout workout5 : arrayList11) {
                if (workout5.getMNavigatorStatusTime() == 0 && workout5.getMNavigatorTargetTime() != 0 && (i11 = i11 + 1) < 0) {
                    CollectionsKt__CollectionsKt.m39400OO();
                }
            }
            i3 = i11;
        }
        arrayList5.add(new NavigatorMoonItem(i, i2, i3, arrayList6, arrayList7));
        if (arrayList11.isEmpty()) {
            i4 = 0;
        } else {
            i4 = 0;
            for (Workout workout6 : arrayList11) {
                if (workout.getMMode() == 10) {
                    if (workout6.getMNavigatorStatusSpeed() == 1 && workout6.getMNavigatorTargetSpeedV2() != 0.0f) {
                        i4++;
                        if (i4 < 0) {
                            CollectionsKt__CollectionsKt.m39400OO();
                        }
                    }
                } else if (workout6.getMNavigatorStatusPace() == 1 && workout6.getMNavigatorTargetPace() != 0) {
                    i4++;
                    if (i4 < 0) {
                        CollectionsKt__CollectionsKt.m39400OO();
                    }
                }
            }
        }
        if (arrayList11.isEmpty()) {
            i5 = 0;
        } else {
            int i12 = 0;
            for (Workout workout7 : arrayList11) {
                if (workout.getMMode() == 10) {
                    if (workout7.getMNavigatorStatusSpeed() == 2 && workout7.getMNavigatorTargetSpeedV2() != 0.0f) {
                        i12++;
                        if (i12 < 0) {
                            CollectionsKt__CollectionsKt.m39400OO();
                        }
                    }
                } else if (workout7.getMNavigatorStatusPace() == 2 && workout7.getMNavigatorTargetPace() != 0) {
                    i12++;
                    if (i12 < 0) {
                        CollectionsKt__CollectionsKt.m39400OO();
                    }
                }
            }
            i5 = i12;
        }
        if (arrayList11.isEmpty()) {
            i6 = 0;
        } else {
            int i13 = 0;
            for (Workout workout8 : arrayList11) {
                if (workout.getMMode() == 10) {
                    if (workout8.getMNavigatorStatusSpeed() == 0 && workout8.getMNavigatorTargetSpeedV2() != 0.0f) {
                        i13++;
                        if (i13 < 0) {
                            CollectionsKt__CollectionsKt.m39400OO();
                        }
                    }
                } else if (workout8.getMNavigatorStatusPace() == 0 && workout8.getMNavigatorTargetPace() != 0) {
                    i13++;
                    if (i13 < 0) {
                        CollectionsKt__CollectionsKt.m39400OO();
                    }
                }
            }
            i6 = i13;
        }
        arrayList5.add(new NavigatorMoonItem(i4, i5, i6, arrayList8, arrayList9));
        int mMode = workout.getMMode();
        if (arrayList3.isEmpty()) {
            i7 = 0;
        } else {
            int i14 = 0;
            for (Workout workout9 : arrayList3) {
                if ((workout9.getMNavigatorStatusTime() == 1 && workout9.getMNavigatorTargetTime() != 0) || ((workout9.getMNavigatorStatusPace() == 1 && workout9.getMNavigatorTargetPace() != 0) || (workout9.getMNavigatorStatusSpeed() == 1 && workout9.getMNavigatorTargetSpeedV2() != 0.0f))) {
                    i14++;
                    if (i14 < 0) {
                        CollectionsKt__CollectionsKt.m39400OO();
                    }
                }
            }
            i7 = i14;
        }
        if (arrayList3.isEmpty()) {
            i8 = 0;
        } else {
            int i15 = 0;
            for (Workout workout10 : arrayList3) {
                if ((workout10.getMNavigatorStatusTime() == 2 && workout10.getMNavigatorTargetTime() != 0) || ((workout10.getMNavigatorStatusPace() == 2 && workout10.getMNavigatorTargetPace() != 0) || (workout10.getMNavigatorStatusSpeed() == 2 && workout10.getMNavigatorTargetSpeedV2() != 0.0f))) {
                    i15++;
                    if (i15 < 0) {
                        CollectionsKt__CollectionsKt.m39400OO();
                    }
                }
            }
            i8 = i15;
        }
        if (!arrayList3.isEmpty()) {
            for (Workout workout11 : arrayList3) {
                if ((workout11.getMNavigatorStatusTime() == 0 && workout11.getMNavigatorTargetTime() != 0) || ((workout11.getMNavigatorStatusPace() == 0 && workout11.getMNavigatorTargetPace() != 0) || (workout11.getMNavigatorStatusSpeed() == 0 && workout11.getMNavigatorTargetSpeedV2() != 0.0f))) {
                    mNavigatorActualPace++;
                    if (mNavigatorActualPace < 0) {
                        CollectionsKt__CollectionsKt.m39400OO();
                    }
                }
            }
        }
        list3.add(new NavigatorItem(mMode, i7, i8, mNavigatorActualPace, workout, arrayList5));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @tb1
    public final Object getNavigatorData(@aa1 Continuation<? super List<NavigatorItem>> continuation) {
        C186021 c186021;
        if (continuation instanceof C186021) {
            c186021 = (C186021) continuation;
            int i = c186021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c186021.label = i - Integer.MIN_VALUE;
            } else {
                c186021 = new C186021(continuation);
            }
        } else {
            c186021 = new C186021(continuation);
        }
        Object obj = c186021.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = c186021.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) c186021.L$0;
            ResultKt.X1ii(obj);
            return list;
        }
        ResultKt.X1ii(obj);
        ArrayList arrayList = new ArrayList();
        CoroutineDispatcher coroutineDispatcherM712iO = IXOX0Xiii.m712iO();
        C186032 c186032 = new C186032(arrayList, null);
        c186021.L$0 = arrayList;
        c186021.label = 1;
        return I100X1.I0IIOi(coroutineDispatcherM712iO, c186032, c186021) == objI0iXXO ? objI0iXXO : arrayList;
    }

    public final long getTimestamps(int i, int i2, long j) {
        Calendar calendar = Calendar.getInstance();
        if (j != 0) {
            calendar.setTimeInMillis(j);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
            i++;
        } else {
            calendar.set(11, i2);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
        }
        calendar.add(6, i);
        return calendar.getTimeInMillis();
    }
}
