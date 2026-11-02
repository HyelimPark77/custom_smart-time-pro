.class public Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd;
.super Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;,
        Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;,
        Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;,
        Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;,
        Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Param;,
        Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Response;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse<",
        "Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Param;",
        "Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Response;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Param;)V
    .locals 2

    const-class v0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa1

    invoke-direct {p0, v1, v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;-><init>(ILjava/lang/String;Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method
