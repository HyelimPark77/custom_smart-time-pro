.class public final Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$recordCallBack$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;


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

.method public static synthetic O00(Lcom/sma/smartv3/model/AITranslation;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$recordCallBack$1;->onRecordResult$lambda$3(Lcom/sma/smartv3/model/AITranslation;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$recordCallBack$1;->onBeforeRecording$lambda$0(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$recordCallBack$1;->onStartRecording$lambda$1(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$recordCallBack$1;->onRecordResultError$lambda$4(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2$recordCallBack$1;->onStopRecording$lambda$2(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final onBeforeRecording$lambda$0(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onRecordingBeforeRecording()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onRecordResult$lambda$3(Lcom/sma/smartv3/model/AITranslation;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onRecordingResult(Lcom/sma/smartv3/model/AITranslation;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onRecordResultError$lambda$4(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onRecordingResultError(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onStartRecording$lambda$1(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onRecordingStartRecording()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onStopRecording$lambda$2(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onRecordingStop()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public onBeforeRecording()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManagerV2 VoiceManagerV2 onRecordResult -> onBeforeRecording"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/uj6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/uj6;-><init>()V

    invoke-static {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->access$notifyCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onRecordResult(Lcom/sma/smartv3/model/AITranslation;)V
    .locals 5

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, v3}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->sendTranslationResult$default(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v0, v2, v4, v1, v3}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->onAIResultConsumption$default(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Ljava/lang/String;IILjava/lang/Object;)V

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManagerV2 VoiceManagerV2 onRecordResult -> result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qj6;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/qj6;-><init>(Lcom/sma/smartv3/model/AITranslation;)V

    invoke-static {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->access$notifyCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onRecordResultError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManagerV2 VoiceManagerV2 onRecordResultError -> error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/sj6;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/sj6;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->access$notifyCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public bridge onRecordResultLanguage(Lcom/sma/smartv3/model/AISpeech;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->onRecordResultLanguage(Lcom/sma/smartv3/model/AISpeech;)V

    return-void
.end method

.method public onStartRecording()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManagerV2 VoiceManagerV2 onRecordResult ->onStartRecording"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/rj6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/rj6;-><init>()V

    invoke-static {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->access$notifyCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onStopRecording()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManagerV2 VoiceManagerV2 onRecordResult -> onStopRecording"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/tj6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/tj6;-><init>()V

    invoke-static {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->access$notifyCallback(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
