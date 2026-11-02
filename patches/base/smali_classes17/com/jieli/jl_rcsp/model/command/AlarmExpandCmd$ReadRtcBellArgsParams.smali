.class public Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsParams;
.super Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReadRtcBellArgsParams"
.end annotation


# instance fields
.field private final mask:B


# direct methods
.method public constructor <init>(B)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    invoke-direct {p0, v1, v0}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;-><init>(B[B)V

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsParams;->mask:B

    return-void
.end method


# virtual methods
.method public getMask()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsParams;->mask:B

    return v0
.end method
