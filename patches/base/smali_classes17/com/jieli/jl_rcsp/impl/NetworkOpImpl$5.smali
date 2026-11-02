.class Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

.field public final synthetic b:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$5;->b:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$5;->a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$5;->a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;)V
    .locals 3

    .line 2
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->getResult()I

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$5;->a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz p1, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void

    .line 4
    :cond_1
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->getResult()I

    move-result p1

    const/16 v0, 0x3005

    const/4 v1, 0x0

    const/16 v2, 0x33

    .line 5
    invoke-static {v2, v0, p1, v1}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$5;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$5;->onSuccess(Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;)V

    return-void
.end method
