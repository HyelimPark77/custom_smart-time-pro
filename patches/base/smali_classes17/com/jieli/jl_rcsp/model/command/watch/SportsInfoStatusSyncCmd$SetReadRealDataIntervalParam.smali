.class public Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$SetReadRealDataIntervalParam;
.super Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SetReadRealDataIntervalParam"
.end annotation


# instance fields
.field public interval:S


# direct methods
.method public constructor <init>(S)V
    .locals 2

    .line 2
    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object v0

    const/4 v1, 0x7

    invoke-direct {p0, v1, v0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;-><init>(B[B)V

    .line 3
    iput-short p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$SetReadRealDataIntervalParam;->interval:S

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jieli/jl_rcsp/exception/ParseDataException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;-><init>([B)V

    return-void
.end method


# virtual methods
.method public getInterval()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$SetReadRealDataIntervalParam;->interval:S

    return v0
.end method

.method public getParamType()I
    .locals 1

    const/4 v0, 0x7

    return v0
.end method

.method public parse([B)I
    .locals 3

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->parse([B)I

    move-result p1

    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->getData()[B

    move-result-object v0

    if-eqz v0, :cond_3

    array-length v1, v0

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    array-length v1, v0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort([BI)S

    move-result v0

    iput-short v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$SetReadRealDataIntervalParam;->interval:S

    :cond_3
    :goto_0
    return p1
.end method
