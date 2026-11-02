.class Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TimeOutCheck"
.end annotation


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/model/DataInfo;

.field public final synthetic b:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;Lcom/jieli/jl_rcsp/model/DataInfo;)V
    .locals 2

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;->b:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;->a:Lcom/jieli/jl_rcsp/model/DataInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/jieli/jl_rcsp/model/DataInfo;->setSendTime(J)Lcom/jieli/jl_rcsp/model/DataInfo;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;->a:Lcom/jieli/jl_rcsp/model/DataInfo;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;->a:Lcom/jieli/jl_rcsp/model/DataInfo;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v2

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v3

    iget-object v4, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;->a:Lcom/jieli/jl_rcsp/model/DataInfo;

    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/DataInfo;->getReSendCount()I

    move-result v4

    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;->b:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;

    invoke-static {v5}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v1, v6, v2, v3, v7}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Waiting for reply command timeout.\ndevice : %s, op : %d(0x%X), sn : %d, reSendCount : %d."

    invoke-static {v3, v2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "TimeOutCheck"

    invoke-static {v5, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x3

    if-ge v4, v2, :cond_2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;->a:Lcom/jieli/jl_rcsp/model/DataInfo;

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v4}, Lcom/jieli/jl_rcsp/model/DataInfo;->setReSendCount(I)Lcom/jieli/jl_rcsp/model/DataInfo;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;->b:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->b(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;)Lcom/jieli/jl_rcsp/tool/datahandles/DataInfoCache;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;->a:Lcom/jieli/jl_rcsp/model/DataInfo;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;->b:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;->a:Lcom/jieli/jl_rcsp/model/DataInfo;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->addSendData(Lcom/jieli/jl_rcsp/model/DataInfo;)V

    return-void

    :cond_2
    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;->b:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->b(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;)Lcom/jieli/jl_rcsp/tool/datahandles/DataInfoCache;

    move-result-object v2

    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;->a:Lcom/jieli/jl_rcsp/model/DataInfo;

    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->removeCommandBase(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v1, 0x3002

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;->b:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;->a:Lcom/jieli/jl_rcsp/model/DataInfo;

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method
