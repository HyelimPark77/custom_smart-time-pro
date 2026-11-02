.class public Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;
.super Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;,
        Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsResponse;,
        Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Response;,
        Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsParams;,
        Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$SetRtcBellArgsParams;,
        Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse<",
        "Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;",
        "Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Response;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;)V
    .locals 2

    const-class v0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x25

    invoke-direct {p0, v1, v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;-><init>(ILjava/lang/String;Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method
