.class public final Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation


# direct methods
.method public static onAIModelError(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->access$onAIModelError$jd(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onComplete(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->access$onComplete$jd(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onProcessComplete(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->access$onProcessComplete$jd(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;Ljava/lang/String;)V

    return-void
.end method
