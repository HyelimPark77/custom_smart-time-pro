package com.sma.smartv3.ui.translate.sparkchain;

import androidx.room.Transaction;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iOIXXXII0;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uy0;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.TranslateDao;
import com.sma.smartv3.db.dao.TranslateSessionDao;
import com.sma.smartv3.db.entity.TranslateEntity;
import com.sma.smartv3.db.entity.TranslateSessionEntity;
import com.sma.smartv3.db.entity.TranslateSessionWithFirstEntity;
import com.sma.smartv3.db.entity.TranslateSessionWithTranslation;
import com.sma.smartv3.ui.translate.ActionDoneType;
import com.sma.smartv3.ui.translate.ChatShowType;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSparkChainSessionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainSessionRepository.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n116#2,7:188\n124#2,2:198\n116#2,10:200\n116#2,10:230\n1761#3,3:195\n1878#3,2:210\n774#3:212\n865#3,2:213\n1563#3:215\n1634#3,3:216\n1869#3,2:219\n1880#3:221\n1563#3:222\n1634#3,3:223\n1869#3,2:226\n1869#3,2:228\n*S KotlinDebug\n*F\n+ 1 SparkChainSessionRepository.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository\n*L\n68#1:188,7\n68#1:198,2\n82#1:200,10\n181#1:230,10\n69#1:195,3\n97#1:210,2\n102#1:212\n102#1:213,2\n102#1:215\n102#1:216,3\n106#1:219,2\n97#1:221\n114#1:222\n114#1:223,3\n122#1:226,2\n142#1:228,2\n*E\n"})
public final class SparkChainSessionRepository {

    @aa1
    public final uy0 I0IIOi;

    @tb1
    public volatile TranslateSessionEntity IiI10X;

    @tb1
    public volatile iOIXXXII0 O00;

    @aa1
    public final String OXO1;

    @aa1
    public final List<TranslateEntity> XIi00iiXO;

    @aa1
    public final TranslateDao XO0O10;

    @aa1
    public final TranslateSessionDao XOO0ii0;

    @aa1
    public final uy0 iO;

    public SparkChainSessionRepository() {
        this.OXO1 = "SparkChainSessionRepository";
        this.XIi00iiXO = new ArrayList();
        this.iO = MutexKt.XIi00iiXO(false, 1, null);
        MyDb r3 = MyDb.INSTANCE;
        this.XO0O10 = r3.getMDatabase().translateDao();
        this.XOO0ii0 = r3.getMDatabase().translateSessionDao();
        this.I0IIOi = MutexKt.XIi00iiXO(false, 1, null);
    }

    public static final /* synthetic */ Object OXO1(SparkChainSessionRepository r0, iOIXXXII0 r1, Continuation r2) {
        return r0.iO(r1, r2);
    }

    public static /* synthetic */ Object XXI(SparkChainSessionRepository r0, int r1, Continuation r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 100;
    L6:
        return r0.I0iXXO(r1, r2);
    }

