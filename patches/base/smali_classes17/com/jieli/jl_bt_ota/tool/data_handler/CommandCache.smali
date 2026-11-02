.class public final Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;->a:Ljava/util/HashMap;

    return-void
.end method

.method public static getCacheCommandKey(Landroid/bluetooth/BluetoothDevice;II)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    .line 1
    const-string p0, "00:00:00:00:00:00"

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p0

    .line 2
    :goto_0
    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;->getCacheCommandKey(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getCacheCommandKey(Ljava/lang/String;II)Ljava/lang/String;
    .locals 0

    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s-%s-%s"

    invoke-static {p1, p0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_bt_ota/model/base/CommandBase;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;->a:Ljava/util/HashMap;

    invoke-static {p1, p2, p3}, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;->getCacheCommandKey(Landroid/bluetooth/BluetoothDevice;II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    return-object p1
.end method

.method public putCommandBase(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V
    .locals 2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getId()I

    move-result v0

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getOpCodeSn()I

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;->getCacheCommandKey(Landroid/bluetooth/BluetoothDevice;II)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public removeCommandBase(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;->a:Ljava/util/HashMap;

    invoke-static {p1, p2, p3}, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;->getCacheCommandKey(Landroid/bluetooth/BluetoothDevice;II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public removeCommandBase(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BasePacket;)V
    .locals 1

    if-eqz p2, :cond_0

    .line 1
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getOpCode()I

    move-result v0

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p0, p1, v0, p2}, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;->removeCommandBase(Landroid/bluetooth/BluetoothDevice;II)V

    :cond_0
    return-void
.end method
