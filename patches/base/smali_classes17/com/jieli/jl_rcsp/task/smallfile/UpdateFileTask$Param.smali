.class public Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;
.super Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field public final d:S


# direct methods
.method public constructor <init>(BS[B)V
    .locals 0

    invoke-direct {p0, p1, p3}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;-><init>(B[B)V

    iput-short p2, p0, Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;->d:S

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;)S
    .locals 0

    iget-short p0, p0, Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;->d:S

    return p0
.end method


# virtual methods
.method public getId()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;->d:S

    return v0
.end method
