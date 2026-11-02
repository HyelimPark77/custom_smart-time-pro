package com.sma.smartv3.biz.fitness_site.hyky;

import com.android.mltcode.paycertificationapi.C2263bm;
import com.android.mltcode.paycertificationapi.C2788p1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bo0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.network.GetSNCodeHYKY;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.entity.Sleep;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.util.TimePeriod;
import com.szabh.smable3.entity.BleSleep;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nHykyUpload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyUpload.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyUpload\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n*L\n1#1,491:1\n1563#2:492\n1634#2,3:493\n1869#2,2:496\n1563#2:498\n1634#2,3:499\n1491#2:502\n1516#2,3:503\n1519#2,3:513\n1999#2,14:519\n1563#2:534\n1634#2,3:535\n1869#2,2:538\n1563#2:540\n1634#2,3:541\n1869#2,2:544\n1563#2:546\n1634#2,3:547\n1869#2,2:550\n1563#2:552\n1634#2,3:553\n1869#2,2:556\n1563#2:558\n1634#2,3:559\n1869#2,2:562\n1563#2:564\n1634#2,3:565\n1869#2,2:568\n1563#2:570\n1634#2,3:571\n1869#2,2:574\n1869#2:598\n1870#2:621\n1573#2:622\n1604#2,4:623\n1869#2:627\n1870#2:650\n382#3,7:506\n126#4:516\n153#4,2:517\n155#4:533\n766#5,21:576\n802#5:597\n766#5,21:599\n802#5:620\n766#5,21:628\n802#5:649\n*S KotlinDebug\n*F\n+ 1 HykyUpload.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyUpload\n*L\n77#1:492\n77#1:493,3\n83#1:496,2\n91#1:498\n91#1:499,3\n93#1:502\n93#1:503,3\n93#1:513,3\n98#1:519,14\n99#1:534\n99#1:535,3\n104#1:538,2\n116#1:540\n116#1:541,3\n123#1:544,2\n131#1:546\n131#1:547,3\n137#1:550,2\n145#1:552\n145#1:553,3\n151#1:556,2\n164#1:558\n164#1:559,3\n170#1:562,2\n178#1:564\n178#1:565,3\n180#1:568,2\n188#1:570\n188#1:571,3\n194#1:574,2\n291#1:598\n291#1:621\n314#1:622\n314#1:623,4\n372#1:627\n372#1:650\n93#1:506,7\n96#1:516\n96#1:517,2\n96#1:533\n267#1:576,21\n267#1:597\n292#1:599,21\n292#1:620\n373#1:628,21\n373#1:649\n*E\n"})
public final class HykyUpload {

    @aa1
    private final String TAG = "HykyUpload";

    @aa1
    private final LinkedBlockingQueue<List<Object>> mUploadData = new LinkedBlockingQueue<>();

    @tb1
    private XiOIO uploadJob;

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.hyky.HykyUpload$distribute$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.biz.fitness_site.hyky.HykyUpload", m39466f = "HykyUpload.kt", m39467i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7}, m39468l = {84, 105, 124, 138, 152, 171, 181, 195}, m39469m = "distribute", m39470n = {"dataList", "first", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HykyUpload$distribute$3", "dataList", "first", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HykyUpload$distribute$8", "dataList", "first", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HykyUpload$distribute$10", "dataList", "first", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HykyUpload$distribute$12", "dataList", "first", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HykyUpload$distribute$14", "dataList", "first", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HykyUpload$distribute$16", "dataList", "first", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HykyUpload$distribute$18", "dataList", "first", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HykyUpload$distribute$20"}, m39472s = {"L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1"}, m39473v = 1)
    public static final class C154771 extends ContinuationImpl {
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

