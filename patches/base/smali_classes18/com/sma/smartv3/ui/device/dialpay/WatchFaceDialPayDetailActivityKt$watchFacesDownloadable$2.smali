.class final Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt;->OXO1(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWatchFaceDialPayDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,865:1\n310#2,11:866\n*S KotlinDebug\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2\n*L\n841#1:866,11\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.device.dialpay.WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2"
    f = "WatchFaceDialPayDetailActivity.kt"
    i = {
        0x0
    }
    l = {
        0x362
    }
    m = "invokeSuspend"
    n = {
        "$i$f$suspendCancellableCoroutine"
    }
    s = {
        "I$0"
    }
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWatchFaceDialPayDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,865:1\n310#2,11:866\n*S KotlinDebug\n*F\n+ 1 WatchFaceDialPayDetailActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2\n*L\n841#1:866,11\n*E\n"
    }
.end annotation


# instance fields
.field I$0:I

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2;

    invoke-direct {p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2;-><init>(Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2;->I$0:I

    iput v2, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2;->label:I

    new-instance p1, Lkotlinx/coroutines/XIi00iiXO;

    invoke-static {p0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-direct {p1, v1, v2}, Lkotlinx/coroutines/XIi00iiXO;-><init>(Lkotlin/coroutines/Continuation;I)V

    invoke-virtual {p1}, Lkotlinx/coroutines/XIi00iiXO;->XXX11i()V

    new-instance v1, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2$XIi00iiXO;

    invoke-direct {v1, p1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2$XIi00iiXO;-><init>(Lcom/android/mltcode/paycertificationapi/IO0i;)V

    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->XXOXi()Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4, v1}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v5, Lcom/szabh/smable3/BleKey;->GET_WATCH_FACE_MAX_SIZE:Lcom/szabh/smable3/BleKey;

    sget-object v6, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v10, 0x1c

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    new-instance v2, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2$OXO1;

    invoke-direct {v2, v1, p1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2$OXO1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2$XIi00iiXO;Lcom/android/mltcode/paycertificationapi/IO0i;)V

    invoke-interface {p1, v2}, Lcom/android/mltcode/paycertificationapi/IO0i;->iX(Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_2
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p1}, Lkotlinx/coroutines/XIi00iiXO;->OII()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_3

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_3
    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    return-object p1
.end method
