package com.sma.smartv3.p610ui.translate.sparkchain;

import androidx.room.Transaction;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iOIXXXII0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uy0;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.TranslateDao;
import com.sma.smartv3.p608db.dao.TranslateSessionDao;
import com.sma.smartv3.p608db.entity.TranslateEntity;
import com.sma.smartv3.p608db.entity.TranslateSessionEntity;
import com.sma.smartv3.p608db.entity.TranslateSessionWithFirstEntity;
import com.sma.smartv3.p608db.entity.TranslateSessionWithTranslation;
import com.sma.smartv3.p610ui.translate.ActionDoneType;
import com.sma.smartv3.p610ui.translate.ChatShowType;
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
    public final TranslateDao XO0O10;

    @aa1
    public final TranslateSessionDao XOO0ii0;

    @aa1
    public final String OXO1 = "SparkChainSessionRepository";

    @aa1
    public final List<TranslateEntity> XIi00iiXO = new ArrayList();

    /* JADX INFO: renamed from: iO */
    @aa1
    public final uy0 f54857iO = MutexKt.XIi00iiXO(false, 1, null);

    public SparkChainSessionRepository() {
        MyDb myDb = MyDb.INSTANCE;
        this.XO0O10 = myDb.getMDatabase().translateDao();
        this.XOO0ii0 = myDb.getMDatabase().translateSessionDao();
        this.I0IIOi = MutexKt.XIi00iiXO(false, 1, null);
    }

    public static /* synthetic */ Object XXI(SparkChainSessionRepository sparkChainSessionRepository, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 100;
        }
        return sparkChainSessionRepository.I0iXXO(i, continuation);
    }

    @tb1
    public final TranslateSessionEntity I0IIOi() {
        return this.XOO0ii0.getTranslateFirst();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5, types: [T, java.util.List] */
    @tb1
    public final Object I0iXXO(int i, @aa1 Continuation<? super String> continuation) {
        SparkChainSessionRepository$saveToRoom$1 sparkChainSessionRepository$saveToRoom$1;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        uy0 uy0Var;
        T t;
        String sessionId;
        if (continuation instanceof SparkChainSessionRepository$saveToRoom$1) {
            sparkChainSessionRepository$saveToRoom$1 = (SparkChainSessionRepository$saveToRoom$1) continuation;
            int i2 = sparkChainSessionRepository$saveToRoom$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sparkChainSessionRepository$saveToRoom$1.label = i2 - Integer.MIN_VALUE;
            } else {
                sparkChainSessionRepository$saveToRoom$1 = new SparkChainSessionRepository$saveToRoom$1(this, continuation);
            }
        } else {
            sparkChainSessionRepository$saveToRoom$1 = new SparkChainSessionRepository$saveToRoom$1(this, continuation);
        }
        Object obj = sparkChainSessionRepository$saveToRoom$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i3 = sparkChainSessionRepository$saveToRoom$1.label;
        int i4 = 0;
        if (i3 == 0) {
            ResultKt.X1ii(obj);
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            objectRef = new Ref.ObjectRef();
            uy0 uy0Var2 = this.f54857iO;
            sparkChainSessionRepository$saveToRoom$1.L$0 = objectRef3;
            sparkChainSessionRepository$saveToRoom$1.L$1 = objectRef;
            sparkChainSessionRepository$saveToRoom$1.L$2 = uy0Var2;
            sparkChainSessionRepository$saveToRoom$1.I$0 = i;
            sparkChainSessionRepository$saveToRoom$1.I$1 = 0;
            sparkChainSessionRepository$saveToRoom$1.label = 1;
            if (uy0Var2.lock(null, sparkChainSessionRepository$saveToRoom$1) == objI0iXXO) {
                return objI0iXXO;
            }
            objectRef2 = objectRef3;
            uy0Var = uy0Var2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = sparkChainSessionRepository$saveToRoom$1.I$0;
            uy0Var = (uy0) sparkChainSessionRepository$saveToRoom$1.L$2;
            objectRef = (Ref.ObjectRef) sparkChainSessionRepository$saveToRoom$1.L$1;
            objectRef2 = (Ref.ObjectRef) sparkChainSessionRepository$saveToRoom$1.L$0;
            ResultKt.X1ii(obj);
        }
        try {
            ?? I0I0O111I = CollectionsKt___CollectionsKt.i0I0O111I(this.XIi00iiXO);
            objectRef2.element = I0I0O111I;
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
            objectRef.element = t;
            Unit unit = Unit.OXO1;
            uy0Var.unlock(null);
            if (((List) objectRef2.element).isEmpty()) {
                return "";
            }
            this.XOO0ii0.insert(new TranslateSessionEntity((String) objectRef.element, "", 0.0f, System.currentTimeMillis(), 0, 16, null));
            for (Object obj2 : CollectionsKt___CollectionsKt.X10i(XO0O10((List) objectRef2.element, (String) objectRef.element), i)) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.XOX0O0();
                }
                List<TranslateEntity> list = (List) obj2;
                List<Long> listInsertAll = this.XO0O10.insertAll(list);
                i1O0OXO1O.OXO1.OXO1(this.OXO1 + " insertSessionWithEntities 成功加入:" + listInsertAll.size() + "条数据 }");
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
                    for (TranslateEntity translateEntity2 : arrayList2) {
                        i1O0OXO1O.OXO1.OXO1(this.OXO1 + " insertSessionWithEntities 第" + i4 + " 批 失败内容：" + translateEntity2);
                    }
                }
                i4 = i5;
            }
            return objectRef.element;
        } catch (Throwable th) {
            uy0Var.unlock(null);
            throw th;
        }
    }

    @aa1
    /* JADX INFO: renamed from: IO */
    public final List<TranslateSessionWithFirstEntity> m38777IO() {
        return this.XOO0ii0.getAllSessionsWithFirstEntity();
    }

    @Transaction
    public final void IiI10X(@aa1 String sessionId) {
        Intrinsics.X0O(sessionId, "sessionId");
        TranslateSessionWithTranslation translateSessionWithTranslationXOO0ii0 = XOO0ii0(sessionId);
        if (translateSessionWithTranslationXOO0ii0 != null) {
            for (TranslateEntity translateEntity : translateSessionWithTranslationXOO0ii0.getTranslations()) {
                if (translateEntity.getAudioPath().length() > 0) {
                    File file = new File(translateEntity.getAudioPath());
                    if (file.isFile() && file.exists()) {
                        file.delete();
                    }
                }
                this.XO0O10.delete(translateEntity);
            }
            this.XOO0ii0.delete(translateSessionWithTranslationXOO0ii0.getSession());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @tb1
    public final Object O00(@aa1 Continuation<? super Unit> continuation) {
        SparkChainSessionRepository$clear$1 sparkChainSessionRepository$clear$1;
        uy0 uy0Var;
        if (continuation instanceof SparkChainSessionRepository$clear$1) {
            sparkChainSessionRepository$clear$1 = (SparkChainSessionRepository$clear$1) continuation;
            int i = sparkChainSessionRepository$clear$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sparkChainSessionRepository$clear$1.label = i - Integer.MIN_VALUE;
            } else {
                sparkChainSessionRepository$clear$1 = new SparkChainSessionRepository$clear$1(this, continuation);
            }
        } else {
            sparkChainSessionRepository$clear$1 = new SparkChainSessionRepository$clear$1(this, continuation);
        }
        Object obj = sparkChainSessionRepository$clear$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = sparkChainSessionRepository$clear$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            uy0 uy0Var2 = this.f54857iO;
            sparkChainSessionRepository$clear$1.L$0 = uy0Var2;
            sparkChainSessionRepository$clear$1.I$0 = 0;
            sparkChainSessionRepository$clear$1.label = 1;
            if (uy0Var2.lock(null, sparkChainSessionRepository$clear$1) == objI0iXXO) {
                return objI0iXXO;
            }
            uy0Var = uy0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uy0Var = (uy0) sparkChainSessionRepository$clear$1.L$0;
            ResultKt.X1ii(obj);
        }
        try {
            this.XIi00iiXO.clear();
            Unit unit = Unit.OXO1;
            uy0Var.unlock(null);
            this.O00 = null;
            this.IiI10X = null;
            return unit;
        } catch (Throwable th) {
            uy0Var.unlock(null);
            throw th;
        }
    }

    @tb1
    public final TranslateSessionEntity OIX0iXi(@aa1 String sessionId) {
        Intrinsics.X0O(sessionId, "sessionId");
        return this.XOO0ii0.querySessionById(sessionId);
    }

    @aa1
    public final List<TranslateSessionEntity> OIi0() {
        return this.XOO0ii0.getAllTranslationList();
    }

    @Transaction
    public final void X1ii(@aa1 String sessionId) {
        Intrinsics.X0O(sessionId, "sessionId");
        TranslateSessionWithTranslation translateSessionWithTranslationXOO0ii0 = XOO0ii0(sessionId);
        if (translateSessionWithTranslationXOO0ii0 != null) {
            for (TranslateEntity translateEntity : translateSessionWithTranslationXOO0ii0.getTranslations()) {
                if (translateEntity.getAudioPath().length() > 0) {
                    File file = new File(translateEntity.getAudioPath());
                    if (file.isFile() && file.exists()) {
                        file.delete();
                    }
                }
            }
            this.XOO0ii0.update(TranslateSessionEntity.copy$default(translateSessionWithTranslationXOO0ii0.getSession(), null, null, 0.0f, 0L, ActionDoneType.COMPLETE.getFlag(), 15, null));
        }
    }

    @tb1
    public final Object XIi00iiXO(@aa1 iOIXXXII0 ioixxxii0, @aa1 Continuation<? super Unit> continuation) {
        this.O00 = ioixxxii0;
        Object objM38778iO = m38778iO(ioixxxii0, continuation);
        return objM38778iO == C2798pb.I0iXXO() ? objM38778iO : Unit.OXO1;
    }

    public final List<TranslateEntity> XO0O10(List<TranslateEntity> list, String str) {
        List<TranslateEntity> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(TranslateEntity.copy$default((TranslateEntity) it.next(), null, null, null, str, 0.0f, false, null, null, null, 0L, 0, 2039, null));
        }
        return arrayList;
    }

    @tb1
    public final TranslateSessionWithTranslation XOO0ii0(@aa1 String sessionId) {
        Intrinsics.X0O(sessionId, "sessionId");
        return this.XOO0ii0.queryBySessionId(sessionId);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: iO */
    public final Object m38778iO(iOIXXXII0 ioixxxii0, Continuation<? super Unit> continuation) {
        SparkChainSessionRepository$addSttToList$1 sparkChainSessionRepository$addSttToList$1;
        TranslateEntity translateEntity;
        uy0 uy0Var;
        if (continuation instanceof SparkChainSessionRepository$addSttToList$1) {
            sparkChainSessionRepository$addSttToList$1 = (SparkChainSessionRepository$addSttToList$1) continuation;
            int i = sparkChainSessionRepository$addSttToList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sparkChainSessionRepository$addSttToList$1.label = i - Integer.MIN_VALUE;
            } else {
                sparkChainSessionRepository$addSttToList$1 = new SparkChainSessionRepository$addSttToList$1(this, continuation);
            }
        } else {
            sparkChainSessionRepository$addSttToList$1 = new SparkChainSessionRepository$addSttToList$1(this, continuation);
        }
        Object obj = sparkChainSessionRepository$addSttToList$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = sparkChainSessionRepository$addSttToList$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String string = UUID.randomUUID().toString();
            Intrinsics.O10IXXX0X(string, "toString(...)");
            String string2 = UUID.randomUUID().toString();
            Intrinsics.O10IXXX0X(string2, "toString(...)");
            Float fI1XOi1 = ioixxxii0.I1XOi1();
            float fFloatValue = fI1XOi1 != null ? fI1XOi1.floatValue() : 0.0f;
            String strXiOIii1 = ioixxxii0.XiOIii1();
            String str = strXiOIii1 == null ? "" : strXiOIii1;
            String strXX0 = ioixxxii0.XX0();
            String str2 = strXX0 == null ? "" : strXX0;
            String strO10IXXX0X = ioixxxii0.O10IXXX0X();
            String str3 = strO10IXXX0X == null ? "" : strO10IXXX0X;
            String strIIX1OXO = ioixxxii0.IIX1OXO();
            String str4 = strIIX1OXO == null ? "" : strIIX1OXO;
            String strOiIIX101O = ioixxxii0.OiIIX101O();
            String str5 = strOiIIX101O == null ? "" : strOiIIX101O;
            Integer numX0O = ioixxxii0.X0O();
            TranslateEntity translateEntity2 = new TranslateEntity(string2, str2, str, string, fFloatValue, false, str3, str4, str5, jCurrentTimeMillis, numX0O != null ? numX0O.intValue() : ChatShowType.FROM.getFlag(), 32, null);
            uy0 uy0Var2 = this.f54857iO;
            sparkChainSessionRepository$addSttToList$1.L$0 = SpillingKt.OXO1(ioixxxii0);
            sparkChainSessionRepository$addSttToList$1.L$1 = SpillingKt.OXO1(string);
            sparkChainSessionRepository$addSttToList$1.L$2 = SpillingKt.OXO1(string2);
            sparkChainSessionRepository$addSttToList$1.L$3 = SpillingKt.OXO1(str);
            sparkChainSessionRepository$addSttToList$1.L$4 = SpillingKt.OXO1(str2);
            sparkChainSessionRepository$addSttToList$1.L$5 = translateEntity2;
            sparkChainSessionRepository$addSttToList$1.L$6 = uy0Var2;
            sparkChainSessionRepository$addSttToList$1.J$0 = jCurrentTimeMillis;
            sparkChainSessionRepository$addSttToList$1.F$0 = fFloatValue;
            sparkChainSessionRepository$addSttToList$1.I$0 = 0;
            sparkChainSessionRepository$addSttToList$1.label = 1;
            if (uy0Var2.lock(null, sparkChainSessionRepository$addSttToList$1) == objI0iXXO) {
                return objI0iXXO;
            }
            translateEntity = translateEntity2;
            uy0Var = uy0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uy0Var = (uy0) sparkChainSessionRepository$addSttToList$1.L$6;
            translateEntity = (TranslateEntity) sparkChainSessionRepository$addSttToList$1.L$5;
            ResultKt.X1ii(obj);
        }
        try {
            List<TranslateEntity> list = this.XIi00iiXO;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!Intrinsics.XOO0ii0(((TranslateEntity) it.next()).getRequestId(), translateEntity.getRequestId()));
                return Unit.OXO1;
            }
            this.XIi00iiXO.add(translateEntity);
            return Unit.OXO1;
        } finally {
            uy0Var.unlock(null);
        }
    }
}
