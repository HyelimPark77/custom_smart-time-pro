.class public final Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mAIModelCallback:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;

    const-string v0, "AIModelManagerV2"

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;->TAG:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getTAG$p()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic textAIFunction$default(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, -0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;->textAIFunction(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V

    return-void
.end method

.method public static synthetic textAiChat$default(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, -0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;->textAiChat(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V

    return-void
.end method

.method public static synthetic textAiTranslation$default(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, -0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;->textAiTranslation(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V

    return-void
.end method

.method public static synthetic textAiWatchFace$default(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, -0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;->textAiWatchFace(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V

    return-void
.end method


# virtual methods
.method public final textAIFunction(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAICallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p2, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;->mAIModelCallback:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isTranslation()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;->textAiTranslation(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isSupportAIWatchface()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;->textAiWatchFace(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V

    return-void

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;->textAiChat(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V

    return-void
.end method

.method public final textAiChat(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAICallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    new-instance v2, Lcom/sma/smartv3/model/AIQuestion;

    sget-object v3, Lcom/sma/smartv3/model/AIFunctionType;->AI:Lcom/sma/smartv3/model/AIFunctionType;

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, p1

    invoke-direct/range {v2 .. v10}, Lcom/sma/smartv3/model/AIQuestion;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->iXOII()I

    move-result v6

    new-instance v3, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$textAiChat$1;

    invoke-direct {v3, p2}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$textAiChat$1;-><init>(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    move v7, p3

    invoke-virtual/range {v1 .. v7}, Lcom/sma/smartv3/biz/AIManager;->iIXi1iiXI(Lcom/sma/smartv3/model/AIQuestion;Lcom/android/mltcode/paycertificationapi/O1XIiIO;ZZII)V

    return-void
.end method

.method public final textAiTranslation(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAICallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->textTranslation(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V

    return-void
.end method

.method public final textAiWatchFace(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAICallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/AIWatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/AIWatchFaceManager;

    new-instance v1, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$textAiWatchFace$1;

    invoke-direct {v1, p2}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$textAiWatchFace$1;-><init>(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;)V

    invoke-virtual {v0, p1, v1, p3}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->OiIIX101O(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;I)V

    return-void
.end method
