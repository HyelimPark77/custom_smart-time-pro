.class final Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1;->OXO1(Landroid/graphics/Bitmap;Lcom/bumptech/glide/request/transition/Transition;)V
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.biz.DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1"
    f = "DeviceInfoChecker.kt"
    i = {}
    l = {
        0x2a7
    }
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $bleName:Ljava/lang/String;

.field final synthetic $firmwareFlag:Ljava/lang/String;

.field final synthetic $resource:Landroid/graphics/Bitmap;

.field label:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;->$resource:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;->$bleName:Ljava/lang/String;

    iput-object p3, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;->$firmwareFlag:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance p1, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;

    iget-object v0, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;->$resource:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;->$bleName:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;->$firmwareFlag:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;->$resource:Landroid/graphics/Bitmap;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    iget-object v3, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;->$bleName:Ljava/lang/String;

    iget-object v4, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;->$firmwareFlag:Ljava/lang/String;

    invoke-static {v1, v3, v4}, Lcom/android/mltcode/paycertificationapi/uz0;->X1(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p1, v1, v3}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;)Z

    iput v2, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;->label:I

    const-wide/16 v1, 0x64

    invoke-static {v1, v2, p0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    const-string p1, "pair_image_change"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
