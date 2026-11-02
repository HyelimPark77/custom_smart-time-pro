.class public Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$SetRtcBellArgsParams;
.super Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SetRtcBellArgsParams"
.end annotation


# instance fields
.field private final bellArg:Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;)V
    .locals 2

    iget-object v0, p1, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;->data:[B

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;-><init>(B[B)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$SetRtcBellArgsParams;->bellArg:Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;

    return-void
.end method


# virtual methods
.method public getBellArg()Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$SetRtcBellArgsParams;->bellArg:Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;

    return-object v0
.end method
