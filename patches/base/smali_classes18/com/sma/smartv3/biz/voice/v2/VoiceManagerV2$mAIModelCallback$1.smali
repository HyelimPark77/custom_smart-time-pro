.class public final Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$mAIModelCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$mAIModelCallback$1;->onAIModelError$lambda$2(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$mAIModelCallback$1;->onComplete$lambda$1(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iO(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$mAIModelCallback$1;->onProcessComplete$lambda$0(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final onAIModelError$lambda$2(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onAIModelAIModelError(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onComplete$lambda$1(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onAIModelComplete(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onProcessComplete$lambda$0(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onAIModelProcessComplete(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public onAIModelError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManagerV2 VoiceManagerV2 onAIModelError -> onComplete: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pj6;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/pj6;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->access$notifyCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onComplete(Ljava/lang/String;)V
    .locals 3

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManagerV2 VoiceManagerV2 mAIModelCallback -> onComplete: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/nj6;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/nj6;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->access$notifyCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onProcessComplete(Ljava/lang/String;)V
    .locals 3

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManagerV2 VoiceManagerV2 mAIModelCallback -> onProcessComplete: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/oj6;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/oj6;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->access$notifyCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
