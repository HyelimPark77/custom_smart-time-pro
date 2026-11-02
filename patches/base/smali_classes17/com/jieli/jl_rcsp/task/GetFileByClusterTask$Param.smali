.class public Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/task/GetFileByClusterTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field public cluster:I

.field public devHandler:I

.field public offset:I

.field public outPath:Ljava/lang/String;


# direct methods
.method public constructor <init>(IIILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;->devHandler:I

    iput p2, p0, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;->offset:I

    iput p3, p0, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;->cluster:I

    iput-object p4, p0, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;->outPath:Ljava/lang/String;

    return-void
.end method
