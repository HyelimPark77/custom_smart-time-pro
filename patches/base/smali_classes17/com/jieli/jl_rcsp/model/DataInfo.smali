.class public Lcom/jieli/jl_rcsp/model/DataInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DATA_TYPE_RECEIVE:I = 0x1

.field public static final DATA_TYPE_SEND:I


# instance fields
.field private basePacket:Lcom/jieli/jl_rcsp/model/base/BasePacket;

.field private device:Landroid/bluetooth/BluetoothDevice;

.field private isSend:Z

.field private mRcspCmdCallback:Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

.field private reSendCount:I

.field private recvData:[B

.field private sendTime:J

.field private timeoutMs:I

.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x7d0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->timeoutMs:I

    return-void
.end method


# virtual methods
.method public getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->basePacket:Lcom/jieli/jl_rcsp/model/base/BasePacket;

    return-object v0
.end method

.method public getDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->device:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public getRcspCmdCallback()Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->mRcspCmdCallback:Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    return-object v0
.end method

.method public getReSendCount()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->reSendCount:I

    return v0
.end method

.method public getRecvData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->recvData:[B

    return-object v0
.end method

.method public getSendTime()J
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->sendTime:J

    return-wide v0
.end method

.method public getTimeoutMs()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->timeoutMs:I

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->type:I

    return v0
.end method

.method public isSend()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->isSend:Z

    return v0
.end method

.method public setBasePacket(Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/DataInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->basePacket:Lcom/jieli/jl_rcsp/model/base/BasePacket;

    return-object p0
.end method

.method public setDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/DataInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->device:Landroid/bluetooth/BluetoothDevice;

    return-object p0
.end method

.method public setRcspCmdCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)Lcom/jieli/jl_rcsp/model/DataInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->mRcspCmdCallback:Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    return-object p0
.end method

.method public setReSendCount(I)Lcom/jieli/jl_rcsp/model/DataInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->reSendCount:I

    return-object p0
.end method

.method public setRecvData([B)Lcom/jieli/jl_rcsp/model/DataInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->recvData:[B

    return-object p0
.end method

.method public setSend(Z)Lcom/jieli/jl_rcsp/model/DataInfo;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->isSend:Z

    return-object p0
.end method

.method public setSendTime(J)Lcom/jieli/jl_rcsp/model/DataInfo;
    .locals 0

    iput-wide p1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->sendTime:J

    return-object p0
.end method

.method public setTimeoutMs(I)Lcom/jieli/jl_rcsp/model/DataInfo;
    .locals 1

    const/16 v0, 0x64

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->timeoutMs:I

    return-object p0
.end method

.method public setType(I)Lcom/jieli/jl_rcsp/model/DataInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->type:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DataInfo{device="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->device:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", recvData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->recvData:[B

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", basePacket="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->basePacket:Lcom/jieli/jl_rcsp/model/base/BasePacket;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timeoutMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->timeoutMs:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRcspCmdCallback="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->mRcspCmdCallback:Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", reSendCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->reSendCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isSend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->isSend:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", sendTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/jieli/jl_rcsp/model/DataInfo;->sendTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
