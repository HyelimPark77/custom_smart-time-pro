package com.sma.smartv3.p610ui.translate;

import androidx.room.Transaction;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iOX1XO;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uy0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.TranslateDao;
import com.sma.smartv3.p608db.dao.TranslateSessionDao;
import com.sma.smartv3.p608db.entity.TranslateEntity;
import com.sma.smartv3.p608db.entity.TranslateSessionEntity;
import com.sma.smartv3.p608db.entity.TranslateSessionWithFirstEntity;
import com.sma.smartv3.p608db.entity.TranslateSessionWithTranslation;
import com.sma.smartv3.util.websocket.data.STTMessage;
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
    public final String OXO1 = "TranslateRepository";

    @aa1
    public final TranslateDao XIi00iiXO;

    @aa1
    public final uy0 XO0O10;

    /* JADX INFO: renamed from: iO */
    @aa1
    public final TranslateSessionDao f54827iO;

    public TranslateEntityRepository() {
        MyDb myDb = MyDb.INSTANCE;
        this.XIi00iiXO = myDb.getMDatabase().translateDao();
        this.f54827iO = myDb.getMDatabase().translateSessionDao();
        this.XO0O10 = MutexKt.XIi00iiXO(false, 1, null);
        this.IiI10X = new ArrayList();
    }

    public static /* synthetic */ Object OIi0(TranslateEntityRepository translateEntityRepository, String str, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 100;
        }
        return translateEntityRepository.I0IIOi(str, i, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.util.List] */
    @tb1
    @Transaction
    public final Object I0IIOi(@tb1 String str, int i, @aa1 Continuation<? super String> continuation) {
        TranslateEntityRepository$insertSessionWithEntities$1 translateEntityRepository$insertSessionWithEntities$1;
        Ref.ObjectRef objectRef;
        uy0 uy0Var;
        Ref.ObjectRef objectRef2;
        String str2;
        int i2;
        T t;
        String sessionId;
        if (continuation instanceof TranslateEntityRepository$insertSessionWithEntities$1) {
            translateEntityRepository$insertSessionWithEntities$1 = (TranslateEntityRepository$insertSessionWithEntities$1) continuation;
            int i3 = translateEntityRepository$insertSessionWithEntities$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                translateEntityRepository$insertSessionWithEntities$1.label = i3 - Integer.MIN_VALUE;
            } else {
                translateEntityRepository$insertSessionWithEntities$1 = new TranslateEntityRepository$insertSessionWithEntities$1(this, continuation);
            }
        } else {
            translateEntityRepository$insertSessionWithEntities$1 = new TranslateEntityRepository$insertSessionWithEntities$1(this, continuation);
        }
        Object obj = translateEntityRepository$insertSessionWithEntities$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i4 = translateEntityRepository$insertSessionWithEntities$1.label;
        int i5 = 0;
        if (i4 == 0) {
            ResultKt.X1ii(obj);
            objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            uy0Var = this.XO0O10;
            translateEntityRepository$insertSessionWithEntities$1.L$0 = str;
            translateEntityRepository$insertSessionWithEntities$1.L$1 = objectRef;
            translateEntityRepository$insertSessionWithEntities$1.L$2 = objectRef3;
            translateEntityRepository$insertSessionWithEntities$1.L$3 = uy0Var;
            translateEntityRepository$insertSessionWithEntities$1.I$0 = i;
            translateEntityRepository$insertSessionWithEntities$1.I$1 = 0;
            translateEntityRepository$insertSessionWithEntities$1.label = 1;
            if (uy0Var.lock(null, translateEntityRepository$insertSessionWithEntities$1) == objI0iXXO) {
                return objI0iXXO;
            }
            objectRef2 = objectRef3;
            str2 = str;
            i2 = i;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = translateEntityRepository$insertSessionWithEntities$1.I$0;
            uy0Var = (uy0) translateEntityRepository$insertSessionWithEntities$1.L$3;
            objectRef2 = (Ref.ObjectRef) translateEntityRepository$insertSessionWithEntities$1.L$2;
            objectRef = (Ref.ObjectRef) translateEntityRepository$insertSessionWithEntities$1.L$1;
            str2 = (String) translateEntityRepository$insertSessionWithEntities$1.L$0;
            ResultKt.X1ii(obj);
        }
        try {
            ?? I0I0O111I = CollectionsKt___CollectionsKt.i0I0O111I(this.IiI10X);
            objectRef.element = I0I0O111I;
            TranslateEntity translateEntity = (TranslateEntity) CollectionsKt___CollectionsKt.iXi1iI0((List) I0I0O111I);
            if (translateEntity == null) {
                String string = UUID.randomUUID().toString();
                Intrinsics.O10IXXX0X(string, "toString(...)");
                t = string;
            } else {
                sessionId = translateEntity.getSessionId();
                if (sessionId == null) {
                    t = sessionId;
                    String string2 = UUID.randomUUID().toString();
                    Intrinsics.O10IXXX0X(string2, "toString(...)");
                    t = string2;
                }
            }
            t = sessionId;
            objectRef2.element = t;
            Unit unit = Unit.OXO1;
            uy0Var.unlock(null);
            TranslateSessionEntity translateSessionEntity = new TranslateSessionEntity((String) objectRef2.element, str2 == null ? "" : str2, 0.0f, System.currentTimeMillis(), 0, 16, null);
            i1O0OXO1O.OXO1.OXO1(this.OXO1 + " insertSessionWithEntities 进入：" + translateSessionEntity);
            for (TranslateEntity translateEntity2 : (Iterable) objectRef.element) {
                i1O0OXO1O.OXO1.OXO1(this.OXO1 + " translateEntity Item :" + translateEntity2);
            }
            if (str2 == null || str2.length() == 0) {
                i1O0OXO1O.OXO1.XIi00iiXO(this.OXO1 + " LocalAudio is Empty");
            }
            this.f54827iO.insert(translateSessionEntity);
            for (Object obj2 : CollectionsKt___CollectionsKt.X10i(OXO1((List) objectRef.element, (String) objectRef2.element), i2)) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt__CollectionsKt.XOX0O0();
                }
                List<TranslateEntity> list = (List) obj2;
                List<Long> listInsertAll = this.XIi00iiXO.insertAll(list);
                i1O0OXO1O.OXO1.OXO1(this.OXO1 + " insertSessionWithEntities 成功加入:" + listInsertAll.size() + "条数据");
                List listO110i = CollectionsKt___CollectionsKt.O110i(list, listInsertAll);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : listO110i) {
                    if (((Number) ((Pair) obj3).getSecond()).longValue() == -1) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList<TranslateEntity> arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((TranslateEntity) ((Pair) it.next()).getFirst());
                }
                if (!arrayList2.isEmpty()) {
                    for (TranslateEntity translateEntity3 : arrayList2) {
                        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " insertSessionWithEntities 第" + i5 + " 批 失败内容：" + translateEntity3);
                    }
                }
                i5 = i6;
            }
            return objectRef2.element;
        } catch (Throwable th) {
            uy0Var.unlock(null);
            throw th;
        }
    }

    @tb1
    public final TranslateSessionEntity I0iXXO(@aa1 String sessionId) {
        Intrinsics.X0O(sessionId, "sessionId");
        return this.f54827iO.querySessionById(sessionId);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @tb1
    /* JADX INFO: renamed from: IO */
    public final Object m38765IO(@aa1 String str, @aa1 iOX1XO iox1xo, @aa1 Continuation<? super Unit> continuation) {
        TranslateEntityRepository$notifySttAudioEndChange$1 translateEntityRepository$notifySttAudioEndChange$1;
        TranslateEntity translateEntityCopy$default;
        uy0 uy0Var;
        if (continuation instanceof TranslateEntityRepository$notifySttAudioEndChange$1) {
            translateEntityRepository$notifySttAudioEndChange$1 = (TranslateEntityRepository$notifySttAudioEndChange$1) continuation;
            int i = translateEntityRepository$notifySttAudioEndChange$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                translateEntityRepository$notifySttAudioEndChange$1.label = i - Integer.MIN_VALUE;
            } else {
                translateEntityRepository$notifySttAudioEndChange$1 = new TranslateEntityRepository$notifySttAudioEndChange$1(this, continuation);
            }
        } else {
            translateEntityRepository$notifySttAudioEndChange$1 = new TranslateEntityRepository$notifySttAudioEndChange$1(this, continuation);
        }
        Object obj = translateEntityRepository$notifySttAudioEndChange$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = translateEntityRepository$notifySttAudioEndChange$1.label;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            TranslateEntity translateEntity = this.O00;
            translateEntityCopy$default = translateEntity != null ? TranslateEntity.copy$default(translateEntity, null, null, null, null, 0.0f, false, str, iox1xo.I1XOi1(), iox1xo.OiIIX101O(), System.currentTimeMillis(), 0, 1087, null) : null;
            if (translateEntityCopy$default == null) {
                i1O0OXO1O.OXO1.XIi00iiXO(this.OXO1 + " can't copy With audio");
                return Unit.OXO1;
            }
            uy0 uy0Var2 = this.XO0O10;
            translateEntityRepository$notifySttAudioEndChange$1.L$0 = SpillingKt.OXO1(str);
            translateEntityRepository$notifySttAudioEndChange$1.L$1 = SpillingKt.OXO1(iox1xo);
            translateEntityRepository$notifySttAudioEndChange$1.L$2 = translateEntityCopy$default;
            translateEntityRepository$notifySttAudioEndChange$1.L$3 = uy0Var2;
            translateEntityRepository$notifySttAudioEndChange$1.I$0 = 0;
            translateEntityRepository$notifySttAudioEndChange$1.label = 1;
            if (uy0Var2.lock(null, translateEntityRepository$notifySttAudioEndChange$1) == objI0iXXO) {
                return objI0iXXO;
            }
            uy0Var = uy0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uy0Var = (uy0) translateEntityRepository$notifySttAudioEndChange$1.L$3;
            translateEntityCopy$default = (TranslateEntity) translateEntityRepository$notifySttAudioEndChange$1.L$2;
            ResultKt.X1ii(obj);
        }
        try {
            List<TranslateEntity> list = this.IiI10X;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.XOO0ii0(((TranslateEntity) it.next()).getRequestId(), translateEntityCopy$default.getRequestId())) {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                this.IiI10X.add(translateEntityCopy$default);
            }
            i1O0OXO1O.OXO1.OXO1(this.OXO1 + " HasItem:" + z);
            return Unit.OXO1;
        } finally {
            uy0Var.unlock(null);
        }
    }

    @tb1
    public final TranslateSessionEntity IiI10X() {
        return this.f54827iO.getTranslateFirst();
    }

    @tb1
    public final TranslateSessionWithTranslation O00(@aa1 String sessionId) {
        Intrinsics.X0O(sessionId, "sessionId");
        return this.f54827iO.queryBySessionId(sessionId);
    }

    public final void OIX0iXi(@aa1 STTMessage sttMessage) {
        Intrinsics.X0O(sttMessage, "sttMessage");
        String sessionId = sttMessage.getSessionId();
        String request_id = sttMessage.getRequest_id();
        String text = sttMessage.getText();
        String translation = sttMessage.getTranslation();
        if (translation == null) {
            translation = "";
        }
        this.O00 = new TranslateEntity(request_id, text, translation, sessionId, sttMessage.getDuration(), false, "", "", "", 0L, 0, IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, null);
    }

    public final List<TranslateEntity> OXO1(List<TranslateEntity> list, String str) {
        List<TranslateEntity> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(TranslateEntity.copy$default((TranslateEntity) it.next(), null, null, null, str, 0.0f, false, null, null, null, 0L, 0, 2039, null));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @tb1
    public final Object XIi00iiXO(@aa1 Continuation<? super Unit> continuation) {
        TranslateEntityRepository$clear$1 translateEntityRepository$clear$1;
        uy0 uy0Var;
        if (continuation instanceof TranslateEntityRepository$clear$1) {
            translateEntityRepository$clear$1 = (TranslateEntityRepository$clear$1) continuation;
            int i = translateEntityRepository$clear$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                translateEntityRepository$clear$1.label = i - Integer.MIN_VALUE;
            } else {
                translateEntityRepository$clear$1 = new TranslateEntityRepository$clear$1(this, continuation);
            }
        } else {
            translateEntityRepository$clear$1 = new TranslateEntityRepository$clear$1(this, continuation);
        }
        Object obj = translateEntityRepository$clear$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = translateEntityRepository$clear$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            uy0 uy0Var2 = this.XO0O10;
            translateEntityRepository$clear$1.L$0 = uy0Var2;
            translateEntityRepository$clear$1.I$0 = 0;
            translateEntityRepository$clear$1.label = 1;
            if (uy0Var2.lock(null, translateEntityRepository$clear$1) == objI0iXXO) {
                return objI0iXXO;
            }
            uy0Var = uy0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uy0Var = (uy0) translateEntityRepository$clear$1.L$0;
            ResultKt.X1ii(obj);
        }
        try {
            this.IiI10X.clear();
            Unit unit = Unit.OXO1;
            uy0Var.unlock(null);
            this.O00 = null;
            return unit;
        } catch (Throwable th) {
            uy0Var.unlock(null);
            throw th;
        }
    }

    @tb1
    public final TranslateEntity XO0O10() {
        return this.O00;
    }

    @aa1
    public final List<TranslateSessionWithFirstEntity> XOO0ii0() {
        return this.f54827iO.getAllSessionsWithFirstEntity();
    }

    public final void XXI(@tb1 TranslateEntity translateEntity) {
        this.O00 = translateEntity;
    }

    @Transaction
    /* JADX INFO: renamed from: iO */
    public final void m38766iO(@aa1 String sessionId) {
        Intrinsics.X0O(sessionId, "sessionId");
        TranslateSessionWithTranslation translateSessionWithTranslationO00 = O00(sessionId);
        if (translateSessionWithTranslationO00 != null) {
            for (TranslateEntity translateEntity : translateSessionWithTranslationO00.getTranslations()) {
                if (translateEntity.getAudioPath().length() > 0) {
                    File file = new File(translateEntity.getAudioPath());
                    if (file.isFile() && file.exists()) {
                        file.delete();
                    }
                }
                this.XIi00iiXO.delete(translateEntity);
            }
            this.f54827iO.delete(translateSessionWithTranslationO00.getSession());
        }
    }
}
