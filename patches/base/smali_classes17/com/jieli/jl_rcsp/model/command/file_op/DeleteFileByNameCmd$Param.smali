.class public Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd$Param;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field public name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd$Param;->name:Ljava/lang/String;

    if-nez p1, :cond_0

    move-object p1, v0

    :cond_0
    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd$Param;->name:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getParamData()[B
    .locals 5

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd$Param;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    new-array v1, v1, [B

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd$Param;->name:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v2, v3, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd$Param;->name:Ljava/lang/String;

    return-void
.end method
