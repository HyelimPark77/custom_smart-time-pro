.class public final Lcom/sma/smartv3/util/ChatWithQWManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChatWithQWManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatWithQWManager.kt\ncom/sma/smartv3/util/ChatWithQWManager\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,138:1\n17#2:139\n19#2:143\n46#3:140\n51#3:142\n105#4:141\n*S KotlinDebug\n*F\n+ 1 ChatWithQWManager.kt\ncom/sma/smartv3/util/ChatWithQWManager\n*L\n37#1:139\n37#1:143\n37#1:140\n37#1:142\n37#1:141\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nChatWithQWManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatWithQWManager.kt\ncom/sma/smartv3/util/ChatWithQWManager\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,138:1\n17#2:139\n19#2:143\n46#3:140\n51#3:142\n105#4:141\n*S KotlinDebug\n*F\n+ 1 ChatWithQWManager.kt\ncom/sma/smartv3/util/ChatWithQWManager\n*L\n37#1:139\n37#1:143\n37#1:140\n37#1:142\n37#1:141\n*E\n"
    }
.end annotation


# instance fields
.field public I0IIOi:J

.field public final I0iXXO:Lcom/sma/smartv3/util/audio_play/MediaPlayManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final IO:Lcom/sma/smartv3/util/tts/TTSManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public IiI10X:I

.field public final O00:Lcom/android/mltcode/paycertificationapi/ii0iIIX0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ii0iIIX0<",
            "Lcom/sma/smartv3/model/AiChatAnswerData;",
            ">;"
        }
    .end annotation
.end field

.field public final OIX0iXi:Lcom/sma/smartv3/util/tts/ServerTTSStrategy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final OIi0:J

.field public final OXO1:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XIi00iiXO:Lcom/android/mltcode/paycertificationapi/ty0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ty0<",
            "Lcom/android/mltcode/paycertificationapi/Iii1I;",
            ">;"
        }
    .end annotation
.end field

.field public final XO0O10:Lcom/android/mltcode/paycertificationapi/ry0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ry0<",
            "Lcom/sma/smartv3/model/AiChatAnswerData;",
            ">;"
        }
    .end annotation
.end field

.field public final XOO0ii0:I

