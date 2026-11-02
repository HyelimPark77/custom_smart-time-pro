package com.sma.smartv3.model;

import com.android.mltcode.paycertification.utils.Constant;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.Utils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.google.gson.Gson;
import com.sifli.siflidfu.constants.Timeout;
import com.sma.smartv3.db.entity.Workout;
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
    public static final MySportRecordModel INSTANCE = null;

    /* JADX INFO: renamed from: com.sma.smartv3.model.MySportRecordModel$getMySportRecordList$2, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.model.MySportRecordModel$getMySportRecordList$2", f = "MySportRecordModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nMySportRecordModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MySportRecordModel.kt\ncom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,416:1\n19#2:417\n15#2:418\n1999#3,14:419\n1999#3,14:433\n1999#3,14:447\n1999#3,14:461\n*S KotlinDebug\n*F\n+ 1 MySportRecordModel.kt\ncom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2\n*L\n26#1:417\n26#1:418\n42#1:419,14\n55#1:433,14\n68#1:447,14\n81#1:461,14\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super ArrayList<MySportRecordList>>, Object> {
        final /* synthetic */ List<Workout> $list;
        final /* synthetic */ int $mSportMode;
        int label;

        public AnonymousClass2(int r1, List<Workout> r2, Continuation<? super AnonymousClass2> r3) {
            this.$mSportMode = r1;
            this.$list = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass2(this.$mSportMode, this.$list, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super ArrayList<MySportRecordList>> r2) {
            return ((AnonymousClass2) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r34) {
            pb.I0iXXO();
            if (this.label != 0) goto L116;
            ResultKt.X1ii(r34);
            ArrayList r1 = new ArrayList();
            SPUtils r2 = a01.OXO1.IiI10X();
            Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
            Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
            if (r4 == null) goto L8;
            r3 = r4;
        L8:
            AppUser r5 = (AppUser) r3;
            int r6 = r5.getUnit();
            int r7 = this.$mSportMode;
            if (r7 != 10) goto L11;
            MySportRecordModel.access$getSportRecordCycling(MySportRecordModel.INSTANCE, this.$list, r1, r5.getUnit());
            return r1;
        L11:
            if (r7 != 11) goto L13;
            MySportRecordModel.access$getSportRecordSwimming(MySportRecordModel.INSTANCE, this.$list, r1, r5.getUnit());
            return r1;
        L13:
            if (r7 == 13) goto L16;
            MySportRecordModel.access$getSportRecordRunning(MySportRecordModel.INSTANCE, this.$list, r1, r5.getUnit());
            return r1;
        L16:
            Iterator<T> r8 = this.$list.iterator();
            Object r9 = null;
            if (r8.hasNext() == true) goto L19;
            Object r10 = null;
        L28:
            Workout r11 = (Workout) r10;
            String r12 = UtilsKt.XXO(R.string.max_altitude);
            if (r11 == null) goto L32;
            String r13 = cp5.iIXi1iiXI(r11.getMMaxAltitude(), r6) + UtilsKt.XXO(MySportRecordModel.INSTANCE.getMiDistanceUnit(r6));
        L31:
            String r14 = r13;
            long r18 = 0;
            if (r11 == null) goto L36;
            long r15 = r11.getMStart();
        L37:
            int r20 = -1;
            if (r11 == null) goto L40;
            int r16 = r11.getMId();
        L41:
            r1.add(new MySportRecordList(R.drawable.sport_record_icon_max_altitude, r12, r16, 0, r14, r15, 0, 72, null));
            Iterator<T> r17 = this.$list.iterator();
            if (r17.hasNext() == true) goto L44;
            Object r19 = null;
        L53:
            Workout r21 = (Workout) r19;
            String r22 = UtilsKt.XXO(R.string.min_altitude);
            if (r21 == null) goto L57;
            String r23 = cp5.iIXi1iiXI(r21.getMMinAltitude(), r6) + UtilsKt.XXO(MySportRecordModel.INSTANCE.getMiDistanceUnit(r6));
        L56:
            String r110 = r23;
            if (r21 == null) goto L60;
            long r111 = r21.getMStart();
        L61:
            if (r21 == null) goto L63;
            int r24 = r21.getMId();
        L64:
            r1.add(new MySportRecordList(R.drawable.sport_record_icon_min_altitude, r22, r24, 0, r110, r111, 0, 72, null));
            Iterator<T> r25 = this.$list.iterator();
            if (r25.hasNext() == true) goto L67;
            Object r26 = null;
        L76:
            Workout r27 = (Workout) r26;
            String r28 = UtilsKt.XXO(R.string.sport_max_cum_increase);
            if (r27 == null) goto L80;
            String r29 = cp5.iIXi1iiXI(r27.getMAscendAltitude(), r6) + UtilsKt.XXO(MySportRecordModel.INSTANCE.getMiDistanceUnit(r6));
        L79:
            String r112 = r29;
            if (r27 == null) goto L83;
            long r113 = r27.getMStart();
        L84:
            if (r27 == null) goto L86;
            int r30 = r27.getMId();
        L87:
            r1.add(new MySportRecordList(R.drawable.sport_record_icon_rise_altitude, r28, r30, 0, r112, r113, 0, 72, null));
            Iterator<T> r31 = this.$list.iterator();
            if (r31.hasNext() == false) goto L99;
            r9 = r31.next();
            if (r31.hasNext() == false) goto L99;
            int r32 = ((Workout) r9).getMDescendAltitude();
        L94:
            Object r33 = r31.next();
            int r35 = ((Workout) r33).getMDescendAltitude();
            if (r32 >= r35) goto L98;
            r9 = r33;
            r32 = r35;
        L98:
            if (r31.hasNext() == true) goto L94;
        L99:
            Workout r36 = (Workout) r9;
            String r37 = UtilsKt.XXO(R.string.sport_min_cum_decrease);
            if (r36 == null) goto L103;
            String r38 = cp5.iIXi1iiXI(r36.getMDescendAltitude(), r6) + UtilsKt.XXO(MySportRecordModel.INSTANCE.getMiDistanceUnit(r6));
        L102:
            String r114 = r38;
            if (r36 == null) goto L106;
            r18 = r36.getMStart();
        L106:
            long r115 = r18;
            if (r36 == null) goto L109;
            r20 = r36.getMId();
        L109:
            Boxing.OXO1(r1.add(new MySportRecordList(R.drawable.sport_record_icon_decline_altitude, r37, r20, 0, r114, r115, 0, 72, null)));
            return r1;
        L103:
            r38 = UtilsKt.XXO(R.string.data_none);
            goto L102
        L86:
            r30 = -1;
            goto L87
        L83:
            r113 = 0;
            goto L84
        L80:
            r29 = UtilsKt.XXO(R.string.data_none);
            goto L79
        L67:
            r26 = r25.next();
            if (r25.hasNext() == false) goto L76;
            int r39 = ((Workout) r26).getMAscendAltitude();
        L71:
            Object r40 = r25.next();
            int r41 = ((Workout) r40).getMAscendAltitude();
            if (r39 >= r41) goto L75;
            r26 = r40;
            r39 = r41;
        L75:
            if (r25.hasNext() == true) goto L71;
        L63:
            r24 = -1;
            goto L64
        L60:
            r111 = 0;
            goto L61
        L57:
            r23 = UtilsKt.XXO(R.string.data_none);
            goto L56
        L44:
            r19 = r17.next();
            if (r17.hasNext() == false) goto L53;
            int r42 = ((Workout) r19).getMMinAltitude();
        L48:
            Object r43 = r17.next();
            int r44 = ((Workout) r43).getMMinAltitude();
            if (r42 >= r44) goto L52;
            r19 = r43;
            r42 = r44;
        L52:
            if (r17.hasNext() == true) goto L48;
        L40:
            r16 = -1;
            goto L41
        L36:
            r15 = 0;
            goto L37
        L32:
            r13 = UtilsKt.XXO(R.string.data_none);
            goto L31
        L19:
            r10 = r8.next();
            if (r8.hasNext() == false) goto L28;
            int r45 = ((Workout) r10).getMMaxAltitude();
        L23:
            Object r46 = r8.next();
            int r47 = ((Workout) r46).getMMaxAltitude();
            if (r45 >= r47) goto L27;
            r10 = r46;
            r45 = r47;
        L27:
            if (r8.hasNext() == true) goto L23;
        L116:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super ArrayList<MySportRecordList>> r2) {
            return invoke2(r1, r2);
        }
    }

    static {
        INSTANCE = new MySportRecordModel();
    }

    private MySportRecordModel() {
    }

    public static final /* synthetic */ void access$getSportRecordCycling(MySportRecordModel r0, List r1, ArrayList r2, int r3) {
        r0.getSportRecordCycling(r1, r2, r3);
    }

    public static final /* synthetic */ void access$getSportRecordRunning(MySportRecordModel r0, List r1, ArrayList r2, int r3) {
        r0.getSportRecordRunning(r1, r2, r3);
    }

    public static final /* synthetic */ void access$getSportRecordSwimming(MySportRecordModel r0, List r1, ArrayList r2, int r3) {
        r0.getSportRecordSwimming(r1, r2, r3);
    }

    private final Triple<Integer, Long, Integer> getItemTime(int r4, int r5, int r6, List<Workout> r7) {
        if (r4 <= r5) goto L27;
        ArrayList r8 = new ArrayList();
        Iterator<T> r9 = r7.iterator();
    L5:
        if (r9.hasNext() == false) goto L11;
        Object r0 = r9.next();
        Workout r1 = (Workout) r0;
        if (r1.getMDistance() < r5) goto L5;
        if (r1.getMDistance() > r6) goto L5;
        r8.add(r0);
        goto L5
    L11:
        Iterator r10 = r8.iterator();
        if (r10.hasNext() == true) goto L14;
        Object r11 = null;
    L24:
        Workout r12 = (Workout) r11;
        if (r12 == null) goto L27;
        int r13 = r12.getMDuration();
        long r14 = r12.getMStart();
        int r15 = r12.getMId();
    L29:
        return new Triple(Integer.valueOf(r13), Long.valueOf(r14), Integer.valueOf(r15));
    L14:
        Object r16 = r10.next();
        if (r10.hasNext() == true) goto L17;
    L16:
        r11 = r16;
        goto L24
    L17:
        Workout r17 = (Workout) r16;
        int r18 = r17.getMDistance() / r17.getMDuration();
    L18:
        Object r19 = r10.next();
        Workout r2 = (Workout) r19;
        int r3 = r2.getMDistance() / r2.getMDuration();
        if (r18 <= r3) goto L22;
        r16 = r19;
        r18 = r3;
    L22:
        if (r10.hasNext() == true) goto L18;
    L27:
        r13 = 0;
        r14 = 0;
        r15 = -1;
        goto L29
    }

    private final void getSportRecordCycling(List<Workout> r26, ArrayList<MySportRecordList> r27, int r28) {
        List<Workout> r4 = r26;
        Iterator<T> r5 = r4.iterator();
        Object r7 = null;
        if (r5.hasNext() == true) goto L5;
        Object r6 = null;
    L14:
        Workout r8 = (Workout) r6;
        int r9 = 0;
        if (r8 == null) goto L17;
        int r10 = r8.getMDistance();
    L18:
        String r13 = UtilsKt.XXO(R.string.sport_farthest_distance);
        if (r10 == 0) goto L22;
        String r11 = cp5.X1ii(r10, r28, false, 4, null) + UtilsKt.XXO(cp5.XX0(r28));
    L21:
        String r16 = r11;
        long r22 = 0;
        if (r8 == null) goto L26;
        long r17 = r8.getMStart();
    L27:
        int r24 = -1;
        if (r8 == null) goto L30;
        int r14 = r8.getMId();
    L31:
        r27.add(new MySportRecordList(R.drawable.sport_record_icon_dis, r13, r14, 0, r16, r17, 0, 72, null));
        Iterator<T> r12 = r4.iterator();
        if (r12.hasNext() == false) goto L43;
        r7 = r12.next();
        if (r12.hasNext() == false) goto L43;
        int r15 = ((Workout) r7).getMDuration();
    L38:
        Object r18 = r12.next();
        int r19 = ((Workout) r18).getMDuration();
        if (r15 >= r19) goto L42;
        r7 = r18;
        r15 = r19;
    L42:
        if (r12.hasNext() == true) goto L38;
    L43:
        Workout r20 = (Workout) r7;
        String r110 = UtilsKt.XXO(R.string.sport_max_duration);
        if (r20 == null) goto L46;
        r9 = r20.getMDuration();
    L46:
        String r111 = getTime(r9);
        if (r20 == null) goto L49;
        r22 = r20.getMStart();
    L49:
        long r112 = r22;
        if (r20 == null) goto L52;
        r24 = r20.getMId();
    L52:
        r27.add(new MySportRecordList(R.drawable.sport_record_icon_time, r110, r24, 0, r111, r112, 0, 72, null));
        Triple<Integer, Long, Integer> r21 = getItemTime(r10, 3000, 5000, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(r28, 3000), r21.getThird().intValue(), 0, getTime(r21.getFirst().intValue()), r21.getSecond().longValue(), (int) cp5.O10IXXX0X(3000, r28), 8, null));
        Triple<Integer, Long, Integer> r23 = getItemTime(r10, 5000, 10000, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(r28, 5000), r23.getThird().intValue(), 0, getTime(r23.getFirst().intValue()), r23.getSecond().longValue(), (int) cp5.O10IXXX0X(5000, r28), 8, null));
        Triple<Integer, Long, Integer> r25 = getItemTime(r10, 10000, 40000, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(r28, 10000), r25.getThird().intValue(), 0, getTime(r25.getFirst().intValue()), r25.getSecond().longValue(), (int) cp5.O10IXXX0X(10000, r28), 8, null));
        Triple<Integer, Long, Integer> r29 = getItemTime(r10, 40000, Constant.RESULT_CODE_90000, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(r28, 40000), r29.getThird().intValue(), 0, getTime(r29.getFirst().intValue()), r29.getSecond().longValue(), (int) cp5.O10IXXX0X(40000, r28), 8, null));
        Triple<Integer, Long, Integer> r30 = getItemTime(r10, Constant.RESULT_CODE_90000, 130000, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(r28, Constant.RESULT_CODE_90000), r30.getThird().intValue(), 0, getTime(r30.getFirst().intValue()), r30.getSecond().longValue(), (int) cp5.O10IXXX0X(Constant.RESULT_CODE_90000, r28), 8, null));
        Triple<Integer, Long, Integer> r31 = getItemTime(r10, 130000, Timeout.SIFLI_DFU_ERASE_TIMEOUT, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(r28, 130000), r31.getThird().intValue(), 0, getTime(r31.getFirst().intValue()), r31.getSecond().longValue(), (int) cp5.O10IXXX0X(130000, r28), 8, null));
        Triple<Integer, Long, Integer> r1 = getItemTime(r10, Timeout.SIFLI_DFU_ERASE_TIMEOUT, 1000000, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(r28, Timeout.SIFLI_DFU_ERASE_TIMEOUT), r1.getThird().intValue(), 0, getTime(r1.getFirst().intValue()), r1.getSecond().longValue(), (int) cp5.O10IXXX0X(Timeout.SIFLI_DFU_ERASE_TIMEOUT, r28), 8, null));
        return;
    L30:
        r14 = -1;
        goto L31
    L26:
        r17 = 0;
        goto L27
    L22:
        r11 = UtilsKt.XXO(R.string.data_none);
        goto L21
    L17:
        r10 = 0;
        goto L18
    L5:
        r6 = r5.next();
        if (r5.hasNext() == false) goto L14;
        int r32 = ((Workout) r6).getMDistance();
    L9:
        Object r33 = r5.next();
        int r113 = ((Workout) r33).getMDistance();
        if (r32 >= r113) goto L13;
        r6 = r33;
        r32 = r113;
    L13:
        if (r5.hasNext() == true) goto L9;
        goto L14
    }

    private final void getSportRecordRunning(List<Workout> r26, ArrayList<MySportRecordList> r27, int r28) {
        List<Workout> r4 = r26;
        Iterator<T> r5 = r4.iterator();
        Object r7 = null;
        if (r5.hasNext() == true) goto L5;
        Object r6 = null;
    L14:
        Workout r8 = (Workout) r6;
        int r9 = 0;
        if (r8 == null) goto L17;
        int r10 = r8.getMDistance();
    L18:
        String r13 = UtilsKt.XXO(R.string.sport_farthest_distance);
        if (r10 == 0) goto L22;
        String r11 = cp5.X1ii(r10, r28, false, 4, null) + UtilsKt.XXO(cp5.XX0(r28));
    L21:
        String r16 = r11;
        long r22 = 0;
        if (r8 == null) goto L26;
        long r17 = r8.getMStart();
    L27:
        int r24 = -1;
        if (r8 == null) goto L30;
        int r14 = r8.getMId();
    L31:
        r27.add(new MySportRecordList(R.drawable.sport_record_icon_dis, r13, r14, 0, r16, r17, 0, 72, null));
        Iterator<T> r12 = r4.iterator();
        if (r12.hasNext() == false) goto L43;
        r7 = r12.next();
        if (r12.hasNext() == false) goto L43;
        int r15 = ((Workout) r7).getMDuration();
    L38:
        Object r18 = r12.next();
        int r19 = ((Workout) r18).getMDuration();
        if (r15 >= r19) goto L42;
        r7 = r18;
        r15 = r19;
    L42:
        if (r12.hasNext() == true) goto L38;
    L43:
        Workout r20 = (Workout) r7;
        String r110 = UtilsKt.XXO(R.string.sport_max_duration);
        if (r20 == null) goto L46;
        r9 = r20.getMDuration();
    L46:
        String r111 = getTime(r9);
        if (r20 == null) goto L49;
        r22 = r20.getMStart();
    L49:
        long r112 = r22;
        if (r20 == null) goto L52;
        r24 = r20.getMId();
    L52:
        r27.add(new MySportRecordList(R.drawable.sport_record_icon_time, r110, r24, 0, r111, r112, 0, 72, null));
        Triple<Integer, Long, Integer> r21 = getItemTime(r10, 3000, 5000, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(r28, 3000), r21.getThird().intValue(), 0, getTime(r21.getFirst().intValue()), r21.getSecond().longValue(), (int) cp5.O10IXXX0X(3000, r28), 8, null));
        Triple<Integer, Long, Integer> r23 = getItemTime(r10, 5000, 10000, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(r28, 5000), r23.getThird().intValue(), 0, getTime(r23.getFirst().intValue()), r23.getSecond().longValue(), (int) cp5.O10IXXX0X(5000, r28), 8, null));
        Triple<Integer, Long, Integer> r25 = getItemTime(r10, 10000, 30000, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(r28, 10000), r25.getThird().intValue(), 0, getTime(r25.getFirst().intValue()), r25.getSecond().longValue(), (int) cp5.O10IXXX0X(10000, r28), 8, null));
        Triple<Integer, Long, Integer> r1 = getItemTime(r10, 30000, 60000, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSportDistanceUnit(r28, 30000), r1.getThird().intValue(), 0, getTime(r1.getFirst().intValue()), r1.getSecond().longValue(), (int) cp5.O10IXXX0X(30000, r28), 8, null));
        r27.add(new MySportRecordList(R.drawable.sport_record_icon_half_marathon, UtilsKt.XXO(R.string.fastest_half_marathon_time), 0, 0, HelpFormatter.DEFAULT_LONG_OPT_PREFIX, 0, 0, 108, null));
        r27.add(new MySportRecordList(R.drawable.sport_record_icon_all_marathon, UtilsKt.XXO(R.string.fastest_full_marathon_time), 0, 0, HelpFormatter.DEFAULT_LONG_OPT_PREFIX, 0, 0, 108, null));
        return;
    L30:
        r14 = -1;
        goto L31
    L26:
        r17 = 0;
        goto L27
    L22:
        r11 = UtilsKt.XXO(R.string.data_none);
        goto L21
    L17:
        r10 = 0;
        goto L18
    L5:
        r6 = r5.next();
        if (r5.hasNext() == false) goto L14;
        int r29 = ((Workout) r6).getMDistance();
    L9:
        Object r30 = r5.next();
        int r113 = ((Workout) r30).getMDistance();
        if (r29 >= r113) goto L13;
        r6 = r30;
        r29 = r113;
    L13:
        if (r5.hasNext() == true) goto L9;
        goto L14
    }

    private final void getSportRecordSwimming(List<Workout> r26, ArrayList<MySportRecordList> r27, int r28) {
        List<Workout> r4 = r26;
        Iterator<T> r5 = r4.iterator();
        Object r7 = null;
        if (r5.hasNext() == true) goto L5;
        Object r6 = null;
    L14:
        Workout r8 = (Workout) r6;
        int r9 = 0;
        if (r8 == null) goto L17;
        int r10 = r8.getMDistance();
    L18:
        String r13 = UtilsKt.XXO(R.string.sport_farthest_distance);
        if (r10 == 0) goto L22;
        String r11 = cp5.iIXi1iiXI(r10, r28) + UtilsKt.XXO(getMiDistanceUnit(r28));
    L21:
        String r16 = r11;
        long r22 = 0;
        if (r8 == null) goto L26;
        long r17 = r8.getMStart();
    L27:
        int r24 = -1;
        if (r8 == null) goto L30;
        int r14 = r8.getMId();
    L31:
        r27.add(new MySportRecordList(R.drawable.sport_record_icon_cyc, r13, r14, 0, r16, r17, 0, 72, null));
        Iterator<T> r12 = r4.iterator();
        if (r12.hasNext() == false) goto L43;
        r7 = r12.next();
        if (r12.hasNext() == false) goto L43;
        int r15 = ((Workout) r7).getMDuration();
    L38:
        Object r18 = r12.next();
        int r19 = ((Workout) r18).getMDuration();
        if (r15 >= r19) goto L42;
        r7 = r18;
        r15 = r19;
    L42:
        if (r12.hasNext() == true) goto L38;
    L43:
        Workout r20 = (Workout) r7;
        String r110 = UtilsKt.XXO(R.string.sport_max_duration);
        if (r20 == null) goto L46;
        r9 = r20.getMDuration();
    L46:
        String r111 = getTime(r9);
        if (r20 == null) goto L49;
        r22 = r20.getMStart();
    L49:
        long r112 = r22;
        if (r20 == null) goto L52;
        r24 = r20.getMId();
    L52:
        r27.add(new MySportRecordList(R.drawable.sport_record_icon_time, r110, r24, 0, r111, r112, 0, 72, null));
        Triple<Integer, Long, Integer> r21 = getItemTime(r10, 100, 400, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSwimmingDistanceUnit(r28, 100), r21.getThird().intValue(), 0, getTime(r21.getFirst().intValue()), r21.getSecond().longValue(), (int) metreToRulerNumber(100, r28), 8, null));
        Triple<Integer, Long, Integer> r23 = getItemTime(r10, 400, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSwimmingDistanceUnit(r28, 400), r23.getThird().intValue(), 0, getTime(r23.getFirst().intValue()), r23.getSecond().longValue(), (int) metreToRulerNumber(400, r28), 8, null));
        Triple<Integer, Long, Integer> r25 = getItemTime(r10, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, 1000, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSwimmingDistanceUnit(r28, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS), r25.getThird().intValue(), 0, getTime(r25.getFirst().intValue()), r25.getSecond().longValue(), (int) metreToRulerNumber(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, r28), 8, null));
        Triple<Integer, Long, Integer> r29 = getItemTime(r10, 1000, 1500, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSwimmingDistanceUnit(r28, 1000), r29.getThird().intValue(), 0, getTime(r29.getFirst().intValue()), r29.getSecond().longValue(), (int) metreToRulerNumber(1000, r28), 8, null));
        Triple<Integer, Long, Integer> r30 = getItemTime(r10, 1500, 3800, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSwimmingDistanceUnit(r28, 1500), r30.getThird().intValue(), 0, getTime(r30.getFirst().intValue()), r30.getSecond().longValue(), (int) metreToRulerNumber(1500, r28), 8, null));
        Triple<Integer, Long, Integer> r31 = getItemTime(r10, 3800, 4000, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSwimmingDistanceUnit(r28, 3800), r31.getThird().intValue(), 0, getTime(r31.getFirst().intValue()), r31.getSecond().longValue(), (int) metreToRulerNumber(3800, r28), 8, null));
        Triple<Integer, Long, Integer> r1 = getItemTime(r10, 4000, 10000, r26);
        r27.add(new MySportRecordList(R.drawable.sport_record_icon, getSwimmingDistanceUnit(r28, 4000), r1.getThird().intValue(), 0, getTime(r1.getFirst().intValue()), r1.getSecond().longValue(), (int) metreToRulerNumber(4000, r28), 8, null));
        return;
    L30:
        r14 = -1;
        goto L31
    L26:
        r17 = 0;
        goto L27
    L22:
        r11 = UtilsKt.XXO(R.string.data_none);
        goto L21
    L17:
        r10 = 0;
        goto L18
    L5:
        r6 = r5.next();
        if (r5.hasNext() == false) goto L14;
        int r32 = ((Workout) r6).getMDistance();
    L9:
        Object r33 = r5.next();
        int r113 = ((Workout) r33).getMDistance();
        if (r32 >= r113) goto L13;
        r6 = r33;
        r32 = r113;
    L13:
        if (r5.hasNext() == true) goto L9;
        goto L14
    }

    private final String getTime(int r4) {
        if (r4 == 0) goto L6;
        return Utils.getApp().getString(R.string.d_hours, new Object[]{Integer.valueOf(r4 / 3600)}) + Utils.getApp().getString(R.string.d_minutes, new Object[]{Integer.valueOf((r4 % 3600) / 60)});
    L6:
        return UtilsKt.XXO(R.string.data_none);
    }

    private final String metreToRulerQCY(int r3, int r4) {
        if (r4 != 0) goto L6;
        return String.valueOf(r3);
    L6:
        return String.valueOf((int) (((double) r3) * 3.28d));
    }

    public final int getMiDistanceUnit(int r1) {
        if (r1 != 0) goto L5;
        return R.string.mi;
    L5:
        return R.string.yd;
    }

    @tb1
    public final Object getMySportRecordList(int r4, @aa1 List<Workout> r5, @aa1 Continuation<? super List<MySportRecordList>> r6) {
        return I100X1.I0IIOi(IXOX0Xiii.iO(), new AnonymousClass2(r4, r5, null), r6);
    }

    @aa1
    public final String getSportDistanceUnit(int r4, int r5) {
        float r6 = cp5.X1ii(r5, r4, false, 4, null);
        if (r4 != 0) goto L6;
        String r7 = StringUtils.getString(R.string.fastest_km_time, new Object[]{Float.valueOf(r6)});
        Intrinsics.XXI(r7);
        return r7;
    L6:
        String r8 = StringUtils.getString(R.string.fastest_mi_time, new Object[]{Float.valueOf(r6)});
        Intrinsics.XXI(r8);
        return r8;
    }

    @aa1
    public final String getSwimmingDistanceUnit(int r1, int r2) {
        String r3 = metreToRulerQCY(r2, r1);
        if (r1 != 0) goto L6;
        String r4 = StringUtils.getString(R.string.fastest_m_time, new Object[]{r3});
        Intrinsics.XXI(r4);
        return r4;
    L6:
        String r5 = StringUtils.getString(R.string.fastest_ft_time, new Object[]{r3});
        Intrinsics.XXI(r5);
        return r5;
    }

    public final float metreToRulerNumber(int r1, int r2) {
        if (r2 != 0) goto L6;
        return r1;
    L6:
        return r1 * 3.28f;
    }
}
