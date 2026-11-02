.class public interface abstract Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnIdentificationCallback"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback$DefaultImpls;
    }
.end annotation


# direct methods
.method public static synthetic access$onComplete$jd(Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onComplete(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$onEndSuccess$jd(Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;)V
    .locals 0

    invoke-super {p0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onEndSuccess()V

    return-void
.end method

.method public static synthetic access$onIdentificationError$jd(Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onIdentificationError(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$onProcessComplete$jd(Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onProcessComplete(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$onStartSuccess$jd(Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;)V
    .locals 0

    invoke-super {p0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onStartSuccess()V

    return-void
.end method


# virtual methods
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

.method public onEndSuccess()V
    .locals 0

    return-void
.end method

.method public onIdentificationError(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "msg"

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

.method public onStartSuccess()V
    .locals 0

    return-void
.end method
