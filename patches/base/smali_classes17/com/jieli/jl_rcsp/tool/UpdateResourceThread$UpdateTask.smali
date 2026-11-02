.class Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UpdateTask"
.end annotation


# static fields
.field public static final OP_CREATE_FILE:I = 0x1

.field public static final OP_REPLACE_FILE:I = 0x2


# instance fields
.field public filePath:Ljava/lang/String;

.field public fileSize:J

.field public op:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;-><init>()V

    return-void
.end method
