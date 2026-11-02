.class public Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;
.super Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartResponse;,
        Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Response;,
        Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$CancelParam;,
        Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StopParam;,
        Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithClusterParam;,
        Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithDevAndNameParam;,
        Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithNameParam;,
        Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse<",
        "Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;",
        "Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Response;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;)V
    .locals 2

    const-class v0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x24

    invoke-direct {p0, v1, v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;-><init>(ILjava/lang/String;Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method
