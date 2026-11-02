.class public Lcom/jieli/jl_rcsp/model/command/BatchCmd;
.super Lcom/jieli/jl_rcsp/model/base/CommandBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;,
        Lcom/jieli/jl_rcsp/model/command/BatchCmd$Response;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/model/base/CommandBase<",
        "Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;",
        "Lcom/jieli/jl_rcsp/model/command/BatchCmd$Response;",
        ">;"
    }
.end annotation


# static fields
.field public static final OP_CANCEL:B = -0x7ft

.field public static final OP_START:B = 0x0t

.field public static final OP_STOP:B = -0x80t


# direct methods
.method public constructor <init>(ILcom/jieli/jl_rcsp/model/command/BatchCmd$Param;)V
    .locals 2

    .line 2
    const-class v0, Lcom/jieli/jl_rcsp/model/command/BatchCmd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x26

    invoke-direct {p0, v1, v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;-><init>(ILjava/lang/String;I)V

    .line 3
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;)V
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_rcsp/model/command/BatchCmd;-><init>(ILcom/jieli/jl_rcsp/model/command/BatchCmd$Param;)V

    return-void
.end method
