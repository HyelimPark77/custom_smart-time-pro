.class public Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BellArg"
.end annotation


# instance fields
.field public final data:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    return-void
.end method

.method private static enable(ZB)B
    .locals 0

    if-eqz p0, :cond_0

    or-int/lit16 p0, p1, 0x80

    goto :goto_0

    :cond_0
    and-int/lit8 p0, p1, 0x7f

    :goto_0
    int-to-byte p0, p0

    return p0
.end method


# virtual methods
.method public getAlarmBellTime()B
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    const/4 v1, 0x4

    aget-byte v0, v0, v1

    and-int/lit8 v0, v0, 0x1f

    int-to-byte v0, v0

    return v0
.end method

.method public getCount()B
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    const/4 v1, 0x2

    aget-byte v0, v0, v1

    and-int/lit8 v0, v0, 0xf

    int-to-byte v0, v0

    return v0
.end method

.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    return-object v0
.end method

.method public getIndex()B
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    const/4 v1, 0x1

    aget-byte v0, v0, v1

    return v0
.end method

.method public getInterval()B
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    const/4 v1, 0x3

    aget-byte v0, v0, v1

    and-int/lit8 v0, v0, 0x1f

    int-to-byte v0, v0

    return v0
.end method

.method public isCanSetAlarmBellTime()Z
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    const/4 v1, 0x4

    aget-byte v0, v0, v1

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isCanSetCount()Z
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    const/4 v1, 0x2

    aget-byte v0, v0, v1

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isCanSetInterval()Z
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    const/4 v1, 0x3

    aget-byte v0, v0, v1

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setAlarmBellTime(B)Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    const/4 v1, 0x4

    aget-byte v2, v0, v1

    and-int/lit16 v2, v2, 0xe0

    or-int/2addr p1, v2

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    return-object p0
.end method

.method public setCanSetAlarmTime(Z)Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    const/4 v1, 0x4

    aget-byte v2, v0, v1

    invoke-static {p1, v2}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->enable(ZB)B

    move-result p1

    aput-byte p1, v0, v1

    return-object p0
.end method

.method public setCanSetCount(Z)Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    const/4 v1, 0x2

    aget-byte v2, v0, v1

    invoke-static {p1, v2}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->enable(ZB)B

    move-result p1

    aput-byte p1, v0, v1

    return-object p0
.end method

.method public setCanSetInterval(Z)Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    const/4 v1, 0x3

    aget-byte v2, v0, v1

    invoke-static {p1, v2}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->enable(ZB)B

    move-result p1

    aput-byte p1, v0, v1

    return-object p0
.end method

.method public setCount(B)Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    const/4 v1, 0x2

    aget-byte v2, v0, v1

    and-int/lit16 v2, v2, 0xef0

    or-int/2addr p1, v2

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    return-object p0
.end method

.method public setInterval(B)Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    const/4 v1, 0x3

    aget-byte v2, v0, v1

    and-int/lit16 v2, v2, 0xe0

    or-int/2addr p1, v2

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BellArgs{data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
