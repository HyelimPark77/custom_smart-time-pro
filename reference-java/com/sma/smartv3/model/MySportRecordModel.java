package com.sma.smartv3.model;

import com.android.mltcode.paycertification.utils.Constant;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.Utils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.google.gson.Gson;
import com.sifli.siflidfu.constants.Timeout;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nMySportRecordModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MySportRecordModel.kt\ncom/sma/smartv3/model/MySportRecordModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,416:1\n774#2:417\n865#2,2:418\n2423#2,14:420\n1999#2,14:434\n1999#2,14:448\n1999#2,14:462\n1999#2,14:476\n1999#2,14:490\n1999#2,14:504\n*S KotlinDebug\n*F\n+ 1 MySportRecordModel.kt\ncom/sma/smartv3/model/MySportRecordModel\n*L\n120#1:417\n120#1:418,2\n121#1:420,14\n150#1:434,14\n160#1:448,14\n228#1:462,14\n240#1:476,14\n309#1:490,14\n320#1:504,14\n*E\n"})
public final class MySportRecordModel {

    @aa1
    public static final MySportRecordModel INSTANCE = new MySportRecordModel();

    /* JADX INFO: renamed from: com.sma.smartv3.model.MySportRecordModel$getMySportRecordList$2 */
    @DebugMetadata(m39465c = "com.sma.smartv3.model.MySportRecordModel$getMySportRecordList$2", m39466f = "MySportRecordModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nMySportRecordModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MySportRecordModel.kt\ncom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,416:1\n19#2:417\n15#2:418\n1999#3,14:419\n1999#3,14:433\n1999#3,14:447\n1999#3,14:461\n*S KotlinDebug\n*F\n+ 1 MySportRecordModel.kt\ncom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2\n*L\n26#1:417\n26#1:418\n42#1:419,14\n55#1:433,14\n68#1:447,14\n81#1:461,14\n*E\n"})
    public static final class C186012 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super ArrayList<MySportRecordList>>, Object> {
        final /* synthetic */ List<Workout> $list;
        final /* synthetic */ int $mSportMode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C186012(int i, List<Workout> list, Continuation<? super C186012> continuation) {
            super(2, continuation);
            this.$mSportMode = i;
            this.$list = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C186012(this.$mSportMode, this.$list, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super ArrayList<MySportRecordList>> continuation) {
            return ((C186012) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            String strXXO;
            Object next2;
            String strXXO2;
            Object next3;
            String strXXO3;
            String strXXO4;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            ArrayList arrayList = new ArrayList();
            SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
            Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
            Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
            if (objFromJson != null) {
                appUser = objFromJson;
            }
            AppUser appUser2 = (AppUser) appUser;
            int unit = appUser2.getUnit();
            int i = this.$mSportMode;
            if (i == 10) {
                MySportRecordModel.INSTANCE.getSportRecordCycling(this.$list, arrayList, appUser2.getUnit());
                return arrayList;
            }
            if (i == 11) {
                MySportRecordModel.INSTANCE.getSportRecordSwimming(this.$list, arrayList, appUser2.getUnit());
                return arrayList;
            }
            if (i != 13) {
                MySportRecordModel.INSTANCE.getSportRecordRunning(this.$list, arrayList, appUser2.getUnit());
                return arrayList;
            }
            Iterator<T> it = this.$list.iterator();
            Object next4 = null;
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int mMaxAltitude = ((Workout) next).getMMaxAltitude();
                    do {
                        Object next5 = it.next();
                        int mMaxAltitude2 = ((Workout) next5).getMMaxAltitude();
                        if (mMaxAltitude < mMaxAltitude2) {
                            next = next5;
                            mMaxAltitude = mMaxAltitude2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            Workout workout = (Workout) next;
            String strXXO5 = UtilsKt.XXO(R.string.max_altitude);
            if (workout != null) {
                strXXO = cp5.iIXi1iiXI(workout.getMMaxAltitude(), unit) + UtilsKt.XXO(MySportRecordModel.INSTANCE.getMiDistanceUnit(unit));
            } else {
                strXXO = UtilsKt.XXO(R.string.data_none);
            }
            arrayList.add(new MySportRecordList(R.drawable.sport_record_icon_max_altitude, strXXO5, workout != null ? workout.getMId() : -1, 0, strXXO, workout != null ? workout.getMStart() : 0L, 0, 72, null));
            Iterator<T> it2 = this.$list.iterator();
            if (it2.hasNext()) {
                next2 = it2.next();
                if (it2.hasNext()) {
                    int mMinAltitude = ((Workout) next2).getMMinAltitude();
                    do {
                        Object next6 = it2.next();
                        int mMinAltitude2 = ((Workout) next6).getMMinAltitude();
                        if (mMinAltitude < mMinAltitude2) {
                            next2 = next6;
                            mMinAltitude = mMinAltitude2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next2 = null;
            }
            Workout workout2 = (Workout) next2;
            String strXXO6 = UtilsKt.XXO(R.string.min_altitude);
            if (workout2 != null) {
                strXXO2 = cp5.iIXi1iiXI(workout2.getMMinAltitude(), unit) + UtilsKt.XXO(MySportRecordModel.INSTANCE.getMiDistanceUnit(unit));
            } else {
                strXXO2 = UtilsKt.XXO(R.string.data_none);
            }
            arrayList.add(new MySportRecordList(R.drawable.sport_record_icon_min_altitude, strXXO6, workout2 != null ? workout2.getMId() : -1, 0, strXXO2, workout2 != null ? workout2.getMStart() : 0L, 0, 72, null));
            Iterator<T> it3 = this.$list.iterator();
            if (it3.hasNext()) {
                next3 = it3.next();
                if (it3.hasNext()) {
                    int mAscendAltitude = ((Workout) next3).getMAscendAltitude();
                    do {
                        Object next7 = it3.next();
                        int mAscendAltitude2 = ((Workout) next7).getMAscendAltitude();
                        if (mAscendAltitude < mAscendAltitude2) {
                            next3 = next7;
                            mAscendAltitude = mAscendAltitude2;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next3 = null;
            }
            Workout workout3 = (Workout) next3;
            String strXXO7 = UtilsKt.XXO(R.string.sport_max_cum_increase);
            if (workout3 != null) {
                strXXO3 = cp5.iIXi1iiXI(workout3.getMAscendAltitude(), unit) + UtilsKt.XXO(MySportRecordModel.INSTANCE.getMiDistanceUnit(unit));
            } else {
                strXXO3 = UtilsKt.XXO(R.string.data_none);
            }
            arrayList.add(new MySportRecordList(R.drawable.sport_record_icon_rise_altitude, strXXO7, workout3 != null ? workout3.getMId() : -1, 0, strXXO3, workout3 != null ? workout3.getMStart() : 0L, 0, 72, null));
            Iterator<T> it4 = this.$list.iterator();
            if (it4.hasNext()) {
                next4 = it4.next();
                if (it4.hasNext()) {
                    int mDescendAltitude = ((Workout) next4).getMDescendAltitude();
                    do {
                        Object next8 = it4.next();
                        int mDescendAltitude2 = ((Workout) next8).getMDescendAltitude();
                        if (mDescendAltitude < mDescendAltitude2) {
                            next4 = next8;
                            mDescendAltitude = mDescendAltitude2;
                        }
                    } while (it4.hasNext());
                }
            }
            Workout workout4 = (Workout) next4;
            String strXXO8 = UtilsKt.XXO(R.string.sport_min_cum_decrease);
            if (workout4 != null) {
                strXXO4 = cp5.iIXi1iiXI(workout4.getMDescendAltitude(), unit) + UtilsKt.XXO(MySportRecordModel.INSTANCE.getMiDistanceUnit(unit));
            } else {
                strXXO4 = UtilsKt.XXO(R.string.data_none);
            }
            Boxing.OXO1(arrayList.add(new MySportRecordList(R.drawable.sport_record_icon_decline_altitude, strXXO8, workout4 != null ? workout4.getMId() : -1, 0, strXXO4, workout4 != null ? workout4.getMStart() : 0L, 0, 72, null)));
            return arrayList;
        }
    }

    private MySportRecordModel() {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    private final Triple<Integer, Long, Integer> getItemTime(int i, int i2, int i3, List<Workout> list) {
        int mDuration;
        long mStart;
        int mId;
        Object obj;
        if (i > i2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                Workout workout = (Workout) obj2;
                if (workout.getMDistance() >= i2 && workout.getMDistance() <= i3) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    Workout workout2 = (Workout) next;
                    int mDistance = workout2.getMDistance() / workout2.getMDuration();
                    do {
                        Object next2 = it.next();
                        Workout workout3 = (Workout) next2;
                        int mDistance2 = workout3.getMDistance() / workout3.getMDuration();
                        if (mDistance > mDistance2) {
                            next = next2;
                            mDistance = mDistance2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            Workout workout4 = (Workout) obj;
            if (workout4 != null) {
                mDuration = workout4.getMDuration();
                mStart = workout4.getMStart();
                mId = workout4.getMId();
            } else {
                mDuration = 0;
                mStart = 0;
                mId = -1;
            }
        } else {
            mDuration = 0;
            mStart = 0;
            mId = -1;
        }
        return new Triple<>(Integer.valueOf(mDuration), Long.valueOf(mStart), Integer.valueOf(mId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getSportRecordCycling(List<Workout> list, ArrayList<MySportRecordList> arrayList, int i) {
        Object next;
        String strXXO;
        List<Workout> list2 = list;
        Iterator<T> it = list2.iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int mDistance = ((Workout) next).getMDistance();
                do {
                    Object next3 = it.next();
                    int mDistance2 = ((Workout) next3).getMDistance();
                    if (mDistance < mDistance2) {
                        next = next3;
                        mDistance = mDistance2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Workout workout = (Workout) next;
        int mDistance3 = workout != null ? workout.getMDistance() : 0;
        String strXXO2 = UtilsKt.XXO(R.string.sport_farthest_distance);
        if (mDistance3 != 0) {
            strXXO = cp5.X1ii(mDistance3, i, false, 4, null) + UtilsKt.XXO(cp5.XX0(i));
        } else {
            strXXO = UtilsKt.XXO(R.string.data_none);
        }
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon_dis, strXXO2, workout != null ? workout.getMId() : -1, 0, strXXO, workout != null ? workout.getMStart() : 0L, 0, 72, null));
        Iterator<T> it2 = list2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                int mDuration = ((Workout) next2).getMDuration();
                do {
                    Object next4 = it2.next();
                    int mDuration2 = ((Workout) next4).getMDuration();
                    if (mDuration < mDuration2) {
                        next2 = next4;
                        mDuration = mDuration2;
                    }
                } while (it2.hasNext());
            }
        }
        Workout workout2 = (Workout) next2;
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon_time, UtilsKt.XXO(R.string.sport_max_duration), workout2 != null ? workout2.getMId() : -1, 0, getTime(workout2 != null ? workout2.getMDuration() : 0), workout2 != null ? workout2.getMStart() : 0L, 0, 72, null));
        Triple<Integer, Long, Integer> itemTime = getItemTime(mDistance3, 3000, 5000, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(i, 3000), itemTime.getThird().intValue(), 0, getTime(itemTime.getFirst().intValue()), itemTime.getSecond().longValue(), (int) cp5.O10IXXX0X(3000, i), 8, null));
        Triple<Integer, Long, Integer> itemTime2 = getItemTime(mDistance3, 5000, 10000, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(i, 5000), itemTime2.getThird().intValue(), 0, getTime(itemTime2.getFirst().intValue()), itemTime2.getSecond().longValue(), (int) cp5.O10IXXX0X(5000, i), 8, null));
        Triple<Integer, Long, Integer> itemTime3 = getItemTime(mDistance3, 10000, 40000, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(i, 10000), itemTime3.getThird().intValue(), 0, getTime(itemTime3.getFirst().intValue()), itemTime3.getSecond().longValue(), (int) cp5.O10IXXX0X(10000, i), 8, null));
        Triple<Integer, Long, Integer> itemTime4 = getItemTime(mDistance3, 40000, Constant.RESULT_CODE_90000, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(i, 40000), itemTime4.getThird().intValue(), 0, getTime(itemTime4.getFirst().intValue()), itemTime4.getSecond().longValue(), (int) cp5.O10IXXX0X(40000, i), 8, null));
        Triple<Integer, Long, Integer> itemTime5 = getItemTime(mDistance3, Constant.RESULT_CODE_90000, 130000, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(i, Constant.RESULT_CODE_90000), itemTime5.getThird().intValue(), 0, getTime(itemTime5.getFirst().intValue()), itemTime5.getSecond().longValue(), (int) cp5.O10IXXX0X(Constant.RESULT_CODE_90000, i), 8, null));
        Triple<Integer, Long, Integer> itemTime6 = getItemTime(mDistance3, 130000, Timeout.SIFLI_DFU_ERASE_TIMEOUT, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(i, 130000), itemTime6.getThird().intValue(), 0, getTime(itemTime6.getFirst().intValue()), itemTime6.getSecond().longValue(), (int) cp5.O10IXXX0X(130000, i), 8, null));
        Triple<Integer, Long, Integer> itemTime7 = getItemTime(mDistance3, Timeout.SIFLI_DFU_ERASE_TIMEOUT, 1000000, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(i, Timeout.SIFLI_DFU_ERASE_TIMEOUT), itemTime7.getThird().intValue(), 0, getTime(itemTime7.getFirst().intValue()), itemTime7.getSecond().longValue(), (int) cp5.O10IXXX0X(Timeout.SIFLI_DFU_ERASE_TIMEOUT, i), 8, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getSportRecordRunning(List<Workout> list, ArrayList<MySportRecordList> arrayList, int i) {
        Object next;
        String strXXO;
        List<Workout> list2 = list;
        Iterator<T> it = list2.iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int mDistance = ((Workout) next).getMDistance();
                do {
                    Object next3 = it.next();
                    int mDistance2 = ((Workout) next3).getMDistance();
                    if (mDistance < mDistance2) {
                        next = next3;
                        mDistance = mDistance2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Workout workout = (Workout) next;
        int mDistance3 = workout != null ? workout.getMDistance() : 0;
        String strXXO2 = UtilsKt.XXO(R.string.sport_farthest_distance);
        if (mDistance3 != 0) {
            strXXO = cp5.X1ii(mDistance3, i, false, 4, null) + UtilsKt.XXO(cp5.XX0(i));
        } else {
            strXXO = UtilsKt.XXO(R.string.data_none);
        }
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon_dis, strXXO2, workout != null ? workout.getMId() : -1, 0, strXXO, workout != null ? workout.getMStart() : 0L, 0, 72, null));
        Iterator<T> it2 = list2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                int mDuration = ((Workout) next2).getMDuration();
                do {
                    Object next4 = it2.next();
                    int mDuration2 = ((Workout) next4).getMDuration();
                    if (mDuration < mDuration2) {
                        next2 = next4;
                        mDuration = mDuration2;
                    }
                } while (it2.hasNext());
            }
        }
        Workout workout2 = (Workout) next2;
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon_time, UtilsKt.XXO(R.string.sport_max_duration), workout2 != null ? workout2.getMId() : -1, 0, getTime(workout2 != null ? workout2.getMDuration() : 0), workout2 != null ? workout2.getMStart() : 0L, 0, 72, null));
        Triple<Integer, Long, Integer> itemTime = getItemTime(mDistance3, 3000, 5000, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(i, 3000), itemTime.getThird().intValue(), 0, getTime(itemTime.getFirst().intValue()), itemTime.getSecond().longValue(), (int) cp5.O10IXXX0X(3000, i), 8, null));
        Triple<Integer, Long, Integer> itemTime2 = getItemTime(mDistance3, 5000, 10000, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(i, 5000), itemTime2.getThird().intValue(), 0, getTime(itemTime2.getFirst().intValue()), itemTime2.getSecond().longValue(), (int) cp5.O10IXXX0X(5000, i), 8, null));
        Triple<Integer, Long, Integer> itemTime3 = getItemTime(mDistance3, 10000, 30000, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(i, 10000), itemTime3.getThird().intValue(), 0, getTime(itemTime3.getFirst().intValue()), itemTime3.getSecond().longValue(), (int) cp5.O10IXXX0X(10000, i), 8, null));
        Triple<Integer, Long, Integer> itemTime4 = getItemTime(mDistance3, 30000, 60000, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(i, 30000), itemTime4.getThird().intValue(), 0, getTime(itemTime4.getFirst().intValue()), itemTime4.getSecond().longValue(), (int) cp5.O10IXXX0X(30000, i), 8, null));
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon_half_marathon, UtilsKt.XXO(R.string.fastest_half_marathon_time), 0, 0, HelpFormatter.DEFAULT_LONG_OPT_PREFIX, 0L, 0, 108, null));
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon_all_marathon, UtilsKt.XXO(R.string.fastest_full_marathon_time), 0, 0, HelpFormatter.DEFAULT_LONG_OPT_PREFIX, 0L, 0, 108, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getSportRecordSwimming(List<Workout> list, ArrayList<MySportRecordList> arrayList, int i) {
        Object next;
        String strXXO;
        List<Workout> list2 = list;
        Iterator<T> it = list2.iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int mDistance = ((Workout) next).getMDistance();
                do {
                    Object next3 = it.next();
                    int mDistance2 = ((Workout) next3).getMDistance();
                    if (mDistance < mDistance2) {
                        next = next3;
                        mDistance = mDistance2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Workout workout = (Workout) next;
        int mDistance3 = workout != null ? workout.getMDistance() : 0;
        String strXXO2 = UtilsKt.XXO(R.string.sport_farthest_distance);
        if (mDistance3 != 0) {
            strXXO = cp5.iIXi1iiXI(mDistance3, i) + UtilsKt.XXO(getMiDistanceUnit(i));
        } else {
            strXXO = UtilsKt.XXO(R.string.data_none);
        }
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon_cyc, strXXO2, workout != null ? workout.getMId() : -1, 0, strXXO, workout != null ? workout.getMStart() : 0L, 0, 72, null));
        Iterator<T> it2 = list2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                int mDuration = ((Workout) next2).getMDuration();
                do {
                    Object next4 = it2.next();
                    int mDuration2 = ((Workout) next4).getMDuration();
                    if (mDuration < mDuration2) {
                        next2 = next4;
                        mDuration = mDuration2;
                    }
                } while (it2.hasNext());
            }
        }
        Workout workout2 = (Workout) next2;
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon_time, UtilsKt.XXO(R.string.sport_max_duration), workout2 != null ? workout2.getMId() : -1, 0, getTime(workout2 != null ? workout2.getMDuration() : 0), workout2 != null ? workout2.getMStart() : 0L, 0, 72, null));
        Triple<Integer, Long, Integer> itemTime = getItemTime(mDistance3, 100, 400, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSwimmingDistanceUnit(i, 100), itemTime.getThird().intValue(), 0, getTime(itemTime.getFirst().intValue()), itemTime.getSecond().longValue(), (int) metreToRulerNumber(100, i), 8, null));
        Triple<Integer, Long, Integer> itemTime2 = getItemTime(mDistance3, 400, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSwimmingDistanceUnit(i, 400), itemTime2.getThird().intValue(), 0, getTime(itemTime2.getFirst().intValue()), itemTime2.getSecond().longValue(), (int) metreToRulerNumber(400, i), 8, null));
        Triple<Integer, Long, Integer> itemTime3 = getItemTime(mDistance3, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, 1000, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSwimmingDistanceUnit(i, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS), itemTime3.getThird().intValue(), 0, getTime(itemTime3.getFirst().intValue()), itemTime3.getSecond().longValue(), (int) metreToRulerNumber(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, i), 8, null));
        Triple<Integer, Long, Integer> itemTime4 = getItemTime(mDistance3, 1000, 1500, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSwimmingDistanceUnit(i, 1000), itemTime4.getThird().intValue(), 0, getTime(itemTime4.getFirst().intValue()), itemTime4.getSecond().longValue(), (int) metreToRulerNumber(1000, i), 8, null));
        Triple<Integer, Long, Integer> itemTime5 = getItemTime(mDistance3, 1500, 3800, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSwimmingDistanceUnit(i, 1500), itemTime5.getThird().intValue(), 0, getTime(itemTime5.getFirst().intValue()), itemTime5.getSecond().longValue(), (int) metreToRulerNumber(1500, i), 8, null));
        Triple<Integer, Long, Integer> itemTime6 = getItemTime(mDistance3, 3800, 4000, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSwimmingDistanceUnit(i, 3800), itemTime6.getThird().intValue(), 0, getTime(itemTime6.getFirst().intValue()), itemTime6.getSecond().longValue(), (int) metreToRulerNumber(3800, i), 8, null));
        Triple<Integer, Long, Integer> itemTime7 = getItemTime(mDistance3, 4000, 10000, list);
        arrayList.add(new MySportRecordList(R.drawable.sport_record_icon, getSwimmingDistanceUnit(i, 4000), itemTime7.getThird().intValue(), 0, getTime(itemTime7.getFirst().intValue()), itemTime7.getSecond().longValue(), (int) metreToRulerNumber(4000, i), 8, null));
    }

    private final String getTime(int i) {
        if (i == 0) {
            return UtilsKt.XXO(R.string.data_none);
        }
        return Utils.getApp().getString(R.string.d_hours, Integer.valueOf(i / 3600)) + Utils.getApp().getString(R.string.d_minutes, Integer.valueOf((i % 3600) / 60));
    }

    private final String metreToRulerQCY(int i, int i2) {
        return i2 == 0 ? String.valueOf(i) : String.valueOf((int) (((double) i) * 3.28d));
    }

    public final int getMiDistanceUnit(int i) {
        return i == 0 ? R.string.f54361mi : R.string.f54374yd;
    }

    @tb1
    public final Object getMySportRecordList(int i, @aa1 List<Workout> list, @aa1 Continuation<? super List<MySportRecordList>> continuation) {
        return I100X1.I0IIOi(IXOX0Xiii.m712iO(), new C186012(i, list, null), continuation);
    }

    @aa1
    public final String getSportDistanceUnit(int i, int i2) {
        float fX1ii = cp5.X1ii(i2, i, false, 4, null);
        if (i == 0) {
            String string = StringUtils.getString(R.string.fastest_km_time, Float.valueOf(fX1ii));
            Intrinsics.XXI(string);
            return string;
        }
        String string2 = StringUtils.getString(R.string.fastest_mi_time, Float.valueOf(fX1ii));
        Intrinsics.XXI(string2);
        return string2;
    }

    @aa1
    public final String getSwimmingDistanceUnit(int i, int i2) {
        String strMetreToRulerQCY = metreToRulerQCY(i2, i);
        if (i == 0) {
            String string = StringUtils.getString(R.string.fastest_m_time, strMetreToRulerQCY);
            Intrinsics.XXI(string);
            return string;
        }
        String string2 = StringUtils.getString(R.string.fastest_ft_time, strMetreToRulerQCY);
        Intrinsics.XXI(string2);
        return string2;
    }

    public final float metreToRulerNumber(int i, int i2) {
        return i2 == 0 ? i : i * 3.28f;
    }
}
