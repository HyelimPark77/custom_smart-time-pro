.class public final Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1;
.super Lcom/bumptech/glide/request/target/SimpleTarget;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1;->OXO1(Lcom/sma/smartv3/model/DeviceConfigInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/request/target/SimpleTarget<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic I1:Ljava/lang/String;

.field public final synthetic IO:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1;->IO:Ljava/lang/String;

    iput-object p2, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1;->I1:Ljava/lang/String;

    invoke-direct {p0}, Lcom/bumptech/glide/request/target/SimpleTarget;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Landroid/graphics/Bitmap;Lcom/bumptech/glide/request/transition/Transition;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lcom/bumptech/glide/request/transition/Transition<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    const-string p2, "resource"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p2

    invoke-static {p2}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;

    iget-object p2, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1;->IO:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1;->I1:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {v3, p1, p2, v1, v2}, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1$onResourceReady$1;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Lcom/bumptech/glide/request/transition/Transition;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/DeviceInfoChecker$getDeviceInfo$1$handleResponse$1;->OXO1(Landroid/graphics/Bitmap;Lcom/bumptech/glide/request/transition/Transition;)V

    return-void
.end method
