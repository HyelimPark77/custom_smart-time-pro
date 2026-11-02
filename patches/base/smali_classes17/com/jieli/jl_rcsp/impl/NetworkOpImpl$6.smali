.class Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$6;
.super Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$6;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$6;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->isNetworkOTA()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    if-eq p2, p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$6;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    const/16 p2, 0x2000

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;I)V

    :cond_0
    return-void
.end method
