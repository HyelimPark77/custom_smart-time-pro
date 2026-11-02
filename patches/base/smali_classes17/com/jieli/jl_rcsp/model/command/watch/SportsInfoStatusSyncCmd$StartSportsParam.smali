.class public Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$StartSportsParam;
.super Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StartSportsParam"
.end annotation


# instance fields
.field public type:B


# direct methods
.method public constructor <init>(B)V
    .locals 3

    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-byte p1, v1, v2

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;-><init>(B[B)V

    .line 3
    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$StartSportsParam;->type:B

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
.method public getParamType()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getType()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$StartSportsParam;->type:B

    return v0
.end method

.method public parse([B)I
    .locals 2

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->parse([B)I

    move-result p1

    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->getData()[B

    move-result-object v0

    if-eqz v0, :cond_2

    array-length v1, v0

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    aget-byte v0, v0, v1

    iput-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$StartSportsParam;->type:B

    :cond_2
    :goto_0
    return p1
.end method