    @tb1
    public final TranslateSessionEntity I0IIOi() {
        return this.XOO0ii0.getTranslateFirst();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5, types: [T, java.util.List] */
    @tb1
    public final Object I0iXXO(int r14, @aa1 Continuation<? super String> r15) {
        if ((r15 instanceof SparkChainSessionRepository$saveToRoom$1) == false) goto L7;
        SparkChainSessionRepository$saveToRoom$1 r0 = (SparkChainSessionRepository$saveToRoom$1) r15;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.label = r1 - Integer.MIN_VALUE;
    L8:
        Object r16 = r0.result;
        Object r2 = pb.I0iXXO();
        int r3 = r0.label;
        int r4 = 0;
        if (r3 == 0) goto L14;
        if (r3 != 1) goto L13;
        r14 = r0.I$0;
        uy0 r5 = (uy0) r0.L$2;
        Ref.ObjectRef r6 = (Ref.ObjectRef) r0.L$1;
        Ref.ObjectRef r7 = (Ref.ObjectRef) r0.L$0;
        ResultKt.X1ii(r16);
    L58:
        ?? r17 = CollectionsKt___CollectionsKt.i0I0O111I(this.XIi00iiXO);     // Catch: Throwable -> L23
        r7.element = r17;     // Catch: Throwable -> L23
        TranslateEntity r18 = (TranslateEntity) CollectionsKt___CollectionsKt.iXi1iI0((List) r17);     // Catch: Throwable -> L23
        if (r18 == null) goto L25;
        String r19 = r18.getSessionId();     // Catch: Throwable -> L23
        T r110 = r19;
        if (r19 == null) goto L25;
    L26:
        r6.element = r110;     // Catch: Throwable -> L23
        Unit r111 = Unit.OXO1;     // Catch: Throwable -> L23
        r5.unlock(null);
        if (((List) r7.element).isEmpty() == false) goto L31;
        return "";
    L31:
        this.XOO0ii0.insert(new TranslateSessionEntity((String) r6.element, "", 0.0f, System.currentTimeMillis(), 0, 16, null));
        Iterator r112 = CollectionsKt___CollectionsKt.X10i(XO0O10((List) r7.element, (String) r6.element), r14).iterator();
    L33:
        if (r112.hasNext() == false) goto L55;
        Object r113 = r112.next();
        int r8 = r4 + 1;
        if (r4 >= 0) goto L37;
        CollectionsKt__CollectionsKt.XOX0O0();
    L37:
        List<TranslateEntity> r114 = (List) r113;
        List<Long> r9 = this.XO0O10.insertAll(r114);
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " insertSessionWithEntities 成功加入:" + r9.size() + "条数据 }");
        List r115 = CollectionsKt___CollectionsKt.O110i(r114, r9);
        ArrayList r10 = new ArrayList();
        Iterator r116 = r115.iterator();
    L39:
        if (r116.hasNext() == false) goto L43;
        Object r11 = r116.next();
        if (((Number) ((Pair) r11).getSecond()).longValue() != (-1)) goto L39;
        r10.add(r11);
        goto L39
    L43:
        ArrayList r117 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r10, 10));
        Iterator r12 = r10.iterator();
    L45:
        if (r12.hasNext() == false) goto L48;
        r117.add((TranslateEntity) ((Pair) r12.next()).getFirst());
        goto L45
    L48:
        if (r117.isEmpty() == true) goto L53;
        Iterator r118 = r117.iterator();
    L51:
        if (r118.hasNext() == false) goto L53;
        TranslateEntity r13 = (TranslateEntity) r118.next();
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " insertSessionWithEntities 第" + r4 + " 批 失败内容：" + r13);
    L53:
        r4 = r8;
        goto L33
    L55:
        return r6.element;
    L25:
        String r119 = UUID.randomUUID().toString();     // Catch: Throwable -> L23
        Intrinsics.O10IXXX0X(r119, "toString(...)");     // Catch: Throwable -> L23
        r110 = r119;
    L23:
        th = move-exception;
        r5.unlock(null);
        throw th;
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        ResultKt.X1ii(r16);
        Ref.ObjectRef r120 = new Ref.ObjectRef();
        r6 = new Ref.ObjectRef();
        uy0 r20 = this.iO;
        r0.L$0 = r120;
        r0.L$1 = r6;
        r0.L$2 = r20;
        r0.I$0 = r14;
        r0.I$1 = 0;
        r0.label = 1;
        if (r20.lock(null, r0) != r2) goto L17;
        return r2;
    L17:
        r7 = r120;
        r5 = r20;
    L7:
        r0 = new SparkChainSessionRepository$saveToRoom$1(this, r15);
        goto L8
    }

    @aa1
    public final List<TranslateSessionWithFirstEntity> IO() {
        return this.XOO0ii0.getAllSessionsWithFirstEntity();
    }

    @Transaction
    public final void IiI10X(@aa1 String r5) {
        Intrinsics.X0O(r5, JsonStorageKeyNames.SESSION_ID_KEY);
        TranslateSessionWithTranslation r6 = XOO0ii0(r5);
        if (r6 == null) goto L22;
        Iterator<T> r0 = r6.getTranslations().iterator();
    L6:
        if (r0.hasNext() == false) goto L15;
        TranslateEntity r1 = (TranslateEntity) r0.next();
        if (r1.getAudioPath().length() <= 0) goto L14;
        File r2 = new File(r1.getAudioPath());
        if (r2.isFile() == false) goto L14;
        if (r2.exists() == false) goto L14;
        r2.delete();
    L14:
        this.XO0O10.delete(r1);
        goto L6
    L15:
        this.XOO0ii0.delete(r6.getSession());
        return;
    }

    @tb1
    public final Object O00(@aa1 Continuation<? super Unit> r6) {
        if ((r6 instanceof SparkChainSessionRepository$clear$1) == false) goto L7;
        SparkChainSessionRepository$clear$1 r0 = (SparkChainSessionRepository$clear$1) r6;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.label = r1 - Integer.MIN_VALUE;
    L8:
        Object r7 = r0.result;
        Object r2 = pb.I0iXXO();
        int r3 = r0.label;
        if (r3 == 0) goto L14;
        if (r3 != 1) goto L13;
        uy0 r4 = (uy0) r0.L$0;
        ResultKt.X1ii(r7);
    L24:
        this.XIi00iiXO.clear();     // Catch: Throwable -> L21
        Unit r8 = Unit.OXO1;     // Catch: Throwable -> L21
        r4.unlock(null);
        this.O00 = null;
        this.IiI10X = null;
        return r8;
    L21:
        th = move-exception;
        r4.unlock(null);
        throw th;
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        ResultKt.X1ii(r7);
        uy0 r9 = this.iO;
        r0.L$0 = r9;
        r0.I$0 = 0;
        r0.label = 1;
        if (r9.lock(null, r0) != r2) goto L17;
        return r2;
    L17:
        r4 = r9;
    L7:
        r0 = new SparkChainSessionRepository$clear$1(this, r6);
        goto L8
    }

    @tb1
    public final TranslateSessionEntity OIX0iXi(@aa1 String r2) {
        Intrinsics.X0O(r2, JsonStorageKeyNames.SESSION_ID_KEY);
        return this.XOO0ii0.querySessionById(r2);
    }

    @aa1
    public final List<TranslateSessionEntity> OIi0() {
        return this.XOO0ii0.getAllTranslationList();
    }

    @Transaction
    public final void X1ii(@aa1 String r11) {
        Intrinsics.X0O(r11, JsonStorageKeyNames.SESSION_ID_KEY);
        TranslateSessionWithTranslation r12 = XOO0ii0(r11);
        if (r12 == null) goto L25;
        Iterator<T> r0 = r12.getTranslations().iterator();
    L6:
        if (r0.hasNext() == false) goto L14;
        TranslateEntity r1 = (TranslateEntity) r0.next();
        if (r1.getAudioPath().length() <= 0) goto L6;
        File r2 = new File(r1.getAudioPath());
        if (r2.isFile() == false) goto L6;
        if (r2.exists() == false) goto L6;
        r2.delete();
        goto L6
    L14:
        this.XOO0ii0.update(TranslateSessionEntity.copy$default(r12.getSession(), null, null, 0.0f, 0, ActionDoneType.COMPLETE.getFlag(), 15, null));
        return;
    }

    @tb1
    public final Object XIi00iiXO(@aa1 iOIXXXII0 r1, @aa1 Continuation<? super Unit> r2) {
        this.O00 = r1;
        Object r3 = iO(r1, r2);
        if (r3 != pb.I0iXXO()) goto L6;
        return r3;
    L6:
        return Unit.OXO1;
    }

    public final List<TranslateEntity> XO0O10(List<TranslateEntity> r19, String r20) {
        List<TranslateEntity> r0 = r19;
        ArrayList r1 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));
        Iterator<T> r2 = r0.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        r1.add(TranslateEntity.copy$default((TranslateEntity) r2.next(), null, null, null, r20, 0.0f, false, null, null, null, 0, 0, 2039, null));
        goto L4
    L6:
        return r1;
    }

    @tb1
    public final TranslateSessionWithTranslation XOO0ii0(@aa1 String r2) {
        Intrinsics.X0O(r2, JsonStorageKeyNames.SESSION_ID_KEY);
        return this.XOO0ii0.queryBySessionId(r2);
    }

    public final Object iO(iOIXXXII0 r23, Continuation<? super Unit> r24) {
        if ((r24 instanceof SparkChainSessionRepository$addSttToList$1) == false) goto L7;
        SparkChainSessionRepository$addSttToList$1 r2 = (SparkChainSessionRepository$addSttToList$1) r24;
        int r3 = r2.label;
        if ((r3 & Integer.MIN_VALUE) == 0) goto L7;
        r2.label = r3 - Integer.MIN_VALUE;
    L8:
        Object r0 = r2.result;
        Object r4 = pb.I0iXXO();
        int r5 = r2.label;
        if (r5 == 0) goto L14;
        if (r5 != 1) goto L13;
        uy0 r6 = (uy0) r2.L$6;
        TranslateEntity r7 = (TranslateEntity) r2.L$5;
        String r8 = (String) r2.L$4;
        String r9 = (String) r2.L$3;
        String r10 = (String) r2.L$2;
        String r11 = (String) r2.L$1;
        iOIXXXII0 r12 = (iOIXXXII0) r2.L$0;
        ResultKt.X1ii(r0);
    L67:
        List<TranslateEntity> r1 = this.XIi00iiXO;     // Catch: Throwable -> L53
        if ((r1 instanceof Collection) == true) goto L51;
    L55:
        Iterator<T> r13 = r1.iterator();     // Catch: Throwable -> L53
    L57:
        if (r13.hasNext() == false) goto L61;
        if (Intrinsics.XOO0ii0(((TranslateEntity) r13.next()).getRequestId(), r7.getRequestId()) == false) goto L57;
    L62:
        Unit r14 = Unit.OXO1;     // Catch: Throwable -> L53
        r6.unlock(null);
        return r14;
    L61:
        this.XIi00iiXO.add(r7);     // Catch: Throwable -> L53
        goto L62
    L51:
        if (r1.isEmpty() == false) goto L55;
    L53:
        th = move-exception;
        r6.unlock(null);
        throw th;
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        ResultKt.X1ii(r0);
        long r17 = System.currentTimeMillis();
        String r15 = UUID.randomUUID().toString();
        Intrinsics.O10IXXX0X(r15, "toString(...)");
        String r16 = UUID.randomUUID().toString();
        Intrinsics.O10IXXX0X(r16, "toString(...)");
        Float r18 = r23.I1XOi1();
        if (r18 == null) goto L18;
        float r19 = r18.floatValue();
    L17:
        float r110 = r19;
        String r20 = r23.XiOIii1();
        if (r20 != null) goto L22;
        String r111 = "";
    L23:
        String r21 = r23.XX0();
        if (r21 != null) goto L26;
        String r22 = "";
    L27:
        String r25 = r23.O10IXXX0X();
        if (r25 != null) goto L30;
        String r112 = "";
    L31:
        String r26 = r23.IIX1OXO();
        if (r26 != null) goto L34;
        String r113 = "";
    L35:
        String r27 = r23.OiIIX101O();
        if (r27 != null) goto L38;
        String r114 = "";
    L39:
        Integer r28 = r23.X0O();
        if (r28 == null) goto L43;
        int r29 = r28.intValue();
    L44:
        TranslateEntity r30 = new TranslateEntity(r16, r22, r111, r15, r110, false, r112, r113, r114, r17, r29, 32, null);
        uy0 r115 = this.iO;
        r2.L$0 = SpillingKt.OXO1(r23);
        r2.L$1 = SpillingKt.OXO1(r15);
        r2.L$2 = SpillingKt.OXO1(r16);
        r2.L$3 = SpillingKt.OXO1(r111);
        r2.L$4 = SpillingKt.OXO1(r22);
        r2.L$5 = r30;
        r2.L$6 = r115;
        r2.J$0 = r17;
        r2.F$0 = r110;
        r2.I$0 = 0;
        r2.label = 1;
        if (r115.lock(null, r2) != r4) goto L47;
        return r4;
    L47:
        r7 = r30;
        r6 = r115;
        goto L67
    L43:
        r29 = ChatShowType.FROM.getFlag();
        goto L44
    L38:
        r114 = r27;
        goto L39
    L34:
        r113 = r26;
        goto L35
    L30:
        r112 = r25;
        goto L31
    L26:
        r22 = r21;
        goto L27
    L22:
        r111 = r20;
        goto L23
    L18:
        r19 = 0.0f;
    L7:
        r2 = new SparkChainSessionRepository$addSttToList$1(this, r24);
        goto L8
    }
}
