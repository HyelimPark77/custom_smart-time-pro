.class public interface abstract Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnAIModelCallback"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback$DefaultImpls;
    }
.end annotation


# direct methods
.method public static synthetic access$onAIModelError$jd(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->onAIModelError(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$onComplete$jd(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->onComplete(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$onProcessComplete$jd(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->onProcessComplete(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onAIModelError(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onComplete(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onProcessComplete(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
