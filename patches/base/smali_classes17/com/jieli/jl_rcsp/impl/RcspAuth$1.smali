.class Lcom/jieli/jl_rcsp/impl/RcspAuth$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/impl/RcspAuth;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/RcspAuth;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspAuth;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth$1;->a:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget v1, p1, Landroid/os/Message;->what:I

    const/4 v2, 0x1

    const v3, 0xa011

    const/16 v4, 0x12

    const/16 v5, 0x11

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth$1;->a:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->access$000(Lcom/jieli/jl_rcsp/impl/RcspAuth;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->isAuthDevice()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth$1;->a:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    invoke-static {v0, p1, v3}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->access$400(Lcom/jieli/jl_rcsp/impl/RcspAuth;Landroid/bluetooth/BluetoothDevice;I)V

    goto :goto_0

    :cond_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth$1;->a:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->access$000(Lcom/jieli/jl_rcsp/impl/RcspAuth;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;

    if-nez v1, :cond_3

    return v0

    :cond_3
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->getRetryNum()I

    move-result v0

    const/4 v6, 0x2

    if-ge v0, v6, :cond_4

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->getRetryNum()I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->setRetryNum(I)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth$1;->a:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->access$100(Lcom/jieli/jl_rcsp/impl/RcspAuth;)Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;

    move-result-object v0

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/impl/RcspAuth$AuthTask;->getRandomData()[B

    move-result-object v1

    invoke-interface {v0, v3, v1}, Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;->sendAuthDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth$1;->a:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->access$200(Lcom/jieli/jl_rcsp/impl/RcspAuth;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth$1;->a:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->access$200(Lcom/jieli/jl_rcsp/impl/RcspAuth;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth$1;->a:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->access$200(Lcom/jieli/jl_rcsp/impl/RcspAuth;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v5, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-static {}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->access$300()J

    move-result-wide v3

    invoke-virtual {v0, p1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspAuth$1;->a:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    invoke-static {v0, p1, v3}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->access$400(Lcom/jieli/jl_rcsp/impl/RcspAuth;Landroid/bluetooth/BluetoothDevice;I)V

    :cond_5
    :goto_0
    return v2
.end method
