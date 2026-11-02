.class public Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Response;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Response"
.end annotation


# instance fields
.field private reason:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Response;->reason:I

    return-void
.end method


# virtual methods
.method public getReason()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Response;->reason:I

    return v0
.end method

.method public setReason(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Response;->reason:I

    return-void
.end method
