.class public final Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$startRealTime$1$doInBackground$1;
.super Lcom/baidu/ai/speech/realtime/full/download/SimpleDownloader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$startRealTime$1;->doInBackground()Ljava/lang/Void;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/ai/speech/realtime/full/download/SimpleDownloader;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/String;)V
    .locals 3

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getTAG$p()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onFailure -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const v0, 0x7f141286

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onIdentificationError(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onMessage(Lcom/baidu/ai/speech/realtime/full/download/Result;)V
    .locals 4

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getTAG$p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/baidu/ai/speech/realtime/full/download/Result;->getOrignalJsonStr()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onMessage -> "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/baidu/ai/speech/realtime/full/download/Result;->isError()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/baidu/ai/speech/realtime/full/download/Result;->getResult()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/baidu/ai/speech/realtime/full/download/Result;->isFin()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onComplete(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onProcessComplete(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/baidu/ai/speech/realtime/full/download/Result;->getResult()Ljava/lang/String;

    move-result-object p1

    const-string v1, "getResult(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onIdentificationError(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
