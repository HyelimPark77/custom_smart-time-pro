.class Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->syncDeviceInfo(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
        "Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

.field final synthetic b:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;->b:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;->a:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;->a:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;->onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;)V
    .locals 2

    .line 2
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isSupportMD5()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;->b:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    new-instance v1, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3$1;

    invoke-direct {v1, p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3$1;-><init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;)V

    invoke-static {v0, v1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;->a:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;->onSuccess(Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;)V

    return-void
.end method
