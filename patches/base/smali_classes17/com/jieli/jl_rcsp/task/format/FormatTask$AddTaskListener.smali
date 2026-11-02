.class Lcom/jieli/jl_rcsp/task/format/FormatTask$AddTaskListener;
.super Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/task/format/FormatTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "AddTaskListener"
.end annotation


# instance fields
.field public final c:Lcom/jieli/jl_rcsp/task/ITask;

.field public final synthetic d:Lcom/jieli/jl_rcsp/task/format/FormatTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/format/FormatTask;Lcom/jieli/jl_rcsp/task/ITask;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask$AddTaskListener;->d:Lcom/jieli/jl_rcsp/task/format/FormatTask;

    invoke-direct {p0, p1, p3}, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;-><init>(Lcom/jieli/jl_rcsp/task/format/FormatTask;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask$AddTaskListener;->c:Lcom/jieli/jl_rcsp/task/ITask;

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask$AddTaskListener;->d:Lcom/jieli/jl_rcsp/task/format/FormatTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/format/FormatTask;->b(Lcom/jieli/jl_rcsp/task/format/FormatTask;)Ljava/util/Queue;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask$AddTaskListener;->c:Lcom/jieli/jl_rcsp/task/ITask;

    invoke-interface {v0, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    invoke-super {p0}, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;->onFinish()V

    return-void
.end method
