.class Lcom/jieli/jl_rcsp/watch/WatchBase$12;
.super Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/watch/WatchBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/watch/WatchBase;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/WatchBase;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$12;->a:Lcom/jieli/jl_rcsp/watch/WatchBase;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    const/4 p1, 0x1

    if-eq p2, p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$12;->a:Lcom/jieli/jl_rcsp/watch/WatchBase;

    const/4 p2, 0x0

    iput-boolean p2, p1, Lcom/jieli/jl_rcsp/watch/WatchBase;->isOTAResource:Z

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$12;->a:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iput-boolean p2, p1, Lcom/jieli/jl_rcsp/watch/WatchBase;->isSysException:Z

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->b(Lcom/jieli/jl_rcsp/watch/WatchBase;)V

    :cond_0
    return-void
.end method
