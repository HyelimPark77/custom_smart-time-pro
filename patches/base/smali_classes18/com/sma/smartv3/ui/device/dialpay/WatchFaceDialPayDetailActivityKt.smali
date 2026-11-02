.class public final Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final OXO1(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p0    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2;-><init>(Lkotlin/coroutines/Continuation;)V

    const-wide/16 v1, 0x7d0

    invoke-static {v1, v2, v0, p0}, Lkotlinx/coroutines/TimeoutKt;->iO(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
