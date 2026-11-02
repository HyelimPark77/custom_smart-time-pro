.class Lcom/jieli/jl_rcsp/task/format/FormatTask$ErrorStopListener;
.super Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/task/format/FormatTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ErrorStopListener"
.end annotation


# instance fields
.field public final synthetic c:Lcom/jieli/jl_rcsp/task/format/FormatTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/format/FormatTask;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask$ErrorStopListener;->c:Lcom/jieli/jl_rcsp/task/format/FormatTask;

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;-><init>(Lcom/jieli/jl_rcsp/task/format/FormatTask;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask$ErrorStopListener;->c:Lcom/jieli/jl_rcsp/task/format/FormatTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/format/FormatTask;->a(Lcom/jieli/jl_rcsp/task/format/FormatTask;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Formatting process stopped\uff1atask is --\u300b"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask$NextListener;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onError"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/format/FormatTask$ErrorStopListener;->c:Lcom/jieli/jl_rcsp/task/format/FormatTask;

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_rcsp/task/format/FormatTask;->a(Lcom/jieli/jl_rcsp/task/format/FormatTask;ILjava/lang/String;)V

    return-void
.end method
