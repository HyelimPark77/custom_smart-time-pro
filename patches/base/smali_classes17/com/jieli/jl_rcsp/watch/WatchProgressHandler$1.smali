.class Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$1;
.super Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a(IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$1;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onPhoneCallStatusChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 2

    invoke-static {}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPhoneCallStatusChange : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "handleStopEventBySysException"

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p2, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$1;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->unregisterOnRcspEventListener(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$1;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->b(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)V

    :cond_0
    return-void
.end method
