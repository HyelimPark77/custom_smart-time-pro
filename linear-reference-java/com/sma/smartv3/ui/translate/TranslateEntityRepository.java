package com.sma.smartv3.ui.translate;

import androidx.room.Transaction;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iOX1XO;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uy0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.TranslateDao;
import com.sma.smartv3.db.dao.TranslateSessionDao;
import com.sma.smartv3.db.entity.TranslateEntity;
import com.sma.smartv3.db.entity.TranslateSessionEntity;
import com.sma.smartv3.db.entity.TranslateSessionWithFirstEntity;
import com.sma.smartv3.db.entity.TranslateSessionWithTranslation;
import com.sma.smartv3.util.websocket.data.STTMessage;
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
@SourceDebugExtension({"SMAP\nTranslateEntityRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateEntityRepository.kt\ncom/sma/smartv3/ui/translate/TranslateEntityRepository\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n116#2,7:188\n124#2,2:198\n116#2,10:200\n116#2,10:230\n1761#3,3:195\n1869#3,2:210\n1878#3,2:212\n774#3:214\n865#3,2:215\n1563#3:217\n1634#3,3:218\n1869#3,2:221\n1880#3:223\n1563#3:224\n1634#3,3:225\n1869#3,2:228\n*S KotlinDebug\n*F\n+ 1 TranslateEntityRepository.kt\ncom/sma/smartv3/ui/translate/TranslateEntityRepository\n*L\n71#1:188,7\n71#1:198,2\n97#1:200,10\n181#1:230,10\n72#1:195,3\n108#1:210,2\n117#1:212,2\n122#1:214\n122#1:215,2\n122#1:217\n122#1:218,3\n126#1:221,2\n117#1:223\n134#1:224\n134#1:225,3\n146#1:228,2\n*E\n"})
public final class TranslateEntityRepository {

    @aa1
    public final List<TranslateEntity> IiI10X;

    @tb1
    public TranslateEntity O00;

    @aa1
    public final String OXO1;

    @aa1
    public final TranslateDao XIi00iiXO;

    @aa1
    public final uy0 XO0O10;

    @aa1
    public final TranslateSessionDao iO;

    public TranslateEntityRepository() {
        this.OXO1 = "TranslateRepository";
        MyDb r0 = MyDb.INSTANCE;
        this.XIi00iiXO = r0.getMDatabase().translateDao();
        this.iO = r0.getMDatabase().translateSessionDao();
        this.XO0O10 = MutexKt.XIi00iiXO(false, 1, null);
        this.IiI10X = new ArrayList();
    }

