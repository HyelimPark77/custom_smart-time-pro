.class Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1;->onSuccess(Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1$1;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1$1;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->a:Lcom/jieli/jl_rcsp/task/TaskListener;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/jieli/jl_rcsp/task/TaskListener;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onFinish(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/NfcMsg;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "success >> list = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "startTransferTask"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1$1;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1;

    iget-object p1, p1, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7$1;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;

    iget-object p1, p1, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$7;->a:Lcom/jieli/jl_rcsp/task/TaskListener;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/jieli/jl_rcsp/task/TaskListener;->onFinish()V

    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 0

    return-void
.end method
