.class public Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartResponse;
.super Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Response;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StartResponse"
.end annotation


# instance fields
.field public size:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Response;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartResponse;->size:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StartResponse{size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartResponse;->size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
