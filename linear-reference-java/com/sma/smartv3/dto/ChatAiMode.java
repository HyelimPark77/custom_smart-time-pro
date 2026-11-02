package com.sma.smartv3.dto;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iiO0IOiOO;
import com.android.mltcode.paycertificationapi.q40;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.iO;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nChatAiMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatAiMode.kt\ncom/sma/smartv3/dto/ChatAiMode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1208#2,2:24\n1236#2,4:26\n*S KotlinDebug\n*F\n+ 1 ChatAiMode.kt\ncom/sma/smartv3/dto/ChatAiMode\n*L\n13#1:24,2\n13#1:26,4\n*E\n"})
public final enum ChatAiMode extends Enum<ChatAiMode> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ ChatAiMode[] $VALUES = null;
    public static final ChatAiMode BAI_DU = null;

    @aa1
    public static final OXO1 Companion = null;
    public static final ChatAiMode DEEP_SEEK = null;
    public static final ChatAiMode OPEN_AI = null;
    public static final ChatAiMode QIAN_WEN = null;
    public static final ChatAiMode SPARK_CHAIN = null;

    @aa1
    private static final Lazy<Map<Integer, ChatAiMode>> flagToEnumMap$delegate = null;
    private final int modelFlag;

    @aa1
    private final String modelName;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @tb1
        public final ChatAiMode OXO1(int r2) {
            return XIi00iiXO().get(Integer.valueOf(r2));
        }

        public final Map<Integer, ChatAiMode> XIi00iiXO() {
            return (Map) ChatAiMode.access$getFlagToEnumMap$delegate$cp().getValue();
        }

        public final boolean XO0O10(int r2) {
            return XIi00iiXO().containsKey(Integer.valueOf(r2));
        }

        @tb1
        public final String iO(@tb1 Integer r2) {
            ChatAiMode r3 = XIi00iiXO().get(r2);
            if (r3 != null) goto L5;
            return null;
        L5:
            return r3.getModelName();
        }

        public OXO1() {
        }
    }

    private static final /* synthetic */ ChatAiMode[] $values() {
        return new ChatAiMode[]{BAI_DU, SPARK_CHAIN, OPEN_AI, DEEP_SEEK, QIAN_WEN};
    }

    static {
        BAI_DU = new ChatAiMode("BAI_DU", 0, "baiduAIService", 1);
        SPARK_CHAIN = new ChatAiMode("SPARK_CHAIN", 1, "sparkAIService", 2);
        OPEN_AI = new ChatAiMode("OPEN_AI", 2, "openAIService", 3);
        DEEP_SEEK = new ChatAiMode("DEEP_SEEK", 3, "deepseekAIService", 4);
        QIAN_WEN = new ChatAiMode("QIAN_WEN", 4, "qwenAIService", 7);
        ChatAiMode[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new OXO1(null);
        flagToEnumMap$delegate = LazyKt__LazyJVMKt.iO(new iiO0IOiOO());
    }

    private ChatAiMode(String r1, int r2, String r3, int r4) {
        super(r1, r2);
        this.modelName = r3;
        this.modelFlag = r4;
    }

    public static /* synthetic */ Map OXO1() {
        return flagToEnumMap_delegate$lambda$0();
    }

    public static final /* synthetic */ Lazy access$getFlagToEnumMap$delegate$cp() {
        return flagToEnumMap$delegate;
    }

    private static final Map flagToEnumMap_delegate$lambda$0() {
        EnumEntries<ChatAiMode> r0 = getEntries();
        LinkedHashMap r2 = new LinkedHashMap(iO.XX0(q40.IO(CollectionsKt__IterablesKt.X00XIX1(r0, 10)), 16));
        Iterator<ChatAiMode> r1 = r0.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ChatAiMode r3 = r1.next();
        r2.put(Integer.valueOf(r3.modelFlag), r3);
        goto L4
    L6:
        return r2;
    }

    @aa1
    public static EnumEntries<ChatAiMode> getEntries() {
        return $ENTRIES;
    }

    public static ChatAiMode valueOf(String r1) {
        return (ChatAiMode) Enum.valueOf(ChatAiMode.class, r1);
    }

    public static ChatAiMode[] values() {
        return (ChatAiMode[]) $VALUES.clone();
    }

    public final int getModelFlag() {
        return this.modelFlag;
    }

    @aa1
    public final String getModelName() {
        return this.modelName;
    }
}
