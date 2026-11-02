.class public Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/model/device/health/IHealthSettingToAttr;


# static fields
.field public static final STATUS_ALL_DAY:B = 0x1t

.field public static final STATUS_CLOSE:B = 0x0t

.field public static final STATUS_CUSTOM_TIME:B = 0x2t


# instance fields
.field endHour:B

.field endMin:B

.field startHour:B

.field startMin:B

.field private status:B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->parseData([B)V

    return-void
.end method

.method private parseData([B)V
    .locals 7

    if-eqz p1, :cond_2

    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    aget-byte v1, p1, v0

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->status:B

    array-length v1, p1

    const/16 v2, 0x3b

    const/16 v3, 0x17

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-lt v1, v4, :cond_1

    aget-byte v1, p1, v5

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    int-to-byte v1, v1

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->startHour:B

    const/4 v1, 0x2

    aget-byte v1, p1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    int-to-byte v1, v1

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->startMin:B

    goto :goto_0

    :cond_1
    move v4, v5

    :goto_0
    array-length v1, p1

    add-int/lit8 v6, v4, 0x2

    if-lt v1, v6, :cond_2

    aget-byte v1, p1, v4

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    int-to-byte v1, v1

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->endHour:B

    add-int/2addr v4, v5

    aget-byte p1, p1, v4

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->endMin:B

    :cond_2
    :goto_1
    return-void
.end method

.method private toData()[B
    .locals 3

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->status:B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->startHour:B

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->startMin:B

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->endHour:B

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->endMin:B

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getEndHour()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->endHour:B

    return v0
.end method

.method public getEndMin()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->endMin:B

    return v0
.end method

.method public getStartHour()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->startHour:B

    return v0
.end method

.method public getStartMin()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->startMin:B

    return v0
.end method

.method public getStatus()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->status:B

    return v0
.end method

.method public getType()I
    .locals 1

    const/4 v0, 0x6

    return v0
.end method

.method public setEndHour(B)Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->endHour:B

    return-object p0
.end method

.method public setEndMin(B)Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->endMin:B

    return-object p0
.end method

.method public setStartHour(B)Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->startHour:B

    return-object p0
.end method

.method public setStartMin(B)Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->startMin:B

    return-object p0
.end method

.method public setStatus(B)Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->status:B

    return-object p0
.end method

.method public toAttr()Lcom/jieli/jl_rcsp/model/device/AttrBean;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->getType()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    move-result-object v0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->toData()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SleepDetection{status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->status:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", startHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->startHour:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", startMin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->startMin:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", endHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->endHour:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", endMin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/SleepDetection;->endMin:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
