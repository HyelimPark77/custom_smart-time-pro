.class Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a([B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;

.field public final synthetic b:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$4;->b:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$4;->a:Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBegin(I)V
    .locals 0

    return-void
.end method

.method public onError(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$4;->b:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;ILjava/lang/String;)V

    return-void
.end method

.method public onProgress(F)V
    .locals 1

    float-to-int p1, p1

    const/16 v0, 0x64

    if-lt p1, v0, :cond_0

    const/16 p1, 0x63

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$4;->a:Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;->onProgress(I)V

    :cond_1
    return-void
.end method

.method public onStop(I[B)V
    .locals 3

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$4;->b:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->d(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    move-result-object p1

    if-nez p1, :cond_0

    sget-wide p1, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->WAITING_END_STATE_TIMEOUT:J

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->getStopOtaTimeout()I

    move-result p1

    int-to-long p1, p1

    const-wide/16 v0, 0x3e8

    mul-long/2addr p1, v0

    :goto_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$4;->b:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->e(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "stop OTA timeout = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "prepareOta"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$4;->b:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->f(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1010

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$4;->b:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->f(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method
