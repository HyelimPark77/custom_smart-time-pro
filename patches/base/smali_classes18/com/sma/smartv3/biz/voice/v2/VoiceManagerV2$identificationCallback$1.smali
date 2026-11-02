.class public final Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$identificationCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;


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

.method public static synthetic O00(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$identificationCallback$1;->onIdentificationError$lambda$3(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OXO1(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$identificationCallback$1;->onProcessComplete$lambda$1(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$identificationCallback$1;->onEndSuccess$lambda$4(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$identificationCallback$1;->onStartSuccess$lambda$0(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iO(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$identificationCallback$1;->onComplete$lambda$2(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final onComplete$lambda$2(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onIdentificationComplete(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onEndSuccess$lambda$4(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onIdentificationEndSuccess()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onIdentificationError$lambda$3(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onIdentificationError(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onProcessComplete$lambda$1(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onIdentificationProcessComplete(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onStartSuccess$lambda$0(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onIdentificationStartSuccess()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public onComplete(Ljava/lang/String;)V
    .locals 4

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManagerV2 VoiceManagerV2 identification -> onComplete: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->sendTranslationResult$default(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v2, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->onAIResultConsumption$default(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Ljava/lang/String;IILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/kj6;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/kj6;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->access$notifyCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onEndSuccess()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManagerV2 VoiceManagerV2 identification -> onEndSuccess: "

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ij6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/ij6;-><init>()V

    invoke-static {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->access$notifyCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onIdentificationError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManagerV2 VoiceManagerV2 identification -> onError: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/jj6;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/jj6;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->access$notifyCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onProcessComplete(Ljava/lang/String;)V
    .locals 2

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mj6;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/mj6;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->access$notifyCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onStartSuccess()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManagerV2 VoiceManagerV2 identification -> onStartSuccess"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/lj6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/lj6;-><init>()V

    invoke-static {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->access$notifyCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
