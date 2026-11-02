.class public Lcom/jieli/jl_rcsp/tool/CommandHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile b:Lcom/jieli/jl_rcsp/tool/CommandHelper;


# instance fields
.field public final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UseSparseArrays"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/CommandHelper;->a:Ljava/util/HashMap;

    return-void
.end method

.method public static getCacheCommandKey(Landroid/bluetooth/BluetoothDevice;II)Ljava/lang/String;
    .locals 2

    const-string v0, "-"

    if-eqz p0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string p0, ""

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    if-ltz p2, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;
    .locals 2

    sget-object v0, Lcom/jieli/jl_rcsp/tool/CommandHelper;->b:Lcom/jieli/jl_rcsp/tool/CommandHelper;

    if-nez v0, :cond_1

    const-class v0, Lcom/jieli/jl_rcsp/tool/CommandHelper;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/jieli/jl_rcsp/tool/CommandHelper;->b:Lcom/jieli/jl_rcsp/tool/CommandHelper;

    if-nez v1, :cond_0

    new-instance v1, Lcom/jieli/jl_rcsp/tool/CommandHelper;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/tool/CommandHelper;-><init>()V

    sput-object v1, Lcom/jieli/jl_rcsp/tool/CommandHelper;->b:Lcom/jieli/jl_rcsp/tool/CommandHelper;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_2
    sget-object v0, Lcom/jieli/jl_rcsp/tool/CommandHelper;->b:Lcom/jieli/jl_rcsp/tool/CommandHelper;

    return-object v0
.end method


# virtual methods
.method public getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/CommandHelper;->a:Ljava/util/HashMap;

    invoke-static {p1, p2, p3}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCacheCommandKey(Landroid/bluetooth/BluetoothDevice;II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object p1
.end method

.method public putCommandBase(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getOpCodeSn()I

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCacheCommandKey(Landroid/bluetooth/BluetoothDevice;II)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/CommandHelper;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/CommandHelper;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    sput-object v0, Lcom/jieli/jl_rcsp/tool/CommandHelper;->b:Lcom/jieli/jl_rcsp/tool/CommandHelper;

    return-void
.end method

.method public removeCommandBase(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/CommandHelper;->a:Ljava/util/HashMap;

    invoke-static {p1, p2, p3}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCacheCommandKey(Landroid/bluetooth/BluetoothDevice;II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public removeCommandBase(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V
    .locals 1

    if-eqz p2, :cond_0

    .line 1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p0, p1, v0, p2}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->removeCommandBase(Landroid/bluetooth/BluetoothDevice;II)V

    :cond_0
    return-void
.end method
