.class Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread$1;->a:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFinish(J)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread$1;->a:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread$1;->a:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread$1;->a:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;

    :cond_0
    return-void
.end method

.method public onStart(J)V
    .locals 0

    return-void
.end method
