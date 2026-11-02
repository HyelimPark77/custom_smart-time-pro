.class Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TimeOutCheck"
.end annotation


# instance fields
.field private final a:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "*>;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;->b:Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;->a:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->setSendTime(J)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;->a:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getOpCode()I

    move-result v0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;->a:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getSn()I

    move-result v1

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;->a:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getReSendMax()I

    move-result v2

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;->a:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getReSendCount()I

    move-result v3

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;->b:Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;

    invoke-static {v4}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatInt(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatInt(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v5, v6, v7, v8}, [Ljava/lang/Object;

    move-result-object v5

    const-string v6, "Waiting for reply command timeout. opCode : %s, sn : %s, reSendMax : %d,  reSendCount : %d."

    invoke-static {v6, v5}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "COMMAND TIMEOUT"

    invoke-static {v4, v6, v5}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-ge v3, v2, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;->a:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v0, v3}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->setReSendCount(I)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;->b:Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;->a:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->addSendData(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    return-void

    :cond_0
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;->b:Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;

    invoke-static {v2}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->b(Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v2

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;->a:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;->b:Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;->a:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-static {v2, v3, v0, v1}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;Landroid/bluetooth/BluetoothDevice;II)V

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;->b:Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;->a:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    const/16 v3, 0x3007

    invoke-static {v3}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method
