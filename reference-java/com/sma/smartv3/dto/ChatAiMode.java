package com.sma.smartv3.dto;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q40;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.dto.ChatAiMode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C20141iO;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nChatAiMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatAiMode.kt\ncom/sma/smartv3/dto/ChatAiMode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1208#2,2:24\n1236#2,4:26\n*S KotlinDebug\n*F\n+ 1 ChatAiMode.kt\ncom/sma/smartv3/dto/ChatAiMode\n*L\n13#1:24,2\n13#1:26,4\n*E\n"})
public enum ChatAiMode {
    BAI_DU("baiduAIService", 1),
    SPARK_CHAIN("sparkAIService", 2),
    OPEN_AI("openAIService", 3),
    DEEP_SEEK("deepseekAIService", 4),
    QIAN_WEN("qwenAIService", 7);

    private final int modelFlag;

    @aa1
    private final String modelName;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    @aa1
    private static final Lazy<Map<Integer, ChatAiMode>> flagToEnumMap$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiO0IOiOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChatAiMode.flagToEnumMap_delegate$lambda$0();
        }
    });

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @tb1
        public final ChatAiMode OXO1(int i) {
            return XIi00iiXO().get(Integer.valueOf(i));
        }

        public final Map<Integer, ChatAiMode> XIi00iiXO() {
            return (Map) ChatAiMode.flagToEnumMap$delegate.getValue();
        }

        public final boolean XO0O10(int i) {
            return XIi00iiXO().containsKey(Integer.valueOf(i));
        }

        @tb1
        /* JADX INFO: renamed from: iO */
        public final String m38202iO(@tb1 Integer num) {
            ChatAiMode chatAiMode = XIi00iiXO().get(num);
            if (chatAiMode != null) {
                return chatAiMode.getModelName();
            }
            return null;
        }

        public OXO1() {
        }
    }

    ChatAiMode(String str, int i) {
        this.modelName = str;
        this.modelFlag = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map flagToEnumMap_delegate$lambda$0() {
        EnumEntries<ChatAiMode> entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C20141iO.XX0(q40.m2872IO(CollectionsKt__IterablesKt.X00XIX1(entries, 10)), 16));
        for (ChatAiMode chatAiMode : entries) {
            linkedHashMap.put(Integer.valueOf(chatAiMode.modelFlag), chatAiMode);
        }
        return linkedHashMap;
    }

    @aa1
    public static EnumEntries<ChatAiMode> getEntries() {
        return $ENTRIES;
    }

    public final int getModelFlag() {
        return this.modelFlag;
    }

    @aa1
    public final String getModelName() {
        return this.modelName;
    }
}