.field public final iO:Lcom/android/mltcode/paycertificationapi/k85;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Lcom/android/mltcode/paycertificationapi/Iii1I;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "ChatWithQWManager"

    iput-object v0, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->OXO1:Ljava/lang/String;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/Iii1I$XIi00iiXO;->OXO1:Lcom/android/mltcode/paycertificationapi/Iii1I$XIi00iiXO;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/l85;->OXO1(Ljava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/ty0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->XXI(Lcom/android/mltcode/paycertificationapi/ty0;)Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->iO:Lcom/android/mltcode/paycertificationapi/k85;

    const/4 v0, 0x0

    const/16 v1, 0x40

    const/4 v2, 0x0

    const/4 v3, 0x5

    invoke-static {v0, v1, v2, v3, v2}, Lcom/android/mltcode/paycertificationapi/m94;->XIi00iiXO(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ry0;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->XO0O10:Lcom/android/mltcode/paycertificationapi/ry0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->I0iXXO(Lcom/android/mltcode/paycertificationapi/ry0;)Lcom/android/mltcode/paycertificationapi/l94;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1;

    invoke-direct {v1, v0, p0}, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1;-><init>(Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Lcom/sma/smartv3/util/ChatWithQWManager;)V

    iput-object v1, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->O00:Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    iput v3, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->XOO0ii0:I

    const-wide/16 v0, 0x3c

    iput-wide v0, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->OIi0:J

    new-instance v0, Lcom/sma/smartv3/util/tts/TTSManager;

    invoke-direct {v0}, Lcom/sma/smartv3/util/tts/TTSManager;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->IO:Lcom/sma/smartv3/util/tts/TTSManager;

    new-instance v0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy;

    invoke-direct {v0}, Lcom/sma/smartv3/util/tts/ServerTTSStrategy;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->OIX0iXi:Lcom/sma/smartv3/util/tts/ServerTTSStrategy;

    new-instance v0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    const/4 v1, 0x1

    invoke-direct {v0, v2, v1, v2}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;-><init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->I0iXXO:Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/util/ChatWithQWManager;Lcom/sma/smartv3/model/AiChatAnswerData;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/ChatWithQWManager;->IiI10X(Lcom/sma/smartv3/model/AiChatAnswerData;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/util/ChatWithQWManager;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->OXO1:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic XO0O10(Lcom/sma/smartv3/util/ChatWithQWManager;)Lcom/android/mltcode/paycertificationapi/ty0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/ty0;

    return-object p0
.end method

.method public static final synthetic iO(Lcom/sma/smartv3/util/ChatWithQWManager;)Lcom/android/mltcode/paycertificationapi/ry0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->XO0O10:Lcom/android/mltcode/paycertificationapi/ry0;

    return-object p0
.end method


# virtual methods
.method public final I0IIOi()Lcom/android/mltcode/paycertificationapi/k85;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Lcom/android/mltcode/paycertificationapi/Iii1I;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->iO:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method

.method public final IO()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->IO:Lcom/sma/smartv3/util/tts/TTSManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/tts/TTSManager;->iO()V

    return-void
.end method

.method public final IiI10X(Lcom/sma/smartv3/model/AiChatAnswerData;)Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->I0IIOi:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->OIi0:J

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-gtz v0, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AiChatAnswerData;->getEnded()I

    move-result v0

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AiChatAnswerData;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget v2, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->IiI10X:I

    sub-int/2addr v0, v2

    iget v2, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->XOO0ii0:I

    if-le v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->I0IIOi:J

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AiChatAnswerData;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->IiI10X:I

    :cond_2
    return v1
.end method

.method public final O00(Ljava/lang/String;)Lcom/sma/smartv3/model/AiChatQuestionData;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/AiChatQuestionData;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/model/AiChatQuestionData;-><init>(Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final OIX0iXi(Lcom/sma/smartv3/model/AiChatQuestionData;)V
    .locals 3
    .param p1    # Lcom/sma/smartv3/model/AiChatQuestionData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "chatQuestion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/util/tts/TTSData;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AiChatQuestionData;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AiChatQuestionData;->getModel()Ljava/lang/String;

    move-result-object p1

    sget-object v2, Lcom/sma/smartv3/util/tts/TTSData$TTSType;->Server:Lcom/sma/smartv3/util/tts/TTSData$TTSType;

    invoke-direct {v0, v1, p1, v2}, Lcom/sma/smartv3/util/tts/TTSData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/util/tts/TTSData$TTSType;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->IO:Lcom/sma/smartv3/util/tts/TTSManager;

    iget-object v1, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->OIX0iXi:Lcom/sma/smartv3/util/tts/ServerTTSStrategy;

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/util/tts/TTSManager;->IiI10X(Lcom/android/mltcode/paycertificationapi/jl5;)Lcom/sma/smartv3/util/tts/TTSManager;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->I0iXXO:Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/util/tts/TTSManager;->O00(Lcom/android/mltcode/paycertificationapi/X1XXX0I0;)Lcom/sma/smartv3/util/tts/TTSManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/util/tts/TTSManager;->XO0O10(Lcom/sma/smartv3/util/tts/TTSData;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final OIi0(Ljava/lang/String;)V
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/ChatWithQWManager;->O00(Ljava/lang/String;)Lcom/sma/smartv3/model/AiChatQuestionData;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    iget-object v2, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/ty0;

    sget-object v3, Lcom/android/mltcode/paycertificationapi/Iii1I$iO;->OXO1:Lcom/android/mltcode/paycertificationapi/Iii1I$iO;

    invoke-interface {v2, v3}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    sget-object v2, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v6, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;

    invoke-direct {v6, v1, p0, v0, p1}, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;-><init>(Lcom/google/gson/Gson;Lcom/sma/smartv3/util/ChatWithQWManager;Ljava/lang/StringBuilder;Lcom/sma/smartv3/model/AiChatQuestionData;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-string v3, "/ai/chat"

    const/4 v4, 0x0

    invoke-static/range {v2 .. v8}, Lcom/sma/smartv3/network/NetWorkUtils;->postStreamRequest$default(Lcom/sma/smartv3/network/NetWorkUtils;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lcom/android/mltcode/paycertificationapi/O1XIiIO;ILjava/lang/Object;)Lokhttp3/sse/EventSource;

    return-void
.end method

.method public final XOO0ii0()Lcom/android/mltcode/paycertificationapi/ii0iIIX0;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/ii0iIIX0<",
            "Lcom/sma/smartv3/model/AiChatAnswerData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/ChatWithQWManager;->O00:Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    return-object v0
.end method
