.class public Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$DeleteFileParam;
.super Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$DevParam;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DeleteFileParam"
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$DevParam;-><init>(BI)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$DevParam;-><init>([B)V

    return-void
.end method
