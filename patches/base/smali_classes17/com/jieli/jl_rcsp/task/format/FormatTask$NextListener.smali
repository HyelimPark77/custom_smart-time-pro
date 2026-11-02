.class Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/task/TaskListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/task/format/FormatTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "NextListener"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public final synthetic b:Lcom/jieli/jl_rcsp/task/format/FormatTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/format/FormatTask;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;->b:Lcom/jieli/jl_rcsp/task/format/FormatTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onBegin()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;->b:Lcom/jieli/jl_rcsp/task/format/FormatTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/format/FormatTask;->e(Lcom/jieli/jl_rcsp/task/format/FormatTask;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " Task begin :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onBegin"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onCancel(I)V
    .locals 1

    const-string v0, "cancel"

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;->b:Lcom/jieli/jl_rcsp/task/format/FormatTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/format/FormatTask;->d(Lcom/jieli/jl_rcsp/task/format/FormatTask;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "The formatting task is error, do next task: error task --\u300b"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "onError"

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;->b:Lcom/jieli/jl_rcsp/task/format/FormatTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/format/FormatTask;->c(Lcom/jieli/jl_rcsp/task/format/FormatTask;)V

    return-void
.end method

.method public onFinish()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;->b:Lcom/jieli/jl_rcsp/task/format/FormatTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/format/FormatTask;->c(Lcom/jieli/jl_rcsp/task/format/FormatTask;)V

    return-void
.end method

.method public onProgress(I)V
    .locals 0

    return-void
.end method
