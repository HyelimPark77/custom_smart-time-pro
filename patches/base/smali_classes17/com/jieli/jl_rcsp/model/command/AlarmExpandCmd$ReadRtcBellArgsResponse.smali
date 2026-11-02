.class public Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsResponse;
.super Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Response;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReadRtcBellArgsResponse"
.end annotation


# instance fields
.field private final bellArgs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(B[B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Response;-><init>(B)V

    invoke-static {p2}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsResponse;->fromBytes([B)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsResponse;->bellArgs:Ljava/util/List;

    return-void
.end method

.method public static fromBytes([B)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_2

    array-length v1, p0

    const/4 v2, 0x1

    if-ge v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    move v3, v1

    :goto_0
    array-length v4, p0

    if-ge v3, v4, :cond_2

    aget-byte v4, p0, v3

    add-int/2addr v4, v2

    add-int v5, v4, v3

    array-length v6, p0

    if-gt v5, v6, :cond_2

    if-gt v4, v2, :cond_1

    goto :goto_1

    :cond_1
    new-array v6, v4, [B

    invoke-static {p0, v3, v6, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v3, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;

    invoke-direct {v3, v6}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;-><init>([B)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v3, v5

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method


# virtual methods
.method public getBellArg()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsResponse;->bellArgs:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsResponse;->bellArgs:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\t"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ReadRtcBellArgsResponse{bellArgs="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
