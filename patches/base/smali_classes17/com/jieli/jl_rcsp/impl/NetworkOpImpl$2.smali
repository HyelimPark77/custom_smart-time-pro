.class Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->startNetworkOTA(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/network/OTAParam;Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "[B>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$2;->onSuccess([B)V

    return-void
.end method

.method public onSuccess([B)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->c(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->setOtaData([B)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    .line 3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->c(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->getOtaData()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->b(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;I)V

    return-void
.end method