        public C154771(Continuation<? super C154771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @tb1
        public final Object invokeSuspend(@aa1 Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HykyUpload.this.distribute(null, this);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.hyky.HykyUpload$startUpload$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.biz.fitness_site.hyky.HykyUpload$startUpload$1", m39466f = "HykyUpload.kt", m39467i = {0, 1, 2}, m39468l = {57, 61, 65}, m39469m = "invokeSuspend", m39470n = {"dataList", "dataList", "dataList"}, m39472s = {"L$0", "L$0", "L$0"}, m39473v = 1)
    public static final class C289251 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C289251(Continuation<? super C289251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HykyUpload.this.new C289251(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289251) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0031  */
        /* JADX WARN: Code duplicated, block: B:17:0x003d  */
        /* JADX WARN: Code duplicated, block: B:20:0x005a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0063 -> B:15:0x0031). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0088 -> B:15:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = com.android.mltcode.paycertificationapi.C2798pb.I0iXXO()
                int r1 = r8.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r8.L$0
                java.util.List r1 = (java.util.List) r1
                goto L2e
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                java.lang.Object r1 = r8.L$0
                java.util.List r1 = (java.util.List) r1
                kotlin.ResultKt.X1ii(r9)     // Catch: java.lang.Exception -> L7a
                goto L7a
            L26:
                java.lang.Object r1 = r8.L$0
                java.util.List r1 = (java.util.List) r1
                kotlin.ResultKt.X1ii(r9)
                goto L5d
            L2e:
                kotlin.ResultKt.X1ii(r9)
            L31:
                com.sma.smartv3.biz.fitness_site.hyky.HykyUpload r9 = com.sma.smartv3.biz.fitness_site.hyky.HykyUpload.this
                java.util.concurrent.LinkedBlockingQueue r9 = com.sma.smartv3.biz.fitness_site.hyky.HykyUpload.access$getMUploadData$p(r9)
                boolean r9 = r9.isEmpty()
                if (r9 != 0) goto L8b
                com.sma.smartv3.biz.fitness_site.hyky.HykyUpload r9 = com.sma.smartv3.biz.fitness_site.hyky.HykyUpload.this
                java.util.concurrent.LinkedBlockingQueue r9 = com.sma.smartv3.biz.fitness_site.hyky.HykyUpload.access$getMUploadData$p(r9)
                java.lang.Object r9 = r9.take()
                java.util.List r9 = (java.util.List) r9
                com.sma.smartv3.biz.fitness_site.hyky.HykyManager$Companion r1 = com.sma.smartv3.biz.fitness_site.hyky.HykyManager.Companion
                com.sma.smartv3.biz.fitness_site.hyky.HykyManager r1 = r1.getInstance()
                r8.L$0 = r9
                r8.label = r4
                java.lang.Object r1 = r1.refreshToken(r8)
                if (r1 != r0) goto L5a
                goto L8a
            L5a:
                r7 = r1
                r1 = r9
                r9 = r7
            L5d:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 != 0) goto L66
                goto L31
            L66:
                com.sma.smartv3.biz.fitness_site.hyky.HykyUpload r9 = com.sma.smartv3.biz.fitness_site.hyky.HykyUpload.this     // Catch: java.lang.Exception -> L7a
                kotlin.jvm.internal.Intrinsics.XXI(r1)     // Catch: java.lang.Exception -> L7a
                java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.OXO1(r1)     // Catch: java.lang.Exception -> L7a
                r8.L$0 = r5     // Catch: java.lang.Exception -> L7a
                r8.label = r3     // Catch: java.lang.Exception -> L7a
                java.lang.Object r9 = com.sma.smartv3.biz.fitness_site.hyky.HykyUpload.access$distribute(r9, r1, r8)     // Catch: java.lang.Exception -> L7a
                if (r9 != r0) goto L7a
                goto L8a
            L7a:
                java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.OXO1(r1)
                r8.L$0 = r9
                r8.label = r2
                r5 = 10000(0x2710, double:4.9407E-320)
                java.lang.Object r9 = kotlinx.coroutines.DelayKt.XIi00iiXO(r5, r8)
                if (r9 != r0) goto L31
            L8a:
                return r0
            L8b:
                kotlin.Unit r9 = kotlin.Unit.OXO1
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.biz.fitness_site.hyky.HykyUpload.C289251.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public HykyUpload() {
        startUpload();
    }

    private final List<UploadSleepDataHYKY.SleepData> bleSleepToSleepData(List<Sleep> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int mAlgorithmType = list.get(0).getMAlgorithmType();
        List<Sleep> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            Sleep sleep = (Sleep) obj;
            if (sleep.getMMode() == 17) {
                mAlgorithmType = sleep.getMAlgorithmType();
            }
            arrayList2.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
            i = i2;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " bleSleepToSleepData source " + mAlgorithmType + " " + arrayList2);
        List<BleSleep> listAnalyseSleep = BleSleep.Companion.analyseSleep(arrayList2, mAlgorithmType);
        if (!listAnalyseSleep.isEmpty()) {
            String strMillis2String = TimeUtils.millis2String(((long) ((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(listAnalyseSleep)).getMTime()) * 1000, O0X11OiO.IO0iXO0O());
            String strMillis2String2 = TimeUtils.millis2String(((long) ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(listAnalyseSleep)).getMTime()) * 1000, O0X11OiO.IO0iXO0O());
            long j = 300000;
            UploadSleepDataHYKY.SleepData sleepData = new UploadSleepDataHYKY.SleepData("Dev_" + UUID.randomUUID(), 1, TimeUtils.millis2String((((long) ((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(listAnalyseSleep)).getMTime()) * 1000) - j, O0X11OiO.IO0iXO0O()), strMillis2String, strMillis2String2, TimeUtils.millis2String((((long) ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(listAnalyseSleep)).getMTime()) * 1000) + j, O0X11OiO.IO0iXO0O()), null, null, null, null, null, null, O0X11OiO.IO0iXO0O().format(Long.valueOf(System.currentTimeMillis())), null, null, null, null, null, 257984, null);
            arrayList.add(sleepData);
            List<Integer> listAnalyseSleepToStatus = HykyUtils.INSTANCE.analyseSleepToStatus(listAnalyseSleep);
            if (!listAnalyseSleepToStatus.isEmpty()) {
                UploadSleepDataHYKY.SleepData sleepDataCopy$default = UploadSleepDataHYKY.SleepData.copy$default(sleepData, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, C2788p1.OXO1, null);
                sleepDataCopy$default.setSleepDataType(2);
                sleepDataCopy$default.setSleepStatusArr(listAnalyseSleepToStatus);
                arrayList.add(sleepDataCopy$default);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0172  */
    /* JADX WARN: Code duplicated, block: B:36:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x042e -> B:108:0x042f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x04e4 -> B:122:0x04e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x058c -> B:139:0x058d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x0607 -> B:153:0x0608). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x06a0 -> B:167:0x06a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x01a3 -> B:37:0x01a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x02f4 -> B:78:0x02f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x039a -> B:94:0x039b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object distribute(java.util.List<? extends java.lang.Object> r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 1726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.biz.fitness_site.hyky.HykyUpload.distribute(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean enableLocation(UploadSportDataHYKY.SportData sportData) {
        int sportType = sportData.getSportType();
        return sportType == UploadSportDataHYKY.SportType.RUNNING.getValue() || sportType == UploadSportDataHYKY.SportType.CYCLING.getValue() || sportType == UploadSportDataHYKY.SportType.MOUNTAINEERING.getValue() || sportType == UploadSportDataHYKY.SportType.WALK.getValue();
    }

    private final boolean enablePace(UploadSportDataHYKY.SportData sportData) {
        int sportType = sportData.getSportType();
        return sportType == UploadSportDataHYKY.SportType.RUNNING.getValue() || sportType == UploadSportDataHYKY.SportType.CYCLING.getValue() || sportType == UploadSportDataHYKY.SportType.MOUNTAINEERING.getValue() || sportType == UploadSportDataHYKY.SportType.WALK.getValue();
    }

    private final boolean enableStepFreq(UploadSportDataHYKY.SportData sportData) {
        int sportType = sportData.getSportType();
        return sportType == UploadSportDataHYKY.SportType.RUNNING.getValue() || sportType == UploadSportDataHYKY.SportType.MOUNTAINEERING.getValue() || sportType == UploadSportDataHYKY.SportType.WALK.getValue();
    }

    private final void handleSleepUpload() {
        int i;
        String uploadSleepLastDate = HykyManager.Companion.getInstance().getUploadSleepLastDate();
        String str = O0X11OiO.IO0iXO0O().format(new Date());
        Intrinsics.XXI(str);
        int iI0iXXO = O0X11OiO.I0iXXO(uploadSleepLastDate, str, "yyyy-MM-dd HH:mm:ss");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " handleSleepUpload -> lastDate=" + uploadSleepLastDate + ", curDate=" + str + ", days=" + iI0iXXO);
        if (iI0iXXO <= 0) {
            return;
        }
        char c = 0;
        int i2 = 0;
        while (i2 < iI0iXXO) {
            Calendar calendar = Calendar.getInstance();
            Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
            long[] jArrM787I1 = O0X11OiO.m787I1(calendar, TimePeriod.DAY, i2 - iI0iXXO);
            String str2 = O0X11OiO.IO0iXO0O().format(new Date(jArrM787I1[c]));
            String str3 = O0X11OiO.I0IIOi().format(new Date(jArrM787I1[c]));
            String str4 = O0X11OiO.IO0iXO0O().format(new Date(jArrM787I1[1]));
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(this.TAG + " handleSleepUpload " + str2 + " timeRange -> " + str2 + " - " + str4 + " , date = " + str3);
            if (Intrinsics.XOO0ii0(uploadSleepLastDate, str2)) {
                i1o0oxo1o.XIi00iiXO(this.TAG + " handleSleepUpload -> can not upload, " + str2 + " is uploaded");
                i = i2;
            } else {
                a01.OXO1.IiI10X().put(b01.i1iII1i1, str2);
                try {
                    long time = O0X11OiO.I0IIOi().parse(str3).getTime();
                    i = i2;
                    long j = O0X11OiO.iXiX011;
                    long j2 = time - j;
                    long j3 = time + j;
                    try {
                        i1o0oxo1o.OXO1(this.TAG + " handleSleepUpload " + str2 + " sleeps -> " + O0X11OiO.IO0iXO0O().format(new Date(j2)) + " - " + O0X11OiO.IO0iXO0O().format(new Date(j3)));
                        List<Sleep> sleeps = MyDb.INSTANCE.getMDatabase().sleepDao().getSleeps(j2, j3);
                        i1o0oxo1o.OXO1(this.TAG + " handleSleepUpload " + str2 + " sleeps -> " + sleeps);
                        if (!sleeps.isEmpty()) {
                            sleepDataUpload(sleeps);
                        }
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                    }
                } catch (Exception e2) {
                    e = e2;
                    i = i2;
                }
            }
            i2 = i + 1;
            c = 0;
        }
    }

    private final void sleepDataUpload(List<Sleep> list) {
        String deviceID;
        HykyUtils hykyUtils = HykyUtils.INSTANCE;
        GetSNCodeHYKY.Response deviceCode = hykyUtils.getDeviceCode();
        if (deviceCode == null || (deviceID = hykyUtils.getDeviceID(deviceCode.getMac())) == null) {
            return;
        }
        for (UploadSleepDataHYKY.SleepData sleepData : bleSleepToSleepData(list)) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            HykyManager.Companion companion = HykyManager.Companion;
            UploadSleepDataHYKY.BodyData bodyData = new UploadSleepDataHYKY.BodyData(companion.getInstance().getMAppUser().noAreaCodePhone(), 0, deviceID, deviceCode.getCmei(), deviceCode.getSn(), deviceCode.getMac(), sleepData, 2, null);
            String str = HykyAPI.INSTANCE.getBASE_URL_HYKY() + UploadSleepDataHYKY.URL;
            final O1XIiIO o1XIiIO = null;
            AndroidNetworking.post(str).addHeaders("Authorization", companion.getInstance().getToken().getTokenType() + " " + companion.getInstance().getToken().getAccessToken()).addApplicationJsonBody(bodyData).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(HykyResponse.class, Object.class), new ParsedRequestListener<HykyResponse<Object>>() { // from class: com.sma.smartv3.biz.fitness_site.hyky.HykyUpload$sleepDataUpload$lambda$0$0$0$$inlined$postHyky$default$1
                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                public void onError(ANError aNError) {
                    Response response;
                    Integer numValueOf = null;
                    LogUtils.m11128d("errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", " + (aNError != null ? aNError.getErrorDetail() : null));
                    if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                        numValueOf = Integer.valueOf(response.getCode());
                    } else if (aNError != null) {
                        numValueOf = Integer.valueOf(aNError.getErrorCode());
                    }
                    O1XIiIO o1XIiIO2 = o1XIiIO;
                    if (o1XIiIO2 != null) {
                        o1XIiIO2.handleError(String.valueOf(numValueOf));
                    }
                }

                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                public void onResponse(HykyResponse<Object> response) {
                    Intrinsics.X0O(response, "response");
                    if (response.getCode() == 200) {
                        O1XIiIO o1XIiIO2 = o1XIiIO;
                        if (o1XIiIO2 != null) {
                            o1XIiIO2.handleResponse(response.getData());
                            return;
                        }
                        return;
                    }
                    O1XIiIO o1XIiIO3 = o1XIiIO;
                    if (o1XIiIO3 != null) {
                        o1XIiIO3.handleError(response.getCode() + " " + response.getMessage());
                    }
                }
            });
        }
    }

    private final void startUpload() {
        XiOIO xiOIO = this.uploadJob;
        if (xiOIO == null || !xiOIO.isActive()) {
            this.uploadJob = XX01Oi.IiI10X(I0IIOi.OXO1(IXOX0Xiii.m712iO()), null, null, new C289251(null), 3, null);
        }
    }

    private final List<UploadSportDataHYKY.SportData> workoutToSportData(Workout workout) {
        UploadSportDataHYKY.SportData paceData;
        UploadSportDataHYKY.SportData stepFreqData;
        UploadSportDataHYKY.SportData locationData;
        ArrayList arrayList = new ArrayList();
        UploadSportDataHYKY.SportOverView sportOverView = new UploadSportDataHYKY.SportOverView(null, null, null, null, null, null, null, null, null, null, null, null, null, null, C2263bm.OXO1, null);
        sportOverView.setAvgHr(Integer.valueOf(workout.getMAvgBpm()));
        sportOverView.setMinHr(Integer.valueOf(workout.getMMinBpm()));
        sportOverView.setMaxHr(Integer.valueOf(workout.getMMaxBpm()));
        sportOverView.setCalorie(Integer.valueOf(workout.getMCalorie()));
        sportOverView.setDuration(Integer.valueOf(workout.getMDuration()));
        sportOverView.setDistance(Integer.valueOf(workout.getMDistance()));
        String strValueOf = String.valueOf(workout.getMStart());
        String strValueOf2 = String.valueOf(workout.getMEnd());
        String str = "Dev_" + UUID.randomUUID();
        HykyUtils hykyUtils = HykyUtils.INSTANCE;
        UploadSportDataHYKY.SportData sportData = new UploadSportDataHYKY.SportData(0, strValueOf, strValueOf2, str, 0, hykyUtils.dateFormatToHyky(workout.getMLocalTime()), sportOverView, null, null, null, null, null, 3985, null);
        arrayList.add(hykyUtils.getSportOverView(workout, sportData));
        UploadSportDataHYKY.SportData hrData = hykyUtils.getHrData(workout, UploadSportDataHYKY.SportData.copy$default(sportData, 0, null, null, null, 0, null, null, null, null, null, null, null, bo0.f5772iO, null));
        if (hrData != null) {
            arrayList.add(hrData);
        }
        if (enableLocation(sportData) && (locationData = hykyUtils.getLocationData(workout, UploadSportDataHYKY.SportData.copy$default(sportData, 0, null, null, null, 0, null, null, null, null, null, null, null, bo0.f5772iO, null))) != null) {
            arrayList.add(locationData);
        }
        if (enableStepFreq(sportData) && (stepFreqData = hykyUtils.getStepFreqData(workout, UploadSportDataHYKY.SportData.copy$default(sportData, 0, null, null, null, 0, null, null, null, null, null, null, null, bo0.f5772iO, null))) != null) {
            arrayList.add(stepFreqData);
        }
        if (enablePace(sportData) && (paceData = hykyUtils.getPaceData(workout, UploadSportDataHYKY.SportData.copy$default(sportData, 0, null, null, null, 0, null, null, null, null, null, null, null, bo0.f5772iO, null))) != null) {
            arrayList.add(paceData);
        }
        return arrayList;
    }

    public final void healthDataUpload(@aa1 Object healthData) {
        String deviceID;
        Intrinsics.X0O(healthData, "healthData");
        HykyUtils hykyUtils = HykyUtils.INSTANCE;
        GetSNCodeHYKY.Response deviceCode = hykyUtils.getDeviceCode();
        if (deviceCode == null || (deviceID = hykyUtils.getDeviceID(deviceCode.getMac())) == null) {
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HykyManager.Companion companion = HykyManager.Companion;
        UploadHealthDataHYKY.BodyData bodyData = new UploadHealthDataHYKY.BodyData(companion.getInstance().getMAppUser().noAreaCodePhone(), 0, deviceID, deviceCode.getCmei(), deviceCode.getSn(), deviceCode.getMac(), healthData, 2, null);
        String str = HykyAPI.INSTANCE.getBASE_URL_HYKY() + UploadHealthDataHYKY.URL;
        final O1XIiIO o1XIiIO = null;
        AndroidNetworking.post(str).addHeaders("Authorization", companion.getInstance().getToken().getTokenType() + " " + companion.getInstance().getToken().getAccessToken()).addApplicationJsonBody(bodyData).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(HykyResponse.class, Object.class), new ParsedRequestListener<HykyResponse<Object>>() { // from class: com.sma.smartv3.biz.fitness_site.hyky.HykyUpload$healthDataUpload$lambda$0$0$$inlined$postHyky$default$1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                Integer numValueOf = null;
                LogUtils.m11128d("errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", " + (aNError != null ? aNError.getErrorDetail() : null));
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                O1XIiIO o1XIiIO2 = o1XIiIO;
                if (o1XIiIO2 != null) {
                    o1XIiIO2.handleError(String.valueOf(numValueOf));
                }
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onResponse(HykyResponse<Object> response) {
                Intrinsics.X0O(response, "response");
                if (response.getCode() == 200) {
                    O1XIiIO o1XIiIO2 = o1XIiIO;
                    if (o1XIiIO2 != null) {
                        o1XIiIO2.handleResponse(response.getData());
                        return;
                    }
                    return;
                }
                O1XIiIO o1XIiIO3 = o1XIiIO;
                if (o1XIiIO3 != null) {
                    o1XIiIO3.handleError(response.getCode() + " " + response.getMessage());
                }
            }
        });
    }

    public final void putData(@aa1 List<? extends Object> dataList) {
        Intrinsics.X0O(dataList, "dataList");
        this.mUploadData.put(dataList);
        startUpload();
    }

    public final void sportDataUpload(@aa1 Workout workout) {
        String deviceID;
        Intrinsics.X0O(workout, "workout");
        HykyUtils hykyUtils = HykyUtils.INSTANCE;
        GetSNCodeHYKY.Response deviceCode = hykyUtils.getDeviceCode();
        if (deviceCode == null || (deviceID = hykyUtils.getDeviceID(deviceCode.getMac())) == null) {
            return;
        }
        for (UploadSportDataHYKY.SportData sportData : workoutToSportData(workout)) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            HykyManager.Companion companion = HykyManager.Companion;
            UploadSportDataHYKY.BodyData bodyData = new UploadSportDataHYKY.BodyData(companion.getInstance().getMAppUser().noAreaCodePhone(), 0, deviceID, deviceCode.getCmei(), deviceCode.getSn(), deviceCode.getMac(), sportData, 2, null);
            String str = HykyAPI.INSTANCE.getBASE_URL_HYKY() + UploadSportDataHYKY.URL;
            final O1XIiIO o1XIiIO = null;
            AndroidNetworking.post(str).addHeaders("Authorization", companion.getInstance().getToken().getTokenType() + " " + companion.getInstance().getToken().getAccessToken()).addApplicationJsonBody(bodyData).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(HykyResponse.class, Object.class), new ParsedRequestListener<HykyResponse<Object>>() { // from class: com.sma.smartv3.biz.fitness_site.hyky.HykyUpload$sportDataUpload$lambda$0$0$0$$inlined$postHyky$default$1
                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                public void onError(ANError aNError) {
                    Response response;
                    Integer numValueOf = null;
                    LogUtils.m11128d("errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", " + (aNError != null ? aNError.getErrorDetail() : null));
                    if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                        numValueOf = Integer.valueOf(response.getCode());
                    } else if (aNError != null) {
                        numValueOf = Integer.valueOf(aNError.getErrorCode());
                    }
                    O1XIiIO o1XIiIO2 = o1XIiIO;
                    if (o1XIiIO2 != null) {
                        o1XIiIO2.handleError(String.valueOf(numValueOf));
                    }
                }

                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                public void onResponse(HykyResponse<Object> response) {
                    Intrinsics.X0O(response, "response");
                    if (response.getCode() == 200) {
                        O1XIiIO o1XIiIO2 = o1XIiIO;
                        if (o1XIiIO2 != null) {
                            o1XIiIO2.handleResponse(response.getData());
                            return;
                        }
                        return;
                    }
                    O1XIiIO o1XIiIO3 = o1XIiIO;
                    if (o1XIiIO3 != null) {
                        o1XIiIO3.handleError(response.getCode() + " " + response.getMessage());
                    }
                }
            });
        }
    }
}
