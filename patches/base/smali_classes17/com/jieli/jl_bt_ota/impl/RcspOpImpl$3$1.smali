.class Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;->onSuccess(Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

.field final synthetic b:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3$1;->b:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3$1;->a:Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 1

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3$1;->b:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;

    iget-object p1, p1, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;->a:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3$1;->a:Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    invoke-interface {p1, v0}, Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3$1;->onSuccess(Ljava/lang/String;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3$1;->b:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;

    iget-object p1, p1, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;->a:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3$1;->a:Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    invoke-interface {p1, v0}, Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
