.class public final synthetic Lcom/jieli/jl_rcsp/tool/XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;


# instance fields
.field public final synthetic OXO1:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/tool/XO0O10;->OXO1:I

    return-void
.end method


# virtual methods
.method public final onCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/tool/XO0O10;->OXO1:I

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(ILcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V

    return-void
.end method