    public static /* synthetic */ Object OIi0(TranslateEntityRepository r0, String r1, int r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = 100;
    L6:
        return r0.I0IIOi(r1, r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.util.List] */
    @tb1
    @Transaction
    public final Object I0IIOi(@tb1 String r19, int r20, @aa1 Continuation<? super String> r21) {
        if ((r21 instanceof TranslateEntityRepository$insertSessionWithEntities$1) == false) goto L7;
        TranslateEntityRepository$insertSessionWithEntities$1 r2 = (TranslateEntityRepository$insertSessionWithEntities$1) r21;
        int r3 = r2.label;
        if ((r3 & Integer.MIN_VALUE) == 0) goto L7;
        r2.label = r3 - Integer.MIN_VALUE;
    L8:
        Object r0 = r2.result;
        Object r4 = pb.I0iXXO();
        int r5 = r2.label;
        int r6 = 0;
        if (r5 == 0) goto L14;
        if (r5 != 1) goto L13;
        int r7 = r2.I$0;
        uy0 r8 = (uy0) r2.L$3;
        Ref.ObjectRef r9 = (Ref.ObjectRef) r2.L$2;
        Ref.ObjectRef r10 = (Ref.ObjectRef) r2.L$1;
        String r11 = (String) r2.L$0;
        ResultKt.X1ii(r0);
    L66:
        ?? r1 = CollectionsKt___CollectionsKt.i0I0O111I(this.IiI10X);     // Catch: Throwable -> L23
        r10.element = r1;     // Catch: Throwable -> L23
        TranslateEntity r12 = (TranslateEntity) CollectionsKt___CollectionsKt.iXi1iI0((List) r1);     // Catch: Throwable -> L23
        if (r12 == null) goto L25;
        String r13 = r12.getSessionId();     // Catch: Throwable -> L23
        T r14 = r13;
        if (r13 == null) goto L25;
    L26:
        r9.element = r14;     // Catch: Throwable -> L23
        Unit r15 = Unit.OXO1;     // Catch: Throwable -> L23
        r8.unlock(null);
        String r16 = (String) r9.element;
        if (r11 != null) goto L30;
        String r17 = "";
    L31:
        TranslateSessionEntity r18 = new TranslateSessionEntity(r16, r17, 0.0f, System.currentTimeMillis(), 0, 16, null);
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " insertSessionWithEntities 进入：" + r18);
        Iterator r22 = ((Iterable) r10.element).iterator();
    L33:
        if (r22.hasNext() == false) goto L35;
        TranslateEntity r23 = (TranslateEntity) r22.next();
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " translateEntity Item :" + r23);
        goto L33
    L35:
        if (r11 != null) goto L37;
    L38:
        i1O0OXO1O.OXO1.XIi00iiXO(this.OXO1 + " LocalAudio is Empty");
    L39:
        this.iO.insert(r18);
        Iterator r24 = CollectionsKt___CollectionsKt.X10i(OXO1((List) r10.element, (String) r9.element), r7).iterator();
    L41:
        if (r24.hasNext() == false) goto L63;
        Object r25 = r24.next();
        int r26 = r6 + 1;
        if (r6 >= 0) goto L45;
        CollectionsKt__CollectionsKt.XOX0O0();
    L45:
        List<TranslateEntity> r27 = (List) r25;
        List<Long> r28 = this.XIi00iiXO.insertAll(r27);
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " insertSessionWithEntities 成功加入:" + r28.size() + "条数据");
        List r29 = CollectionsKt___CollectionsKt.O110i(r27, r28);
        ArrayList r30 = new ArrayList();
        Iterator r31 = r29.iterator();
    L47:
        if (r31.hasNext() == false) goto L51;
        Object r32 = r31.next();
        if (((Number) ((Pair) r32).getSecond()).longValue() != (-1)) goto L47;
        r30.add(r32);
        goto L47
    L51:
        ArrayList r33 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r30, 10));
        Iterator r34 = r30.iterator();
    L53:
        if (r34.hasNext() == false) goto L56;
        r33.add((TranslateEntity) ((Pair) r34.next()).getFirst());
        goto L53
    L56:
        if (r33.isEmpty() == true) goto L61;
        Iterator r35 = r33.iterator();
    L59:
        if (r35.hasNext() == false) goto L61;
        TranslateEntity r36 = (TranslateEntity) r35.next();
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " insertSessionWithEntities 第" + r6 + " 批 失败内容：" + r36);
    L61:
        r6 = r26;
        goto L41
    L63:
        return r9.element;
    L37:
        if (r11.length() != 0) goto L39;
    L30:
        r17 = r11;
    L25:
        String r37 = UUID.randomUUID().toString();     // Catch: Throwable -> L23
        Intrinsics.O10IXXX0X(r37, "toString(...)");     // Catch: Throwable -> L23
        r14 = r37;
    L23:
        th = move-exception;
        r8.unlock(null);
        throw th;
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        ResultKt.X1ii(r0);
        r10 = new Ref.ObjectRef();
        Ref.ObjectRef r38 = new Ref.ObjectRef();
        r8 = this.XO0O10;
        r2.L$0 = r19;
        r2.L$1 = r10;
        r2.L$2 = r38;
        r2.L$3 = r8;
        r2.I$0 = r20;
        r2.I$1 = 0;
        r2.label = 1;
        if (r8.lock(null, r2) != r4) goto L17;
        return r4;
    L17:
        r9 = r38;
        r11 = r19;
        r7 = r20;
    L7:
        r2 = new TranslateEntityRepository$insertSessionWithEntities$1(this, r21);
        goto L8
    }

    @tb1
    public final TranslateSessionEntity I0iXXO(@aa1 String r2) {
        Intrinsics.X0O(r2, JsonStorageKeyNames.SESSION_ID_KEY);
        return this.iO.querySessionById(r2);
    }

    @tb1
    public final Object IO(@aa1 String r24, @aa1 iOX1XO r25, @aa1 Continuation<? super Unit> r26) {
        if ((r26 instanceof TranslateEntityRepository$notifySttAudioEndChange$1) == false) goto L7;
        TranslateEntityRepository$notifySttAudioEndChange$1 r2 = (TranslateEntityRepository$notifySttAudioEndChange$1) r26;
        int r3 = r2.label;
        if ((r3 & Integer.MIN_VALUE) == 0) goto L7;
        r2.label = r3 - Integer.MIN_VALUE;
    L8:
        Object r0 = r2.result;
        Object r4 = pb.I0iXXO();
        int r5 = r2.label;
        boolean r6 = false;
        if (r5 == 0) goto L14;
        if (r5 != 1) goto L13;
        uy0 r7 = (uy0) r2.L$3;
        TranslateEntity r8 = (TranslateEntity) r2.L$2;
        iOX1XO r9 = (iOX1XO) r2.L$1;
        String r10 = (String) r2.L$0;
        ResultKt.X1ii(r0);
    L45:
        List<TranslateEntity> r1 = this.IiI10X;     // Catch: Throwable -> L30
        if ((r1 instanceof Collection) == true) goto L28;
    L32:
        Iterator<T> r11 = r1.iterator();     // Catch: Throwable -> L30
    L34:
        if (r11.hasNext() == false) goto L38;
        if (Intrinsics.XOO0ii0(((TranslateEntity) r11.next()).getRequestId(), r8.getRequestId()) == false) goto L34;
        r6 = true;
    L38:
        if (r6 == true) goto L40;
        this.IiI10X.add(r8);     // Catch: Throwable -> L30
    L40:
        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " HasItem:" + r6);     // Catch: Throwable -> L30
        Unit r12 = Unit.OXO1;     // Catch: Throwable -> L30
        r7.unlock(null);
        return r12;
    L28:
        if (r1.isEmpty() == false) goto L32;
    L30:
        th = move-exception;
        r7.unlock(null);
        throw th;
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        ResultKt.X1ii(r0);
        TranslateEntity r13 = this.O00;
        if (r13 == null) goto L17;
        r8 = TranslateEntity.copy$default(r13, null, null, null, null, 0.0f, false, r24, r25.I1XOi1(), r25.OiIIX101O(), System.currentTimeMillis(), 0, 1087, null);
    L18:
        if (r8 != null) goto L21;
        i1O0OXO1O.OXO1.XIi00iiXO(this.OXO1 + " can't copy With audio");
        return Unit.OXO1;
    L21:
        uy0 r14 = this.XO0O10;
        r2.L$0 = SpillingKt.OXO1(r24);
        r2.L$1 = SpillingKt.OXO1(r25);
        r2.L$2 = r8;
        r2.L$3 = r14;
        r2.I$0 = 0;
        r2.label = 1;
        if (r14.lock(null, r2) != r4) goto L24;
        return r4;
    L24:
        r7 = r14;
        goto L45
    L17:
        r8 = null;
    L7:
        r2 = new TranslateEntityRepository$notifySttAudioEndChange$1(this, r26);
        goto L8
    }

    @tb1
    public final TranslateSessionEntity IiI10X() {
        return this.iO.getTranslateFirst();
    }

    @tb1
    public final TranslateSessionWithTranslation O00(@aa1 String r2) {
        Intrinsics.X0O(r2, JsonStorageKeyNames.SESSION_ID_KEY);
        return this.iO.queryBySessionId(r2);
    }

    public final void OIX0iXi(@aa1 STTMessage r17) {
        Intrinsics.X0O(r17, "sttMessage");
        String r5 = r17.getSessionId();
        String r2 = r17.getRequest_id();
        String r3 = r17.getText();
        String r0 = r17.getTranslation();
        if (r0 != null) goto L5;
        r0 = "";
    L5:
        this.O00 = new TranslateEntity(r2, r3, r0, r5, r17.getDuration(), false, "", "", "", 0, 0, IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, null);
    }

    public final List<TranslateEntity> OXO1(List<TranslateEntity> r19, String r20) {
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
    public final Object XIi00iiXO(@aa1 Continuation<? super Unit> r6) {
        if ((r6 instanceof TranslateEntityRepository$clear$1) == false) goto L7;
        TranslateEntityRepository$clear$1 r0 = (TranslateEntityRepository$clear$1) r6;
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
        this.IiI10X.clear();     // Catch: Throwable -> L21
        Unit r8 = Unit.OXO1;     // Catch: Throwable -> L21
        r4.unlock(null);
        this.O00 = null;
        return r8;
    L21:
        th = move-exception;
        r4.unlock(null);
        throw th;
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        ResultKt.X1ii(r7);
        uy0 r9 = this.XO0O10;
        r0.L$0 = r9;
        r0.I$0 = 0;
        r0.label = 1;
        if (r9.lock(null, r0) != r2) goto L17;
        return r2;
    L17:
        r4 = r9;
    L7:
        r0 = new TranslateEntityRepository$clear$1(this, r6);
        goto L8
    }

    @tb1
    public final TranslateEntity XO0O10() {
        return this.O00;
    }

    @aa1
    public final List<TranslateSessionWithFirstEntity> XOO0ii0() {
        return this.iO.getAllSessionsWithFirstEntity();
    }

    public final void XXI(@tb1 TranslateEntity r1) {
        this.O00 = r1;
    }

    @Transaction
    public final void iO(@aa1 String r5) {
        Intrinsics.X0O(r5, JsonStorageKeyNames.SESSION_ID_KEY);
        TranslateSessionWithTranslation r6 = O00(r5);
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
        this.XIi00iiXO.delete(r1);
        goto L6
    L15:
        this.iO.delete(r6.getSession());
        return;
    }
}
