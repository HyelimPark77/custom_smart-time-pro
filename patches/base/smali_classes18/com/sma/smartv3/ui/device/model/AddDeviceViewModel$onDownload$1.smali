.class public final Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel$onDownload$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/androidnetworklib/method/HttpProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;->onDownload(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/sma/androidnetworklib/method/HttpProgressCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;

.field public final synthetic XIi00iiXO:Ljava/lang/String;

.field public final synthetic iO:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel$onDownload$1;->OXO1:Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel$onDownload$1;->XIi00iiXO:Ljava/lang/String;

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel$onDownload$1;->iO:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 6

    const-string p1, "DeviceOnlineInfo handleResponse"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel$onDownload$1;->OXO1:Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel$onDownload$1$handleResponse$1;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel$onDownload$1;->OXO1:Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel$onDownload$1;->XIi00iiXO:Ljava/lang/String;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel$onDownload$1;->iO:Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    invoke-direct {v3, p1, v2, v4, v5}, Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel$onDownload$1$handleResponse$1;-><init>(Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "download firmware error -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public handleProgress(I)V
    .locals 0

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel$onDownload$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
