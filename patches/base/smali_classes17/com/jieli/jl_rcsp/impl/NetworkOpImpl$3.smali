.class Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;ILjava/lang/String;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 4

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->isNetworkOTA()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->d(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    move-result-object p1

    if-nez p1, :cond_0

    .line 4
    sget-wide v0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->WAITING_START_STATE_TIMEOUT:J

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->getStartOtaTimeout()I

    move-result p1

    int-to-long v0, p1

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    .line 5
    :goto_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->e(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start OTA timeout = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "prepareOta"

    invoke-static {p1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->f(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Landroid/os/Handler;

    move-result-object p1

    const/16 v2, 0x1010

    invoke-virtual {p1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 7
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->f(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_1
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$3;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
