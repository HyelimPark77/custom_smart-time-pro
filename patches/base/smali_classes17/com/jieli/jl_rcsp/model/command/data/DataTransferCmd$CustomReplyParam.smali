.class public Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CustomReplyParam;
.super Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CustomReplyParam"
.end annotation


# instance fields
.field private final customData:[B


# direct methods
.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;-><init>([B)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CustomReplyParam;->customData:[B

    return-void
.end method


# virtual methods
.method public getParamData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CustomReplyParam;->customData:[B

    return-object v0
.end method
